// #Sireum

package RTS.system_tests.rts1

import org.sireum._
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

object Functional_Oracles {

  type ALUTripSignals = // 12-tuple of booleans
    (B, B, B, B,
      B, B, B, B,
      B, B, B, B)

  def injectALUInputs(unit1TripSignals: ALUTripSignals, unit2TripSignals: ALUTripSignals, tempManualActuatorInput: B, satManualActuatorInput: B): Unit = {
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

  def actuationLogic_function(tripSignals: ALUTripSignals): (B, B) = {
    val tempCoincidenceOutput = coincidenceLogic_function(tripSignals._1, tripSignals._2, tripSignals._3, tripSignals._4)
    val pressureCoincidenceOutput = coincidenceLogic_function(tripSignals._5, tripSignals._6, tripSignals._7, tripSignals._8)
    val satCoincidenceOutput = coincidenceLogic_function(tripSignals._9, tripSignals._10, tripSignals._11, tripSignals._12)
    val tempPressureTripOutput = orLogic_function(tempCoincidenceOutput, pressureCoincidenceOutput)
    return (tempPressureTripOutput, satCoincidenceOutput)
  }

  def actuatorUnit_function(channel1: B, channel2: B, manualActuatorInput: B): B = {
    val channelsOr = orLogic_function(channel1, channel2)
    val output = orLogic_function(manualActuatorInput, channelsOr)
    return output
  }

  def ALUOracle(unit1TripSignals: ALUTripSignals, unit2TripSignals: ALUTripSignals,
                tempManualActuationInput: B, satManualActuatorInput: B): (B, B) = {
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

  def ALUOracleContainers(inputs_container: Actuation_Subsystem_Inputs_Container): Actuation_Subsystem_Outputs_Container = {
    val unit1TripSignals: ALUTripSignals = (
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
      inputs_container.au2_temp_coincidenceLogic_channel1,
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

    val oracle_result = ALUOracle(unit1TripSignals, unit2TripSignals, tempManualActuationInput, satManualActuationInput)
    return Actuation_Subsystem_Outputs_Container(oracle_result._1, oracle_result._2)
  }
}

