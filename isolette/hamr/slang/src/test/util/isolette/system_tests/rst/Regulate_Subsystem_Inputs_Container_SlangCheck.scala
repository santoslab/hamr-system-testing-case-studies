package isolette.system_tests.rst

import org.sireum._
import isolette._

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Regulate_Subsystem_Inputs_Container_SlangCheck {

  case class NameProvider(name: String,
                          function: (Any, Any) => B)

  case class TestRow(testMethod: NameProvider,
                     testDescription: String,
                     profile: Regulate_Subsystem_Inputs_Container_Profile,
                     preStateCheck: (Any => B),
                     property: NameProvider)
}

trait Regulate_Subsystem_Inputs_Container_SlangCheck
  extends SystemTestSuite {


  def next(profile: Regulate_Subsystem_Inputs_Container_Profile): Option[Regulate_Subsystem_Inputs_Container] = {
    return Regulate_Subsystem_Inputs_Container_Profile.nextH(profile)
  }

  def freshRandomLib: RandomLib = {
    return Regulate_Subsystem_Inputs_Container_Util.freshRandomLib
  }

  def getProfiles: MSZ[Regulate_Subsystem_Inputs_Container_Profile] = {
    return MSZ(getDefaultProfile)
  }

  //------------------------------------------------
  //  Test Vector Profiles
  //
  //   ..eventually auto-generated from a descriptor
  //     of injection vector
  //------------------------------------------------

  def getDefaultProfile: Regulate_Subsystem_Inputs_Container_Profile = {
    return Regulate_Subsystem_Inputs_Container_Profile.getDefaultProfile
  }

  def disableLogsAndGuis(): Unit = {

    // disable the various guis
    System.setProperty("java.awt.headless", "true")

    // suppress ART's log stream
    art.ArtNative_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
      override def write(b: Int): Unit = {}
    })

    // suppress the static scheduler's log stream
    art.scheduling.static.StaticSchedulerIO_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
      override def write(b: Int): Unit = {}
    })
  }
}
