// #Sireum

import org.sireum._
import Helper._

val root = Os.path("/opt") / "santos" / "jenkins" / "dsc_sys" / "dsc_tester"
var results: ISZ[Results] = ISZ()
//                  proj             subsys           family           timeout
type hsm = HashSMap[String, HashSMap[String, HashSMap[String, HashSMap[Z, Results]]]]
var map: hsm = HashSMap.empty
Os.Path.walk(root, F, T, p => {
  if (p.name == "sireum.version") {
    val paths = p.up.list

    fetch(".dump", paths) match {
      case Some(d) =>
        d.removeAll()
        println(s"Removed: dump ${d}")
      case _ =>
    }

    val testRowP = fetch(".json", p.up.up.list).get
    val passingP = fetch(".passing", paths).get
    val failingP = fetch(".failing", paths).get
    val unsatP = fetch(".unsat", paths).get
    val execP = fetch(".unsat", paths).get
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

for (projects <- map.entries) {
  val project = projects._1
  var projectResults = ISZ[Results]()
  for (systems <- projects._2.entries) {
    val sys = systems._1
    var sysResults = ISZ[Results]()
    for (families <- systems._2.entries) {
      val family = families._1
      var famResults = ISZ[Results]()
      for (timeouts <- families._2.entries) {
        val timeout = timeouts._1
        val results = timeouts._2
        famResults = famResults :+ results

        addTimeoutReport(results)
      }
    }
  }
}




object Helper {
  def addTimeoutReport(r: Results): Unit = {
    val root1 = r.passingP.up

    val oldreport = root1 / "report"
    oldreport.removeAll()

    val reportDir = root1

    val r0 = reportDir.relativize(root)
    val r1 = reportDir.relativize(root / r.project)
    val r2 = reportDir.relativize(root / r.project / r.subSystem)
    val r3 = reportDir.relativize(root / r.project / r.subSystem / r.testFamily)
    val cookieCrumb = st"""<a href="${r0}">Report</a> > <a href="${r1}">${r.project}</a> > <a href="${r2}">${r.subSystem}</a> > <a href="${r3}">${r.testFamily}</a>"""
    val subs = for (c <- coverageMap.get(r.project).get) yield st"""<a href="${reportDir.relativize(r.coverage / c._2)}">${c._1}</a>"""
    val html =
      st"""<html>
           |<body>
           |
           |<pre>
           |${cookieCrumb}
           |
           |Project:   ${r.project}
           |SubSystem: ${r.subSystem}
           |Family:    ${r.testFamily}
           |Timeout:   ${r.timeout}
           |
           |Passing:   ${r.passing}
           |Failing:   ${r.failing}
           |Unsat:     ${r.unsat}
           |
           |Coverage:  <a href="${reportDir.relativize(r.coverage)}/index.html">report</a>
           |  ${(subs, "\n")}
           |</pre>
           |<table>
           |</table>
           |</body>
           |</html>"""
    val report = reportDir / "report.html"
    report.writeOver(html.render)
    println(s"Wrote: ${report}")
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
}