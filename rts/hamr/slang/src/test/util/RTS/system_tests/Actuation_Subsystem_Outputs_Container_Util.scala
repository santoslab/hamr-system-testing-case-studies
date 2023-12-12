package RTS.system_tests

import org.sireum._
import RTS._
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Actuation_Subsystem_Outputs_Container_Util {

  def getSeed: U64 = {
    val rand = new java.util.Random()
    rand.setSeed(rand.nextLong())
    return U64(rand.nextLong())
  }

  def freshRandomLib: RandomLib = {
    return RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(getSeed)))
  }
}
