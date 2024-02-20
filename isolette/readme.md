# <!--start__isolette-title-->Isolette<!--end____isolette-title-->
<!--start__isolette-description-->
The data, links, and images in this file are auto-generated from HAMR's report generation facility. Additional text explanations have been added for readability.
<!--end____isolette-description-->
## <!--start__isolette_arch-section-title-->AADL Architecture<!--end____isolette_arch-section-title-->
<!--start__isolette_arch-section-description-->
![AADL Arch](aadl/diagrams/aadl-arch.svg)

The following documentation blocks provide links to AADL textual representation source of the Thread components in the system.
* "Type" links to the AADL component type declaration (providing the port-based interface for the component)
* "Behavior Specification" (when present) links to the GUMBO behavior contract for the component. HAMR automatically
compiles the GUMBO contract to both an code-level contract used for Logika code verification as well as an executable
representation of the contract (as pure boolean functions) used in unit and system testing.
<!--end____isolette_arch-section-description-->
<!--start__isolette_arch-section_aadl-arch-component-info-isolette_single_sensor_instance-->
|System: [Isolette::isolette.single_sensor](aadl/aadl/packages/Isolette.aadl#L71)|
|:--|
<!--end____isolette_arch-section_aadl-arch-component-info-isolette_single_sensor_instance-->
<!--start__isolette_arch-section_aadl-arch-component-info-heat_controller-hs-->
|Thread: HS <!--[heat_controller](aadl/aadl/packages/Devices.aadl#L118)--> |
|:--|
|Type: [Devices::Heat_Source](aadl/aadl/packages/Devices.aadl#L124)<br>Implementation: [Devices::Heat_Source.impl](aadl/aadl/packages/Devices.aadl#L135)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-heat_controller-hs-->
<!--start__isolette_arch-section_aadl-arch-component-info-thermostat-ts-->
|Thread: TS <!--[thermostat](aadl/aadl/packages/Devices.aadl#L73)--> |
|:--|
|Type: [Devices::Temperature_Sensor](aadl/aadl/packages/Devices.aadl#L79)<br>Implementation: [Devices::Temperature_Sensor.impl](aadl/aadl/packages/Devices.aadl#L90)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-thermostat-ts-->
<!--start__isolette_arch-section_aadl-arch-component-info-oit-opinterface-->
|Thread: OpInterface <!--[oit](aadl/aadl/packages/Isolette.aadl#L274)--> |
|:--|
|Type: [Isolette::operator_interface_thread](aadl/aadl/packages/Isolette.aadl#L287)<br>Implementation: [Isolette::operator_interface_thread.impl](aadl/aadl/packages/Isolette.aadl#L307)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-oit-opinterface-->
The following Thread components will house the application logic for the Isolette's safety monitoring (Monitor) subsystem. Each of these components has a GUMBO contract that is used in the component and system implementations for component-level SMT-based verification, unit testing, and system testing.
<!--start__isolette_arch-section_aadl-arch-component-info-manage_alarm-monma-->
|Thread: MonMA <!--[manage_alarm](aadl/aadl/packages/Monitor.aadl#L39)--> |
|:--|
|Type: [Monitor::Manage_Alarm](aadl/aadl/packages/Monitor.aadl#L297)<br>Implementation: [Monitor::Manage_Alarm.impl](aadl/aadl/packages/Monitor.aadl#L407)<br>Behavior Specification: [GUMBO](aadl/aadl/packages/Monitor.aadl#L317)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-manage_alarm-monma-->
<!--start__isolette_arch-section_aadl-arch-component-info-manage_monitor_interface-monmmi-->
|Thread: MonMMI <!--[manage_monitor_interface](aadl/aadl/packages/Monitor.aadl#L37)--> |
|:--|
|Type: [Monitor::Manage_Monitor_Interface](aadl/aadl/packages/Monitor.aadl#L96)<br>Implementation: [Monitor::Manage_Monitor_Interface.impl](aadl/aadl/packages/Monitor.aadl#L204)<br>Behavior Specification: [GUMBO](aadl/aadl/packages/Monitor.aadl#L129)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-manage_monitor_interface-monmmi-->
<!--start__isolette_arch-section_aadl-arch-component-info-manage_monitor_mode-monmmm-->
|Thread: MonMMM <!--[manage_monitor_mode](aadl/aadl/packages/Monitor.aadl#L41)--> |
|:--|
|Type: [Monitor::Manage_Monitor_Mode](aadl/aadl/packages/Monitor.aadl#L218)<br>Implementation: [Monitor::Manage_Monitor_Mode.impl](aadl/aadl/packages/Monitor.aadl#L283)<br>Behavior Specification: [GUMBO](aadl/aadl/packages/Monitor.aadl#L236)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-manage_monitor_mode-monmmm-->
<!--start__isolette_arch-section_aadl-arch-component-info-detect_monitor_failure-dmf-->
|Thread: DMF <!--[detect_monitor_failure](aadl/aadl/packages/Monitor.aadl#L43)--> |
|:--|
|Type: [Monitor::Detect_Monitor_Failure](aadl/aadl/packages/Monitor.aadl#L423)<br>Implementation: [Monitor::Detect_Monitor_Failure.impl](aadl/aadl/packages/Monitor.aadl#L435)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-detect_monitor_failure-dmf-->
The following Thread components will house the application logic for the Isolette's control (Regulate) subsystem. Each of these components has a GUMBO contract that is used in the component and system implementations for component-level SMT-based verification, unit testing, and system testing.
<!--start__isolette_arch-section_aadl-arch-component-info-manage_heat_source-regmhs-->
|Thread: RegMHS <!--[manage_heat_source](aadl/aadl/packages/Regulate.aadl#L42)--> |
|:--|
|Type: [Regulate::Manage_Heat_Source](aadl/aadl/packages/Regulate.aadl#L394)<br>Implementation: [Regulate::Manage_Heat_Source.impl](aadl/aadl/packages/Regulate.aadl#L485)<br>Behavior Specification: [GUMBO](aadl/aadl/packages/Regulate.aadl#L422)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-manage_heat_source-regmhs-->
<!--start__isolette_arch-section_aadl-arch-component-info-manage_regulator_interface-regmri-->
|Thread: RegMRI <!--[manage_regulator_interface](aadl/aadl/packages/Regulate.aadl#L38)--> |
|:--|
|Type: [Regulate::Manage_Regulator_Interface](aadl/aadl/packages/Regulate.aadl#L106)<br>Implementation: [Regulate::Manage_Regulator_Interface.impl](aadl/aadl/packages/Regulate.aadl#L252)<br>Behavior Specification: [GUMBO](aadl/aadl/packages/Regulate.aadl#L170)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-manage_regulator_interface-regmri-->
<!--start__isolette_arch-section_aadl-arch-component-info-manage_regulator_mode-regmrm-->
|Thread: RegMRM <!--[manage_regulator_mode](aadl/aadl/packages/Regulate.aadl#L46)--> |
|:--|
|Type: [Regulate::Manage_Regulator_Mode](aadl/aadl/packages/Regulate.aadl#L266)<br>Implementation: [Regulate::Manage_Regulator_Mode.impl](aadl/aadl/packages/Regulate.aadl#L379)<br>Behavior Specification: [GUMBO](aadl/aadl/packages/Regulate.aadl#L292)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-manage_regulator_mode-regmrm-->
<!--start__isolette_arch-section_aadl-arch-component-info-detect_regulator_failure-drf-->
|Thread: DRF <!--[detect_regulator_failure](aadl/aadl/packages/Regulate.aadl#L48)--> |
|:--|
|Type: [Regulate::Detect_Regulator_Failure](aadl/aadl/packages/Regulate.aadl#L502)<br>Implementation: [Regulate::Detect_Regulator_Failure.impl](aadl/aadl/packages/Regulate.aadl#L514)|
|Periodic: 1000 ms|

<!--end____isolette_arch-section_aadl-arch-component-info-detect_regulator_failure-drf-->

## <!--start__isolette_behavior-code-title-->Behavior Code<!--end____isolette_behavior-code-title-->
<!--start__isolette_behavior-code-description-->
The following items link to the Slang source code for the application logic of each thread.
In the HAMR development workflow, skeletons for these files are automatically created,
along with APIs for communicating over model-declared ports in the component type.
GUMBO component contracts in the AADL model are automatically translated to Slang/Logika
contracts and included in the generated skeletons. Then, the application developer uses a
conventional development approach for coding the application logic in Slang
(C workflows are also supported). Logika can be applied to verify that the user's
application code conforms to the generated Logika contracts (which are derived
automatically from model-level GUMBO contracts). The HAMR build framework will integrate
the user-code application logic for each component (below) with auto-generated threading
and communication infrastructure code, along with HAMR's implementation of AADL run-time
(based on AADL's standardized Run-Time Services). Note that HAMR is smart enough to
accomodate changes to model-level interface declarations (ports, etc.) as well as changes
to GUMBO contracts -- user code will not be clobbered when the model is changed and HAMR
code generation is rerun. Instead, HAMR uses specially designed delimiters in the
application code files to, e.g., re-weave updated contracts into the application code.

Executable Slang versions of the GUMBO contracts (referred to as "GUMBOX" contracts)
are also automatically generated in the code generation process. These executable
contracts are automatically integrated into the system testing process: appropriate
portions of the executable contracts are invoked in the pre-state and the post-state
of a thread dispatch to dynamically check that the thread's behavior for that particular
dispatch conforms to the model-level GUMBO contracts.
<!--end____isolette_behavior-code-description-->

### Monitor Sub-system Behavior (Application) Code and Executable Contracts

<!--start__isolette_behavior-code_slang-code-manage_monitor_interface-monmmi-->
[MonMMI](hamr/slang/src/main/component/isolette/Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.scala)
<br>[GumboX](hamr/slang/src/main/bridge/isolette/Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_GumboX.scala)
<!--end____isolette_behavior-code_slang-code-manage_monitor_interface-monmmi-->
<!--start__isolette_behavior-code_slang-code-manage_alarm-monma-->
[MonMA](hamr/slang/src/main/component/isolette/Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.scala)
<br>[GumboX](hamr/slang/src/main/bridge/isolette/Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_GumboX.scala)
<!--end____isolette_behavior-code_slang-code-manage_alarm-monma-->
<!--start__isolette_behavior-code_slang-code-manage_monitor_mode-monmmm-->
[MonMMM](hamr/slang/src/main/component/isolette/Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala)
<br>[GumboX](hamr/slang/src/main/bridge/isolette/Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_GumboX.scala)
<!--end____isolette_behavior-code_slang-code-manage_monitor_mode-monmmm-->
<!--start__isolette_behavior-code_slang-code-detect_monitor_failure-dmf-->
[DMF](hamr/slang/src/main/component/isolette/Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure.scala)

<!--end____isolette_behavior-code_slang-code-detect_monitor_failure-dmf-->


### Regulate Sub-system Behavior (Application) Code and Executable Contracts
<!--start__isolette_behavior-code_slang-code-manage_regulator_interface-regmri-->
[RegMRI](hamr/slang/src/main/component/isolette/Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.scala)
<br>[GumboX](hamr/slang/src/main/bridge/isolette/Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_GumboX.scala)
<!--end____isolette_behavior-code_slang-code-manage_regulator_interface-regmri-->
<!--start__isolette_behavior-code_slang-code-manage_heat_source-regmhs-->
[RegMHS](hamr/slang/src/main/component/isolette/Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.scala)
<br>[GumboX](hamr/slang/src/main/bridge/isolette/Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX.scala)
<!--end____isolette_behavior-code_slang-code-manage_heat_source-regmhs-->
<!--start__isolette_behavior-code_slang-code-manage_regulator_mode-regmrm-->
[RegMRM](hamr/slang/src/main/component/isolette/Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.scala)
<br>[GumboX](hamr/slang/src/main/bridge/isolette/Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX.scala)
<!--end____isolette_behavior-code_slang-code-manage_regulator_mode-regmrm-->
<!--start__isolette_behavior-code_slang-code-detect_regulator_failure-drf-->
[DRF](hamr/slang/src/main/component/isolette/Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure.scala)

<!--end____isolette_behavior-code_slang-code-detect_regulator_failure-drf-->

### Operator Interface and Sensing/Actuation Devices

<!--start__isolette_behavior-code_slang-code-oit-opinterface-->
[OpInterface](hamr/slang/src/main/component/isolette/Isolette/operator_interface_thread_impl_operator_interface_oip_oit.scala)

<!--end____isolette_behavior-code_slang-code-oit-opinterface-->
<!--start__isolette_behavior-code_slang-code-thermostat-ts-->
[TS](hamr/slang/src/main/component/isolette/Devices/Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.scala)

<!--end____isolette_behavior-code_slang-code-thermostat-ts-->
<!--start__isolette_behavior-code_slang-code-heat_controller-hs-->
[HS](hamr/slang/src/main/component/isolette/Devices/Heat_Source_impl_heat_source_cpi_heat_controller.scala)

<!--end____isolette_behavior-code_slang-code-heat_controller-hs-->

## <!--start__isolette_metrics-title-->Metrics<!--end____isolette_metrics-title-->
<!--start__isolette_metrics-description-->
<!--end____isolette_metrics-description-->
### <!--start__isolette_metrics_aadl-metrics-title-->AADL Metrics<!--end____isolette_metrics_aadl-metrics-title-->
<!--start__isolette_metrics_aadl-metrics-description-->
The following section provides statistics about the AADL model to give a rough idea of
its size (in terms of number of AADL modeling elements that impact the size of the deployed system).
<!--end____isolette_metrics_aadl-metrics-description-->
<!--start__isolette_metrics_aadl-metrics_aadl-metrics-content-block-->
| | |
|:--|:--|
|Threads|11|
|Ports|49|
|Connections|27|
<!--end____isolette_metrics_aadl-metrics_aadl-metrics-content-block-->

### <!--start__isolette_metrics_jvm-metrics-title-->JVM Metrics<!--end____isolette_metrics_jvm-metrics-title-->
<!--start__isolette_metrics_jvm-metrics-description-->
The following section provides statistics about the Slang source code.
<!--end____isolette_metrics_jvm-metrics-description-->
<!--start__isolette_metrics_jvm-metrics_isolette_code_metrics-->
Directories Scanned Using [https://github.com/AlDanial/cloc](https://github.com/AlDanial/cloc) v1.94:
- [hamr/slang/src/main](hamr/slang/src/main)

<u><b>Total LOC</b></u>

Total number of HAMR-generated and developer-written lines of code
Language|files|blank|comment|code
:-------|-------:|-------:|-------:|-------:
Scala|144|5676|2964|25327
--------|--------|--------|--------|--------
SUM:|144|5676|2964|25327

<u><b>User LOC</b></u>

The number of lines of code written by the developer.
"Log" are lines of code used for logging that
likely would be excluded in a release build
 |Type|code |
 |:--|--:|
 |Behavior|184|
 |Log|16|
 |--------|--------|
 |SUM:|200|
<!--end____isolette_metrics_jvm-metrics_isolette_code_metrics-->

## <!--start__isolette_system-testing-setup-title-->System Testing<!--end____isolette_system-testing-setup-title-->
<!--start__isolette_system-testing-setup-description-->
<!--end____isolette_system-testing-setup-description-->
### <!--start__isolette_system-testing-setup_configurations-title-->Test Run Configurations<!--end____isolette_system-testing-setup_configurations-title-->
<!--start__isolette_system-testing-setup_configurations-description-->
All configurations use the following static schedule provided by [StaticSchedulerCust.scala](hamr/slang/src/main/component/isolette/StaticSchedulerCust.scala)

- [OpInterface](hamr/slang/src/main/component/isolette/Isolette/operator_interface_thread_impl_operator_interface_oip_oit.scala), [TS](hamr/slang/src/main/component/isolette/Devices/Temperature_Sensor_impl_temperature_sensor_cpi_thermostat.scala), [DRF](hamr/slang/src/main/component/isolette/Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure.scala), [DMF](hamr/slang/src/main/component/isolette/Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure.scala), [RegMRI](hamr/slang/src/main/component/isolette/Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface.scala), [RegMRM](hamr/slang/src/main/component/isolette/Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.scala), [RegMHS](hamr/slang/src/main/component/isolette/Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source.scala), [MonMMI](hamr/slang/src/main/component/isolette/Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface.scala), [MonMMM](hamr/slang/src/main/component/isolette/Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode.scala), [MonMA](hamr/slang/src/main/component/isolette/Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.scala), [HS](hamr/slang/src/main/component/isolette/Devices/Heat_Source_impl_heat_source_cpi_heat_controller.scala)
<!--end____isolette_system-testing-setup_configurations-description-->
#### <!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations-title-->Configurations for Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations-title-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations-description-->
<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations-description-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__normal_____heat_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L92">HC__Normal_____Heat_On</a></th>
</tr><tr>
<td>Description:</td><td>Heat Control control laws; NORMAL mode => Heat ON result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L537">sysProp_NormalModeHeatOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__normal_____heat_on_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__normal_____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L101">HC__Normal_____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Heat Control control laws; NORMAL mode => Heat OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L557">sysProp_NormalModeHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__normal_____heat_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__ct____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L114">HC__Failing__CT____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Heat Control control laws; Failing scenario (Current Temp) => Heat OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L592">sysProp_InvalidCTNormalModeHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__ct____heat_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__udt____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L124">HC__Failing__UDT____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Heat Control control laws; Failing scenario (Upper Desired Temperature) => Heat OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L606">sysProp_InvalidUDTNormalModeHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__udt____heat_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__ldt____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L134">HC__Failing__LDT____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Heat Control control laws; Failing scenario (Lower Desired Temperature) => Heat OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L620">sysProp_InvalidLDTNormalModeHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__ldt____heat_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__internal_failure____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L144">HC__Failing__Internal_Failure____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Heat Control control laws; Failing scenario (internal failure) => Heat OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L635">sysProp_InternalFailureNormalModeHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__internal_failure____heat_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__error_condition____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L155">HC__Failing__Error_Condition____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Heat Control control laws; Failing scenario (combined failure condition) => Heat OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L649">sysProp_ErrorConditionHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_hc__failing__error_condition____heat_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_displaytemp__normal_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L169">DisplayTemp__Normal</a></th>
</tr><tr>
<td>Description:</td><td>Display temp control laws; NORMAL mode => correct deplay result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L670">sysProp_NormalDisplayTemp</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_displaytemp__normal_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__normal_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L184">Mode_Trans___Normal__Normal</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Normal</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L731">sysProp_NormalToNormalMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__normal_configuration_content-->

<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___init__failed__error_condition_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L241">Mode_Trans___Init__Failed__Error_Condition</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Init->Failed because regulator_status is false</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L389">Regulator_AfterInit_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L796">sysProp_ErrorConditionInitToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___init__failed__error_condition_configuration_content-->

<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___failed__failed__error_condition_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L250">Mode_Trans___Failed__Failed__Error_Condition</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Failed->Failed because failed can only be handled via a system reboot</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L384">Regulator_2HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L812">sysProp_ErrorConditionFailedToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___failed__failed__error_condition_configuration_content-->


<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__ct_invalid_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L195">Mode_Trans___Normal__Failed__CT_Invalid</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Current Temperature Invalid</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L771">sysProp_InvalidCTNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__ct_invalid_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__udt_invalid_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L204">Mode_Trans___Normal__Failed__UDT_Invalid</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Upper Desired Temperature Invalid</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L744">sysProp_InvalidUDTNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__udt_invalid_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__ldt_invalid_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L213">Mode_Trans___Normal__Failed__LDT_Invalid</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Lower Desired Temperature Invalid</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L758">sysProp_InvalidLDTNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__ldt_invalid_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__internal_failure_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L222">Mode_Trans___Normal__Failed__Internal_Failure</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Internal Failure</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L784">sysProp_InternalFailureNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__internal_failure_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__error_condition_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L232">Mode_Trans___Normal__Failed__Error_Condition</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because combined error condition</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L830">sysProp_ErrorConditionNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_trans___normal__failed__error_condition_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_impl__init____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L280">Mode_Impl__Init____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Mode Implication: Init => Heat Off</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L688">sysProp_InitModeImpliesHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_impl__init____heat_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_impl__failed____heat_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L290">Mode_Impl__Failed____Heat_Off</a></th>
</tr><tr>
<td>Description:</td><td>Mode Implication: Failed => Heat Off</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379">Regulator_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L701">sysProp_FailedModeImpliesHeatOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L355)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L853)">compute_spec_lower_is_not_higher_than_upper_assume</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface$.html">RegMRI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode$.html">RegMRM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source$.html">RegMHS</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure$.html">DRF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_configurations_regulate_subsystem_test_wslangcheck_dsc_test_harness_mode_impl__failed____heat_off_configuration_content-->

#### <!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations-title-->Configurations for Monitor_Subsystem_DSC_Test_Harness<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations-title-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations-description-->
<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations-description-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L85">MA__Normal_____Alarm_On</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; NORMAL mode with temp range violation => Alarm ON result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L480">sysProp_NormalModeAlarmOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_on_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_unchanged_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L94">MA__Normal_____Alarm_Unchanged</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; NORMAL mode => Alarm status unchanged</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L496">sysProp_NormalModeAlarmUnchanged</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_unchanged_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_unchanged_left_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L103">MA__Normal_____Alarm_Unchanged_left</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; NORMAL mode => Alarm status unchanged (stress left partition)</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L496">sysProp_NormalModeAlarmUnchanged</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L296)">currentTemp-in-left-partition</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_unchanged_left_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_unchanged_right_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L112">MA__Normal_____Alarm_Unchanged_right</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; NORMAL mode => Alarm status unchanged (stress right partition)</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L496">sysProp_NormalModeAlarmUnchanged</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L309)">currentTemp-in-right-partition</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_unchanged_right_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L121">MA__Normal_____Alarm_Off</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; NORMAL mode => Alarm OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L513">sysProp_NormalModeAlarmOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__normal_____alarm_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__ct____alarm_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L132">MA__Failing__CT____Alarm_On</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; Failing scenario (due to invalid currentTemp) => Alarm ON result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L531">sysProp_InvalidCTNormalModeAlarmOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__ct____alarm_on_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__lat____alarm_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L141">MA__Failing__LAT____Alarm_On</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; Failing scenario (due to invalid lower alarm) => Alarm ON result</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L546">sysProp_InvalidLATNormalModeAlarmOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__lat____alarm_on_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__uat____alarm_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L150">MA__Failing__UAT____Alarm_On</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; Failing scenario (due to invalid upper alarm) => Alarm ON result</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L561">sysProp_InvalidUATNormalModeAlarmOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__uat____alarm_on_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__internal_failure____alarm_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L161">MA__Failing__Internal_Failure____Alarm_On</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; Failing scenario (internal failure) => Alarm ON result</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L576">sysProp_InternalFailureNormalModeAlarmOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__internal_failure____alarm_on_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__error_condition____alarm_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L170">MA__Failing__Error_Condition____Alarm_On</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; Failing scenario (combined failure condition) => Alarm ON result</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L591">sysProp_ErrorConditionAlarmOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_ma__failing__error_condition____alarm_on_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__normal_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L183">Mode_Trans___Normal__Normal</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Normal</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L610">sysProp_NormalToNormalMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__normal_configuration_content-->

<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___failed__failed__error_condition_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L239">Mode_Trans___Failed__Failed__Error_Condition</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Failed->Failed because failed can only be handled via a system reboot</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L399">Monitor_2HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L706">sysProp_ErrorConditionFailedToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___failed__failed__error_condition_configuration_content-->

<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___init__init__error_condition_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L248">Mode_Trans___Init__Init__Error_Condition</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Init->Init because MMM stays in init if monitor_status is false</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L404">Monitor_AfterInit_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L722">sysProp_ErrorConditionInitToInitMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___init__init__error_condition_configuration_content-->

<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__ct_invalid_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L193">Mode_Trans___Normal__Failed__CT_Invalid</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Current Temperature Invalid</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L625">sysProp_InvalidCTNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__ct_invalid_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__lat_invalid_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L202">Mode_Trans___Normal__Failed__LAT_Invalid</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Lower Alarm Temperature Invalid</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L641">sysProp_InvalidLATNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__lat_invalid_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__uat_invalid_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L211">Mode_Trans___Normal__Failed__UAT_Invalid</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Upper Alarm Temperature Invalid</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L657">sysProp_InvalidUATNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__uat_invalid_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__internal_failure_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L221">Mode_Trans___Normal__Failed__Internal_Failure</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because Internal Failure</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L673">sysProp_InternalFailureNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__internal_failure_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__error_condition_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L230">Mode_Trans___Normal__Failed__Error_Condition</a></th>
</tr><tr>
<td>Description:</td><td>Mode Trans:  Normal->Failed because combined error condition</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L690">sysProp_ErrorConditionNormalToFailedMode</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_trans___normal__failed__error_condition_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_impl__init____alarm_off_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L258">Mode_Impl__Init____Alarm_Off</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; INIT mode => Alarm OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L739">sysProp_InitModeImpliesAlarmOff</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_impl__init____alarm_off_configuration_content-->
<!--start__isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_impl__failed____alarm_on_configuration_content-->
<table>
<tr><th colspan=2 align="left"><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L267">Mode_Impl__Failed____Alarm_On</a></th>
</tr><tr>
<td>Description:</td><td>Alarm control laws; FAILED mode => Alarm OFF result state</td>
</tr><tr>
<td>Script Schema:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394">Monitor_1HP_script_schema</a></td>
</tr><tr>
<td>Property:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L749">sysProp_FailedModeImpliesAlarmOn</a></td>
</tr><tr>
<td>Randomization Profile:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L768)">Valid Ranges Profile</a></td>
</tr><tr>
<td>Random Vector Filter:</td><td><a href="hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)">assumeFigureA_7</a></td>
</tr><tr>
<td>Relevant Coverage:</td><td><a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface$.html">MonMMI</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode$.html">MonMMM</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm$.html">MonMA</a>, <a href="https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/jacocoCoverage/isolette.Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure$.html">DMF</a></td>
</tr>
</table>

<!--end____isolette_system-testing-setup_configurations_monitor_subsystem_dsc_test_harness_configurations_monitor_subsystem_dsc_test_harness_mode_impl__failed____alarm_on_configuration_content-->

## <!--start__isolette_how-to-run-title-->How to Run<!--end____isolette_how-to-run-title-->
<!--start__isolette_how-to-run-description-->
System testing requires a Sireum distribution. Instructions on how to obtain a
distribution are available at [https://sireum.org/getting-started/](https://sireum.org/getting-started/).
The rest of this documentation assumes the ``SIREUM_HOME`` environmental variable has been set and that
sireum's bin directory has been added to your path (e.g. for Linux/MacOS ``export PATH=$SIREUM_HOME/bin:$PATH``
or Windows ``set PATH=%PATH%\bin;%PATH%``


<!--end____isolette_how-to-run-description-->
### <!--start__isolette_how-to-run_framework-generation-title-->Framework Generation<!--end____isolette_how-to-run_framework-generation-title-->
<!--start__isolette_how-to-run_framework-generation-description-->
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


<!--end____isolette_how-to-run_framework-generation-description-->

### <!--start__isolette_how-to-run_manual-testing-title-->Manual System Testing<!--end____isolette_how-to-run_manual-testing-title-->
<!--start__isolette_how-to-run_manual-testing-description-->
The example system test suites described previously were used to write
system tests for the Regulator subsystem and Monitor subsystem as follows:
<!--end____isolette_how-to-run_manual-testing-description-->
<!--start__isolette_how-to-run_manual-testing_regulator-subsystem_block-->
__Regulator subsystem__

  System Test Suite Class: [Regulate_Subsystem_Test_wSlangCheck.scala](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala)

  Test run configurations are specified via entries in the [testMatrix](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L85). For example,
  the [HC__Normal_____Heat_On](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L92) configuration uses the following:

  | | |
  |:--|--|
  | Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L379)|
  | Property: | [sysProp_NormalModeHeatOn](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L537)|
  | Randomization Profile: | [validRanges](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L352)|
  | Random Vector Filter: | [system_Pre_Container](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Inputs_Container_GumboX.scala#L46)|

  How to run:

  ```
  cd hamr-system-testing-case-studies

  sireum proyek test --suffixes Regulate_Subsystem_Test_wSlangCheck isolette/hamr/slang
  ```


<!--end____isolette_how-to-run_manual-testing_regulator-subsystem_block-->
<!--start__isolette_how-to-run_manual-testing_monitor-subsystem_block-->
__Monitor subsystem__

  System Test Suite Class: [Monitor_Subsystem_Test_wSlangCheck.scala](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala)

  Test run configurations are specified via entries in the [testMatrix](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L84). For example,
  the [MA__Normal_____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L85) configuration uses the following:

  | | |
  |:--|--|
  | Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394)|
  | Property: | [sysProp_NormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L480)|
  | Randomization Profile: | [validRanges](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L765)|
  | Random Vector Filter: | [assumeFigureA_7](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L390)|

  How to run:

  ```
  cd hamr-system-testing-case-studies

  sireum proyek test --suffixes Monitor_Subsystem_Test_wSlangCheck isolette/hamr/slang
  ```


<!--end____isolette_how-to-run_manual-testing_monitor-subsystem_block-->

### <!--start__isolette_how-to-run_dsc-testing-title-->Distributed SlangCheck System Testing<!--end____isolette_how-to-run_dsc-testing-title-->
<!--start__isolette_how-to-run_dsc-testing-description-->
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
of 1, 5, and 10 seconds using a Jenkins cluster.

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

The following will pass each test vector to the Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness's test method,
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
|:--|
|[isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/1](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/1/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for the HC__Normal_____Heat_On configuration with a 1 second timeout<br><br>__NOTE__ this is what DSC was actually run on.  The following rows are simply aggregate information |
|[isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/HC__Normal_____Heat_On/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for the MA__Failing__CT____Alarm_On configuration using timeouts of 1, 5, and 10 seconds |
|[isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for running all the configurations through Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness using timeouts of 1, 5, and 10 seconds |
|[isolette](https://people.cs.ksu.edu/~santos_jenkins/pub/hamr-system-testing-case-studies/isolette/report.html)<br><br>The combined coverage information along with the number of passing/failing/unsat test vectors for each of the Isolette's subsystems under testing using timeouts of 1, 5, and 10 seconds |

<!--end____isolette_how-to-run_dsc-testing-description-->
