package isolette.system_tests.rst

import art.Art
import art.scheduling.static._
import isolette._
import org.sireum._
import isolette.Isolette_Data_Model._
import isolette.Regulate.Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.ROUND
import isolette.Regulate.{Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_SystemTestAPI => RegMHS, Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_SystemTestAPI => RegMRI, Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_SystemTestAPI => RegMRM}
import isolette.system_tests.rst.Regulate_Subsystem_Inputs_Container_SlangCheck.{NameProvider1, NameProvider2, TestConfiguration}
import Regulate_Subsystem_Test_wSlangCheck._
import scala.language.implicitConversions

class Regulate_Subsystem_Test_wSlangCheck
  extends Regulate_Subsystem_Inputs_Container_SlangCheck {

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

  // Regulator threads being tested
  val components: ISZ[String] = ISZ(
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.id).get,
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.id).get,
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_heat_source.id).get,
    StaticSchedulerCust.revThreadNickNames.get(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_detect_regulator_failure.id).get
  )

  val testMatrix: Map[String, TestConfiguration] = Map.empty ++ ISZ(
    // ======================
    //  Output: Heat Control
    //=======================
    // -----
    //   Output: Heat Control;  Normal Mode Properties
    // -----
    "HC__Normal_____Heat_On" ~> TestConfiguration(
      description = "Heat Control control laws; NORMAL mode => Heat ON result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_NormalModeHeatOn _,
      components = components,
      numTests = 200 //maxTests
    ),
    "HC__Normal_____Heat_Off" ~> TestConfiguration(
      description = "Heat Control control laws; NORMAL mode => Heat OFF result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_NormalModeHeatOff _,
      components = components,
      numTests = 300 //maxTests
    ),

    // -----
    //   Output: Heat Control;  Failure properties
    // -----
    "HC__Failing__CT____Heat_Off" ~> TestConfiguration(
      description = "Heat Control control laws; Failing scenario (Current Temp) => Heat OFF result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InvalidCTNormalModeHeatOff _,
      components = components,
      numTests = maxTests
    ),

    "HC__Failing__UDT____Heat_Off" ~> TestConfiguration(
      description = "Heat Control control laws; Failing scenario (Upper Desired Temperature) => Heat OFF result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InvalidUDTNormalModeHeatOff _,
      components = components,
      numTests = maxTests
    ),

    "HC__Failing__LDT____Heat_Off" ~> TestConfiguration(
      description = "Heat Control control laws; Failing scenario (Lower Desired Temperature) => Heat OFF result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InvalidLDTNormalModeHeatOff _,
      components = components,
      numTests = maxTests
    ),

    "HC__Failing__Internal_Failure____Heat_Off" ~> TestConfiguration(
      description = "Heat Control control laws; Failing scenario (internal failure) => Heat OFF result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InternalFailureNormalModeHeatOff _,
      components = components,
      numTests = maxTests
    ),

    // observe any failure condition (combining the input failures and internal failures above)
    "HC__Failing__Error_Condition____Heat_Off" ~> TestConfiguration(
      description = "Heat Control control laws; Failing scenario (combined failure condition) => Heat OFF result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_ErrorConditionHeatOff _,
      components = components,
      numTests = maxTests
    ),
    // ======================
    //  Output: Display Temp
    //=======================

    // observe any failure condition (combining the input failures and internal failures above)
    "DisplayTemp__Normal" ~> TestConfiguration(
      description = "Display temp control laws; NORMAL mode => correct deplay result state",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_NormalDisplayTemp _,
      components = components,
      numTests = maxTests
    ),

    // ======================
    //  Output (Internal State Update): Mode Transition Properties
    //=======================

    // Normal --> Normal  Transitions
    "Mode_Trans___Normal__Normal" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Normal",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_NormalToNormalMode _,
      components = components,
      numTests = maxTests
    ),

    // Normal --> Failed  Transitions
    "Mode_Trans___Normal__Failed__CT_Invalid" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Current Temperature Invalid",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InvalidCTNormalToFailedMode _,
      components = components,
      numTests = maxTests
    ),
    "Mode_Trans___Normal__Failed__UDT_Invalid" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Upper Desired Temperature Invalid",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InvalidUDTNormalToFailedMode _,
      components = components,
      numTests = maxTests
    ),
    "Mode_Trans___Normal__Failed__LDT_Invalid" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Lower Desired Temperature Invalid",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InvalidLDTNormalToFailedMode _,
      components = components,
      numTests = maxTests
    ),
    "Mode_Trans___Normal__Failed__Internal_Failure" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because Internal Failure",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InternalFailureNormalToFailedMode _,
      components = components,
      numTests = maxTests
    ),
    // Combinded Error Condition
    "Mode_Trans___Normal__Failed__Error_Condition" ~> TestConfiguration(
      description = "Mode Trans:  Normal->Failed because combined error condition",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_ErrorConditionNormalToFailedMode _,
      components = components,
      numTests = maxTests
    ),
    "Mode_Trans___Init__Failed__Error_Condition" ~> TestConfiguration(
      description = "Mode Trans:  Init->Failed because regulator_status is false",
      schema = Regulator_AfterInit_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_ErrorConditionInitToFailedMode _,
      components = components,
      numTests = maxTests
    ),
    "Mode_Trans___Failed__Failed__Error_Condition" ~> TestConfiguration(
      description = "Mode Trans:  Failed->Failed because failed can only be handled via a system reboot",
      schema = Regulator_2HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_ErrorConditionFailedToFailedMode _,
      components = components,
      numTests = maxTests
    ),

    /*
    // Failed --> Failed Transitions  (Failure mode preserved)
    "Mode_Trans___Failed__Failed" ~> TestConfiguration(
      testDescription = "Mode Trans:  Failed->Failed",
      testMethod = Regulator_1HP_script_schema _,
      profile = validRanges,
      preStateCheck = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_FailedToFailedMode _,
      components = components,
      numTests = maxTests
    ),
    */

    // ======================
    //  Mode Implication Properties
    //=======================
    // -----
    //   Mode Implication; Output: Heat Control
    // -----
    // Heat Control Output
    "Mode_Impl__Init____Heat_Off" ~> TestConfiguration(
      description = "Mode Implication: Init => Heat Off",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_InitModeImpliesHeatOff _,
      components = components,
      numTests = maxTests
    ),

    "Mode_Impl__Failed____Heat_Off" ~> TestConfiguration(
      description = "Mode Implication: Failed => Heat Off",
      schema = Regulator_1HP_script_schema _,
      profile = validRanges,
      filter = compute_spec_lower_is_not_higher_than_upper_assume _,
      property = sysProp_FailedModeImpliesHeatOff _,
      components = components,
      numTests = maxTests
    )
  )

  for (testRow <- testMatrix.entries if string"Mode_Impl__Init____Heat_Off" == testRow._1) {
  //for (testRow <- testMatrix.entries) {
    run(testRow._1, testRow._2)
  }

  def genTestName(testConfigurationName: String, testRow: TestConfiguration): String = {
    return s"${testConfigurationName}: ${testRow.schema.name}: ${testRow.property.name}: ${testRow.profile.name}: ${testRow.filter.name}"
  }

  def genTestNameJson(testConfigurationName: String, testRow: TestConfiguration): String = {
    @strictpure def p(str: String): ST = Json.Printer.printString(str)
    val componentsx = st"${(testRow.components, ",")}".render
    return st"""{"testConfigurationName" : ${p(testConfigurationName)}, "description" : ${p(testRow.description)}, "schema": ${p(testRow.schema.name)}, "property" : ${p(testRow.property.name)}, "profile" : ${p(testRow.profile.name)}, "filter" : ${p(testRow.filter.name)}, "components" : ${p(componentsx)}}""".render
  }

  def run(testFamilyName: String, testRow: TestConfiguration): Unit = {

    for (i <- 0 until testRow.numTests) {
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
  //=============================================================
  //  Profiles
  //=============================================================

  def c32(low: Option[F32], high: Option[F32], ranLib: RandomLib): Config_F32 = {
    return ranLib.get_Config_F32(low = low, high = high)
  }

  def validRanges: Regulate_Subsystem_Inputs_Container_Profile = {
    val p = getDefaultProfile

    p.name = "Valid Ranges Profile"

    p.lowerDesiredTempWStatus.set_Config_F32(c32(
      low = Some(InitialValues.LOWER_DESIRED_TEMPERATURE_LOWER_RANGE),
      high = Some(InitialValues.LOWER_DESIRED_TEMPERATURE_UPPER_RANGE),
      ranLib = freshRandomLib))

    p.upperDesiredTempWStatus.set_Config_F32(c32(
      low = Some(InitialValues.UPPER_DESIRED_TEMPERATURE_LOWER_RANGE),
      high = Some(InitialValues.UPPER_DESIRED_TEMPERATURE_UPPER_RANGE),
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

  def Regulator_1HP_script_schema(inject_container: Regulate_Subsystem_Inputs_Container,
                                  prop: (Regulate_Subsystem_Inputs_Container, Regulate_Subsystem_Outputs_Container) => B): B = {
    return Regulator_XHP_script_schema(F, 1, inject_container, prop)
  }

  def Regulator_2HP_script_schema(inject_container: Regulate_Subsystem_Inputs_Container,
                                  prop: (Regulate_Subsystem_Inputs_Container, Regulate_Subsystem_Outputs_Container) => B): B = {
    return Regulator_XHP_script_schema(F, 2, inject_container, prop)
  }

  def Regulator_AfterInit_script_schema(inject_container: Regulate_Subsystem_Inputs_Container,
                                  prop: (Regulate_Subsystem_Inputs_Container, Regulate_Subsystem_Outputs_Container) => B): B = {
    return Regulator_XHP_script_schema(T, 1, inject_container, prop)
  }

  def Regulator_XHP_script_schema(injectAfterInitialization: B,
                                  numHPAfterInjection:Z,
                                  inject_container: Regulate_Subsystem_Inputs_Container,
                                  prop: (Regulate_Subsystem_Inputs_Container, Regulate_Subsystem_Outputs_Container) => B): B = {

    // -------------------- trace prefix --------------------

    // ====== Initialization =====
    // run the system's initialization phase
    //  ... automatically generated basic on indication that this script is a "compute phase test script"

    Art.initializePhase(scheduler)

    // ====== Compute ======

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // Abstractly, run the system an arbitrary number of steps

    if (!injectAfterInitialization) {
      compute(ISZ(Hstep(2)))
    }

    compute(ISZ(RunToThread("RegMRI")))

    // -------------------- inject / observe inputs --------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      injection and observation vectors, along with temporal point
    //      declarations of when to inject and observe
    // -------------------------------------------------------------------

    // set system inputs that flow to Manage Regulator Interface
    RegMRI.put_concrete_inputs(
      // The following uses Scala's parameter name argument protocol
      // format: api_<port_name> = <value>
      api_upper_desired_tempWstatus = inject_container.upperDesiredTempWStatus, // value from parameter
      api_lower_desired_tempWstatus = inject_container.lowerDesiredTempWStatus, // value from parameter
      api_regulator_mode = inject_container.mode,
      api_current_tempWstatus = inject_container.currentTempWStatus) // value from parameter

    // set system inputs that flow to Manage Regulator Mode
    RegMRM.put_current_tempWstatus(inject_container.currentTempWStatus)
    RegMRM.put_internal_failure(inject_container.internalFailure)

    // set system inputs that flow to Manage Heat Source
    RegMHS.put_current_tempWstatus(inject_container.currentTempWStatus)

    // ---------------- trace steps ----------------------

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    if (numHPAfterInjection > 1) {
      compute(ISZ(Hstep(numHPAfterInjection - 1))) // run remaining HPs
    }

    // ------------------ observe output -- build output observation vector ------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      injection and observation vectors, along with temporal point
    //      declarations of when to inject and observe
    // ---------------------------------------------------------------------------------------

    val api_heat_control = RegMHS.get_api_heat_control()
    val api_display_temp = RegMRI.get_api_displayed_temp()
    val api_regulator_status = RegMRI.get_api_regulator_status()
    val mode = RegMRM.get_api_regulator_mode()
    val output_container = Regulate_Subsystem_Outputs_Container(
      heat_control = api_heat_control,
      display_temperature = api_display_temp,
      regulator_status = api_regulator_status,
      mode = mode)



    // gracefully take system down
    Art.finalizePhase(scheduler)

    // ------------------ check property of collected observations ------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      property evaluation
    // ---------------------------------------------------------------------------------------

    return prop(inject_container, output_container)
  }

  //=============================================================
  //  Properties
  //
  //    Could potentially be generated from GUMBO-like contracts.
  //    Semantically, properties are predicates on observation vectors,
  //    similar to how GUMBOX functions are predicates on component
  //    input/output/state vectors.
  //
  //=============================================================

  //-----------------------------
  //  Helper functions
  //-----------------------------

  def helper_RegulatorUDTInputErrorCondition(container: Regulate_Subsystem_Inputs_Container): B = {
    val invalidUDT = container.upperDesiredTempWStatus.status == ValueStatus.Invalid
    return (invalidUDT)
  }

  def helper_RegulatorLDTInputErrorCondition(container: Regulate_Subsystem_Inputs_Container): B = {
    val invalidLDT = container.lowerDesiredTempWStatus.status == ValueStatus.Invalid
    return (invalidLDT)
  }

  def helper_RegulatorCTInputErrorCondition(container: Regulate_Subsystem_Inputs_Container): B = {
    val invalidCT = container.currentTempWStatus.status == ValueStatus.Invalid
    return (invalidCT)
  }

  def helper_RegulatorInputErrorCondition(container: Regulate_Subsystem_Inputs_Container): B = {
    return (container.upperDesiredTempWStatus.status == ValueStatus.Invalid
      | container.lowerDesiredTempWStatus.status == ValueStatus.Invalid
      | container.currentTempWStatus.status == ValueStatus.Invalid)
  }

  def helper_RegulatorInternalFailureCondition(container: Regulate_Subsystem_Inputs_Container): B = {
    return container.internalFailure.value
  }

  def helper_RegulatorErrorCondition(container: Regulate_Subsystem_Inputs_Container): B = {
    return (helper_RegulatorInputErrorCondition(container)
      | helper_RegulatorInternalFailureCondition(container))
  }

  //----------------------------------------------
  //  Property:  CT < LDT implies Heat-Control ON
  //    [high-level]
  //      In Normal mode, and in the absence of error-triggering inputs,
  //      If current temp is less than lower desired, then heat control shall be ON
  //
  //    [Precise property spec] To be done...
  //      The precise property would be expressed in terms of
  //        - declared observations (subsystem inputs and subsystem outputs)
  //        - temporal observation points (beginning and ending of hyper-period)
  //
  //    Note: Properties should be traceable to system requirements
  //----------------------------------------------

  def sysProp_NormalModeHeatOn(inputs_container: Regulate_Subsystem_Inputs_Container,
                               outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (!helper_RegulatorErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode
      & inputs_container.currentTempWStatus.value < inputs_container.lowerDesiredTempWStatus.value)

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Onn)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  //----------------------------------------------
  //  Property:  CT > UDT implies Heat-Control Off
  //    [high-level]
  //      In Normal mode, and in the absence of error-triggering inputs,
  //      If current temp is greater than upper desired, then heat control shall be OFF
  //----------------------------------------------

  def sysProp_NormalModeHeatOff(
                                 inputs_container: Regulate_Subsystem_Inputs_Container,

                                 outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (!helper_RegulatorErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode
      & inputs_container.currentTempWStatus.value > inputs_container.upperDesiredTempWStatus.value)

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Off)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_InitModeHeatOff(inputs_container: Regulate_Subsystem_Inputs_Container,

                              outputs_container: Regulate_Subsystem_Outputs_Container): B = {

    val triggerCondition: B =
      inputs_container.mode == Regulator_Mode.Init_Regulator_Mode

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Off)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  //---------------------------------------------------
  // Error Situations
  //   - shift to Failed Mode
  //   - heat control off
  //---------------------------------------------------

  def sysProp_InvalidCTNormalModeHeatOff(
                                          inputs_container: Regulate_Subsystem_Inputs_Container,

                                          outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorCTInputErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Off)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_InvalidUDTNormalModeHeatOff(
                                           inputs_container: Regulate_Subsystem_Inputs_Container,

                                           outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorUDTInputErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Off)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_InvalidLDTNormalModeHeatOff(
                                           inputs_container: Regulate_Subsystem_Inputs_Container,

                                           outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorLDTInputErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Off)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }


  def sysProp_InternalFailureNormalModeHeatOff(inputs_container: Regulate_Subsystem_Inputs_Container,
                                               outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorInternalFailureCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Off)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  // This property is a disjunction of the previous properties that address validity of temperature
  // inputs individually
  def sysProp_ErrorConditionHeatOff(
                                     inputs_container: Regulate_Subsystem_Inputs_Container,

                                     outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.heat_control == On_Off.Off)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  // ===========================  Display Temperature Properties ========================

  // Note:  This property specifies that if the mode is normal at the start of the
  //  hyperperiod, then the display temperature at the end of the hyper-period is equal
  //  to the current temperature at the end of the hyper-period.
  //
  // I (John) am not 100% convinced this is how we would want to formalize this property.
  def sysProp_NormalDisplayTemp(inputs_container: Regulate_Subsystem_Inputs_Container,
                                outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.display_temperature.value == ROUND(inputs_container.currentTempWStatus.value))

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  // ===========================  Mode Implication Properties ===========================
  //
  //  Note:  These properties don't require the inputs container.
  //    If we wanted to keep things very tidy, we would phrase them in terms of a single
  //    observation (e.g., the output observation).

  // **NOTE**: we won't get coverage causing the trigger condition to be true for this component
  def sysProp_InitModeImpliesHeatOff(inputs_container: Regulate_Subsystem_Inputs_Container,
                                     outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    // if the hyper-period concludes in Init mode, then heat source should be off
    // val triggerCondition: B = outputs_container.mode == Regulator_Mode.Normal_Regulator_Mode // seeded property error
    val triggerCondition: B = outputs_container.mode == Regulator_Mode.Init_Regulator_Mode // seeded property error

    val desiredCondition: B = outputs_container.heat_control == On_Off.Off

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_FailedModeImpliesHeatOff(inputs_container: Regulate_Subsystem_Inputs_Container,
                                       outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    // if the hyper-period concludes in Init mode, then heat source should be off
    val triggerCondition: B = outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode

    val desiredCondition: B = outputs_container.heat_control == On_Off.Off

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_FailedModeImpliesFailedStatus(inputs_container: Regulate_Subsystem_Inputs_Container,
                                            outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    // if the hyper-period concludes in Init mode, then heat source should be off
    val triggerCondition: B = outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode

    val desiredCondition: B = outputs_container.regulator_status == Status.Failed_Status

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  //====================================================================
  //  Mode Transition Properties
  //
  //====================================================================

  // Normal --> Normal  Transitions
  def sysProp_NormalToNormalMode(inputs_container: Regulate_Subsystem_Inputs_Container,
                                 outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (!helper_RegulatorErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  // Normal --> Failed   Transitions
  def sysProp_InvalidUDTNormalToFailedMode(
                                            inputs_container: Regulate_Subsystem_Inputs_Container,

                                            outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorUDTInputErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_InvalidLDTNormalToFailedMode(
                                            inputs_container: Regulate_Subsystem_Inputs_Container,
                                            outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorLDTInputErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_InvalidCTNormalToFailedMode(
                                           inputs_container: Regulate_Subsystem_Inputs_Container,
                                           outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorCTInputErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_InternalFailureNormalToFailedMode(inputs_container: Regulate_Subsystem_Inputs_Container,
                                                outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorInternalFailureCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_ErrorConditionInitToFailedMode(inputs_container: Regulate_Subsystem_Inputs_Container,
                                             outputs_container: Regulate_Subsystem_Outputs_Container): B = {

    // NOTE: this prop requires injection after the init phase

    val triggerCondition: B =
      ((inputs_container.internalFailure.value | inputs_container.currentTempWStatus.status == ValueStatus.Invalid)
        & inputs_container.mode == Regulator_Mode.Init_Regulator_Mode)

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  def sysProp_ErrorConditionFailedToFailedMode(inputs_container: Regulate_Subsystem_Inputs_Container,
                                               outputs_container: Regulate_Subsystem_Outputs_Container): B = {

    // NOTE: this prop requires two hyper-periods after injection

    val triggerCondition: B =
      (inputs_container.internalFailure.value | inputs_container.currentTempWStatus.status == ValueStatus.Invalid) &
        inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  // This property is a disjunction of the previous properties that address validity of temperature
  // inputs and internal failure individually
  def sysProp_ErrorConditionNormalToFailedMode(
                                                inputs_container: Regulate_Subsystem_Inputs_Container,
                                                outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = (helper_RegulatorErrorCondition(inputs_container)
      & inputs_container.mode == Regulator_Mode.Normal_Regulator_Mode)

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    bookKeep(triggerCondition, desiredCondition)

    return (triggerCondition.->:(desiredCondition))
  }

  // Failure --> Failure Transition  (Failure preserved)
  def sysProp_FailedToFailedMode(inputs_container: Regulate_Subsystem_Inputs_Container,
                                 outputs_container: Regulate_Subsystem_Outputs_Container): B = {
    val triggerCondition: B = inputs_container.mode == Regulator_Mode.Failed_Regulator_Mode

    val desiredCondition: B = (outputs_container.mode == Regulator_Mode.Failed_Regulator_Mode)

    return (triggerCondition.->:(desiredCondition))
  }

  @strictpure def compute_spec_lower_is_not_higher_than_upper_assume(container: Regulate_Subsystem_Inputs_Container): B =
    container.lowerDesiredTempWStatus.value <= container.upperDesiredTempWStatus.value

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
    val l = ops.StringOps(Regulate_Subsystem_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider1(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def toNameProvider2[X, Y](eta: (X, Y) => B)(implicit line: sourcecode.Line): NameProvider2 = {
    val l = ops.StringOps(Regulate_Subsystem_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider2(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def oneToGen[X](eta: (X) => B): Any => B = eta.asInstanceOf[Any => B]

  implicit def twoToGen[X, Y](eta: (X, Y) => B): (Any, Any) => B = eta.asInstanceOf[(Any, Any) => B]
}

object Regulate_Subsystem_Test_wSlangCheck {

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
      val inst = new Regulate_Subsystem_Test_wSlangCheck()
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