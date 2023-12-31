// #Sireum

package isolette.Monitor

import org.sireum._
import art._
import isolette._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_EntryPoint_Companion {

  var last_api_alarm_control: Option[Isolette_Data_Model.On_Off.Type] = None()

  /** get the value of outgoing data port alarm_control.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_alarm_control.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_alarm_control: Isolette_Data_Model.On_Off.Type = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.alarm_control_Id) match {
      case Some(Isolette_Data_Model.On_Off_Payload(value)) =>
        last_api_alarm_control = Some(value)
        return value
      case _ if last_api_alarm_control.isEmpty =>
        assert(F, "No value found on outgoing data port alarm_control.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port alarm_control.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_alarm_control.get
    }
  }
  var preStateContainer_wL: Option[Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(
        lastCmd = isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.lastCmd,
        api_alarm_control = get_api_alarm_control)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS(
        In_lastCmd = isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.lastCmd, 
        api_current_tempWstatus = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.current_tempWstatus_Id).get.asInstanceOf[Isolette_Data_Model.TempWstatus_impl_Payload].value, 
        api_lower_alarm_temp = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.lower_alarm_temp_Id).get.asInstanceOf[Isolette_Data_Model.Temp_impl_Payload].value, 
        api_monitor_mode = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.monitor_mode_Id).get.asInstanceOf[Isolette_Data_Model.Monitor_Mode_Payload].value, 
        api_upper_alarm_temp = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.operational_api.upper_alarm_temp_Id).get.asInstanceOf[Isolette_Data_Model.Temp_impl_Payload].value))

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS(
        lastCmd = isolette.Monitor.Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm.lastCmd,
        api_alarm_control = get_api_alarm_control)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_monitor_temperature_manage_alarm_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}