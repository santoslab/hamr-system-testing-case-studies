// #Sireum #Logika

package bc.BoilerControl

import org.sireum._
import bc._

// This file will not be overwritten so is safe to edit
object PumpControl_i_bcproc_pumpControl2 {

  // BEGIN STATE VARS
  var isPumpOpen: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPumpFlow: Base_Types.Boolean = Base_Types.Boolean_example()

  var pumpNumber: Base_Types.Integer = Base_Types.Integer_example()
  // END STATE VARS

  def initialise(api: PumpControl_i_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.pumpOpen.isEmpty,
        api.pumpFlow.isEmpty,
        api.ready.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Modifies(
        isPumpOpen,
        isPumpFlow,
        pumpNumber,
        api
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REQ_PUMP_INIT_1
        //   When the system Initializes, the Pump's local isPumpOpen value must be false.
        !isPumpOpen,
        // guarantee REQ_PUMP_INIT_2
        //   When the system Initializes, the Pump's local isPumpFlow value must be false.
        !isPumpFlow,
        // guarantee REQ_PUMP_INIT_3
        //   When the system Initializes, the Pump's local pumpNumber is set between 0 and 3.
        pumpNumber >= 0 &&
          pumpNumber <= 3,
        // guarantee REQ_PUMP_INIT_4
        //   When the system Initializes, the Pump's output port ready should not send a message.
        api.ready.isEmpty,
        // guarantee REQ_PUMP_INIT_5
        //   When the system Initializes, the Pump's output port pumpOpen should send a message containing false.
        api.pumpOpen.nonEmpty &&
          api.pumpOpen.get == F,
        // guarantee REQ_PUMP_INIT_6
        //   When the system Initializes, the Pump's output port pumpFlow should send a message containing false.
        api.pumpFlow.nonEmpty &&
          api.pumpFlow.get == F
        // END INITIALIZES ENSURES
      )
    )
    isPumpOpen = false
    isPumpFlow = false
    pumpNumber = 2
    api.put_pumpOpen(isPumpOpen)
    api.put_pumpFlow(isPumpFlow)
  }

  def timeTriggered(api: PumpControl_i_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.pumpOpen.isEmpty,
        api.pumpFlow.isEmpty,
        api.ready.isEmpty
        // END COMPUTE REQUIRES timeTriggered
      ),
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        isPumpOpen,
        isPumpFlow
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_PUMP_COMP_1
        //   If programReady has an event, then a ready event must be sent.
        (api.programReady.nonEmpty) -->: (api.ready.nonEmpty),
        // case REQ_PUMP_COMP_2
        //   If programReady does not have an event, then a ready event can not be sent.
        (!(api.programReady.nonEmpty)) -->: (api.ready.isEmpty),
        // case REQ_PUMP_COMP_3
        //   If openPump has an event, then the pump is opened or closed according to the event.
        (api.openPump.nonEmpty) -->: (isPumpOpen == api.openPump.get),
        // case REQ_PUMP_COMP_4
        //   If openPump does not have an event, then the pump remains in its previous state.
        (!(api.openPump.nonEmpty)) -->: (In(isPumpOpen) == isPumpOpen),
        // case REQ_PUMP_COMP_5
        //   Always send a pumpOpen event, it should contain whether or not the pump is open (isPumpOpen).
        (T) -->: (api.pumpOpen.nonEmpty &&
          api.pumpOpen.get == isPumpOpen),
        // case REQ_PUMP_COMP_6
        //   Always send a pumpFlow event, it should contain whether or not the pump has water flowing (isPumpFlow).
        (T) -->: (api.pumpFlow.nonEmpty &&
          api.pumpFlow.get == isPumpFlow)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // TODO: Argue for this method's correctness, specifically with the vars.
    api.get_programReady() match {
      case None() =>
      case Some(_) =>
        api.logInfo("Received PROGRAM_READY")
        api.put_ready()
        api.logInfo("Sent PHYSICAL_UNITS_READY")
    }

    api.get_openPump() match {
      case None() => // assume no change
      case Some(command) =>
        api.logInfo(s"Received ${if (command) "OPEN" else "CLOSE"}_PUMP($isPumpOpen)")
        // tell pump what to do
        isPumpOpen = command
        // assume pump did what it was supposed to do
        isPumpFlow = Base_Types.Boolean_example()
    }

    api.put_pumpOpen(isPumpOpen)
    api.logInfo(s"Sent PUMP_STATE($pumpNumber, ${if (isPumpOpen) "OPEN" else "CLOSED"})")
    api.put_pumpFlow(isPumpFlow)
    api.logInfo(s"Sent PUMP_CONTROL_STATE($pumpNumber, ${if (isPumpFlow) "" else "NO "}FLOW)")
  }

  def activate(api: PumpControl_i_Operational_Api): Unit = { }

  def deactivate(api: PumpControl_i_Operational_Api): Unit = { }

  def finalise(api: PumpControl_i_Operational_Api): Unit = { }

  def recover(api: PumpControl_i_Operational_Api): Unit = { }
}
