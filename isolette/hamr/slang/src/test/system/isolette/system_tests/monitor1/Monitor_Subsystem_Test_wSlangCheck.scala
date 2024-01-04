package isolette.system_tests.monitor1

import art.Art
import art.scheduling.static._
import isolette.Isolette_Data_Model.{Monitor_Mode, On_Off, ValueStatus}
import isolette.Monitor.{Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_SystemTestAPI => MonMA, Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_SystemTestAPI => MonMMI, Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_SystemTestAPI => MonMMM}
import isolette._
import isolette.system_tests.monitor1.Monitor_Subsystem_Inputs_Container_SlangCheck.{NameProvider, TestRow}
import org.sireum._



// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

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

  //===========================================================
  //  S l a n g   C h e c k    Infrastructure
  //===========================================================

  val maxTests = 100
  var verbose: B = T

  val testMatrix: Map[String, TestRow] = Map.empty ++ ISZ(
    "MA__Normal_____Alarm_On" ~> TestRow(
      testDescription = "MA; Normal; => Alarm On",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_NormalModeAlarmOn", (sysProp_NormalModeAlarmOn _).asInstanceOf[(Any, Any) => B])
    ),
    "MA__Normal_____Alarm_Unchanged" ~> TestRow(
      testDescription = "MA; Normal; => Alarm Unchanged",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_NormalModeAlarmUnchanged", (sysProp_NormalModeAlarmUnchanged _).asInstanceOf[(Any, Any) => B])
    ),
    "MA__Normal_____Alarm_Unchanged_left" ~> TestRow(
      testDescription = "MA; Normal; => Alarm Unchanged, stress left partition",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges.copy(name = "currentTemp-in-left-partition"),
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_NormalModeAlarmUnchanged", (sysProp_NormalModeAlarmUnchanged _).asInstanceOf[(Any, Any) => B])
    ),
    "MA__Normal_____Alarm_Unchanged_right" ~> TestRow(
      testDescription = "MA; Normal; => Alarm Unchanged, stress right partition",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges.copy(name = "currentTemp-in-right-partition"),
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_NormalModeAlarmUnchanged", (sysProp_NormalModeAlarmUnchanged _).asInstanceOf[(Any, Any) => B])
    ),
    "MA__Normal_____Alarm_Off" ~> TestRow(
      testDescription = "MA; Normal; => Alarm Off",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_NormalModeAlarmOff", (sysProp_NormalModeAlarmOff _).asInstanceOf[(Any, Any) => B])
    ),



    "MA__Failing__CT____Alarm_On" ~> TestRow(
      testDescription = "Failure due to invalid currentTemp should result in Alarm On",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InvalidCTNormalModeAlarmOn", (sysProp_InvalidCTNormalModeAlarmOn _).asInstanceOf[(Any, Any) => B])
    ),
    "MA__Failing__LAT____Alarm_On" ~> TestRow(
      testDescription = "Failure due to invalid lower alarm should result in Alarm On",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InvalidLATNormalModeAlarmOn", (sysProp_InvalidLATNormalModeAlarmOn _).asInstanceOf[(Any, Any) => B])
    ),
    "MA__Failing__UAT____Alarm_On" ~> TestRow(
      testDescription = "Failure due to invalid upper alarm should result in Alarm On",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InvalidUATNormalModeAlarmOn", (sysProp_InvalidUATNormalModeAlarmOn _).asInstanceOf[(Any, Any) => B])
    ),


    "MA__Failing__Internal_Failure____Alarm_On" ~> TestRow(
      testDescription = "Failure due to internal failure should result in Alarm On",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InternalFailureNormalModeAlarmOn", (sysProp_InternalFailureNormalModeAlarmOn _).asInstanceOf[(Any, Any) => B])
    ),
    "MA__Failing__Error_Condition____Alarm_On" ~> TestRow(
      testDescription = "observe any failure condition (combining the input failures and internal failures above) should result in Alarm On",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_ErrorConditionAlarmOn", (sysProp_ErrorConditionAlarmOn _).asInstanceOf[(Any, Any) => B])
    ),



    // Normal --> Normal  Transitions
    "Mode_Trans___Normal__Normal" ~> TestRow(
      testDescription = "If no error condition and in normal then stay  in Normal",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_NormalToNormalMode", (sysProp_NormalToNormalMode _).asInstanceOf[(Any, Any) => B])
    ),

    "Mode_Trans___Normal__Failed__CT_Invalid" ~> TestRow(
      testDescription = "If in normal, but CT is invalid then should transition to Failed",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InvalidCTNormalToFailedMode", (sysProp_InvalidCTNormalToFailedMode _).asInstanceOf[(Any, Any) => B])
    ),
    "Mode_Trans___Normal__Failed__LAT_Invalid" ~> TestRow(
      testDescription = "If in normal, but LAT is invalid then should transition to Failed",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InvalidLATNormalToFailedMode", (sysProp_InvalidLATNormalToFailedMode _).asInstanceOf[(Any, Any) => B])
    ),
    "Mode_Trans___Normal__Failed__UAT_Invalid" ~> TestRow(
      testDescription = "If in normal, but UAT is invalid then should transition to Failed",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InvalidUATNormalToFailedMode", (sysProp_InvalidUATNormalToFailedMode _).asInstanceOf[(Any, Any) => B])
    ),

    "Mode_Trans___Normal__Failed__Internal_Failure" ~> TestRow(
      testDescription = "If in normal, but there is an internal failure then should transition to Failed",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InternalFailureNormalToFailedMode", (sysProp_InternalFailureNormalToFailedMode _).asInstanceOf[(Any, Any) => B])
    ),
    "Mode_Trans___Normal__Failed__Error_Condition" ~> TestRow(
      testDescription = "If in normal, but there is an internal or interface failure then should transition to Failed",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_ErrorConditionNormalToFailedMode", (sysProp_ErrorConditionNormalToFailedMode _).asInstanceOf[(Any, Any) => B])
    ),

    "Mode_Impl__Init____Alarm_Off" ~> TestRow(
      testDescription = "If in Init mode then the alarm should be off",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_InitModeImpliesAlarmOff", (sysProp_InitModeImpliesAlarmOff _).asInstanceOf[(Any, Any) => B])
    ),
    "Mode_Impl__Failed____Alarm_On" ~> TestRow(
      testDescription = "If in Failed mode then the alarm should be On",
      testMethod = NameProvider("Monitor_1HP_script_schema", (Monitor_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = validRanges,
      preStateCheck = (assumeFigureA_7 _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_FailedModeImpliesAlarmOn", (sysProp_FailedModeImpliesAlarmOn _).asInstanceOf[(Any, Any) => B])
    ),
  )

  for (testRow <- testMatrix.entries) {
    run(testRow._1, testRow._2)
  }

  def genTestName(testFamilyName: String, testRow: TestRow): String = {
    return s"${testFamilyName}: ${testRow.testMethod.name}: ${testRow.property.name}: ${testRow.profile.name}"
  }

  def genTestNameJson(testFamilyName: String, testRow: TestRow): String = {
    @strictpure def p(str: String): ST = Json.Printer.printString(str)
    return st"""{"testFamilyName" : ${p(testFamilyName)}, "testDescription" : ${p(testRow.testDescription)}, "testMethodName": ${p(testRow.testMethod.name)}, "property" : ${p(testRow.property.name)}, "profile" : ${p(testRow.profile.name)}}"""".render
  }

  override def next(profile: Monitor_Subsystem_Inputs_Container_Profile): Option[Monitor_Subsystem_Inputs_Container] = {
    try {
      profile.name match {
        case string"currentTemp-in-left-partition" =>
          val la = profile.lowerAlarmTempWStatus.nextIsolette_Data_ModelTempWstatus_impl()
          val nextCt = profile.currentTempWStatus.set_Config_F32(profile.currentTempWStatus.get_Config_F32(
            low = Some(la.value),         // currentTemp >= lowerAlarm
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
            low = Some(ua.value -  0.49f), // currentTemp > upperAlarm - 0.5
            high = Some(ua.value)          // currentTemp <= upperAlarm
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

  def run(testFamilyName: String, testRow: TestRow): Unit = {

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
              if (!testRow.preStateCheck(container)) {
                // retry
              } else {
                assert(testRow.testMethod.function(container, testRow.property.function))
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

    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps

    compute(ISZ(Hstep(2)))

    compute(ISZ(RunToThread("MonMMI")))

    MonMMI.put_concrete_inputs(
      // FIXME: MonMMI has a lastCmd state var but it's never
      //        used in contracts or behavior code so it's likely a
      //        copy/paste issue
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

    compute(ISZ(Hstep(1)))

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
    val triggerCondition: B = !helper_MonitorErrorCondition(inputs_Container) &
      inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode &
      helper_AlarmShouldBeOn(inputs_Container)

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    triggerCondition.->:(desiredCondition)
  }

  def sysProp_NormalModeAlarmUnchanged(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                       outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      !helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode &
        !helper_AlarmShouldBeOn(inputs_Container) &
        helper_AlarmShouldBeUnchanged(inputs_Container)

    val desiredCondition: B = outputs_Containers(0).alarm_control == outputs_Containers(1).alarm_control

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_NormalModeAlarmOff(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                 outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      !helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode &
        !helper_AlarmShouldBeOn(inputs_Container)
        !helper_AlarmShouldBeUnchanged(inputs_Container)

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Off

    return triggerCondition.->:(desiredCondition)
  }





  def sysProp_InvalidCTNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                         outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      inputs_Container.currentTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidLATNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                         outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      inputs_Container.lowerAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidUATNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                          outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      inputs_Container.upperAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InternalFailureNormalModeAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                               outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      inputs_Container.internalFailure.value &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B = outputs_Containers(1).alarm_control == On_Off.Onn

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_ErrorConditionAlarmOn(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                    outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      (helper_MonitorInputErrorCondition(inputs_Container) |
        helper_MonitorInternalFailureCondition(inputs_Container)) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode &
      outputs_Containers(1).alarm_control == On_Off.Onn

    return triggerCondition.->:(desiredCondition)
  }


  def sysProp_NormalToNormalMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                 outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      (!helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode)

    val desiredCondition: B = outputs_Containers(1).monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidCTNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                           outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      inputs_Container.currentTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InvalidLATNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                           outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      inputs_Container.lowerAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    return triggerCondition.->:(desiredCondition)
  }
  def sysProp_InvalidUATNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                           outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      inputs_Container.upperAlarmTempWStatus.status == ValueStatus.Invalid &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_InternalFailureNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                                outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      helper_MonitorInternalFailureCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_ErrorConditionNormalToFailedMode(inputs_Container: Monitor_Subsystem_Inputs_Container,
                                               outputs_Containers: ISZ[Monitor_Subsystem_Outputs_Container]): B = {
    assert(outputs_Containers.size == 2)

    val triggerCondition: B =
      helper_MonitorErrorCondition(inputs_Container) &
        inputs_Container.monitor_mode == Monitor_Mode.Normal_Monitor_Mode

    val desiredCondition: B =
      outputs_Containers(1).monitor_mode == Monitor_Mode.Failed_Monitor_Mode

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

    return triggerCondition.->:(desiredCondition)
  }

  def c32(low: Option[F32], high: Option[F32], ranLib: RandomLib): Config_F32 = {
    return ranLib.get_Config_F32(low = low, high = high)
  }

  def validRanges: Monitor_Subsystem_Inputs_Container_Profile = {
    var p = getDefaultProfile

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
}