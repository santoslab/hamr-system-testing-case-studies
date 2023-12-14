package bc.BoilerControl

import org.sireum._
import bc._
import bc.BoilerControl._
import org.sireum.Random.Impl.Xoshiro256
import org.sireum.U64._
import bc.RandomLib

// This file will not be overwritten so is safe to edit

class BoilerControl_i_bcproc_control_GumboX_Tests extends BoilerControl_i_bcproc_control_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override def verbose: B = T

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F


  var lastSeed = u64"0"

  /*
  override def freshRandomLib: RandomLib = {
    var seed = seedGen.genU64()
    var retry = 0
    while (seed == lastSeed) {
      seed = seedGen.genU64()
      retry = retry + 1
    }
    if (this.verbose && retry > 0) {
      println(s"Took ${retry} retries to generate a fresh seed value")
    }
    lastSeed = seed

    return RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seed)))
  }
  */

  // Modifying FreshRandomLib
  // Provides a more specific time value for the starting seed of the random lib value.
  // This overrides utilizes the java implementation for populating that value.
  // Implementation for the override provided by Jason Belt, comments by Gage Hawbaker.
  override def freshRandomLib: RandomLib = {
    //Random
    val rand = new java.util.Random()
    //Set the seed for Random
    rand.setSeed(rand.nextLong())
    // Seed
    var seed = U64(rand.nextLong())
    // False Retry
    var retry = 0
    // Make sure the seeds are different, and retry is the number of tries.
    while (seed == lastSeed) {
      // Change seed
      seed = U64(rand.nextLong())
      //increment retry
      retry = retry + 1
    }
    // If we are in the verbose output mode, and it took at least one retry to have different seeds.
    if (this.verbose && retry > 0) {
      //Report that
      println(s"Took ${retry} retries to generate a fresh seed value")
    }
    // Set lastSeed to the seed value.
    lastSeed = seed
    //
    return RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seed)))
  }

  // profiles that will be used for the initialise tests
  override def getInitialiseProfiles: MSZ[BoilerControl_i_bcproc_control_Profile] = {
    return MSZ()//MSZ(getDefaultInitialiseProfile)
  }

  // profiles that will be used to generate the incoming port values
  override def getProfiles_P: MSZ[BoilerControl_i_bcproc_control_Profile_P] = {
    //return MSZ(getDefaultProfile_P)
    return MSZ() // return empty as we only want profiles that include state variables
  }

  def c32(low: Option[F32], high: Option[F32], r:RandomLib): RandomLib = {
    r.set_Config_F32(r.get_Config_F32(low = low, high = high))
    return r
  }

  override def nextwL(profile: BoilerControl_i_bcproc_control_Profile_PS): Option[BoilerControl_i_bcproc_control_PreState_Container_PS] = {
    try {
      val In_C = c32(low = Some(1000.0f), high = Some(1000.0f), profile.In_C).nextF32()

      val In_M2 = c32(low = Some(0.1f), high = Some(In_C - 0.1f), profile.In_M2).nextF32()

      val In_N2 = c32(low = Some(0.1f), high = Some(In_M2 - 0.1f), profile.In_N2).nextF32()

      val In_N1 = c32(low = Some(0.1f), high = Some(In_N2 - 0.1f), profile.In_N1).nextF32()

      val In_M1 = c32(low = Some(0.1f), high = Some(In_N1 - 0.1f), profile.In_M1).nextF32()

      val In_p0 = c32(low = Some(0.0f), high = Some(1f), profile.In_p0).nextF32()

      val In_p1 = c32(low = Some(0.0f), high = Some(1f), profile.In_p1).nextF32()

      val In_p2 = c32(low = Some(0.0f), high = Some(1f), profile.In_p2).nextF32()

      val In_p3 = c32(low = Some(0.0f), high = Some(1f), profile.In_p3).nextF32()

      val In_U1 = c32(low = Some(0.1f), high = Some(20f), profile.In_U1).nextF32()

      val api_steamRate = c32(low = Some(-1f), high = Some(50f), profile.api_steamRate).nextOptionF32() //profile.api_steamRate.nextOptionF32()

      val api_waterLevel = c32(low = Some(-1f), high = Some(1001f), profile.api_steamRate).nextOptionF32()


      val In_P = profile.In_P.nextF32()
      val In_U2 = profile.In_U2.nextF32()
      val In_W = profile.In_W.nextF32()
      val In_hasBoilerSentWaiting = profile.In_hasBoilerSentWaiting.nextB()
      val In_isPump0Failing = profile.In_isPump0Failing.nextB()
      val In_isPump1Failing = profile.In_isPump1Failing.nextB()
      val In_isPump2Failing = profile.In_isPump2Failing.nextB()
      val In_isPump3Failing = profile.In_isPump3Failing.nextB()
      val In_isSteamMeterFailing = profile.In_isSteamMeterFailing.nextB()
      val In_isWaterMeterFailing = profile.In_isWaterMeterFailing.nextB()
      val In_mode = profile.In_mode.nextBoilerControlOpModeType()
      val In_q = profile.In_q.nextF32()
      val In_qa1 = profile.In_qa1.nextF32()
      val In_qa2 = profile.In_qa2.nextF32()
      val In_qc1 = profile.In_qc1.nextF32()
      val In_qc2 = profile.In_qc2.nextF32()
      val In_shouldUpdatePumps = profile.In_shouldUpdatePumps.nextB()
      val In_transmissionFailure = profile.In_transmissionFailure.nextB()
      val In_v_steamRate = profile.In_v_steamRate.nextF32()
      val api_boilerReady = profile.api_boilerReady.nextOption_artEmpty()
      val api_boilerWaiting = profile.api_boilerWaiting.nextOption_artEmpty()
      val api_levelFailAck = profile.api_levelFailAck.nextOption_artEmpty()
      val api_levelRepair = profile.api_levelRepair.nextOption_artEmpty()
      val api_pumpControlFailAck0 = profile.api_pumpControlFailAck0.nextOption_artEmpty()
      val api_pumpControlFailAck1 = profile.api_pumpControlFailAck1.nextOption_artEmpty()
      val api_pumpControlFailAck2 = profile.api_pumpControlFailAck2.nextOption_artEmpty()
      val api_pumpControlFailAck3 = profile.api_pumpControlFailAck3.nextOption_artEmpty()
      val api_pumpControlReady0 = profile.api_pumpControlReady0.nextOption_artEmpty()
      val api_pumpControlReady1 = profile.api_pumpControlReady1.nextOption_artEmpty()
      val api_pumpControlReady2 = profile.api_pumpControlReady2.nextOption_artEmpty()
      val api_pumpControlReady3 = profile.api_pumpControlReady3.nextOption_artEmpty()
      val api_pumpControlRepair0 = profile.api_pumpControlRepair0.nextOption_artEmpty()
      val api_pumpControlRepair1 = profile.api_pumpControlRepair1.nextOption_artEmpty()
      val api_pumpControlRepair2 = profile.api_pumpControlRepair2.nextOption_artEmpty()
      val api_pumpControlRepair3 = profile.api_pumpControlRepair3.nextOption_artEmpty()
      val api_pumpFailAck0 = profile.api_pumpFailAck0.nextOption_artEmpty()
      val api_pumpFailAck1 = profile.api_pumpFailAck1.nextOption_artEmpty()
      val api_pumpFailAck2 = profile.api_pumpFailAck2.nextOption_artEmpty()
      val api_pumpFailAck3 = profile.api_pumpFailAck3.nextOption_artEmpty()
      val api_pumpRepair0 = profile.api_pumpRepair0.nextOption_artEmpty()
      val api_pumpRepair1 = profile.api_pumpRepair1.nextOption_artEmpty()
      val api_pumpRepair2 = profile.api_pumpRepair2.nextOption_artEmpty()
      val api_pumpRepair3 = profile.api_pumpRepair3.nextOption_artEmpty()
      val api_steamFailAck = profile.api_steamFailAck.nextOption_artEmpty()
      val api_steamMeterReady = profile.api_steamMeterReady.nextOption_artEmpty()
      val api_steamRepair = profile.api_steamRepair.nextOption_artEmpty()
      val api_stop = profile.api_stop.nextOption_artEmpty()
      val api_waterMeterReady = profile.api_waterMeterReady.nextOption_artEmpty()
      val api_pumpFlow0 = profile.api_pumpFlow0.nextOptionB()
      val api_pumpFlow1 = profile.api_pumpFlow1.nextOptionB()
      val api_pumpFlow2 = profile.api_pumpFlow2.nextOptionB()
      val api_pumpFlow3 = profile.api_pumpFlow3.nextOptionB()
      val api_pumpOpen0 = profile.api_pumpOpen0.nextOptionB()
      val api_pumpOpen1 = profile.api_pumpOpen1.nextOptionB()
      val api_pumpOpen2 = profile.api_pumpOpen2.nextOptionB()
      val api_pumpOpen3 = profile.api_pumpOpen3.nextOptionB()

      return Some(BoilerControl_i_bcproc_control_PreState_Container_PS(In_C, In_M1, In_M2, In_N1, In_N2, In_P, In_U1, In_U2, In_W, In_hasBoilerSentWaiting, In_isPump0Failing, In_isPump1Failing, In_isPump2Failing, In_isPump3Failing, In_isSteamMeterFailing, In_isWaterMeterFailing, In_mode, In_p0, In_p1, In_p2, In_p3, In_q, In_qa1, In_qa2, In_qc1, In_qc2, In_shouldUpdatePumps, In_transmissionFailure, In_v_steamRate, api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel))
    } catch {
      case e: AssertionError =>
        // SlangCheck was unable to satisfy a datatype's filter
        return None()
    }
  }

  // profiles that will be used to generate the incoming port values
  // and the pre-state values of the state variables
  override def getProfiles_PS: MSZ[BoilerControl_i_bcproc_control_Profile_PS] = {

    var profile = getDefaultProfile_PS // Give me a profile
    var initOnly = getDefaultProfile_PS(name = "Init Mode Only", numTests = 1000)
    var normOnly = getDefaultProfile_PS(name = "Norm Mode Only", numTests = 1000)
    var degrOnly = getDefaultProfile_PS(name = "Degr Mode Only", numTests = 1000)
    var rescOnly = getDefaultProfile_PS(name = "Resc Mode Only", numTests = 1000)
    var stopOnly = getDefaultProfile_PS(name = "Exit Mode Only", numTests = 1000)
    //profile.numTests = 1000
    profile.In_C.set_Config_F32(profile.In_C.get_Config_F32(
      low = Some(1000.0f), high = Some(1000.0f)
    ))
    // SETTING THE OPMODE TO SPECIFIC VALUE
    /*
    profile.In_mode.set_Config_BoilerControlOpModeType( //Changing the random lib
      profile.In_mode.get_Config_BoilerControlOpModeType( // What we are changing in the lib
        filter = m => m == BoilerControl.OpMode.Norm // Expression/Filter for what it is.
      )
    )
    */
    initOnly.In_mode.set_Config_BoilerControlOpModeType(
      initOnly.In_mode.get_Config_BoilerControlOpModeType(
        filter = m => m == BoilerControl.OpMode.Init
      )
    )
    normOnly.In_mode.set_Config_BoilerControlOpModeType(
      normOnly.In_mode.get_Config_BoilerControlOpModeType(
        filter = m => m == BoilerControl.OpMode.Norm
      )
    )
    degrOnly.In_mode.set_Config_BoilerControlOpModeType(
      degrOnly.In_mode.get_Config_BoilerControlOpModeType(
        filter = m => m == BoilerControl.OpMode.Degr
      )
    )
    rescOnly.In_mode.set_Config_BoilerControlOpModeType(
      rescOnly.In_mode.get_Config_BoilerControlOpModeType(
        filter = m => m == BoilerControl.OpMode.Resc
      )
    )
    stopOnly.In_mode.set_Config_BoilerControlOpModeType(
      stopOnly.In_mode.get_Config_BoilerControlOpModeType(
        filter = m => m == BoilerControl.OpMode.Stop
      )
    )
    /*
    profile.api_stop.set_Config_Option_artEmpty(profile.api_stop.get_Config_Option_artEmpty(
      filter = anEvent => anEvent.nonEmpty
    ))
    profile = profile(name = "StopAlways")

    var profile2 = getDefaultProfile_PS // Give me a profile
    profile2.In_mode.set_Config_BoilerControlOpModeType( //Changing the random lib
      profile2.In_mode.get_Config_BoilerControlOpModeType( // What we are changing in the lib
        filter = m => m == BoilerControl.OpMode.Init // Expression/Filter for what it is.
      )
    )
    profile2.api_stop.set_Config_Option_artEmpty(profile2.api_stop.get_Config_Option_artEmpty(
      filter = anEvent => anEvent.isEmpty
    ))
    profile2 = profile2(name = "NeverStop")
    */
    profile = profile (numTests = 3000)
    return MSZ(profile,initOnly,normOnly,degrOnly,rescOnly,stopOnly)//, profile2)
  }
}