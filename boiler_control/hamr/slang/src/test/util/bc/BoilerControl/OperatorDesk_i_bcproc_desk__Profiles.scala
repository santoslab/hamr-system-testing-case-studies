// #Sireum

package bc.BoilerControl

import org.sireum._
import bc.RandomLib

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Profile for initialise entrypoint
@record class OperatorDesk_i_bcproc_desk_Profile (
  val name: String,
  val numTests: Z //number of tests to generate
)

// Profile with generators for incoming ports
@record class OperatorDesk_i_bcproc_desk_Profile_P(
  val name: String,
  val numTests: Z, // number of tests to generate
  var numTestVectorGenRetries: Z, // number of test vector generation retries
  var api_levelFail: RandomLib,
  var api_levelRepairAck: RandomLib,
  var api_pumpControlFail0: RandomLib,
  var api_pumpControlFail1: RandomLib,
  var api_pumpControlFail2: RandomLib,
  var api_pumpControlFail3: RandomLib,
  var api_pumpControlRepairAck0: RandomLib,
  var api_pumpControlRepairAck1: RandomLib,
  var api_pumpControlRepairAck2: RandomLib,
  var api_pumpControlRepairAck3: RandomLib,
  var api_pumpFail0: RandomLib,
  var api_pumpFail1: RandomLib,
  var api_pumpFail2: RandomLib,
  var api_pumpFail3: RandomLib,
  var api_pumpRepairAck0: RandomLib,
  var api_pumpRepairAck1: RandomLib,
  var api_pumpRepairAck2: RandomLib,
  var api_pumpRepairAck3: RandomLib,
  var api_steamFail: RandomLib,
  var api_steamRepairAck: RandomLib,
  var api_opMode: RandomLib)

// Profile with generators for state variables and incoming ports
@record class OperatorDesk_i_bcproc_desk_Profile_PS(
  val name: String,
  val numTests: Z, // number of tests to generate
  var numTestVectorGenRetries: Z, // number of test vector generation retries
  var In_isLevelBroken: RandomLib,
  var In_isPumpBroken0: RandomLib,
  var In_isPumpBroken1: RandomLib,
  var In_isPumpBroken2: RandomLib,
  var In_isPumpBroken3: RandomLib,
  var In_isPumpControlBroken0: RandomLib,
  var In_isPumpControlBroken1: RandomLib,
  var In_isPumpControlBroken2: RandomLib,
  var In_isPumpControlBroken3: RandomLib,
  var In_isSteamBroken: RandomLib,
  var api_levelFail: RandomLib,
  var api_levelRepairAck: RandomLib,
  var api_pumpControlFail0: RandomLib,
  var api_pumpControlFail1: RandomLib,
  var api_pumpControlFail2: RandomLib,
  var api_pumpControlFail3: RandomLib,
  var api_pumpControlRepairAck0: RandomLib,
  var api_pumpControlRepairAck1: RandomLib,
  var api_pumpControlRepairAck2: RandomLib,
  var api_pumpControlRepairAck3: RandomLib,
  var api_pumpFail0: RandomLib,
  var api_pumpFail1: RandomLib,
  var api_pumpFail2: RandomLib,
  var api_pumpFail3: RandomLib,
  var api_pumpRepairAck0: RandomLib,
  var api_pumpRepairAck1: RandomLib,
  var api_pumpRepairAck2: RandomLib,
  var api_pumpRepairAck3: RandomLib,
  var api_steamFail: RandomLib,
  var api_steamRepairAck: RandomLib,
  var api_opMode: RandomLib)
