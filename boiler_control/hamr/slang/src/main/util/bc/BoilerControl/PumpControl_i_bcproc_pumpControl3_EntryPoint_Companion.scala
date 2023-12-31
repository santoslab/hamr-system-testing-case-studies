// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object PumpControl_i_bcproc_pumpControl3_EntryPoint_Companion {

  var preStateContainer_wL: Option[PumpControl_i_bcproc_pumpControl3_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      PumpControl_i_bcproc_pumpControl3_PostState_Container_PS(
        isPumpFlow = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.isPumpFlow,
        isPumpOpen = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.isPumpOpen,
        pumpNumber = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.pumpNumber,
        api_ready = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.ready_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFlow = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpFlow_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpFlow_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_pumpOpen = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpOpen_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpOpen_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl3_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      PumpControl_i_bcproc_pumpControl3_PreState_Container_PS(
        In_isPumpFlow = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.isPumpFlow, 
        In_isPumpOpen = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.isPumpOpen, 
        In_pumpNumber = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.pumpNumber, 
        api_programReady = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.programReady_Id).asInstanceOf[Option[art.Empty]], 
        api_opMode = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.opMode_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.opMode_Id).get.asInstanceOf[BoilerControl.OpMode_Payload].value)
          else None(), 
        api_openPump = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.openPump_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.openPump_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None()))

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl3_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      PumpControl_i_bcproc_pumpControl3_PostState_Container_PS(
        isPumpFlow = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.isPumpFlow,
        isPumpOpen = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.isPumpOpen,
        pumpNumber = bc.BoilerControl.PumpControl_i_bcproc_pumpControl3.pumpNumber,
        api_ready = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.ready_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFlow = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpFlow_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpFlow_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_pumpOpen = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpOpen_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.operational_api.pumpOpen_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl3.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl3_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}