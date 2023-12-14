// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc._

@sig trait SteamMeter_i_Api {
  def id: Art.BridgeId
  def opMode_Id : Art.PortId
  def rate_Id : Art.PortId
  def programReady_Id : Art.PortId
  def ready_Id : Art.PortId

  // Logika spec var representing port state for outgoing event data port
  @spec var rate: Option[Base_Types.Float_32] = $

  def put_rate(value : Base_Types.Float_32) : Unit = {
    Contract(
      Modifies(rate),
      Ensures(
        rate == Some(value)
      )
    )
    Spec {
      rate = Some(value)
    }

    Art.putValue(rate_Id, Base_Types.Float_32_Payload(value))
  }

  // Logika spec var representing port state for outgoing event port
  @spec var ready: Option[art.Empty] = $

  def put_ready() : Unit = {
    Contract(
      Modifies(ready),
      Ensures(
        ready == Some(Empty())
      )
    )
    Spec {
      ready = Some(Empty())
    }

    Art.putValue(ready_Id, art.Empty())
  }

  def logInfo(msg: String): Unit = {
    Art.logInfo(id, msg)
  }

  def logDebug(msg: String): Unit = {
    Art.logDebug(id, msg)
  }

  def logError(msg: String): Unit = {
    Art.logError(id, msg)
  }
}

@datatype class SteamMeter_i_Initialization_Api (
  val id: Art.BridgeId,
  val opMode_Id : Art.PortId,
  val rate_Id : Art.PortId,
  val programReady_Id : Art.PortId,
  val ready_Id : Art.PortId) extends SteamMeter_i_Api

@datatype class SteamMeter_i_Operational_Api (
  val id: Art.BridgeId,
  val opMode_Id : Art.PortId,
  val rate_Id : Art.PortId,
  val programReady_Id : Art.PortId,
  val ready_Id : Art.PortId) extends SteamMeter_i_Api {

  // Logika spec var representing port state for incoming event data port
  @spec var opMode: Option[BoilerControl.OpMode.Type] = $

  def get_opMode() : Option[BoilerControl.OpMode.Type] = {
    Contract(
      Ensures(
        Res == opMode
      )
    )
    val value : Option[BoilerControl.OpMode.Type] = Art.getValue(opMode_Id) match {
      case Some(BoilerControl.OpMode_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port opMode.  Expecting 'BoilerControl.OpMode_Payload' but received ${v}")
        None[BoilerControl.OpMode.Type]()
      case _ => None[BoilerControl.OpMode.Type]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var programReady: Option[art.Empty] = $

  def get_programReady() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == programReady
      )
    )
    val value : Option[art.Empty] = Art.getValue(programReady_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port programReady.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }
}
