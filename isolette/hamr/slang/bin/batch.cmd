// #Sireum

import org.sireum._

val DSC_TIMEOUT = Os.env("DSC_TIMEOUT").get
val jenkinsUserId = Os.env("JENKINS_USER_ID").get
val jenkinsToken = Os.env("JENKINS_TOKEN").get

val CURL_PREFIX=s"curl https://jenkins.cs.ksu.edu/job/0DSC_system_testing_start/buildWithParameters --user ${jenkinsUserId}:${jenkinsToken}"
var DSC_RUNNER_DIR=""
var DSC_TESTER_DIR=""

val run_HC__Normal_____Heat_On: B = T
val run_HC__Normal_____Heat_Off: B = T
val run_HC__Failing__CT____Heat_Off: B = T
val run_HC__Failing__UDT____Heat_Off: B = T
val run_HC__Failing__LDT____Heat_Off: B = T
val run_HC__Failing__Internal_Failure____Heat_Off: B = T
val run_HC__Failing__Error_Condition____Heat_Off: B = T
val run_DisplayTemp__Normal: B = T
val run_Mode_Trans___Normal__Normal: B = T
val run_Mode_Trans___Normal__Failed__CT_Invalid: B = T
val run_Mode_Trans___Normal__Failed__UDT_Invalid: B = T
val run_Mode_Trans___Normal__Failed__LDT_Invalid: B = T
val run_Mode_Trans___Normal__Failed__Internal_Failure: B = T
val run_Mode_Trans___Normal__Failed__Error_Condition: B = T
val run_Mode_Trans___Failed__Failed: B = T
val run_Mode_Impl__Init____Heat_Off: B = T
val run_Mode_Impl__Failed____Heat_Off: B = T

if(run_HC__Normal_____Heat_On) {
  // HC__Normal_____Heat_On
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/$DSC_TIMEOUT"
  // create the result directories for HC__Normal_____Heat_On on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/10426269906362489058 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/10426269906362489058 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/testRow.json".echo.runCheck()
  // trigger HC__Normal_____Heat_On tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=HC__Normal_____Heat_On --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_HC__Normal_____Heat_Off) {
  // HC__Normal_____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for HC__Normal_____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17271175238722467908 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/17271175238722467908 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_Off/testRow.json".echo.runCheck()
  // trigger HC__Normal_____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=HC__Normal_____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_HC__Failing__CT____Heat_Off) {
  // HC__Failing__CT____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__CT____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__CT____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for HC__Failing__CT____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/360562508081544988 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__CT____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/360562508081544988 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__CT____Heat_Off/testRow.json".echo.runCheck()
  // trigger HC__Failing__CT____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=HC__Failing__CT____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_HC__Failing__UDT____Heat_Off) {
  // HC__Failing__UDT____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__UDT____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__UDT____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for HC__Failing__UDT____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4798466404029642091 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__UDT____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4798466404029642091 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__UDT____Heat_Off/testRow.json".echo.runCheck()
  // trigger HC__Failing__UDT____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=HC__Failing__UDT____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_HC__Failing__LDT____Heat_Off) {
  // HC__Failing__LDT____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__LDT____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__LDT____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for HC__Failing__LDT____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4846311616261676026 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__LDT____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/4846311616261676026 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__LDT____Heat_Off/testRow.json".echo.runCheck()
  // trigger HC__Failing__LDT____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=HC__Failing__LDT____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_HC__Failing__Internal_Failure____Heat_Off) {
  // HC__Failing__Internal_Failure____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Internal_Failure____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Internal_Failure____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for HC__Failing__Internal_Failure____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/16142184719976025890 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Internal_Failure____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/16142184719976025890 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Internal_Failure____Heat_Off/testRow.json".echo.runCheck()
  // trigger HC__Failing__Internal_Failure____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=HC__Failing__Internal_Failure____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_HC__Failing__Error_Condition____Heat_Off) {
  // HC__Failing__Error_Condition____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Error_Condition____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Error_Condition____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for HC__Failing__Error_Condition____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/5243465557280003610 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Error_Condition____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/5243465557280003610 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Failing__Error_Condition____Heat_Off/testRow.json".echo.runCheck()
  // trigger HC__Failing__Error_Condition____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=HC__Failing__Error_Condition____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_DisplayTemp__Normal) {
  // DisplayTemp__Normal
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/DisplayTemp__Normal/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/DisplayTemp__Normal/$DSC_TIMEOUT"
  // create the result directories for DisplayTemp__Normal on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14415443292845894661 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/DisplayTemp__Normal/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14415443292845894661 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/DisplayTemp__Normal/testRow.json".echo.runCheck()
  // trigger DisplayTemp__Normal tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=DisplayTemp__Normal --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Normal) {
  // Mode_Trans___Normal__Normal
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Normal/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Normal/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Normal on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11911654334323961058 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Normal/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/11911654334323961058 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Normal/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Normal tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Normal --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__CT_Invalid) {
  // Mode_Trans___Normal__Failed__CT_Invalid
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__CT_Invalid on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14506779720327036814 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/14506779720327036814 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__CT_Invalid/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__CT_Invalid tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__CT_Invalid --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__UDT_Invalid) {
  // Mode_Trans___Normal__Failed__UDT_Invalid
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__UDT_Invalid/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__UDT_Invalid/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__UDT_Invalid on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9254929303563102421 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__UDT_Invalid/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/9254929303563102421 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__UDT_Invalid/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__UDT_Invalid tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__UDT_Invalid --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__LDT_Invalid) {
  // Mode_Trans___Normal__Failed__LDT_Invalid
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__LDT_Invalid/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__LDT_Invalid/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__LDT_Invalid on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/3748502610409047762 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__LDT_Invalid/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/3748502610409047762 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__LDT_Invalid/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__LDT_Invalid tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__LDT_Invalid --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__Internal_Failure) {
  // Mode_Trans___Normal__Failed__Internal_Failure
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__Internal_Failure on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/8192146459375276560 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/8192146459375276560 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Internal_Failure/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__Internal_Failure tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__Internal_Failure --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Normal__Failed__Error_Condition) {
  // Mode_Trans___Normal__Failed__Error_Condition
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Normal__Failed__Error_Condition on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/13998033563584871591 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/13998033563584871591 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Normal__Failed__Error_Condition/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Normal__Failed__Error_Condition tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Normal__Failed__Error_Condition --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Trans___Failed__Failed) {
  // Mode_Trans___Failed__Failed
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Failed__Failed/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Failed__Failed/$DSC_TIMEOUT"
  // create the result directories for Mode_Trans___Failed__Failed on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/15965650357648132998 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Failed__Failed/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/15965650357648132998 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Trans___Failed__Failed/testRow.json".echo.runCheck()
  // trigger Mode_Trans___Failed__Failed tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Trans___Failed__Failed --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Impl__Init____Heat_Off) {
  // Mode_Impl__Init____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Init____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Init____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for Mode_Impl__Init____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/718889033729343766 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Init____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/718889033729343766 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Init____Heat_Off/testRow.json".echo.runCheck()
  // trigger Mode_Impl__Init____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Impl__Init____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}

if(run_Mode_Impl__Failed____Heat_Off) {
  // Mode_Impl__Failed____Heat_Off
  DSC_RUNNER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Failed____Heat_Off/$DSC_TIMEOUT"
  DSC_TESTER_DIR = s"/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Failed____Heat_Off/$DSC_TIMEOUT"
  // create the result directories for Mode_Impl__Failed____Heat_Off on the test server and upload the json file
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_RUNNER_DIR}".echo.console.runCheck()
  proc"ssh  santos_jenkins@e2206hm02.cs.ksu.edu mkdir -p ${DSC_TESTER_DIR}".echo.console.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/16856013948254054443 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_runner/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Failed____Heat_Off/testRow.json".echo.runCheck()
  proc"scp  /private/var/folders/rv/vpf_mr9s3777p1t_0_rd52440000gq/T/16856013948254054443 santos_jenkins@e2206hm02.cs.ksu.edu:/opt/santos/jenkins/dsc_sys/dsc_tester/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/Mode_Impl__Failed____Heat_Off/testRow.json".echo.runCheck()
  // trigger Mode_Impl__Failed____Heat_Off tests on jenkins
  proc"$CURL_PREFIX --data DSC_TIMEOUT=$DSC_TIMEOUT --data DSC_PROJECT_NAME=isolette --data DSC_RUNNER_SIMPLE_NAME=Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_RUNNER_CLASS_NAME=isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness --data DSC_TEST_FAMILY_NAME=Mode_Impl__Failed____Heat_Off --data DSC_RUNNER_DIR=${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=${DSC_TESTER_DIR} --data DSC_JAR_LOC=dsc_sys/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/slang.jar --data DSC_TEST_SERVER=e2206hm02.cs.ksu.edu --data DSC_PREFIX=dsc_sys".echo.console.runCheck()
}
