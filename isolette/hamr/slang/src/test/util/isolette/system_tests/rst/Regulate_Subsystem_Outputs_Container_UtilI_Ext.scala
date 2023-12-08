package isolette.system_tests.rst

import org.sireum._
import isolette._

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Regulate_Subsystem_Outputs_Container_UtilI_Ext {
  def getSeed: U64 = {
    val rand = new java.util.Random()
    rand.setSeed(rand.nextLong())
    return U64(rand.nextLong())
  }
}
