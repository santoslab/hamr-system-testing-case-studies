// #Sireum

import org.sireum._

val DSC_TIMEOUT = 10//Os.env("DSC_TIMEOUT").get
val jenkinsUserId = Os.env("JENKINS_USER_ID").get
val jenkinsToken = Os.env("JENKINS_TOKEN").get

val CURL_PREFIX=s"curl https://jenkins.cs.ksu.edu/job/0DSC_system_testing_start/buildWithParameters --user ${jenkinsUserId}:${jenkinsToken}"
var DSC_RUNNER_DIR=""
var DSC_TESTER_DIR=""

val run_MA__Normal_____Alarm_On: B = T
val run_MA__Normal_____Alarm_Unchanged: B = T
val run_MA__Normal_____Alarm_Unchanged_left: B = T
val run_MA__Normal_____Alarm_Unchanged_right: B = T
val run_MA__Normal_____Alarm_Off: B = T
val run_MA__Failing__CT____Alarm_On: B = T
val run_MA__Failing__LAT____Alarm_On: B = T
val run_MA__Failing__UAT____Alarm_On: B = T
val run_MA__Failing__Internal_Failure____Alarm_On: B = T
val run_MA__Failing__Error_Condition____Alarm_On: B = T
val run_Mode_Trans___Normal__Normal: B = T
val run_Mode_Trans___Normal__Failed__CT_Invalid: B = T
val run_Mode_Trans___Normal__Failed__LAT_Invalid: B = T
val run_Mode_Trans___Normal__Failed__UAT_Invalid: B = T
val run_Mode_Trans___Normal__Failed__Internal_Failure: B = T
val run_Mode_Trans___Normal__Failed__Error_Condition: B = T
val run_Mode_Impl__Init____Alarm_Off: B = T
val run_Mode_Impl__Failed____Alarm_On: B = T

if(run_MA__Normal_____Alarm_On) {
  // MA__Normal_____Alarm_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_On/$DSC_TIMEOUT"
  // create the result directories for MA__Normal_____Alarm_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14017206247875729464 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14017206247875729464 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_On/testRow.json".echo.runCheck()
  // trigger MA__Normal_____Alarm_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Normal_____Alarm_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Normal_____Alarm_Unchanged) {
  // MA__Normal_____Alarm_Unchanged
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged/$DSC_TIMEOUT"
  // create the result directories for MA__Normal_____Alarm_Unchanged on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11607002537910840311 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11607002537910840311 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged/testRow.json".echo.runCheck()
  // trigger MA__Normal_____Alarm_Unchanged tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Normal_____Alarm_Unchanged --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Normal_____Alarm_Unchanged_left) {
  // MA__Normal_____Alarm_Unchanged_left
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_left/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_left/$DSC_TIMEOUT"
  // create the result directories for MA__Normal_____Alarm_Unchanged_left on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/6551621291090111434 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_left/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/6551621291090111434 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_left/testRow.json".echo.runCheck()
  // trigger MA__Normal_____Alarm_Unchanged_left tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Normal_____Alarm_Unchanged_left --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Normal_____Alarm_Unchanged_right) {
  // MA__Normal_____Alarm_Unchanged_right
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_right/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_right/$DSC_TIMEOUT"
  // create the result directories for MA__Normal_____Alarm_Unchanged_right on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4921224130142505171 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_right/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4921224130142505171 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Unchanged_right/testRow.json".echo.runCheck()
  // trigger MA__Normal_____Alarm_Unchanged_right tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Normal_____Alarm_Unchanged_right --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Normal_____Alarm_Off) {
  // MA__Normal_____Alarm_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Off/$DSC_TIMEOUT"
  // create the result directories for MA__Normal_____Alarm_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/13827489003090037211 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/13827489003090037211 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Normal_____Alarm_Off/testRow.json".echo.runCheck()
  // trigger MA__Normal_____Alarm_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Normal_____Alarm_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Failing__CT____Alarm_On) {
  // MA__Failing__CT____Alarm_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__CT____Alarm_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__CT____Alarm_On/$DSC_TIMEOUT"
  // create the result directories for MA__Failing__CT____Alarm_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17785642666932446062 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__CT____Alarm_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17785642666932446062 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__CT____Alarm_On/testRow.json".echo.runCheck()
  // trigger MA__Failing__CT____Alarm_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Failing__CT____Alarm_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Failing__LAT____Alarm_On) {
  // MA__Failing__LAT____Alarm_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__LAT____Alarm_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__LAT____Alarm_On/$DSC_TIMEOUT"
  // create the result directories for MA__Failing__LAT____Alarm_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12577599953848964159 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__LAT____Alarm_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12577599953848964159 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__LAT____Alarm_On/testRow.json".echo.runCheck()
  // trigger MA__Failing__LAT____Alarm_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Failing__LAT____Alarm_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Failing__UAT____Alarm_On) {
  // MA__Failing__UAT____Alarm_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__UAT____Alarm_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__UAT____Alarm_On/$DSC_TIMEOUT"
  // create the result directories for MA__Failing__UAT____Alarm_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11397995402389474838 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__UAT____Alarm_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11397995402389474838 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__UAT____Alarm_On/testRow.json".echo.runCheck()
  // trigger MA__Failing__UAT____Alarm_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Failing__UAT____Alarm_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Failing__Internal_Failure____Alarm_On) {
  // MA__Failing__Internal_Failure____Alarm_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Internal_Failure____Alarm_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Internal_Failure____Alarm_On/$DSC_TIMEOUT"
  // create the result directories for MA__Failing__Internal_Failure____Alarm_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12240352890054586110 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Internal_Failure____Alarm_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12240352890054586110 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Internal_Failure____Alarm_On/testRow.json".echo.runCheck()
  // trigger MA__Failing__Internal_Failure____Alarm_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Failing__Internal_Failure____Alarm_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_MA__Failing__Error_Condition____Alarm_On) {
  // MA__Failing__Error_Condition____Alarm_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Error_Condition____Alarm_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Error_Condition____Alarm_On/$DSC_TIMEOUT"
  // create the result directories for MA__Failing__Error_Condition____Alarm_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17191259191727279540 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Error_Condition____Alarm_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17191259191727279540 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/MA__Failing__Error_Condition____Alarm_On/testRow.json".echo.runCheck()
  // trigger MA__Failing__Error_Condition____Alarm_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=MA__Failing__Error_Condition____Alarm_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Normal) {
  // Mode_Trans___Normal__Normal
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Normal/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Normal/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Normal on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14626583214625323059 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Normal/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14626583214625323059 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Normal/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Normal tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Normal --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__CT_Invalid) {
  // Mode_Trans___Normal__Failed__CT_Invalid
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__CT_Invalid on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/7669062578036982404 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/7669062578036982404 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__CT_Invalid tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__CT_Invalid --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__LAT_Invalid) {
  // Mode_Trans___Normal__Failed__LAT_Invalid
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__LAT_Invalid/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__LAT_Invalid/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__LAT_Invalid on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/1984063978842360721 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__LAT_Invalid/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/1984063978842360721 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__LAT_Invalid/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__LAT_Invalid tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__LAT_Invalid --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__UAT_Invalid) {
  // Mode_Trans___Normal__Failed__UAT_Invalid
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__UAT_Invalid/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__UAT_Invalid/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__UAT_Invalid on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/7758784326527720182 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__UAT_Invalid/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/7758784326527720182 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__UAT_Invalid/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__UAT_Invalid tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__UAT_Invalid --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__Internal_Failure) {
  // Mode_Trans___Normal__Failed__Internal_Failure
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__Internal_Failure on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11729755764855076728 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11729755764855076728 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__Internal_Failure tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__Internal_Failure --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__Error_Condition) {
  // Mode_Trans___Normal__Failed__Error_Condition
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__Error_Condition on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9769570869159233242 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9769570869159233242 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__Error_Condition tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__Error_Condition --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Impl__Init____Alarm_Off) {
  // Mode_Impl__Init____Alarm_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Init____Alarm_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Init____Alarm_Off/$DSC_TIMEOUT"
  // create the result directories for Mode_Impl__Init____Alarm_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/16727497036795379273 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Init____Alarm_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/16727497036795379273 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Init____Alarm_Off/testRow.json".echo.runCheck()
  // trigger Mode_Impl__Init____Alarm_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Impl__Init____Alarm_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Impl__Failed____Alarm_On) {
  // Mode_Impl__Failed____Alarm_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Failed____Alarm_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Failed____Alarm_On/$DSC_TIMEOUT"
  // create the result directories for Mode_Impl__Failed____Alarm_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12588358740925375599 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Failed____Alarm_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/12588358740925375599 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Monitor_Subsystem_DSC_Test_Harness/Mode_Impl__Failed____Alarm_On/testRow.json".echo.runCheck()
  // trigger Mode_Impl__Failed____Alarm_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Monitor_Subsystem_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.monitor1.Monitor_Subsystem_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Impl__Failed____Alarm_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Monitor_Subsystem_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

