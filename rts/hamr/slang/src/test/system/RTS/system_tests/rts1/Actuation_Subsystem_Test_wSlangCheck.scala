package RTS.system_tests.rts1

import org.sireum._
import RTS._
import RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container_SlangCheck.{NameProvider1, NameProvider2, TestConfiguration}
import art.Art
import art.scheduling.static._
import RTS.system_tests.rts1.Functional_Oracles._
import Actuation_Subsystem_Test_wSlangCheck._

import scala.language.implicitConversions

// Use Scala import renaming syntax to create shorter, more convenient names, for thread components

import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_SystemTestAPI => au1_temp_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_SystemTestAPI => au1_press_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_SystemTestAPI => au1_satLogic_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_SystemTestAPI => au2_temp_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_SystemTestAPI => au2_press_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_SystemTestAPI => au2_satLogic_coincidenceLogic}
import RTS.Actuation.{Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SystemTestAPI => TPAU_tempPressA_actuator}
import RTS.Actuation.{Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_SystemTestAPI => SAU_satActuator_actuator}

class Actuation_Subsystem_Test_wSlangCheck
  extends Actuation_Subsystem_Inputs_Container_SlangCheck {

  //===========================================================
  //  S c h e d u l a r     and    S t e p p e r     Configuration
  //===========================================================

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
  //var scheduler: StaticScheduler = Schedulers.getStaticSchedulerH(MNone())
  var scheduler: StaticScheduler = Schedulers.getStaticScheduler(
    CustStaticSchedule.staticSchedule,
    CustStaticSchedule.domainToBridgeIdMap,
    CustStaticSchedule.threadNickNames,
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

  val components = ISZ[String]()
  val testMatrix: Map[String, TestConfiguration] = Map.empty ++ ISZ(
    // -------------
    //  Operator Override Properties
    // -------------
    "TempPress_Manual_Trip" ~> TestConfiguration(
      description = "TempPress Manual Trip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_TempPressManualTrip _,
      components = components,
      numTests = maxTests
    ),
    "Saturation_Manual_Trip" ~> TestConfiguration(
      description = "Saturation Manual Trip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_SaturationManualTrip _,
      components = components,
      numTests = maxTests
    ),
    // -------------
    //  AU1 Properties
    // -------------
    "AU1TempTrip" ~> TestConfiguration(
      description = "AU1TempTrip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_AU1TempTrip _,
      components = components,
      numTests = maxTests
    ),
    "AU1PressTrip" ~> TestConfiguration(
      description = "AU1PressTrip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_AU1PressTrip _,
      components = components,
      numTests = maxTests
    ),
    "AU1SatTrip" ~> TestConfiguration(
      description = "AU1SatTrip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_AU1SatTrip _,
      components = components,
      numTests = maxTests
    ),
    // -------------
    //  AU2 Properties
    // -------------
    "AU2TempTrip" ~> TestConfiguration(
      description = "AU2TempTrip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_AU2TempTrip _,
      components = components,
      numTests = maxTests
    ),
    "AU2PressTrip" ~> TestConfiguration(
      description = "AU2PressTrip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_AU2PressTrip _,
      components = components,
      numTests = maxTests
    ),
    "AU2SatTrip" ~> TestConfiguration(
      description = "AU2SatTrip",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_AU2SatTrip _,
      components = components,
      numTests = maxTests
    ),
    // -------------
    //  Causality Properties
    // -------------
    "TempPressTripCausality" ~> TestConfiguration(
      description = "TempPressTripCausality",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_TempPressTripCausality _,
      components = components,
      numTests = maxTests
    ),
    "SatTripCausality" ~> TestConfiguration(
      description = "SatTripCausality",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_SatTripCausality _,
      components = components,
      numTests = maxTests
    ),
    // -------------
    //  Functional Oracle Properties
    // -------------
    "ALU_Satisfies_Oracle" ~> TestConfiguration(
      description = "ALU Satisfies Oracle",
      schema = Actuation_Subsystem_1HP_script_schema _,
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = sysProp_ALU_Satisfies_Functional_Oracle _,
      components = components,
      numTests = maxTests
    )
  )


  for (testRow <- testMatrix.entries) {
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
  def examplePreStateContainerFilter(container: Actuation_Subsystem_Inputs_Container): B = {
    // e.g. return container.low < container.high
    return T
  }


  //====================================================================
  //   I n j e c t o r:  ALU  Inputs
  //====================================================================

  def injectALUInputs(c: Actuation_Subsystem_Inputs_Container): Unit = {
    au1_temp_coincidenceLogic.put_channel1(c.au1_temp_coincidenceLogic_channel1)
    au1_temp_coincidenceLogic.put_channel2(c.au1_temp_coincidenceLogic_channel2)
    au1_temp_coincidenceLogic.put_channel3(c.au1_temp_coincidenceLogic_channel3)
    au1_temp_coincidenceLogic.put_channel4(c.au1_temp_coincidenceLogic_channel4)
    au1_press_coincidenceLogic.put_channel1(c.au1_press_coincidenceLogic_channel1)
    au1_press_coincidenceLogic.put_channel2(c.au1_press_coincidenceLogic_channel2)
    au1_press_coincidenceLogic.put_channel3(c.au1_press_coincidenceLogic_channel3)
    au1_press_coincidenceLogic.put_channel4(c.au1_press_coincidenceLogic_channel4)
    au1_satLogic_coincidenceLogic.put_channel1(c.au1_satlogic_coincidenceLogic_channel1)
    au1_satLogic_coincidenceLogic.put_channel2(c.au1_satlogic_coincidenceLogic_channel2)
    au1_satLogic_coincidenceLogic.put_channel3(c.au1_satlogic_coincidenceLogic_channel3)
    au1_satLogic_coincidenceLogic.put_channel4(c.au1_satlogic_coincidenceLogic_channel4)

    au2_temp_coincidenceLogic.put_channel1(c.au2_temp_coincidenceLogic_channel1)
    au2_temp_coincidenceLogic.put_channel2(c.au2_temp_coincidenceLogic_channel2)
    au2_temp_coincidenceLogic.put_channel3(c.au2_temp_coincidenceLogic_channel3)
    au2_temp_coincidenceLogic.put_channel4(c.au2_temp_coincidenceLogic_channel4)
    // Note: there was originally a bug below -- channel1 input was being used to set channels 2,3,4
    au2_press_coincidenceLogic.put_channel1(c.au2_press_coincidenceLogic_channel1)
    au2_press_coincidenceLogic.put_channel2(c.au2_press_coincidenceLogic_channel2)
    au2_press_coincidenceLogic.put_channel3(c.au2_press_coincidenceLogic_channel3)
    au2_press_coincidenceLogic.put_channel4(c.au2_press_coincidenceLogic_channel4)
    au2_satLogic_coincidenceLogic.put_channel1(c.au2_satlogic_coincidenceLogic_channel1)
    au2_satLogic_coincidenceLogic.put_channel2(c.au2_satlogic_coincidenceLogic_channel2)
    au2_satLogic_coincidenceLogic.put_channel3(c.au2_satlogic_coincidenceLogic_channel3)
    au2_satLogic_coincidenceLogic.put_channel4(c.au2_satlogic_coincidenceLogic_channel4)

    TPAU_tempPressA_actuator.put_manualActuatorInput(c.tempPressManualActuatorInput)
    SAU_satActuator_actuator.put_manualActuatorInput(c.satManualActuatorInput)
  }

  //====================================================================
  //   O b s e r v e r :  ALU  Outputs
  //====================================================================

  def observeALUOutputs(): Actuation_Subsystem_Outputs_Container = {
    val TPAU_tempPressA_actuator_output = TPAU_tempPressA_actuator.get_api_output()
    val SAU_satActuator_actuator_output = SAU_satActuator_actuator.get_api_output()
    return Actuation_Subsystem_Outputs_Container(
      TPAU_tempPressA_actuator_output, SAU_satActuator_actuator_output)
  }

  //====================================================================
  //   E x e c u t i o n    S c h e m a s
  //====================================================================

  def Actuation_Subsystem_1HP_script_schema(inject_container: Actuation_Subsystem_Inputs_Container,
                                            prop: (Actuation_Subsystem_Inputs_Container, Actuation_Subsystem_Outputs_Container) =>
                                              B
                                           ): B = {

    // -------------------- trace prefix --------------------

    // ====== Initialization =====
    // run the system's initialization phase
    //  ... automatically generated basic on indication that this script is a "compute phase test script"

    Art.initializePhase(scheduler)

    // ====== Compute ======

    // run past components providing inputs to the Actuation subsystem, i.e.,
    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    // -------------------- inject / observe inputs --------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      injection and observation vectors, along with temporal point
    //      declarations of when to inject and observe
    // -------------------------------------------------------------------

    // inject subsystem inputs (overriding inputs from components that we ran past above)
    // println(s"Input container: ${inject_container}")  // debugging
    injectALUInputs(inject_container)

    // run to the end of the portion of the schedule for the Actuation subsystem components
    compute(ISZ(RunToThread("actuatorsMockThread")))

    // ------------------ observe output -- build output observation vector ------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      injection and observation vectors, along with temporal point
    //      declarations of when to inject and observe
    // ---------------------------------------------------------------------------------------

    val output_container: Actuation_Subsystem_Outputs_Container = observeALUOutputs()

    // println(s"Output container: ${output_container}")  // debugging
    // gracefully take system down
    Art.finalizePhase(scheduler)

    // ------------------ check property of collected observations ------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      property evaluation
    // ---------------------------------------------------------------------------------------

    val result = prop(inject_container, output_container)
    //    if (!result) {     // debugging
    //      println(s"Property failed")
    //    }
    return result
  }

  //====================================================================
  //   P r o p e r t y     H e l p e r s
  //
  //    Predicates for individual temp, pressure, and saturation trip conditions
  //====================================================================

  // does the temp trip condition hold for AU1 inputs?
  def helper_TempTripConditionAU1(inputs_container: Actuation_Subsystem_Inputs_Container): B = {
    val channel1 = inputs_container.au1_temp_coincidenceLogic_channel1
    val channel2 = inputs_container.au1_temp_coincidenceLogic_channel2
    val channel3 = inputs_container.au1_temp_coincidenceLogic_channel3
    val channel4 = inputs_container.au1_temp_coincidenceLogic_channel4
    // If at least two of the temp trip channels are set for AU1
    return coincidenceLogic_function(channel1, channel2, channel3, channel4)
  }

  // does the temp trip condition hold for AU2 inputs?
  def helper_TempTripConditionAU2(inputs_container: Actuation_Subsystem_Inputs_Container): B = {
    val channel1 = inputs_container.au2_temp_coincidenceLogic_channel1
    val channel2 = inputs_container.au2_temp_coincidenceLogic_channel2
    val channel3 = inputs_container.au2_temp_coincidenceLogic_channel3
    val channel4 = inputs_container.au2_temp_coincidenceLogic_channel4
    // If at least two of the temp trip channels are set for AU2
    return coincidenceLogic_function(channel1, channel2, channel3, channel4)
  }

  // does the pressure trip condition hold for AU1 inputs?
  def helper_PressTripConditionAU1(inputs_container: Actuation_Subsystem_Inputs_Container): B = {
    val channel1 = inputs_container.au1_press_coincidenceLogic_channel1
    val channel2 = inputs_container.au1_press_coincidenceLogic_channel2
    val channel3 = inputs_container.au1_press_coincidenceLogic_channel3
    val channel4 = inputs_container.au1_press_coincidenceLogic_channel4
    // If at least two of the pressure trip channels are set for AU1
    return coincidenceLogic_function(channel1, channel2, channel3, channel4)
  }

  // does the pressure trip condition hold for AU2 inputs?
  def helper_PressTripConditionAU2(inputs_container: Actuation_Subsystem_Inputs_Container): B = {
    val channel1 = inputs_container.au2_press_coincidenceLogic_channel1
    val channel2 = inputs_container.au2_press_coincidenceLogic_channel2
    val channel3 = inputs_container.au2_press_coincidenceLogic_channel3
    val channel4 = inputs_container.au2_press_coincidenceLogic_channel4
    // If at least two of the pressure trip channels are set for AU2
    return coincidenceLogic_function(channel1, channel2, channel3, channel4)
  }

  // does the saturation trip condition hold for AU1 inputs?
  def helper_SatTripConditionAU1(inputs_container: Actuation_Subsystem_Inputs_Container): B = {
    val channel1 = inputs_container.au1_satlogic_coincidenceLogic_channel1
    val channel2 = inputs_container.au1_satlogic_coincidenceLogic_channel2
    val channel3 = inputs_container.au1_satlogic_coincidenceLogic_channel3
    val channel4 = inputs_container.au1_satlogic_coincidenceLogic_channel4
    // If at least two of the sat trip channels are set for AU1
    return coincidenceLogic_function(channel1, channel2, channel3, channel4)
  }

  // does the saturation trip condition hold for AU2 inputs?
  def helper_SatTripConditionAU2(inputs_container: Actuation_Subsystem_Inputs_Container): B = {
    val channel1 = inputs_container.au2_satlogic_coincidenceLogic_channel1
    val channel2 = inputs_container.au2_satlogic_coincidenceLogic_channel2
    val channel3 = inputs_container.au2_satlogic_coincidenceLogic_channel3
    val channel4 = inputs_container.au2_satlogic_coincidenceLogic_channel4
    // If at least two of the sat trip channels are set for AU2
    return coincidenceLogic_function(channel1, channel2, channel3, channel4)
  }

  //====================================================================
  //   P r o p e r t i e s
  //====================================================================

  // test effect of operator-initiated manual TempPressure
  def sysProp_TempPressManualTrip(
                                   inputs_container: Actuation_Subsystem_Inputs_Container,
                                   outputs_container: Actuation_Subsystem_Outputs_Container): B = {


    // If the operator-initiated manual TempPressure trip signal holds
    val triggerCondition = inputs_container.tempPressManualActuatorInput
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.TPAU_tempPressA_actuator_output

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  // test effect of operator-initiated manual TempPressure
  def sysProp_SaturationManualTrip(
                                    inputs_container: Actuation_Subsystem_Inputs_Container,
                                    outputs_container: Actuation_Subsystem_Outputs_Container): B = {


    // If the operator-initiated manual TempPressure trip signal holds
    val triggerCondition = inputs_container.satManualActuatorInput
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.SAU_satActuator_actuator

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  //=================================================
  //  AU1 Properties
  //=================================================
  def sysProp_AU1TempTrip(
                                    inputs_container: Actuation_Subsystem_Inputs_Container,
                                    outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_TempTripConditionAU1(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.TPAU_tempPressA_actuator_output

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_AU1PressTrip(
                           inputs_container: Actuation_Subsystem_Inputs_Container,
                           outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the pressure trip channels are set for AU1
    val triggerCondition = helper_PressTripConditionAU1(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.TPAU_tempPressA_actuator_output

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_AU1SatTrip(
                            inputs_container: Actuation_Subsystem_Inputs_Container,
                            outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_SatTripConditionAU1(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.SAU_satActuator_actuator

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  //=================================================
  //  AU2 Properties
  //=================================================
  def sysProp_AU2TempTrip(
                           inputs_container: Actuation_Subsystem_Inputs_Container,
                           outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_TempTripConditionAU2(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.TPAU_tempPressA_actuator_output

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_AU2PressTrip(
                            inputs_container: Actuation_Subsystem_Inputs_Container,
                            outputs_container: Actuation_Subsystem_Outputs_Container): B = {
   // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_PressTripConditionAU2(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.TPAU_tempPressA_actuator_output

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_AU2SatTrip(
                          inputs_container: Actuation_Subsystem_Inputs_Container,
                          outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_SatTripConditionAU2(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.SAU_satActuator_actuator

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  //=================================================
  //  Causality Properties
  //=================================================
  def sysProp_SatTripCausality(
                          inputs_container: Actuation_Subsystem_Inputs_Container,
                          outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If there is a saturation trip
    val triggerCondition = outputs_container.SAU_satActuator_actuator
    // Then it must be the case that there is a operator override trip
    //  or a coincidence condition from either AU1 or AU2
    val au1SatTrip = helper_SatTripConditionAU1(inputs_container)
    val au2SatTrip = helper_SatTripConditionAU2(inputs_container)
    val desiredCondition = au1SatTrip | au2SatTrip | inputs_container.satManualActuatorInput

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }

  def sysProp_TempPressTripCausality(
                                inputs_container: Actuation_Subsystem_Inputs_Container,
                                outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If there is a saturation trip
    val triggerCondition = outputs_container.TPAU_tempPressA_actuator_output
    // Then it must be the case that there is a operator override trip
    //  or a temp or press coincidence condition from either AU1 or AU2
    val au1TempTrip = helper_TempTripConditionAU1(inputs_container)
    val au1PressTrip = helper_PressTripConditionAU1(inputs_container)
    val au2TempTrip = helper_TempTripConditionAU2(inputs_container)
    val au2PressTrip = helper_PressTripConditionAU2(inputs_container)
    val desiredCondition = au1TempTrip | au1PressTrip | au2TempTrip | au2PressTrip | inputs_container.tempPressManualActuatorInput

    bookKeep(triggerCondition, desiredCondition)

    return triggerCondition.->:(desiredCondition)
  }


  //======================================================
  //  O r a c l e
  //
  // test entire subsystem against functional oracle
  //======================================================
  def sysProp_ALU_Satisfies_Functional_Oracle(
                                               inputs_container: Actuation_Subsystem_Inputs_Container,
                                               outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    val oracle_outputs_container = Functional_Oracles.ALUOracleContainers(inputs_container)
    // compare specified result (oracle) to actual result (container)
    val result = (outputs_container == oracle_outputs_container)
    return result
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
    val l = ops.StringOps(Actuation_Subsystem_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider1(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def toNameProvider2[X, Y](eta: (X, Y) => B)(implicit line: sourcecode.Line): NameProvider2 = {
    val l = ops.StringOps(Actuation_Subsystem_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider2(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def oneToGen[X](eta: (X) => B): Any => B = eta.asInstanceOf[Any => B]

  implicit def twoToGen[X, Y](eta: (X, Y) => B): (Any, Any) => B = eta.asInstanceOf[(Any, Any) => B]
}

object Actuation_Subsystem_Test_wSlangCheck {

  case class PropStatus (val triggerF: Z,
                         val triggerT_desiredF: Z,
                         val triggerT_desiredT: Z)

  var propStatus: Map[String, PropStatus] = Map.empty

  val lines: ISZ[String] = {
    val ll: Os.Path = Os.env("ABS_JAR_LOC") match {
      case Some(l) =>
        // must be running from the jar file so need to unpack it to get the source files
        val tempDir = Os.tempDir()
        proc"unzip $l -d $tempDir".runCheck()
        val name = ops.ISZOps(ops.StringOps(ops.StringOps(getClass.getName).replaceAllLiterally("$", "")).split(c => c == C('.')))
        (tempDir /+ name.dropRight(1)) / s"${name.last}.scala"
      case _ => Os.path(implicitly[sourcecode.File].value)
    }
    ops.StringOps(ops.StringOps(ll.read).replaceAllLiterally("\n", " \n")).split(c => c == C('\n'))
  }

  @strictpure def p(str: String): ST = Json.Printer.printString(str)

  val dummy = genJsons(F)   // doing this a var decl so that the actions are invoked when the JVM loads the object

  def genJsons(echo: B): B = {
    if (Os.env("JENKINS_HOME").isEmpty) { // don't generate these when CI
      // emit test configs as JSON
      val inst = new Actuation_Subsystem_Test_wSlangCheck()
      val entries = for (entry <- inst.testMatrix.entries) yield inst.genTestNameJson(entry._1, entry._2)
      val thisFile = Os.path(implicitly[sourcecode.File].value)
      val outFile = thisFile.up / s"${thisFile.name}.json"
      outFile.writeOver(st"${(entries, "\n")}".render)

      // emit schedule as JSON
      val nickNames: ISZ[ST] = for (e <- CustStaticSchedule.threadNickNames.entries) yield
        st"${e._1}:${Arch.ad.components(e._2).name}"
      val nickNamesS = st"${(nickNames, ",")}".render
      val sched: ISZ[ST] = for (e <- CustStaticSchedule.domainToBridgeIdMap) yield
        st"""${CustStaticSchedule.revThreadNickNames.get(e).get}"""
      val schedS = st"${(sched, ",")}".render
      val schedFile = thisFile.up / s"${thisFile.name}_schedule.json"
      schedFile.writeOver(
        st"""{
            |  "nickNames": ${p(nickNamesS)},
            |  "scheduleProvider": ${p(CustStaticSchedule.getClass.getName)},
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
