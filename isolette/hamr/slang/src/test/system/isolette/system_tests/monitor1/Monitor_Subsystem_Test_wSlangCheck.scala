package isolette.system_tests.monitor1

import art.Art
import art.scheduling.static._
import isolette.Isolette_Data_Model.{Monitor_Mode, On_Off, ValueStatus}
import isolette.Monitor.{Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_SystemTestAPI => MonMA, Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_SystemTestAPI => MonMMI, Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SystemTestAPI => MonMMM}
import isolette._
import isolette.system_tests.monitor1.Monitor_Subsystem_Inputs_Container_SlangCheck.{NameProvider1, NameProvider2, TestConfiguration}
import org.sireum._
import Monitor_Subsystem_Test_wSlangCheck._
import scala.language.implicitConversions

class Monitor_Subsystem_Test_wSlangCheck
  extends Monitor_Subsystem_Inputs_Container_SlangCheck {

  //===========================================================
  //  S c h e d u l a r     and    S t e p p e r     Configuration
  //===========================================================

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

  override def beforeEach(): Unit = {

    // uncomment the following to disable the various guis and to suppress the log streams
    disableLogsAndGuis()

    super.beforeEach()
  }

  override def beforeAll(): Unit = {
    propStatus = Map.empty
    super.beforeAll()
  }

  val failOnTriviallyTrueProps: B = T

  override def afterAll(): Unit = {
    var msgs: ISZ[String] = ISZ()
    for (p <- propStatus.entries if p._2.triggerT_desiredT == 0) {
      // propStatus has three fields
      //   # of F -> X
      //   # of T -> F  --> the test case would have failed for T -> F so this should be 0
      //   # of T -> T  --> may need to increase # of tests if this is always 0
      msgs = msgs :+ s"Property ${p._1} was trivially true ${p._2.triggerF} times, desired failed ${p._2.triggerT_desiredF} times, and desired was never satisfied"
    }
    if (msgs.nonEmpty) {
      if (failOnTriviallyTrueProps) {
        assert(F, st"${(msgs, "\n")}".render)
      } else {
        cprint(T, st"${(msgs, "\n")}".render)
      }
    }
    super.afterAll()
  }

  //===========================================================
  //  S l a n g   C h e c k    Infrastructure
  //===========================================================

  val maxTests = 100
  var verbose: B = F

  // Monitor threads being tested
  val components: ISZ[String] = ISZ(
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_interface.id).get,
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_monitor_mode.id).get,
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.id).get,
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure.id).get
  )

  val testMatrix: Map[String, TestConfiguration] = Map.empty ++ ISZ(
    "MA__Normal_____Alarm_On" ~> TestConfiguration(
      description = "Alarm control laws; NORMAL mode with temp range violation => Alarm ON result state",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_NormalModeAlarmOn _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "MA__Normal_____Alarm_Unchanged" ~> TestConfiguration(
      description = "Alarm control laws; NORMAL mode => Alarm status unchanged",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_NormalModeAlarmUnchanged _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "MA__Normal_____Alarm_Unchanged_left" ~> TestConfiguration(
      description = "Alarm control laws; NORMAL mode => Alarm status unchanged (stress left partition)",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges.copy(name = "currentTemp-in-left-partition"),
      filter = assumeFigureA_7 _,
      property = sysProp_NormalModeAlarmUnchanged _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "MA__Normal_____Alarm_Unchanged_right" ~> TestConfiguration(
      description = "Alarm control laws; NORMAL mode => Alarm status unchanged (stress right partition)",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges.copy(name = "currentTemp-in-right-partition"),
      filter = assumeFigureA_7 _,
      property = sysProp_NormalModeAlarmUnchanged _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "MA__Normal_____Alarm_Off" ~> TestConfiguration(
      description = "Alarm control laws; NORMAL mode => Alarm OFF result state",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_NormalModeAlarmOff _,
      componentsOfInterest = components,
      numTests = maxTests
    ),


    "MA__Failing__CT____Alarm_On" ~> TestConfiguration(
      description = "Alarm control laws; Failing scenario (due to invalid currentTemp) => Alarm ON result state",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InvalidCTNormalModeAlarmOn _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "MA__Failing__LAT____Alarm_On" ~> TestConfiguration(
      description = "Alarm control laws; Failing scenario (due to invalid lower alarm) => Alarm ON result",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InvalidLATNormalModeAlarmOn _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "MA__Failing__UAT____Alarm_On" ~> TestConfiguration(
      description = "Alarm control laws; Failing scenario (due to invalid upper alarm) => Alarm ON result",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InvalidUATNormalModeAlarmOn _,
      componentsOfInterest = components,
      numTests = maxTests
    ),


    "MA__Failing__Internal_Failure____Alarm_On" ~> TestConfiguration(
      description = "Alarm control laws; Failing scenario (internal failure) => Alarm ON result",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InternalFailureNormalModeAlarmOn _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "MA__Failing__Error_Condition____Alarm_On" ~> TestConfiguration(
      description = "Alarm control laws; Failing scenario (combined failure condition) => Alarm ON result",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_ErrorConditionAlarmOn _,
      componentsOfInterest = components,
      numTests = maxTests
    ),



    // Normal --> Normal  Transitions
    "Mode_Trans___Normal__Normal" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Normal",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_NormalToNormalMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),

    "Mode_Trans___Normal__Failed__CT_Invalid" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Current Temperature Invalid",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InvalidCTNormalToFailedMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "Mode_Trans___Normal__Failed__LAT_Invalid" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Lower Alarm Temperature Invalid",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InvalidLATNormalToFailedMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "Mode_Trans___Normal__Failed__UAT_Invalid" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Upper Alarm Temperature Invalid",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InvalidUATNormalToFailedMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),

    "Mode_Trans___Normal__Failed__Internal_Failure" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Internal Failure",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InternalFailureNormalToFailedMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "Mode_Trans___Normal__Failed__Error_Condition" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because combined error condition",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_ErrorConditionNormalToFailedMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "Mode_Trans___Failed__Failed__Error_Condition" ~> TestConfiguration(
      description = "Mode Trans:  Failed->Failed because failed can only be handled via a system reboot",
      schema = Monitor_2HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_ErrorConditionFailedToFailedMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "Mode_Trans___Init__Init__Error_Condition" ~> TestConfiguration(
      description = "Mode Trans:  Init->Init because MMM stays in init if monitor_status is false",
      schema = Monitor_AfterInit_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_ErrorConditionInitToInitMode _,
      componentsOfInterest = components,
      numTests = maxTests
    ),

    "Mode_Impl__Init____Alarm_Off" ~> TestConfiguration(
      description = "Alarm control laws; INIT mode => Alarm OFF result state",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_InitModeImpliesAlarmOff _,
      componentsOfInterest = components,
      numTests = maxTests
    ),
    "Mode_Impl__Failed____Alarm_On" ~> TestConfiguration(
      description = "Alarm control laws; FAILED mode => Alarm OFF result state",
      schema = Monitor_1HP_script_schema _,
      profile = validRanges,
      filter = assumeFigureA_7 _,
      property = sysProp_FailedModeImpliesAlarmOn _,
      componentsOfInterest = components,
      numTests = maxTests
    )
  )

  //for (testRow <- testMatrix.entries if testRow._1 == string"MA__Failing__CT____Alarm_On") {
  for (testRow <- testMatrix.entries) {
    run(testRow._1, testRow._2)
  }

  def genTestName(testConfigurationName: String, testRow: TestConfiguration): String = {
    return s"${testConfigurationName}: ${testRow.schema.name}: ${testRow.property.name}: ${testRow.profile.name}: ${testRow.filter.name}"
  }

  def genTestNameJson(testConfigurationName: String, testRow: TestConfiguration): String = {
    @strictpure def p(str: String): ST = Json.Printer.printString(str)
    val componentsx = st"${(testRow.componentsOfInterest, ",")}".render
    return st"""{"testConfigurationName" : ${p(testConfigurationName)}, "description" : ${p(testRow.description)}, "schema": ${p(testRow.schema.name)}, "property" : ${p(testRow.property.name)}, "profile" : ${p(testRow.profile.name)}, "filter" : ${p(testRow.filter.name)}, "components" : ${p(componentsx)}}""".render
  }

  override def next(profile: Monitor_Subsystem_Inputs_Container_Profile): Option[Monitor_Subsystem_Inputs_Container] = {
    try {
      profile.name match {
        case string"currentTemp-in-left-partition" =>
          val la = profile.lowerAlarmTempWStatus.nextIsolette_Data_ModelTempWstatus_impl()
          val nextCt = profile.currentTempWStatus.set_Config_F32(profile.currentTempWStatus.get_Config_F32(
            low = Some(la.value), // currentTemp >= lowerAlarm
            high = Some(la.value + 0.49f) // currentTemp < lowerAlarm + 0.5
          ))
          val ct = nextCt.nextIsolette_Data_ModelTempWstatus_impl()
          return Some(Monitor_Subsystem_Inputs_Container(
            lowerAlarmTempWStatus = la,
            upperAlarmTempWStatus = profile.upperAlarmTempWStatus.nextIsolette_Data_ModelTempWstatus_impl(),
            currentTempWStatus = ct,
            monitor_mode = profile.monitor_mode.nextIsolette_Data_ModelMonitor_ModeType(),
            internalFailure = profile.internalFailure.nextIsolette_Data_ModelFailure_Flag_impl()))
        case string"currentTemp-in-right-partition" =>
          val ua = profile.upperAlarmTempWStatus.nextIsolette_Data_ModelTempWstatus_impl()
          val nextCt = profile.currentTempWStatus.set_Config_F32(profile.currentTempWStatus.get_Config_F32(
            low = Some(ua.value - 0.49f), // currentTemp > upperAlarm - 0.5
            high = Some(ua.value) // currentTemp <= upperAlarm
          ))
          val ct = nextCt.nextIsolette_Data_ModelTempWstatus_impl()
          return Some(Monitor_Subsystem_Inputs_Container(
            lowerAlarmTempWStatus = profile.lowerAlarmTempWStatus.nextIsolette_Data_ModelTempWstatus_impl(),
            upperAlarmTempWStatus = ua,
            currentTempWStatus = ct,
            monitor_mode = profile.monitor_mode.nextIsolette_Data_ModelMonitor_ModeType(),
            internalFailure = profile.internalFailure.nextIsolette_Data_ModelFailure_Flag_impl()))
        case _ =>
          return Some(Monitor_Subsystem_Inputs_Container(
            lowerAlarmTempWStatus = profile.lowerAlarmTempWStatus.nextIsolette_Data_ModelTempWstatus_impl(),
            upperAlarmTempWStatus = profile.upperAlarmTempWStatus.nextIsolette_Data_ModelTempWstatus_impl(),
            currentTempWStatus = profile.currentTempWStatus.nextIsolette_Data_ModelTempWstatus_impl(),
            monitor_mode = profile.monitor_mode.nextIsolette_Data_ModelMonitor_ModeType(),
            internalFailure = profile.internalFailure.nextIsolette_Data_ModelFailure_Flag_impl()))
      }
    } catch {
      case e: AssertionError =>
        // SlangCheck was unable to satisfy a datatype's filter
        return None()
    }
  }

  def run(testFamilyName: String, testRow: TestConfiguration): Unit = {

    for (i <- 0 until maxTests) {
      val testName = s"${genTestName(testFamilyName, testRow)}_$i"
      this.registerTest(testName) {
        var retry: B = T
        var j: Z = 0

        while (j < testRow.profile.numTestVectorGenRetries && retry) {
          if (verbose && j > 0) {
            println(s"Retry $j:")
          }

          next(testRow.profile) match {
            case Some(container) =>
              if (!testRow.filter.function(container)) {
                // retry
              } else {
                assert(testRow.schema.function(container, testRow.property.function))
                retry = F
              }
            case _ =>
          }
          j = j + 1
        }
      }
    }
  }

  // a pre-state container filter could prove useful/necessary in order to
  // ensure that the values in the container will satisfy the assume/requires clause
  // of a component in the system that will receive those values
  def examplePreStateContainerFilter(container: Monitor_Subsystem_Inputs_Container): B = {
    // e.g. return container.low < container.high
    return T
  }

  def populateOutputContainer(): Monitor_Subsystem_Outputs_Container = {
    val monitor_status = MonMMI.get_api_monitor_status()
    val alarm_control = MonMA.get_api_alarm_control()
    val monitor_mode = MonMMM.get_api_monitor_mode()

    return Monitor_Subsystem_Outputs_Container(
      monitor_status = monitor_status,
      alarm_control = alarm_control,
      monitor_mode = monitor_mode)
  }

  // assume Figure_A_7
  //   This is not explicitly stated in the requirements, but a reasonable
  //   assumption is that the lower alarm must be at least 1.0f less than
  //   the upper alarm in order to account for the 0.5f tolerance
  //   http://pub.santoslab.org/high-assurance/module-requirements/reading/FAA-DoT-Requirements-AR-08-32.pdf#page=115
  def assumeFigureA_7(container: Monitor_Subsystem_Inputs_Container): B = {
    return container.upperAlarmTempWStatus.value - container.lowerAlarmTempWStatus.value >= 1.0f
  }

  def Monitor_1HP_script_schema(inject_container: Monitor_Subsystem_Inputs_Container,
                                prop: (Monitor_Subsystem_Inputs_Container, ISZ[Monitor_Subsystem_Outputs_Container]) => B): B = {
    return Monitor_XHP_script_schema(F, 1, inject_container, prop)
  }

  def Monitor_2HP_script_schema(inject_container: Monitor_Subsystem_Inputs_Container,
                                prop: (Monitor_Subsystem_Inputs_Container, ISZ[Monitor_Subsystem_Outputs_Container]) => B): B = {
    return Monitor_XHP_script_schema(F, 2, inject_container, prop)
  }

  def Monitor_AfterInit_script_schema(inject_container: Monitor_Subsystem_Inputs_Container,
                                      prop: (Monitor_Subsystem_Inputs_Container, ISZ[Monitor_Subsystem_Outputs_Container]) => B): B = {
    return Monitor_XHP_script_schema(T, 1, inject_container, prop)
  }

  def Monitor_XHP_script_schema(injectAfterInitialization: B,
                                numHPAfterInjection:Z,
                                inject_container: Monitor_Subsystem_Inputs_Container,
                                prop: (Monitor_Subsystem_Inputs_Container, ISZ[Monitor_Subsystem_Outputs_Container]) => B): B = {

    assert (numHPAfterInjection > 0)

    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    if (!injectAfterInitialization) {
      // Abstractly, run the system an arbitrary number of steps
      compute(ISZ(Hstep(2)))
    }

    compute(ISZ(RunToThread("MonMMI")))

    MonMMI.put_concrete_inputs(
      In_lastCmd = MonMMI.get_lastCmd(),

      api_current_tempWstatus = inject_container.currentTempWStatus,
      api_lower_alarm_tempWstatus = inject_container.lowerAlarmTempWStatus,
      api_upper_alarm_tempWstatus = inject_container.upperAlarmTempWStatus,
      api_monitor_mode = inject_container.monitor_mode
    )

    MonMMM.put_current_tempWstatus(inject_container.currentTempWStatus)
    MonMMM.put_internal_failure(inject_container.internalFailure)

    MonMA.put_current_tempWstatus(inject_container.currentTempWStatus)

    val output_container_pre_step = populateOutputContainer()

    compute(ISZ(Hstep(1))) // run 1 HP since we're not on a HP boundary

    if (numHPAfterInjection > 1) {
      compute(ISZ(Hstep(numHPAfterInjection - 1))) // run the remaining HPs
    }

    val output_container_post_step = populateOutputContainer()

    // gracefully take system down
    Art.finalizePhase(scheduler)

    return prop(inject_container, ISZ(output_container_pre_step, output_container_post_step))
  }

  @strictpure def helper_MonitorInputErrorCondition(container: Monitor_Subsystem_Inputs_Container): B = {
    container.lowerAlarmTempWStatus.status == ValueStatus.Invalid |
      container.upperAlarmTempWStatus.status == ValueStatus.Invalid |
      container.currentTempWStatus.status == ValueStatus.Invalid
  }

  @strictpure def helper_MonitorInternalFailureCondition(container: Monitor_Subsystem_Inputs_Container): B =
    container.internalFailure.value

  @strictpure def helper_MonitorErrorCondition(container: Monitor_Subsystem_Inputs_Container): B =
    helper_MonitorInputErrorCondition(container) |
      helper_MonitorInternalFailureCondition(container)

  @strictpure def helper_AlarmShouldBeOn(inputs_Container: Monitor_Subsystem_Inputs_Container): B =
    (inputs_Container.currentTempWStatus.value < inputs_Container.lowerAlarmTempWStatus.value |
      inputs_Container.currentTempWStatus.value > inputs_Container.upperAlarmTempWStatus.value)

  @strictpure def helper_AlarmShouldBeUnchanged(inputs_Container: Monitor_Subsystem_Inputs_Container): B =
    (inputs_Container.currentTempWStatus.value < inputs_Container.lowerAlarmTempWStatus.value + 0.5f |
      inputs_Container.currentTempWStatus.value > inputs_Container.upperAlarmTempWStatus.value - 0.5f)

  @strictpure def sysProp_NormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                            outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert (outputs_Containers.size == 2)

    val triggerCondition: B = (
      !helper_MonitorErrorCondition(inputs_Container) &
      inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode &
      helper_AlarmShouldBeOn(inputs_Container))

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    bookKeep(triggerCondition, desiredCondition)

    triggerCondition.->:(desiredCondition)
  }

  def sysProp_NormalModeAlarmUnchanged(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                       outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      !helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode &
        !helper_AlarmShouldBeOn(inputs_Container) &
        helper_AlarmShouldBeUnchanged(inputs_Container))

    val desiredCondition: B = outputs_Containers(0).alarm_control == outputs_Containers(1).alarm_control

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_NormalModeAlarmOff(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                 outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      !helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode &
        !helper_AlarmShouldBeOn(inputs_Container) &
        !helper_AlarmShouldBeUnchanged(inputs_Container))

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Off

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }


  def sysProp_InvalidCTNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                         outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      inputs_Container.currentTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidLATNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                          outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      inputs_Container.lowerAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidUATNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                          outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      inputs_Container.upperAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InternalFailureNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                               outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      inputs_Container.internalFailure.value &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_ErrorConditionAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                    outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      (helper_MonitorInputErrorCondition(inputs_Container) |
        helper_MonitorInternalFailureCondition(inputs_Container)) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B = (
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode &
        outputs_Containers(1).alarm_control == On_Off.Onn)

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }


  def sysProp_NormalToNormalMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                 outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      (!helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode))

    val desiredCondition: B = outputs_Containers(1).monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidCTNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                          outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      inputs_Container.currentTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidLATNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                           outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      inputs_Container.lowerAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidUATNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                           outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      inputs_Container.upperAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InternalFailureNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                                outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      helper_MonitorInternalFailureCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }


  def sysProp_ErrorConditionNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                               outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_ErrorConditionFailedToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                               outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = (
      (inputs_Container.internalFailure.value | inputs_Container.currentTempWStatus.status == ValueStatus.Invalid) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_ErrorConditionInitToInitMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                           outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)
    // NOTE: this prop requires injection after the init phase

    val triggerCondition: B = (
      (inputs_Container.internalFailure.value | inputs_Container.currentTempWStatus.status == ValueStatus.Invalid) &
        inputs_Container.monitor_mode == Monitor_Mode.Init_Monitor_Mode)

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Init_Monitor_Mode

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InitModeImpliesAlarmOff(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                      outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = outputs_Containers(1).monitor_mode == Monitor_Mode.Init_Monitor_Mode
    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Off

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_FailedModeImpliesAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                       outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B = outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode
    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def c32(low: Option[F32], high: Option[F32], ranLib: RandomLib): Config_F32 = {
    return ranLib.get_Config_F32(low = low, high = high)
  }

  def validRanges: Monitor_Subsystem_Inputs_Container_Profile = {
    val p = getDefaultProfile

    p.name = "Valid Ranges Profile"

    // [96..101]
    p.lowerAlarmTempWStatus.set_Config_F32(c32(
      low = Some(InitialValues.LOWER_ALARM_TEMPERATURE_LOWER_RANGE),
      high = Some(InitialValues.LOWER_ALARM_TEMPERATURE_UPPER_RANGE),
      ranLib = freshRandomLib))

    // [97..102]
    p.upperAlarmTempWStatus.set_Config_F32(c32(
      low = Some(InitialValues.UPPER_ALARM_TEMPERATURE_LOWER_RANGE),
      high = Some(InitialValues.UPPER_ALARM_TEMPERATURE_UPPER_RANGE),
      ranLib = freshRandomLib
    ))

    // tighten up currentTemp so that there's a better chance to get within MA's
    // 0.5 tolerance
    p.currentTempWStatus.set_Config_F32(c32(
      low = Some(90f),
      high = Some(110f),
      ranLib = freshRandomLib))

    // return completed profile
    return p
  }

  def bookKeep(triggerCond: B, desiredCond: B): Unit = {
    val propName = Thread.currentThread().getStackTrace()(2).getMethodName
    val prop = propStatus.getOrElse(propName, PropStatus(0,0,0))
    propStatus = propStatus + propName ~> prop.copy(
      triggerF = prop.triggerF + (if (!triggerCond) 1 else 0),
      triggerT_desiredF = prop.triggerT_desiredF + (if (triggerCond && !desiredCond) 1 else 0),
      triggerT_desiredT = prop.triggerT_desiredT + (if (triggerCond && desiredCond) 1 else 0)
    )
  }

  implicit def toNameProvider1[X](eta: X => B)(implicit line: sourcecode.Line): NameProvider1 = {
    val l = ops.StringOps(Monitor_Subsystem_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider1(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def toNameProvider2[X, Y](eta: (X, Y) => B)(implicit line: sourcecode.Line): NameProvider2 = {
    val l = ops.StringOps(Monitor_Subsystem_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider2(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def oneToGen[X](eta: (X) => B): Any => B = eta.asInstanceOf[Any => B]

  implicit def twoToGen[X, Y](eta: (X, Y) => B): (Any, Any) => B = eta.asInstanceOf[(Any, Any) => B]
}

object Monitor_Subsystem_Test_wSlangCheck {

  case class PropStatus (val triggerF: Z,
                         val triggerT_desiredF: Z,
                         val triggerT_desiredT: Z)

  var propStatus: Map[String, PropStatus] = Map.empty

  val lines: ISZ[String] = {
    val ll: String = Os.env("ABS_JAR_LOC") match {
      case Some(l) =>
        // must be running from the jar file so need to unpack it to get the source files
        val tempDir = Os.tempDir()
        proc"unzip $l -d $tempDir".runCheck()
        val name = ops.ISZOps(ops.StringOps(ops.StringOps(getClass.getName).replaceAllLiterally("$", "")).split(c => c == C('.')))
        val ret = ((tempDir /+ name.dropRight(1)) / s"${name.last}.scala").read
        tempDir.removeAll()
        ret
      case _ => Os.path(implicitly[sourcecode.File].value).read
    }
    ops.StringOps(ops.StringOps(ll).replaceAllLiterally("\n", " \n")).split(c => c == C('\n'))
  }

  @strictpure def p(str: String): ST = Json.Printer.printString(str)

  val dummy = genJsons(F)   // doing this a var decl so that the actions are invoked when the JVM loads the object

  def genJsons(echo: B): B = {
    if (Os.env("JENKINS_HOME").isEmpty) { // don't generate these when CI
      // emit test configs as JSON
      val inst = new Monitor_Subsystem_Test_wSlangCheck()
      val entries = for (entry <- inst.testMatrix.entries) yield inst.genTestNameJson(entry._1, entry._2)
      val thisFile = Os.path(implicitly[sourcecode.File].value)
      val outFile = thisFile.up / s"${thisFile.name}.json"
      outFile.writeOver(st"${(entries, "\n")}".render)

      // emit schedule as JSON
      val nickNames: ISZ[ST] = for (e <- StaticSchedulerCust.threadNickNames.entries) yield
        st"${e._1}:${Arch.ad.components(e._2).name}"
      val nickNamesS = st"${(nickNames, ",")}".render
      val sched: ISZ[ST] = for (e <- StaticSchedulerCust.domainToBridgeIdMap) yield
        st"""${StaticSchedulerCust.revThreadNickNames.get(e).get}"""
      val schedS = st"${(sched, ",")}".render
      val schedFile = thisFile.up / s"${thisFile.name}_schedule.json"
      schedFile.writeOver(
        st"""{
            |  "nickNames": ${p(nickNamesS)},
            |  "scheduleProvider": ${p(StaticSchedulerCust.getClass.getName)},
            |  "schedule": ${p(schedS)}
            |}""".render)

      if (echo) {
        println(outFile)
        println(schedFile)
      }
    }

    F
  }
}