# <!---title_start-->Isolette<!---title_end-->
<!---description_start-->
<!---description_end-->
## <!--arch-section-title_start-->AADL Architecture<!--arch-section-title_end-->
<!--arch-section-description_start-->
<!--arch-section-description_end-->
<!--arch-section-aadl-arch-diagram_start-->
![AADL Arch](aadl/diagrams/aadl-arch.svg)
<!--arch-section-aadl-arch-diagram_end-->
<!--arch-section-aadl-arch-component-info-isolette_single_sensor_Instance_start-->
|System: [isolette_single_sensor_Instance](aadl/aadl/packages/Isolette.aadl#L71) |
|--|
<!--arch-section-aadl-arch-component-info-isolette_single_sensor_Instance_end-->
<!--arch-section-aadl-arch-component-info-heat_controller_start-->
|Thread: [heat_controller](aadl/aadl/packages/Devices.aadl#L118) |
|--|
|Classifier: [Devices::Heat_Source.impl](aadl/aadl/packages/Devices.aadl#L135)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-heat_controller_end-->
<!--arch-section-aadl-arch-component-info-thermostat_start-->
|Thread: [thermostat](aadl/aadl/packages/Devices.aadl#L73) |
|--|
|Classifier: [Devices::Temperature_Sensor.impl](aadl/aadl/packages/Devices.aadl#L90)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-thermostat_end-->
<!--arch-section-aadl-arch-component-info-oit_start-->
|Thread: [oit](aadl/aadl/packages/Isolette.aadl#L274) |
|--|
|Classifier: [Isolette::operator_interface_thread.impl](aadl/aadl/packages/Isolette.aadl#L307)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-oit_end-->
<!--arch-section-aadl-arch-component-info-detect_monitor_failure_start-->
|Thread: [detect_monitor_failure](aadl/aadl/packages/Monitor.aadl#L43) |
|--|
|Classifier: [Monitor::Detect_Monitor_Failure.impl](aadl/aadl/packages/Monitor.aadl#L439)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-detect_monitor_failure_end-->
<!--arch-section-aadl-arch-component-info-manage_alarm_start-->
|Thread: [manage_alarm](aadl/aadl/packages/Monitor.aadl#L39) |
|--|
|Classifier: [Monitor::Manage_Alarm.impl](aadl/aadl/packages/Monitor.aadl#L321)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_alarm_end-->
<!--arch-section-aadl-arch-component-info-manage_monitor_interface_start-->
|Thread: [manage_monitor_interface](aadl/aadl/packages/Monitor.aadl#L37) |
|--|
|Classifier: [Monitor::Manage_Monitor_Interface.impl](aadl/aadl/packages/Monitor.aadl#L125)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_monitor_interface_end-->
<!--arch-section-aadl-arch-component-info-manage_monitor_mode_start-->
|Thread: [manage_monitor_mode](aadl/aadl/packages/Monitor.aadl#L41) |
|--|
|Classifier: [Monitor::Manage_Monitor_Mode.impl](aadl/aadl/packages/Monitor.aadl#L240)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_monitor_mode_end-->
<!--arch-section-aadl-arch-component-info-detect_regulator_failure_start-->
|Thread: [detect_regulator_failure](aadl/aadl/packages/Regulate.aadl#L48) |
|--|
|Classifier: [Regulate::Detect_Regulator_Failure.impl](aadl/aadl/packages/Regulate.aadl#L518)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-detect_regulator_failure_end-->
<!--arch-section-aadl-arch-component-info-manage_heat_source_start-->
|Thread: [manage_heat_source](aadl/aadl/packages/Regulate.aadl#L42) |
|--|
|Classifier: [Regulate::Manage_Heat_Source.impl](aadl/aadl/packages/Regulate.aadl#L489)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_heat_source_end-->
<!--arch-section-aadl-arch-component-info-manage_regulator_interface_start-->
|Thread: [manage_regulator_interface](aadl/aadl/packages/Regulate.aadl#L38) |
|--|
|Classifier: [Regulate::Manage_Regulator_Interface.impl](aadl/aadl/packages/Regulate.aadl#L256)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_regulator_interface_end-->
<!--arch-section-aadl-arch-component-info-manage_regulator_mode_start-->
|Thread: [manage_regulator_mode](aadl/aadl/packages/Regulate.aadl#L46) |
|--|
|Classifier: [Regulate::Manage_Regulator_Mode.impl](aadl/aadl/packages/Regulate.aadl#L383)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_regulator_mode_end-->

## <!---title_start-->Metrics<!---title_end-->
<!---description_start-->
<!---description_end-->
### <!---title_start-->AADL Metrics<!---title_end-->
<!---description_start-->
<!---description_end-->
<!---_start-->
| | |
|--|--|
|Threads|11|
|Ports|49|
|Connections|27|
<!---_end-->

### <!---title_start-->JVM Metrics<!---title_end-->
<!---description_start-->
<!---description_end-->
<!---Isolette_code_metrics_start-->
Directories Scanned Using [https://github.com/AlDanial/cloc](https://github.com/AlDanial/cloc) v1.94:
- [hamr/slang/src/main](hamr/slang/src/main)

<u><b>Total LOC</b></u>

Total number of HAMR-generated and developer-written lines of code
Language|files|blank|comment|code
:-------|-------:|-------:|-------:|-------:
Scala|144|5721|2940|25462
--------|--------|--------|--------|--------
SUM:|144|5721|2940|25462

<u><b>User LOC</b></u>

The number of lines of code written by the developer.
"Log" are lines of code used for logging that
likely would be excluded in a release build
 |Type|code |
 |--|--:|
 |Behavior|184|
 |Log|16|
 |--------|--------|
 |SUM:|200|
<!---Isolette_code_metrics_end-->

## <!--testing-title_start-->System Testing<!--testing-title_end-->
<!--testing-description_start-->
System testing requires a Sireum distribution. Instructions on how to obtain a
distribution are available at [https://sireum.org/getting-started/](https://sireum.org/getting-started/).
The rest of this documentation assumes the ``SIREUM_HOME`` environmental variable has been set and that
sireum's bin directory has been added to your path (e.g. for Linux/MacOS ``export PATH=$SIREUM_HOME/bin:$PATH``
or Windows ``set PATH=%PATH%\bin;%PATH%``


<!--testing-description_end-->
### <!--framework-generation-title_start-->Framework Generation<!--framework-generation-title_end-->
<!--framework-generation-description_start-->
1. Build the System Testing Artifact Generator following the instructions at
   [SystemTestArtifactGen/readme.md](../report/util/SystemTestArtifactGen/readme.md)
1. Run the generator by passing it the paths to one or more files that contain
   input/output container definitions

For example, running the generator on
[Regulate_Subsystem_Containers.scala](hamr/slang/src/main/util/isolette/system_tests/rst/Regulate_Subsystem_Containers.scala)
will generate the following artifacts:

1. [Example_Regulate_Subsystem_Inputs_Container_Test_wSlangCheck.scala](hamr/slang/src/test/system/isolette/system_tests/rst/Example_Regulate_Subsystem_Inputs_Container_Test_wSlangCheck.scala)

   System test suite containing an example test run configuration.  Developers can make a copy of this file and then define
   custom test run configurations where each configuration has the structure
   _(script schema, property, randomization profile, random vector filter)_

1. [Example_Regulate_Subsystem_Inputs_Container_DSC_Test_Harness.scala](hamr/slang/src/test/system/isolette/system_tests/rst/Example_Regulate_Subsystem_Inputs_Container_DSC_Test_Harness.scala)

      Example showing how a system test suite can be adapted for use with Distributed SlangCheck (DSC). It overrides/implements
   two DCS methods, ``next`` and ``test``.  The next method is called during DSC's test vector generation phase. The generated
   vectors are subsequently passed to the test method during DSC's testing phase. Both methods use the environment variable
   ``DSC_TEST_FAMILY_NAME`` to determine which test run configuration should be used.


<!--framework-generation-description_end-->

### <!--manual-testing-title_start-->Manual System Testing<!--manual-testing-title_end-->
<!--manual-testing-description_start-->
The example system test suites described previously were used to write
system tests for the Regulator subsystem and Monitor subsystem as follows:
<!--manual-testing-description_end-->
<!--manual-testing-Regulator subsystem_block_start-->
__Regulator subsystem__

  System Test Suite Class: [Regulate_Subsystem_Test_wSlangCheck.scala](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala)

  Test run configurations are specified via entries in the [testMatrix](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L49). For example,
  the [HC__Normal_____Heat_On](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L56) configuration uses the following:

  | | |
  |--|--|
  | Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299) |
  | Property: | [sysProp_NormalModeHeatOn](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L436) |
  | Randomization Profile: | [validRanges](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L261) |
  | Random Vector Filter: | [system_Pre_Container](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Inputs_Container_GumboX.scala#L46) |

  How to run:

  ```
  cd hamr-system-testing-case-studies

  sireum proyek test --suffixes Regulate_Subsystem_Test_wSlangCheck isolette/hamr/slang
  ```


<!--manual-testing-Regulator subsystem_block_end-->
<!--manual-testing-Monitor subsystem_block_start-->
__Monitor subsystem__

  System Test Suite Class: [Monitor_Subsystem_Test_wSlangCheck.scala](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala)

  Test run configurations are specified via entries in the [testMatrix](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L52). For example,
  the [MA__Normal_____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L53) configuration uses the following:

  | | |
  |--|--|
  | Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L307) |
  | Property: | [sysProp_NormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L372) |
  | Randomization Profile: | [validRanges](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L593) |
  | Random Vector Filter: | [assumeFigureA_7](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303) |

  How to run:

  ```
  cd hamr-system-testing-case-studies

  sireum proyek test --suffixes Monitor_Subsystem_Test_wSlangCheck isolette/hamr/slang
  ```


<!--manual-testing-Monitor subsystem_block_end-->

### <!--dsc-testing-title_start-->Distributed SlangCheck System Testing<!--dsc-testing-title_end-->
<!--dsc-testing-description_start-->
Background:

System testing as put forth in this paper uses SlangCheck to generate input/injection test vectors.
SlangCheck is Sireum's randomized
test generator framework similar to ScalaCheck and Haskell's QuickCheck.
Distributed SlangCheck (DSC) adds a framework that allows test vector
generation to be run via a server cluster up to a user specified timeout. Increasing
the timeout allows more vectors to be produced which may lead to increased code
coverage during testing. DSC passes the vectors to user defined unit tests
and serializes the
passing and failing vectors to seperate files so that they can be replayed if needed.
DSC uses JaCoCo to produce code coverage information.

Approach:

The HC__Normal_____Heat_On configuration of Isolette's
Regulate_Subsystem_Test_wSlangCheck test suite will be used to
illustrate how system testing can employ DSC.  The actual results reported in the next
section simply automated the following steps such that each configuration was run with timeouts
of 1, 5, 10, and 30 seconds using a Jenkins cluster.

Create a jar file for this project that includes the sources and tests suites

```
cd hamr-system-testing-case-studies

sireum proyek assemble --include-sources --include-tests isolette/hamr/slang
```

Set the environment variable ``DSC_TEST_FAMILY_NAME`` to indicate which configuration
should be used

```
export DSC_TEST_FAMILY_NAME=HC__Normal_____Heat_On
```

The following will repeatedly call Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness's next method for 1 second to generate test vectors
and store them in a local file (DSC can be
configured to scp the results to a remote server where they can be combined with vectors
generated from other 'generating' servers)
```
sireum tools slangcheck runner\
  -t 1\
  -o $(pwd)/isolette-dsc.jsons\
  -c isolette/hamr/slang/out/slang/assemble/slang.jar\
  isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness
```

DSC is designed to only report passing and failing test vectors.  The generated DSC
test harness test methods extend this by invoking the configuration's random vector filter and
writing out unsat vectors to a file specified via the ``DSC_SAVE_LOC`` environment variable.
```
export DSC_SAVE_LOC=$(pwd)/isolette-dsc-output.unsat
touch $DSC_SAVE_LOC
```

The following will pass each text vector to the Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness's test method,
record the passing/failing/unsat test vectors in separate files and generate an HTML
report that combines the coverage information across all the runs.
```
sireum tools slangcheck tester\
  -i $(pwd)/isolette-dsc.jsons.dsc.7z\
  -o $(pwd)/isolette-dsc-output\
  --coverage $(pwd)/isolette-jacoco\
  -c isolette/hamr/slang/out/slang/assemble/slang.jar\
  --sourcepath isolette/hamr/slang/out/slang/assemble/slang.jar\
  isolette.system_tests.rst.Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness
```

Results:

The full experimental results for the Isolette are available at:<br>
[https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/report.html)

<br><br>
The following table explains the report directory structure,
starting with the results from a specific run of DSC and then walking
up the report directory hierarchy.

||
|-|
|[isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/1](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/1/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for the HC__Normal_____Heat_On configuration with a 1 second timeout<br><br>__NOTE__ this is what DSC was actually run on.  The following rows are simply aggregate information |
|[isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for the MA__Failing__CT____Alarm_On configuration using timeouts of 1, 5, and 10 seconds |
|[isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for running all the configurations through Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness using timeouts of 1, 5, and 10 seconds |
|[isolette](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for each of the Isolette's subsystems under testing using timeouts of 1, 5, and 10 seconds |

<!--dsc-testing-description_end-->
