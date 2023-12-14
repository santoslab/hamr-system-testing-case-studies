// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc.SystemTestSuiteSlang.runtimeMonitorStream
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object PumpControl_i_bcproc_pumpControl0_SystemTestAPI {
  /** helper method to set the values of all incoming ports and state variables
    * @param In_isPumpFlow pre-state state variable
    * @param In_isPumpOpen pre-state state variable
    * @param In_pumpNumber pre-state state variable
    * @param api_programReady incoming event port
    * @param api_opMode incoming event data port
    * @param api_openPump incoming event data port
    */
  def put_concrete_inputs(In_isPumpFlow: Base_Types.Boolean,
                          In_isPumpOpen: Base_Types.Boolean,
                          In_pumpNumber: Base_Types.Integer,
                          api_programReady: Option[art.Empty],
                          api_opMode: Option[BoilerControl.OpMode.Type],
                          api_openPump: Option[Base_Types.Boolean]): Unit = {
    put_In_isPumpFlow(In_isPumpFlow)
    put_In_isPumpOpen(In_isPumpOpen)
    put_In_pumpNumber(In_pumpNumber)
    put_programReady(api_programReady)
    put_opMode(api_opMode)
    put_openPump(api_openPump)
  }

  // setter for state variable
  def put_In_isPumpFlow(value: Base_Types.Boolean): Unit = {
    PumpControl_i_bcproc_pumpControl0.isPumpFlow = value
  }

  // setter for state variable
  def put_In_isPumpOpen(value: Base_Types.Boolean): Unit = {
    PumpControl_i_bcproc_pumpControl0.isPumpOpen = value
  }

  // setter for state variable
  def put_In_pumpNumber(value: Base_Types.Integer): Unit = {
    PumpControl_i_bcproc_pumpControl0.pumpNumber = value
  }

  // setter for incoming event  port
  def put_programReady(value: Option[art.Empty]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl0.operational_api.programReady_Id, v)
      case _ =>
    }
  }

  // setter for incoming event data port
  def put_opMode(value: Option[BoilerControl.OpMode.Type]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl0.operational_api.opMode_Id, BoilerControl.OpMode_Payload(v))
      case _ =>
    }
  }

  // setter for incoming event data port
  def put_openPump(value: Option[Base_Types.Boolean]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl0.operational_api.openPump_Id, Base_Types.Boolean_Payload(v))
      case _ =>
    }
  }

  def fetchContainer(): bc.BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
    if (runtimeMonitorStream.contains(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl0.id)) {
      val (_, postContainer_) = runtimeMonitorStream.get(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl0.id).get
      return postContainer_.asInstanceOf[bc.BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS]
    }
    else {
      assert(F, s"No post state recorded for ${Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl0.name}")
      halt(s"No post state recorded for ${Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl0.name}")
    }
  }

  def check_concrete_outputs(isPumpFlow: Base_Types.Boolean,
                             isPumpOpen: Base_Types.Boolean,
                             pumpNumber: Base_Types.Integer,
                             api_ready: Option[art.Empty],
                             api_pumpFlow: Option[Base_Types.Boolean],
                             api_pumpOpen: Option[Base_Types.Boolean]): Unit = {
    var failureReasons: ISZ[ST] = ISZ()

    val actual_isPumpFlow = get_isPumpFlow()
    if (isPumpFlow != actual_isPumpFlow) {
      failureReasons = failureReasons :+ st"'isPumpFlow' did not match expected.  Expected: $isPumpFlow, Actual: $actual_isPumpFlow"
    }
    val actual_isPumpOpen = get_isPumpOpen()
    if (isPumpOpen != actual_isPumpOpen) {
      failureReasons = failureReasons :+ st"'isPumpOpen' did not match expected.  Expected: $isPumpOpen, Actual: $actual_isPumpOpen"
    }
    val actual_pumpNumber = get_pumpNumber()
    if (pumpNumber != actual_pumpNumber) {
      failureReasons = failureReasons :+ st"'pumpNumber' did not match expected.  Expected: $pumpNumber, Actual: $actual_pumpNumber"
    }
    val actual_ready = get_api_ready()
    if (api_ready != actual_ready) {
      failureReasons = failureReasons :+ st"'ready' did not match expected.  Expected: $api_ready, Actual: $actual_ready"
    }
    val actual_pumpFlow = get_api_pumpFlow()
    if (api_pumpFlow != actual_pumpFlow) {
      failureReasons = failureReasons :+ st"'pumpFlow' did not match expected.  Expected: $api_pumpFlow, Actual: $actual_pumpFlow"
    }
    val actual_pumpOpen = get_api_pumpOpen()
    if (api_pumpOpen != actual_pumpOpen) {
      failureReasons = failureReasons :+ st"'pumpOpen' did not match expected.  Expected: $api_pumpOpen, Actual: $actual_pumpOpen"
    }

    assert(failureReasons.isEmpty, st"${(failureReasons, "\n")}".render)
  }

  // getter for state variable
  def get_isPumpFlow(): Base_Types.Boolean = {
    return PumpControl_i_bcproc_pumpControl0.isPumpFlow
  }

  // getter for state variable
  def get_isPumpOpen(): Base_Types.Boolean = {
    return PumpControl_i_bcproc_pumpControl0.isPumpOpen
  }

  // getter for state variable
  def get_pumpNumber(): Base_Types.Integer = {
    return PumpControl_i_bcproc_pumpControl0.pumpNumber
  }

  def get_api_ready(): Option[art.Empty] = {
    return fetchContainer().api_ready
  }

  def get_api_pumpFlow(): Option[Base_Types.Boolean] = {
    return fetchContainer().api_pumpFlow
  }

  def get_api_pumpOpen(): Option[Base_Types.Boolean] = {
    return fetchContainer().api_pumpOpen
  }
}