// #Sireum #Logika

package bc.BoilerControl

import org.sireum._
import bc._

// This file will not be overwritten so is safe to edit
object Boiler_i_bcproc_boiler {

  // BEGIN STATE VARS
  var Mode: BoilerControl.OpMode.Type = BoilerControl.OpMode.byOrdinal(0).get

  var ValveOpen: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: Boiler_i_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.waiting.isEmpty,
        api.ready.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Modifies(
        api,
        Mode,
        ValveOpen
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REQ_BOILER_INIT_1
        //   When the system Initializes, the Boiler must send a Waiting event.
        api.waiting.nonEmpty,
        // guarantee REQ_BOILER_INIT_2
        //   When the system Initializes, the Boiler's state variable, Mode, must be Init.
        Mode == BoilerControl.OpMode.Init,
        // guarantee REQ_BOILER_INIT_3
        //   When the system Initializes, the valve should not be open.
        !ValveOpen,
        // guarantee REQ_BOILER_INIT_4
        //   When the system Initializes, the Boiler must not send a Ready event.
        api.ready.isEmpty
        // END INITIALIZES ENSURES
      )
    )
    api.logInfo("Boiler: Initialize Method Running.")
    api.put_waiting()
    api.logInfo("MESSAGE SENT (Boiler): Waiting")
    Mode = OpMode.Init
    ValveOpen = false
  }

  def timeTriggered(api: Boiler_i_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.waiting.isEmpty,
        api.ready.isEmpty
        // END COMPUTE REQUIRES timeTriggered
      ),
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        Mode,
        ValveOpen
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_BOILER_COMP_1
        //   If OpMode is Init and Valve has an event, then Open the Valve (OpenValve == True)
        ((api.opMode.nonEmpty &&
            api.opMode.get == BoilerControl.OpMode.Init ||
            In(Mode) == BoilerControl.OpMode.Init &&
              !(api.opMode.nonEmpty)) &&
           api.valve.nonEmpty) -->: (ValveOpen),
        // case REQ_BOILER_COMP_2
        //   If OpMode is Init and has received the ProgramReady event, then Boiler should send the Ready message.
        ((api.opMode.nonEmpty &&
            api.opMode.get == BoilerControl.OpMode.Init ||
            In(Mode) == BoilerControl.OpMode.Init &&
              !(api.opMode.nonEmpty)) &&
           api.programReady.nonEmpty) -->: (api.ready.nonEmpty),
        // case REQ_BOILER_COMP_3
        //   If OpMode is not Init or Boiler has not received the Valve event, then the Valve remains unchanged.
        (!((api.opMode.nonEmpty &&
            api.opMode.get == BoilerControl.OpMode.Init ||
            In(Mode) == BoilerControl.OpMode.Init &&
              !(api.opMode.nonEmpty)) &&
            api.valve.nonEmpty)) -->: (In(ValveOpen) == ValveOpen),
        // case REQ_BOILER_COMP_4
        //   If OpMode is not Init or Boiler has not received the ProgramReady event, then Boiler will not send the Ready message.
        (!((api.opMode.nonEmpty &&
            api.opMode.get == BoilerControl.OpMode.Init ||
            In(Mode) == BoilerControl.OpMode.Init &&
              !(api.opMode.nonEmpty)) &&
            api.programReady.nonEmpty)) -->: (api.ready.isEmpty),
        // case REQ_BOILER_COMP_5
        //   The Waiting message must never be sent (This is because it is sent when the component is initialized, and only once, so it should not be done here).
        (T) -->: (api.waiting.isEmpty)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.logInfo("Boiler: Compute Method Running.")
    api.get_opMode() match {
      case None() =>
        api.logError("Boiler: No new OpMode received.")
      case Some(m) =>
        api.logInfo(s"Boiler: Received OpMode Message = ($m).")
        Mode = m
    }
    Mode match {
      case OpMode.Init =>
        api.get_valve() match {
          case None() =>
          case Some(_) =>
            api.logInfo("Boiler: Received Valve Message (While in Init, other modes not noted).")
            ValveOpen = true
            api.logInfo("Boiler: Opened valve (ValveOpen = true).")
        }

        api.get_programReady() match {
          case None() =>
          case Some(_) =>
            api.logInfo("Boiler: Received ProgramReady Message (While in Init, other modes not noted).")
            api.put_ready()
            api.logInfo("MESSAGE SENT (Boiler): Ready")
        }
      case _ => // nothing to do in any other mode
    }
  }

  def activate(api: Boiler_i_Operational_Api): Unit = { }

  def deactivate(api: Boiler_i_Operational_Api): Unit = { }

  def finalise(api: Boiler_i_Operational_Api): Unit = { }

  def recover(api: Boiler_i_Operational_Api): Unit = { }
}
