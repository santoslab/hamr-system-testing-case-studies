package RTS.system_tests.rts1

import org.sireum._
import RTS._
import RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container_SlangCheck.{NameProvider, TestRow}
import art.Art
import art.scheduling.static._
import RTS.system_tests.rts1.Functional_Oracles._
import RTS.system_tests.rts1.{Actuation_Subsystem_Inputs_Container, Actuation_Subsystem_Outputs_Container}


// Use Scala import renaming syntax to create shorter, more convenient names, for thread components

import RTS.Instrumentation.{InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_SystemTestAPI => instrumentationMockThread}
import RTS.EventControl.{EventControlMockThread_i_eventControlMock_eventControlMockThread_SystemTestAPI => eventControlMockThread}
import RTS.Actuators.{ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_SystemTestAPI => actuatorsMockThread}

import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_SystemTestAPI => au1_temp_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_SystemTestAPI => au1_press_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_SystemTestAPI => au1_satLogic_coincidenceLogic}
import RTS.Actuation.{OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SystemTestAPI => au1_tempPressTripOut_orLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_SystemTestAPI => au2_temp_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_SystemTestAPI => au2_press_coincidenceLogic}
import RTS.Actuation.{CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_SystemTestAPI => au2_satLogic_coincidenceLogic}
import RTS.Actuation.{OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_SystemTestAPI => au2_tempPressTripOut_orLogic}
import RTS.Actuation.{OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_SystemTestAPI => TPAU_actTempPA_orLogic}
import RTS.Actuation.{Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_SystemTestAPI => TPAU_tempPressA_actuator}
import RTS.Actuation.{OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_SystemTestAPI => SAU_actSatActuator_orLogic}
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

  //===========================================================
  //  S l a n g   C h e c k    Infrastructure
  //===========================================================

  val maxTests = 100
  var verbose: B = T

  val testMatrix: Map[String, TestRow] = Map.empty ++ ISZ(
    // -------------
    //  Operator Override Properties
    // -------------
    "TempPress_Manual_Trip" ~> TestRow(
      testDescription = "TempPress Manual Trip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_TempPressManualTrip", (sysProp_TempPressManualTrip _).asInstanceOf[(Any, Any) => B])
    ),
    "Saturation_Manual_Trip" ~> TestRow(
      testDescription = "Saturation Manual Trip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_SaturationManualTrip", (sysProp_SaturationManualTrip _).asInstanceOf[(Any, Any) => B])
    ),
    // -------------
    //  AU1 Properties
    // -------------
    "AU1TempTrip" ~> TestRow(
      testDescription = "AU1TempTrip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_AU1TempTrip", (sysProp_AU1TempTrip _).asInstanceOf[(Any, Any) => B])
    ),
    "AU1PressTrip" ~> TestRow(
      testDescription = "AU1PressTrip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_AU1PressTrip", (sysProp_AU1PressTrip _).asInstanceOf[(Any, Any) => B])
    ),
    "AU1SatTrip" ~> TestRow(
      testDescription = "AU1SatTrip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_AU1SatTrip", (sysProp_AU1SatTrip _).asInstanceOf[(Any, Any) => B])
    ),
    // -------------
    //  AU2 Properties
    // -------------
    "AU2TempTrip" ~> TestRow(
      testDescription = "AU2TempTrip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_AU2TempTrip", (sysProp_AU2TempTrip _).asInstanceOf[(Any, Any) => B])
    ),
    "AU2PressTrip" ~> TestRow(
      testDescription = "AU2PressTrip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_AU2PressTrip", (sysProp_AU2PressTrip _).asInstanceOf[(Any, Any) => B])
    ),
    "AU2SatTrip" ~> TestRow(
      testDescription = "AU2SatTrip",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_AU2SatTrip", (sysProp_AU2SatTrip _).asInstanceOf[(Any, Any) => B])
    ),
    // -------------
    //  Causality Properties
    // -------------
    "TempPressTripCausality" ~> TestRow(
      testDescription = "TempPressTripCausality",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_TempPressTripCausality", (sysProp_TempPressTripCausality _).asInstanceOf[(Any, Any) => B])
    ),
    "SatTripCausality" ~> TestRow(
      testDescription = "SatTripCausality",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_SatTripCausality", (sysProp_SatTripCausality _).asInstanceOf[(Any, Any) => B])
    ),
    // -------------
    //  Functional Oracle Properties
    // -------------
    "ALU_Satisfies_Oracle" ~> TestRow(
      testDescription = "ALU Satisfies Oracle",
      testMethod = NameProvider("Actuation_Subsystem_1HP_script_schema", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("sysProp_ALU_Satisfies_Functional_Oracle", (sysProp_ALU_Satisfies_Functional_Oracle _).asInstanceOf[(Any, Any) => B])
    )
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
                // debugging
                //  Wierd:  if I uncomment this, I get failing tests
//                val result = testRow.testMethod.function(container, testRow.property.function)
//                if (!result) {
//                  println(s"ERROR: Inputs Container: ${container}")
//                }
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
    // val result = (triggerCondition ->: desiredCondition)
    val result = !triggerCondition | desiredCondition
    return result
  }

  // test effect of operator-initiated manual TempPressure
  def sysProp_SaturationManualTrip(
                                    inputs_container: Actuation_Subsystem_Inputs_Container,
                                    outputs_container: Actuation_Subsystem_Outputs_Container): B = {


    // If the operator-initiated manual TempPressure trip signal holds
    val triggerCondition = inputs_container.satManualActuatorInput
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.SAU_satActuator_actuator
    val result1 = (triggerCondition ->: desiredCondition)
    val result2 = (triggerCondition.->:(desiredCondition))
    val result3 = !triggerCondition | desiredCondition
    return result3
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
    val result = !triggerCondition | desiredCondition
    return result
  }

  def sysProp_AU1PressTrip(
                           inputs_container: Actuation_Subsystem_Inputs_Container,
                           outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the pressure trip channels are set for AU1
    val triggerCondition = helper_PressTripConditionAU1(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.TPAU_tempPressA_actuator_output
    val result = !triggerCondition | desiredCondition
    return result
  }

  def sysProp_AU1SatTrip(
                            inputs_container: Actuation_Subsystem_Inputs_Container,
                            outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_SatTripConditionAU1(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.SAU_satActuator_actuator
    val result = !triggerCondition | desiredCondition
    return result
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
    val result = !triggerCondition | desiredCondition
    return result
  }

  def sysProp_AU2PressTrip(
                            inputs_container: Actuation_Subsystem_Inputs_Container,
                            outputs_container: Actuation_Subsystem_Outputs_Container): B = {
   // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_PressTripConditionAU2(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.TPAU_tempPressA_actuator_output
    val result = !triggerCondition | desiredCondition
    return result
  }

  def sysProp_AU2SatTrip(
                          inputs_container: Actuation_Subsystem_Inputs_Container,
                          outputs_container: Actuation_Subsystem_Outputs_Container): B = {
    // If at least two of the temp trip channels are set for AU1
    val triggerCondition = helper_SatTripConditionAU2(inputs_container)
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.SAU_satActuator_actuator
    val result = !triggerCondition | desiredCondition
    return result
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
    val result = !triggerCondition | desiredCondition
    return result
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
    val result = !triggerCondition | desiredCondition
    return result
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

}