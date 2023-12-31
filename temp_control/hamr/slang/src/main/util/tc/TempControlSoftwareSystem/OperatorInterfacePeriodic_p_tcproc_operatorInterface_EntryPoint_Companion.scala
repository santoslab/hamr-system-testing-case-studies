// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import art._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object OperatorInterfacePeriodic_p_tcproc_operatorInterface_EntryPoint_Companion {

  var last_api_setPoint: Option[TempControlSoftwareSystem.SetPoint_i] = None()

  /** get the value of outgoing data port setPoint.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_setPoint.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_setPoint: TempControlSoftwareSystem.SetPoint_i = {
    Art.observeOutPortVariable(Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.operational_api.setPoint_Id) match {
      case Some(TempControlSoftwareSystem.SetPoint_i_Payload(value)) =>
        last_api_setPoint = Some(value)
        return value
      case _ if last_api_setPoint.isEmpty =>
        assert(F, "No value found on outgoing data port setPoint.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port setPoint.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_setPoint.get
    }
  }
  var preStateContainer_wL: Option[OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(
        api_setPoint = get_api_setPoint)

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.id, tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      OperatorInterfacePeriodic_p_tcproc_operatorInterface_PreState_Container_PS(
        api_currentTemp = Art.observeInPortVariable(Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.operational_api.currentTemp_Id).get.asInstanceOf[TempSensor.Temperature_i_Payload].value))

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.id, tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      OperatorInterfacePeriodic_p_tcproc_operatorInterface_PostState_Container_PS(
        api_setPoint = get_api_setPoint)

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.id, tc.runtimemonitor.ObservationKind.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}