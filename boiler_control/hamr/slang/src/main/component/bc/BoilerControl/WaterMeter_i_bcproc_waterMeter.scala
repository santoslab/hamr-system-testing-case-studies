// #Sireum #Logika

package bc.BoilerControl

import org.sireum._
import bc._

// This file will not be overwritten so is safe to edit
object WaterMeter_i_bcproc_waterMeter {

  // BEGIN STATE VARS
  var volume: Base_Types.Float_32 = Base_Types.Float_32_example()
  // END STATE VARS

  def initialise(api: WaterMeter_i_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.level.isEmpty,
        api.ready.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Modifies(
        api
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REQ_WATER_INIT_1
        //   level message is sent with volume as its value.
        api.level.nonEmpty &&
          api.level.get == volume,
        // guarantee REQ_WATER_INIT_2
        //   ready message is not sent during initialization.
        api.ready.isEmpty
        // END INITIALIZES ENSURES
      )
    )
    // example api usage
    api.put_level(volume)
  }

  def timeTriggered(api: WaterMeter_i_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.level.isEmpty,
        api.ready.isEmpty
        // END COMPUTE REQUIRES timeTriggered
      ),
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        volume
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_WATER_COMP_1
        //   If programReady has an event, then a ready event must be sent if the component is ready.
        (api.programReady.nonEmpty) -->: (api.ready.nonEmpty),
        // case REQ_WATER_COMP_2
        //   If programReady does not have an event, then a ready event can not be sent.
        (!(api.programReady.nonEmpty)) -->: (api.ready.isEmpty),
        // case REQ_WATER_COMP_3
        //   Each computational cycle, the Water Level Reader will send the water level equal to its volume variable reading.
        (T) -->: (api.level.nonEmpty &&
          api.level.get == volume)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_programReady() match {
      case None() =>
      //TODO LOG HERE
      case Some(_) =>
        api.put_ready()
    }
    api.put_level(volume)
  }

  def activate(api: WaterMeter_i_Operational_Api): Unit = { }

  def deactivate(api: WaterMeter_i_Operational_Api): Unit = { }

  def finalise(api: WaterMeter_i_Operational_Api): Unit = { }

  def recover(api: WaterMeter_i_Operational_Api): Unit = { }
}
