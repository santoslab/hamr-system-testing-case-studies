// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc._

@sig trait BoilerControl_i_Api {
  def id: Art.BridgeId
  def pumpOpen0_Id : Art.PortId
  def pumpOpen1_Id : Art.PortId
  def pumpOpen2_Id : Art.PortId
  def pumpOpen3_Id : Art.PortId
  def pumpFlow0_Id : Art.PortId
  def pumpFlow1_Id : Art.PortId
  def pumpFlow2_Id : Art.PortId
  def pumpFlow3_Id : Art.PortId
  def waterLevel_Id : Art.PortId
  def steamRate_Id : Art.PortId
  def opMode_Id : Art.PortId
  def openPump0_Id : Art.PortId
  def openPump1_Id : Art.PortId
  def openPump2_Id : Art.PortId
  def openPump3_Id : Art.PortId
  def stop_Id : Art.PortId
  def boilerWaiting_Id : Art.PortId
  def boilerReady_Id : Art.PortId
  def waterMeterReady_Id : Art.PortId
  def pumpControlReady0_Id : Art.PortId
  def pumpControlReady1_Id : Art.PortId
  def pumpControlReady2_Id : Art.PortId
  def pumpControlReady3_Id : Art.PortId
  def steamMeterReady_Id : Art.PortId
  def pumpRepair0_Id : Art.PortId
  def pumpRepair1_Id : Art.PortId
  def pumpRepair2_Id : Art.PortId
  def pumpRepair3_Id : Art.PortId
  def pumpControlRepair0_Id : Art.PortId
  def pumpControlRepair1_Id : Art.PortId
  def pumpControlRepair2_Id : Art.PortId
  def pumpControlRepair3_Id : Art.PortId
  def levelRepair_Id : Art.PortId
  def steamRepair_Id : Art.PortId
  def pumpFailAck0_Id : Art.PortId
  def pumpFailAck1_Id : Art.PortId
  def pumpFailAck2_Id : Art.PortId
  def pumpFailAck3_Id : Art.PortId
  def pumpControlFailAck0_Id : Art.PortId
  def pumpControlFailAck1_Id : Art.PortId
  def pumpControlFailAck2_Id : Art.PortId
  def pumpControlFailAck3_Id : Art.PortId
  def levelFailAck_Id : Art.PortId
  def steamFailAck_Id : Art.PortId
  def ready_Id : Art.PortId
  def valve_Id : Art.PortId
  def pumpFail0_Id : Art.PortId
  def pumpFail1_Id : Art.PortId
  def pumpFail2_Id : Art.PortId
  def pumpFail3_Id : Art.PortId
  def pumpControlFail0_Id : Art.PortId
  def pumpControlFail1_Id : Art.PortId
  def pumpControlFail2_Id : Art.PortId
  def pumpControlFail3_Id : Art.PortId
  def levelFail_Id : Art.PortId
  def steamFail_Id : Art.PortId
  def pumpRepairAck0_Id : Art.PortId
  def pumpRepairAck1_Id : Art.PortId
  def pumpRepairAck2_Id : Art.PortId
  def pumpRepairAck3_Id : Art.PortId
  def pumpControlRepairAck0_Id : Art.PortId
  def pumpControlRepairAck1_Id : Art.PortId
  def pumpControlRepairAck2_Id : Art.PortId
  def pumpControlRepairAck3_Id : Art.PortId
  def levelRepairAck_Id : Art.PortId
  def steamRepairAck_Id : Art.PortId

  // Logika spec var representing port state for outgoing event data port
  @spec var opMode: Option[BoilerControl.OpMode.Type] = $

  def put_opMode(value : BoilerControl.OpMode.Type) : Unit = {
    Contract(
      Modifies(opMode),
      Ensures(
        opMode == Some(value)
      )
    )
    Spec {
      opMode = Some(value)
    }

    Art.putValue(opMode_Id, BoilerControl.OpMode_Payload(value))
  }

  // Logika spec var representing port state for outgoing event data port
  @spec var openPump0: Option[Base_Types.Boolean] = $

  def put_openPump0(value : Base_Types.Boolean) : Unit = {
    Contract(
      Modifies(openPump0),
      Ensures(
        openPump0 == Some(value)
      )
    )
    Spec {
      openPump0 = Some(value)
    }

    Art.putValue(openPump0_Id, Base_Types.Boolean_Payload(value))
  }

  // Logika spec var representing port state for outgoing event data port
  @spec var openPump1: Option[Base_Types.Boolean] = $

  def put_openPump1(value : Base_Types.Boolean) : Unit = {
    Contract(
      Modifies(openPump1),
      Ensures(
        openPump1 == Some(value)
      )
    )
    Spec {
      openPump1 = Some(value)
    }

    Art.putValue(openPump1_Id, Base_Types.Boolean_Payload(value))
  }

  // Logika spec var representing port state for outgoing event data port
  @spec var openPump2: Option[Base_Types.Boolean] = $

  def put_openPump2(value : Base_Types.Boolean) : Unit = {
    Contract(
      Modifies(openPump2),
      Ensures(
        openPump2 == Some(value)
      )
    )
    Spec {
      openPump2 = Some(value)
    }

    Art.putValue(openPump2_Id, Base_Types.Boolean_Payload(value))
  }

  // Logika spec var representing port state for outgoing event data port
  @spec var openPump3: Option[Base_Types.Boolean] = $

  def put_openPump3(value : Base_Types.Boolean) : Unit = {
    Contract(
      Modifies(openPump3),
      Ensures(
        openPump3 == Some(value)
      )
    )
    Spec {
      openPump3 = Some(value)
    }

    Art.putValue(openPump3_Id, Base_Types.Boolean_Payload(value))
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

  // Logika spec var representing port state for outgoing event port
  @spec var valve: Option[art.Empty] = $

  def put_valve() : Unit = {
    Contract(
      Modifies(valve),
      Ensures(
        valve == Some(Empty())
      )
    )
    Spec {
      valve = Some(Empty())
    }

    Art.putValue(valve_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFail0: Option[art.Empty] = $

  def put_pumpFail0() : Unit = {
    Contract(
      Modifies(pumpFail0),
      Ensures(
        pumpFail0 == Some(Empty())
      )
    )
    Spec {
      pumpFail0 = Some(Empty())
    }

    Art.putValue(pumpFail0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFail1: Option[art.Empty] = $

  def put_pumpFail1() : Unit = {
    Contract(
      Modifies(pumpFail1),
      Ensures(
        pumpFail1 == Some(Empty())
      )
    )
    Spec {
      pumpFail1 = Some(Empty())
    }

    Art.putValue(pumpFail1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFail2: Option[art.Empty] = $

  def put_pumpFail2() : Unit = {
    Contract(
      Modifies(pumpFail2),
      Ensures(
        pumpFail2 == Some(Empty())
      )
    )
    Spec {
      pumpFail2 = Some(Empty())
    }

    Art.putValue(pumpFail2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFail3: Option[art.Empty] = $

  def put_pumpFail3() : Unit = {
    Contract(
      Modifies(pumpFail3),
      Ensures(
        pumpFail3 == Some(Empty())
      )
    )
    Spec {
      pumpFail3 = Some(Empty())
    }

    Art.putValue(pumpFail3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFail0: Option[art.Empty] = $

  def put_pumpControlFail0() : Unit = {
    Contract(
      Modifies(pumpControlFail0),
      Ensures(
        pumpControlFail0 == Some(Empty())
      )
    )
    Spec {
      pumpControlFail0 = Some(Empty())
    }

    Art.putValue(pumpControlFail0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFail1: Option[art.Empty] = $

  def put_pumpControlFail1() : Unit = {
    Contract(
      Modifies(pumpControlFail1),
      Ensures(
        pumpControlFail1 == Some(Empty())
      )
    )
    Spec {
      pumpControlFail1 = Some(Empty())
    }

    Art.putValue(pumpControlFail1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFail2: Option[art.Empty] = $

  def put_pumpControlFail2() : Unit = {
    Contract(
      Modifies(pumpControlFail2),
      Ensures(
        pumpControlFail2 == Some(Empty())
      )
    )
    Spec {
      pumpControlFail2 = Some(Empty())
    }

    Art.putValue(pumpControlFail2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFail3: Option[art.Empty] = $

  def put_pumpControlFail3() : Unit = {
    Contract(
      Modifies(pumpControlFail3),
      Ensures(
        pumpControlFail3 == Some(Empty())
      )
    )
    Spec {
      pumpControlFail3 = Some(Empty())
    }

    Art.putValue(pumpControlFail3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var levelFail: Option[art.Empty] = $

  def put_levelFail() : Unit = {
    Contract(
      Modifies(levelFail),
      Ensures(
        levelFail == Some(Empty())
      )
    )
    Spec {
      levelFail = Some(Empty())
    }

    Art.putValue(levelFail_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var steamFail: Option[art.Empty] = $

  def put_steamFail() : Unit = {
    Contract(
      Modifies(steamFail),
      Ensures(
        steamFail == Some(Empty())
      )
    )
    Spec {
      steamFail = Some(Empty())
    }

    Art.putValue(steamFail_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepairAck0: Option[art.Empty] = $

  def put_pumpRepairAck0() : Unit = {
    Contract(
      Modifies(pumpRepairAck0),
      Ensures(
        pumpRepairAck0 == Some(Empty())
      )
    )
    Spec {
      pumpRepairAck0 = Some(Empty())
    }

    Art.putValue(pumpRepairAck0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepairAck1: Option[art.Empty] = $

  def put_pumpRepairAck1() : Unit = {
    Contract(
      Modifies(pumpRepairAck1),
      Ensures(
        pumpRepairAck1 == Some(Empty())
      )
    )
    Spec {
      pumpRepairAck1 = Some(Empty())
    }

    Art.putValue(pumpRepairAck1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepairAck2: Option[art.Empty] = $

  def put_pumpRepairAck2() : Unit = {
    Contract(
      Modifies(pumpRepairAck2),
      Ensures(
        pumpRepairAck2 == Some(Empty())
      )
    )
    Spec {
      pumpRepairAck2 = Some(Empty())
    }

    Art.putValue(pumpRepairAck2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepairAck3: Option[art.Empty] = $

  def put_pumpRepairAck3() : Unit = {
    Contract(
      Modifies(pumpRepairAck3),
      Ensures(
        pumpRepairAck3 == Some(Empty())
      )
    )
    Spec {
      pumpRepairAck3 = Some(Empty())
    }

    Art.putValue(pumpRepairAck3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepairAck0: Option[art.Empty] = $

  def put_pumpControlRepairAck0() : Unit = {
    Contract(
      Modifies(pumpControlRepairAck0),
      Ensures(
        pumpControlRepairAck0 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepairAck0 = Some(Empty())
    }

    Art.putValue(pumpControlRepairAck0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepairAck1: Option[art.Empty] = $

  def put_pumpControlRepairAck1() : Unit = {
    Contract(
      Modifies(pumpControlRepairAck1),
      Ensures(
        pumpControlRepairAck1 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepairAck1 = Some(Empty())
    }

    Art.putValue(pumpControlRepairAck1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepairAck2: Option[art.Empty] = $

  def put_pumpControlRepairAck2() : Unit = {
    Contract(
      Modifies(pumpControlRepairAck2),
      Ensures(
        pumpControlRepairAck2 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepairAck2 = Some(Empty())
    }

    Art.putValue(pumpControlRepairAck2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepairAck3: Option[art.Empty] = $

  def put_pumpControlRepairAck3() : Unit = {
    Contract(
      Modifies(pumpControlRepairAck3),
      Ensures(
        pumpControlRepairAck3 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepairAck3 = Some(Empty())
    }

    Art.putValue(pumpControlRepairAck3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var levelRepairAck: Option[art.Empty] = $

  def put_levelRepairAck() : Unit = {
    Contract(
      Modifies(levelRepairAck),
      Ensures(
        levelRepairAck == Some(Empty())
      )
    )
    Spec {
      levelRepairAck = Some(Empty())
    }

    Art.putValue(levelRepairAck_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var steamRepairAck: Option[art.Empty] = $

  def put_steamRepairAck() : Unit = {
    Contract(
      Modifies(steamRepairAck),
      Ensures(
        steamRepairAck == Some(Empty())
      )
    )
    Spec {
      steamRepairAck = Some(Empty())
    }

    Art.putValue(steamRepairAck_Id, art.Empty())
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

@datatype class BoilerControl_i_Initialization_Api (
  val id: Art.BridgeId,
  val pumpOpen0_Id : Art.PortId,
  val pumpOpen1_Id : Art.PortId,
  val pumpOpen2_Id : Art.PortId,
  val pumpOpen3_Id : Art.PortId,
  val pumpFlow0_Id : Art.PortId,
  val pumpFlow1_Id : Art.PortId,
  val pumpFlow2_Id : Art.PortId,
  val pumpFlow3_Id : Art.PortId,
  val waterLevel_Id : Art.PortId,
  val steamRate_Id : Art.PortId,
  val opMode_Id : Art.PortId,
  val openPump0_Id : Art.PortId,
  val openPump1_Id : Art.PortId,
  val openPump2_Id : Art.PortId,
  val openPump3_Id : Art.PortId,
  val stop_Id : Art.PortId,
  val boilerWaiting_Id : Art.PortId,
  val boilerReady_Id : Art.PortId,
  val waterMeterReady_Id : Art.PortId,
  val pumpControlReady0_Id : Art.PortId,
  val pumpControlReady1_Id : Art.PortId,
  val pumpControlReady2_Id : Art.PortId,
  val pumpControlReady3_Id : Art.PortId,
  val steamMeterReady_Id : Art.PortId,
  val pumpRepair0_Id : Art.PortId,
  val pumpRepair1_Id : Art.PortId,
  val pumpRepair2_Id : Art.PortId,
  val pumpRepair3_Id : Art.PortId,
  val pumpControlRepair0_Id : Art.PortId,
  val pumpControlRepair1_Id : Art.PortId,
  val pumpControlRepair2_Id : Art.PortId,
  val pumpControlRepair3_Id : Art.PortId,
  val levelRepair_Id : Art.PortId,
  val steamRepair_Id : Art.PortId,
  val pumpFailAck0_Id : Art.PortId,
  val pumpFailAck1_Id : Art.PortId,
  val pumpFailAck2_Id : Art.PortId,
  val pumpFailAck3_Id : Art.PortId,
  val pumpControlFailAck0_Id : Art.PortId,
  val pumpControlFailAck1_Id : Art.PortId,
  val pumpControlFailAck2_Id : Art.PortId,
  val pumpControlFailAck3_Id : Art.PortId,
  val levelFailAck_Id : Art.PortId,
  val steamFailAck_Id : Art.PortId,
  val ready_Id : Art.PortId,
  val valve_Id : Art.PortId,
  val pumpFail0_Id : Art.PortId,
  val pumpFail1_Id : Art.PortId,
  val pumpFail2_Id : Art.PortId,
  val pumpFail3_Id : Art.PortId,
  val pumpControlFail0_Id : Art.PortId,
  val pumpControlFail1_Id : Art.PortId,
  val pumpControlFail2_Id : Art.PortId,
  val pumpControlFail3_Id : Art.PortId,
  val levelFail_Id : Art.PortId,
  val steamFail_Id : Art.PortId,
  val pumpRepairAck0_Id : Art.PortId,
  val pumpRepairAck1_Id : Art.PortId,
  val pumpRepairAck2_Id : Art.PortId,
  val pumpRepairAck3_Id : Art.PortId,
  val pumpControlRepairAck0_Id : Art.PortId,
  val pumpControlRepairAck1_Id : Art.PortId,
  val pumpControlRepairAck2_Id : Art.PortId,
  val pumpControlRepairAck3_Id : Art.PortId,
  val levelRepairAck_Id : Art.PortId,
  val steamRepairAck_Id : Art.PortId) extends BoilerControl_i_Api

@datatype class BoilerControl_i_Operational_Api (
  val id: Art.BridgeId,
  val pumpOpen0_Id : Art.PortId,
  val pumpOpen1_Id : Art.PortId,
  val pumpOpen2_Id : Art.PortId,
  val pumpOpen3_Id : Art.PortId,
  val pumpFlow0_Id : Art.PortId,
  val pumpFlow1_Id : Art.PortId,
  val pumpFlow2_Id : Art.PortId,
  val pumpFlow3_Id : Art.PortId,
  val waterLevel_Id : Art.PortId,
  val steamRate_Id : Art.PortId,
  val opMode_Id : Art.PortId,
  val openPump0_Id : Art.PortId,
  val openPump1_Id : Art.PortId,
  val openPump2_Id : Art.PortId,
  val openPump3_Id : Art.PortId,
  val stop_Id : Art.PortId,
  val boilerWaiting_Id : Art.PortId,
  val boilerReady_Id : Art.PortId,
  val waterMeterReady_Id : Art.PortId,
  val pumpControlReady0_Id : Art.PortId,
  val pumpControlReady1_Id : Art.PortId,
  val pumpControlReady2_Id : Art.PortId,
  val pumpControlReady3_Id : Art.PortId,
  val steamMeterReady_Id : Art.PortId,
  val pumpRepair0_Id : Art.PortId,
  val pumpRepair1_Id : Art.PortId,
  val pumpRepair2_Id : Art.PortId,
  val pumpRepair3_Id : Art.PortId,
  val pumpControlRepair0_Id : Art.PortId,
  val pumpControlRepair1_Id : Art.PortId,
  val pumpControlRepair2_Id : Art.PortId,
  val pumpControlRepair3_Id : Art.PortId,
  val levelRepair_Id : Art.PortId,
  val steamRepair_Id : Art.PortId,
  val pumpFailAck0_Id : Art.PortId,
  val pumpFailAck1_Id : Art.PortId,
  val pumpFailAck2_Id : Art.PortId,
  val pumpFailAck3_Id : Art.PortId,
  val pumpControlFailAck0_Id : Art.PortId,
  val pumpControlFailAck1_Id : Art.PortId,
  val pumpControlFailAck2_Id : Art.PortId,
  val pumpControlFailAck3_Id : Art.PortId,
  val levelFailAck_Id : Art.PortId,
  val steamFailAck_Id : Art.PortId,
  val ready_Id : Art.PortId,
  val valve_Id : Art.PortId,
  val pumpFail0_Id : Art.PortId,
  val pumpFail1_Id : Art.PortId,
  val pumpFail2_Id : Art.PortId,
  val pumpFail3_Id : Art.PortId,
  val pumpControlFail0_Id : Art.PortId,
  val pumpControlFail1_Id : Art.PortId,
  val pumpControlFail2_Id : Art.PortId,
  val pumpControlFail3_Id : Art.PortId,
  val levelFail_Id : Art.PortId,
  val steamFail_Id : Art.PortId,
  val pumpRepairAck0_Id : Art.PortId,
  val pumpRepairAck1_Id : Art.PortId,
  val pumpRepairAck2_Id : Art.PortId,
  val pumpRepairAck3_Id : Art.PortId,
  val pumpControlRepairAck0_Id : Art.PortId,
  val pumpControlRepairAck1_Id : Art.PortId,
  val pumpControlRepairAck2_Id : Art.PortId,
  val pumpControlRepairAck3_Id : Art.PortId,
  val levelRepairAck_Id : Art.PortId,
  val steamRepairAck_Id : Art.PortId) extends BoilerControl_i_Api {

  // Logika spec var representing port state for incoming event data port
  @spec var pumpOpen0: Option[Base_Types.Boolean] = $

  def get_pumpOpen0() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpOpen0
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpOpen0_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpOpen0.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var pumpOpen1: Option[Base_Types.Boolean] = $

  def get_pumpOpen1() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpOpen1
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpOpen1_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpOpen1.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var pumpOpen2: Option[Base_Types.Boolean] = $

  def get_pumpOpen2() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpOpen2
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpOpen2_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpOpen2.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var pumpOpen3: Option[Base_Types.Boolean] = $

  def get_pumpOpen3() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpOpen3
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpOpen3_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpOpen3.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var pumpFlow0: Option[Base_Types.Boolean] = $

  def get_pumpFlow0() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpFlow0
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpFlow0_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFlow0.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var pumpFlow1: Option[Base_Types.Boolean] = $

  def get_pumpFlow1() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpFlow1
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpFlow1_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFlow1.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var pumpFlow2: Option[Base_Types.Boolean] = $

  def get_pumpFlow2() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpFlow2
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpFlow2_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFlow2.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var pumpFlow3: Option[Base_Types.Boolean] = $

  def get_pumpFlow3() : Option[Base_Types.Boolean] = {
    Contract(
      Ensures(
        Res == pumpFlow3
      )
    )
    val value : Option[Base_Types.Boolean] = Art.getValue(pumpFlow3_Id) match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFlow3.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
        None[Base_Types.Boolean]()
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var waterLevel: Option[Base_Types.Float_32] = $

  def get_waterLevel() : Option[Base_Types.Float_32] = {
    Contract(
      Ensures(
        Res == waterLevel
      )
    )
    val value : Option[Base_Types.Float_32] = Art.getValue(waterLevel_Id) match {
      case Some(Base_Types.Float_32_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port waterLevel.  Expecting 'Base_Types.Float_32_Payload' but received ${v}")
        None[Base_Types.Float_32]()
      case _ => None[Base_Types.Float_32]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var steamRate: Option[Base_Types.Float_32] = $

  def get_steamRate() : Option[Base_Types.Float_32] = {
    Contract(
      Ensures(
        Res == steamRate
      )
    )
    val value : Option[Base_Types.Float_32] = Art.getValue(steamRate_Id) match {
      case Some(Base_Types.Float_32_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port steamRate.  Expecting 'Base_Types.Float_32_Payload' but received ${v}")
        None[Base_Types.Float_32]()
      case _ => None[Base_Types.Float_32]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var stop: Option[art.Empty] = $

  def get_stop() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == stop
      )
    )
    val value : Option[art.Empty] = Art.getValue(stop_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port stop.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var boilerWaiting: Option[art.Empty] = $

  def get_boilerWaiting() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == boilerWaiting
      )
    )
    val value : Option[art.Empty] = Art.getValue(boilerWaiting_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port boilerWaiting.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var boilerReady: Option[art.Empty] = $

  def get_boilerReady() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == boilerReady
      )
    )
    val value : Option[art.Empty] = Art.getValue(boilerReady_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port boilerReady.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var waterMeterReady: Option[art.Empty] = $

  def get_waterMeterReady() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == waterMeterReady
      )
    )
    val value : Option[art.Empty] = Art.getValue(waterMeterReady_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port waterMeterReady.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlReady0: Option[art.Empty] = $

  def get_pumpControlReady0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlReady0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlReady0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlReady0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlReady1: Option[art.Empty] = $

  def get_pumpControlReady1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlReady1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlReady1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlReady1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlReady2: Option[art.Empty] = $

  def get_pumpControlReady2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlReady2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlReady2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlReady2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlReady3: Option[art.Empty] = $

  def get_pumpControlReady3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlReady3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlReady3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlReady3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var steamMeterReady: Option[art.Empty] = $

  def get_steamMeterReady() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == steamMeterReady
      )
    )
    val value : Option[art.Empty] = Art.getValue(steamMeterReady_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port steamMeterReady.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepair0: Option[art.Empty] = $

  def get_pumpRepair0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepair0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepair0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepair0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepair1: Option[art.Empty] = $

  def get_pumpRepair1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepair1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepair1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepair1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepair2: Option[art.Empty] = $

  def get_pumpRepair2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepair2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepair2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepair2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepair3: Option[art.Empty] = $

  def get_pumpRepair3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepair3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepair3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepair3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepair0: Option[art.Empty] = $

  def get_pumpControlRepair0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepair0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepair0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepair0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepair1: Option[art.Empty] = $

  def get_pumpControlRepair1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepair1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepair1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepair1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepair2: Option[art.Empty] = $

  def get_pumpControlRepair2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepair2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepair2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepair2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepair3: Option[art.Empty] = $

  def get_pumpControlRepair3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepair3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepair3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepair3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var levelRepair: Option[art.Empty] = $

  def get_levelRepair() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == levelRepair
      )
    )
    val value : Option[art.Empty] = Art.getValue(levelRepair_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port levelRepair.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var steamRepair: Option[art.Empty] = $

  def get_steamRepair() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == steamRepair
      )
    )
    val value : Option[art.Empty] = Art.getValue(steamRepair_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port steamRepair.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpFailAck0: Option[art.Empty] = $

  def get_pumpFailAck0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFailAck0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFailAck0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFailAck0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpFailAck1: Option[art.Empty] = $

  def get_pumpFailAck1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFailAck1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFailAck1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFailAck1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpFailAck2: Option[art.Empty] = $

  def get_pumpFailAck2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFailAck2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFailAck2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFailAck2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpFailAck3: Option[art.Empty] = $

  def get_pumpFailAck3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFailAck3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFailAck3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFailAck3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFailAck0: Option[art.Empty] = $

  def get_pumpControlFailAck0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFailAck0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFailAck0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFailAck0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFailAck1: Option[art.Empty] = $

  def get_pumpControlFailAck1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFailAck1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFailAck1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFailAck1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFailAck2: Option[art.Empty] = $

  def get_pumpControlFailAck2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFailAck2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFailAck2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFailAck2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFailAck3: Option[art.Empty] = $

  def get_pumpControlFailAck3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFailAck3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFailAck3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFailAck3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var levelFailAck: Option[art.Empty] = $

  def get_levelFailAck() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == levelFailAck
      )
    )
    val value : Option[art.Empty] = Art.getValue(levelFailAck_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port levelFailAck.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var steamFailAck: Option[art.Empty] = $

  def get_steamFailAck() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == steamFailAck
      )
    )
    val value : Option[art.Empty] = Art.getValue(steamFailAck_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port steamFailAck.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }
}
