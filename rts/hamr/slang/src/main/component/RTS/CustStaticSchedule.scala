// #Sireum
package RTS

import org.sireum._

object CustStaticSchedule {
  val threadNickNames: Map[String, art.Art.BridgeId] = Map(
    ISZ(
      "instrumentationMockThread" ~> Arch.RTS_i_Instance_instrumentationMock_instrumentationMockThread.id,
      "eventControlMockThread" ~> Arch.RTS_i_Instance_eventControlMock_eventControlMockThread.id,
      "actuatorsMockThread" ~> Arch.RTS_i_Instance_actuatorsMock_actuatorsMockThread.id,

      "au1_temp_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.id,
      "au1_press_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.id,
      "au1_satLogic_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.id,
      "au1_tempPressTripOut_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.id,

      "au2_temp_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.id,
      "au2_press_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.id,
      "au2_sat_coincidenceLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.id,
      "au2_tempPressTripOut_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic.id,

      "TPAU_actTempPA_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic.id,
      "TPAU_tempPressA_actuator" ~> Arch.RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator.id,

      "SAU_actSatActuator_orLogic" ~> Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic.id,
      "SAU_satActuator_actuator" ~> Arch.RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator.id)
  )

  var revThreadNickNames: Map[art.Art.BridgeId, String] = Map.empty[art.Art.BridgeId, String] ++ (for (e <- threadNickNames.entries) yield e._2 ~> e._1)
}
