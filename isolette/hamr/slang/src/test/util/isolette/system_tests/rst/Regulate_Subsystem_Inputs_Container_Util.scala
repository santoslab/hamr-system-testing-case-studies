// #Sireum

package isolette.system_tests.rst

import org.sireum._
import isolette._
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Regulate_Subsystem_Inputs_Container_Util {

  def freshRandomLib: RandomLib = {
    return RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(Regulate_Subsystem_Inputs_Container_UtilI.getSeed)))
  }
}

@ext object Regulate_Subsystem_Inputs_Container_UtilI {
  def getSeed: U64 = $
}
