// #Sireum

import org.sireum._

val DSC_TIMEOUT = 1//Os.env("DSC_TIMEOUT").get
val jenkinsUserId = Os.env("JENKINS_USER_ID").get
val jenkinsToken = Os.env("JENKINS_TOKEN").get

val CURL_PREFIX=s"curl https://jenkins.cs.ksu.edu/job/0DSC_system_testing_start/buildWithParameters --user ${jenkinsUserId}:${jenkinsToken}"
var DSC_RUNNER_DIR=""
var DSC_TESTER_DIR=""

DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/$DSC_TIMEOUT"
DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/$DSC_TIMEOUT"
// create the result directories for TempPress_Manual_Trip on the test server and upload the json file
proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14824283222191062950 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/testRow.json".echo.runCheck()
proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14824283222191062950 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/testRow.json".echo.runCheck()
// trigger TempPress_Manual_Trip tests on jenkins
proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=TempPress_Manual_Trip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()

DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/$DSC_TIMEOUT"
DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/$DSC_TIMEOUT"
// create the result directories for Saturation_Manual_Trip on the test server and upload the json file
proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17625079880527184635 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/testRow.json".echo.runCheck()
proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17625079880527184635 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/testRow.json".echo.runCheck()
// trigger Saturation_Manual_Trip tests on jenkins
proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Saturation_Manual_Trip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()

DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/$DSC_TIMEOUT"
DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/$DSC_TIMEOUT"
// create the result directories for ALU_Satisfies_Oracle on the test server and upload the json file
proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/13869039734208294604 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/testRow.json".echo.runCheck()
proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/13869039734208294604 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/testRow.json".echo.runCheck()
// trigger ALU_Satisfies_Oracle tests on jenkins
proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=ALU_Satisfies_Oracle --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()

