package RTS.system_tests

import RTS._
import art.Art
import art.scheduling.static._
import org.sireum._
import Functional_Oracles._

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
    "TempPress Manual Trip" ~> TestRow(
      testMethod = NameProvider("ALU 1HP", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("TempPress Manual Trip", (sysProp_TempPressManualTrip _).asInstanceOf[(Any, Any) => B])
    ),
    "Saturation Manual Trip" ~> TestRow(
      testMethod = NameProvider("ALU 1HP", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("Saturation Manual Trip", (sysProp_SaturationManualTrip _).asInstanceOf[(Any, Any) => B])
    ),
    "ALU Satisfies Oracle" ~> TestRow(
      testMethod = NameProvider("ALU 1HP", (Actuation_Subsystem_1HP_script_schema _).asInstanceOf[(Any, Any) => B]),
      profile = getDefaultProfile,
      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
      property = NameProvider("ALU Satisfies Oracle", (sysProp_ALU_Satisfies_Functional_Oracle _).asInstanceOf[(Any, Any) => B])
    )
  )

  for (testRow <- testMatrix.entries) {
    run(testRow._1, testRow._2)
  }

  def genTestName(testFamilyName: String, testRow: TestRow): String = {
    return s"${testFamilyName}: ${testRow.testMethod.name}: ${testRow.property.name}: ${testRow.profile.name}"
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
                testRow.testMethod.function(container, testRow.property.function)
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
    au2_press_coincidenceLogic.put_channel1(c.au2_press_coincidenceLogic_channel1)
    au2_press_coincidenceLogic.put_channel2(c.au2_press_coincidenceLogic_channel1)
    au2_press_coincidenceLogic.put_channel3(c.au2_press_coincidenceLogic_channel1)
    au2_press_coincidenceLogic.put_channel4(c.au2_press_coincidenceLogic_channel1)
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
    val TPAU_tempPressA_actuator_output =  TPAU_tempPressA_actuator.get_api_output()
    val SAU_satActuator_actuator_output = SAU_satActuator_actuator.get_api_output()
    return Actuation_Subsystem_Outputs_Container(
      TPAU_tempPressA_actuator_output,SAU_satActuator_actuator_output)
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

    //  ----  r u n   t o   a r b i t r a r y    s y s t e m    s t a t e

    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    // -------------------- inject / observe inputs --------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      injection and observation vectors, along with temporal point
    //      declarations of when to inject and observe
    // -------------------------------------------------------------------

    // inject subsystem inputs
    injectALUInputs(inject_container)

    // run to end of current hyper-period - and check outputs of selected components
    compute(ISZ(Hstep(1)))

    // ------------------ observe output -- build output observation vector ------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      injection and observation vectors, along with temporal point
    //      declarations of when to inject and observe
    // ---------------------------------------------------------------------------------------

    compute(ISZ(RunToThread("actuatorsMockThread")))

    val output_container: Actuation_Subsystem_Outputs_Container = observeALUOutputs()

    // gracefully take system down
    Art.finalizePhase(scheduler)

    // ------------------ check property of collected observations ------------------
    //   ...eventually, auto-generated from higher-level specification of
    //      property evaluation
    // ---------------------------------------------------------------------------------------

    return prop(inject_container, output_container)
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
    return (triggerCondition ->: desiredCondition)
  }

  // test effect of operator-initiated manual TempPressure
  def sysProp_SaturationManualTrip(
                                   inputs_container: Actuation_Subsystem_Inputs_Container,
                                   outputs_container: Actuation_Subsystem_Outputs_Container): B = {


    // If the operator-initiated manual TempPressure trip signal holds
    val triggerCondition = inputs_container.satManualActuatorInput
    // Then we should have a temp/pressure actuation
    val desiredCondition = outputs_container.SAU_satActuator_actuator
    return (triggerCondition ->: desiredCondition)
  }

  // test entire subsystem against functional oracle
  def sysProp_ALU_Satisfies_Functional_Oracle(
                                 inputs_container: Actuation_Subsystem_Inputs_Container,
                                 outputs_container: Actuation_Subsystem_Outputs_Container): B = {

    // restructure inputs - from contain to trip signals

    val unit1TripSignals: ALUTripSignals =  (
      inputs_container.au1_temp_coincidenceLogic_channel1,
      inputs_container.au1_temp_coincidenceLogic_channel2,
      inputs_container.au1_temp_coincidenceLogic_channel3,
      inputs_container.au1_temp_coincidenceLogic_channel4,
      inputs_container.au1_press_coincidenceLogic_channel1,
      inputs_container.au1_press_coincidenceLogic_channel2,
      inputs_container.au1_press_coincidenceLogic_channel3,
      inputs_container.au1_press_coincidenceLogic_channel4,
      inputs_container.au1_satlogic_coincidenceLogic_channel1,
      inputs_container.au1_satlogic_coincidenceLogic_channel2,
      inputs_container.au1_satlogic_coincidenceLogic_channel3,
      inputs_container.au1_satlogic_coincidenceLogic_channel4
    )

    val unit2TripSignals: ALUTripSignals = (
      inputs_container.au2_satlogic_coincidenceLogic_channel1,
      inputs_container.au2_temp_coincidenceLogic_channel2,
      inputs_container.au2_temp_coincidenceLogic_channel3,
      inputs_container.au2_temp_coincidenceLogic_channel4,
      inputs_container.au2_press_coincidenceLogic_channel1,
      inputs_container.au2_press_coincidenceLogic_channel2,
      inputs_container.au2_press_coincidenceLogic_channel3,
      inputs_container.au2_press_coincidenceLogic_channel4,
      inputs_container.au2_satlogic_coincidenceLogic_channel1,
      inputs_container.au2_satlogic_coincidenceLogic_channel2,
      inputs_container.au2_satlogic_coincidenceLogic_channel3,
      inputs_container.au2_satlogic_coincidenceLogic_channel4
    )

    val tempManualActuationInput = inputs_container.tempPressManualActuatorInput
    val satManualActuationInput = inputs_container.satManualActuatorInput

    // execute functional behavior

    val actuation_unit1_outputs = actuationLogic_function(unit1TripSignals)
    val actuation_unit2_outputs = actuationLogic_function(unit2TripSignals)
    val tempPressure_actuator_unit_output = actuatorUnit_function(
      actuation_unit1_outputs._1,
      actuation_unit2_outputs._1,
      tempManualActuationInput)
    val sat_actuator_unit_output = actuatorUnit_function(
      actuation_unit1_outputs._2,
      actuation_unit2_outputs._2,
      satManualActuationInput)

    // compare specified result (oracle) to actual result (container)

    val result =  ((tempPressure_actuator_unit_output == outputs_container.TPAU_tempPressA_actuator_output)
                & (sat_actuator_unit_output == outputs_container.SAU_satActuator_actuator))

    return result
  }



}