// #Sireum
package RTS

import org.sireum._
import art.scheduling.static.Schedule.{DSchedule, DScheduleSpec}
import art.scheduling.static._

object CustStaticSchedule {
  val threadNickNames: Map[String, art.Art.BridgeId] = Map(
    ISZ(
      // Mock subsystems
      "instrumentationMockThread" ~> Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.id,
      "eventControlMockThread" ~> Arch.RTS_i_Instance_eventControlMock_eventControlMockThread.id,
      "actuatorsMockThread" ~> Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread.id,

      // Actuation Unit 1 threads
      "au1_temp_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.id,
      "au1_press_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.id,
      "au1_satLogic_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.id,
      "au1_tempPressTripOut_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.id,

      // Actuation Unit 2 threads
      "au2_temp_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.id,
      "au2_press_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.id,
      "au2_sat_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.id,
      "au2_tempPressTripOut_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic.id,

       // Temperature/Pressure actuation
      "TPAU_actTempPA_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic.id,
      "TPAU_tempPressA_actuator" ~> Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator.id,

      // Saturation actuation
      "SAU_actSatActuator_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic.id,
      "SAU_satActuator_actuator" ~> Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator.id)
  )

  var revThreadNickNames: Map[art.Art.BridgeId, String] = Map.empty[art.Art.BridgeId, String] ++ (for (e <- threadNickNames.entries) yield e._2 ~> e._1)

  val domainToBridgeIdMap: ISZ[art.Art.BridgeId] = ISZ(
    // S e n s i n g

    // simulated instrumentation (sensor) inputs
    /* domain 0 */ Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.id,
    // simulated human control inputs
    /* domain 1 */ Arch.RTS_i_Instance_eventControlMock_eventControlMockThread.id,

    // A c t u a t i o n   -- the actuation logic units below are independent, so their ordering could be switched

    // actuation unit 1
    //  ... the following three components are independent and could be scheduled in any order
    /* domain 2 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.id,
    /* domain 3 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.id,
    /* domain 4 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.id,
    //  ... the following component performs an "Or" on the outputs of the Temperature and Pressure Logic
    /* domain 5 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.id,

    // actuation unit 2
    //  ... the following three components are independent and could be scheduled in any order
    /* domain 6 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.id,
    /* domain 7 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.id,
    /* domain 8 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.id,
    //  ... the following component performs an "Or" on the outputs of the Temperature and Pressure Logic
    /* domain 9 */ Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic.id,

    // C o m b i n i n g  O u t p u t s
    // ... the following two components combine the outputs of the temperature and pressure trip signals from
    //  both Unit 1 and Unit 2, and then the manual override (in the second component)
    /* domain 10 */ Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic.id,
    /* domain 11 */ Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator.id,
    // ... the following two components combine the outputs of the saturation trip signals from
    //  both Unit 1 and Unit 2, and then the manual override (in the second component)
    /* domain 12 */ Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic.id,
    /* domain 13 */ Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator.id,

    // A c t u a t o r    C o n t r o l
    /* domain 14 */ Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread.id
  )

  val framePeriod: Z = 1000
  val numComponents: Z = Arch.ad.components.size
  val maxExecutionTime: Z = numComponents / framePeriod

  // defaultStaticSchedule represents the component dispatch order
  val staticSchedule: DScheduleSpec = DScheduleSpec(0, 0, DSchedule(ISZ(
    Schedule.Slot(0, maxExecutionTime),
    Schedule.Slot(1, maxExecutionTime),
    Schedule.Slot(2, maxExecutionTime),
    Schedule.Slot(3, maxExecutionTime),
    Schedule.Slot(4, maxExecutionTime),
    Schedule.Slot(5, maxExecutionTime),
    Schedule.Slot(6, maxExecutionTime),
    Schedule.Slot(7, maxExecutionTime),
    Schedule.Slot(8, maxExecutionTime),
    Schedule.Slot(9, maxExecutionTime),
    Schedule.Slot(10, maxExecutionTime),
    Schedule.Slot(11, maxExecutionTime),
    Schedule.Slot(12, maxExecutionTime),
    Schedule.Slot(13, maxExecutionTime),
    Schedule.Slot(14, maxExecutionTime)
  )))

}
