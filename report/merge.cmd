// #Sireum

import org.sireum._
import Helper._

val removeDump: B = F
val regenMergedReports: B = F

val root = Os.path("/opt") / "santos" / "jenkins" / "dsc_sys" / "dsc_tester"
//val root = Os.path("/opt") / "santos" / "jenkins" / "dsc_sys" / "dsc_tester__BACKUP_14_08"

var results: ISZ[Results] = ISZ()
//                  proj             subsys           family           timeout
type hsm = HashSMap[String, HashSMap[String, HashSMap[String, HashSMap[Z, Results]]]]
var map: hsm = HashSMap.empty
Os.Path.walk(root, F, T, p => {
  if (p.name == "sireum.version") {
    val paths = p.up.list

    fetch(".dump", paths) match {
      case Some(d) if removeDump =>
        d.removeAll()
        println(s"Removed: dump ${d}")
      case _ =>
    }

    val testRowP = fetch(".json", p.up.up.list).get
    val passingP = fetch(".passing", paths).get
    val failingP = fetch(".failing", paths).get
    val unsatP = fetch(".unsat", paths).get
    val execP = fetch(".exec", paths).get
    val csvP = fetch(".csv", paths).get
    val coverageP = fetch(".coverage", paths).get

    val r = Results(
      project = p.up.up.up.up.name,
      subSystem = p.up.up.up.name,
      testFamily = p.up.up.name,
      timeout = Z(p.up.name).get,
      testRow = parseJson(testRowP),
      testRowP = testRowP,
      passing = numVectors(passingP),
      failing = numVectors(failingP),
      unsat = numVectors(unsatP),
      passingP = passingP,
      failingP = failingP,
      unsatP = unsatP,
      exec = execP,
      csv = csvP,
      coverage = coverageP
    )
    results = results :+ r
    map = add2Map(r, map)
  }
  F
})

var topLevelProjs: ISZ[(String, Os.Path)] = ISZ()
for (projects <- map.entries) {
  var projectResults = ISZ[Results]()
  for (systems <- projects._2.entries) {
    var systemResults = ISZ[Results]()
    for (families <- systems._2.entries) {
      var familyResults = ISZ[Results]()
      for (timeouts <- families._2.entries) {
        val results = timeouts._2
        familyResults = familyResults :+ results
        systemResults = systemResults :+ results
        projectResults = projectResults :+ results
        addTimeoutReport(results)
      }
      val familyRoot = familyResults(0).passingP.up.up
      val fResults: Results = mergeResults(familyResults, familyRoot)
      addFamilyReport(fResults, families._2.keys, familyRoot)
    }
    val sysRoot = systemResults(0).passingP.up.up.up
    val sResults: Results = mergeResults(systemResults, sysRoot)
    addSystemReport(sResults, systems._2.keys, sysRoot)
  }
  val pRoot = projectResults(0).passingP.up.up.up.up
  val pResults: Results = mergeResults(projectResults, pRoot)
  addProjectReport(pResults, projects._2.keys, pRoot)

  topLevelProjs = topLevelProjs :+ (projects._1, pRoot)
}

addRootReport(root, topLevelProjs)


object Helper {

  def reportTemplate(cookieCrumbs: ST,
                     project: ST,
                     system: Option[ST],
                     families: Option[ST],
                     timeouts: Option[ST],
                     stats: Option[Results],
                     coverage: Option[(ST, ISZ[ST])]): ST = {

    @strictpure def wrap(n: String, title: String, o: Option[ST]): Option[ST] =
      if (o.nonEmpty) Some(st"""<tr><td id=col_a title="$title">${n}: </td><td>${o.get}<br><br></td></tr>""")
      else None()

    val stats_ : Option[ST] = {
      stats match {
        case Some(s) =>
          Some(
            st"""<tr>
                |  <td id=col_a title="Number of test vectors that passed">Passing:</td><td>${s.passing}</td>
                |</tr><tr>
                |  <td id=col_a title="Number of test vectors that failed">Failing:</td><td>${s.failing}</td>
                |</tr><tr>
                |  <td id=col_a title="Number of test vectors that failed to satisfy filter">Unsat:</td><td>${s.unsat}<br><br></td>
                |</tr>""")

        case _ => None()
      }
    }

    val coverage_ : Option[ST] =
      if (coverage.nonEmpty)
        Some(st"""<tr>
                 |  <td id=col_a title = "Combined code coverage information">Coverage:</td><td>${coverage.get._1}<br><br><br>
                 |
                 |                                                                              Select Classes<br><br>
                 |                                                                              ${(coverage.get._2, "<br>\n")}</td>
                 |</tr>""")
      else None()

    return(
      st"""<html>
          |  <head>
          |    <style>
          |      td { vertical-align: top; }
          |      #col_a { font-weight: bold; }
          |    </style>
          |  </head>
          |  <body>
          |
          |<pre>
          |$cookieCrumbs
          |
          |<br><br>
          |
          |<table>
          |  <tr><td id=col_a title="Project name">Projects:</td><td>$project<br><br></td></tr>
          |    ${wrap("Sub-Systems", "The sub-system(s) testing was run on", system)}
          |    ${wrap("Profiles", "The test profile(s) used during testing", families)}
          |    ${wrap("Timeouts", "The timeout(s) used while generating test vectors", timeouts)}
          |    $stats_
          |    $coverage_
          |  </table>
          |</pre>
          |
          |  </body>
          |</html>
          |""")
  }

  def cookies(ps: ISZ[(String, Os.Path)]): ST = {
    val x = for(p <- ps) yield st"""<a href="${p._2}">${p._1}</a>"""
    return st"${(x, " > ")}"
  }

  def addTimeoutReport(r: Results): Unit = {
    val root1 = r.passingP.up

    val reportDir = root1

    val r0 = reportDir.relativize(root / "report.html")
    val r1 = reportDir.relativize(root / r.project / "report.html")
    val r2 = reportDir.relativize(root / r.project / r.subSystem / "report.html")
    val r3 = reportDir.relativize(root / r.project / r.subSystem / r.testFamily / "report.html")

    val cookieCrumb = cookies(ISZ(("Report", r0), (r.project, r1), (r.subSystem, r2), (r.testFamily, r3)))
    val subs = for (c <- coverageMap.get(r.project).get) yield st"""<a href="${reportDir.relativize(r.coverage / c._2)}">${c._1}</a>"""
    val html = reportTemplate(cookieCrumbs = cookieCrumb,
      project = st"""<a href="$r1">${r.project}</a>""",
      system = Some(st"""<a href="$r2">${r.subSystem}</a>"""),
      families = Some(st"""<a href="$r3">${r.testFamily}</a>"""),
      timeouts = Some(st"""${r.timeout}"""),
      stats = Some(r),
      coverage = Some(st"""<a href="${reportDir.relativize(r.coverage)}/index.html">Full Report</a>""", subs)
    )
    val report = reportDir / "report.html"
    report.writeOver(html.render)
    println(s"Wrote: ${report}")
  }

  def addFamilyReport(r: Results, timeouts: ISZ[Z], froot: Os.Path): Unit = {
    val reportDir = froot

    val r0 = reportDir.relativize(root / "report.html")
    val r1 = reportDir.relativize(root / r.project / "report.html")
    val r2 = reportDir.relativize(root / r.project / r.subSystem / "report.html")

    val stimeouts = ops.ISZOps(timeouts).sortWith((a,b) => a <= b)
    val timeOuts = for(t <- stimeouts) yield s"<a href=\"${(reportDir.relativize(reportDir / t.string / "report.html")).string}\">${t.string}</a>"

    val cookieCrumb = cookies(ISZ(("Report", r0), (r.project, r1), (r.subSystem, r2)))
    val subs = for (c <- coverageMap.get(r.project).get) yield st"""<a href="${reportDir.relativize(r.coverage / c._2)}">${c._1}</a>"""
    val html = reportTemplate(cookieCrumbs = cookieCrumb,
      project = st"""<a href="$r1">${r.project}</a>""",
      system = Some(st"""<a href="$r2">${r.subSystem}</a>"""),
      families = Some(st"""${r.testFamily} : ${r.testRow.get("testDescription").get}"""),
      timeouts = Some(st"""${(timeOuts, " ")}"""),
      stats = Some(r),
      coverage = Some(st"""<a href="${reportDir.relativize(r.coverage)}/index.html">Full Report</a>""", subs)
    )
    val report = reportDir / "report.html"
    report.writeOver(html.render)
    println(s"Wrote: ${report}")
  }

  def addSystemReport(r: Results, families: ISZ[String], sroot: Os.Path): Unit = {
    val reportDir = sroot

    val r0 = reportDir.relativize(root / "report.html")
    val r1 = reportDir.relativize(root / r.project / "report.html")

    val famOuts = for(t <- families) yield s"""<a href="${(reportDir.relativize(reportDir / t / "report.html")).string}">${t.string}</a><br>"""

    val cookieCrumb = cookies(ISZ(("Report", r0), (r.project, r1)))
    val subs = for (c <- coverageMap.get(r.project).get) yield st"""<a href="${reportDir.relativize(r.coverage / c._2)}">${c._1}</a>"""

    val html = reportTemplate(
      cookieCrumbs = cookieCrumb,
      project = st"""<a href="$r1">${r.project}</a>""",
      system = Some(st"${r.subSystem}"),
      families = Some(st"${(famOuts, " ")}"),
      timeouts= None(),
      stats = Some(r),
      coverage = Some(st"""<a href="${reportDir.relativize(r.coverage)}/index.html">Full Report</a>""", subs)
    )

    val report = reportDir / "report.html"
    report.writeOver(html.render)
    println(s"Wrote: ${report}")
  }

  def addProjectReport(r: Results, systems: ISZ[String], sroot: Os.Path): Unit = {
    val reportDir = sroot

    val r0 = reportDir.relativize(root / "report.html")

    val sysOuts = for(sys <- systems) yield s"<a href=\"${(reportDir.relativize(reportDir / sys / "report.html")).string}\">${sys.string}</a><br><br>"

    val cookieCrumb = cookies(ISZ(("Report", r0)))
    val subs = for (c <- coverageMap.get(r.project).get) yield st"""<a href="${reportDir.relativize(r.coverage / c._2)}">${c._1}</a>"""
    val html = reportTemplate(
      cookieCrumbs = cookieCrumb,
      project = st"${r.project}",
      system = Some(st"${(sysOuts, " ")}"),
      families = None(),
      timeouts = None(),
      stats = Some(r),
      coverage = Some(st"""<a href="${reportDir.relativize(r.coverage)}/index.html">Full Report</a>""", subs)
    )
    val report = reportDir / "report.html"
    report.writeOver(html.render)
    println(s"Wrote: ${report}")
  }

  def addRootReport(root: Os.Path, topLevelProjs: ISZ[(String, Os.Path)]): Unit = {
    val projects = for (p <- topLevelProjs) yield st"""<a href="${root.relativize(p._2 / "report.html")}">${p._1}</a>"""
    val html = reportTemplate(
      cookieCrumbs = st"",
      project = st"${(projects, "<br><br>")}",
      system = None(),
      families = None(),
      timeouts = None(),
      stats = None(),
      coverage = None()
    )
    val f = root / "report.html"
    f.writeOver(html.render)
    println(s"Wrote: $f")
  }


  def jarLoc(project: String): Os.Path = {
    project match {
      case string"isolette" => Os.home / "devel" / "git" / "hamr-system-testing-case-studies" / "isolette/hamr/slang/out/slang/assemble/slang.jar"
      case string"RTS" => Os.home / "devel" / "git" / "hamr-system-testing-case-studies" / "rts/hamr/slang/out/slang/assemble/slang.jar"
      case _ => halt(s"Unexpected ${project}")
    }
  }

  def dumpLoc(project: String): Os.Path = {
    project match {
      case string"isolette" => Os.path("/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__CT____Alarm_On/1/isolette_Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_1_mac-mini-m1-jacoco.dump")
      case string"RTS" => Os.path("/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/1/RTS_Actuation_Subsystem_DSC_Test_Harness_ALU_Satisfies_Oracle_1_mac-mini-m1-jacoco.dump")
      case _ => halt(s"Unexpected ${project}")
    }
  }

  val coverageMap: Map[String, ISZ[(String, String)]] = {
    var m: Map[String, ISZ[(String, String)]] = Map.empty
    m = m + "isolette" ~> ISZ(
      ("MonDMF", "isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure.scala.html#L15"),
      ("MonMA", "isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.scala.html#L45"),
      ("MonMMI", "isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.scala.html#L40"),
      ("MonMMM", "isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala.html"),

      ("RegDRF", "isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure.scala.html#L16"),
      ("RegMHS", "isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.scala.html#L48"),
      ("RegMRI", "isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.scala.html#L39"),
      ("RegMRM", "isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.scala.html#L41")
    )
    m = m + "RTS" ~> ISZ(
      ("SAU", "RTS.Actuation/Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator.scala.html#L37"),
      ("TPA", "RTS.Actuation/Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator.scala.html#L36"),

      ("AU1_PL","RTS.Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic.scala.html#L30"),
      ("AU1_SL", "RTS.Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic.scala.html#L30"),
      ("AU1_TL", "RTS.Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic.scala.html#L30"),

      ("AU2_PL", "RTS.Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic.scala.html#L30"),
      ("AU2_SL", "RTS.Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic.scala.html#L30"),
      ("AU2_TL", "RTS.Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic.scala.html#L30"),

      ("AU1_TPTO", "RTS.Actuation/OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.scala.html#L30"),
      ("AU2_TPTO", "RTS.Actuation/OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic.scala.html#L30"),

      ("ASA", "RTS.Actuation/OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic.scala.html#L30"),
      ("ATPA","RTS.Actuation/OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic.scala.html#L30")
    )
    m
  }

  //                                        isolette        mon               famil            time
  def add2Map(r: Results, projMap: HashSMap[String, HashSMap[String, HashSMap[String, HashSMap[Z, Results]]]]): hsm = {
    var sysMap: HashSMap[String, HashSMap[String, HashSMap[Z, Results]]] = projMap.get(r.project) match {
      case Some(sysmap) => sysmap
      case _ => HashSMap.empty[String, HashSMap[String, HashSMap[Z, Results]]]()
    }
    val famMap: HashSMap[String, HashSMap[Z, Results]] = sysMap.get(r.subSystem) match {
      case Some(projmap) => projmap
      case _ => HashSMap.empty[String, HashSMap[Z, Results]]()
    }
    val timMap: HashSMap[Z, Results] = famMap.get(r.testFamily) match {
      case Some(timmap) => timmap
      case _ => HashSMap.empty[Z, Results]()
    }
    assert(!timMap.contains(r.timeout))

    return projMap + r.project ~> (sysMap + (r.subSystem ~> (famMap + r.testFamily ~> (timMap + (r.timeout ~> r)))))

  }

  def parseJson(p: Os.Path): HashSMap[String, String] = {
    val keys: ISZ[String] = ISZ("testFamilyName", "testDescription", "testMethodName", "property", "profile")
    return parseJsonH(keys, p.read)
  }

  def parseJsonH(keys: ISZ[String], str: String): HashSMap[String, String] = {
    val p = org.sireum.Json.Parser.create(str)
    p.parseObjectBegin()
    var entries = HashSMap.empty[String, String]()
    do {
      val key = p.parseObjectKeys(keys)
      val value = p.parseString()
      entries = entries + key ~> value
    } while (p.parseObjectNext())

    return entries
  }

  @datatype class Results(project: String,
                          subSystem: String,
                          testFamily: String,
                          timeout: Z,

                          val testRow:  HashSMap[String, String],
                          val testRowP: Os.Path,

                          val passing: Z,
                          val failing: Z,
                          val unsat: Z,

                          val passingP: Os.Path,
                          val failingP: Os.Path,
                          val unsatP: Os.Path,

                          val exec: Os.Path,
                          val csv: Os.Path,
                          val coverage: Os.Path)

  def fetch(suffix: String, paths: ISZ[Os.Path]): Option[Os.Path] = {
    return (ops.ISZOps(paths).filter(f => ops.StringOps(f.name).endsWith(suffix)) match {
      case ISZ(e) => Some(e)
      case _ => None()
    })
  }

  def numVectors(p: Os.Path): Z = {
    return ops.StringOps(p.read).split(c => c == '\n').size
  }


  def mergeResults(results: ISZ[Results], relativeTo: Os.Path): Results = {
    var (passing, failing, unsat): (Z, Z, Z) = (0, 0, 0)
    var execsPaths: ISZ[Os.Path] = ISZ()
    for (r <- results) {
      passing = passing + r.passing
      failing = failing + r.failing
      unsat = unsat + r.unsat
      execsPaths = execsPaths :+ r.exec
    }

    val jacocoOutDir = relativeTo / "jacocoCoverage"

    if (regenMergedReports) {
      val jacocoCli = Os.home / "devel" / "sireum" / "kekinian" / "lib" / "jacococli.jar"
      //val projJar = jarLoc(results(0).project)
      val projDump = dumpLoc(results(0).project)

      val csv = relativeTo / "jacoco.csv"

      val sireumHome = Sireum.homeOpt.get
      val javaExe = Sireum.javaHomeOpt.get / "bin" / (if (Os.isWin) "java.exe" else "java")

      val execs = for(x <- execsPaths) yield x.string

      println(s"Working on ${relativeTo.string} ...")
      val commands = ISZ[String](javaExe.string, "-jar", jacocoCli.string, "report") ++ execs ++ ISZ[String]("--encoding",
        "UTF-8", "--classfiles", projDump.string, "--csv", csv.string, "--html", jacocoOutDir.string, "--sourcefiles", projDump.string)

      //println(commands)
      Os.proc(commands).console.echo.runCheck()
      println()
    }

    val x = results(0)(passing = passing, failing = failing, unsat = unsat, coverage = jacocoOutDir)

    return x
  }
}
