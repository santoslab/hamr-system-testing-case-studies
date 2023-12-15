// #Sireum

import org.sireum._

val DSC_TIMEOUT = 10//Os.env("DSC_TIMEOUT").get
val jenkinsUserId = Os.env("JENKINS_USER_ID").get
val jenkinsToken = Os.env("JENKINS_TOKEN").get

val CURL_PREFIX=s"curl https://jenkins.cs.ksu.edu/job/0DSC_system_testing_start/buildWithParameters --user ${jenkinsUserId}:${jenkinsToken}"
var DSC_RUNNER_DIR=""
var DSC_TESTER_DIR=""

val run_TempPress_Manual_Trip: B = T
val run_Saturation_Manual_Trip: B = T
val run_AU1TempTrip: B = T
val run_AU1PressTrip: B = T
val run_AU1SatTrip: B = T
val run_AU2TempTrip: B = T
val run_AU2PressTrip: B = T
val run_AU2SatTrip: B = T
val run_TempPressTripCausality: B = T
val run_SatTripCausality: B = T
val run_ALU_Satisfies_Oracle: B = T

if(run_TempPress_Manual_Trip) {
  // TempPress_Manual_Trip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/$DSC_TIMEOUT"
  // create the result directories for TempPress_Manual_Trip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4685679851356058908 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4685679851356058908 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPress_Manual_Trip/testRow.json".echo.runCheck()
  // trigger TempPress_Manual_Trip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=TempPress_Manual_Trip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Saturation_Manual_Trip) {
  // Saturation_Manual_Trip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/$DSC_TIMEOUT"
  // create the result directories for Saturation_Manual_Trip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12987741580412807406 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12987741580412807406 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/Saturation_Manual_Trip/testRow.json".echo.runCheck()
  // trigger Saturation_Manual_Trip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Saturation_Manual_Trip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_AU1TempTrip) {
  // AU1TempTrip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1TempTrip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1TempTrip/$DSC_TIMEOUT"
  // create the result directories for AU1TempTrip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9082766382274913812 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1TempTrip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9082766382274913812 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1TempTrip/testRow.json".echo.runCheck()
  // trigger AU1TempTrip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=AU1TempTrip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_AU1PressTrip) {
  // AU1PressTrip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1PressTrip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1PressTrip/$DSC_TIMEOUT"
  // create the result directories for AU1PressTrip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/1793342795901030907 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1PressTrip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/1793342795901030907 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1PressTrip/testRow.json".echo.runCheck()
  // trigger AU1PressTrip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=AU1PressTrip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_AU1SatTrip) {
  // AU1SatTrip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1SatTrip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1SatTrip/$DSC_TIMEOUT"
  // create the result directories for AU1SatTrip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/1382048250190541996 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1SatTrip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/1382048250190541996 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU1SatTrip/testRow.json".echo.runCheck()
  // trigger AU1SatTrip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=AU1SatTrip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_AU2TempTrip) {
  // AU2TempTrip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2TempTrip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2TempTrip/$DSC_TIMEOUT"
  // create the result directories for AU2TempTrip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/7456811483520864694 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2TempTrip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/7456811483520864694 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2TempTrip/testRow.json".echo.runCheck()
  // trigger AU2TempTrip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=AU2TempTrip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_AU2PressTrip) {
  // AU2PressTrip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2PressTrip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2PressTrip/$DSC_TIMEOUT"
  // create the result directories for AU2PressTrip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/10866178090082607055 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2PressTrip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/10866178090082607055 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2PressTrip/testRow.json".echo.runCheck()
  // trigger AU2PressTrip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=AU2PressTrip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_AU2SatTrip) {
  // AU2SatTrip
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2SatTrip/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2SatTrip/$DSC_TIMEOUT"
  // create the result directories for AU2SatTrip on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/6087987231081916498 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2SatTrip/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/6087987231081916498 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/AU2SatTrip/testRow.json".echo.runCheck()
  // trigger AU2SatTrip tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=AU2SatTrip --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_TempPressTripCausality) {
  // TempPressTripCausality
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPressTripCausality/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPressTripCausality/$DSC_TIMEOUT"
  // create the result directories for TempPressTripCausality on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9740210191055023184 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPressTripCausality/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9740210191055023184 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/TempPressTripCausality/testRow.json".echo.runCheck()
  // trigger TempPressTripCausality tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=TempPressTripCausality --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_SatTripCausality) {
  // SatTripCausality
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/SatTripCausality/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/SatTripCausality/$DSC_TIMEOUT"
  // create the result directories for SatTripCausality on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/15723253353790270533 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/SatTripCausality/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/15723253353790270533 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/SatTripCausality/testRow.json".echo.runCheck()
  // trigger SatTripCausality tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=SatTripCausality --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_ALU_Satisfies_Oracle) {
  // ALU_Satisfies_Oracle
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/$DSC_TIMEOUT"
  // create the result directories for ALU_Satisfies_Oracle on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/3811248657970608546 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/3811248657970608546 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/RTS/Actuation_Subsystem_DSC_Test_Harness/ALU_Satisfies_Oracle/testRow.json".echo.runCheck()
  // trigger ALU_Satisfies_Oracle tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=RTS --data DSC_RUNNER_SIMPLE_NAME=Actuation_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=RTS.system_tests.rts1.Actuation_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=ALU_Satisfies_Oracle --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/RTS/Actuation_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

