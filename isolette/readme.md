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
|System: [Isolette::isolette.single_sensor](aadl/aadl/packages/Isolette.aadl#L71) |
|:--|
<!--arch-section-aadl-arch-component-info-isolette_single_sensor_Instance_end-->
<!--arch-section-aadl-arch-component-info-heat_controller_start-->
|Thread: [heat_controller](aadl/aadl/packages/Devices.aadl#L118) |
|:--|
|Type: [Devices::Heat_Source](aadl/aadl/packages/Devices.aadl#L124)<br>Implementation: [Devices::Heat_Source.impl](aadl/aadl/packages/Devices.aadl#L135)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-heat_controller_end-->
<!--arch-section-aadl-arch-component-info-thermostat_start-->
|Thread: [thermostat](aadl/aadl/packages/Devices.aadl#L73) |
|:--|
|Type: [Devices::Temperature_Sensor](aadl/aadl/packages/Devices.aadl#L79)<br>Implementation: [Devices::Temperature_Sensor.impl](aadl/aadl/packages/Devices.aadl#L90)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-thermostat_end-->
<!--arch-section-aadl-arch-component-info-oit_start-->
|Thread: [oit](aadl/aadl/packages/Isolette.aadl#L274) |
|:--|
|Type: [Isolette::operator_interface_thread](aadl/aadl/packages/Isolette.aadl#L287)<br>Implementation: [Isolette::operator_interface_thread.impl](aadl/aadl/packages/Isolette.aadl#L307)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-oit_end-->
<!--arch-section-aadl-arch-component-info-detect_monitor_failure_start-->
|Thread: [detect_monitor_failure](aadl/aadl/packages/Monitor.aadl#L43) |
|:--|
|Type: [Monitor::Detect_Monitor_Failure](aadl/aadl/packages/Monitor.aadl#L428)<br>Implementation: [Monitor::Detect_Monitor_Failure.impl](aadl/aadl/packages/Monitor.aadl#L440)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-detect_monitor_failure_end-->
<!--arch-section-aadl-arch-component-info-manage_alarm_start-->
|Thread: [manage_alarm](aadl/aadl/packages/Monitor.aadl#L39) |
|:--|
|Type: [Monitor::Manage_Alarm](aadl/aadl/packages/Monitor.aadl#L300)<br>Implementation: [Monitor::Manage_Alarm.impl](aadl/aadl/packages/Monitor.aadl#L412)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_alarm_end-->
<!--arch-section-aadl-arch-component-info-manage_monitor_interface_start-->
|Thread: [manage_monitor_interface](aadl/aadl/packages/Monitor.aadl#L37) |
|:--|
|Type: [Monitor::Manage_Monitor_Interface](aadl/aadl/packages/Monitor.aadl#L96)<br>Implementation: [Monitor::Manage_Monitor_Interface.impl](aadl/aadl/packages/Monitor.aadl#L207)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_monitor_interface_end-->
<!--arch-section-aadl-arch-component-info-manage_monitor_mode_start-->
|Thread: [manage_monitor_mode](aadl/aadl/packages/Monitor.aadl#L41) |
|:--|
|Type: [Monitor::Manage_Monitor_Mode](aadl/aadl/packages/Monitor.aadl#L221)<br>Implementation: [Monitor::Manage_Monitor_Mode.impl](aadl/aadl/packages/Monitor.aadl#L286)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_monitor_mode_end-->
<!--arch-section-aadl-arch-component-info-detect_regulator_failure_start-->
|Thread: [detect_regulator_failure](aadl/aadl/packages/Regulate.aadl#L48) |
|:--|
|Type: [Regulate::Detect_Regulator_Failure](aadl/aadl/packages/Regulate.aadl#L506)<br>Implementation: [Regulate::Detect_Regulator_Failure.impl](aadl/aadl/packages/Regulate.aadl#L518)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-detect_regulator_failure_end-->
<!--arch-section-aadl-arch-component-info-manage_heat_source_start-->
|Thread: [manage_heat_source](aadl/aadl/packages/Regulate.aadl#L42) |
|:--|
|Type: [Regulate::Manage_Heat_Source](aadl/aadl/packages/Regulate.aadl#L398)<br>Implementation: [Regulate::Manage_Heat_Source.impl](aadl/aadl/packages/Regulate.aadl#L489)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_heat_source_end-->
<!--arch-section-aadl-arch-component-info-manage_regulator_interface_start-->
|Thread: [manage_regulator_interface](aadl/aadl/packages/Regulate.aadl#L38) |
|:--|
|Type: [Regulate::Manage_Regulator_Interface](aadl/aadl/packages/Regulate.aadl#L106)<br>Implementation: [Regulate::Manage_Regulator_Interface.impl](aadl/aadl/packages/Regulate.aadl#L256)|
|Periodic: 1000 ms|

<!--arch-section-aadl-arch-component-info-manage_regulator_interface_end-->
<!--arch-section-aadl-arch-component-info-manage_regulator_mode_start-->
|Thread: [manage_regulator_mode](aadl/aadl/packages/Regulate.aadl#L46) |
|:--|
|Type: [Regulate::Manage_Regulator_Mode](aadl/aadl/packages/Regulate.aadl#L270)<br>Implementation: [Regulate::Manage_Regulator_Mode.impl](aadl/aadl/packages/Regulate.aadl#L383)|
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
|:--|:--|
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
Scala|144|5655|2910|25327
--------|--------|--------|--------|--------
SUM:|144|5655|2910|25327

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
<!---Isolette_code_metrics_end-->

## <!--system-testing-setup-title_start-->System Testing<!--system-testing-setup-title_end-->
<!--system-testing-setup-description_start-->
<!--system-testing-setup-description_end-->
### <!--configurations-title_start-->Test Run Configurations<!--configurations-title_end-->
<!--configurations-description_start-->
<!--configurations-description_end-->
#### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_configurations-title_start-->Configurations for Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_configurations-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_configurations-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_configurations-description_end-->
##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration-title_start-->[DisplayTemp__Normal](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L118)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration_content_start-->
| | |
|:--|--|
| Description: | DisplayTemp; Normal |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_NormalDisplayTemp](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L527)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_DisplayTemp__Normal_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration-title_start-->[HC__Failing__CT____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L73)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | HC; Failing; CT => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InvalidCTNormalModeHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L469)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__CT____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration-title_start-->[HC__Failing__Error_Condition____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L106)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | HC; Failing; Error Condition => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_ErrorConditionHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L510)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Error_Condition____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration-title_start-->[HC__Failing__Internal_Failure____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L97)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | HC; Failing; Internal Failure => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InternalFailureNormalModeHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L500)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__Internal_Failure____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration-title_start-->[HC__Failing__LDT____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L89)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | HC; Failing; LDT => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InvalidLDTNormalModeHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L489)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__LDT____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration-title_start-->[HC__Failing__UDT____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L81)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | HC; Failing; UDT => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InvalidUDTNormalModeHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L479)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Failing__UDT____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration-title_start-->[HC__Normal_____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L63)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | HC; Normal; => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_NormalModeHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L452)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration-title_start-->[HC__Normal_____Heat_On](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L56)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration_content_start-->
| | |
|:--|--|
| Description: | HC; Normal; => Heat On |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_NormalModeHeatOn](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L436)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_HC__Normal_____Heat_On_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration-title_start-->[Mode_Impl__Failed____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L203)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Impl: Failed => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_FailedModeImpliesHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L553)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Failed____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration-title_start-->[Mode_Impl__Init____Heat_Off](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L195)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Impl: Init => Heat Off |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InitModeImpliesHeatOff](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L541)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Impl__Init____Heat_Off_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-title_start-->[Mode_Trans___Normal__Failed__CT_Invalid](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L140)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Trans:  Normal->Failed; CT Invalid |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InvalidCTNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L603)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-title_start-->[Mode_Trans___Normal__Failed__Error_Condition](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L169)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Trans:  Normal->Failed; Error Condition |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_ErrorConditionNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L622)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-title_start-->[Mode_Trans___Normal__Failed__Internal_Failure](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L161)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Trans:  Normal->Failed; Internal Failure |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InternalFailureNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L612)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration-title_start-->[Mode_Trans___Normal__Failed__LDT_Invalid](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L154)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Trans:  Normal->Failed; LDT Invalid |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InvalidLDTNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L594)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__LDT_Invalid_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration-title_start-->[Mode_Trans___Normal__Failed__UDT_Invalid](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L147)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Trans:  Normal->Failed; UDT Invalid |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_InvalidUDTNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L584)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Failed__UDT_Invalid_configuration_content_end-->

##### <!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-title_start-->[Mode_Trans___Normal__Normal](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L131)<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-title_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-description_start-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-description_end-->
<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration_content_start-->
| | |
|:--|--|
| Description: | Mode Trans:  Normal->Normal |
| Script Schema: | [Regulator_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L299)|
| Property: | [sysProp_NormalToNormalMode](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L575)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala#L264)|
| Random Vector Filter: | TODO|

<!--Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration_content_end-->

#### <!--Monitor_Subsystem_DSC_Test_Harness_configurations-title_start-->Configurations for Monitor_Subsystem_DSC_Test_Harness<!--Monitor_Subsystem_DSC_Test_Harness_configurations-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_configurations-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_configurations-description_end-->
##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration-title_start-->[MA__Failing__CT____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L87)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration_content_start-->
| | |
|:--|--|
| Description: | Failure due to invalid currentTemp should result in Alarm On |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InvalidCTNormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L413)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__CT____Alarm_On_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration-title_start-->[MA__Failing__Error_Condition____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L117)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration_content_start-->
| | |
|:--|--|
| Description: | observe any failure condition (combining the input failures and internal failures above) should result in Alarm On |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_ErrorConditionAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L465)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Error_Condition____Alarm_On_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration-title_start-->[MA__Failing__Internal_Failure____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L110)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration_content_start-->
| | |
|:--|--|
| Description: | Failure due to internal failure should result in Alarm On |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InternalFailureNormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L452)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__Internal_Failure____Alarm_On_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration-title_start-->[MA__Failing__LAT____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L94)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration_content_start-->
| | |
|:--|--|
| Description: | Failure due to invalid lower alarm should result in Alarm On |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InvalidLATNormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L426)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__LAT____Alarm_On_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration-title_start-->[MA__Failing__UAT____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L101)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration_content_start-->
| | |
|:--|--|
| Description: | Failure due to invalid upper alarm should result in Alarm On |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InvalidUATNormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L439)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Failing__UAT____Alarm_On_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration-title_start-->[MA__Normal_____Alarm_Off](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L77)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | MA; Normal; => Alarm Off |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_NormalModeAlarmOff](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L394)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Off_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration-title_start-->[MA__Normal_____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L49)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration_content_start-->
| | |
|:--|--|
| Description: | MA; Normal; => Alarm On |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_NormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L368)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_On_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration-title_start-->[MA__Normal_____Alarm_Unchanged](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L56)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration_content_start-->
| | |
|:--|--|
| Description: | MA; Normal; => Alarm Unchanged |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_NormalModeAlarmUnchanged](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L379)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration-title_start-->[MA__Normal_____Alarm_Unchanged_left](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L63)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration_content_start-->
| | |
|:--|--|
| Description: | MA; Normal; => Alarm Unchanged, stress left partition |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_NormalModeAlarmUnchanged](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L379)|
| Randomization Profile: | [currentTemp-in-left-partition](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L205)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_left_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration-title_start-->[MA__Normal_____Alarm_Unchanged_right](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L70)<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration_content_start-->
| | |
|:--|--|
| Description: | MA; Normal; => Alarm Unchanged, stress right partition |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_NormalModeAlarmUnchanged](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L379)|
| Randomization Profile: | [currentTemp-in-right-partition](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L218)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration-Monitor_Subsystem_DSC_Test_Harness_MA__Normal_____Alarm_Unchanged_right_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration-title_start-->[Mode_Impl__Failed____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L180)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration_content_start-->
| | |
|:--|--|
| Description: | If in Failed mode then the alarm should be On |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_FailedModeImpliesAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L575)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Failed____Alarm_On_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration-title_start-->[Mode_Impl__Init____Alarm_Off](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L173)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration_content_start-->
| | |
|:--|--|
| Description: | If in Init mode then the alarm should be off |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InitModeImpliesAlarmOff](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L565)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Impl__Init____Alarm_Off_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-title_start-->[Mode_Trans___Normal__Failed__CT_Invalid](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L136)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration_content_start-->
| | |
|:--|--|
| Description: | If in normal, but CT is invalid then should transition to Failed |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InvalidCTNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L495)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__CT_Invalid_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-title_start-->[Mode_Trans___Normal__Failed__Error_Condition](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L165)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration_content_start-->
| | |
|:--|--|
| Description: | If in normal, but there is an internal or interface failure then should transition to Failed |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_ErrorConditionNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L550)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Error_Condition_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-title_start-->[Mode_Trans___Normal__Failed__Internal_Failure](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L158)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration_content_start-->
| | |
|:--|--|
| Description: | If in normal, but there is an internal failure then should transition to Failed |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InternalFailureNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L536)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__Internal_Failure_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration-title_start-->[Mode_Trans___Normal__Failed__LAT_Invalid](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L143)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration_content_start-->
| | |
|:--|--|
| Description: | If in normal, but LAT is invalid then should transition to Failed |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InvalidLATNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L509)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__LAT_Invalid_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration-title_start-->[Mode_Trans___Normal__Failed__UAT_Invalid](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L150)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration_content_start-->
| | |
|:--|--|
| Description: | If in normal, but UAT is invalid then should transition to Failed |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_InvalidUATNormalToFailedMode](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L522)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Failed__UAT_Invalid_configuration_content_end-->

##### <!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-title_start-->[Mode_Trans___Normal__Normal](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L128)<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-title_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-description_start-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-description_end-->
<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration_content_start-->
| | |
|:--|--|
| Description: | If no error condition and in normal then stay  in Normal |
| Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303)|
| Property: | [sysProp_NormalToNormalMode](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L482)|
| Randomization Profile: | [Valid Ranges Profile](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L592)|
| Random Vector Filter: | TODO|

<!--Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration-Monitor_Subsystem_DSC_Test_Harness_Mode_Trans___Normal__Normal_configuration_content_end-->

## <!--how-to-run-title_start-->How to Run<!--how-to-run-title_end-->
<!--how-to-run-description_start-->
System testing requires a Sireum distribution. Instructions on how to obtain a
distribution are available at [https://sireum.org/getting-started/](https://sireum.org/getting-started/).
The rest of this documentation assumes the ``SIREUM_HOME`` environmental variable has been set and that
sireum's bin directory has been added to your path (e.g. for Linux/MacOS ``export PATH=$SIREUM_HOME/bin:$PATH``
or Windows ``set PATH=%PATH%\bin;%PATH%``


<!--how-to-run-description_end-->
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
  |:--|--|
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

  Test run configurations are specified via entries in the [testMatrix](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L48). For example,
  the [MA__Normal_____Alarm_On](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L49) configuration uses the following:

  | | |
  |:--|--|
  | Script Schema: | [Monitor_1HP_script_schema](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L303) |
  | Property: | [sysProp_NormalModeAlarmOn](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L368) |
  | Randomization Profile: | [validRanges](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L589) |
  | Random Vector Filter: | [assumeFigureA_7](hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala#L299) |

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

<!--dsc-testing-description_end-->
