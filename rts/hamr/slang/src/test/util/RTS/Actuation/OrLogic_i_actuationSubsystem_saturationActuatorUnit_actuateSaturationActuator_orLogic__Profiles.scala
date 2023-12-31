// #Sireum

package RTS.Actuation

import org.sireum._
import RTS.RandomLib

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Profile for initialise entrypoint
@record class OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile (
  val name: String,
  val numTests: Z //number of tests to generate
)

// Profile with generators for incoming ports
@record class OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_P(
  val name: String,
  val numTests: Z, // number of tests to generate
  var numTestVectorGenRetries: Z, // number of test vector generation retries
  var api_channel1: RandomLib,
  var api_channel2: RandomLib)

// Profile with generators for state variables and incoming ports
@record class OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_PS(
  val name: String,
  val numTests: Z, // number of tests to generate
  var numTestVectorGenRetries: Z, // number of test vector generation retries
  var api_channel1: RandomLib,
  var api_channel2: RandomLib)
