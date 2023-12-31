package RTS.system_tests.rts1

import RTS._
import RTS.system_tests.rts1.Actuation_Subsystem_Inputs_Container_SlangCheck.TestConfiguration
import org.sireum._

object Actuation_Subsystem_DSC_Test_Harness extends App {

  // main generates the Jenkins build parameters string and the JSON serialized testRow information
  override def main(args: ISZ[String]): Z = {
    val projectName = "RTS"

    var args: ISZ[(String, String)] = ISZ()

    args = args :+ ("DSC_TIMEOUT", s"$$DSC_TIMEOUT")

    args = args :+ ("DSC_PROJECT_NAME", projectName)

    val instance = new Actuation_Subsystem_DSC_Test_Harness()

    val runnerClassName = ops.StringOps(instance.getClass.getName).replaceAllLiterally("$", "")
    val runnerSimpleName = ops.StringOps(instance.getClass.getSimpleName).replaceAllLiterally("$", "")

    args = args :+ ("DSC_RUNNER_SIMPLE_NAME", runnerSimpleName)
    args = args :+ ("DSC_RUNNER_CLASS_NAME", runnerClassName)

    val families: ISZ[(String, TestConfiguration)] = instance.testMatrix.entries

    for (e <- families) {
      val familyName = e._1

      assert (!ops.StringOps(familyName).contains(" "), s"keys cannot contain spaces: $familyName")

      val fargs = args :+ ("DSC_TEST_FAMILY_NAME", familyName)

      val data = for(f <- fargs) yield s"--data ${f._1}=${f._2}"
      val command = st"${(data, " ")}"

      println(command.render)
      println(instance.genTestNameJson(e._1, e._2))
    }
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
