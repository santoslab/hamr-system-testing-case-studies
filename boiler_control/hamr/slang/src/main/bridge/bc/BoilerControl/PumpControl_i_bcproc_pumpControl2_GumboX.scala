// #Sireum

package bc.BoilerControl

import org.sireum._
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
object PumpControl_i_bcproc_pumpControl2_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_PUMP_INIT_1
    *   When the system Initializes, the Pump's local isPumpOpen value must be false.
    * @param isPumpOpen post-state state variable
    */
  @strictpure def initialize_REQ_PUMP_INIT_1 (
      isPumpOpen: Base_Types.Boolean): B =
    !isPumpOpen

  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_PUMP_INIT_2
    *   When the system Initializes, the Pump's local isPumpFlow value must be false.
    * @param isPumpFlow post-state state variable
    */
  @strictpure def initialize_REQ_PUMP_INIT_2 (
      isPumpFlow: Base_Types.Boolean): B =
    !isPumpFlow

  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_PUMP_INIT_3
    *   When the system Initializes, the Pump's local pumpNumber is set between 0 and 3.
    * @param pumpNumber post-state state variable
    */
  @strictpure def initialize_REQ_PUMP_INIT_3 (
      pumpNumber: Base_Types.Integer): B =
    pumpNumber >= 0 &&
      pumpNumber <= 3

  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_PUMP_INIT_4
    *   When the system Initializes, the Pump's output port ready should not send a message.
    * @param api_ready outgoing event port
    */
  @strictpure def initialize_REQ_PUMP_INIT_4 (
      api_ready: Option[art.Empty]): B =
    api_ready.isEmpty

  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_PUMP_INIT_5
    *   When the system Initializes, the Pump's output port pumpOpen should send a message containing false.
    * @param api_pumpOpen outgoing event data port
    */
  @strictpure def initialize_REQ_PUMP_INIT_5 (
      api_pumpOpen: Option[Base_Types.Boolean]): B =
    api_pumpOpen.nonEmpty &&
      api_pumpOpen.get == F

  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_PUMP_INIT_6
    *   When the system Initializes, the Pump's output port pumpFlow should send a message containing false.
    * @param api_pumpFlow outgoing event data port
    */
  @strictpure def initialize_REQ_PUMP_INIT_6 (
      api_pumpFlow: Option[Base_Types.Boolean]): B =
    api_pumpFlow.nonEmpty &&
      api_pumpFlow.get == F

  /** IEP-Guar: Initialize Entrypoint Contracts for pumpControl2
    *
    * @param isPumpFlow post-state state variable
    * @param isPumpOpen post-state state variable
    * @param pumpNumber post-state state variable
    * @param api_ready outgoing event port
    * @param api_pumpFlow outgoing event data port
    * @param api_pumpOpen outgoing event data port
    */
  @strictpure def initialize_IEP_Guar (
      isPumpFlow: Base_Types.Boolean,
      isPumpOpen: Base_Types.Boolean,
      pumpNumber: Base_Types.Integer,
      api_ready: Option[art.Empty],
      api_pumpFlow: Option[Base_Types.Boolean],
      api_pumpOpen: Option[Base_Types.Boolean]): B =
    initialize_REQ_PUMP_INIT_1(isPumpOpen) &
    initialize_REQ_PUMP_INIT_2(isPumpFlow) &
    initialize_REQ_PUMP_INIT_3(pumpNumber) &
    initialize_REQ_PUMP_INIT_4(api_ready) &
    initialize_REQ_PUMP_INIT_5(api_pumpOpen) &
    initialize_REQ_PUMP_INIT_6(api_pumpFlow)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param isPumpFlow post-state state variable
    * @param isPumpOpen post-state state variable
    * @param pumpNumber post-state state variable
    * @param api_ready outgoing event port
    * @param api_pumpFlow outgoing event data port
    * @param api_pumpOpen outgoing event data port
    */
  @strictpure def inititialize_IEP_Post (
      isPumpFlow: Base_Types.Boolean,
      isPumpOpen: Base_Types.Boolean,
      pumpNumber: Base_Types.Integer,
      api_ready: Option[art.Empty],
      api_pumpFlow: Option[Base_Types.Boolean],
      api_pumpOpen: Option[Base_Types.Boolean]): B =
    (// IEP-Guar: Initialize Entrypoint contract for pumpControl2
     initialize_IEP_Guar(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen))

  /** IEP-Post: Initialize Entrypoint Post-Condition via container
    *
    * @param post Container holding the value of incoming ports and the pre-state values of state variables
    */
  @strictpure def inititialize_IEP_Post_Container (post: PumpControl_i_bcproc_pumpControl2_PostState_Container_PS): B =
    inititialize_IEP_Post (
      isPumpFlow = post.isPumpFlow,
      isPumpOpen = post.isPumpOpen,
      pumpNumber = post.pumpNumber,
      api_ready = post.api_ready,
      api_pumpFlow = post.api_pumpFlow,
      api_pumpOpen = post.api_pumpOpen)

  /** guarantee REQ_PUMP_COMP_1
    *   If programReady has an event, then a ready event must be sent.
    * @param api_programReady incoming event port
    * @param api_ready outgoing event port
    */
  @strictpure def compute_case_REQ_PUMP_COMP_1(
      api_programReady: Option[art.Empty],
      api_ready: Option[art.Empty]): B =
    (api_programReady.nonEmpty) -->:
      (api_ready.nonEmpty)

  /** guarantee REQ_PUMP_COMP_2
    *   If programReady does not have an event, then a ready event can not be sent.
    * @param api_programReady incoming event port
    * @param api_ready outgoing event port
    */
  @strictpure def compute_case_REQ_PUMP_COMP_2(
      api_programReady: Option[art.Empty],
      api_ready: Option[art.Empty]): B =
    (!(api_programReady.nonEmpty)) -->:
      (api_ready.isEmpty)

  /** guarantee REQ_PUMP_COMP_3
    *   If openPump has an event, then the pump is opened or closed according to the event.
    * @param isPumpOpen post-state state variable
    * @param api_openPump incoming event data port
    */
  @strictpure def compute_case_REQ_PUMP_COMP_3(
      isPumpOpen: Base_Types.Boolean,
      api_openPump: Option[Base_Types.Boolean]): B =
    (api_openPump.nonEmpty) -->:
      (isPumpOpen == api_openPump.get)

  /** guarantee REQ_PUMP_COMP_4
    *   If openPump does not have an event, then the pump remains in its previous state.
    * @param In_isPumpOpen pre-state state variable
    * @param isPumpOpen post-state state variable
    * @param api_openPump incoming event data port
    */
  @strictpure def compute_case_REQ_PUMP_COMP_4(
      In_isPumpOpen: Base_Types.Boolean,
      isPumpOpen: Base_Types.Boolean,
      api_openPump: Option[Base_Types.Boolean]): B =
    (!(api_openPump.nonEmpty)) -->:
      (In_isPumpOpen == isPumpOpen)

  /** guarantee REQ_PUMP_COMP_5
    *   Always send a pumpOpen event, it should contain whether or not the pump is open (isPumpOpen).
    * @param isPumpOpen post-state state variable
    * @param api_pumpOpen outgoing event data port
    */
  @strictpure def compute_case_REQ_PUMP_COMP_5(
      isPumpOpen: Base_Types.Boolean,
      api_pumpOpen: Option[Base_Types.Boolean]): B =
    (T) -->:
      (api_pumpOpen.nonEmpty &&
         api_pumpOpen.get == isPumpOpen)

  /** guarantee REQ_PUMP_COMP_6
    *   Always send a pumpFlow event, it should contain whether or not the pump has water flowing (isPumpFlow).
    * @param isPumpFlow post-state state variable
    * @param api_pumpFlow outgoing event data port
    */
  @strictpure def compute_case_REQ_PUMP_COMP_6(
      isPumpFlow: Base_Types.Boolean,
      api_pumpFlow: Option[Base_Types.Boolean]): B =
    (T) -->:
      (api_pumpFlow.nonEmpty &&
         api_pumpFlow.get == isPumpFlow)

  /** CEP-T-Case: Top-Level case contracts for pumpControl2's compute entrypoint
    *
    * @param In_isPumpOpen pre-state state variable
    * @param isPumpFlow post-state state variable
    * @param isPumpOpen post-state state variable
    * @param api_programReady incoming event port
    * @param api_openPump incoming event data port
    * @param api_ready outgoing event port
    * @param api_pumpFlow outgoing event data port
    * @param api_pumpOpen outgoing event data port
    */
  @strictpure def compute_CEP_T_Case (
      In_isPumpOpen: Base_Types.Boolean,
      isPumpFlow: Base_Types.Boolean,
      isPumpOpen: Base_Types.Boolean,
      api_programReady: Option[art.Empty],
      api_openPump: Option[Base_Types.Boolean],
      api_ready: Option[art.Empty],
      api_pumpFlow: Option[Base_Types.Boolean],
      api_pumpOpen: Option[Base_Types.Boolean]): B =
    compute_case_REQ_PUMP_COMP_1(api_programReady, api_ready) &
    compute_case_REQ_PUMP_COMP_2(api_programReady, api_ready) &
    compute_case_REQ_PUMP_COMP_3(isPumpOpen, api_openPump) &
    compute_case_REQ_PUMP_COMP_4(In_isPumpOpen, isPumpOpen, api_openPump) &
    compute_case_REQ_PUMP_COMP_5(isPumpOpen, api_pumpOpen) &
    compute_case_REQ_PUMP_COMP_6(isPumpFlow, api_pumpFlow)

  /** CEP-Post: Compute Entrypoint Post-Condition for pumpControl2
    *
    * @param In_isPumpFlow pre-state state variable
    * @param In_isPumpOpen pre-state state variable
    * @param In_pumpNumber pre-state state variable
    * @param isPumpFlow post-state state variable
    * @param isPumpOpen post-state state variable
    * @param pumpNumber post-state state variable
    * @param api_programReady incoming event port
    * @param api_openPump incoming event data port
    * @param api_ready outgoing event port
    * @param api_pumpFlow outgoing event data port
    * @param api_pumpOpen outgoing event data port
    */
  @strictpure def compute_CEP_Post (
      In_isPumpFlow: Base_Types.Boolean,
      In_isPumpOpen: Base_Types.Boolean,
      In_pumpNumber: Base_Types.Integer,
      isPumpFlow: Base_Types.Boolean,
      isPumpOpen: Base_Types.Boolean,
      pumpNumber: Base_Types.Integer,
      api_programReady: Option[art.Empty],
      api_openPump: Option[Base_Types.Boolean],
      api_ready: Option[art.Empty],
      api_pumpFlow: Option[Base_Types.Boolean],
      api_pumpOpen: Option[Base_Types.Boolean]): B =
    (// CEP-T-Case: case clauses of pumpControl2's compute entrypoint
     compute_CEP_T_Case (In_isPumpOpen, isPumpFlow, isPumpOpen, api_programReady, api_openPump, api_ready, api_pumpFlow, api_pumpOpen))

  /** CEP-Post: Compute Entrypoint Post-Condition for pumpControl2 via containers
    *
    * @param pre Container holding the values of incoming ports and the pre-state values of state variables
    * @param post Container holding the values of outgoing ports and the post-state values of state variables
    */
  @strictpure def compute_CEP_Post_Container(
      pre: PumpControl_i_bcproc_pumpControl2_PreState_Container_PS,
      post: PumpControl_i_bcproc_pumpControl2_PostState_Container_PS): B =
    compute_CEP_Post(
      In_isPumpFlow = pre.In_isPumpFlow,
      In_isPumpOpen = pre.In_isPumpOpen,
      In_pumpNumber = pre.In_pumpNumber,
      isPumpFlow = post.isPumpFlow,
      isPumpOpen = post.isPumpOpen,
      pumpNumber = post.pumpNumber,
      api_programReady = pre.api_programReady,
      api_openPump = pre.api_openPump,
      api_ready = post.api_ready,
      api_pumpFlow = post.api_pumpFlow,
      api_pumpOpen = post.api_pumpOpen)
}
