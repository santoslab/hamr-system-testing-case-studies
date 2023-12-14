// #Sireum #Logika

package bc.BoilerControl

import org.sireum._
import bc._

// This file will not be overwritten so is safe to edit
object SteamMeter_i_bcproc_steamMeter {

  // BEGIN STATE VARS
  var computedRate: Base_Types.Float_32 = Base_Types.Float_32_example()

  var volume: Base_Types.Float_32 = Base_Types.Float_32_example()
  // END STATE VARS

  def initialise(api: SteamMeter_i_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.rate.isEmpty,
        api.ready.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Modifies(
        volume,
        computedRate,
        api
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee REQ_STEAM_INIT_1
        //   level message is sent with volume as its value.
        api.rate.nonEmpty &&
          api.rate.get == computedRate,
        // guarantee REQ_STEAM_INIT_2
        //   ready message is not sent during initialization.
        api.ready.isEmpty,
        // guarantee REQ_STEAM_INIT_3
        //   computedRate, the local variable for the Steam Meter is the volume of steam recorded from the reader divided by 5 (each compute cycle in the system is 5 seconds apart). Note, the amount of steam recorded from a lower level hardware is presumed in this system implementation to provide the volume read between each of its cycles. This was also done so that way there is a computational element to the reading for logika and other testers to have to deal with division. It is likely in other implementations that it would be returning the rate, and thus, the rate would be supplied to the port directly.
        computedRate == volume / 5.0f
        // END INITIALIZES ENSURES
      )
    )
      volume = Base_Types.Float_32_example()
      computedRate = volume / 5.0f
      api.put_rate(computedRate)
  }

  def timeTriggered(api: SteamMeter_i_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.rate.isEmpty,
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
        // case REQ_STEAM_COMP_1
        //   If programReady has an event, then a ready event must be sent if the component is ready.
        (api.programReady.nonEmpty) -->: (api.ready.nonEmpty),
        // case REQ_STEAM_COMP_2
        //   If programReady does not have an event, then a ready event can not be sent.
        (!(api.programReady.nonEmpty)) -->: (api.ready.isEmpty),
        // case REQ_STEAM_COMP_3
        //   Each computational cycle, the Steam Meter will send the computedRate through a rate message.
        (T) -->: (api.rate.nonEmpty &&
          api.rate.get == computedRate),
        // case REQ_STEAM_COMP_4
        //   computedRate, the local variable for the Steam Meter is the volume of steam recorded from the reader divided by 5 (each compute cycle in the system is 5 seconds apart). Note, the amount of steam recorded from a lower level hardware is presumed in this system implementation to provide the volume read between each of its cycles. This was also done so that way there is a computational element to the reading for logika and other testers to have to deal with division. It is likely in other implementations that it would be returning the rate, and thus, the rate would be supplied to the port directly.
        (T) -->: (computedRate == volume / 5.0f)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    //If the Program is asking if we are ready, tell them we are.
    api.get_programReady() match {
      case None() =>
        //TODO LOG HERE
      case Some(_) =>
        api.put_ready()
    }
    computedRate = volume / 5.0f
    api.put_rate(computedRate)

  }

  def activate(api: SteamMeter_i_Operational_Api): Unit = { }

  def deactivate(api: SteamMeter_i_Operational_Api): Unit = { }

  def finalise(api: SteamMeter_i_Operational_Api): Unit = { }

  def recover(api: SteamMeter_i_Operational_Api): Unit = { }
}
