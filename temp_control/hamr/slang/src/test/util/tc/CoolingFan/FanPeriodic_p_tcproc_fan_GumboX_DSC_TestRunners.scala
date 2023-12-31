// #Sireum

package tc.CoolingFan

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class FanPeriodic_p_tcproc_fan_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[FanPeriodic_p_tcproc_fan_PreState_Container_P]
  with FanPeriodic_p_tcproc_fan_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibfanCmd: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): FanPeriodic_p_tcproc_fan_PreState_Container_P = {
    val api_fanCmd = ranLibfanCmd.nextCoolingFanFanCmdType()
    return FanPeriodic_p_tcproc_fan_PreState_Container_P(
      api_fanCmd
    )
  }

  override def toCompactJson(o: FanPeriodic_p_tcproc_fan_PreState_Container_P): String = {
    return tc.JSON.fromCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o, T)
  }

  override def fromJson(json: String): FanPeriodic_p_tcproc_fan_PreState_Container_P = {
    tc.JSON.toCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: FanPeriodic_p_tcproc_fan_PreState_Container_P): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        tc.DSC_RecordUnsatPre.report(tc.JSON.fromCoolingFanFanPeriodic_p_tcproc_fan_PreState_Container_P(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}
