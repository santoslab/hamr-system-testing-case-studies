# Identification of System Inputs / Outputs

 ## Inputs to Control in System Testing

 * Current Temperature (w status)

 * Upper Desired Temperature (w status)
 * Lower Desired Temperature (w status)
 * Regulator Internal Failure

 * Upper Alarm Temperature (w status)
 * Lower Alarm Temperature (w status)
 * Monitor Internal Failure

## Outputs to Monitor in System Testing

 * Heat Control
 * Regular Status

 * Alarm Control
 * Monitor Status


# Compute Phase Properties

## Output: Heat Control

### Normal Mode Properties

* [**Done** - Heat control on] When the mode is normal,
  if the current temperature is less than the lower desired temperature,
  then the heat control shall be on.

* [**Done** - Heat control off] When the mode is normal,
  if the current temperature is greater than the upper desired temperature,
  then the heat control shall be off.

* [Wait on this property until John explains -- Heat control unchanged] When the mode is normal,
  if the current temperature is greater than or equal to the lower desired temperature,
  and the current temperature is less than or equal to the lower desired temperature,
  then the heater state is unchanged.

### Init Mode Properties

(Wait until John explains)

### Input Failure Properties

* When the mode is normal, and internal failure is false,
  if the current temperature is invalid then 
  the heat control shall be off.

* When the mode is normal, and internal failure is false,
  if the lower desired temperature is invalid then 
  the heat control shall be off.

* When the mode is normal, and internal failure is false,
  if the upper desired temperature is invalid then 
  the heat control shall be off.

* When the mode is normal, and internal failure is false,
  if the current temperature is invalid then 
  regulator mode (as it appears on the input to Manage Heat Source) is Failed_Regulator_Mode

* When the mode is normal, and internal failure is false,
  if the lower desired temperature is invalid then 
  regulator mode (as it appears on the input to Manage Heat Source) is Failed_Regulator_Mode

* When the mode is normal, and internal failure is false,
  if the upper desired temperature is invalid then 
  regulator mode (as it appears on the input to Manage Heat Source) is Failed_Regulator_Mode

### Internal Failure Properties

* If there an internal failure (as reported on the input to ManageRegulatorMode)
  then the heat control shall be off.

* If there an internal failure (as reported on the input to ManageRegulatorMode)
  then regulator mode (as it appears on the input to Manage Heat Source) is Failed_Regulator_Mode


## Output: Display Temperature



### Normal Mode Properties

* In Normal Mode, output for Display Temperature is "correct" (test for output of the MRI component, later on, test for the appropriate value at the operator interface)

### Init Mode Properties

### Failed Mode Properties

## Output: Regulator Status

### Normal Mode Properties

* In Normal Mode, output for Regulator Status is correct (test for output of the MRI component, later on, test at the appropriate value at the operator interface)

### Init Mode Properties

### Failed Mode Properties

# Mode Transition

## Init Mode to Normal Mode

(need tests for all causes of transitioning from init mode to normal mode)

## Normal Mode to Failed Mode

(need tests for all causes of transitioning from normal mode to failed mode)

* [Mode Transition - Normal to Failed] When a regulator failure is detected, then mode transitions to FAILED


## Init Mode to Failed Mode

(need tests for all causes of transitioning from init mode to failed mode)

## Failed Mode Persistence

(need tests to show that if system is in failed mode, it will continue to be in failed mode)


# Notions of coverage

* Port coverage (ports read, ports written)
* Connection coverage
* Value coverage on ports  (with special emphasis on input/output ports)
* Coverage of contract clauses (roughly corresponds to coverage of requirements, since contracts are derived from requirements)
* Code coverage
* Coverage of different types of AADL run-time 
  - coverage of buffer overflow (e.g., no buffer overflows occur)
  - coverage of dispatch conditions (e.g., for sporadic, component is triggered by each one of its dispatch triggers)
* Schedule step coverage (how many total hyperperiodics has the schedule run through, what is the longest trace)  
* (Chris) Table cell coverage



