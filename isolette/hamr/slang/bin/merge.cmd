// #Sireum

import org.sireum._

val sireumHome = Sireum.homeOpt.get
val javaExe = Sireum.javaHomeOpt.get / "bin" / (if (Os.isWin) "java.exe" else "java")
val jacocoCli = sireumHome / "lib" / "jacococli.jar"

val dscRoot =  Os.path("/") / "opt" / "santos" / "jenkins" / "dsc_sys"

val dsc_test = dscRoot / "dsc_tester"
val dest = Os.path("/") / "opt" / "santos" / "jenkins" / "dsc_sys" / "merged"

val execs = Os.Path.walk(dsc_test, T, F, x => x.ext == "exec")
assert(execs.nonEmpty)

val execsStr: ISZ[String] = for (e <- execs) yield e.value

val destFile = dest / "combined.exec"
destFile.up.mkdirAll()

val commands = (ISZ[String](javaExe.string, "-jar", jacocoCli.string, "merge") ++ execsStr) ++
  ISZ[String]("--destfile", destFile.value)

Os.proc(commands).echo.console.runCheck()

val loc = "/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/t8/1/isolette_Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_t8_1_mac-mini-m1-jacoco.dump"
val dumpLoc = Os.path(loc)

val csv = dest / "merged.csv"
val html = dest / "html"
html.mkdirAll()

val commands2 = ISZ[String](javaExe.string, "-jar", jacocoCli.string, "report", destFile.value, "--encoding",
  "UTF-8", "--classfiles", dumpLoc.string, "--csv", csv.string, "--html", html.string, "--sourcefiles", dumpLoc.string)

Os.proc(commands2).echo.console.runCheck()