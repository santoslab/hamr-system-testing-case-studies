package RTS.system_tests.rts1

import org.sireum._
import RTS._
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

// Distributed SlangCheck Test Harness for RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container

@msig trait Actuation_Subsystem_Inputs_Container_DSC_Test_Harness
  extends Random.Gen.TestRunner[RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container] {

  override def toCompactJson(o: RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container): String = {
    return RTS.JSON.fromsystem_testsrts1Actuation_Subsystem_Inputs_Container(o, T)
  }

  override def fromJson(json: String): RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container = {
    RTS.JSON.tosystem_testsrts1Actuation_Subsystem_Inputs_Container(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  // you'll need to provide implementations for the following:

  // override def next(): RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container = {}

  // override def test(o: RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container): B = { }
}
