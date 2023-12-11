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
 * Regulator Status

 * Alarm Control
 * Monitor Status

# Initialization Properties

**ToDo - define all initialization properties.  These do not need to be randomized because there is no input.


* Outputs for Manage Heat Source are appropriately initialized

* Outputs for Manage Regulator Interface are appropriately initialized

* Outputs for Manage Regulator Mode are appropriately initialized




# Compute Phase Properties

## Output: Heat Control

### Normal Mode Properties

* [**Done** - Normal; Heat control on] When the mode is normal,
  if the current temperature is less than the lower desired temperature,
  then the heat control shall be on.

* [**Done** - Normal; Heat control off] When the mode is normal,
  if the current temperature is greater than the upper desired temperature,
  then the heat control shall be off.

* [**To Do - Requires 2 HP, Additional Observation Property**] - Heat control unchanged] When the mode is normal,
  if the current temperature is greater than or equal to the lower desired temperature,
  and the current temperature is less than or equal to the lower desired temperature,
  then the heater state is unchanged.

### Init Mode Properties

**To Do**

### Input Failure Properties

* [**Done** Normal->Failing; Invalid CT => HeatOff] 
  When the mode is normal, 
  if the current temperature is invalid then 
  the heat control shall be off.

* [**Done** Normal->Failing; Invalid LDT => HeatOff]
  When the mode is normal, 
  if the lower desired temperature is invalid then 
  the heat control shall be off.

* [**Done** Normal->Failing; Invalid UDT => HeatOff]
  When the mode is normal, 
  if the upper desired temperature is invalid then 
  the heat control shall be off.

### Internal Failure Properties

* [**Done** Normal->Failing; Internal Failure => HeatOff]
  If there an internal failure (as reported on the input to ManageRegulatorMode)
  then the heat control shall be off.



## Output (Updated internal value): Mode

## Init Mode to Normal Mode

(**ToDo** need tests for all causes of transitioning from init mode to normal mode)

## Init Mode to Failed Mode

(**ToDo** need tests for all causes of transitioning from init mode to normal mode)


### Normal Mode To Normal Mode Properties

* [**Done** Normal Mode => Normal Mode]
  If the system is in normal mode and there are no failure conditions, 
  then it continues to be in normal mode

### Normal Mode To Failed Mode Properties

* [**Done** Invalid CT; Normal Mode; => Failed Mode] 
  When the mode is normal, 
  if the current temperature is invalid then 
  the mode shall be set to FAILED.

* [**Done** Invalid LDT; Normal Mode; => Failed Mode]
  When the mode is normal, 
  if the lower desired temperature is invalid then 
  the mode shall be set to FAILED.

* [**Done** Invalid UDT; Normal Mode; => Failed Mode]
  When the mode is normal, 
  if the upper desired temperature is invalid then 
  the mode shall be set to FAILED.

* [**Done** Internal Failure; Normal Mode; => Failed Mode]
  When the mode is normal, 
  if the upper desired temperature is invalid then 
  the mode shall be set to FAILED.

### Failed Mode Preservation Property

(* [**Done** Failed Mode => Failed Mode]
  If the system is in failed mode,
  then it continues to be in failed mode
  
## Output: Regulator Status 

**ToDo**

### Normal Mode Properties

* In Normal Mode, output for Regulator Status is correct (test for output of the MRI component, later on, test at the appropriate value at the operator interface)


## Output: Display Temperature


**ToDo**

### Normal Mode Properties

* In Normal Mode, output for Display Temperature is "correct" (test for output of the MRI component, later on, test for the appropriate value at the operator interface)

### Init Mode Properties

### Failed Mode Properties


# Mode Implication Properties

The following properties supplement those above by describing (in terms
of a single HP post-state observation) the relationship between
the mode value and the process outputs

## Output: Heat Control

* [**Done** Init => Heat Off]  
  If the mode is Init (at the end of a HP), then Heat Control is OFF

* [**Done** Failed => Heat Off]  
  If the mode is Failed (at the end of a HP), then Heat Control is OFF

* [**Done** Normal Mode]
   * (These properties are covered in heat control output properties above)

## Output: Display Temperature

* [Init => ...]  
    (Unspecified -- so no actionable testing criteria)

* [Failed => ...]  
    (Unspecified -- so no actionable testing criteria)

* [Normal Mode]
   * (These properties are covered by display temperature output properties above)

## Output: Regulator Status

These tests require a 2 HP schema

* [Init => ...]  

* [Failed => ...]  

* [Normal Mode]
   * (These properties are covered by display temperature output properties above)


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



