package isolette.system_tests.rst

import org.sireum._
import art.scheduling.static._
import art.Art
import isolette._
import isolette.system_tests.rst.Regulate_Subsystem_Inputs_Container_SlangCheck.{NameProvider1, NameProvider2, TestConfiguration}
import scala.language.implicitConversions

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

class Example_Regulate_Subsystem_Inputs_Container_Test_wSlangCheck
  extends Regulate_Subsystem_Inputs_Container_SlangCheck {

  //===========================================================
  //  S c h e d u l a r     and    S t e p p e r     Configuration
  //===========================================================

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
  //var scheduler: StaticScheduler = Schedulers.getStaticSchedulerH(MNone())
  var scheduler: StaticScheduler = Schedulers.getStaticScheduler(
    Schedulers.defaultStaticSchedule,
    Schedulers.defaultDomainToBridgeIdMap,
    Schedulers.threadNickNames,
    ISZCommandProvider(ISZ()))

  def compute(isz: ISZ[Command]): Unit = {
    scheduler = scheduler(commandProvider = ISZCommandProvider(isz :+ Stop()))

    Art.computePhase(scheduler)
  }

  override def beforeEach(): Unit = {

    // uncomment the following to disable the various guis and to suppress the log streams
    //disableLogsAndGuis()

    super.beforeEach()
  }

  //===========================================================
  //  S l a n g   C h e c k    Infrastructure
  //===========================================================

  val maxTests = 100
  var verbose: B = T

  val testMatrix: Map[String, TestConfiguration] = Map.empty ++ ISZ(
    "testFamilyName" ~> TestConfiguration(
      description = "test-description",
      schema = NameProvider2("Schema-Name", (input_container: Any, property_function: Any) => T),
      profile = getDefaultProfile,
      filter = examplePreStateContainerFilter _,
      property = NameProvider2("Property-Name", (input_container: Any, output_container: Any) => T),
      components = ISZ()
    )
  )

  for (testRow <- testMatrix.entries) {
    run(testRow._1, testRow._2)
  }

  def genTestName(testConfigurationName: String, testRow: TestConfiguration): String = {
    return s"${testConfigurationName}: ${testRow.schema.name}: ${testRow.property.name}: ${testRow.profile.name}: ${testRow.filter.name}"
  }

  def genTestNameJson(testConfigurationName: String, testRow: TestConfiguration): String = {
    @strictpure def p(str: String): ST = Json.Printer.printString(str)
    val componentsx = st"${(testRow.components, ",")}".render
    return st"""{"testConfigurationName" : ${p(testConfigurationName)}, "description" : ${p(testRow.description)}, "schema": ${p(testRow.schema.name)}, "property" : ${p(testRow.property.name)}, "profile" : ${p(testRow.profile.name)}, "filter" : ${p(testRow.filter.name)}, "components" : ${p(componentsx)}}""".render
  }

  def run(testFamilyName: String, testRow: TestConfiguration): Unit = {

    for (i <- 0 until maxTests) {
      val testName = s"${genTestName(testFamilyName, testRow)}_$i"
      this.registerTest(testName) {
        var retry: B = T
        var j: Z = 0

        while (j < testRow.profile.numTestVectorGenRetries && retry) {
          if (verbose && j > 0) {
            println(s"Retry $j:")
          }

          next(testRow.profile) match {
            case Some(container) =>
              if (!testRow.filter.function(container)) {
                // retry
              } else {
                assert(testRow.schema.function(container, testRow.property.function))
                retry = F
              }
            case _ =>
          }
          j = j + 1
        }
      }
    }
  }

  // a pre-state container filter could prove useful/necessary in order to
  // ensure that the values in the container will satisfy the assume/requires clause
  // of a component in the system that will receive those values
  def examplePreStateContainerFilter(container: Regulate_Subsystem_Inputs_Container): B = {
    // e.g. return container.low < container.high
    return T
  }


  implicit def toNameProvider1[X](eta: X => B)(implicit line: sourcecode.Line): NameProvider1 = {
    val l = ops.StringOps(Example_Regulate_Subsystem_Inputs_Container_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider1(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def toNameProvider2[X, Y](eta: (X, Y) => B)(implicit line: sourcecode.Line): NameProvider2 = {
    val l = ops.StringOps(Example_Regulate_Subsystem_Inputs_Container_Test_wSlangCheck.lines(line.value - 1))
    return NameProvider2(l.substring(l.lastIndexOf('=') + 2, l.lastIndexOf('_') - 1), eta)
  }

  implicit def oneToGen[X](eta: (X) => B): Any => B = eta.asInstanceOf[Any => B]

  implicit def twoToGen[X, Y](eta: (X, Y) => B): (Any, Any) => B = eta.asInstanceOf[(Any, Any) => B]
}

object Example_Regulate_Subsystem_Inputs_Container_Test_wSlangCheck {
  val lines: ISZ[String] =
    ops.StringOps(ops.StringOps(Os.path(implicitly[sourcecode.File].value).read).replaceAllLiterally("\n", " \n")).split(c => c == C('\n'))

  @strictpure def p(str: String): ST = Json.Printer.printString(str)

  val dummy: B = {
    val inst = new Example_Regulate_Subsystem_Inputs_Container_Test_wSlangCheck()
    val entries = for (entry <- inst.testMatrix.entries) yield inst.genTestNameJson(entry._1, entry._2)
    val thisFile = Os.path(implicitly[sourcecode.File].value)
    val outFile = thisFile.up / s"${thisFile.name}.json"
    outFile.writeOver(st"${(entries, "\n")}".render)

    // emit schedule as JSON
    val nickNames: ISZ[ST] = for(e <- StaticSchedulerCust.threadNickNames.entries) yield
      st"${e._1}:${Arch.ad.components(e._2).name}"
    val nickNamesS = st"${(nickNames, ",")}".render
    val sched: ISZ[ST] = for(e <- StaticSchedulerCust.domainToBridgeIdMap) yield
      st"""${StaticSchedulerCust.revThreadNickNames.get(e).get}"""
    val schedS = st"${(sched, ",")}".render
    val schedFile = thisFile.up / s"${thisFile.name}_schedule.json"
    schedFile.writeOver(
      st"""{
          |  "nickNames": ${p(nickNamesS)},
          |  "scheduleProvider": ${p(StaticSchedulerCust.getClass.getName)},
          |  "schedule": ${p(schedS)}
          |}""".render)

    F
  }
}