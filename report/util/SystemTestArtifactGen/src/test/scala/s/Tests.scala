package s

import org.sireum._
import org.sireum.message.Reporter

class Tests extends org.sireum.test.TestSuite {

  "rts" in {
    val root: Os.Path = Os.path(implicitly[sourcecode.File].value).up.up.up.up.up.up.up.up / "rts" / "hamr" / "slang"

    println(root)

    val containers: ISZ[String] = ISZ(
      "src/main/util/RTS/system_tests/rts1/Containers.scala"
    )

    val reporter = Reporter.create
    val result = s.SystemTestArtifactGen.run(root, containers, reporter)

    reporter.printMessages()

    assert(result == 0 && !reporter.hasError)
  }

  "isolette" in {
    val root: Os.Path = Os.path(implicitly[sourcecode.File].value).up.up.up.up.up.up.up.up / "isolette" / "hamr" / "slang"

    println(root)

    val containers: ISZ[String] = ISZ(
      "src/main/util/isolette/system_tests/rst/Regulate_Subsystem_Containers.scala",
      "src/main/util/isolette/system_tests/monitor1/Monitor_Subsystem_Containers.scala"
    )

    val reporter = Reporter.create
    val result = s.SystemTestArtifactGen.run(root, containers, reporter)

    reporter.printMessages()

    assert(result == 0 && !reporter.hasError)
  }

  "boiler_control" in {
    val root: Os.Path = Os.path(implicitly[sourcecode.File].value).up.up.up.up.up.up.up.up / "boiler_control" / "hamr" / "slang"

    println(root)

    val containers: ISZ[String] = ISZ(
      // TODO
    )

    val reporter = Reporter.create
    val result = s.SystemTestArtifactGen.run(root, containers, reporter)

    reporter.printMessages()

    assert(result == 0 && !reporter.hasError)
  }
}
