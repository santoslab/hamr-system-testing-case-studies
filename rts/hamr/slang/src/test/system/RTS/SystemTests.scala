package RTS

import org.sireum._
import art.{Art, ArtNative_Ext}
import art.scheduling.static._
import RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck
import RTS.system_tests.rts1.{Actuation_Subsystem_Inputs_Container, Actuation_Subsystem_Outputs_Container}
import RTS.system_tests.rts1.Functional_Oracles._

import java.io.{OutputStream, PrintStream}

// This file will not be overwritten so is safe to edit

class SystemTests extends SystemTestSuite {

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
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
    // uncomment this to disable the various guis
    System.setProperty("java.awt.headless", "true")

    // uncomment this to suppress the log stream
    //ArtNative_Ext.logStream = new PrintStream(new OutputStream {
    //  override def write(b: Int): Unit = {}
    //})

    super.beforeEach()
  }

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

  type ALUTripSignals = // 12-tuple of booleans
    (Base_Types.Boolean, Base_Types.Boolean, Base_Types.Boolean, Base_Types.Boolean,
     Base_Types.Boolean, Base_Types.Boolean, Base_Types.Boolean, Base_Types.Boolean,
     Base_Types.Boolean, Base_Types.Boolean, Base_Types.Boolean, Base_Types.Boolean)

  def setALUInputs(unit1TripSignals: ALUTripSignals, unit2TripSignals: ALUTripSignals, tempManualActuatorInput: B, satManualActuatorInput:B): Unit = {
    au1_temp_coincidenceLogic.put_channel1(unit1TripSignals._1)
    au1_temp_coincidenceLogic.put_channel2(unit1TripSignals._2)
    au1_temp_coincidenceLogic.put_channel3(unit1TripSignals._3)
    au1_temp_coincidenceLogic.put_channel4(unit1TripSignals._4)
    au1_press_coincidenceLogic.put_channel1(unit1TripSignals._5)
    au1_press_coincidenceLogic.put_channel2(unit1TripSignals._6)
    au1_press_coincidenceLogic.put_channel3(unit1TripSignals._7)
    au1_press_coincidenceLogic.put_channel4(unit1TripSignals._8)
    au1_satLogic_coincidenceLogic.put_channel1(unit1TripSignals._9)
    au1_satLogic_coincidenceLogic.put_channel2(unit1TripSignals._10)
    au1_satLogic_coincidenceLogic.put_channel3(unit1TripSignals._11)
    au1_satLogic_coincidenceLogic.put_channel4(unit1TripSignals._12)

    au2_temp_coincidenceLogic.put_channel1(unit2TripSignals._1)
    au2_temp_coincidenceLogic.put_channel2(unit2TripSignals._2)
    au2_temp_coincidenceLogic.put_channel3(unit2TripSignals._3)
    au2_temp_coincidenceLogic.put_channel4(unit2TripSignals._4)
    au2_press_coincidenceLogic.put_channel1(unit2TripSignals._5)
    au2_press_coincidenceLogic.put_channel2(unit2TripSignals._6)
    au2_press_coincidenceLogic.put_channel3(unit2TripSignals._7)
    au2_press_coincidenceLogic.put_channel4(unit2TripSignals._8)
    au2_satLogic_coincidenceLogic.put_channel1(unit2TripSignals._9)
    au2_satLogic_coincidenceLogic.put_channel2(unit2TripSignals._10)
    au2_satLogic_coincidenceLogic.put_channel3(unit2TripSignals._11)
    au2_satLogic_coincidenceLogic.put_channel4(unit2TripSignals._12)

    TPAU_tempPressA_actuator.put_manualActuatorInput(tempManualActuatorInput)
    SAU_satActuator_actuator.put_manualActuatorInput(satManualActuatorInput)
  }

  def makeInputsContainer(unit1TripSignals: ALUTripSignals,
           unit2TripSignals: ALUTripSignals,
           tempManualActuatorInput: B,
           satManualActuatorInput: B): Actuation_Subsystem_Inputs_Container = {
   val result = Actuation_Subsystem_Inputs_Container(
      unit1TripSignals._1,
      unit1TripSignals._2,
      unit1TripSignals._3,
      unit1TripSignals._4,
      unit1TripSignals._5,
      unit1TripSignals._6,
      unit1TripSignals._7,
      unit1TripSignals._8,
      unit1TripSignals._9,
      unit1TripSignals._10,
      unit1TripSignals._11,
      unit1TripSignals._12,

      unit2TripSignals._1,
      unit2TripSignals._2,
      unit2TripSignals._3,
      unit2TripSignals._4,
      unit2TripSignals._5,
      unit2TripSignals._6,
      unit2TripSignals._7,
      unit2TripSignals._8,
      unit2TripSignals._9,
      unit2TripSignals._10,
      unit2TripSignals._11,
      unit2TripSignals._12,

      tempManualActuatorInput,
      satManualActuatorInput)

    return result
  }

  def coincidenceLogic_function(channel1: B, channel2: B, channel3: B, channel4: B): B = {
    val output = (channel1 & channel2 |
                  channel1 & channel3 |
                  channel1 & channel4 |
                  channel2 & channel3 |
                  channel2 & channel4 |
                  channel3 & channel4)
    return output
  }

  def orLogic_function(in1: B, in2: B): B = {
    val output = in1 | in2
    return output
  }

  def actuationLogic_function(tripSignals: ALUTripSignals): (B,B) = {
    val tempCoincidenceOutput = coincidenceLogic_function(tripSignals._1, tripSignals._2, tripSignals._3, tripSignals._4)
    val pressureCoincidenceOutput = coincidenceLogic_function(tripSignals._5, tripSignals._6, tripSignals._7, tripSignals._8)
    val satCoincidenceOutput = coincidenceLogic_function(tripSignals._9, tripSignals._10, tripSignals._11, tripSignals._12)
    val tempPressureTripOutput = orLogic_function(tempCoincidenceOutput,pressureCoincidenceOutput)
    return (tempPressureTripOutput,satCoincidenceOutput)
  }

  def actuatorUnit_function(channel1: B, channel2:B, manualActuatorInput:B): B = {
    val channelsOr = orLogic_function(channel1,channel2)
    val output = orLogic_function(manualActuatorInput,channelsOr)
    return output
  }

  def ALUOracle(unit1TripSignals: ALUTripSignals, unit2TripSignals: ALUTripSignals,
                tempManualActuationInput: B, satManualActuatorInput:B): (B,B) = {
    val actuation_unit1_outputs = actuationLogic_function(unit1TripSignals)
    val actuation_unit2_outputs = actuationLogic_function(unit2TripSignals)
    val tempPressure_actuator_unit_output = actuatorUnit_function(
      actuation_unit1_outputs._1,
      actuation_unit2_outputs._1,
      tempManualActuationInput)
    val sat_actuator_unit_output = actuatorUnit_function(
      actuation_unit1_outputs._2,
      actuation_unit2_outputs._2,
      satManualActuatorInput)
    return (tempPressure_actuator_unit_output, sat_actuator_unit_output)
  }

  test("U1.C1 set, no trip") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    setALUInputs(
      unit1TripSignals = (T, F, F, F,    F, F, F, F,    F, F, F, F),
      unit2TripSignals = (F, F, F, F,    F, F, F, F,    F, F, F, F),
      tempManualActuatorInput = F,
      satManualActuatorInput = F)

    compute(ISZ(RunToThread("actuatorsMockThread")))

//    val TPAU_output = TPAU_tempPressA_actuator.check_concrete_outputs(F)
//    val SAU_satActuator_actuator_output = SAU_satActuator_actuator.check_concrete_outputs(F)

    TPAU_tempPressA_actuator.check_concrete_outputs(F)
    SAU_satActuator_actuator.check_concrete_outputs(F)


    //    assert(!TPAU_output)
//    assert(!SAU_satActuator_actuator_output)

  }

  test("U1.C1,C3 set, temp/press trip") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    setALUInputs(
      unit1TripSignals = (T, F, T, F, F, F, F, F, F, F, F, F),
      unit2TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F),
      tempManualActuatorInput = F,
      satManualActuatorInput = F)

    compute(ISZ(RunToThread("actuatorsMockThread")))

    //    val TPAU_output = TPAU_tempPressA_actuator.check_concrete_outputs(F)
    //    val SAU_satActuator_actuator_output = SAU_satActuator_actuator.check_concrete_outputs(F)

    TPAU_tempPressA_actuator.check_concrete_outputs(T)
    SAU_satActuator_actuator.check_concrete_outputs(F)
  }

  test("U1.C1 set, Manual trip, temp/press trip") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    setALUInputs(
      unit1TripSignals = (T, F, F, F, F, F, F, F, F, F, F, F),
      unit2TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F),
      tempManualActuatorInput = T,
      satManualActuatorInput = F)

    compute(ISZ(RunToThread("actuatorsMockThread")))

    //    val TPAU_output = TPAU_tempPressA_actuator.check_concrete_outputs(F)
    //    val SAU_satActuator_actuator_output = SAU_satActuator_actuator.check_concrete_outputs(F)

    TPAU_tempPressA_actuator.check_concrete_outputs(T)
    SAU_satActuator_actuator.check_concrete_outputs(F)
  }

  test("Sat Manual trip, sat trip") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    setALUInputs(
      unit1TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F),
      unit2TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F),
      tempManualActuatorInput = F,
      satManualActuatorInput = T)

    compute(ISZ(RunToThread("actuatorsMockThread")))

    //    val TPAU_output = TPAU_tempPressA_actuator.check_concrete_outputs(F)
    //    val SAU_satActuator_actuator_output = SAU_satActuator_actuator.check_concrete_outputs(F)

    TPAU_tempPressA_actuator.check_concrete_outputs(F)
    SAU_satActuator_actuator.check_concrete_outputs(T)
  }

  test("Oracle - Sat Manual trip, sat trip") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    val unit1TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F)
    val unit2TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F)
    val tempManualActuatorInput = F
    val satManualActuatorInput = T

    setALUInputs(
      unit1TripSignals,
      unit2TripSignals,
      tempManualActuatorInput,
      satManualActuatorInput)

    compute(ISZ(RunToThread("actuatorsMockThread")))
    
    val oracleOutputs = ALUOracle(unit1TripSignals,unit2TripSignals,tempManualActuatorInput,satManualActuatorInput)
    TPAU_tempPressA_actuator.check_concrete_outputs(oracleOutputs._1)
    SAU_satActuator_actuator.check_concrete_outputs(oracleOutputs._2)
  }

  test("Oracle Schema - Sat Manual trip, sat trip") {
    val unit1TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F)
    val unit2TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F)
    val tempManualActuatorInput = F
    val satManualActuatorInput = T

    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container: Actuation_Subsystem_Inputs_Container
      = makeInputsContainer(unit1TripSignals, unit2TripSignals, tempManualActuatorInput, satManualActuatorInput)
    assert(testClass.Actuation_Subsystem_1HP_script_schema(inject_container, testClass.sysProp_ALU_Satisfies_Functional_Oracle _))
  }


  test("Oracle Schema - Failing Case 1") {
    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container =
      Actuation_Subsystem_Inputs_Container(
        false, false, true, false, // temp   -- no trip
        true, false, false, false, // press  -- no trip
        true, false, true, true,   // sat    -- trip
        false, false, false, true, // temp   -- no trip
        true, false, false, false, // press  -- no trip
        false, true, false, true,  // sat    -- trip
        false, true)
        // system result = Actuation_Subsystem_Outputs_Container(true, true)
        // ** System is report TRUE for Temp/Press trip, when there is no trip on the inputs
    assert(testClass.Actuation_Subsystem_1HP_script_schema(inject_container, testClass.sysProp_ALU_Satisfies_Functional_Oracle _))
  }

  test("Oracle Schema - Failing Case 2") {
    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container =
      Actuation_Subsystem_Inputs_Container(
        false, true, false, false, // temp -- no trip
        false, false, false, true, // press -- no trip
        true, true, true, false,   // sat -- trip
        false, false, false, true, // temp -- no trip
        false, false, true, true,  // press -- trip
        true, false, true, true,   // sat trip
        false, false)              // no manual trips
    // system result = (false, true)  expected: true, true
    // ** System is report FALSE for Temp/Press trip, even though there is a pressure trip
    println(s"Oracle output: ${ALUOracleContainers(inject_container)}")
    assert(testClass.Actuation_Subsystem_1HP_script_schema(inject_container, testClass.sysProp_ALU_Satisfies_Functional_Oracle _))
  }

  test("Oracle Schema - Failing Case 3") {
    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container =
      Actuation_Subsystem_Inputs_Container(
        false, false, true, false,  // temp -- no trip
        false, true, false, false,  // press -- no trip
        false, false, true, true,   // sat -- trip
        false, false, false, true,  // temp -- no trip
        false, true, false, true,   // press -- trip
        false, false, false, true,  // sat -- no trip
        false, true)
    // system result = (false, true)  expected: true, true
    // ** System is report FALSE for Temp/Press trip, even though there is a pressure trip
    println(s"Oracle output: ${ALUOracleContainers(inject_container)}")
    assert(testClass.Actuation_Subsystem_1HP_script_schema(inject_container, testClass.sysProp_ALU_Satisfies_Functional_Oracle _))
  }

  test("Failing Case 3 -- in detail") {
    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container =
      Actuation_Subsystem_Inputs_Container(
        false, false, true, false, // temp -- no trip
        false, true, false, false, // press -- no trip
        false, false, true, true, // sat -- trip
        false, false, false, true, // temp -- no trip
        false, true, false, true, // press -- trip
        false, false, false, true, // sat -- no trip
        false, true)

    // run the initialization phase
    Art.initializePhase(scheduler)

    // run the intrumentation and eventControl Mock threads (two steps in the schedule)
    compute(ISZ(Sstep(2)))

    testClass.injectALUInputs(inject_container)

    compute(ISZ(RunToThread("actuatorsMockThread")))

    //    val TPAU_output = TPAU_tempPressA_actuator.check_concrete_outputs(F)
    //    val SAU_satActuator_actuator_output = SAU_satActuator_actuator.check_concrete_outputs(F)

    au1_temp_coincidenceLogic.check_concrete_outputs(F)
    au1_press_coincidenceLogic.check_concrete_outputs(F)
    au2_temp_coincidenceLogic.check_concrete_outputs(F)
    au2_press_coincidenceLogic.check_concrete_outputs(T)
    au1_tempPressTripOut_orLogic.check_concrete_outputs(F)
    au2_tempPressTripOut_orLogic.check_concrete_outputs(T)
    TPAU_tempPressA_actuator.check_concrete_outputs(T)
    SAU_satActuator_actuator.check_concrete_outputs(T)
  }

  test("Oracle Schema - Failing Case 4") {
    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container =
      Actuation_Subsystem_Inputs_Container(
        false, true, false, false, // temp -- no trip
        false, true, true, true,   // press -- trip
        true, false, false, false, // sat -- no trip
        true, false, false, true,  // temp -- trip
        false, false, false, true, // press -- no trip
        true, false, false, false, // sat -- no trip
        false, true)
    // system result = (true, false)  expected: true, true
    // ** System is report FALSE for Temp/Press trip, even though there is a pressure trip
    println(s"Oracle output: ${ALUOracleContainers(inject_container)}")
    assert(testClass.Actuation_Subsystem_1HP_script_schema(inject_container, testClass.sysProp_ALU_Satisfies_Functional_Oracle _))
  }

  test("Schema - AU1 Temp Coincidence (no trip channels true)") {
    val unit1TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F)
    val unit2TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F)
    val tempManualActuatorInput = F
    val satManualActuatorInput = F

    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container: Actuation_Subsystem_Inputs_Container
    = makeInputsContainer(unit1TripSignals, unit2TripSignals, tempManualActuatorInput, satManualActuatorInput)
    assert(testClass.Actuation_Subsystem_1HP_script_schema(inject_container, testClass.sysProp_AU1TempTrip _))
  }

  test("Schema - AU1 Temp Coincidence (first two trip channels true)") {
    val unit1TripSignals = (T, T, F, F, F, F, F, F, F, F, F, F)
    val unit2TripSignals = (F, F, F, F, F, F, F, F, F, F, F, F)
    val tempManualActuatorInput = F
    val satManualActuatorInput = F

    val testClass = new RTS.system_tests.rts1.Actuation_Subsystem_Test_wSlangCheck()
    val inject_container: Actuation_Subsystem_Inputs_Container
    = makeInputsContainer(unit1TripSignals, unit2TripSignals, tempManualActuatorInput, satManualActuatorInput)
    assert(testClass.Actuation_Subsystem_1HP_script_schema(inject_container, testClass.sysProp_AU1TempTrip _))
  }

}
