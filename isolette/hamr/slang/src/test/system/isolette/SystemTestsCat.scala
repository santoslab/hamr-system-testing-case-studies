package isolette

import art.Art
import art.scheduling.static._
import isolette.Isolette_Data_Model._
import isolette.Regulate.{Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SystemTestAPI => RegMHS, Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_SystemTestAPI => RegMRI, Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_SystemTestAPI => RegMRM}
import isolette.Monitor.{Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_SystemTestAPI => MonMA, Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_SystemTestAPI => MonMMI, Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SystemTestAPI => MonMMM}
import org.sireum._

// This file will not be overwritten so is safe to edit

class SystemTestsCat extends SystemTestSuite {

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
  //var scheduler: StaticScheduler = Schedulers.getStaticSchedulerH(MNone())
  var scheduler: StaticScheduler = Schedulers.getStaticScheduler(
    StaticSchedulerCust.staticSchedule,
    StaticSchedulerCust.domainToBridgeIdMap,
    StaticSchedulerCust.threadNickNames,
    ISZCommandProvider(ISZ()))

  def compute(isz: ISZ[Command]): Unit = {
    scheduler = scheduler(commandProvider = ISZCommandProvider(isz :+ Stop()))

    Art.computePhase(scheduler)
  }

  // Suggestion: add the following import renamings of the components' SystemTestAPIs,
  //             replacing nickname with shortened versions that are easier to reference
  // import isolette.Regulate.{Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_SystemTestAPI => nickname}
  // import isolette.Regulate.{Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SystemTestAPI => nickname}
  // import isolette.Regulate.{Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_SystemTestAPI => nickname}
  // import isolette.Regulate.{Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_SystemTestAPI => nickname}
  // import isolette.Monitor.{Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_SystemTestAPI => nickname}
  // import isolette.Monitor.{Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_SystemTestAPI => nickname}
  // import isolette.Monitor.{Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SystemTestAPI => nickname}
  // import isolette.Monitor.{Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_SystemTestAPI => nickname}
  // import isolette.Isolette.{operator_interface_thread_impl_operator_interface_oip_oit_SystemTestAPI => nickname}
  // import isolette.Devices.{Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_SystemTestAPI => nickname}
  // import isolette.Devices.{Heat_Source_impl_heat_source_cpi_heat_controller_SystemTestAPI => nickname}

  test("Regulator Subsystem Initialization Test") {
    // Run the AADL run-time initialization phase according to the given scheduler configuration
    Art.initializePhase(scheduler)

    //====================================================================
    // Check System Initialization Phase Properties for each component
    //  in the Regulator Subsystem.
    //  For now these simply correspond to the Initialization Entry Point
    //  requirements for each thread.
    //
    // --- M a n a g e    H e a t    S o u r c e ---
    //
    //  guarantee
    //		initlastCmd: lastCmd == Isolette_Data_Model::On_Off.Off;
    //	guarantee REQ_MHS_1 "If the Regulator Mode is INIT, the Heat Control shall be
    //									|set to Off
    //									|http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=110 ":
    //					heat_control == Isolette_Data_Model::On_Off.Off;
    RegMHS.check_concrete_outputs(
      lastCmd = Isolette_Data_Model.On_Off.Off,
      api_heat_control = On_Off.Off)

    // Alternate Syntax (illustration)
    // heat_control == Isolette_Data_Model::On_Off.Off;
    must_match(On_Off.Off, RegMHS.get_api_heat_control())

    //
    // --- M a n a g e    R e g u l a t o r    I n t e r f a c e
    //
    //  guarantee
    //			RegulatorStatusIsInitiallyInit: regulator_status == Isolette_Data_Model::Status.Init_Status;
    //

    //  ToDo: (Zhaoxiang) - complete using the same "check_concrete_outputs" syntax as above.
    RegMRI.check_concrete_outputs(
      api_displayed_temp = Isolette_Data_Model.Temp_impl.example(),
      api_interface_failure = Isolette_Data_Model.Failure_Flag_impl.example(),
      api_lower_desired_temp = Isolette_Data_Model.Temp_impl.example(),
      api_regulator_status = Isolette_Data_Model.Status.Init_Status,
      api_upper_desired_temp = Isolette_Data_Model.Temp_impl.example()
    )
    must_match(Isolette_Data_Model.Status.Init_Status,RegMRI.get_api_regulator_status())
    // --- M a n a g e    R e g u l a t o r    M o d e
    //
    //  guarantee
    //     initialize
    //				guarantee REQ_MRM_1 "The initial mode of the regular is INIT
    //									|http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=109 " :
    //					regulator_mode == Isolette_Data_Model::Regulator_Mode.Init_Regulator_Mode;
    //  ToDo: (Zhaoxiang) - complete using the same "check_concrete_outputs" syntax as above.
    RegMRM.check_concrete_outputs(
      lastRegulatorMode = Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode,
      api_regulator_mode = Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode
    )
    must_match(
      Isolette_Data_Model.Regulator_Mode.Init_Regulator_Mode,
      RegMRM.get_api_regulator_mode())
  }

  //=======================================================================================
  //  S y s t e m    T e s t   - Normal Mode, Heat control on
  //
  //  When the mode is normal,
  //  if the current temperature is less than the lower desired temperature,
  //  then the heat control shall be on.
  //
  //   *Under environmental assumptions* (reusable across all system properties)
  //   [If the set point temperatures are valid, then low set point is less than high]
  //
  //   *When [Mode Condition]*
  //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
  //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
  //
  //   *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
  //          at stability points)
  //
  //   if the current temperature (in the frame post-state, as read during the frame) is
  //   less than the lower desired temperature (in the frame post-state, as read during the frame),
  //   then the heat control (in the frame post-state, as set during the frame)
  //   shall be ON
  //======================================================================================

  test("Normal Mode -- Heat Control On") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper desired temperature - Operator_Interface
    //   lower desired temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   regulator internal failure - Detect_Regulator_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper desired temperature - input of Manage_Regulator_Interface
    //   lower desired temperature - input of Manage_Regulator_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Regulator_Interface, Manage_Regulator_Mode, Manage_Heat_Source
    //   [after Detect_Regulator_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Regulator_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Regulator Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Regulator Interface
    compute(ISZ(RunToThread("RegMRI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_desired_tempWstatus_CONTEXT_In.value < p_upper_desired_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    // set system inputs that flow to Manage Regulator Interface
    RegMRI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_regulator_mode = mode,
      api_current_tempWstatus = currentTempWstatus)

    // set system inputs that flow to Manage Regulator Mode
    RegMRM.put_current_tempWstatus(currentTempWstatus)
    RegMRM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Heat Source
    RegMHS.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For RegMHS component, heat source should be On
    val api_heat_control = RegMHS.get_api_heat_control()
    assert(api_heat_control == On_Off.Onn)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Normal Mode -- Cat - Heat Control Off") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper desired temperature - Operator_Interface
    //   lower desired temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   regulator internal failure - Detect_Regulator_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper desired temperature - input of Manage_Regulator_Interface
    //   lower desired temperature - input of Manage_Regulator_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Regulator_Interface, Manage_Regulator_Mode, Manage_Heat_Source
    //   [after Detect_Regulator_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Regulator_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Regulator Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Regulator Interface
    compute(ISZ(RunToThread("RegMRI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_desired_tempWstatus_CONTEXT_In.value < p_upper_desired_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(102f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    // set system inputs that flow to Manage Regulator Interface
    RegMRI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_regulator_mode = mode,
      api_current_tempWstatus = currentTempWstatus)

    // set system inputs that flow to Manage Regulator Mode
    RegMRM.put_current_tempWstatus(currentTempWstatus)
    RegMRM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Heat Source
    RegMHS.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For RegMHS component, heat source should be Off
    val api_heat_control = RegMHS.get_api_heat_control()
    assert(api_heat_control == On_Off.Off)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  //=======================================================================================
  //  S y s t e m    T e s t   - Normal Mode, Heat control off
  //
  //  When the mode is normal,
  //  if the current temperature is greater than the upper desired temperature,
  //  then the heat control shall be off.
  //
  //   *Under environmental assumptions* (reusable across all system properties)
  //   [If the set point temperatures are valid, then low set point is less than high]
  //
  //   *When [Mode Condition]*
  //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
  //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
  //
  //   *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
  //          at stability points)
  //
  //   if the current temperature (in the frame post-state, as read during the frame) is
  //   greater than the upper desired temperature (in the frame post-state, as read during the frame),
  //   then the heat control (in the frame post-state, as set during the frame)
  //   shall be OFF
  //======================================================================================

  test("Normal Mode -- Heat Control Off") {

    // ToDo: (Zhaoxiang) - complete using the same approach as the Heat Control On test above.

    // ====== Initialization =====
    // run the system's initialization phase

    // ToDo: Fill in the call to run the initialization phase here
    Art.initializePhase(scheduler)
    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps

    // ToDo: Fill in the call to run the system forward in compute mode an arbitrary
    //  number of steps
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper desired temperature - Operator_Interface
    //   lower desired temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   regulator internal failure - Detect_Regulator_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper desired temperature - input of Manage_Regulator_Interface
    //   lower desired temperature - input of Manage_Regulator_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Regulator_Interface, Manage_Regulator_Mode, Manage_Heat_Source
    //   [after Detect_Regulator_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Regulator_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Regulator Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Regulator Interface
    // ToDo: Fill in the command to run the system forward to the point where the RegMRI
    //  component is ready to be executed.
    compute(ISZ(RunToThread("RegMRI")))
    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_desired_tempWstatus_CONTEXT_In.value < p_upper_desired_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.

    // ToDo: Fill in the appropriate value declarations for
    //  upperDesiredTempWstatus
    //  lowerDesiredTempWstatus
    //  currentTempWstatus
    //  internal_failure
    val upperDesiredTempWstatus:TempWstatus_impl=TempWstatus_impl(101f,ValueStatus.Valid)
    val lowerDesiredTempWstatus:TempWstatus_impl=TempWstatus_impl(99f,ValueStatus.Valid)
    val currentTempWstatus:TempWstatus_impl=TempWstatus_impl(102f,ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl=Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    // ToDo: set system inputs that flow to Manage Regulator Interface
    //  using RegMRI.put_concrete_inputs(...)
    RegMRI.put_concrete_inputs(
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_current_tempWstatus = currentTempWstatus,
      api_regulator_mode = mode
    )
    // ToDo: set system inputs that flow to Manage Regulator Mode
    //  using RegMRM.put_current_tempWstatus(currentTempWstatus)
    //        RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_current_tempWstatus(currentTempWstatus)
    // ToDo: set system inputs that flow to Manage Heat Source
    //   using RegMHS.put_current_tempWstatus(currentTempWstatus)
    RegMHS.put_current_tempWstatus(currentTempWstatus)

    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    // ToDo: insert command to run the system forward one hyper-period
    compute(ISZ(Hstep(1)))
    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For RegMHS component, heat source should be Off

    // ToDo: insert commands to get the heat control value using RegMHS.get_api_heat_control()
    //  and check if it is equal to On_Off.Off
    assert(RegMHS.get_api_heat_control() == On_Off.Off)
    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  //=======================================================================================
  //  S y s t e m    T e s t   - Failed Mode, Heat control off
  //
  //    Case: lower desired temperature Invalid, results in Failed Mode and Heat Control Off
  //
  //  If the lower desired temperature has a Invalid status, then at the end of the frame
  //  the subsystem mode should be failed and the heat control shall be off .
  //
  //   if the current temperature (in the frame post-state, as read during the frame) is
  //   greater than the upper desired temperature (in the frame post-state, as read during the frame),
  //   then the heat control (in the frame post-state, as set during the frame)
  //   shall be OFF
  //======================================================================================

  test("Lower Desired Temperature Invalid -- Heat Control Off") {

    // ToDo: (Zhaoxiang) - complete using the same approach as the Heat Control On test above.

    // ====== Initialization =====
    // run the system's initialization phase

    // ToDo: Fill in the call to run the initialization phase here
    Art.initializePhase(scheduler)
    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps

    // ToDo: Fill in the call to run the system forward in compute mode an arbitrary
    //  number of steps
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper desired temperature - Operator_Interface
    //   lower desired temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   regulator internal failure - Detect_Regulator_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper desired temperature - input of Manage_Regulator_Interface
    //   lower desired temperature - input of Manage_Regulator_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Regulator_Interface, Manage_Regulator_Mode, Manage_Heat_Source
    //   [after Detect_Regulator_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Regulator_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Regulator Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Regulator Interface
    // ToDo: Fill in the command to run the system forward to the point where the RegMRI
    //  component is ready to be executed.
    compute(ISZ(RunToThread("RegMRI")))
    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_desired_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_desired_tempWstatus_CONTEXT_In.value < p_upper_desired_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.

    // ToDo: Fill in the appropriate value declarations for
    //  upperDesiredTempWstatus
    //  lowerDesiredTempWstatus *** make this temperature invalid status, e.g., lowerDesiredTempWStatus = TempWstatus_impl(98f, ValueStatus.Invalid),
    //  currentTempWstatus
    //  internal_failure
    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Invalid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)
    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    // ToDo: set system inputs that flow to Manage Regulator Interface
    //  using RegMRI.put_concrete_inputs(...)
    RegMRI.put_concrete_inputs(
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_current_tempWstatus = currentTempWstatus,
      api_regulator_mode = mode
    )
    // ToDo: set system inputs that flow to Manage Regulator Mode
    //  using RegMRM.put_current_tempWstatus(currentTempWstatus)
    //        RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_current_tempWstatus(currentTempWstatus)
    // ToDo: set system inputs that flow to Manage Heat Source
    //   using RegMHS.put_current_tempWstatus(currentTempWstatus)
    RegMHS.put_current_tempWstatus(currentTempWstatus)

    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    // ToDo: insert command to run the system forward one hyper-period
    compute(ISZ(Hstep(1)))
    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For RegMHS component, heat source should be Off

    // ToDo: insert commands to get the heat control value using RegMHS.get_api_heat_control()
    //  and check if it is equal to On_Off.Off
    assert(RegMHS.get_api_heat_control() == On_Off.Off)
    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Upper Desired Temperature Invalid -- Heat Control Off") {
    Art.initializePhase(scheduler)

    compute(ISZ(Hstep(2)))

    compute(ISZ(RunToThread("RegMRI")))

    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Invalid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    RegMRI.put_concrete_inputs(
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_current_tempWstatus = currentTempWstatus,
      api_regulator_mode = mode
    )

    RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_current_tempWstatus(currentTempWstatus)

    RegMHS.put_current_tempWstatus(currentTempWstatus)


    compute(ISZ(Hstep(1)))


    assert(RegMHS.get_api_heat_control() == On_Off.Off)

    Art.finalizePhase(scheduler)
  }

  test("Current Temperature Invalid -- Heat Control Off") {
    Art.initializePhase(scheduler)

    compute(ISZ(Hstep(2)))

    compute(ISZ(RunToThread("RegMRI")))

    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Invalid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    RegMRI.put_concrete_inputs(
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_current_tempWstatus = currentTempWstatus,
      api_regulator_mode = mode
    )

    RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_current_tempWstatus(currentTempWstatus)

    RegMHS.put_current_tempWstatus(currentTempWstatus)


    compute(ISZ(Hstep(1)))


    assert(RegMHS.get_api_heat_control() == On_Off.Off)

    Art.finalizePhase(scheduler)
  }
  //[Heat control unchanged] When the mode is normal,
  // if the current temperature is greater than or equal to the lower desired temperature,
  // and the current temperature is less than or equal to the lower desired temperature,
  // then the heater state is unchanged.
  test("Normal Mode -- Heat Control Unchanged") {
    Art.initializePhase(scheduler)

    compute(ISZ(Hstep(2)))

    compute(ISZ(RunToThread("RegMRI")))

    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(100f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    RegMRI.put_concrete_inputs(
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_current_tempWstatus = currentTempWstatus,
      api_regulator_mode = mode
    )

    RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_current_tempWstatus(currentTempWstatus)

    RegMHS.put_current_tempWstatus(currentTempWstatus)


    compute(ISZ(Hstep(1)))


    assert(RegMHS.get_api_heat_control() == RegMHS.get_lastCmd())

    Art.finalizePhase(scheduler)
  }

  test("Internal Failure -- Heat Control Off") {
    Art.initializePhase(scheduler)

    compute(ISZ(Hstep(2)))

    compute(ISZ(RunToThread("RegMRI")))

    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(T)

    val mode: Regulator_Mode.Type = Regulator_Mode.Normal_Regulator_Mode

    RegMRI.put_concrete_inputs(
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_current_tempWstatus = currentTempWstatus,
      api_regulator_mode = mode
    )

    RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_current_tempWstatus(currentTempWstatus)

    RegMHS.put_current_tempWstatus(currentTempWstatus)


    compute(ISZ(Hstep(1)))


    assert(RegMHS.get_api_heat_control() == On_Off.Off) //TODO: The test is failing when it should not

    Art.finalizePhase(scheduler)
  }

  test("Fail Mode -- Heat Control Off") {
    Art.initializePhase(scheduler)

    compute(ISZ(Hstep(2)))

    compute(ISZ(RunToThread("RegMRI")))

    val upperDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerDesiredTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    val mode: Regulator_Mode.Type = Regulator_Mode.Failed_Regulator_Mode

    RegMRI.put_concrete_inputs(
      api_upper_desired_tempWstatus = upperDesiredTempWstatus,
      api_lower_desired_tempWstatus = lowerDesiredTempWstatus,
      api_current_tempWstatus = currentTempWstatus,
      api_regulator_mode = mode
    )

    RegMRM.put_internal_failure(internal_failure)
    RegMRM.put_current_tempWstatus(currentTempWstatus)

    RegMHS.put_current_tempWstatus(currentTempWstatus)


    compute(ISZ(Hstep(1)))


    assert(RegMHS.get_api_heat_control() == On_Off.Off)

    Art.finalizePhase(scheduler)
  }

  test("Normal Mode -- Alarm On") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper alarm temperature - Operator_Interface
    //   lower alarm temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   monitor internal failure - Detect_Monitor_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper alarm temperature - input of Manage_Monitor_Interface
    //   lower alarm temperature - input of Manage_Monitor_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Monitor_Interface, Manage_Monitor_Mode, Manage_Alarm_Control
    //   [after Detect_Monitor_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Monitor_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Monitor Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Monitor Interface
    compute(ISZ(RunToThread("MonMMI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_alarm_tempWstatus_CONTEXT_In.value < p_upper_alarm_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Monitor_Mode.Type = Monitor_Mode.Normal_Monitor_Mode
    val lastCmd: On_Off.Type = On_Off.Off //TODO: Remove unused variable from component

    // set system inputs that flow to Manage Monitor Interface
    MonMMI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_alarm_tempWstatus = upperAlarmTempWstatus,
      api_lower_alarm_tempWstatus = lowerAlarmTempWstatus,
      api_monitor_mode = mode,
      api_current_tempWstatus = currentTempWstatus,
      In_lastCmd = lastCmd)

    // set system inputs that flow to Manage Monitor Mode
    MonMMM.put_current_tempWstatus(currentTempWstatus)
    MonMMM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Alarm
    MonMA.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For MonMA component, alarm control should be On
    val api_alarm_control = MonMA.get_api_alarm_control()
    assert(api_alarm_control == On_Off.Onn)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Upper Alarm Temperature Invalid -- Alarm On") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper alarm temperature - Operator_Interface
    //   lower alarm temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   monitor internal failure - Detect_Monitor_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper alarm temperature - input of Manage_Monitor_Interface
    //   lower alarm temperature - input of Manage_Monitor_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Monitor_Interface, Manage_Monitor_Mode, Manage_Alarm_Control
    //   [after Detect_Monitor_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Monitor_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Monitor Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Monitor Interface
    compute(ISZ(RunToThread("MonMMI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_alarm_tempWstatus_CONTEXT_In.value < p_upper_alarm_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Invalid)
    val lowerAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Monitor_Mode.Type = Monitor_Mode.Normal_Monitor_Mode
    val lastCmd: On_Off.Type = On_Off.Off //TODO: Remove unused variable from component

    // set system inputs that flow to Manage Monitor Interface
    MonMMI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_alarm_tempWstatus = upperAlarmTempWstatus,
      api_lower_alarm_tempWstatus = lowerAlarmTempWstatus,
      api_monitor_mode = mode,
      api_current_tempWstatus = currentTempWstatus,
      In_lastCmd = lastCmd)

    // set system inputs that flow to Manage Monitor Mode
    MonMMM.put_current_tempWstatus(currentTempWstatus)
    MonMMM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Alarm
    MonMA.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For MonMA component, alarm control should be On
    val api_alarm_control = MonMA.get_api_alarm_control()
    assert(api_alarm_control == On_Off.Onn)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Lower Alarm Temperature Invalid -- Alarm On") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper alarm temperature - Operator_Interface
    //   lower alarm temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   monitor internal failure - Detect_Monitor_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper alarm temperature - input of Manage_Monitor_Interface
    //   lower alarm temperature - input of Manage_Monitor_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Monitor_Interface, Manage_Monitor_Mode, Manage_Alarm_Control
    //   [after Detect_Monitor_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Monitor_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Monitor Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Monitor Interface
    compute(ISZ(RunToThread("MonMMI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_alarm_tempWstatus_CONTEXT_In.value < p_upper_alarm_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Invalid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Monitor_Mode.Type = Monitor_Mode.Normal_Monitor_Mode
    val lastCmd: On_Off.Type = On_Off.Off //TODO: Remove unused variable from component

    // set system inputs that flow to Manage Monitor Interface
    MonMMI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_alarm_tempWstatus = upperAlarmTempWstatus,
      api_lower_alarm_tempWstatus = lowerAlarmTempWstatus,
      api_monitor_mode = mode,
      api_current_tempWstatus = currentTempWstatus,
      In_lastCmd = lastCmd)

    // set system inputs that flow to Manage Monitor Mode
    MonMMM.put_current_tempWstatus(currentTempWstatus)
    MonMMM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Alarm
    MonMA.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For MonMA component, alarm control should be On
    val api_alarm_control = MonMA.get_api_alarm_control()
    assert(api_alarm_control == On_Off.Onn)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Current Temperature Invalid -- Alarm On") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper alarm temperature - Operator_Interface
    //   lower alarm temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   monitor internal failure - Detect_Monitor_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper alarm temperature - input of Manage_Monitor_Interface
    //   lower alarm temperature - input of Manage_Monitor_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Monitor_Interface, Manage_Monitor_Mode, Manage_Alarm_Control
    //   [after Detect_Monitor_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Monitor_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Monitor Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Monitor Interface
    compute(ISZ(RunToThread("MonMMI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_alarm_tempWstatus_CONTEXT_In.value < p_upper_alarm_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Invalid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Monitor_Mode.Type = Monitor_Mode.Normal_Monitor_Mode
    val lastCmd: On_Off.Type = On_Off.Off //TODO: Remove unused variable from component

    // set system inputs that flow to Manage Monitor Interface
    MonMMI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_alarm_tempWstatus = upperAlarmTempWstatus,
      api_lower_alarm_tempWstatus = lowerAlarmTempWstatus,
      api_monitor_mode = mode,
      api_current_tempWstatus = currentTempWstatus,
      In_lastCmd = lastCmd)

    // set system inputs that flow to Manage Monitor Mode
    MonMMM.put_current_tempWstatus(currentTempWstatus)
    MonMMM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Alarm
    MonMA.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For MonMA component, alarm control should be On
    val api_alarm_control = MonMA.get_api_alarm_control()
    assert(api_alarm_control == On_Off.Onn)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Internal Failure -- Alarm On") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper alarm temperature - Operator_Interface
    //   lower alarm temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   monitor internal failure - Detect_Monitor_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper alarm temperature - input of Manage_Monitor_Interface
    //   lower alarm temperature - input of Manage_Monitor_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Monitor_Interface, Manage_Monitor_Mode, Manage_Alarm_Control
    //   [after Detect_Monitor_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Monitor_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Monitor Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Monitor Interface
    compute(ISZ(RunToThread("MonMMI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_alarm_tempWstatus_CONTEXT_In.value < p_upper_alarm_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(T)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Monitor_Mode.Type = Monitor_Mode.Normal_Monitor_Mode
    val lastCmd: On_Off.Type = On_Off.Off //TODO: Remove unused variable from component

    // set system inputs that flow to Manage Monitor Interface
    MonMMI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_alarm_tempWstatus = upperAlarmTempWstatus,
      api_lower_alarm_tempWstatus = lowerAlarmTempWstatus,
      api_monitor_mode = mode,
      api_current_tempWstatus = currentTempWstatus,
      In_lastCmd = lastCmd)

    // set system inputs that flow to Manage Monitor Mode
    MonMMM.put_current_tempWstatus(currentTempWstatus)
    MonMMM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Alarm
    MonMA.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For MonMA component, alarm control should be On
    val api_alarm_control = MonMA.get_api_alarm_control()
    assert(api_alarm_control == On_Off.Onn)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Fail Mode -- Alarm On") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper alarm temperature - Operator_Interface
    //   lower alarm temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   monitor internal failure - Detect_Monitor_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper alarm temperature - input of Manage_Monitor_Interface
    //   lower alarm temperature - input of Manage_Monitor_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Monitor_Interface, Manage_Monitor_Mode, Manage_Alarm_Control
    //   [after Detect_Monitor_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Monitor_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Monitor Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Monitor Interface
    compute(ISZ(RunToThread("MonMMI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_alarm_tempWstatus_CONTEXT_In.value < p_upper_alarm_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(98f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Monitor_Mode.Type = Monitor_Mode.Failed_Monitor_Mode
    val lastCmd: On_Off.Type = On_Off.Off //TODO: Remove unused variable from component

    // set system inputs that flow to Manage Monitor Interface
    MonMMI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_alarm_tempWstatus = upperAlarmTempWstatus,
      api_lower_alarm_tempWstatus = lowerAlarmTempWstatus,
      api_monitor_mode = mode,
      api_current_tempWstatus = currentTempWstatus,
      In_lastCmd = lastCmd)

    // set system inputs that flow to Manage Monitor Mode
    MonMMM.put_current_tempWstatus(currentTempWstatus)
    MonMMM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Alarm
    MonMA.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For MonMA component, alarm control should be On
    val api_alarm_control = MonMA.get_api_alarm_control()
    assert(api_alarm_control == On_Off.Onn)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }

  test("Normal Mode -- Alarm Off") {

    // ====== Initialization =====
    // run the system's initialization phase
    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps
    // ...for this test, we choose 2 HP.  In the future, this might be
    // randomized.
    compute(ISZ(Hstep(2)))

    //  ----  s e t   e n v i r o n m e n t   i n p u t    v a l u e s

    // At this point, we should force the system inputs to certain values in the components
    // that read these from the environment:
    //   upper alarm temperature - Operator_Interface
    //   lower alarm temperature - Operator_Interface
    //   current temperature - Temperature_Sensor
    //   monitor internal failure - Detect_Monitor_Failure
    // However, we don't have the capability to set the inputs directly.
    //
    // We need to apply an interim solution:
    //  - determine where the outputs of the above inputs below, and
    //    after the above components are scheduled and propagate their outputs,
    //    override the outputs at the point at which they are received by destination
    //    components:
    //  - This can be determined by looking at the data flow diagram Figure A-3
    //    in the REMH
    //
    //  [after Operator_Interface in the schedule]
    //   upper alarm temperature - input of Manage_Monitor_Interface
    //   lower alarm temperature - input of Manage_Monitor_Interface
    //   [after Temperature Sensor in the schedule]
    //   current temperature - inputs of Manage_Monitor_Interface, Manage_Monitor_Mode, Manage_Alarm_Control
    //   [after Detect_Monitor_Failure in the schedule]
    //   regular internal failure - inputs of Manage_Monitor_Mode
    //
    //  Note: since all the schedule contraints above are achieved by the beginning of the Manage Monitor Interface
    //  slot, we will simply run to that point and set the input values there.

    // run to Manage Monitor Interface
    compute(ISZ(RunToThread("MonMMI")))

    // The following constraint (assumption) on environment values is formalized in the Logika system verification work.
    // We need our system inputs for testing to also satisfy this constraint.
    //
    // (p_lower_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid &
    //      p_upper_alarm_tempWstatus_CONTEXT_In.status == ValueStatus.Valid) ->:
    //      (p_lower_alarm_tempWstatus_CONTEXT_In.value < p_upper_alarm_tempWstatus_CONTEXT_In.value)

    // Determine inputs from the "environment".  Here we do this manually, but eventually we would also support
    // doing this randomly.
    val upperAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(101f, ValueStatus.Valid)
    val lowerAlarmTempWstatus: TempWstatus_impl = TempWstatus_impl(99f, ValueStatus.Valid)
    val currentTempWstatus: TempWstatus_impl = TempWstatus_impl(100f, ValueStatus.Valid)
    val internal_failure: Failure_Flag_impl = Failure_Flag_impl(F)

    // ideally, find some way to avoid setting the mode below.
    // I'd rather only set system inputs, not internal variables.
    // We need some way to naturally evolve the system until it is in normal mode.
    // Or just have the output test on the system outputs be conditioned on the mode.
    val mode: Monitor_Mode.Type = Monitor_Mode.Normal_Monitor_Mode
    val lastCmd: On_Off.Type = On_Off.Off //TODO: Remove unused variable from component

    // set system inputs that flow to Manage Monitor Interface
    MonMMI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_alarm_tempWstatus = upperAlarmTempWstatus,
      api_lower_alarm_tempWstatus = lowerAlarmTempWstatus,
      api_monitor_mode = mode,
      api_current_tempWstatus = currentTempWstatus,
      In_lastCmd = lastCmd)

    // set system inputs that flow to Manage Monitor Mode
    MonMMM.put_current_tempWstatus(currentTempWstatus)
    MonMMM.put_internal_failure(internal_failure)

    // set system inputs that flow to Manage Alarm
    MonMA.put_current_tempWstatus(currentTempWstatus)


    // r u n   s y s t e m    f o r w a r d   a p p r o p r i a t e   s t e p s / t i m e

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // o b s e r v e    s y s t e m    o u t p u t s   and  c h e c k   s y s t e m   p r o p e r t i e s
    //
    // Recall specified property (as stated in Logika system verification)
    //
    //  *When [Mode Condition]*
    //    - The subsystem mode manager has determined the subsystem to be in NORMAL mode
    //      (in the frame post-state, as set in the output of Mode Manager component during the frame)
    //  *Then* (intuition: the desired control law holds (observation between boundary inputs and outputs
    //           at stability points)
    // For simplicity, we forced the mode to NORMAL, so just check directly that the heat source setting
    // is appropriate.
    //
    // For MonMA component, alarm control should be On
    val api_alarm_control = MonMA.get_api_alarm_control()
    assert(api_alarm_control == On_Off.Off)

    // gracefully take system down
    Art.finalizePhase(scheduler)
  }
}