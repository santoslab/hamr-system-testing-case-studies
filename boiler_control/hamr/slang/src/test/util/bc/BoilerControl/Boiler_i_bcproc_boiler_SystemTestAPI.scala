// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc.SystemTestSuiteSlang.runtimeMonitorStream
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Boiler_i_bcproc_boiler_SystemTestAPI {
  /** helper method to set the values of all incoming ports and state variables
    * @param In_Mode pre-state state variable
    * @param In_ValveOpen pre-state state variable
    * @param api_programReady incoming event port
    * @param api_valve incoming event port
    * @param api_opMode incoming event data port
    */
  def put_concrete_inputs(In_Mode: BoilerControl.OpMode.Type,
                          In_ValveOpen: Base_Types.Boolean,
                          api_programReady: Option[art.Empty],
                          api_valve: Option[art.Empty],
                          api_opMode: Option[BoilerControl.OpMode.Type]): Unit = {
    put_In_Mode(In_Mode)
    put_In_ValveOpen(In_ValveOpen)
    put_programReady(api_programReady)
    put_valve(api_valve)
    put_opMode(api_opMode)
  }

  // setter for state variable
  def put_In_Mode(value: BoilerControl.OpMode.Type): Unit = {
    Boiler_i_bcproc_boiler.Mode = value
  }

  // setter for state variable
  def put_In_ValveOpen(value: Base_Types.Boolean): Unit = {
    Boiler_i_bcproc_boiler.ValveOpen = value
  }

  // setter for incoming event  port
  def put_programReady(value: Option[art.Empty]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_boiler.operational_api.programReady_Id, v)
      case _ =>
    }
  }

  // setter for incoming event  port
  def put_valve(value: Option[art.Empty]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_boiler.operational_api.valve_Id, v)
      case _ =>
    }
  }

  // setter for incoming event data port
  def put_opMode(value: Option[BoilerControl.OpMode.Type]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_boiler.operational_api.opMode_Id, BoilerControl.OpMode_Payload(v))
      case _ =>
    }
  }

  def fetchContainer(): bc.BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
    if (runtimeMonitorStream.contains(Arch.BoilerControlSystem_i_Instance_bcproc_boiler.id)) {
      val (_, postContainer_) = runtimeMonitorStream.get(Arch.BoilerControlSystem_i_Instance_bcproc_boiler.id).get
      return postContainer_.asInstanceOf[bc.BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS]
    }
    else {
      assert(F, s"No post state recorded for ${Arch.BoilerControlSystem_i_Instance_bcproc_boiler.name}")
      halt(s"No post state recorded for ${Arch.BoilerControlSystem_i_Instance_bcproc_boiler.name}")
    }
  }

  def check_concrete_outputs(Mode: BoilerControl.OpMode.Type,
                             ValveOpen: Base_Types.Boolean,
                             api_ready: Option[art.Empty],
                             api_waiting: Option[art.Empty]): Unit = {
    var failureReasons: ISZ[ST] = ISZ()

    val actual_Mode = get_Mode()
    if (Mode != actual_Mode) {
      failureReasons = failureReasons :+ st"'Mode' did not match expected.  Expected: $Mode, Actual: $actual_Mode"
    }
    val actual_ValveOpen = get_ValveOpen()
    if (ValveOpen != actual_ValveOpen) {
      failureReasons = failureReasons :+ st"'ValveOpen' did not match expected.  Expected: $ValveOpen, Actual: $actual_ValveOpen"
    }
    val actual_ready = get_api_ready()
    if (api_ready != actual_ready) {
      failureReasons = failureReasons :+ st"'ready' did not match expected.  Expected: $api_ready, Actual: $actual_ready"
    }
    val actual_waiting = get_api_waiting()
    if (api_waiting != actual_waiting) {
      failureReasons = failureReasons :+ st"'waiting' did not match expected.  Expected: $api_waiting, Actual: $actual_waiting"
    }

    assert(failureReasons.isEmpty, st"${(failureReasons, "\n")}".render)
  }

  // getter for state variable
  def get_Mode(): BoilerControl.OpMode.Type = {
    return Boiler_i_bcproc_boiler.Mode
  }

  // getter for state variable
  def get_ValveOpen(): Base_Types.Boolean = {
    return Boiler_i_bcproc_boiler.ValveOpen
  }

  def get_api_ready(): Option[art.Empty] = {
    return fetchContainer().api_ready
  }

  def get_api_waiting(): Option[art.Empty] = {
    return fetchContainer().api_waiting
  }
}