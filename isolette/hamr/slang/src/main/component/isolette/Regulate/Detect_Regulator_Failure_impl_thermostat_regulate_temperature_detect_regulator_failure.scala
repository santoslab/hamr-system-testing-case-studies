// #Sireum

package isolette.Regulate

import isolette.Isolette_Data_Model.Failure_Flag_impl
import org.sireum._
import isolette._

// This file will not be overwritten so is safe to edit
object Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure {

  def initialise(api: Detect_Regulator_Failure_impl_Initialization_Api): Unit = {
    api.put_internal_failure(Failure_Flag_impl(F))
  }

  def timeTriggered(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = {  }

  def activate(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }

  def deactivate(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }

  def finalise(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }

  def recover(api: Detect_Regulator_Failure_impl_Operational_Api): Unit = { }
}
