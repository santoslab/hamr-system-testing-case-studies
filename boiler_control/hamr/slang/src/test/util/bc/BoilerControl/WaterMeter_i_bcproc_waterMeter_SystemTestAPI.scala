// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc.SystemTestSuiteSlang.runtimeMonitorStream
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object WaterMeter_i_bcproc_waterMeter_SystemTestAPI {
  /** helper method to set the values of all incoming ports and state variables
    * @param In_volume pre-state state variable
    * @param api_programReady incoming event port
    * @param api_opMode incoming event data port
    */
  def put_concrete_inputs(In_volume: Base_Types.Float_32,
                          api_programReady: Option[art.Empty],
                          api_opMode: Option[BoilerControl.OpMode.Type]): Unit = {
    put_In_volume(In_volume)
    put_programReady(api_programReady)
    put_opMode(api_opMode)
  }

  // setter for state variable
  def put_In_volume(value: Base_Types.Float_32): Unit = {
    WaterMeter_i_bcproc_waterMeter.volume = value
  }

  // setter for incoming event  port
  def put_programReady(value: Option[art.Empty]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.programReady_Id, v)
      case _ =>
    }
  }

  // setter for incoming event data port
  def put_opMode(value: Option[BoilerControl.OpMode.Type]): Unit = {
    value match {
      case Some(v) => Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.opMode_Id, BoilerControl.OpMode_Payload(v))
      case _ =>
    }
  }

  def fetchContainer(): bc.BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
    if (runtimeMonitorStream.contains(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.id)) {
      val (_, postContainer_) = runtimeMonitorStream.get(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.id).get
      return postContainer_.asInstanceOf[bc.BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS]
    }
    else {
      assert(F, s"No post state recorded for ${Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.name}")
      halt(s"No post state recorded for ${Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.name}")
    }
  }

  def check_concrete_outputs(volume: Base_Types.Float_32,
                             api_ready: Option[art.Empty],
                             api_level: Option[Base_Types.Float_32]): Unit = {
    var failureReasons: ISZ[ST] = ISZ()

    val actual_volume = get_volume()
    if (volume != actual_volume) {
      failureReasons = failureReasons :+ st"'volume' did not match expected.  Expected: $volume, Actual: $actual_volume"
    }
    val actual_ready = get_api_ready()
    if (api_ready != actual_ready) {
      failureReasons = failureReasons :+ st"'ready' did not match expected.  Expected: $api_ready, Actual: $actual_ready"
    }
    val actual_level = get_api_level()
    if (api_level != actual_level) {
      failureReasons = failureReasons :+ st"'level' did not match expected.  Expected: $api_level, Actual: $actual_level"
    }

    assert(failureReasons.isEmpty, st"${(failureReasons, "\n")}".render)
  }

  // getter for state variable
  def get_volume(): Base_Types.Float_32 = {
    return WaterMeter_i_bcproc_waterMeter.volume
  }

  def get_api_ready(): Option[art.Empty] = {
    return fetchContainer().api_ready
  }

  def get_api_level(): Option[Base_Types.Float_32] = {
    return fetchContainer().api_level
  }
}