// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc._

@sig trait OperatorDesk_i_Api {
  def id: Art.BridgeId
  def opMode_Id : Art.PortId
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
  def stop_Id : Art.PortId
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

  // Logika spec var representing port state for outgoing event port
  @spec var stop: Option[art.Empty] = $

  def put_stop() : Unit = {
    Contract(
      Modifies(stop),
      Ensures(
        stop == Some(Empty())
      )
    )
    Spec {
      stop = Some(Empty())
    }

    Art.putValue(stop_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepair0: Option[art.Empty] = $

  def put_pumpRepair0() : Unit = {
    Contract(
      Modifies(pumpRepair0),
      Ensures(
        pumpRepair0 == Some(Empty())
      )
    )
    Spec {
      pumpRepair0 = Some(Empty())
    }

    Art.putValue(pumpRepair0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepair1: Option[art.Empty] = $

  def put_pumpRepair1() : Unit = {
    Contract(
      Modifies(pumpRepair1),
      Ensures(
        pumpRepair1 == Some(Empty())
      )
    )
    Spec {
      pumpRepair1 = Some(Empty())
    }

    Art.putValue(pumpRepair1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepair2: Option[art.Empty] = $

  def put_pumpRepair2() : Unit = {
    Contract(
      Modifies(pumpRepair2),
      Ensures(
        pumpRepair2 == Some(Empty())
      )
    )
    Spec {
      pumpRepair2 = Some(Empty())
    }

    Art.putValue(pumpRepair2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpRepair3: Option[art.Empty] = $

  def put_pumpRepair3() : Unit = {
    Contract(
      Modifies(pumpRepair3),
      Ensures(
        pumpRepair3 == Some(Empty())
      )
    )
    Spec {
      pumpRepair3 = Some(Empty())
    }

    Art.putValue(pumpRepair3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepair0: Option[art.Empty] = $

  def put_pumpControlRepair0() : Unit = {
    Contract(
      Modifies(pumpControlRepair0),
      Ensures(
        pumpControlRepair0 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepair0 = Some(Empty())
    }

    Art.putValue(pumpControlRepair0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepair1: Option[art.Empty] = $

  def put_pumpControlRepair1() : Unit = {
    Contract(
      Modifies(pumpControlRepair1),
      Ensures(
        pumpControlRepair1 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepair1 = Some(Empty())
    }

    Art.putValue(pumpControlRepair1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepair2: Option[art.Empty] = $

  def put_pumpControlRepair2() : Unit = {
    Contract(
      Modifies(pumpControlRepair2),
      Ensures(
        pumpControlRepair2 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepair2 = Some(Empty())
    }

    Art.putValue(pumpControlRepair2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlRepair3: Option[art.Empty] = $

  def put_pumpControlRepair3() : Unit = {
    Contract(
      Modifies(pumpControlRepair3),
      Ensures(
        pumpControlRepair3 == Some(Empty())
      )
    )
    Spec {
      pumpControlRepair3 = Some(Empty())
    }

    Art.putValue(pumpControlRepair3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var levelRepair: Option[art.Empty] = $

  def put_levelRepair() : Unit = {
    Contract(
      Modifies(levelRepair),
      Ensures(
        levelRepair == Some(Empty())
      )
    )
    Spec {
      levelRepair = Some(Empty())
    }

    Art.putValue(levelRepair_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var steamRepair: Option[art.Empty] = $

  def put_steamRepair() : Unit = {
    Contract(
      Modifies(steamRepair),
      Ensures(
        steamRepair == Some(Empty())
      )
    )
    Spec {
      steamRepair = Some(Empty())
    }

    Art.putValue(steamRepair_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFailAck0: Option[art.Empty] = $

  def put_pumpFailAck0() : Unit = {
    Contract(
      Modifies(pumpFailAck0),
      Ensures(
        pumpFailAck0 == Some(Empty())
      )
    )
    Spec {
      pumpFailAck0 = Some(Empty())
    }

    Art.putValue(pumpFailAck0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFailAck1: Option[art.Empty] = $

  def put_pumpFailAck1() : Unit = {
    Contract(
      Modifies(pumpFailAck1),
      Ensures(
        pumpFailAck1 == Some(Empty())
      )
    )
    Spec {
      pumpFailAck1 = Some(Empty())
    }

    Art.putValue(pumpFailAck1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFailAck2: Option[art.Empty] = $

  def put_pumpFailAck2() : Unit = {
    Contract(
      Modifies(pumpFailAck2),
      Ensures(
        pumpFailAck2 == Some(Empty())
      )
    )
    Spec {
      pumpFailAck2 = Some(Empty())
    }

    Art.putValue(pumpFailAck2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpFailAck3: Option[art.Empty] = $

  def put_pumpFailAck3() : Unit = {
    Contract(
      Modifies(pumpFailAck3),
      Ensures(
        pumpFailAck3 == Some(Empty())
      )
    )
    Spec {
      pumpFailAck3 = Some(Empty())
    }

    Art.putValue(pumpFailAck3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFailAck0: Option[art.Empty] = $

  def put_pumpControlFailAck0() : Unit = {
    Contract(
      Modifies(pumpControlFailAck0),
      Ensures(
        pumpControlFailAck0 == Some(Empty())
      )
    )
    Spec {
      pumpControlFailAck0 = Some(Empty())
    }

    Art.putValue(pumpControlFailAck0_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFailAck1: Option[art.Empty] = $

  def put_pumpControlFailAck1() : Unit = {
    Contract(
      Modifies(pumpControlFailAck1),
      Ensures(
        pumpControlFailAck1 == Some(Empty())
      )
    )
    Spec {
      pumpControlFailAck1 = Some(Empty())
    }

    Art.putValue(pumpControlFailAck1_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFailAck2: Option[art.Empty] = $

  def put_pumpControlFailAck2() : Unit = {
    Contract(
      Modifies(pumpControlFailAck2),
      Ensures(
        pumpControlFailAck2 == Some(Empty())
      )
    )
    Spec {
      pumpControlFailAck2 = Some(Empty())
    }

    Art.putValue(pumpControlFailAck2_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var pumpControlFailAck3: Option[art.Empty] = $

  def put_pumpControlFailAck3() : Unit = {
    Contract(
      Modifies(pumpControlFailAck3),
      Ensures(
        pumpControlFailAck3 == Some(Empty())
      )
    )
    Spec {
      pumpControlFailAck3 = Some(Empty())
    }

    Art.putValue(pumpControlFailAck3_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var levelFailAck: Option[art.Empty] = $

  def put_levelFailAck() : Unit = {
    Contract(
      Modifies(levelFailAck),
      Ensures(
        levelFailAck == Some(Empty())
      )
    )
    Spec {
      levelFailAck = Some(Empty())
    }

    Art.putValue(levelFailAck_Id, art.Empty())
  }

  // Logika spec var representing port state for outgoing event port
  @spec var steamFailAck: Option[art.Empty] = $

  def put_steamFailAck() : Unit = {
    Contract(
      Modifies(steamFailAck),
      Ensures(
        steamFailAck == Some(Empty())
      )
    )
    Spec {
      steamFailAck = Some(Empty())
    }

    Art.putValue(steamFailAck_Id, art.Empty())
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

@datatype class OperatorDesk_i_Initialization_Api (
  val id: Art.BridgeId,
  val opMode_Id : Art.PortId,
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
  val steamRepairAck_Id : Art.PortId,
  val stop_Id : Art.PortId,
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
  val steamFailAck_Id : Art.PortId) extends OperatorDesk_i_Api

@datatype class OperatorDesk_i_Operational_Api (
  val id: Art.BridgeId,
  val opMode_Id : Art.PortId,
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
  val steamRepairAck_Id : Art.PortId,
  val stop_Id : Art.PortId,
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
  val steamFailAck_Id : Art.PortId) extends OperatorDesk_i_Api {

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
  @spec var pumpFail0: Option[art.Empty] = $

  def get_pumpFail0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFail0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFail0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFail0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpFail1: Option[art.Empty] = $

  def get_pumpFail1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFail1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFail1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFail1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpFail2: Option[art.Empty] = $

  def get_pumpFail2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFail2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFail2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFail2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpFail3: Option[art.Empty] = $

  def get_pumpFail3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpFail3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpFail3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpFail3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFail0: Option[art.Empty] = $

  def get_pumpControlFail0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFail0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFail0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFail0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFail1: Option[art.Empty] = $

  def get_pumpControlFail1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFail1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFail1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFail1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFail2: Option[art.Empty] = $

  def get_pumpControlFail2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFail2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFail2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFail2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlFail3: Option[art.Empty] = $

  def get_pumpControlFail3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlFail3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlFail3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlFail3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var levelFail: Option[art.Empty] = $

  def get_levelFail() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == levelFail
      )
    )
    val value : Option[art.Empty] = Art.getValue(levelFail_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port levelFail.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var steamFail: Option[art.Empty] = $

  def get_steamFail() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == steamFail
      )
    )
    val value : Option[art.Empty] = Art.getValue(steamFail_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port steamFail.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepairAck0: Option[art.Empty] = $

  def get_pumpRepairAck0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepairAck0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepairAck0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepairAck0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepairAck1: Option[art.Empty] = $

  def get_pumpRepairAck1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepairAck1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepairAck1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepairAck1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepairAck2: Option[art.Empty] = $

  def get_pumpRepairAck2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepairAck2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepairAck2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepairAck2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpRepairAck3: Option[art.Empty] = $

  def get_pumpRepairAck3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpRepairAck3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpRepairAck3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpRepairAck3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepairAck0: Option[art.Empty] = $

  def get_pumpControlRepairAck0() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepairAck0
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepairAck0_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepairAck0.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepairAck1: Option[art.Empty] = $

  def get_pumpControlRepairAck1() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepairAck1
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepairAck1_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepairAck1.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepairAck2: Option[art.Empty] = $

  def get_pumpControlRepairAck2() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepairAck2
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepairAck2_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepairAck2.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var pumpControlRepairAck3: Option[art.Empty] = $

  def get_pumpControlRepairAck3() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == pumpControlRepairAck3
      )
    )
    val value : Option[art.Empty] = Art.getValue(pumpControlRepairAck3_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port pumpControlRepairAck3.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var levelRepairAck: Option[art.Empty] = $

  def get_levelRepairAck() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == levelRepairAck
      )
    )
    val value : Option[art.Empty] = Art.getValue(levelRepairAck_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port levelRepairAck.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var steamRepairAck: Option[art.Empty] = $

  def get_steamRepairAck() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == steamRepairAck
      )
    )
    val value : Option[art.Empty] = Art.getValue(steamRepairAck_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port steamRepairAck.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }
}
