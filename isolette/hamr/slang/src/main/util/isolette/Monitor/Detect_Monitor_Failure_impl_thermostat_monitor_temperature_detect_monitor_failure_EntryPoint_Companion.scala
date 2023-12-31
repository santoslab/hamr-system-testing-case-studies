// #Sireum

package isolette.Monitor

import org.sireum._
import art._
import isolette._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_EntryPoint_Companion {

  var last_api_internal_failure: Option[Isolette_Data_Model.Failure_Flag_impl] = None()

  /** get the value of outgoing data port internal_failure.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_internal_failure.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_internal_failure: Isolette_Data_Model.Failure_Flag_impl = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure.operational_api.internal_failure_Id) match {
      case Some(Isolette_Data_Model.Failure_Flag_impl_Payload(value)) =>
        last_api_internal_failure = Some(value)
        return value
      case _ if last_api_internal_failure.isEmpty =>
        assert(F, "No value found on outgoing data port internal_failure.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port internal_failure.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_internal_failure.get
    }
  }
  var preStateContainer_wL: Option[Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(
        api_internal_failure = get_api_internal_failure)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS())

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS(
        api_internal_failure = get_api_internal_failure)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_monitor_temperature_detect_monitor_failure_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}