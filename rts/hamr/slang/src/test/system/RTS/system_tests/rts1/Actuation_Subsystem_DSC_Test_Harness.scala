package RTS.system_tests.rts1

import RTS._
import RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container_SlangCheck.TestConfiguration
import org.sireum._

object Actuation_Subsystem_DSC_Test_Harness extends App {

  // main generates the Jenkins build parameters string and the JSON serialized testRow information
  override def main(args: ISZ[String]): Z = {
    // Regenerate the json files and emit their locations to the console. The
    // exampleJenkinsScript.cmd will use these to get the test configurations keys
    Actuation_Subsystem_Test_wSlangCheck.genJsons(T)

    return 0
  }
}

class Actuation_Subsystem_DSC_Test_Harness
  extends Actuation_Subsystem_Test_wSlangCheck
  with Actuation_Subsystem_Inputs_Container_DSC_Test_Harness {

  override def next(): RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container = {
    val testRow = testMatrix.get(getTestId()).get
    return Actuation_Subsystem_Inputs_Container_Profile.next(testRow.profile)
  }

  override def test(o: RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container): B = {
    val testId = getTestId()
    val testRow = testMatrix.get(testId).get

    if (verbose) {
      println(genTestName(testId, testRow))
    }

    disableLogsAndGuis()

    super.beforeEach()

    if (!testRow.filter.function(o)) {

      if (verbose) {
        println(s"  Didn't pass pre state check ${o}")
      }

      DSC_RecordUnsatPre.report(toCompactJson(o))

      return T
    } else {

      val result = testRow.schema.function(o, testRow.property.function)

      this.afterEach()

      if (verbose) {
        println(s"  ${result}")
      }
      return result
    }
  }

  def getTestId(): String = {
    Os.prop("DSC_TEST_FAMILY_NAME") match {
      case Some(v) => return v
      case _ =>
        Os.env("DSC_TEST_FAMILY_NAME") match {
          case Some(v) => return v
          case _ =>
        }
    }
    halt("DSC_TEST_FAMILY_NAME not defined")
  }

  override def string: String = toString

  override def $clonable: Boolean = F

  override def $clonable_=(b: Boolean): org.sireum.$internal.MutableMarker = this

  override def $owned: Boolean = F

  override def $owned_=(b: Boolean): org.sireum.$internal.MutableMarker = this

  override def $clone: org.sireum.$internal.MutableMarker = this
}
