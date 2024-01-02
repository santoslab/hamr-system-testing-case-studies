// #Sireum
package report

import org.sireum._
import org.sireum.hamr.codegen.common.StringUtil
import org.sireum.hamr.codegen.common.symbols.{AadlComponent, AadlThread, SymbolTable}
import org.sireum.hamr.ir.Classifier
import org.sireum.message.{Position, Reporter}
import report.ReadmeGen.{Project, main, projects, repoRootDir}
import org.sireum.U32._

@datatype class ReportBlock(val tag: String,
                            content: Option[ST])

@datatype class ReportLevel(val tag: String,
                            val title: Option[ST],
                            val description: Option[ST],
                            val content: ISZ[ReportBlock],
                            val subLevels: ISZ[ReportLevel])

object Report {
  def wrapWithTag(tag: String, isTitle: B, content: Option[ST]): ST = {
    val (start, end): (String, String) = (s"<!--${tag}_start-->", s"<!--${tag}_end-->")
    val ret: ST = {
      if (isTitle) st"${start}${content}${end}"
      else
        st"""${start}
            |${content}
            |${end}"""
    }
    return ret
  }

  def weave(readmeLoc: Os.Path, readmeContent: ReportLevel): Unit = {
  }

  def overwrite(readmeLoc: Os.Path, level: ReportLevel): Unit = {
    def renderLevel(l: ReportLevel, pos: Z): ST = {
      val hashes = st"${(for (i <- 0 to pos) yield "#", "")}"

      def renderBlock(block: ReportBlock): ST = {
        wrapWithTag(s"${l.tag}-${block.tag}", F, block.content)
      }

      return (
        st"""$hashes ${wrapWithTag(s"${l.tag}-title", T, l.title)}
            |${wrapWithTag(s"${l.tag}-description", F, l.description)}
            |${(for (b <- l.content) yield renderBlock(b), "\n")}
            |${(for (sl <- l.subLevels) yield renderLevel(sl, pos + 1), "\n")}""")
    }

    val content = renderLevel(level, 0)
    readmeLoc.writeOver(content.render)
    println(s"Wrote: ${readmeLoc}")
  }


  def genReport(project: Project, packageName: String, aadlRootDir: Os.Path, rootDir: Os.Path, reporter: Reporter): ReportLevel = {
    return Report(packageName, aadlRootDir, repoRootDir).genReport(project)
  }

  def createLinkFromPos(text: String, pos: Position,
                        aadlDir: Os.Path, rootDir: Os.Path): ST = {
    val ret: ST = pos match {
      case org.sireum.message.FlatPos(Some(uriOpt), beginLine, _, _, _, _, _) =>
        val sops = ops.StringOps(uriOpt)
        assert(sops.startsWith("/"))
        val pos = sops.indexOfFrom('/', 1)
        val stripped = sops.substring(pos, sops.size)
        val uri = aadlDir / stripped

        val line = conversions.U32.toZ(beginLine)
        st"[${text}](${rootDir.relativize(uri).value}#L${line})"

      case _ => halt(s"Infeasible: not a FlatPos - ${pos}")
    }
    return ret
  }

  def createClassifierLink(textToDisplay: String, componentType: String, classifier: Classifier, aadlDir: Os.Path, rootDir: Os.Path): ST = {
    val name = ops.StringOps(ops.StringOps(classifier.name).replaceAllLiterally("::", ":")).split(c => c == ':')
    val file = Os.Path.walk(aadlDir, T, F, p => p.isFile && ops.StringOps(p.read).contains(s"package ${name(0)}"))(0)
    val cType: String =
      if (ops.StringOps(name(1)).contains(".")) s"${componentType} implementation"
      else componentType
    val lines = file.readLines
    for(i <- 0 until lines.size if ops.StringOps(lines(i)).contains(s"${cType} ${name(1)}")) {
      return st"[${textToDisplay}](${rootDir.relativize(file).value}#L${i + 1})"
    }
    halt(s"Infeasible: couldn't find $cType in $file")
  }

  def sortThreads(threads: ISZ[AadlThread], symbolTable: SymbolTable): ISZ[AadlThread] = {
    return (
      ops.ISZOps(threads()).sortWith((a,b) => a.component.classifier.get.name < b.component.classifier.get.name))
  }

  def createHyperLink(title: String, target: String): ST = {
    return st"[${title}](${target})"
  }

  def createTag(s: String): String = {
    val lc = StringUtil.toLowerCase(s)
    val d = StringUtil.replaceAll(lc, " ", "-")
    val cis = conversions.String.toCis(d)

    // only keep numbers, lowercase letters, '-' and '_'
    val cis_ = cis.filter(c =>
      (c.value >= 48 && c.value <= 57) || (c.value >= 97 && c.value <= 122) ||
        (c == '-') || (c == '_'))
    val d_ = conversions.String.fromCis(cis_)
    return d_
  }

  def toGithubLink(s: String): String = {
    return s"#${createTag(s)}"
  }

  def splitClassifier(c: AadlComponent): (String, String) = {
    val o = ops.StringOps(ops.StringOps(c.component.classifier.get.name).replaceAllLiterally("::", ":")).split(c => c == ':')
    return (o(0), o(1))
  }

  def sanitize(s: String) : String = {
    return ops.StringOps(s).replaceAllLiterally(".", "_")
  }

  def findMethod(key: String, f: Os.Path): Z = {
    assert(f.isFile, s"$f is not a file")
    assert(!ops.StringOps(f.read).contains("\r"), s"$f contains windows style new lines")

    var line = 1
    // add space before newline as split does not preserve empty lines (i.e. those that only contain newline char)
    for (l <- ops.StringOps(ops.StringOps(f.read).replaceAllLiterally("\n", " \n")).split(c => c == '\n')) {
      if (ops.StringOps(l).contains(s"def $key(api: ")) {
        return line
      }
      line = line + 1
    }
    halt(s"Infeasible, didn't find $key in $f")
  }

}

import Report._

@datatype class Report(packageName: String, aadlRootDir: Os.Path, repoRoot: Os.Path) {


  def runCloc(dirs: ISZ[Os.Path]): ST = {

    // define a language processing filter for camkes
    val camkesClocDef = st"""CAmkES
                            |    filter rm_comments_in_strings " /* */
                            |    filter rm_comments_in_strings " //
                            |    filter call_regexp_common C++
                            |    extension camkes
                            |    3rd_gen_scale 2.00
                            |    end_of_line_continuation \\$$"""
    val temp = Os.temp()
    temp.writeOver(camkesClocDef.render)

    val args: ISZ[String] = ISZ[String](
      "cloc",
      "--md",
      "--exclude-lang=make",
      s"--read-lang-def=${temp.value}"
    ) ++ dirs.map((m: Os.Path) => m.value)

    val results = Os.proc(args).runCheck()
    val s = ops.StringOps(results.out)

    val ret = st"${(ops.ISZOps(s.split(c => c == '\n')).drop(2), "\n")}"

    return ret
  }

  def dirsScanned(project: Project, dirs: ISZ[Os.Path]): ST = {
    val rdirs = dirs.map((m: Os.Path) => project.projectRootDir.relativize(m)).map((m: Os.Path) => st"- [${m}]($m)")

    val _dirs: ST = st"""Directories Scanned Using [https://github.com/AlDanial/cloc](https://github.com/AlDanial/cloc) v1.94:
                        |${(rdirs, "\n")}"""
    return _dirs
  }

   def genAadlMetrics(project: Project): ReportLevel = {

    assert (project.configs.size == 1)
    val model = AadlModelUtil.getModel(project.air, F)
    val symbolTable = AadlModelUtil.getSymbolTable(model, project.configs(0).packageName.get, project.configs(0))

    val threads = symbolTable.getThreads()

    val connections = symbolTable.connections

    var ports: Z = 0
    for(t <- threads) {
      ports = ports + t.getPorts().size
    }

    val ret: ST =
      st"""| | |
           ||--|--|
           ||Threads|${threads.size}|
           ||Ports|${ports}|
           ||Connections|${connections.size}|"""

    return ReportLevel(
      tag = "",
      title = Some(st"AADL Metrics"),
      description = None(),
      content = ISZ(ReportBlock(
        tag = "",
        content = Some(ret))),
      subLevels = ISZ()
    )
  }

  def processUserCloc(root: Os.Path): ST = {
    var code: Z = 0
    var log: Z = 0

    def process(d: Os.Path): Unit = {
      if(d.isDir) {
        for(f <- d.list) {
          process(f)
        }
      } else {
        if(d.ext == "loc") {
          val props = d.properties
          code = code + Z(props.getOrElse("code", "0")).get
          log = log + Z(props.getOrElse("log", "0")).get
        }
      }
    }
    process(root)

    val ret: ST =
      st"""|Type|code |
           ||--|--:|
           ||Behavior|${(code - log)}|
           ||Log|${log}|
           ||--------|--------|
           ||SUM:|${code}|"""

    return ret
  }

  def genJVMMetrics(project: Project): ReportLevel = {

    assert (project.configs.size == 1)

    val mainDir = Os.path(project.configs(0).outputDir.get) / "src" / "main"
    assert(mainDir.exists && mainDir.isDir)

    val cloc: ST = runCloc(ISZ(mainDir))

    val _dirsScanned = dirsScanned(project, ISZ(mainDir))

    val userCloc: ST = processUserCloc(mainDir)

    val ret: ST =
      st"""${_dirsScanned}
          |
          |<u><b>Total LOC</b></u>
          |
          |Total number of HAMR-generated and developer-written lines of code
          |${cloc}
          |
          |<u><b>User LOC</b></u>
          |
          |The number of lines of code written by the developer.
          |"Log" are lines of code used for logging that
          |likely would be excluded in a release build
          | ${userCloc}"""

    val block = ReportBlock(
      tag = s"${project.title}_code_metrics",
      content = Some(ret))

    return ReportLevel(
      tag = "",
      title = Some(st"JVM Metrics"),
      description = None(),
      content = ISZ(block),
      subLevels = ISZ()
    )
  }

  def genCodeMetrics(project: Project): ReportLevel = {

    return ReportLevel(
      tag = "",
      title = Some(st"Metrics"),
      description = None(),
      content = ISZ(),
      subLevels = ISZ(genAadlMetrics(project), genJVMMetrics(project))
    )
  }

  def genTestingSection(project: Project, table: SymbolTable): ReportLevel = {

    val readmeRoot = project.projectRootDir
    val reportRoot = project.projectRootDir.up
    val stagReadme = readmeRoot.relativize(reportRoot / "report/util/SystemTestArtifactGen/readme.md")

    val exTestConfig = project.testConfigs(0)
    val exContainer = readmeRoot.relativize(exTestConfig.inputOutputContainers)
    val testOutputDirRel = readmeRoot.relativize(exTestConfig.systemTestOutputDir)
    val exManualRel = testOutputDirRel / s"${exTestConfig.exampleTestFrameworkPrefix}_Test_wSlangCheck.scala"
    val exDSCRel = testOutputDirRel / s"${exTestConfig.exampleTestFrameworkPrefix}_DSC_Test_Harness.scala"

    val framework: ReportLevel = ReportLevel(
      tag = "framework-generation",
      title = Some(st"Framework Generation"),
      description = Some(
        st"""1. Build the System Testing Artifact Generator following the instructions at
            |   [SystemTestArtifactGen/readme.md]($stagReadme)
            |1. Run the generator by passing it the paths to one or more files that contain
            |   input/output container definitions
            |
            |For example, running the generator on
            |[${exContainer.name}](${exContainer})
            |will generate the following artifacts:
            |
            |1. [${exManualRel.name}]($exManualRel)
            |
            |   System test suite containing an example test run configuration.  Developers can make a copy of this file and then define
            |   custom test run configurations where each configuration has the structure
            |   _(script schema, property, randomization profile, random vector filter)_
            |
            |1. [${exDSCRel.name}]($exDSCRel)
            |
            |      Example showing how a system test suite can be adapted for use with Distributed SlangCheck (DSC). It overrides/implements
            |   two DCS methods, ``next`` and ``test``.  The next method is called during DSC's test vector generation phase. The generated
            |   vectors are subsequently passed to the test method during DSC's testing phase. Both methods use the environment variable
            |   ``DSC_TEST_FAMILY_NAME`` to determine which test run configuration should be used.
            |
            |"""),
      content = ISZ(),
      subLevels = ISZ()
    )

    val subSystemsX: ISZ[String] = for(sub <- project.testConfigs) yield sub.systemName
    val subSystems: String = if (subSystemsX.size == 1) { subSystemsX(0)}
    else {
      val o = ops.ISZOps(subSystemsX)
      st"${(o.dropRight(1), ", ")} and ${o.last}".render
    }

    val manBlocks: ISZ[ReportBlock] = {
      var mbs: ISZ[ReportBlock] = ISZ()
      for (tconfig <- project.testConfigs) {
        val daconfig = tconfig.systemTestOutputDir / tconfig.manualTestingFilename
        val daconfigcontents = ops.StringOps(ops.StringOps(daconfig.read).replaceAllLiterally("\n", " \n")).split(c => c == '\n')
        val mtf = readmeRoot.relativize(daconfig)

        def locateDef(s: String): String = {
          if (s == "Regulate_Subsystem_Inputs_Container_GumboX.system_Pre_Container") {
            return "[system_Pre_Container](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Inputs_Container_GumboX.scala#L46)"
          }
          if (s == "getDefaultProfile") {
            return "getDefaultProfile, _i.e. uses default configurations as provided by SlangCheck_"
          }
          val deffy = s"def $s"
          for (i <- 0 until daconfigcontents.size if ops.StringOps(daconfigcontents(i)).contains(deffy)) {
            return s"[$s](${mtf}#L${i+1})"
          }
          return s
        }
        def locateText(s: String): String = {
          for (i <- 0 until daconfigcontents.size if ops.StringOps(daconfigcontents(i)).contains(s)) {
            return s"[$s](${mtf}#L${i+1})"
          }
          return s
        }

        val testSuiteSuffix: String = ops.StringOps(tconfig.manualTestingFilename).replaceAllLiterally(".scala", "")
        val nest: ST =
          st"""System Test Suite Class: [${mtf.name}](${mtf})
              |
              |Test run configurations are specified via entries in the ${locateText("testMatrix")}. For example,
              |the ${locateText(tconfig.exampleTestConfig.name)} configuration uses the following:
              |
              || | |
              ||--|--|
              || Script Schema: | ${locateDef(tconfig.exampleTestConfig.schema)} |
              || Property: | ${locateDef(tconfig.exampleTestConfig.property)} |
              || Randomization Profile: | ${locateDef(tconfig.exampleTestConfig.profile)} |
              || Random Vector Filter: | ${locateDef(tconfig.exampleTestConfig.filter)} |
              |
              |How to run:
              |
              |```
              |cd hamr-system-testing-case-studies
              |
              |sireum proyek test --suffixes ${testSuiteSuffix} ${project.projectRootDir.name}/hamr/slang
              |```
              |"""

        mbs = mbs :+ ReportBlock(
          tag = s"${tconfig.systemName}_block",
          content = Some(
            st"""__${tconfig.systemName}__
                |
                |  $nest
                |""")
        )
      }
      mbs
    }

    val manualTesting: ReportLevel = ReportLevel(
      tag = "manual-testing",
      title = Some(st"Manual System Testing"),
      description = Some(
        st"""The example system test suites described previously were used to write
            |system tests for the ${subSystems} as follows:"""),
      content = manBlocks,
      subLevels = ISZ()
    )

    val dscTesting: ReportLevel = ReportLevel(
      tag = "dsc-testing",
      title = Some(st"Distributed SlangCheck System Testing"),
      description = Some(st"""Background:
                             |
                             |System testing as put forth in this paper uses SlangCheck to generate input/injection test vectors.
                             |SlangCheck is Sireum's randomized
                             |test generator framework similar to ScalaCheck and Haskell's QuickCheck.
                             |Distributed SlangCheck (DSC) adds a framework that allows test vector
                             |generation to be run via a server cluster up to a user specified timeout. Increasing
                             |the timeout allows more vectors to be produced which may lead to increased code
                             |coverage during testing. DSC passes the vectors to user defined unit tests
                             |and serializes the
                             |passing and failing vectors to seperate files so that they can be replayed if needed.
                             |DSC uses JaCoCo to produce code coverage information.
                             |
                             |Approach:
                             |
                             |The <configname> configuration of <projctname>'s <tsetsuite> test suite will be used to
                             |illustrate how system testing can employ DSC.  The actual results reported in the next
                             |section simply automated the following steps such that each configuration was run with timeouts
                             |of 1, 5, 10, and 30 seconds.
                             |
                             |Create a jar file for this project that includes sources and tests
                             |
                             |```
                             |cd hamr-system-testing-case-studies
                             |
                             |sireum proyek assemble --include-sources --include-tests ${project.projectRootDir.name}/hamr/slang
                             |```
                             |
                             |Set the environment variable DSC_TEST_FAMILY_NAME to indicate which configuration
                             |should be used
                             |
                             |```
                             |export DSC_TEST_FAMILY_NAME=<configname>
                             |```
                             |
                             |Generate 1 second's worth of test vectors and store them in a local file (DSC can be
                             |configured to scp the results to a remote server where they can be combined with vectors
                             |generated from other 'generating' servers)
                             |```
                             |sireum tools slangcheck runner -c isolette/hamr/slang/out/slang/assemble/slang.jar -o $$(pwd)/isolette-dsc.jsons -t 5 isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness
                             |```
                             |
                             |DSC is designed to only report passing and failing test vectors.  The generated DSC
                             |test harnesses
                             |```
                             |export DSC_SAVE_LOC=$$(pwd)/isolette-dsc-output.unsat
                             |touch $$DSC_SAVE_LOC
                             |```
                             |
                             |Pass each vector to the <link to test method>
                             |```
                             |sireum tools slangcheck tester -i $$(pwd)/isolette-dsc.jsons.dsc.7z -o $$(pwd)/isolette-dsc-output -c isolette/hamr/slang/out/slang/assemble/slang.jar --sourcepath isolette/hamr/slang/out/slang/assemble/slang.jar isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness
                             |```
                             |
                             |Results:
                             |The following summarizes the results of running DSC+System Testing on the ${project.title} with different time-out values"""),
      content = ISZ(),
      subLevels = ISZ()
    )

    return ReportLevel(
      tag = "testing",
      title = Some(st"System Testing"),
      description = Some(
        st"""System testing requires a Sireum distribution. Instructions on how to obtain a
            |distribution are available at [https://sireum.org/getting-started/](https://sireum.org/getting-started/).
            |The rest of this documentation assumes the SIREUM_HOME environmental variable has been set and that
            |sireum's bin directory has been added to your path (e.g. for Linux/MacOS ``export PATH=$$SIREUM_HOME/bin:$$PATH``
            |or Windows ``set PATH=%PATH%\bin;%PATH%``
            |
            |"""),
      content = ISZ(),
      subLevels = ISZ(framework, manualTesting, dscTesting)
    )
  }

  def genReport(project: Project): ReportLevel = {

    val model = AadlModelUtil.getModel(project.air, F)
    val table = AadlModelUtil.getSymbolTable(model, packageName, project.configs(0))

    val arch: ReportLevel = genArchitectureSection(project, table)

    val metrics: ReportLevel = genCodeMetrics(project)

    //val logika: ReportLevel = genLogikaSection(project, table)
    val testing: ReportLevel = genTestingSection(project, table)

    return ReportLevel(
      tag = "",
      title = Some(st"${project.title}"),
      description = None(),
      content = ISZ(),
      subLevels = ISZ(arch, metrics, testing)
    )
  }


  def collect(index: Z, content: ISZ[ISZ[String]]): Z = {
    var sum: Z = 0
    for (c <- content) {
      sum = sum + Z(c(index)).get
    }
    return sum / content.size
  }

  def allSame(index: Z, content: ISZ[ISZ[String]]): Unit = {
    var last: Z = -1
    for (c <- content) {
      if (last == -1) {
        last = Z(c(index)).get
      } else {
        assert(Z(c(index)).get == last)
      }
    }
  }

  def formatTime(s: Z): String = {
    val cis = conversions.String.toCis(s.string)
    var ret: ISZ[org.sireum.C] = ISZ()
    for(ix <- cis.size -1 to 0 by -1) {
      ret = cis(ix) +: ret
      if (ret.size == 3){
        ret = '.' +: ret
      }
    }
    val r :String = conversions.String.fromCis(ret)
    return if(ret.size == 2) s"0.0$r"
    else if(ret.size == 3) s"0.$r"
    else if (ret.size == 4) s"0$r"
    else r
  }

  def processResults(csv: Os.Path): HashSMap[String, ST] = {

    val rawlines = csv.readLines
    assert (rawlines(0) == "entrypoint,cliTime,logikaTime,processBegin,processCheck,vcsNum,vcsTime,satNum,satTime,timeStamp,kekikianBuild,timeout,rlimit,par,par-branch,par-branch-mode,System Version,Computer Name,Model Identifier,Processor,Memory")
    val lines: ISZ[ISZ[String]] = for (l <- ops.ISZOps(rawlines).drop(1)) yield ops.StringOps(l).split(c => c == ',')

    var entrypoints : Set[String] = Set.empty
    for(l <- lines) {
      entrypoints = entrypoints + l(0)
    }
    var ret = HashSMap.empty[String, ST]
    for(entryPoint <- entrypoints.elements) {
      val entries = ops.ISZOps(lines).filter(p => p(0) == entryPoint)
      val cliTime = collect(1, entries)
      val logikaTime = collect(2, entries)
      val processBegin = collect(3, entries)
      val processCheck = collect(4, entries)
      val vcsNum = collect(5, entries)
      allSame(5, entries)
      val vcsTime = collect(6, entries)
      val satNum = collect(7, entries)
      allSame(7, entries)
      val satTime = collect(8, entries)

      val ttime = formatTime(logikaTime)
      val itctime = formatTime(processBegin - processCheck)
      val vtime = formatTime(processCheck)


      ret = ret + entryPoint ~> st"|$vcsNum|$satNum|$ttime|$itctime|$vtime|"
    }
    return ret
  }

  // NOTE: ignore tipe warning that SymbolTable cannot be resolved as the source
  //       for that is in the jitpack jar file and thus not accessible to tipe
  def genLogikaSection(project: ReadmeGen.Project, table: SymbolTable): ReportLevel = {
    var subLevels:ISZ[ReportBlock] = ISZ()
    for(t <- table.getThreads()) {
      val cimplname: String = sanitize(splitClassifier(t)._2)
      val sp = st"${(ops.ISZOps(t.path).drop(1), "_")}".render
      val fnamePrefix: String = s"${cimplname}_${sp}"
      val scalaFilename = s"${fnamePrefix}.scala"

      val csvFilename = s".${scalaFilename}.csv"

      val componentDir = Os.path(project.configs(0).outputDir.get) / "src" / "main" / "component" / project.configs(0).packageName.get
      val csvFile = Os.Path.walk(componentDir, T, F, p => p.name == csvFilename)
      val scalaFile = Os.Path.walk(componentDir, T, F, p => p.name == scalaFilename)(0)

      if (csvFile.nonEmpty) {
        val tag = s"logika-${fnamePrefix}"
        var entries: ISZ[ST] = ISZ()
        for(r <- processResults(csvFile(0)).entries) {
          val lineNum = findMethod(r._1, scalaFile)
          val elink = st"[${r._1}](${project.projectRootDir.relativize(scalaFile)}#L${lineNum})"
          entries = entries :+ st"|${elink}${r._2}"
        }
        val table =
          st"""
              |**${t.identifier}**
              |
              |Raw Data: [csv](${project.projectRootDir.relativize(csvFile(0))})
              |
              |EntryPoint|VC|SAT|TTime|ITCTime|VTime|
              ||--|--|--|--|--|--|
              |${(entries, "\n")}"""

        subLevels = subLevels :+ ReportBlock(
          tag = tag,
          content = Some(table)
        )/*
        subLevels = subLevels :+ Level(
          tag = tag,
          title = Some(st"${t.identifier}"),
          description = None(),
          content = ISZ(Block(s"${tag}-table", Some(table))),
          subLevels = ISZ()
        )*/
      }
    }

    val results = ReportLevel(
      tag = "logiak-results",
      title = Some(st"Results"),
      description = None(),
      content = subLevels,
      subLevels = ISZ()
    )
    val slashScript = repoRoot / "bin" / "report-logika.cmd"
    val relSlashScript = project.projectRootDir.relativize(slashScript)

    val howToRun = ReportLevel(
      tag = "how-to-run",
      title = Some(st"How to replicate"),
      description = Some(st"""To run the experiments, first install Sireum Kekinian (optionally choosing the
                             |commit tip used for the experiments, ie. [843ede1](https://github.com/sireum/kekinian/tree/843ede1120e6e75fde089db0928ab66a3c9a3e73))
                             |
                             |```
                             |git clone --rec https://github.com/sireum/kekinian.git
                             |cd kekinian
                             |git checkout 843ede1
                             |git pull --rec
                             |bin/build.cmd
                             |
                             |export SIREUM_HOME=$$(pwd)
                             |export PATH=$$SIREUM_HOME/bin:$$PATH
                             |```
                             |
                             |Then run the following Slash script specifying the number of number of times to rerun Logika
                             |on each entrypoint: [${relSlashScript}](${relSlashScript})
                             |
                             |```
                             |${relSlashScript} run 25
                             |```
                             |
                             |The results will be appended to the csv file corresponding to the component
                             |being evaluated. The line ``val projects: Map[String, Project] = Map.empty + isolette + rts + tcP + tcS``
                             |in the script can be modified if you want to run a subset of the projects"""),
      content = ISZ(), subLevels = ISZ()
    )

    return ReportLevel(
      tag = "logika",
      title = Some(st"Logika"),
      description = Some(
        st"""The following reports the experimental data obtained by running Logika
            |only on the component entrypoints that require verification (e.g. TempControl's
            |Fan component was excluded as it does not contain GUMBO contracts and does not
            |use datatypes that have invariants).  Logika was configured with a 2 second
            |validity checking timeout, a 500 millisecond satisfiability checking timeout, a
            |SMT2 resource limit of 2,000,000, and with full parallelization optimizations
            |enabled.  The SMT2 solvers used include CVC4 1.8, CVC5 1.0.5, and Z3 4.12.2. The
            |**VC** and **SAT** columns report the number of verification and
            |satisfiability conditions that were checked, respectively.  The time values
            |reported in the final three columns are the averages obtained after re-running
            |Logika 25 times for each entrypoint on an M1 Mac Mini with 8 cores and 16 GB of
            |RAM.  **TTime** gives the total number of seconds it took to run Logika
            |from the command line on the Slang project containing the entrypoint (i.e. it
            |includes the verification time along with the time required for parsing, type
            |checking, etc.).
            |
            |One optimization technique related to using Logika from within IVE that can be
            |measured via our experimental setup is Sireum's incremental type checking. For
            |example, if Logika was run on the Isolette MA component's initialize entrypoint
            |from within IVE using an identical configuration as was done for the experiments
            |then it will take on average 2.482 seconds to verify, assuming Logika had not
            |previously been invoked.  If a change was then made to MA's source code before
            |re-running Logika on the timeTriggered entrypoint then Sireum's incremental type
            |checking will only need to recheck MA (and any of its dependents) resulting in
            |an average delay of only 0.214 seconds before verification can proceed. The
            |results of these optimizations are reported in the Incremental-Type Checking
            |column (**ITCTime**).  The time required to actually verify an entrypoint with
            |a clean cache is reported in the Verification-Time column (**VTime**) so
            |incremental type checking for this example would save 2.268 seconds (2.482 -
            |0.214) on average."""),
      content = ISZ(),
      subLevels = ISZ(results, howToRun)
    )
  }

  def genArchitectureSection(project: Project, table: SymbolTable): ReportLevel = {

    var blocks: ISZ[ReportBlock] = ISZ()

    AadlModelUtil.getAadlArchDiagram(aadlRootDir) match {
      case Some(p) =>
        val rootDir = project.projectRootDir
        val rel = rootDir.relativize(p)
        val link = createHyperLink("AADL Arch", rel.value)
        blocks = blocks :+ ReportBlock("aadl-arch-diagram", Some(st"!${link}"))
      case _ =>
        halt(s"Didn't find AADL arch diagram: ${project.title}")
    }

    val tagPrefix = "aadl-arch-component-info"

    val header: ST =
      createClassifierLink(table.rootSystem.identifier,
        "system", table.rootSystem.component.classifier.get, aadlRootDir, project.projectRootDir)

    var systemProps =
      st"""|System: ${header} |
           ||--|"""


    if (table.rootSystem.getUseRawConnection()) {
      systemProps =
        st"""${systemProps}
            ||Wire Protocol|"""
    }
    blocks = blocks :+ ReportBlock(s"${tagPrefix}-${table.rootSystem.identifier}", Some(systemProps))

    val threads: ISZ[AadlThread] = sortThreads(table.getThreads(), table)
    for (thread <- threads) {
      val name = thread.identifier
      val typ: String =
        if (thread.isPeriodic()) s"Periodic: ${thread.period.get} ms"
        else "Sporadic"

      val compType: Option[String] =
        if (thread.isCakeMLComponent()) Some("||CakeML|")
        else if (thread.getParent(table).toVirtualMachine(table)) Some("||Virtual Machine|")
        else None()//"Native"

      val domain: Option[ST] = if (thread.getParent(table).getDomain(table).nonEmpty) {
        Some(st"""|Domain: ${thread.getParent(table).getDomain(table).get}|""")
      } else {
        None()
      }

      val header: ST = {
        val pos: Position = thread.component.identifier.pos.get
        createLinkFromPos(name, pos, aadlRootDir, project.projectRootDir)
      }

      val classifierLink = createClassifierLink(
        thread.component.classifier.get.name,"thread",
        thread.component.classifier.get, aadlRootDir, project.projectRootDir)

      blocks = blocks :+ ReportBlock(
        s"${tagPrefix}-${thread.identifier}",
        Some(
          st"""|Thread: ${header} |
               ||--|
               ||Classifier: ${classifierLink}|
               ${compType}
               ||${typ}|
               |${domain}
               |"""))
    }

    /*
      val proc: AadlProcessor = PeriodicUtil.getBoundProcessor(symbolTable)
      proc.getScheduleSourceText() match {
        case Some(loc) =>
          val schedule = Os.path(report.options.aadlRootDir.get) / loc
          assert(schedule.exists, schedule.canon)
          content =
            st"""$content
                |
                |**Schedule:** [${schedule.name}](${report.readmeDir.relativize(schedule).value})"""
        case _ =>
      }
    */

    return ReportLevel(
      tag = "arch-section",
      title = Some(st"AADL Architecture"),
      description = None(),
      content = blocks,
      subLevels = ISZ()
    )
  }
}