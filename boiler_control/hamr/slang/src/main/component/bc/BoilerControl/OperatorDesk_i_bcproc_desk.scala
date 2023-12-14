// #Sireum #Logika

package bc.BoilerControl

import org.sireum._
import bc._

// This file will not be overwritten so is safe to edit
object OperatorDesk_i_bcproc_desk {

  // BEGIN STATE VARS
  var isPumpBroken0: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpBroken1: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpBroken2: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpBroken3: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpControlBroken0: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpControlBroken1: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpControlBroken2: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpControlBroken3: Base_Types.Boolean = Base_Types.Boolean_example()

  var isLevelBroken: Base_Types.Boolean = Base_Types.Boolean_example()

  var isSteamBroken: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: OperatorDesk_i_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.stop.isEmpty,
        api.pumpRepair0.isEmpty,
        api.pumpRepair1.isEmpty,
        api.pumpRepair2.isEmpty,
        api.pumpRepair3.isEmpty,
        api.pumpControlRepair0.isEmpty,
        api.pumpControlRepair1.isEmpty,
        api.pumpControlRepair2.isEmpty,
        api.pumpControlRepair3.isEmpty,
        api.levelRepair.isEmpty,
        api.steamRepair.isEmpty,
        api.pumpFailAck0.isEmpty,
        api.pumpFailAck1.isEmpty,
        api.pumpFailAck2.isEmpty,
        api.pumpFailAck3.isEmpty,
        api.pumpControlFailAck0.isEmpty,
        api.pumpControlFailAck1.isEmpty,
        api.pumpControlFailAck2.isEmpty,
        api.pumpControlFailAck3.isEmpty,
        api.levelFailAck.isEmpty,
        api.steamFailAck.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Modifies(
        isPumpBroken0,
        isPumpControlBroken0,
        isPumpBroken1,
        isPumpControlBroken1,
        isPumpBroken2,
        isPumpControlBroken2,
        isPumpBroken3,
        isPumpControlBroken3,
        isLevelBroken,
        isSteamBroken
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REQ_OPDESK_INIT_1
        //   All 'is part broken' state variable booleans start equal to false.
        !(isPumpBroken0 || isPumpBroken1 ||
           isPumpBroken2 ||
           isPumpBroken3 ||
           isPumpControlBroken0 ||
           isPumpControlBroken1 ||
           isPumpControlBroken2 ||
           isPumpControlBroken3 ||
           isLevelBroken ||
           isSteamBroken),
        // guarantee REQ_OPDESK_INIT_2
        //   All repair messages are not send during initialization.
        api.pumpRepair0.isEmpty && api.pumpRepair1.isEmpty &&
          api.pumpRepair2.isEmpty &&
          api.pumpRepair3.isEmpty &&
          api.pumpControlRepair0.isEmpty &&
          api.pumpControlRepair1.isEmpty &&
          api.pumpControlRepair2.isEmpty &&
          api.pumpControlRepair3.isEmpty &&
          api.levelRepair.isEmpty &&
          api.steamRepair.isEmpty,
        // guarantee REQ_OPDESK_INIT_3
        //   All failure acknowledgement messages are not send during initialization.
        api.pumpFailAck0.isEmpty && api.pumpFailAck1.isEmpty &&
          api.pumpFailAck2.isEmpty &&
          api.pumpFailAck3.isEmpty &&
          api.pumpControlFailAck0.isEmpty &&
          api.pumpControlFailAck1.isEmpty &&
          api.pumpControlFailAck2.isEmpty &&
          api.pumpControlFailAck3.isEmpty &&
          api.levelFailAck.isEmpty &&
          api.steamFailAck.isEmpty,
        // guarantee REQ_OPDESK_INIT_4
        //   Stop message is not sent during Initialization.
        api.stop.isEmpty
        // END INITIALIZES ENSURES
      )
    )
    isPumpBroken0 = false
    isPumpControlBroken0 = false
    isPumpBroken1 = false
    isPumpControlBroken1 = false
    isPumpBroken2 = false
    isPumpControlBroken2 = false
    isPumpBroken3 = false
    isPumpControlBroken3 = false
    isLevelBroken = false
    isSteamBroken = false
  }

  def timeTriggered(api: OperatorDesk_i_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.stop.isEmpty,
        api.pumpRepair0.isEmpty,
        api.pumpRepair1.isEmpty,
        api.pumpRepair2.isEmpty,
        api.pumpRepair3.isEmpty,
        api.pumpControlRepair0.isEmpty,
        api.pumpControlRepair1.isEmpty,
        api.pumpControlRepair2.isEmpty,
        api.pumpControlRepair3.isEmpty,
        api.levelRepair.isEmpty,
        api.steamRepair.isEmpty,
        api.pumpFailAck0.isEmpty,
        api.pumpFailAck1.isEmpty,
        api.pumpFailAck2.isEmpty,
        api.pumpFailAck3.isEmpty,
        api.pumpControlFailAck0.isEmpty,
        api.pumpControlFailAck1.isEmpty,
        api.pumpControlFailAck2.isEmpty,
        api.pumpControlFailAck3.isEmpty,
        api.levelFailAck.isEmpty,
        api.steamFailAck.isEmpty
        // END COMPUTE REQUIRES timeTriggered
      ),
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        isPumpBroken0,
        isPumpBroken1,
        isPumpBroken2,
        isPumpBroken3,
        isPumpControlBroken0,
        isPumpControlBroken1,
        isPumpControlBroken2,
        isPumpControlBroken3,
        isLevelBroken,
        isSteamBroken
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_OPDESK_COMP_1
        //   If there is not already a failure on Pump 0 and there is a nonempty port saying Pump 0 has failed, then OpDesk will acknowledge the failure.
        (!(In(isPumpBroken0) || In(isPumpControlBroken0)) &&
           (api.pumpFail0.nonEmpty || api.pumpControlFail0.nonEmpty)) -->: (api.pumpFailAck0.nonEmpty && api.pumpControlFailAck0.nonEmpty &&
          isPumpBroken0 &&
          isPumpControlBroken0),
        // case REQ_OPDESK_COMP_2
        //   If there is not already a failure on Pump 1 and there is a nonempty port saying Pump 1 has failed, then OpDesk will acknowledge the failure.
        (!(In(isPumpBroken1) || In(isPumpControlBroken1)) &&
           (api.pumpFail1.nonEmpty || api.pumpControlFail1.nonEmpty)) -->: (api.pumpFailAck1.nonEmpty && api.pumpControlFailAck1.nonEmpty &&
          isPumpBroken1 &&
          isPumpControlBroken1),
        // case REQ_OPDESK_COMP_3
        //   If there is not already a failure on Pump 2 and there is a nonempty port saying Pump 2 has failed, then OpDesk will acknowledge the failure.
        (!(In(isPumpBroken2) || In(isPumpControlBroken2)) &&
           (api.pumpFail2.nonEmpty || api.pumpControlFail2.nonEmpty)) -->: (api.pumpFailAck2.nonEmpty && api.pumpControlFailAck2.nonEmpty &&
          isPumpBroken2 &&
          isPumpControlBroken2),
        // case REQ_OPDESK_COMP_4
        //   If there is not already a failure on Pump 3 and there is a nonempty port saying Pump 3 has failed, then OpDesk will acknowledge the failure.
        (!(In(isPumpBroken3) || In(isPumpControlBroken3)) &&
           (api.pumpFail3.nonEmpty || api.pumpControlFail3.nonEmpty)) -->: (api.pumpFailAck3.nonEmpty && api.pumpControlFailAck3.nonEmpty &&
          isPumpBroken3 &&
          isPumpControlBroken3),
        // case REQ_OPDESK_COMP_5
        //   For Pump 0, if there is no failure present from the event ports, then there will be no failure acknowledgement sent for the component.
        (!(api.pumpFail0.nonEmpty || api.pumpControlFail0.nonEmpty)) -->: (api.pumpFailAck0.isEmpty && api.pumpControlFailAck0.isEmpty),
        // case REQ_OPDESK_COMP_6
        //   For Pump 1, if there is no failure present from the event ports, then there will be no failure acknowledgement sent for the component.
        (!(api.pumpFail1.nonEmpty || api.pumpControlFail1.nonEmpty)) -->: (api.pumpFailAck1.isEmpty && api.pumpControlFailAck1.isEmpty),
        // case REQ_OPDESK_COMP_7
        //   For Pump 2, if there is no failure present from the event ports, then there will be no failure acknowledgement sent for the component.
        (!(api.pumpFail2.nonEmpty || api.pumpControlFail2.nonEmpty)) -->: (api.pumpFailAck2.isEmpty && api.pumpControlFailAck2.isEmpty),
        // case REQ_OPDESK_COMP_8
        //   For Pump 3, if OpDesk has already acknowledged a given failure, or there is no failure present from the event ports, then there will be no failure acknowledgement sent for the component.
        (!(api.pumpFail3.nonEmpty || api.pumpControlFail3.nonEmpty)) -->: (api.pumpFailAck3.isEmpty && api.pumpControlFailAck3.isEmpty),
        // case REQ_OPDESK_COMP_9
        //   For Pump 0, if the system is aware of a failure, then the operator may say it has been repaired. If they do, then send a repair message for the relavent component.
        (In(isPumpBroken0) || In(isPumpControlBroken0)) -->: (api.pumpRepair0.nonEmpty && api.pumpControlRepair0.nonEmpty &&
          !(api.pumpFail0.nonEmpty || api.pumpControlFail0.nonEmpty) ->: (!isPumpBroken0 && !isPumpControlBroken0)),
        // case REQ_OPDESK_COMP_10
        //   For Pump 1, if the system is aware of a failure, then the operator may say it has been repaired. If they do, then send a repair message for the relavent component.
        (In(isPumpBroken1) || In(isPumpControlBroken1)) -->: (api.pumpRepair1.nonEmpty && api.pumpControlRepair1.nonEmpty &&
          !(api.pumpFail1.nonEmpty || api.pumpControlFail1.nonEmpty) ->: (!isPumpBroken1 && !isPumpControlBroken1)),
        // case REQ_OPDESK_COMP_11
        //   For Pump 2, if there the system is aware of a failure, then the operator may say it has been repaired. If they do, then send a repair message for the relavent component.
        (In(isPumpBroken2) || In(isPumpControlBroken2)) -->: (api.pumpRepair2.nonEmpty && api.pumpControlRepair2.nonEmpty &&
          !(api.pumpFail2.nonEmpty || api.pumpControlFail2.nonEmpty) ->: (!isPumpBroken2 && !isPumpControlBroken2)),
        // case REQ_OPDESK_COMP_12
        //   For Pump 3, if there the system is aware of a failure, then the operator may say it has been repaired. If they do, then send a repair message for the relavent component.
        (In(isPumpBroken3) || In(isPumpControlBroken3)) -->: (api.pumpRepair3.nonEmpty && api.pumpControlRepair3.nonEmpty &&
          !(api.pumpFail3.nonEmpty || api.pumpControlFail3.nonEmpty) ->: (!isPumpBroken3 && !isPumpControlBroken3)),
        // case REQ_OPDESK_COMP_13
        //   If there is not already a failure on the Water Level and there is a nonempty port saying the Water Level has failed, then OpDesk will acknowledge the failure.
        (!(In(isLevelBroken)) && api.levelFail.nonEmpty) -->: (api.levelFailAck.nonEmpty && isLevelBroken),
        // case REQ_OPDESK_COMP_14
        //   If there is not already a failure on the Steam Meter and there is a nonempty port saying the Steam Meter has failed, then OpDesk will acknowledge the failure.
        (!(In(isSteamBroken)) && api.steamFail.nonEmpty) -->: (api.steamFailAck.nonEmpty && isSteamBroken),
        // case REQ_OPDESK_COMP_15
        //   For Water Level, if OpDesk has already acknowledged a given failure, or there is no failure present from the event ports, then there will be no failure acknowledgement sent for the component.
        (!(api.levelFail.nonEmpty)) -->: (api.levelFailAck.isEmpty),
        // case REQ_OPDESK_COMP_16
        //   For Steam Meter, if OpDesk has already acknowledged a given failure, or there is no failure present from the event ports, then there will be no failure acknowledgement sent for the component.
        (!(api.steamFail.nonEmpty)) -->: (api.steamFailAck.isEmpty),
        // case REQ_OPDESK_COMP_17
        //   For Water Level, if there the system is aware of a failure, then the operator may say it has been repaired. If they do, then send a repair message for the relavent component.
        (In(isLevelBroken)) -->: (api.levelRepair.nonEmpty &&
          !(api.levelFail.nonEmpty) ->: !isLevelBroken),
        // case REQ_OPDESK_COMP_18
        //   For Water Level, if there the system is aware of a failure, then the operator may say it has been repaired. If they do, then send a repair message for the relavent component.
        (In(isSteamBroken)) -->: (api.steamRepair.nonEmpty &&
          !(api.steamFail.nonEmpty) ->: !isSteamBroken)
        // END COMPUTE ENSURES timeTriggered
      )
    )

    // BEGINNING OF REPAIRS AND FAIL CHECKING

    //PUMP 0

    if(isPumpBroken0 || isPumpControlBroken0){ // If OpDesk Knows a Repair is needed.
      //Simulating the Button The Operator May Press to Say They Fixed The Component
      isPumpBroken0 = false //Random, Maybe they did, maybe the operator did not.
      isPumpControlBroken0 = isPumpBroken0 // Will be equal to pump's status.
      if (!isPumpBroken0) { // If it has been repaired
        api.put_pumpRepair0() // tell the api.
        api.put_pumpControlRepair0() // tell the api.
      }
    }

    //PUMP 1
    if (isPumpBroken1 || isPumpControlBroken1) { // If OpDesk Knows a Repair is needed.
      //Simulating the Button The Operator May Press to Say They Fixed The Component
      isPumpBroken1 = false //Random, Maybe they did, maybe the operator did not.
      isPumpControlBroken1 = isPumpBroken1 // Will be equal to pump's status.
      if (!isPumpBroken1) { // If it has been repaired
        api.put_pumpRepair1() // tell the api.
        api.put_pumpControlRepair1() // tell the api.
      }
    }

    //PUMP 2
    if (isPumpBroken2 || isPumpControlBroken2) { // If OpDesk Knows a Repair is needed.
      //Simulating the Button The Operator May Press to Say They Fixed The Component
      isPumpBroken2 = false //Random, Maybe they did, maybe the operator did not.
      isPumpControlBroken2 = isPumpBroken2 // Will be equal to pump's status.
      if (!isPumpBroken2) { // If it has been repaired
        api.put_pumpRepair2() // tell the api.
        api.put_pumpControlRepair2() // tell the api.
      }
    }

    //PUMP 3
    if (isPumpBroken3 || isPumpControlBroken3) { // If OpDesk Knows a Repair is needed.
      //Simulating the Button The Operator May Press to Say They Fixed The Component
      isPumpBroken3 = false //Random, Maybe they did, maybe the operator did not.
      isPumpControlBroken3 = isPumpBroken3 // Will be equal to pump's status.
      if (!isPumpBroken3) { // If it has been repaired
        api.put_pumpRepair3() // tell the api.
        api.put_pumpControlRepair3() // tell the api.
      }
    }

      //WATER LEVEL
      if (isLevelBroken){// If OpDesk Knows a Repair is needed.
        //Simulating the Button The Operator May Press to Say They Fixed The Component
        isLevelBroken = false //Random, Maybe they did, maybe the operator did not.
        if (!isLevelBroken) { // If it has been repaired
          api.put_levelRepair() // tell the api.
        }
      }

    //STEAM METER
    if (isSteamBroken) { // If OpDesk Knows a Repair is needed.
      //Simulating the Button The Operator May Press to Say They Fixed The Component
      isSteamBroken = false //Random, Maybe they did, maybe the operator did not.
      if(!isSteamBroken){ // If it has been repaired
        api.put_steamRepair() // tell the api.
      }
    }
    // END OF REPAIRS

    // BEGINNING OF FAIL CHECKING

    api.get_pumpFail0() match {
      case None() =>
        api.get_pumpControlFail0() match {
          case None() =>
          case Some(_) =>
            api.put_pumpControlFailAck0()
            api.put_pumpFailAck0()
            isPumpControlBroken0 = true
            isPumpBroken0 = true
        }
      case Some(_) =>
        api.put_pumpControlFailAck0()
        api.put_pumpFailAck0()
        isPumpBroken0 = true
        isPumpControlBroken0 = true
    }

    api.get_pumpFail1() match {
      case None() =>
        api.get_pumpControlFail1() match {
          case None() =>
          case Some(_) =>
            api.put_pumpControlFailAck1()
            api.put_pumpFailAck1()
            isPumpControlBroken1 = true
            isPumpBroken1 = true
        }
      case Some(_) =>
        api.put_pumpControlFailAck1()
        api.put_pumpFailAck1()
        isPumpControlBroken1 = true
        isPumpBroken1 = true
    }
    api.get_pumpFail2() match {
      case None() =>
        api.get_pumpControlFail2() match {
          case None() =>
          case Some(_) =>
            api.put_pumpFailAck2()
            api.put_pumpControlFailAck2()
            isPumpControlBroken2 = true
            isPumpBroken2 = true
        }
      case Some(_) =>
        api.put_pumpFailAck2()
        api.put_pumpControlFailAck2()
        isPumpControlBroken2 = true
        isPumpBroken2 = true
    }
    api.get_pumpFail3() match {
      case None() =>
        api.get_pumpControlFail3() match {
          case None() =>
          case Some(_) =>
            api.put_pumpFailAck3()
            api.put_pumpControlFailAck3()
            isPumpControlBroken3 = true
            isPumpBroken3 = true
        }
      case Some(_) =>
        api.put_pumpFailAck3()
        api.put_pumpControlFailAck3()
        isPumpControlBroken3 = true
        isPumpBroken3 = true
    }

    api.get_levelFail() match {
      case None() =>
      case Some(_) =>
        api.put_levelFailAck()
        isLevelBroken = true
    }
    api.get_steamFail() match {
      case None() =>
      case Some(_) =>
        api.put_steamFailAck()
        isSteamBroken = true
    }
    //END OF FAIL CHECKING
  }


  def activate(api: OperatorDesk_i_Operational_Api): Unit = { }

  def deactivate(api: OperatorDesk_i_Operational_Api): Unit = { }

  def finalise(api: OperatorDesk_i_Operational_Api): Unit = { }

  def recover(api: OperatorDesk_i_Operational_Api): Unit = { }
}
