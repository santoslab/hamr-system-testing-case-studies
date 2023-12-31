// #Sireum

package bc.BoilerControl

import org.sireum._
import bc.GumboXUtil.GumboXResult
import bc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class SteamMeter_i_bcproc_steamMeter_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[SteamMeter_i_bcproc_steamMeter_PreState_Container_P]
  with SteamMeter_i_bcproc_steamMeter_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibprogramReady: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
    val api_programReady = ranLibprogramReady.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    return SteamMeter_i_bcproc_steamMeter_PreState_Container_P(
      api_programReady, api_opMode
    )
  }

  override def toCompactJson(o: SteamMeter_i_bcproc_steamMeter_PreState_Container_P): String = {
    return bc.JSON.fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o, T)
  }

  override def fromJson(json: String): SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
    bc.JSON.toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: SteamMeter_i_bcproc_steamMeter_PreState_Container_P): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

@record class SteamMeter_i_bcproc_steamMeter_GumboX_DSC_TestRunnerwL
  extends Random.Gen.TestRunner[SteamMeter_i_bcproc_steamMeter_PreState_Container_PS]
  with SteamMeter_i_bcproc_steamMeter_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcomputedRate: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibvolume: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibprogramReady: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
    val In_computedRate = ranLibcomputedRate.nextF32()
    val In_volume = ranLibvolume.nextF32()
    val api_programReady = ranLibprogramReady.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    return SteamMeter_i_bcproc_steamMeter_PreState_Container_PS(
      In_computedRate, In_volume, api_programReady, api_opMode
    )
  }

  override def toCompactJson(o: SteamMeter_i_bcproc_steamMeter_PreState_Container_PS): String = {
    return bc.JSON.fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o, T)
  }

  override def fromJson(json: String): SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
    bc.JSON.toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: SteamMeter_i_bcproc_steamMeter_PreState_Container_PS): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBwLV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}
