// #Sireum

import org.sireum._

val sireumHome = Os.path(Os.env("SIREUM_HOME").get)
val sireumBin = sireumHome / "bin"
val sireum: Os.Path = sireumBin / (if (Os.isWin) "sireum.bat" else "sireum")

val firewall: B = F // set to T in order to tunnel, need to also turn on VPN if off-campus

val rebuild: B = T // set to T to rebuild jar with FQ_DSC_NAME as the main method provider

val testServer="e2206hm02.cs.ksu.edu" // ip address where will tests be run

val DSC_PREFIX="dsc_sys" // name of the root artifacts directory on testServer

val FQ_DSC_NAME = "RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness" // fully qualified DSC test harness name

//////////////////////////////////////////////////////////////////////////////////////
// BOILER PLATE
//////////////////////////////////////////////////////////////////////////////////////

val DSC_PROJECT_NAME = ops.ISZOps(ops.StringOps(FQ_DSC_NAME).split(c => c == '.')).first

val DSC_SIMPLE_NAME = ops.ISZOps(ops.StringOps(FQ_DSC_NAME).split(c => c == '.')).last

val DSC_SERVER_ROOT_DIR = Os.path("/opt") / "santos" / "jenkins" / DSC_PREFIX

val proxyJump = if (firewall) "-J santos_jenkins@linux.cs.ksu.edu" else ""

if (rebuild) {
  proc"$sireum proyek tipe ${Os.slashDir.up}".echo.console.runCheck()
  proc"$sireum proyek assemble -m $FQ_DSC_NAME --include-sources --include-tests ${Os.slashDir.up}".echo.console.runCheck()
}

val jarFile = Os.slashDir.up / "out" / "slang" / "assemble" / "slang.jar"
assert (jarFile.exists, s"Need to build ${jarFile}")

val jarFileDir = s"${DSC_PREFIX}/${DSC_PROJECT_NAME}/${DSC_SIMPLE_NAME}"
val jarFileDest = s"$jarFileDir/${jarFile.name}"

// upload the jar to the department's file server so that's it's accessible to
// all the test vector generating linux servers
proc"ssh santos_jenkins@linux.cs.ksu.edu mkdir -p $jarFileDir".echo.runCheck()
proc"scp ${jarFile} santos_jenkins@linux.cs.ksu.edu:${jarFileDest}".echo.runCheck()

// upload the jar to test runner server -- it's expected we'll use a non-cs hosted machine
// like the mac mini's during the testing phase as they are much faster than the old
// linux servers. Non-hosted means they're not connected to the department file system
proc"ssh $proxyJump santos_jenkins@${testServer} mkdir -p $jarFileDir".echo.runCheck()
proc"scp $proxyJump ${jarFile} santos_jenkins@${testServer}:${jarFileDest}".echo.runCheck()

var curlPrefix = st"curl https://jenkins.cs.ksu.edu/job/0DSC_system_testing_start/buildWithParameters --user $${jenkinsUserId}:$${jenkinsToken}"

// get the json file locs by calling the App associated
// with the DSC test harness (i.e. the app should be the jar's main method)
val results = proc"java -jar ${jarFile}".echo.console.run()
assert(results.ok)

val lines = ops.StringOps(results.out ).split(c => c == '\n')
assert (lines.size == 2, "Expecting only two generated json files")

val testConfigsFile = Os.path(lines(0))
val schedInfoFile = Os.path(lines(1))

val testConfigs = testConfigsFile.readLines

var runners: ISZ[ST] = ISZ()
var commands : ISZ[ST] = ISZ()
for(i <- 0 until testConfigs.size) {
  val json = ops.StringOps(testConfigs(i))
  val jsonPrefix: String = "{\"testConfigurationName\" : \""
  assert(json.startsWith(jsonPrefix))
  val testConfigurationName = json.substring(jsonPrefix.size, json.indexOfFrom('"', jsonPrefix.size + 1))

  val dsc_runner_dir = DSC_SERVER_ROOT_DIR / "dsc_runner" / DSC_PROJECT_NAME / DSC_SIMPLE_NAME / testConfigurationName / "$DSC_TIMEOUT"
  val dsc_tester_dir = DSC_SERVER_ROOT_DIR / "dsc_tester" / DSC_PROJECT_NAME / DSC_SIMPLE_NAME / testConfigurationName / "$DSC_TIMEOUT"

  if (i == 0) {
    // put the jar file into the DSC_PROJECT_NAME directory on the test server so that it can be used to merge
    // reports. This implies that making changes to the behavior code or the gumbo contract of a component means
    // the report from one DSC_PROJECT_NAME/DSC_SIMPLE_NAME may no longer be mergeable as it's line numbers no
    // longer match what's in the freshly built jar -- ie. probably need to rerun everything for DSC_PROJECT_NAME
    val serverJarLoc = dsc_tester_dir.up.up.up / jarFile.name
    proc"ssh $proxyJump santos_jenkins@${testServer} mkdir -p ${serverJarLoc.up}".echo.runCheck()
    proc"scp $proxyJump ${jarFile} santos_jenkins@${testServer}:${serverJarLoc}".echo.runCheck()
  }

  runners = runners :+ st"val run_${testConfigurationName}: B = T"

  val dataArgs = ISZ(
    "DSC_TIMEOUT=$DSC_TIMEOUT",
    s"DSC_PROJECT_NAME=$DSC_PROJECT_NAME",
    s"DSC_RUNNER_SIMPLE_NAME=$DSC_SIMPLE_NAME",
    s"DSC_RUNNER_CLASS_NAME=$FQ_DSC_NAME",
    s"DSC_TEST_FAMILY_NAME=$testConfigurationName",
    "DSC_RUNNER_DIR=$DSC_RUNNER_DIR",
    "DSC_TESTER_DIR=$DSC_TESTER_DIR",
    s"DSC_JAR_LOC=$jarFileDest",
    s"DSC_TEST_SERVER=$testServer",
    s"DSC_PREFIX=$DSC_PREFIX"
  )
  val dargs = st"${(for(d <- dataArgs) yield st"--data $d", " ")}"

  commands = commands :+
    st"""if(run_${testConfigurationName}) {
        |  // ${testConfigurationName}
        |  DSC_RUNNER_DIR = s"${dsc_runner_dir.string}"
        |  DSC_TESTER_DIR = s"${dsc_tester_dir.string}"
        |  // create the result directories for ${testConfigurationName} on the test server and upload the json files
        |  proc"ssh ${proxyJump} santos_jenkins@${testServer} mkdir -p $${DSC_RUNNER_DIR}".echo.console.runCheck()
        |  proc"ssh ${proxyJump} santos_jenkins@${testServer} mkdir -p $${DSC_TESTER_DIR}".echo.console.runCheck()
        |  proc"scp $proxyJump ${testConfigsFile.value} santos_jenkins@${testServer}:${dsc_runner_dir.up}/${testConfigsFile.name}".echo.runCheck()
        |  proc"scp $proxyJump ${testConfigsFile.value} santos_jenkins@${testServer}:${dsc_tester_dir.up}/${testConfigsFile.name}".echo.runCheck()
        |  proc"scp $proxyJump ${schedInfoFile.value} santos_jenkins@${testServer}:${dsc_runner_dir.up}/${schedInfoFile.name}".echo.runCheck()
        |  proc"scp $proxyJump ${schedInfoFile.value} santos_jenkins@${testServer}:${dsc_tester_dir.up}/${schedInfoFile.name}".echo.runCheck()
        |
        |  // trigger ${testConfigurationName} tests on jenkins
        |  proc"$$CURL_PREFIX $dargs".echo.console.runCheck()
        |}
        |"""
}

val batch =
  st"""// #Sireum
      |
      |import org.sireum._
      |
      |val DSC_TIMEOUT = Os.env("DSC_TIMEOUT").get
      |val jenkinsUserId = Os.env("JENKINS_USER_ID").get
      |val jenkinsToken = Os.env("JENKINS_TOKEN").get
      |
      |val CURL_PREFIX=s"$curlPrefix"
      |var DSC_RUNNER_DIR=""
      |var DSC_TESTER_DIR=""
      |
      |${(runners, "\n")}
      |
      |${(commands, "\n")}
      |"""

(Os.slashDir / "batch.cmd").writeOver(batch.render)
(Os.slashDir / "batch.cmd").chmod("700")