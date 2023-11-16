// #Sireum

package isolette.Regulate

import org.sireum._
import art._
import isolette._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_EntryPoint_Companion {

  var last_api_upper_desired_temp: Option[Isolette_Data_Model.Temp_impl] = None()

  /** get the value of outgoing data port upper_desired_temp.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_upper_desired_temp.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_upper_desired_temp: Isolette_Data_Model.Temp_impl = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.upper_desired_temp_Id) match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(value)) =>
        last_api_upper_desired_temp = Some(value)
        return value
      case _ if last_api_upper_desired_temp.isEmpty =>
        assert(F, "No value found on outgoing data port upper_desired_temp.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port upper_desired_temp.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_upper_desired_temp.get
    }
  }
  var last_api_lower_desired_temp: Option[Isolette_Data_Model.Temp_impl] = None()

  /** get the value of outgoing data port lower_desired_temp.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_lower_desired_temp.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_lower_desired_temp: Isolette_Data_Model.Temp_impl = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.lower_desired_temp_Id) match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(value)) =>
        last_api_lower_desired_temp = Some(value)
        return value
      case _ if last_api_lower_desired_temp.isEmpty =>
        assert(F, "No value found on outgoing data port lower_desired_temp.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port lower_desired_temp.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_lower_desired_temp.get
    }
  }
  var last_api_displayed_temp: Option[Isolette_Data_Model.Temp_impl] = None()

  /** get the value of outgoing data port displayed_temp.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_displayed_temp.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_displayed_temp: Isolette_Data_Model.Temp_impl = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.displayed_temp_Id) match {
      case Some(Isolette_Data_Model.Temp_impl_Payload(value)) =>
        last_api_displayed_temp = Some(value)
        return value
      case _ if last_api_displayed_temp.isEmpty =>
        assert(F, "No value found on outgoing data port displayed_temp.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port displayed_temp.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_displayed_temp.get
    }
  }
  var last_api_regulator_status: Option[Isolette_Data_Model.Status.Type] = None()

  /** get the value of outgoing data port regulator_status.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_regulator_status.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_regulator_status: Isolette_Data_Model.Status.Type = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.regulator_status_Id) match {
      case Some(Isolette_Data_Model.Status_Payload(value)) =>
        last_api_regulator_status = Some(value)
        return value
      case _ if last_api_regulator_status.isEmpty =>
        assert(F, "No value found on outgoing data port regulator_status.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port regulator_status.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_regulator_status.get
    }
  }
  var last_api_interface_failure: Option[Isolette_Data_Model.Failure_Flag_impl] = None()

  /** get the value of outgoing data port interface_failure.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_interface_failure.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_interface_failure: Isolette_Data_Model.Failure_Flag_impl = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.interface_failure_Id) match {
      case Some(Isolette_Data_Model.Failure_Flag_impl_Payload(value)) =>
        last_api_interface_failure = Some(value)
        return value
      case _ if last_api_interface_failure.isEmpty =>
        assert(F, "No value found on outgoing data port interface_failure.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port interface_failure.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_interface_failure.get
    }
  }
  var preStateContainer_wL: Option[Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(
        api_displayed_temp = get_api_displayed_temp,
        api_interface_failure = get_api_interface_failure,
        api_lower_desired_temp = get_api_lower_desired_temp,
        api_regulator_status = get_api_regulator_status,
        api_upper_desired_temp = get_api_upper_desired_temp)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS(
        api_current_tempWstatus = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.current_tempWstatus_Id).get.asInstanceOf[Isolette_Data_Model.TempWstatus_impl_Payload].value, 
        api_lower_desired_tempWstatus = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.lower_desired_tempWstatus_Id).get.asInstanceOf[Isolette_Data_Model.TempWstatus_impl_Payload].value, 
        api_regulator_mode = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.regulator_mode_Id).get.asInstanceOf[Isolette_Data_Model.Regulator_Mode_Payload].value, 
        api_upper_desired_tempWstatus = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.operational_api.upper_desired_tempWstatus_Id).get.asInstanceOf[Isolette_Data_Model.TempWstatus_impl_Payload].value))

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS(
        api_displayed_temp = get_api_displayed_temp,
        api_interface_failure = get_api_interface_failure,
        api_lower_desired_temp = get_api_lower_desired_temp,
        api_regulator_status = get_api_regulator_status,
        api_upper_desired_temp = get_api_upper_desired_temp)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_interface_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}