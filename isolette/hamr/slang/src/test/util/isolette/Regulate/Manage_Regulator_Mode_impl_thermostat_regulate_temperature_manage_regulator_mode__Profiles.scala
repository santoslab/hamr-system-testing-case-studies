// #Sireum

package isolette.Regulate

import org.sireum._
import isolette.RandomLib

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Profile for initialise entrypoint
@record class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Profile (
  val name: String,
  val numTests: Z //number of tests to generate
)

// Profile with generators for incoming ports
@record class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Profile_P(
  val name: String,
  val numTests: Z, // number of tests to generate
  var numTestVectorGenRetries: Z, // number of test vector generation retries
  var api_current_tempWstatus: RandomLib,
  var api_interface_failure: RandomLib,
  var api_internal_failure: RandomLib)

// Profile with generators for state variables and incoming ports
@record class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Profile_PS(
  val name: String,
  val numTests: Z, // number of tests to generate
  var numTestVectorGenRetries: Z, // number of test vector generation retries
  var In_lastRegulatorMode: RandomLib,
  var api_current_tempWstatus: RandomLib,
  var api_interface_failure: RandomLib,
  var api_internal_failure: RandomLib)
