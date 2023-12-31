// #Sireum

package bc.BoilerControl

import org.sireum._
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
object WaterMeter_i_bcproc_waterMeter_GumboX {
  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_WATER_INIT_1
    *   level message is sent with volume as its value.
    * @param volume post-state state variable
    * @param api_level outgoing event data port
    */
  @strictpure def initialize_REQ_WATER_INIT_1 (
      volume: Base_Types.Float_32,
      api_level: Option[Base_Types.Float_32]): B =
    api_level.nonEmpty &&
      api_level.get == volume

  /** Initialize Entrypoint Contract
    *
    * guarantee REQ_WATER_INIT_2
    *   ready message is not sent during initialization.
    * @param api_ready outgoing event port
    */
  @strictpure def initialize_REQ_WATER_INIT_2 (
      api_ready: Option[art.Empty]): B =
    api_ready.isEmpty

  /** IEP-Guar: Initialize Entrypoint Contracts for waterMeter
    *
    * @param volume post-state state variable
    * @param api_ready outgoing event port
    * @param api_level outgoing event data port
    */
  @strictpure def initialize_IEP_Guar (
      volume: Base_Types.Float_32,
      api_ready: Option[art.Empty],
      api_level: Option[Base_Types.Float_32]): B =
    initialize_REQ_WATER_INIT_1(volume, api_level) &
    initialize_REQ_WATER_INIT_2(api_ready)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param volume post-state state variable
    * @param api_ready outgoing event port
    * @param api_level outgoing event data port
    */
  @strictpure def inititialize_IEP_Post (
      volume: Base_Types.Float_32,
      api_ready: Option[art.Empty],
      api_level: Option[Base_Types.Float_32]): B =
    (// IEP-Guar: Initialize Entrypoint contract for waterMeter
     initialize_IEP_Guar(volume, api_ready, api_level))

  /** IEP-Post: Initialize Entrypoint Post-Condition via container
    *
    * @param post Container holding the value of incoming ports and the pre-state values of state variables
    */
  @strictpure def inititialize_IEP_Post_Container (post: WaterMeter_i_bcproc_waterMeter_PostState_Container_PS): B =
    inititialize_IEP_Post (
      volume = post.volume,
      api_ready = post.api_ready,
      api_level = post.api_level)

  /** guarantee REQ_WATER_COMP_1
    *   If programReady has an event, then a ready event must be sent if the component is ready.
    * @param api_programReady incoming event port
    * @param api_ready outgoing event port
    */
  @strictpure def compute_case_REQ_WATER_COMP_1(
      api_programReady: Option[art.Empty],
      api_ready: Option[art.Empty]): B =
    (api_programReady.nonEmpty) -->:
      (api_ready.nonEmpty)

  /** guarantee REQ_WATER_COMP_2
    *   If programReady does not have an event, then a ready event can not be sent.
    * @param api_programReady incoming event port
    * @param api_ready outgoing event port
    */
  @strictpure def compute_case_REQ_WATER_COMP_2(
      api_programReady: Option[art.Empty],
      api_ready: Option[art.Empty]): B =
    (!(api_programReady.nonEmpty)) -->:
      (api_ready.isEmpty)

  /** guarantee REQ_WATER_COMP_3
    *   Each computational cycle, the Water Level Reader will send the water level equal to its volume variable reading.
    * @param volume post-state state variable
    * @param api_level outgoing event data port
    */
  @strictpure def compute_case_REQ_WATER_COMP_3(
      volume: Base_Types.Float_32,
      api_level: Option[Base_Types.Float_32]): B =
    (T) -->:
      (api_level.nonEmpty &&
         api_level.get == volume)

  /** CEP-T-Case: Top-Level case contracts for waterMeter's compute entrypoint
    *
    * @param volume post-state state variable
    * @param api_programReady incoming event port
    * @param api_ready outgoing event port
    * @param api_level outgoing event data port
    */
  @strictpure def compute_CEP_T_Case (
      volume: Base_Types.Float_32,
      api_programReady: Option[art.Empty],
      api_ready: Option[art.Empty],
      api_level: Option[Base_Types.Float_32]): B =
    compute_case_REQ_WATER_COMP_1(api_programReady, api_ready) &
    compute_case_REQ_WATER_COMP_2(api_programReady, api_ready) &
    compute_case_REQ_WATER_COMP_3(volume, api_level)

  /** CEP-Post: Compute Entrypoint Post-Condition for waterMeter
    *
    * @param In_volume pre-state state variable
    * @param volume post-state state variable
    * @param api_programReady incoming event port
    * @param api_ready outgoing event port
    * @param api_level outgoing event data port
    */
  @strictpure def compute_CEP_Post (
      In_volume: Base_Types.Float_32,
      volume: Base_Types.Float_32,
      api_programReady: Option[art.Empty],
      api_ready: Option[art.Empty],
      api_level: Option[Base_Types.Float_32]): B =
    (// CEP-T-Case: case clauses of waterMeter's compute entrypoint
     compute_CEP_T_Case (volume, api_programReady, api_ready, api_level))

  /** CEP-Post: Compute Entrypoint Post-Condition for waterMeter via containers
    *
    * @param pre Container holding the values of incoming ports and the pre-state values of state variables
    * @param post Container holding the values of outgoing ports and the post-state values of state variables
    */
  @strictpure def compute_CEP_Post_Container(
      pre: WaterMeter_i_bcproc_waterMeter_PreState_Container_PS,
      post: WaterMeter_i_bcproc_waterMeter_PostState_Container_PS): B =
    compute_CEP_Post(
      In_volume = pre.In_volume,
      volume = post.volume,
      api_programReady = pre.api_programReady,
      api_ready = post.api_ready,
      api_level = post.api_level)
}
