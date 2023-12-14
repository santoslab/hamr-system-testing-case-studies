// #Sireum
package s

import org.sireum.Cli.SireumProyekSlangcheckOption
import org.sireum._
import org.sireum.lang.ast.Typed
import org.sireum.lang.symbol.{Resolver, TypeInfo}
import org.sireum.lang.tipe.TypeHierarchy
import org.sireum.logika.Config
import org.sireum.logika.Config.StrictPureMode
import org.sireum.message.Reporter

object SystemTestArtifactGen extends App {

  val toolName: String = ops.StringOps(this.getClass.getSimpleName).replaceAllLiterally("$", "")

  def usage(): Unit = {
    println("Usage: <dir> <slang-file>+")
  }

  override def main(args: ISZ[String]): Z = {
    if (args.size < 2) {
      usage()
      return 1
    }

    val projectRoot = Os.path(args(0))
    if (!projectRoot.exists || !projectRoot.isDir || !(projectRoot / "bin" / "project.cmd").exists) {
      println("First argument must point to the root of a proyek project")
      usage()
      return 2
    }

    val containers: ISZ[String] = ops.ISZOps(args).slice(1, args.size)
    val reporter = Reporter.create

    val res = run(projectRoot, containers, reporter)

    reporter.printMessages()

    return res + (if (reporter.hasError) 100 else 0)
  }

  @pure def astTypedNameString(packageName: ISZ[String], t: Typed): ST = {
    t match {
      case atn: Typed.Name => return Resolver.typeNameString(packageName, atn.ids)
      case _ => halt(s"Need to handle $t")
    }
  }

  @pure def astTypedName(packageName: ISZ[String], t: Typed): ST = {

    t match {
      case atn: Typed.Name if builtIn(atn) => st"${ops.ISZOps(atn.ids).last}"
      case atn: Typed.Name => return Resolver.typeName(packageName, atn.ids)
      case _ => halt(s"Need to handle $t")
    }
  }

  def builtIn(typed: Typed): B = {
    typed match {
      case Typed.Name(ISZ("org", "sireum", _), _) => return T
      case _ => return F
    }
  }

  def run(projectRoot: Os.Path, containerUris: ISZ[String], reporter: Reporter): Z = {
    val thopt = getTypeHierachy(projectRoot)
    if (thopt.isEmpty) {
      reporter.error(None(), toolName, s"Couldn't generate a type hierarch from ${projectRoot}")
      return 1
    }

    val th = thopt.get

    var fileUris: ISZ[String] = ISZ()
    for (f <- containerUris) {
      var cand: Os.Path = Os.path(f)
      if (!cand.exists) {
        cand = projectRoot / f
      }
      if (cand.exists) {
        fileUris = fileUris :+ cand.toUri
      } else {
        reporter.error(None(), toolName, s"Could not resolve ${f}")
      }
    }

    if (reporter.hasError) {
      return 1
    }

    var containers: ISZ[TypeInfo.Adt] = ISZ()
    for (v <- th.typeMap.values) {
      val temp: TypeInfo = v

      v.posOpt match {
        case Some(v) if ops.ISZOps(fileUris).contains(v.uriOpt.get) =>
          if (!temp.isInstanceOf[TypeInfo.Adt]) {
            reporter.error(temp.posOpt, toolName, s"Only expecting container files to container TypeInfo.Adt, but found ${temp} in ${v.uriOpt.get}")
          } else {
            containers = containers :+ temp.asInstanceOf[TypeInfo.Adt]
          }
        case _ =>
      }
    }

    val addSlang: Option[ST] = None() //Some(st"""// #Sireum
                                      //      |""")

    for (entry <- containers) {

      val packagePath = ops.ISZOps(entry.name).dropRight(1)
      val basePackageName = packagePath(0)
      val packageName = st"${(packagePath, ".")}".render

      val containerFQName = st"${(entry.name, ".")}".render
      val jsonName = st"${(ops.ISZOps(entry.name).drop(1), "")}".render
      val simpleContainerName = ops.ISZOps(entry.name).last

      val testUtilOutputDir = projectRoot / "src" / "test" / "util"
      val testSystemOutputDir = projectRoot / "src" / "test" / "system"

      testUtilOutputDir.mkdirAll()
      testSystemOutputDir.mkdirAll()

      val utilPath = packagePath :+ s"${simpleContainerName}_Util"
      val utilName = st"${(utilPath, ".")}".render
      val simpleUtilName = ops.ISZOps(utilPath).last

      var profileEntries: ISZ[ST] = ISZ()
      var freshLibs: ISZ[ST] = ISZ()
      var nextEntriesViaProfile: ISZ[ST] = ISZ()
      for (v <- entry.vars.entries) {
        val typ = v._2.typedOpt.get.asInstanceOf[org.sireum.lang.ast.Typed.Name]
        val typeName = st"${(astTypedName(ISZ(basePackageName), typ), "")}"

        val nextMethodName = st"next$typeName"

        freshLibs = freshLibs :+ st"${v._1} = ${simpleUtilName}.freshRandomLib"
        profileEntries = profileEntries :+ st"var ${v._1} : RandomLib"
        nextEntriesViaProfile = nextEntriesViaProfile :+ st"${v._1} = profile.${v._1}.${nextMethodName}()"
      }

      val doNotEdit = s"// Do not edit this file as it will be overwritten if $toolName is rerun"

      val util =
        st"""${addSlang}
            |package ${packageName}
            |
            |import org.sireum._
            |import ${basePackageName}._
            |import org.sireum.Random.Impl.Xoshiro256
            |
            |$doNotEdit
            |
            |object ${simpleUtilName} {
            |
            |  def getSeed: U64 = {
            |    val rand = new java.util.Random()
            |    rand.setSeed(rand.nextLong())
            |    return U64(rand.nextLong())
            |  }
            |
            |  def freshRandomLib: RandomLib = {
            |    return RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(getSeed)))
            |  }
            |}
            |"""
      val t1 = testUtilOutputDir /+ packagePath / s"${simpleUtilName}.scala"
      t1.writeOver(util.render)
      reporter.info(None(), toolName, s"Wrote: ${t1}")


      val profilePath = packagePath :+ s"${simpleContainerName}_Profile"
      val profileFQName = st"${(profilePath, ".")}".render
      val simpleProfileName = ops.ISZOps(profilePath).last

      val profiles =
        st"""$addSlang
            |package ${packageName}
            |
            |import org.sireum._
            |import ${basePackageName}._
            |
            |$doNotEdit
            |
            |object ${simpleProfileName} {
            |
            |  // a call to next may result in an AssertionError which is an indication that
            |  // SlangCheck was unable to satisfy a field's filter.  Consider using
            |  // nextH instead
            |  def next(profile: ${simpleProfileName}): ${simpleContainerName} = {
            |    return ${simpleContainerName} (
            |      ${(nextEntriesViaProfile, ",\n")}
            |    )
            |  }
            |
            |  // nextH will return None() if SlangCheck is unable to satisfy a field's filter
            |  def nextH(profile: ${simpleProfileName}): Option[${simpleContainerName}] = {
            |    try {
            |      return Some(${simpleContainerName} (
            |        ${(nextEntriesViaProfile, ",\n")}))
            |    } catch {
            |      case e: AssertionError =>
            |        // SlangCheck was unable to satisfy a datatype's filter
            |        return None()
            |    }
            |  }
            |
            |  def getDefaultProfile: ${simpleProfileName} = {
            |    return ${simpleProfileName} (
            |      name = "Default ${simpleProfileName} Profile",
            |      numTests = 100,
            |      numTestVectorGenRetries = 100,
            |
            |      ${(freshLibs, ",\n")}
            |    )
            |  }
            |}
            |
            |case class $simpleProfileName (
            |  var name: String,
            |  var numTests: Z,
            |  var numTestVectorGenRetries: Z,
            |
            |  ${(profileEntries, ",\n")}) extends org.sireum.$$internal.MutableMarker {
            |
            |  override def $$clonable: Boolean = F
            |
            |  override def $$clonable_=(b: Boolean): org.sireum.$$internal.MutableMarker = this
            |
            |  override def $$owned: Boolean = F
            |
            |  override def $$owned_=(b: Boolean): org.sireum.$$internal.MutableMarker = this
            |
            |  override def $$clone: org.sireum.$$internal.MutableMarker = this
            |}
            |"""

      val t3 = (testUtilOutputDir /+ packagePath) / s"${simpleProfileName}.scala"
      t3.writeOver(profiles.render)
      reporter.info(None(), toolName, s"Wrote: ${t3}")


      val simpleDSCTraitName = s"${simpleContainerName}_DSC_Test_Harness"
      val harness =
        st"""$addSlang
            |package ${packageName}
            |
            |import org.sireum._
            |import ${basePackageName}._
            |import org.sireum.Random.Impl.Xoshiro256
            |
            |$doNotEdit
            |
            |// Distributed SlangCheck Test Harness for ${containerFQName}
            |
            |@msig trait $simpleDSCTraitName
            |  extends Random.Gen.TestRunner[${containerFQName}] {
            |
            |  override def toCompactJson(o: ${containerFQName}): String = {
            |    return ${basePackageName}.JSON.from${jsonName}(o, T)
            |  }
            |
            |  override def fromJson(json: String): ${containerFQName} = {
            |    ${basePackageName}.JSON.to${jsonName}(json) match {
            |      case Either.Left(o) => return o
            |      case Either.Right(msg) => halt(msg.string)
            |    }
            |  }
            |
            |  // you'll need to provide implementations for the following:
            |
            |  // override def next(): ${containerFQName} = {}
            |
            |  // override def test(o: ${containerFQName}): B = { }
            |}
            |"""
      val t4 = testUtilOutputDir /+ packagePath / s"${simpleDSCTraitName}.scala"
      t4.writeOver(harness.render)
      reporter.info(None(), toolName, s"Wrote: ${t4}")



      val slangCheckTraitPath = packagePath :+ s"${simpleContainerName}_SlangCheck"
      val slangCheckTraitFQName = st"${(slangCheckTraitPath, ".")}".render
      val simpleSlangCheckTraitName = ops.ISZOps(slangCheckTraitPath).last

      val slangCheckTrait =
        st"""package ${packageName}
            |
            |import org.sireum._
            |import ${basePackageName}._
            |
            |${doNotEdit}
            |
            |object ${simpleSlangCheckTraitName} {
            |
            |  case class NameProvider(name: String,
            |                          function: (Any, Any) => B)
            |
            |  case class TestRow(testMethod: NameProvider,
            |                     testDescription: String,
            |                     profile: ${simpleProfileName},
            |                     preStateCheck: (Any => B),
            |                     property: NameProvider)
            |}
            |
            |trait ${simpleSlangCheckTraitName}
            |  extends SystemTestSuite {
            |
            |
            |  def next(profile: ${simpleProfileName}): Option[${simpleContainerName}] = {
            |    return ${simpleProfileName}.nextH(profile)
            |  }
            |
            |  def freshRandomLib: RandomLib = {
            |    return ${simpleUtilName}.freshRandomLib
            |  }
            |
            |  def getProfiles: MSZ[${simpleProfileName}] = {
            |    return MSZ(getDefaultProfile)
            |  }
            |
            |  //------------------------------------------------
            |  //  Test Vector Profiles
            |  //
            |  //   ..eventually auto-generated from a descriptor
            |  //     of injection vector
            |  //------------------------------------------------
            |
            |  def getDefaultProfile: ${simpleProfileName} = {
            |    return ${simpleProfileName}.getDefaultProfile
            |  }
            |
            |  def disableLogsAndGuis(): Unit = {
            |
            |    // disable the various guis
            |    System.setProperty("java.awt.headless", "true")
            |
            |    // suppress ART's log stream
            |    art.ArtNative_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
            |      override def write(b: Int): Unit = {}
            |    })
            |
            |    // suppress the static scheduler's log stream
            |    art.scheduling.static.StaticSchedulerIO_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
            |      override def write(b: Int): Unit = {}
            |    })
            |  }
            |}
            |"""

      val t6 = (testUtilOutputDir /+ packagePath / s"${simpleSlangCheckTraitName}.scala")
      t6.writeOver(slangCheckTrait.render)
      reporter.info(None(), toolName, s"Wrote: ${t6}")


      val exampleSlangCheckPath = packagePath :+ s"Example_${simpleContainerName}_Test_wSlangCheck"
      val exampleSlangCheckName = st"${(exampleSlangCheckPath, ".")}".render
      val simpleExampleSlangCheckName = ops.ISZOps(exampleSlangCheckPath).last

      val tq = "\"\"\""
      val exampleSlangCheck =
        st"""package $packageName
            |
            |import org.sireum._
            |import art.scheduling.static._
            |import art.Art
            |import ${basePackageName}._
            |import ${slangCheckTraitFQName}.{NameProvider, TestRow}
            |
            |$doNotEdit
            |
            |class ${simpleExampleSlangCheckName}
            |  extends ${simpleSlangCheckTraitName} {
            |
            |  //===========================================================
            |  //  S c h e d u l a r     and    S t e p p e r     Configuration
            |  //===========================================================
            |
            |  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
            |  //       abstract method
            |  //var scheduler: StaticScheduler = Schedulers.getStaticSchedulerH(MNone())
            |  var scheduler: StaticScheduler = Schedulers.getStaticScheduler(
            |    Schedulers.defaultStaticSchedule,
            |    Schedulers.defaultDomainToBridgeIdMap,
            |    Schedulers.threadNickNames,
            |    ISZCommandProvider(ISZ()))
            |
            |  def compute(isz: ISZ[Command]): Unit = {
            |    scheduler = scheduler(commandProvider = ISZCommandProvider(isz :+ Stop()))
            |
            |    Art.computePhase(scheduler)
            |  }
            |
            |  override def beforeEach(): Unit = {
            |
            |    // uncomment the following to disable the various guis and to suppress the log streams
            |    //disableLogsAndGuis()
            |
            |    super.beforeEach()
            |  }
            |
            |  //===========================================================
            |  //  S l a n g   C h e c k    Infrastructure
            |  //===========================================================
            |
            |  val maxTests = 100
            |  var verbose: B = T
            |
            |  val testMatrix: Map[String, TestRow] = Map.empty ++ ISZ(
            |    "testFamilyName" ~> TestRow(
            |      testDescription = "test-description",
            |      testMethod = NameProvider("Schema-Name", ((input_container: Any, property_function: Any) => T).asInstanceOf[(Any, Any) => B]),
            |      profile =getDefaultProfile,
            |      preStateCheck = (examplePreStateContainerFilter _).asInstanceOf[Any => B],
            |      property = NameProvider("Property-Name", ((input_container: Any, output_container: Any) => T).asInstanceOf[(Any, Any) => B])
            |    )
            |  )
            |
            |  for (testRow <- testMatrix.entries) {
            |    run(testRow._1, testRow._2)
            |  }
            |
            |  def genTestName(testFamilyName: String, testRow: TestRow): String = {
            |    return s"$${testFamilyName}: $${testRow.testMethod.name}: $${testRow.property.name}: $${testRow.profile.name}"
            |  }
            |
            |  def genTestNameJson(testFamilyName: String, testRow: TestRow): String = {
            |    @strictpure def p(str: String): ST = Json.Printer.printString(str)
            |    return st${tq}{"testFamilyName" : $${p(testFamilyName)}, "testDescription" : $${p(testRow.testDescription)}, "testMethodName": $${p(testRow.testMethod.name)}, "property" : $${p(testRow.property.name)}, "profile" : $${p(testRow.profile.name)}}${tq}".render
            |  }
            |
            |  def run(testFamilyName: String, testRow: TestRow): Unit = {
            |
            |    for (i <- 0 until maxTests) {
            |      val testName = s"$${genTestName(testFamilyName, testRow)}_$$i"
            |      this.registerTest(testName) {
            |        var retry: B = T
            |        var j: Z = 0
            |
            |        while (j < testRow.profile.numTestVectorGenRetries && retry) {
            |          if (verbose && j > 0) {
            |            println(s"Retry $$j:")
            |          }
            |
            |          next(testRow.profile) match {
            |            case Some(container) =>
            |              if (!testRow.preStateCheck(container)) {
            |                // retry
            |              } else {
            |                testRow.testMethod.function(container, testRow.property.function)
            |                retry = F
            |              }
            |            case _ =>
            |          }
            |          j = j + 1
            |        }
            |      }
            |    }
            |  }
            |
            |  // a pre-state container filter could prove useful/necessary in order to
            |  // ensure that the values in the container will satisfy the assume/requires clause
            |  // of a component in the system that will receive those values
            |  def examplePreStateContainerFilter(container: ${simpleContainerName}): B = {
            |    // e.g. return container.low < container.high
            |    return T
            |  }
            |}"""

      val t7 = (testSystemOutputDir /+ packagePath / s"${simpleExampleSlangCheckName}.scala")
      t7.writeOver(exampleSlangCheck.render)
      reporter.info(None(), toolName, s"Wrote: ${t7}")


      val exampleDSCPath = packagePath :+ s"Example_${simpleDSCTraitName}"
      val exampleDSCFQName = st"${(exampleDSCPath, ".")}".render
      val simpleExampleDSCName = ops.ISZOps(exampleDSCPath).last

      val exampleDSCImpl =
        st"""package $packageName
            |
            |import org.sireum._
            |import ${basePackageName}._
            |import ${slangCheckTraitFQName}.TestRow
            |
            |$doNotEdit
            |
            |object ${simpleExampleDSCName} extends App {
            |
            |  // main generates the Jenkins build parameters string and the JSON serialized testRow information
            |  override def main(args: ISZ[String]): Z = {
            |    val projectName = "${basePackageName}"
            |
            |    var args: ISZ[(String, String)] = ISZ()
            |
            |    args = args :+ ("DSC_TIMEOUT", s"$$$$DSC_TIMEOUT")
            |
            |    args = args :+ ("DSC_PROJECT_NAME", projectName)
            |
            |    val instance = new ${simpleExampleDSCName}()
            |
            |    val runnerClassName = ops.StringOps(instance.getClass.getName).replaceAllLiterally("$$", "")
            |    val runnerSimpleName = ops.StringOps(instance.getClass.getSimpleName).replaceAllLiterally("$$", "")
            |
            |    args = args :+ ("DSC_RUNNER_SIMPLE_NAME", runnerSimpleName)
            |    args = args :+ ("DSC_RUNNER_CLASS_NAME", runnerClassName)
            |
            |    val families: ISZ[(String, TestRow)] = instance.testMatrix.entries
            |
            |    for (e <- families) {
            |      val familyName = e._1
            |
            |      assert (!ops.StringOps(familyName).contains(" "), s"keys cannot contain spaces: $$familyName")
            |
            |      val fargs = args :+ ("DSC_TEST_FAMILY_NAME", familyName)
            |
            |      val data = for(f <- fargs) yield s"--data $${f._1}=$${f._2}"
            |      val command = st"$${(data, " ")}"
            |
            |      println(command.render)
            |      println(instance.genTestNameJson(e._1, e._2))
            |    }
            |    return 0
            |  }
            |}
            |
            |class $simpleExampleDSCName
            |  extends $simpleExampleSlangCheckName
            |  with $simpleDSCTraitName {
            |
            |  override def next(): ${containerFQName} = {
            |    val testRow = testMatrix.get(getTestId()).get
            |    return ${simpleProfileName}.next(testRow.profile)
            |  }
            |
            |  override def test(o: ${containerFQName}): B = {
            |    val testId = getTestId()
            |    val testRow = testMatrix.get(testId).get
            |
            |    if (verbose) {
            |      println(genTestName(testId, testRow))
            |    }
            |
            |    disableLogsAndGuis()
            |
            |    super.beforeEach()
            |
            |    if (!testRow.preStateCheck(o)) {
            |
            |      if (verbose) {
            |        println(s"  Didn't pass pre state check $${o}")
            |      }
            |
            |      DSC_RecordUnsatPre.report(toCompactJson(o))
            |
            |      return T
            |    } else {
            |
            |      val result = testRow.testMethod.function(o, testRow.property.function)
            |
            |      this.afterEach()
            |
            |      if (verbose) {
            |        println(s"  $${result}")
            |      }
            |      return result
            |    }
            |  }
            |
            |  def getTestId(): String = {
            |    Os.prop("DSC_TEST_FAMILY_NAME") match {
            |      case Some(v) => return v
            |      case _ =>
            |        Os.env("DSC_TEST_FAMILY_NAME") match {
            |          case Some(v) => return v
            |          case _ =>
            |        }
            |    }
            |    halt("DSC_TEST_FAMILY_NAME not defined")
            |  }
            |
            |  override def string: String = toString
            |
            |  override def $$clonable: Boolean = F
            |
            |  override def $$clonable_=(b: Boolean): org.sireum.$$internal.MutableMarker = this
            |
            |  override def $$owned: Boolean = F
            |
            |  override def $$owned_=(b: Boolean): org.sireum.$$internal.MutableMarker = this
            |
            |  override def $$clone: org.sireum.$$internal.MutableMarker = this
            |}
            |"""
      val t5 = (testSystemOutputDir /+ packagePath / s"${simpleExampleDSCName}.scala")
      t5.writeOver(exampleDSCImpl.render)
      reporter.info(None(), toolName, s"Wrote: ${t5}")

      val exampleJenkinsScript =
        st"""// #Sireum
            |
            |import org.sireum._
            |
            |val homeBin: Os.Path = Os.slashDir
            |val home: Os.Path = homeBin.up
            |
            |val sireumHome = Os.path(Os.env("SIREUM_HOME").get)
            |val sireumBin = sireumHome / "bin"
            |val sireum: Os.Path = sireumBin / (if (Os.isWin) "sireum.bat" else "sireum")
            |
            |$doNotEdit
            |
            |val firewall: B = F // set to T in order to tunnel, need to also turn on VPN if off-campus
            |val rebuild: B = F
            |
            |val testServer="e2206hm02.cs.ksu.edu"
            |
            |val DSC_PREFIX="dsc_sys" // name of the root artifacts directory on testServer
            |
            |val FQ_DSC_NAME = "${exampleDSCFQName}"
            |
            |val DSC_PROJECT_NAME = ops.ISZOps(ops.StringOps(FQ_DSC_NAME).split(c => c == '.')).first
            |
            |val DSC_SIMPLE_NAME = ops.ISZOps(ops.StringOps(FQ_DSC_NAME).split(c => c == '.')).last
            |
            |val DSC_SERVER_ROOT_DIR = Os.path("/opt") / "santos" / "jenkins" / DSC_PREFIX
            |
            |//////////////////////////////////////////////////////////////////////////////////////
            |// BOILER PLATE
            |//////////////////////////////////////////////////////////////////////////////////////
            |
            |val proxyJump = if (firewall) "-J santos_jenkins@linux.cs.ksu.edu" else ""
            |
            |if (rebuild) {
            |  proc"$$sireum proyek tipe $${Os.slashDir.up}".echo.console.runCheck()
            |  proc"$$sireum proyek assemble -m $$FQ_DSC_NAME --include-sources --include-tests $${Os.slashDir.up}".echo.console.runCheck()
            |}
            |
            |val jarFile = Os.slashDir.up / "out" / "slang" / "assemble" / "slang.jar"
            |assert (jarFile.exists, s"Need to build $${jarFile}")
            |
            |val jarFileDir = s"$${DSC_PREFIX}/$${DSC_PROJECT_NAME}/$${DSC_SIMPLE_NAME}"
            |val jarFileDest = s"$$jarFileDir/$${jarFile.name}"
            |
            |// upload the jar to the department's file server so that's it's accessible to
            |// all the linux servers
            |proc"ssh santos_jenkins@linux.cs.ksu.edu mkdir -p $$jarFileDir".echo.runCheck()
            |proc"scp $${jarFile} santos_jenkins@linux.cs.ksu.edu:$${jarFileDest}".echo.runCheck()
            |
            |// upload the jar to test server -- it's expected we'll use a non-cs hosted machine
            |// like the mac mini's during the testing phase as they are much faster than the old
            |// linux servers. Non-hosted means they're not connected to the department file system
            |proc"ssh $$proxyJump santos_jenkins@$${testServer} mkdir -p $$jarFileDir".echo.runCheck()
            |proc"scp $$proxyJump $${jarFile} santos_jenkins@$${testServer}:$${jarFileDest}".echo.runCheck()
            |
            |var curlPrefix = st"curl https://jenkins.cs.ksu.edu/job/0DSC_system_testing_start/buildWithParameters --user $$$${jenkinsUserId}:$$$${jenkinsToken}"
            |
            |// get the test info by calling the App associated
            |// with the DSC test harness (i.e. the app should be the jar's main method)
            |val results = proc"java -jar $${jarFile}".echo.console.run()
            |assert(results.ok)
            |
            |val lines = ops.StringOps(results.out ).split(c => c == '\n')
            |
            |var commands : ISZ[ST] = ISZ()
            |var i = 0
            |while(i < lines.size) {
            |  val jenkinsArgs = lines(i)
            |  val json = ops.StringOps(lines(i + 1))
            |  val jsonPrefix: String = "{\"testFamilyName\" : \""
            |  assert(json.startsWith(jsonPrefix))
            |
            |  val testFamilyName = json.substring(jsonPrefix.size, json.indexOfFrom('"', jsonPrefix.size + 1))
            |
            |  val dsc_runner_dir = DSC_SERVER_ROOT_DIR / "dsc_runner" / DSC_PROJECT_NAME / DSC_SIMPLE_NAME / testFamilyName / "$$DSC_TIMEOUT"
            |  val dsc_tester_dir = DSC_SERVER_ROOT_DIR / "dsc_tester" / DSC_PROJECT_NAME / DSC_SIMPLE_NAME / testFamilyName / "$$DSC_TIMEOUT"
            |
            |  if (i == 0) {
            |    // put the jar file into the DSC_PROJECT_NAME directory on the test server so that it can be used to merge
            |    // reports. This implies that making changes to the behavior code or the gumbo contract of a component means
            |    // the report from one DSC_PROJECT_NAME/DSC_SIMPLE_NAME may no longer be mergeable as it's line numbers no
            |    // longer match what's in the freshly built jar -- ie. probably need to rerun everything for DSC_PROJECT_NAME
            |    val serverJarLoc = dsc_tester_dir.up.up.up / jarFile.name
            |    proc"ssh $$proxyJump santos_jenkins@$${testServer} mkdir -p $${serverJarLoc.up}".echo.runCheck()
            |    proc"scp $$proxyJump $${jarFile} santos_jenkins@$${testServer}:$${serverJarLoc}".echo.runCheck()
            |  }
            |
            |  val temp = Os.temp()
            |  temp.writeOver(json.s)
            |  commands = commands :+ st${tq}DSC_RUNNER_DIR = s"$${dsc_runner_dir.string}${tq}"
            |  commands = commands :+ st${tq}DSC_TESTER_DIR = s"$${dsc_tester_dir.string}${tq}"
            |  commands = commands :+ st${tq}// create the result directories for $${testFamilyName} on the test server and upload the json file${tq}
            |  commands = commands :+ st${tq}proc"ssh $${proxyJump} santos_jenkins@$${testServer} mkdir -p $$$${DSC_RUNNER_DIR}".echo.console.runCheck()${tq}
            |  commands = commands :+ st${tq}proc"ssh $${proxyJump} santos_jenkins@$${testServer} mkdir -p $$$${DSC_TESTER_DIR}".echo.console.runCheck()${tq}
            |  commands = commands :+ st${tq}proc"scp $$proxyJump $${temp} santos_jenkins@$${testServer}:$${dsc_runner_dir.up}/testRow.json".echo.runCheck()${tq}
            |  commands = commands :+ st${tq}proc"scp $$proxyJump $${temp} santos_jenkins@$${testServer}:$${dsc_tester_dir.up}/testRow.json".echo.runCheck()${tq}
            |  commands = commands :+ st${tq}// trigger $${testFamilyName} tests on jenkins${tq}
            |  commands = commands :+ st${tq}proc"$$$$CURL_PREFIX $${jenkinsArgs} --data DSC_RUNNER_DIR=$$$${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=$$$${DSC_TESTER_DIR} --data DSC_JAR_LOC=$$jarFileDest --data DSC_TEST_SERVER=$${testServer} --data DSC_PREFIX=$${DSC_PREFIX}".echo.console.runCheck()${tq}
            |  commands = commands :+ st""
            |
            |  i = i + 2
            |}
            |
            |val batch =
            |  st${tq}// #Sireum
            |      |
            |      |import org.sireum._
            |      |
            |      |val DSC_TIMEOUT = Os.env("DSC_TIMEOUT").get
            |      |val jenkinsUserId = Os.env("JENKINS_USER_ID").get
            |      |val jenkinsToken = Os.env("JENKINS_TOKEN").get
            |      |
            |      |val CURL_PREFIX=s"$$curlPrefix"
            |      |var DSC_RUNNER_DIR=""
            |      |var DSC_TESTER_DIR=""
            |      |
            |      |$${(commands, "\n")}
            |      |${tq}
            |
            |(Os.slashDir / "batch.cmd").writeOver(batch.render)
            |(Os.slashDir / "batch.cmd").chmod("700")
            |"""

      val t5_5 = projectRoot / "bin" / "exampleJenkinsScript.cmd"
      t5_5.writeOver(exampleJenkinsScript.render)
      t5_5.chmod("770")
    } // end of for loop
    return 0
  }

  def getTypeHierachy(projectRoot: Os.Path): Option[TypeHierarchy] = {
    val args = s"proyek slangcheck -p isolette -o ${projectRoot}/src/main/util/isolette ${projectRoot}"
    val argsx: ISZ[String] = ops.StringOps(args).split(c => c == ' ')

    val o = Cli('/').parseSireum(argsx, 0).get.asInstanceOf[SireumProyekSlangcheckOption]

    val (help, code, path, prj, versions) = org.sireum.cli.Proyek.check(o.json, o.project, Some(1), None(), o.args, o.versions, o.slice)
    if (help) {
      halt(s"${help}")
    } else if (code != 0) {
      halt(s"${code}")
    }


    val dm = project.DependencyManager(
      project = prj,
      versions = versions,
      isJs = F,
      withSource = F,
      withDoc = F,
      javaHome = SireumApi.javaHomeOpt.get,
      scalaHome = SireumApi.scalaHomeOpt.get,
      sireumHome = SireumApi.homeOpt.get,
      cacheOpt = o.cache.map((p: String) => Os.path(p))
    )

    val config = org.sireum.logika.Config(
      smt2Configs = ISZ(),
      parCores = 1,
      sat = F,
      rlimit = 1000000,
      timeoutInMs = 2000,
      charBitWidth = 32,
      intBitWidth = 0,
      useReal = F,
      logPc = F,
      logRawPc = F,
      logVc = F,
      logVcDirOpt = None(),
      dontSplitPfq = F,
      splitAll = F,
      splitContract = F,
      splitIf = F,
      splitMatch = F,
      simplifiedQuery = F,
      checkInfeasiblePatternMatch = T,
      fpRoundingMode = "RNE",
      smt2Seq = F,
      branchPar = org.sireum.logika.Config.BranchPar.All,
      branchParCores = 1,
      atLinesFresh = F,
      interp = F,
      loopBound = 3,
      callBound = 3,
      interpContracts = F,
      elideEncoding = F,
      rawInscription = F,
      smt2Caching = F,
      strictPureMode = StrictPureMode.Default,
      transitionCache = F,
      patternExhaustive = F,
      pureFun = F,
      detailedInfo = F,
      satTimeout = F,
      isAuto = F,
      background = Config.BackgroundMode.Disabled,
      atRewrite = F,
      searchPc = F
    )

    val reporter = logika.ReporterImpl.create(F, F, F, F)

    val mbox: MBox2[HashMap[String, HashMap[String, org.sireum.lang.FrontEnd.Input]], HashMap[String, TypeHierarchy]] = MBox2(HashMap.empty, HashMap.empty)
    val lcode = org.sireum.proyek.Analysis.run(
      root = path,
      outDirName = "out",
      project = prj,
      dm = dm,
      cacheInput = F,
      cacheTypeHierarchy = F,
      mapBox = mbox,
      config = config,
      cache = org.sireum.logika.NoTransitionSmt2Cache.create,
      files = HashSMap.empty,
      filesWatched = F,
      vfiles = ISZ(),
      line = 0,
      par = SireumApi.parCoresOpt(o.par),
      strictAliasing = o.strictAliasing,
      followSymLink = o.symlink,
      all = T,
      disableOutput = F,
      verify = F,
      verbose = o.verbose,
      sanityCheck = T,
      plugins = ISZ(),
      skipMethods = ISZ(),
      skipTypes = ISZ(),
      reporter = reporter
    )

    if (reporter.hasIssue) {
      println()
      reporter.printMessages()
      return None()
    } else if (lcode == 0) {
      println()
      println("Programs are well-typed!")

      val th_ = mbox.value2
      assert(th_.size == 1)

      return Some(th_.values(0))
    } else {
      halt("what")
    }

  }
}
