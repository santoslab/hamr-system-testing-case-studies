// #Sireum #Logika

package bc.BoilerControl

import org.sireum._
import bc._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

// This file will not be overwritten so is safe to edit
object BoilerControl_i_bcproc_control {

  // BEGIN STATE VARS
  var mode: BoilerControl.OpMode.Type = BoilerControl.OpMode.byOrdinal(0).get

  var C: Base_Types.Float_32 = Base_Types.Float_32_example()

  var M1: Base_Types.Float_32 = Base_Types.Float_32_example()

  var M2: Base_Types.Float_32 = Base_Types.Float_32_example()

  var N1: Base_Types.Float_32 = Base_Types.Float_32_example()

  var N2: Base_Types.Float_32 = Base_Types.Float_32_example()

  var W: Base_Types.Float_32 = Base_Types.Float_32_example()

  var U1: Base_Types.Float_32 = Base_Types.Float_32_example()

  var U2: Base_Types.Float_32 = Base_Types.Float_32_example()

  var q: Base_Types.Float_32 = Base_Types.Float_32_example()

  var P: Base_Types.Float_32 = Base_Types.Float_32_example()

  var v_steamRate: Base_Types.Float_32 = Base_Types.Float_32_example()

  var hasBoilerSentWaiting: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPump0Failing: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPump1Failing: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPump2Failing: Base_Types.Boolean = Base_Types.Boolean_example()

  var isPump3Failing: Base_Types.Boolean = Base_Types.Boolean_example()

  var isWaterMeterFailing: Base_Types.Boolean = Base_Types.Boolean_example()

  var isSteamMeterFailing: Base_Types.Boolean = Base_Types.Boolean_example()

  var p0: Base_Types.Float_32 = Base_Types.Float_32_example()

  var p1: Base_Types.Float_32 = Base_Types.Float_32_example()

  var p2: Base_Types.Float_32 = Base_Types.Float_32_example()

  var p3: Base_Types.Float_32 = Base_Types.Float_32_example()

  var qc1: Base_Types.Float_32 = Base_Types.Float_32_example()

  var qc2: Base_Types.Float_32 = Base_Types.Float_32_example()

  var qa1: Base_Types.Float_32 = Base_Types.Float_32_example()

  var qa2: Base_Types.Float_32 = Base_Types.Float_32_example()

  var shouldUpdatePumps: Base_Types.Boolean = Base_Types.Boolean_example()

  var transmissionFailure: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: BoilerControl_i_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.opMode.isEmpty,
        api.openPump0.isEmpty,
        api.openPump1.isEmpty,
        api.openPump2.isEmpty,
        api.openPump3.isEmpty,
        api.ready.isEmpty,
        api.valve.isEmpty,
        api.pumpFail0.isEmpty,
        api.pumpFail1.isEmpty,
        api.pumpFail2.isEmpty,
        api.pumpFail3.isEmpty,
        api.pumpControlFail0.isEmpty,
        api.pumpControlFail1.isEmpty,
        api.pumpControlFail2.isEmpty,
        api.pumpControlFail3.isEmpty,
        api.levelFail.isEmpty,
        api.steamFail.isEmpty,
        api.pumpRepairAck0.isEmpty,
        api.pumpRepairAck1.isEmpty,
        api.pumpRepairAck2.isEmpty,
        api.pumpRepairAck3.isEmpty,
        api.pumpControlRepairAck0.isEmpty,
        api.pumpControlRepairAck1.isEmpty,
        api.pumpControlRepairAck2.isEmpty,
        api.pumpControlRepairAck3.isEmpty,
        api.levelRepairAck.isEmpty,
        api.steamRepairAck.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Modifies(
        api
      ),
      Ensures(
          // BEGIN INITIALIZES ENSURES
        // guarantee REQ_BCON_INIT_1
        //   OpMode should be sent initially, it should contain an init payload. mode should be init.
        api.opMode.nonEmpty &&
          mode == BoilerControl.OpMode.Init,
        // guarantee REQ_BCON_INIT_2
        //   Other than OpMode, no other out port should be sent.
        api.openPump0.isEmpty && api.openPump1.isEmpty &&
          api.openPump2.isEmpty &&
          api.openPump3.isEmpty &&
          api.ready.isEmpty &&
          api.valve.isEmpty &&
          api.pumpFail0.isEmpty &&
          api.pumpFail1.isEmpty &&
          api.pumpFail2.isEmpty &&
          api.pumpFail3.isEmpty &&
          api.pumpControlFail0.isEmpty &&
          api.pumpControlFail1.isEmpty &&
          api.pumpControlFail2.isEmpty &&
          api.pumpControlFail3.isEmpty &&
          api.levelFail.isEmpty &&
          api.steamFail.isEmpty &&
          api.pumpRepairAck0.isEmpty &&
          api.pumpRepairAck1.isEmpty &&
          api.pumpRepairAck2.isEmpty &&
          api.pumpRepairAck3.isEmpty &&
          api.pumpControlRepairAck0.isEmpty &&
          api.pumpControlRepairAck1.isEmpty &&
          api.pumpControlRepairAck2.isEmpty &&
          api.pumpControlRepairAck3.isEmpty &&
          api.levelRepairAck.isEmpty &&
          api.steamRepairAck.isEmpty
          // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_opMode(OpMode.Init)
  }

  def timeTriggered(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES timeTriggered
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.opMode.isEmpty,
        api.openPump0.isEmpty,
        api.openPump1.isEmpty,
        api.openPump2.isEmpty,
        api.openPump3.isEmpty,
        api.ready.isEmpty,
        api.valve.isEmpty,
        api.pumpFail0.isEmpty,
        api.pumpFail1.isEmpty,
        api.pumpFail2.isEmpty,
        api.pumpFail3.isEmpty,
        api.pumpControlFail0.isEmpty,
        api.pumpControlFail1.isEmpty,
        api.pumpControlFail2.isEmpty,
        api.pumpControlFail3.isEmpty,
        api.levelFail.isEmpty,
        api.steamFail.isEmpty,
        api.pumpRepairAck0.isEmpty,
        api.pumpRepairAck1.isEmpty,
        api.pumpRepairAck2.isEmpty,
        api.pumpRepairAck3.isEmpty,
        api.pumpControlRepairAck0.isEmpty,
        api.pumpControlRepairAck1.isEmpty,
        api.pumpControlRepairAck2.isEmpty,
        api.pumpControlRepairAck3.isEmpty,
        api.levelRepairAck.isEmpty,
        api.steamRepairAck.isEmpty
        // END COMPUTE REQUIRES timeTriggered
      ),
      Modifies(
        api,
        mode,
        transmissionFailure,
        isSteamMeterFailing,
        isWaterMeterFailing,
        isPump0Failing,
        isPump1Failing
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQ_BCON_COMP_1
        //   If the stop event is recieved, mode is stop.
        (api.stop.nonEmpty) -->: (mode == BoilerControl.OpMode.Stop),
        // case REQ_BCON_COMP_2
        //   If the stop event is not recieved and if mode was not stop before, then any part that is failing will send the correct fail event.
        (!(api.stop.nonEmpty) &&
           In(mode) != BoilerControl.OpMode.Stop) -->: (isWaterMeterFailing ->: api.levelFail.nonEmpty &
          isSteamMeterFailing ->: api.steamFail.nonEmpty &
          isPump0Failing ->: api.pumpFail0.nonEmpty &
          isPump1Failing ->: api.pumpFail1.nonEmpty &
          isPump2Failing ->: api.pumpFail2.nonEmpty &
          isPump3Failing ->: api.pumpFail3.nonEmpty),
        // case REQ_BCON_COMP_3
        //   If the stop event is not recieved and if mode was not stop before, then P is equal to the sum of p0, p1, p2, and p3.
        (!(api.stop.nonEmpty) &&
           In(mode) != BoilerControl.OpMode.Stop) -->: (P == p0 + p1 + p2 + p3),
        // case REQ_BCON_COMP_4
        //   If the stop event is not recieved and if mode was not stop before, then qc1 and qc2 follow the formula on [508].
        (!(api.stop.nonEmpty) &&
           In(mode) != BoilerControl.OpMode.Stop) -->: (qc1 == q - 5.0f * v_steamRate - 12.5f * U1 + P &
          qc2 == q - 5.0f * v_steamRate + 12.5f * U1 + P),
        // case REQ_BCON_COMP_5
        //   If the stop event is not recieved and if mode was not stop before, and Water Meter is failing, then qa1 == qc1 and qa2 == qc2 [508]
        (!(api.stop.nonEmpty) &&
           In(mode) != BoilerControl.OpMode.Stop) -->: (isWaterMeterFailing ->: (qa1 == qc1 &
           qa2 == qc2)),
        // case REQ_BCON_COMP_6
        //   If the stop event is not recieved and if mode was not stop before, and Water Meter is not failing, then qa1 == q and qa2 == q [508]
        (!(api.stop.nonEmpty) &&
           In(mode) != BoilerControl.OpMode.Stop) -->: (!isWaterMeterFailing ->: (qa1 == q &
           qa2 == q)),
        // case REQ_BCON_COMP_7
        //   Always, an OpMode event should be sent with the current value of mode.
        (T) -->: (api.opMode.nonEmpty &
          api.opMode.get == mode),
        // case REQ_BCON_COMP_8
        //   If in mode is Stop. Then no ports other than OpMode should be populated.
        (In(mode) == BoilerControl.OpMode.Stop) -->: (api.opMode.nonEmpty & api.openPump0.isEmpty &
          api.openPump1.isEmpty &
          api.openPump2.isEmpty &
          api.openPump3.isEmpty &
          api.ready.isEmpty &
          api.valve.isEmpty &
          api.pumpFail0.isEmpty &
          api.pumpFail1.isEmpty &
          api.pumpFail2.isEmpty &
          api.pumpFail3.isEmpty &
          api.pumpControlFail0.isEmpty &
          api.pumpControlFail1.isEmpty &
          api.pumpControlFail2.isEmpty &
          api.pumpControlFail3.isEmpty &
          api.levelFail.isEmpty &
          api.steamFail.isEmpty &
          api.pumpRepairAck0.isEmpty &
          api.pumpRepairAck1.isEmpty &
          api.pumpRepairAck2.isEmpty &
          api.pumpRepairAck3.isEmpty &
          api.levelRepairAck.isEmpty &
          api.steamRepairAck.isEmpty),
        // case REQ_BCON_COMP_9
        //   Always send an OpMode
        (T) -->: (api.opMode.nonEmpty),
        // case REQ_BCON_COMP_CHECK_1
        //   Water Meter Failure (No Repair): If the Water Meter was broken, and the repair message has not been sent. The Water Meter remains broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           In(isWaterMeterFailing) &
           !(api.levelRepair.nonEmpty)) -->: (isWaterMeterFailing & api.levelRepairAck.isEmpty),
        // case REQ_BCON_COMP_CHECK_2
        //   Water Meter Failure (No Level): If the Water Meter provides no level event, The Water Meter is Broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           !(api.waterLevel.nonEmpty)) -->: (isWaterMeterFailing & transmissionFailure &
          api.levelRepairAck.isEmpty),
        // case REQ_BCON_COMP_CHECK_3
        //   Water Meter Failure (Invalid Level): If the Water Meter provides a level event, but it is less than or equal to 0, then the Water Meter is broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.waterLevel.nonEmpty &&
           api.waterLevel.get == 0.0f) -->: (isWaterMeterFailing & api.levelRepairAck.isEmpty),
        // case REQ_BCON_COMP_CHECK_4
        //   Water Meter Repair: If the Water Meter was broken, but a repair event has been received, the Water Meter is not broken as long as there is a level event with a valid data payload.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.levelRepair.nonEmpty &
           api.waterLevel.nonEmpty &&
           api.waterLevel.get > 0.0f) -->: (!isWaterMeterFailing &
          In(isWaterMeterFailing) ->: api.levelRepairAck.nonEmpty),
        // case REQ_BCON_COMP_CHECK_5
        //   Steam Meter Failure (No Repair): If the Steam Meter was broken, and the repair message has not been sent. The Steam Meter remains broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           In(isSteamMeterFailing) &
           !(api.steamRepair.nonEmpty)) -->: (isSteamMeterFailing & api.steamRepairAck.isEmpty),
        // case REQ_BCON_COMP_CHECK_6
        //   Steam Meter Failure (No steamRate): If the Steam Meter provides no steamRate event, The Steam Meter is Broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           !(api.steamRate.nonEmpty)) -->: (isSteamMeterFailing & transmissionFailure &
          api.steamRepairAck.isEmpty),
        // case REQ_BCON_COMP_CHECK_7
        //   Steam Meter Failure (Invalid steamRate): If the Steam Meter provides a steamRate event, but it is less than 0, then the Steam Meter is broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.steamRate.nonEmpty &&
           api.steamRate.get < 0.0f) -->: (isSteamMeterFailing & api.steamRepairAck.isEmpty),
        // case REQ_BCON_COMP_CHECK_8
        //   Steam Meter Repair: If the Steam Meter was broken, but a repair event has been received, the Steam Meter is not broken as long as there is a steamRate event with a valid data payload.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.steamRepair.nonEmpty &&
           api.steamRate.nonEmpty &&
           api.steamRate.get >= 0.0f) -->: (!isSteamMeterFailing &
          In(isSteamMeterFailing) ->: api.steamRepairAck.nonEmpty),
        // case REQ_BCON_COMP_CHECK_9_Pump0
        //   Pump Failure (No Repair): If a given Pump was broken, and the repair message for that pump has not been sent. The given Pump remains broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           In(isPump0Failing) &
           !(api.pumpRepair0.nonEmpty)) -->: (isPump0Failing & api.pumpRepairAck0.isEmpty),
        // case REQ_BCON_COMP_CHECK_9_Pump1
        //   Pump Failure (No Repair): If a given Pump was broken, and the repair message for that pump has not been sent. The given Pump remains broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           In(isPump1Failing) &
           !(api.pumpRepair1.nonEmpty)) -->: (isPump1Failing & api.pumpRepairAck1.isEmpty),
        // case REQ_BCON_COMP_CHECK_9_Pump2
        //   Pump Failure (No Repair): If a given Pump was broken, and the repair message for that pump has not been sent. The given Pump remains broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           In(isPump2Failing) &
           !(api.pumpRepair2.nonEmpty)) -->: (isPump2Failing & api.pumpRepairAck2.isEmpty),
        // case REQ_BCON_COMP_CHECK_9_Pump3
        //   Pump Failure (No Repair): If a given Pump was broken, and the repair message for that pump has not been sent. The given Pump remains broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           In(isPump3Failing) &
           !(api.pumpRepair3.nonEmpty)) -->: (isPump3Failing & api.pumpRepairAck3.isEmpty),
        // case REQ_BCON_COMP_CHECK_10_Pump0
        //   Pump Failure (No Open, or No Flow): If a given Pump provides no open or flow event, The Pump is Broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           (!(api.pumpOpen0.nonEmpty) | !(api.pumpFlow0.nonEmpty))) -->: (isPump0Failing & api.pumpRepairAck0.isEmpty),
        // case REQ_BCON_COMP_CHECK_10_Pump1
        //   Pump Failure (No Open, or No Flow): If a given Pump provides no open or flow event, The Pump is Broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           (!(api.pumpOpen1.nonEmpty) | !(api.pumpFlow1.nonEmpty))) -->: (isPump1Failing & api.pumpRepairAck1.isEmpty),
        // case REQ_BCON_COMP_CHECK_10_Pump2
        //   Pump Failure (No Open, or No Flow): If a given Pump provides no open or flow event, The Pump is Broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           (!(api.pumpOpen2.nonEmpty) | !(api.pumpFlow2.nonEmpty))) -->: (isPump2Failing & api.pumpRepairAck2.isEmpty),
        // case REQ_BCON_COMP_CHECK_10_Pump3
        //   Pump Failure (No Open, or No Flow): If a given Pump provides no open or flow event, The Pump is Broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           (!(api.pumpOpen3.nonEmpty) | !(api.pumpFlow3.nonEmpty))) -->: (isPump3Failing & api.pumpRepairAck3.isEmpty),
        // case REQ_BCON_COMP_CHECK_11_Pump0
        //   Pump Failure (Invalid Level): If a given Pump provides an open and flow event, but they do not logically match (if open then flow or if !open then !flow), then the Pump is broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpOpen0.nonEmpty &&
           api.pumpFlow0.nonEmpty &&
           api.pumpOpen0.get != api.pumpFlow0.get) -->: (isPump0Failing & api.pumpRepairAck0.isEmpty),
        // case REQ_BCON_COMP_CHECK_11_Pump1
        //   Pump Failure (Invalid Level): If a given Pump provides an open and flow event, but they do not logically match (if open then flow or if !open then !flow), then the Pump is broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpOpen1.nonEmpty &&
           api.pumpFlow1.nonEmpty &&
           api.pumpOpen1.get != api.pumpFlow1.get) -->: (isPump1Failing & api.pumpRepairAck1.isEmpty),
        // case REQ_BCON_COMP_CHECK_11_Pump2
        //   Pump Failure (Invalid Level): If a given Pump provides an open and flow event, but they do not logically match (if open then flow or if !open then !flow), then the Pump is broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpOpen2.nonEmpty &&
           api.pumpFlow2.nonEmpty &&
           api.pumpOpen2.get != api.pumpFlow2.get) -->: (isPump2Failing & api.pumpRepairAck2.isEmpty),
        // case REQ_BCON_COMP_CHECK_11_Pump3
        //   Pump Failure (Invalid Level): If a given Pump provides an open and flow event, but they do not logically match (if open then flow or if !open then !flow), then the Pump is broken.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpOpen3.nonEmpty &&
           api.pumpFlow3.nonEmpty &&
           api.pumpOpen3.get != api.pumpFlow3.get) -->: (isPump3Failing & api.pumpRepairAck3.isEmpty),
        // case REQ_BCON_COMP_CHECK_12_Pump0
        //   Pump Repair: If a given Pump was broken, but a repair event for that pump has been received, the Pump is not broken as long as there is an open and flow event with a valid data payload.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpRepair0.nonEmpty &
           api.pumpOpen0.nonEmpty &&
           api.pumpFlow0.nonEmpty &&
           api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing &
          isPump0Failing ->: api.pumpRepairAck0.nonEmpty),
        // case REQ_BCON_COMP_CHECK_12_Pump1
        //   Pump Repair: If a given Pump was broken, but a repair event for that pump has been received, the Pump is not broken as long as there is an open and flow event with a valid data payload.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpRepair1.nonEmpty &
           api.pumpOpen1.nonEmpty &&
           api.pumpFlow1.nonEmpty &&
           api.pumpOpen1.get == api.pumpFlow1.get) -->: (!isPump1Failing &
          isPump1Failing ->: api.pumpRepairAck1.nonEmpty),
        // case REQ_BCON_COMP_CHECK_12_Pump2
        //   Pump Repair: If a given Pump was broken, but a repair event for that pump has been received, the Pump is not broken as long as there is an open and flow event with a valid data payload.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpRepair2.nonEmpty &
           api.pumpOpen2.nonEmpty &&
           api.pumpFlow2.nonEmpty &&
           api.pumpOpen2.get == api.pumpFlow2.get) -->: (!isPump2Failing &
          isPump2Failing ->: api.pumpRepairAck2.nonEmpty),
        // case REQ_BCON_COMP_CHECK_12_Pump3
        //   Pump Repair: If a given Pump was broken, but a repair event for that pump has been received, the Pump is not broken as long as there is an open and flow event with a valid data payload.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty) &
           api.pumpRepair3.nonEmpty &
           api.pumpOpen3.nonEmpty &&
           api.pumpFlow3.nonEmpty &&
           api.pumpOpen3.get == api.pumpFlow3.get) -->: (!isPump3Failing &
          isPump3Failing ->: api.pumpRepairAck3.nonEmpty),
        // case REQ_BCON_COMP_CHECK_13
        //   Transmission Failure: If any of the following ports are empty, then the transmissionFailure state variable must be true: pumpOpen0, pumpOpen1, pumpOpen2, pumpOpen3, pumpFlow0, pumpFlow1, pumpFlow2, pumpFlow3, steamRate, waterLevel.
        (In(mode) != BoilerControl.OpMode.Stop &
           !(api.stop.nonEmpty)) -->: ((!(api.pumpFlow0.nonEmpty) | !(api.pumpOpen0.nonEmpty) |
           !(api.pumpFlow1.nonEmpty) |
           !(api.pumpOpen1.nonEmpty) |
           !(api.pumpFlow2.nonEmpty) |
           !(api.pumpOpen2.nonEmpty) |
           !(api.pumpFlow3.nonEmpty) |
           !(api.pumpOpen3.nonEmpty) |
           !(api.steamRate.nonEmpty) |
           !(api.waterLevel.nonEmpty)) ->: transmissionFailure),
        // case REQ_BCON_COMP_INITMODE_1
        //   If the boiler has not sent waiting yet, and the boiler control recieves the waiting event, hasBoilerSentWaiting is true.
        (In(mode) == BoilerControl.OpMode.Init &
           !(api.stop.nonEmpty) &
           (!(In(hasBoilerSentWaiting)) & api.boilerWaiting.nonEmpty)) -->: (hasBoilerSentWaiting),
        // case REQ_BCON_COMP_INITMODE_2
        //   If the steam meter is failing, or the steam rate recorded is not zero, then mode is stop.
        (In(mode) == BoilerControl.OpMode.Init &
           !(api.stop.nonEmpty)) -->: ((v_steamRate != 0.0f |
           isSteamMeterFailing) ->: (mode == BoilerControl.OpMode.Stop)),
        // case REQ_BCON_COMP_INITMODE_3
        //   If the water meter is failing, then mode is stop.
        (In(mode) == BoilerControl.OpMode.Init &
           !(api.stop.nonEmpty)) -->: (isWaterMeterFailing ->: (mode == BoilerControl.OpMode.Stop)),
        // case REQ_BCON_COMP_INITMODE_4
        //   If the Boiler has sent waiting before, or we receive the event boilerWaiting, then if q > N2, the valve is opened, and the pumps are closed.
        (In(mode) == BoilerControl.OpMode.Init &
           !(api.stop.nonEmpty) &
           (In(hasBoilerSentWaiting) | api.boilerWaiting.nonEmpty) &
           !(In(v_steamRate) != 0.0f |
             In(isSteamMeterFailing) |
             In(isWaterMeterFailing))) -->: ((q > N2) ->: (api.valve.nonEmpty && api.openPump0.nonEmpty &&
           !(api.openPump0.get) &&
           api.openPump1.nonEmpty &&
           !(api.openPump1.get) &
           api.openPump2.nonEmpty &&
           !(api.openPump2.get) &&
           api.openPump3.nonEmpty &&
           !(api.openPump3.get))),
        // case REQ_BCON_COMP_INITMODE_5
        //   If the Boiler has sent waiting before, or we receive the event boilerWaiting, then if q < N1, the lowest id working pump is opened. If none can, mode to stop.
        (In(mode) == BoilerControl.OpMode.Init &
           !(api.stop.nonEmpty) &
           (In(hasBoilerSentWaiting) | api.boilerWaiting.nonEmpty) &
           !(In(v_steamRate) != 0.0f |
             In(isSteamMeterFailing) |
             In(isWaterMeterFailing))) -->: ((q < N1) ->: (!isPump0Failing && api.pumpOpen0.nonEmpty &&
           api.pumpOpen0.get == T |^
           isPump0Failing && !isPump1Failing &&
             api.pumpOpen1.nonEmpty &&
             api.pumpOpen1.get == T |^
           isPump0Failing && isPump1Failing &&
             !isPump2Failing &&
             api.pumpOpen2.nonEmpty &&
             api.pumpOpen2.get == T |^
           isPump0Failing && isPump1Failing &&
             isPump2Failing &&
             !isPump3Failing &&
             api.pumpOpen3.nonEmpty &&
             api.pumpOpen3.get == T |^
           isPump0Failing && isPump1Failing &&
             isPump2Failing &&
             isPump3Failing &&
             mode == BoilerControl.OpMode.Stop)),
        // case REQ_BCON_COMP_INITMODE_6
        //   If the Boiler has sent waiting before, or we receive the event boilerWaiting, then if q >= N1 and q <= N2, then the ready event is sent. If all other parts are sending the ready event, mode is normal.
        (In(mode) == BoilerControl.OpMode.Init &
           !(api.stop.nonEmpty) &
           (In(hasBoilerSentWaiting) | api.boilerWaiting.nonEmpty) &
           !(In(v_steamRate) != 0.0f |
             In(isSteamMeterFailing) |
             In(isWaterMeterFailing))) -->: ((q >= N1 &&
           q <= N2) ->: (api.ready.nonEmpty &
           (api.boilerReady.nonEmpty & api.steamMeterReady.nonEmpty &
             api.waterMeterReady.nonEmpty &
             api.pumpControlReady0.nonEmpty &
             api.pumpControlReady1.nonEmpty &
             api.pumpControlReady2.nonEmpty &
             api.pumpControlReady3.nonEmpty) ->: (mode == BoilerControl.OpMode.Norm))),
        // case REQ_BCON_COMP_NORMMODE_1
        //   NORMtoRESC: While in Normal mode, if the Water Meter fails, then mode to Rescue.
        (In(mode) == BoilerControl.OpMode.Norm &
           !(api.stop.nonEmpty)) -->: (isWaterMeterFailing ->: (mode == BoilerControl.OpMode.Resc)),
        // case REQ_BCON_COMP_NORMMODE_2
        //   NORMtoDEGR: While in Normal mode, if the Water Meter is working, but another element is failing, then mode to Degraded.
        (In(mode) == BoilerControl.OpMode.Norm &
           !(api.stop.nonEmpty)) -->: ((!isWaterMeterFailing &&
           (isSteamMeterFailing | isPump0Failing |
             isPump1Failing |
             isPump2Failing |
             isPump3Failing)) ->: (mode == BoilerControl.OpMode.Degr)),
        // case REQ_BCON_COMP_NORMMODE_3
        //   NORMtoSTOP: While in Normal mode, if all components are working, but qa1 or qa2 are not between M1 and M2, then mode will move to Stop.
        (In(mode) == BoilerControl.OpMode.Norm &
           !(api.stop.nonEmpty)) -->: ((!(isWaterMeterFailing || isSteamMeterFailing ||
           isPump0Failing ||
           isPump1Failing ||
           isPump2Failing ||
           isPump3Failing) &&
           (qa1 <= M1 ||
             qa1 >= M2 ||
             qa2 <= M1 ||
             qa2 >= M2)) ->: (mode == BoilerControl.OpMode.Stop)),
        // case REQ_BCON_COMP_NORMMODE_4
        //   NORMMAINTAIN: While in Normal mode, if all components are working, and qa1 or qa2 are between M1 and M2, then mode will remain Normal.
        (In(mode) == BoilerControl.OpMode.Norm &
           !(api.stop.nonEmpty)) -->: ((!(isWaterMeterFailing || isSteamMeterFailing ||
           isPump0Failing ||
           isPump1Failing ||
           isPump2Failing ||
           isPump3Failing) && !(qa1 <= M1 ||
           qa1 >= M2 ||
           qa2 <= M1 ||
           qa2 >= M2)) ->: (mode == BoilerControl.OpMode.Norm)),
        // case REQ_BCON_COMP_DEGRMODE_1
        //   DEGRtoRESC: While in Degraded mode, if the Water Meter Fails, then the mode shall be set to Rescue.
        (In(mode) == BoilerControl.OpMode.Degr &
           !(api.stop.nonEmpty)) -->: (isWaterMeterFailing ->: (mode == BoilerControl.OpMode.Resc)),
        // case REQ_BCON_COMP_DEGRMODE_2
        //   DEGRtoSTOP: While in Degraded mode, if the Water Meter is not failing, but some other component is failing, and qc1 or qc2 is not between M1 and M2 exclusive, then the mode shall be set to Stop.
        (In(mode) == BoilerControl.OpMode.Degr &
           !(api.stop.nonEmpty)) -->: ((!isWaterMeterFailing &&
           (isSteamMeterFailing || isPump0Failing ||
             isPump1Failing ||
             isPump2Failing ||
             isPump3Failing) &&
           (qa1 <= M1 ||
             qa1 >= M2 ||
             qa2 <= M1 ||
             qa2 >= M2)) ->: (mode == BoilerControl.OpMode.Stop)),
        // case REQ_BCON_COMP_DEGRMODE_3
        //   DEGRtoNORM: While in Degraded mode, if no component is failing, then mode is changed to Normal.
        (In(mode) == BoilerControl.OpMode.Degr &
           !(api.stop.nonEmpty)) -->: (!(isWaterMeterFailing || isSteamMeterFailing ||
           isPump0Failing ||
           isPump1Failing ||
           isPump2Failing ||
           isPump3Failing) ->: (mode == BoilerControl.OpMode.Norm)),
        // case REQ_BCON_COMP_DEGRMODE_4
        //   DEGRMAINTAIN: While in Degraded mode, if Water Meter is not failing, but another component is, and qa1 and qa2 are between M1 and M2, then mode stays in Degraded, and the pumps should be updated.
        (In(mode) == BoilerControl.OpMode.Degr &
           !(api.stop.nonEmpty)) -->: ((!isWaterMeterFailing &&
           (isSteamMeterFailing || isPump0Failing ||
             isPump1Failing ||
             isPump2Failing ||
             isPump3Failing) &&
           !(qa1 <= M1 ||
             qa1 >= M2 ||
             qa2 <= M1 ||
             qa2 >= M2)) ->: (mode == BoilerControl.OpMode.Degr &&
           shouldUpdatePumps)),
        // case REQ_BCON_COMP_RESCMODE_1
        //   RESCtoDEGR: While in Rescue Mode, if the Water Meter is operating properly, but another element has failed, then the mode should be changed to Degraded.
        (In(mode) == BoilerControl.OpMode.Resc &
           !(api.stop.nonEmpty)) -->: ((!isWaterMeterFailing &&
           (isPump0Failing || isPump1Failing ||
             isPump2Failing ||
             isPump3Failing ||
             isSteamMeterFailing)) ->: (mode == BoilerControl.OpMode.Degr)),
        // case REQ_BCON_COMP_RESCMODE_2
        //   RESCtoNORM: While in Rescue Mode, if there are no failures in any component, then mode moves to normal mode.
        (In(mode) == BoilerControl.OpMode.Resc &
           !(api.stop.nonEmpty)) -->: (!(isWaterMeterFailing || isPump0Failing ||
           isPump1Failing ||
           isPump2Failing ||
           isPump3Failing ||
           isSteamMeterFailing) ->: (mode == BoilerControl.OpMode.Norm)),
        // case REQ_BCON_COMP_RESCMODE_3
        //   RESCtoSTOP: While in Rescue Mode, if the Water Meter is failing, and either qc1 is not (M1 < qc1 < M2) or qc2 is not (M1 < qc2 < M2), then mode is Stop.
        (In(mode) == BoilerControl.OpMode.Resc &
           !(api.stop.nonEmpty)) -->: ((isWaterMeterFailing &&
           (qc1 <= M1 ||
             qc1 >= M2 ||
             qc2 <= M1 ||
             qc2 >= M2)) ->: (mode == BoilerControl.OpMode.Stop)),
        // case REQ_BCON_COMP_RESCMODE_4
        //   MAINTAINRESC: While in Rescue Mode, if the Water Meter is failing, and qc1 is (M1 < qc1 < M2) and qc2 is (M1 < qc2 < M2), then mode remains Resc.
        (In(mode) == BoilerControl.OpMode.Resc &
           !(api.stop.nonEmpty)) -->: ((isWaterMeterFailing && !(qc1 <= M1 ||
           qc1 >= M2 ||
           qc2 <= M1 ||
           qc2 >= M2)) ->: (mode == BoilerControl.OpMode.Resc &&
           mode == In(mode))),
        // case REQ_BCON_COMP_UPD_CASE_1
        //   Case 1 [509]: If qa1 and qa2 are less than N1, open pumps.
        (T) -->: ((shouldUpdatePumps &
           qa1 < N1 &
           qa2 < N1) ->: (api.openPump0.nonEmpty &&
           api.openPump0.get == T &&
           api.openPump1.nonEmpty &&
           api.openPump1.get == T &&
           api.openPump2.nonEmpty &&
           api.openPump2.get == T &&
           api.openPump3.nonEmpty &&
           api.openPump3.get == T)),
        // case REQ_BCON_COMP_UPD_CASE_2
        //   Case 2 [509]: If qa1 is less than N1, and qa2 is less than N2, but qa2 is greater than N1, open pumps.
        (T) -->: ((shouldUpdatePumps &
           qa1 < N1 &
           qa2 < N2 &
           qa2 >= N1) ->: (api.openPump0.nonEmpty &&
           api.openPump0.get == T &&
           api.openPump1.nonEmpty &&
           api.openPump1.get == T &&
           api.openPump2.nonEmpty &&
           api.openPump2.get == T &&
           api.openPump3.nonEmpty &&
           api.openPump3.get == T)),
        // case REQ_BCON_COMP_UPD_CASE_3
        //   Case 3 [509]: If qa1 is less than N1 and qa2 is greater than N2, then no call is sent the pumps.
        (T) -->: ((shouldUpdatePumps &
           qa1 < N1 &
           qa2 >= N2) ->: (!(api.openPump0.nonEmpty) && !(api.openPump1.nonEmpty) &&
           !(api.openPump2.nonEmpty) &&
           !(api.openPump3.nonEmpty))),
        // case REQ_BCON_COMP_UPD_CASE_4
        //   Case 4 [509]: If qa1 and qa2 are between N1 and N2, then no call is sent to the pumps.
        (T) -->: ((shouldUpdatePumps &
           qa1 >= N1 &
           qa1 < N2 &
           qa2 >= N1 &
           qa2 < N2) ->: (!(api.openPump0.nonEmpty) && !(api.openPump1.nonEmpty) &&
           !(api.openPump2.nonEmpty) &&
           !(api.openPump3.nonEmpty))),
        // case REQ_BCON_COMP_UPD_CASE_5
        //   Case 5 [509]: If qa1 is between N1 and N2 (less than N2), and qa2 is greater than or equal to N2.
        (T) -->: ((shouldUpdatePumps &
           qa1 >= N1 &
           qa1 < N2 &
           qa2 >= N2) ->: (api.openPump0.nonEmpty &&
           api.openPump0.get == F &&
           api.openPump1.nonEmpty &&
           api.openPump1.get == F &&
           api.openPump2.nonEmpty &&
           api.openPump2.get == F &&
           api.openPump3.nonEmpty &&
           api.openPump3.get == F)),
        // case REQ_BCON_COMP_UPD_CASE_6
        //   Case 6 [509]: If qa1 is less than N1, and qa2 is less than N2, but qa2 is greater than N1, open pumps.
        (T) -->: ((shouldUpdatePumps &
           qa1 >= N2 &
           qa2 >= N2) ->: (api.openPump0.nonEmpty &&
           api.openPump0.get == F &&
           api.openPump1.nonEmpty &&
           api.openPump1.get == F &&
           api.openPump2.nonEmpty &&
           api.openPump2.get == F &&
           api.openPump3.nonEmpty &&
           api.openPump3.get == F))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    shouldUpdatePumps = F
    api.logInfo(s"BoilerControl: Beginning Compute.")
    if (api.get_stop().nonEmpty) {
      api.logInfo(s"BoilerControl: Received Stop Message.")
      mode = OpMode.Stop
      api.logInfo(s"BoilerControl: OpMode is now Stop.")
    }
    else if (mode != OpMode.Stop){
      CheckForFailures(api)
      if(isWaterMeterFailing){
        api.put_levelFail()
      }
      if(isSteamMeterFailing){
        api.put_steamFail()
      }
      if(isPump0Failing){
        api.put_pumpFail0()
      }
      if(isPump1Failing){
        api.put_pumpFail1()
      }
      if(isPump2Failing){
        api.put_pumpFail2()
      }
      if(isPump3Failing){
        api.put_pumpFail3()
      }
      P = p0 + p1 + p2 + p3
      qc1 = q - 5.0f * v_steamRate - 12.5f * U1 + P
      qc2 = q - 5.0f * v_steamRate + 12.5f * U1 + P
      if(isWaterMeterFailing){
        qa1 = qc1
        qa2 = qc2
      }
      else{
        qa1 =  q
        qa2 = q
      }
      mode match {
        case OpMode.Init => // If we are in Initial OpMode
          InitialModeCompute(api)
        //
        case OpMode.Norm =>
          NormalModeCompute(api)
        case OpMode.Degr =>
          DegradedModeCompute(api)
        case OpMode.Resc =>
          RescueModeCompute(api)
        case OpMode.Stop =>
          EmergencyStopModeCompute(api)
      }
      if(shouldUpdatePumps){
        UpdatePumps(api)
      }
    }
    api.put_opMode(mode)
    api.logInfo(s"MESSAGE SENT (BoilerControl): OpMode($mode)")
  }

  def CheckForFailures(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(

      ),
      Modifies(
        api,
        v_steamRate,
        q,
        isWaterMeterFailing,
        isSteamMeterFailing,
        isPump0Failing,
        isPump1Failing,
        isPump2Failing,
        isPump3Failing,
        transmissionFailure
      ),
      Ensures(
        // REQ_BCON_COMP_CHECK_1
        // Water Meter Failure (No Repair): If the Water Meter was broken, and the repair message has not been sent. The Water Meter remains broken.
        ((In(isWaterMeterFailing) && api.levelRepair.isEmpty)) -->: (isWaterMeterFailing),
        // REQ_BCON_COMP_CHECK_2
        // Water Meter Failure (No Level): If the Water Meter provides no level event, The Water Meter is Broken.
        (api.waterLevel.isEmpty) -->: (isWaterMeterFailing & transmissionFailure),
        // REQ_BCON_COMP_CHECK_3
        // Water Meter Failure (Invalid Level): If the Water Meter provides a level event, but it is less than or equal to 0, then the Water Meter is broken.
        (api.waterLevel.nonEmpty && api.waterLevel.get <= 0f) -->: (isWaterMeterFailing),
        // REQ_BCON_COMP_CHECK_4
        // Water Meter Repair: If the Water Meter was broken, but a repair event has been received, the Water Meter is not broken as long as there is a level event with a valid data payload.
        (api.levelRepair.nonEmpty && api.waterLevel.nonEmpty && api.waterLevel.get > 0f) -->: (!isWaterMeterFailing),
        // REQ_BCON_COMP_CHECK_5
        // Steam Meter Failure (No Repair): If the Steam Meter was broken, and the repair message has not been sent. The Steam Meter remains broken.
        ((In(isSteamMeterFailing) && api.steamRepair.isEmpty)) -->: (isSteamMeterFailing),
        // REQ_BCON_COMP_CHECK_6
        // Steam Meter Failure (No steamRate): If the Steam Meter provides no steamRate event, The Steam Meter is Broken.
        (api.steamRate.isEmpty) -->: (isSteamMeterFailing & transmissionFailure),
        // REQ_BCON_COMP_CHECK_7
        // Steam Meter Failure (Invalid steamRate): If the Steam Meter provides a steamRate event, but it is less than 0, then the Steam Meter is broken.
        (api.steamRate.nonEmpty && api.steamRate.get < 0f) -->: (isSteamMeterFailing),
        // REQ_BCON_COMP_CHECK_8
        // Steam Meter Repair: If the Steam Meter was broken, but a repair event has been received, the Steam Meter is not broken as long as there is a steamRate event with a valid data payload.
        (api.steamRepair.nonEmpty && api.steamRate.nonEmpty && api.steamRate.get >= 0f) -->: (!isSteamMeterFailing),
        // REQ_BCON_COMP_CHECK_9
        // Pump Failure (No Repair): If a given Pump was broken, and the repair message for that pump has not been sent. The given Pump remains broken.
        (((In(isPump0Failing) && api.pumpRepair0.isEmpty)) -->: (isPump0Failing)) &&
          (((In(isPump1Failing) && api.pumpRepair1.isEmpty)) -->: (isPump1Failing)) &&
          (((In(isPump2Failing) && api.pumpRepair2.isEmpty)) -->: (isPump2Failing)) &&
          (((In(isPump3Failing) && api.pumpRepair3.isEmpty)) -->: (isPump3Failing)),
        // REQ_BCON_COMP_CHECK_10
        // Pump Failure (No Open, or No Flow): If a given Pump provides no open or flow event, The Pump is Broken.
        ((api.pumpOpen0.isEmpty || api.pumpFlow0.isEmpty) -->: (isPump0Failing)) &&
          ((api.pumpOpen1.isEmpty || api.pumpFlow1.isEmpty) -->: (isPump1Failing)) &&
          ((api.pumpOpen2.isEmpty || api.pumpFlow2.isEmpty) -->: (isPump2Failing)) &&
          ((api.pumpOpen3.isEmpty || api.pumpFlow3.isEmpty) -->: (isPump3Failing)),
        // REQ_BCON_COMP_CHECK_11
        // Pump Failure (Invalid Level): If a given Pump provides an open and flow event, but they do not logically match (if open then flow or if !open then !flow), then the Pump is broken.
        ((api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get != api.pumpFlow0.get) -->: (isPump0Failing)) &&
          ((api.pumpOpen1.nonEmpty && api.pumpFlow1.nonEmpty && api.pumpOpen1.get != api.pumpFlow1.get) -->: (isPump1Failing)) &&
          ((api.pumpOpen2.nonEmpty && api.pumpFlow2.nonEmpty && api.pumpOpen2.get != api.pumpFlow2.get) -->: (isPump2Failing)) &&
          ((api.pumpOpen3.nonEmpty && api.pumpFlow3.nonEmpty && api.pumpOpen3.get != api.pumpFlow3.get) -->: (isPump3Failing)),
        // REQ_BCON_COMP_CHECK_12
        // Pump Repair: If a given Pump was broken, but a repair event for that pump has been received, the Pump is not broken as long as there is an open and flow event with a valid data payload.
        ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)) &&
          ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)) &&
          ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)) &&
          ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)),
        // REQ_BCON_COMP_CHECK_13
        // Transmission Failure: If any of the following ports are empty, then the transmissionFailure state variable must be true: pumpOpen0, pumpOpen1, pumpOpen2, pumpOpen3, pumpFlow0, pumpFlow1, pumpFlow2, pumpFlow3, steamRate, waterLevel.
        (api.pumpFlow0.isEmpty || api.pumpOpen0.isEmpty ||
          api.pumpFlow1.isEmpty || api.pumpOpen1.isEmpty ||
          api.pumpFlow2.isEmpty || api.pumpOpen2.isEmpty ||
          api.pumpFlow3.isEmpty || api.pumpOpen3.isEmpty ||
          api.steamRate.isEmpty || api.waterLevel.isEmpty) -->:
          (transmissionFailure)
      )
    )
    val priorLevel: B = isWaterMeterFailing
    val priorSteam: B = isSteamMeterFailing
    val priorPump0: B = isPump0Failing
    val priorPump1: B = isPump1Failing
    val priorPump2: B = isPump2Failing
    val priorPump3: B = isPump3Failing
    CheckWaterMeterForFailure(api)
    CheckSteamMeterForFailure(api)
    CheckPumpsForFailure(api)
    if(priorLevel && !isWaterMeterFailing){
      api.put_levelRepairAck()
    }
    if (priorSteam && !isSteamMeterFailing) {
      api.put_steamRepairAck()
    }
    if (priorPump0 && !isPump0Failing) {
      api.put_pumpRepairAck0()
      api.put_pumpControlRepairAck0()
    }
    if (priorPump1 && !isPump1Failing) {
      api.put_pumpRepairAck1()
      api.put_pumpControlRepairAck1()
    }
    if (priorPump2 && !isPump2Failing) {
      api.put_pumpRepairAck2()
      api.put_pumpControlRepairAck2()
    }
    if (priorPump3 && !isPump3Failing) {
      api.put_pumpRepairAck3()
      api.put_pumpControlRepairAck3()
    }
  }

  def CheckSteamMeterForFailure(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(

      ),
      Modifies(
        transmissionFailure,
        isSteamMeterFailing,
        v_steamRate
      ),
      Ensures(
        // REQ_BCON_COMP_CHECK_5
        // Steam Meter Failure (No Repair): If the Steam Meter was broken, and the repair message has not been sent. The Steam Meter remains broken.
        ((In(isSteamMeterFailing) && api.steamRepair.isEmpty)) -->: (isSteamMeterFailing),
        // REQ_BCON_COMP_CHECK_6
        // Steam Meter Failure (No steamRate): If the Steam Meter provides no steamRate event, The Steam Meter is Broken.
        (api.steamRate.isEmpty) -->: (isSteamMeterFailing & transmissionFailure),
        // REQ_BCON_COMP_CHECK_7
        // Steam Meter Failure (Invalid steamRate): If the Steam Meter provides a steamRate event, but it is less than 0, then the Steam Meter is broken.
        (api.steamRate.nonEmpty && api.steamRate.get < 0f) -->: (isSteamMeterFailing),
        // REQ_BCON_COMP_CHECK_8
        // Steam Meter Repair: If the Steam Meter was broken, but a repair event has been received, the Steam Meter is not broken as long as there is a steamRate event with a valid data payload.
        (api.steamRepair.nonEmpty && api.steamRate.nonEmpty && api.steamRate.get >= 0f) -->: (!isSteamMeterFailing),
        // Transmission Failure
        (api.steamRate.isEmpty) -->: (transmissionFailure)
      )
    )
    //CHECK IF STEAM METEER IS FAILING
    api.get_steamRepair() match {
      case None() =>
        api.logError("BoilerControl: No steamRepair received.")
      case Some(_) =>
        api.logInfo(s"BoilerControl: Received steamRepair Message.")
        isSteamMeterFailing = F
    }
    api.get_steamRate() match {
      case None() =>
        api.logError("BoilerControl: No steam meter rate received.")
        v_steamRate = -1f
        isSteamMeterFailing = true
        transmissionFailure = true
      case Some(x) =>
        api.logInfo(s"BoilerControl: Received steamMeter Message = ($x).")
        v_steamRate = x
        if(x < 0f) {
          isSteamMeterFailing = true
        }
    }
  }

  def CheckWaterMeterForFailure(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(

      ),
      Modifies(
        isWaterMeterFailing,
        q,
        transmissionFailure
      ),
      Ensures(
        // REQ_BCON_COMP_CHECK_1
        // Water Meter Failure (No Repair): If the Water Meter was broken, and the repair message has not been sent. The Water Meter remains broken.
        ((In(isWaterMeterFailing) && api.levelRepair.isEmpty)) -->: (isWaterMeterFailing),
        // REQ_BCON_COMP_CHECK_2
        // Water Meter Failure (No Level): If the Water Meter provides no level event, The Water Meter is Broken.
        (api.waterLevel.isEmpty) -->: (isWaterMeterFailing & transmissionFailure),
        // REQ_BCON_COMP_CHECK_3
        // Water Meter Failure (Invalid Level): If the Water Meter provides a level event, but it is less than or equal to 0, then the Water Meter is broken.
        (api.waterLevel.nonEmpty && api.waterLevel.get <= 0f) ->: (isWaterMeterFailing),
        // REQ_BCON_COMP_CHECK_4
        // Water Meter Repair: If the Water Meter was broken, but a repair event has been received, the Water Meter is not broken as long as there is a level event with a valid data payload.
        (api.levelRepair.nonEmpty && api.waterLevel.nonEmpty && api.waterLevel.get > 0f) -->: (!isWaterMeterFailing)
      )
    )

    //CHECK IF FAILURE IN WATER METER
    api.get_levelRepair() match {
      case None() =>
        api.logError("BoilerControl: No levelRepair received.")
      case Some(_) =>
        api.logInfo(s"BoilerControl: Received levelRepair Message.")
        isWaterMeterFailing = F
    }
    api.get_waterLevel() match {
      case None() =>
        api.logError("BoilerControl: No water level received.")
        q = 0f
        isWaterMeterFailing = true
        transmissionFailure = true
      case Some(x) =>
        api.logInfo(s"BoilerControl: Received waterLevel Message = ($x).")
        q = x
        if (x <= 0f) {
          isWaterMeterFailing = T
        }
    }
  }

  def CheckPumpsForFailure(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(

      ),
      Modifies(
        transmissionFailure,
        isPump0Failing,
        isPump1Failing,
        isPump2Failing,
        isPump3Failing
      ),
      Ensures(
        // REQ_BCON_COMP_CHECK_9
        // Pump Failure (No Repair): If a given Pump was broken, and the repair message for that pump has not been sent. The given Pump remains broken.
        (((In(isPump0Failing) && api.pumpRepair0.isEmpty)) -->: (isPump0Failing)) &&
          (((In(isPump1Failing) && api.pumpRepair1.isEmpty)) -->: (isPump1Failing)) &&
          (((In(isPump2Failing) && api.pumpRepair2.isEmpty)) -->: (isPump2Failing)) &&
          (((In(isPump3Failing) && api.pumpRepair3.isEmpty)) -->: (isPump3Failing)),
        // REQ_BCON_COMP_CHECK_10
        // Pump Failure (No Open, or No Flow): If a given Pump provides no open or flow event, The Pump is Broken.
        ((api.pumpOpen0.isEmpty || api.pumpFlow0.isEmpty) -->: (isPump0Failing)) &&
          ((api.pumpOpen1.isEmpty || api.pumpFlow1.isEmpty) -->: (isPump1Failing)) &&
          ((api.pumpOpen2.isEmpty || api.pumpFlow2.isEmpty) -->: (isPump2Failing)) &&
          ((api.pumpOpen3.isEmpty || api.pumpFlow3.isEmpty) -->: (isPump3Failing)),
        // REQ_BCON_COMP_CHECK_11
        // Pump Failure (Invalid Level): If a given Pump provides an open and flow event, but they do not logically match (if open then flow or if !open then !flow), then the Pump is broken.
        ((api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get != api.pumpFlow0.get) -->: (isPump0Failing)) &&
          ((api.pumpOpen1.nonEmpty && api.pumpFlow1.nonEmpty && api.pumpOpen1.get != api.pumpFlow1.get) -->: (isPump1Failing)) &&
          ((api.pumpOpen2.nonEmpty && api.pumpFlow2.nonEmpty && api.pumpOpen2.get != api.pumpFlow2.get) -->: (isPump2Failing)) &&
          ((api.pumpOpen3.nonEmpty && api.pumpFlow3.nonEmpty && api.pumpOpen3.get != api.pumpFlow3.get) -->: (isPump3Failing)),
        // REQ_BCON_COMP_CHECK_12
        // Pump Repair: If a given Pump was broken, but a repair event for that pump has been received, the Pump is not broken as long as there is an open and flow event with a valid data payload.
        ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)) &&
          ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)) &&
          ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)) &&
          ((api.pumpRepair0.nonEmpty && api.pumpOpen0.nonEmpty && api.pumpFlow0.nonEmpty && api.pumpOpen0.get == api.pumpFlow0.get) -->: (!isPump0Failing)),
        // Transmission Failure
        (api.pumpOpen0.isEmpty || api.pumpFlow0.isEmpty ||
          api.pumpOpen1.isEmpty || api.pumpFlow1.isEmpty ||
          api.pumpOpen2.isEmpty || api.pumpFlow2.isEmpty ||
          api.pumpOpen3.isEmpty || api.pumpFlow3.isEmpty) -->: (transmissionFailure)
      )
    )

    //CHECK IF FAILURE IN PUMP 0
    api.get_pumpRepair0() match {
      case None() =>
        api.logError("BoilerControl: No pumpRepair0 received.")
      case Some(_) =>
        api.logInfo(s"BoilerControl: Received pumpRepair0 Message.")
        isPump0Failing = F
    }
    api.get_pumpOpen0() match {
      case None() =>
        api.logError("BoilerControl: No pumpOpen0 received.")
        isPump0Failing = T
        transmissionFailure = true
      case Some(x) =>
        api.logInfo(s"BoilerControl: Received pumpOpen0 Message = ($x).")
        api.get_pumpFlow0() match {
          case None() =>
            api.logError("BoilerControl: No pumpFlow0 received.")
            isPump0Failing = T
            transmissionFailure = true
          case Some(y) =>
            api.logInfo(s"BoilerControl: Received pumpFlow0 Message = ($y).")
            if(x != y){
              isPump0Failing = true
            }
        }
    }

    //CHECK IF FAILURE IN PUMP 1
    api.get_pumpRepair1() match {
      case None() =>
        api.logError("BoilerControl: No pumpRepair1 received.")
      case Some(_) =>
        api.logInfo(s"BoilerControl: Received pumpRepair1 Message.")
        isPump1Failing = F
    }
    api.get_pumpOpen1() match {
      case None() =>
        api.logError("BoilerControl: No pumpOpen1 received.")
        isPump1Failing = T
        transmissionFailure = true
      case Some(x) =>
        api.logInfo(s"BoilerControl: Received pumpOpen1 Message = ($x).")
        api.get_pumpFlow1() match {
          case None() =>
            api.logError("BoilerControl: No pumpFlow1 received.")
            isPump1Failing = T
            transmissionFailure = true
          case Some(y) =>
            api.logInfo(s"BoilerControl: Received pumpFlow1 Message = ($y).")
            if (x != y) {
              isPump1Failing = true
            }        }
    }

    //CHECK IF FAILURE IN PUMP 2
    api.get_pumpRepair2() match {
      case None() =>
        api.logError("BoilerControl: No pumpRepair2 received.")
      case Some(_) =>
        api.logInfo(s"BoilerControl: Received pumpRepair2 Message.")
        isPump2Failing = F
    }
    api.get_pumpOpen2() match {
      case None() =>
        api.logError("BoilerControl: No pumpOpen2 received.")
        isPump2Failing = T
        transmissionFailure = true
      case Some(x) =>
        api.logInfo(s"BoilerControl: Received pumpOpen2 Message = ($x).")
        api.get_pumpFlow2() match {
          case None() =>
            api.logError("BoilerControl: No pumpFlow2 received.")
            isPump2Failing = T
            transmissionFailure = true
          case Some(y) =>
            api.logInfo(s"BoilerControl: Received pumpFlow2 Message = ($y).")
            if (x != y) {
              isPump2Failing = true
            }
        }
    }

    //CHECK IF FAILURE IN PUMP 3
    api.get_pumpRepair3() match {
      case None() =>
        api.logError("BoilerControl: No pumpRepair3 received.")
      case Some(_) =>
        api.logInfo(s"BoilerControl: Received pumpRepair3 Message.")
        isPump3Failing = F
    }
    api.get_pumpOpen3() match {
      case None() =>
        api.logError("BoilerControl: No pumpOpen3 received.")
        isPump3Failing = T
        transmissionFailure = true
      case Some(x) =>
        api.logInfo(s"BoilerControl: Received pumpOpen3 Message = ($x).")
        api.get_pumpFlow3() match {
          case None() =>
            api.logError("BoilerControl: No pumpFlow3 received.")
            isPump3Failing = T
            transmissionFailure = true
          case Some(y) =>
            api.logInfo(s"BoilerControl: Received pumpFlow3 Message = ($y).")
            if (x != y) {
              isPump3Failing = true
            }
        }
    }
  }

    def InitialModeCompute(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(

      ),
      Modifies(
        mode,
        hasBoilerSentWaiting
      ),
      Ensures(
        // REQ_BCON_COMP_INITMODE_1
        // If the boiler has not sent waiting yet, and the boiler control recieves the waiting event, hasBoilerSentWaiting is true.
        ((!hasBoilerSentWaiting && api.boilerWaiting.nonEmpty)-->:(hasBoilerSentWaiting)),
        // REQ_BCON_COMP_INITMODE_2
        // If the steam meter is failing, or the steam rate recorded is not zero, then mode is stop.
        ((v_steamRate != 0f || isSteamMeterFailing)-->:(mode == OpMode.Stop)),
        // REQ_BCON_COMP_INITMODE_3
        // If the water meter is failing, then mode is stop.
        ((isWaterMeterFailing) -->: (mode == OpMode.Stop)),
        // REQ_BCON_COMP_INITMODE_4
        // If the Boiler has sent waiting before, or we receive the event boilerWaiting, then if q > N2, the valve is opened, and the pumps are closed.
        ((In(hasBoilerSentWaiting) || api.boilerWaiting.nonEmpty) && q > N2) -->:
          (api.valve.nonEmpty &&
            api.openPump0.nonEmpty && !api.openPump0.get &&
            api.openPump1.nonEmpty && !api.openPump1.get &&
            api.openPump2.nonEmpty && !api.openPump2.get &&
            api.openPump3.nonEmpty && !api.openPump3.get
            ),
        // REQ_BCON_COMP_INITMODE_5
        // If the Boiler has sent waiting before, or we receive the event boilerWaiting, then if q < N1, the lowest id working pump is opened. If none can, mode to stop.
      ((In(hasBoilerSentWaiting) || api.boilerWaiting.nonEmpty) && q < N1) -->:
        (
          (!isPump0Failing && api.pumpOpen0.nonEmpty && api.pumpOpen0.get == T) |^
            (isPump0Failing && ~isPump1Failing && api.pumpOpen1.nonEmpty && api.pumpOpen1.get == T) |^
            (isPump0Failing && isPump1Failing && ~isPump2Failing && api.pumpOpen2.nonEmpty && api.pumpOpen2.get == T) |^
            (isPump0Failing && isPump1Failing && isPump2Failing && ~isPump3Failing && api.pumpOpen3.nonEmpty && api.pumpOpen3.get == T) |^
            (isPump0Failing && isPump1Failing && isPump2Failing && isPump3Failing && mode == OpMode.Stop)
          ),

        // REQ_BCON_INITMODE_6
        // If the Boiler has sent waiting before, or we receive the event boilerWaiting, then if q >= N1 and q <= N2, then the ready event is sent. If all other parts are sending the ready event, mode is normal.
        ((In(hasBoilerSentWaiting) || api.boilerWaiting.nonEmpty) && q >= N1 && q <= N2) -->:
          (
            (api.ready.nonEmpty &&
              ((api.boilerReady.nonEmpty &&
                api.steamMeterReady.nonEmpty &&
                api.waterMeterReady.nonEmpty &&
                api.pumpControlReady0.nonEmpty &&
                api.pumpControlReady1.nonEmpty &&
                api.pumpControlReady2.nonEmpty &&
                api.pumpControlReady3.nonEmpty)-->:(mode == OpMode.Norm)))
            )
      )
    )
    if (!hasBoilerSentWaiting && api.get_boilerWaiting().nonEmpty) {
      api.logInfo(s"BoilerControl: Received Waiting Message.")
      hasBoilerSentWaiting = T
    }

    if(v_steamRate != 0f || isSteamMeterFailing || isWaterMeterFailing){
      api.logInfo(s"BoilerControl: OpMode is now Stop (Reason: Steam measured not zero during Init Mode, or the Steam Meter, or Water Meter has failed during Init Mode).")
      mode = OpMode.Stop
    }
    else if (hasBoilerSentWaiting) {
          if (q > N2) {
            api.put_valve()
            api.put_openPump0(F)
            api.put_openPump1(F)
            api.put_openPump2(F)
            api.put_openPump3(F)
          }
          else if (q < N1) {
            if (isPump0Failing) {
              if (isPump1Failing) {
                if (isPump2Failing) {
                  if (isPump3Failing) {
                    api.logInfo(s"BoilerControl: OpMode is now Stop (Reason: all Pumps failed in Init when one needed to be open).")
                    mode = OpMode.Stop
                  }
                  else {
                    api.put_openPump3(T)
                    api.logInfo(s"MESSAGE SENT (BoilerControl): openPump3(T)")
                  }
                }
                else {
                  api.put_openPump2(T)
                  api.logInfo(s"MESSAGE SENT (BoilerControl): openPump2(T)")
                  //TODO Close Valve
                  api.logInfo(s"MESSAGE SENT (BoilerControl): valve(F)")
                }
              }
              else {
                api.put_openPump1(T)
                api.logInfo(s"MESSAGE SENT (BoilerControl): openPump1(T)")
                //TODO Close Valve
                api.logInfo(s"MESSAGE SENT (BoilerControl): valve(F)")
              }
            }
            else {
              api.put_openPump0(T)
              api.logInfo(s"MESSAGE SENT (BoilerControl): openPump0(T)")
              //TODO Close Valve
              api.logInfo(s"MESSAGE SENT (BoilerControl): valve(F)")
            }
          }
          else {
            api.put_ready()
            api.logInfo(s"MESSAGE SENT (BoilerControl): ready")
            if (api.get_boilerReady().nonEmpty && api.get_steamMeterReady().nonEmpty &&
              api.get_waterMeterReady().nonEmpty && api.get_pumpControlReady0().nonEmpty &&
              api.get_pumpControlReady1().nonEmpty && api.get_pumpControlReady2().nonEmpty &&
              api.get_pumpControlReady3().nonEmpty) {
              api.logInfo(s"BoilerControl: Received Ready Message From All Units.")
              mode = OpMode.Norm
              api.logInfo(s"BoilerControl: OpMode is now Normal.")
            }
          }
    }
  }

  def NormalModeCompute(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(
        mode == OpMode.Norm
      ),
      Modifies(
        mode,
        shouldUpdatePumps
      ),
      Ensures(
        // REQ_BCON_COMP_NORMMODE_1
        // NORMtoRESC: While in Normal mode, if the Water Meter fails, then mode to Rescue.
        (isWaterMeterFailing) -->: (mode == OpMode.Resc),
        // REQ_BCON_COMP_NORMMODE_2
        // NORMtoDEGR: While in Normal mode, if the Water Meter is working, but another element is failing, then mode to Degraded.
        (!isWaterMeterFailing &&
          (isSteamMeterFailing ||
            isPump0Failing ||
            isPump1Failing ||
            isPump2Failing ||
            isPump3Failing)) -->:
          (mode == OpMode.Degr),
        // REQ_BCON_COMP_NORMMODE_3
        // NORMtoSTOP: While in Normal mode, if all components are working, but qa1 or qa2 are not between M1 and M2, then mode will move to Stop.
        ((!(isWaterMeterFailing ||
            isSteamMeterFailing ||
            isPump0Failing ||
            isPump1Failing ||
            isPump2Failing ||
            isPump3Failing)) &&
          (qa1 <= M1 ||
            qa1 >= M2 ||
            qa2 <= M1 ||
            qa2 >= M2)) -->:
          (mode == OpMode.Stop),
        // REQ_BCON_COMP_NORMMODE_4
        // NORMMAINTAIN: While in Normal mode, if all components are working, and qa1 or qa2 are between M1 and M2, then mode will remain Normal.
        ((!(isWaterMeterFailing ||
          isSteamMeterFailing ||
          isPump0Failing ||
          isPump1Failing ||
          isPump2Failing ||
          isPump3Failing)) &&
          (!(qa1 <= M1 ||
            qa1 >= M2 ||
            qa2 <= M1 ||
            qa2 >= M2))) -->:
          (mode == OpMode.Norm)
      )
    )
    if(isWaterMeterFailing){
      mode = OpMode.Resc
    }
    else if(isSteamMeterFailing || isPump0Failing || isPump1Failing || isPump2Failing || isPump3Failing){
      mode = OpMode.Degr
    }
    else {
      if (qa1 <= M1 || qa1 >= M2 || qa2 <= M1 || qa2 >= M2){
        mode = OpMode.Stop
      }
    }
  }

  def DegradedModeCompute(api: BoilerControl_i_Operational_Api): Unit = {
    Contract( // Helper Method Verified
      Requires(
        mode == OpMode.Degr
      ),
      Modifies(
        mode,
        qa1,
        qa2,
        shouldUpdatePumps
      ),
      Ensures(
        // REQ_BCON_COMP_DEGRMODE_1
        // DEGRtoRESC: While in Degraded mode, if the Water Meter Fails, then the mode shall be set to Rescue.
        (isWaterMeterFailing) -->:
          (mode == OpMode.Resc),
        // REQ_BCON_COMP_DEGRMODE_2
        // DEGRtoSTOP: While in Degraded mode, if the Water Meter is not failing, but some other component is failing, and qc1 or qc2 is not between M1 and M2 exclusive, then the mode shall be set to Stop.
        ((!isWaterMeterFailing) &&
          (isSteamMeterFailing ||
            isPump0Failing ||
            isPump1Failing ||
            isPump2Failing ||
            isPump3Failing) &&
          (qa1 <= M1 ||
            qa1 >= M2 ||
            qa2 <= M1 ||
            qa2 >= M2)) -->:
          (mode == OpMode.Stop),
        // REQ_BCON_COMP_DEGRMODE_3
        // DEGRtoNORM: While in Degraded mode, if no component is failing, then mode is changed to Normal.
            (!(isWaterMeterFailing || isSteamMeterFailing ||
              isPump0Failing || isPump1Failing || isPump2Failing || isPump3Failing)) -->:
              (mode == OpMode.Norm),
        // REQ_BCON_COMP_DEGRMODE_4
        // DEGRMAINTAIN: While in Degraded mode, if Water Meter is not failing, but another component is, and qa1 and qa2 are between M1 and M2, then mode stays in Degraded, and the pumps should be updated.
        ((!isWaterMeterFailing) &&
          (isSteamMeterFailing ||
            isPump0Failing || isPump1Failing || isPump2Failing || isPump3Failing) &&
          (!(qa1 <= M1 || qa1 >= M2 || qa2 <= M1 || qa2 >= M2)))-->:
          (mode == OpMode.Degr &&
            shouldUpdatePumps)
      )
    )
    if(isWaterMeterFailing){
      mode = OpMode.Resc
    }
    else if(isSteamMeterFailing || isPump0Failing || isPump1Failing || isPump2Failing || isPump3Failing){
      if (qa1 <= M1 || qa1 >= M2 || qa2 <= M1 || qa2 >= M2) {
        mode = OpMode.Stop
      }
      shouldUpdatePumps = T
    }
    else {
      mode = OpMode.Norm
    }
  }

  def RescueModeCompute(api: BoilerControl_i_Operational_Api): Unit = {
    Contract( // Verified Helper Method
      Requires(
        // REQ_BCON_COMP_RESCMODE_ASMP
        // Require that if the Rescue Mode Compute method is called that the mode is equal to rescue.
        (mode == OpMode.Resc)
      ),
      Modifies(
        mode
      ),
      Ensures(
        // REQ_BCON_COMP_RESCMODE_1
        // RESCtoDEGR: While in Rescue Mode, if the Water Meter is operating properly, but another element has failed, then the mode should be changed to Degraded.
        (((!isWaterMeterFailing) &&
          (isPump0Failing ||
            isPump1Failing ||
            isPump2Failing ||
            isPump3Failing ||
            isSteamMeterFailing))-->:
          (mode == OpMode.Degr)),
        // REQ_BCON_COMP_RESCMODE_2
        // RESCtoNORM: While in Rescue Mode, if there are no failures in any component, then mode moves to normal mode.
        ((!((isWaterMeterFailing ||
          isPump0Failing ||
          isPump1Failing ||
          isPump2Failing ||
          isPump3Failing ||
          isSteamMeterFailing)))-->:
          (mode == OpMode.Norm)),
        // REQ_BCON_COMP_RESCMODE_3
        // RESCtoSTOP: While in Rescue Mode, if the Water Meter is failing, and either qc1 is not (M1 < qc1 < M2) or qc2 is not (M1 < qc2 < M2), then mode is Stop.
        ((isWaterMeterFailing &&
          (qc1 <= M1 ||
            qc1 >= M2 ||
            qc2 <= M1 ||
            qc2 >= M2)) -->:
          (mode == OpMode.Stop)),
        // REQ_BCON_COMP_RESCMODE_4
        // MAINTAINRESC: While in Rescue Mode, if the Water Meter is failing, and qc1 is (M1 < qc1 < M2) and qc2 is (M1 < qc2 < M2), then mode remains Resc.
        ((isWaterMeterFailing &&
          (!(qc1 <= M1 ||
            qc1 >= M2 ||
            qc2 <= M1 ||
            qc2 >= M2))) -->:
          (mode == OpMode.Resc &&
            mode == In(mode)))
      )
    )
    if (!isWaterMeterFailing && (isPump0Failing || isPump1Failing || isPump2Failing || isPump3Failing || isSteamMeterFailing)) {
      mode = OpMode.Degr
    }
    else if (!(isWaterMeterFailing || isPump0Failing || isPump1Failing || isPump2Failing || isPump3Failing || isSteamMeterFailing)){
      mode = OpMode.Norm
    }
    else {
      CalculateMaximalBehaviorNoWaterMeter(api)
      shouldUpdatePumps = T
      if (qc1 <= M1 || qc1 >= M2 || qc2 <= M1 || qc2 >= M2) {
        mode = OpMode.Stop
      }
    }
  }

  def EmergencyStopModeCompute(api: BoilerControl_i_Operational_Api): Unit = {
    //Nothing. The program terminates.
  }
/*
  def CalculateMaximalBehavior(api: BoilerControl_i_Operational_Api): Unit = {
    Contract( //Verified Helper Method
      Requires(

      ),
      Modifies(
        qc1,
        qc2
      ),
      Ensures(
        // REQ_BCON_COMP_CMB_1
        // The Boiler Control's Calculate Maximal Behavior Lower Amount (qc1) should be (q - 5.0f * v - 12.5f * U1 + pSum).
        (T) -->: (qc1 == (q - 5.0f * v - 12.5f * U1 + pSum)),
        // REQ_BCON_COMP_CMB_2
        // The Boiler Control's Calculate Maximal Behavior Upper Amount (qc2) should be (q - 5.0f * v + 12.5f * U1 + pSum).
        (T) -->: (qc2 == (q - 5.0f * v + 12.5f * U1 + pSum))
      )
    )
    // Note: This is a modified version of the calculation found on [508] of the engineering specs.
    //  simplified for the purpose of time constraint and ease.

    // qc (which in the spec. is calculated water level).

    qc1 = q - 5.0f * v - 12.5f * U1 + pSum
    qc2 = q - 5.0f * v + 12.5f * U1 + pSum
  }
*/
  def CalculateMaximalBehaviorNoWaterMeter(api: BoilerControl_i_Operational_Api): Unit = {
    //TODO Implement
  }

  def UpdatePumps(api: BoilerControl_i_Operational_Api): Unit = {
    Contract(
      Requires(
        // REQ_BCON_COMP_UPD_ASM
        // Before the pumps are update, the pump output ports must be empty.
        (api.openPump0.isEmpty &&
          api.openPump1.isEmpty &&
          api.openPump2.isEmpty &&
          api.openPump3.isEmpty &&
          N1 < N2)
      ),
      Modifies(
        api
      ),
      Ensures(
        // REQ_BCON_COMP_UPD_CASE_1
        // Case 1 [509]: If qa1 and qa2 are less than N1, open pumps.
        ((qa1 < N1 & qa2 < N1)-->:
          (api.openPump0.nonEmpty && api.openPump0.get == T &&
            api.openPump1.nonEmpty && api.openPump1.get == T &&
            api.openPump2.nonEmpty && api.openPump2.get == T &&
            api.openPump3.nonEmpty && api.openPump3.get == T )),
        // REQ_BCON_COMP_UPD_CASE_2
        // Case 2 [509]: If qa1 is less than N1, and qa2 is less than N2, but qa2 is greater than N1, open pumps.
        ((qa1 < N1 & qa2 < N2 & qa2 >= N1) -->:
          (api.openPump0.nonEmpty && api.openPump0.get == T &&
            api.openPump1.nonEmpty && api.openPump1.get == T &&
            api.openPump2.nonEmpty && api.openPump2.get == T &&
            api.openPump3.nonEmpty && api.openPump3.get == T)),
        // REQ_BCON_COMP_UPD_CASE_3
        // Case 3 [509]: If qa1 is less than N1 and qa2 is greater than N2, then no call is sent the pumps.
        ((qa1 < N1 & qa2 >= N2) -->:
          (api.openPump0.isEmpty &
            api.openPump1.isEmpty &
            api.openPump2.isEmpty &
            api.openPump3.isEmpty)),
        // REQ_BCON_COMP_UPD_CASE_4
        // Case 4 [509]: If qa1 and qa2 are between N1 and N2, then no call is sent to the pumps.
        ((qa1 >= N1 & qa1 < N2 & qa2 >= N1 & qa2 < N2) -->:
          (api.openPump0.isEmpty &
            api.openPump1.isEmpty &
            api.openPump2.isEmpty &
            api.openPump3.isEmpty)),
        // REQ_BCON_COMP_UPD_CASE_5
        // Case 5 [509]: If qa1 is between N1 and N2 (less than N2), and qa2 is greater than or equal to N2.
        ((qa1 >= N1 & qa1 < N2 & qa2 >= N2) -->:
          (api.openPump0.nonEmpty && api.openPump0.get == F &&
            api.openPump1.nonEmpty && api.openPump1.get == F &&
            api.openPump2.nonEmpty && api.openPump2.get == F &&
            api.openPump3.nonEmpty && api.openPump3.get == F)),
        // REQ_BCON_COMP_UPD_CASE_6
        // Case 6 [509]: If qa1 is less than N1, and qa2 is less than N2, but qa2 is greater than N1, open pumps.
        ((qa1 >= N2 & qa2 >= N2) -->:
          (api.openPump0.nonEmpty && api.openPump0.get == F &&
            api.openPump1.nonEmpty && api.openPump1.get == F &&
            api.openPump2.nonEmpty && api.openPump2.get == F &&
            api.openPump3.nonEmpty && api.openPump3.get == F))
      )
    )
    // TODO NOTABLE EXAMPLE OF ASSERT STATEMENT AIDING LOGIKA (SMT)

    //Case 4 Deduction
    assert((qa1 < N1)-->:(!(qa1 >= N1)))
    //assert((qa1 >= N1 & qa1 < N2 & qa2 >= N1 & qa2 < N2) -->: (!(qa1 < N1 & qa2 < N2) & !(qa1 >= N1 & qa2 >= N2)))
/*
    Deduce(
      T |- ((qa1 >= N1 & qa1 < N2 & qa2 >= N1 & qa2 < N2) -->: (!(qa1 < N1 & qa2 < N2) & !(qa1 >= N1 & qa2 >= N2))) // What I need to Prove.
        Proof( // Proof for above.
        1 #> SubProof( // Sub proof 1:: GOAL: Case 4 -->: Neither Simplification
          2 #> Assume(((qa1 >= N1 & qa1 < N2) & qa2 >= N1) & qa2 < N2), //Case 4
          3 #> ((qa1 >= N1 & qa1 < N2) & qa2 >= N1) by AndE1(2),
          4 #> (qa2 < N2) by AndE2(2),
          5 #> (qa1 >= N1 & qa1 < N2) by AndE1(3),
          6 #> (qa2 >= N1) by AndE2(3),
          7 #> (qa1 >= N1) by AndE1(5),
          8 #> (qa1 < N2) by AndE2(5), // Now Case 4 has been broken into all of its components.
          9 #> SubProof( // Sub proof 2:: GOAL: First Simplification Negation
            10 #> Assume(qa1 < N1 & qa2 < N2), // Assume Simplified is true.
            11 #> (qa1 < N1) by AndE1(10),
            12 #> ((qa1 < N1)-->:(!(qa1 >= N1))) by Premise,
            13 #> (!(qa1 >= N1)) by implyE(qa1 < N1,!(qa1 >= N1)) and (12,11),
            14 #> F by negE(qa1 >= N1) //Conflicts with element of Case 4
          ), //End of Subproof 2
          15 #> (!(qa1 < N1 & qa2 < N2)) by NegI(9),
          16 #> SubProof( // Sub proof 3:: GOAL: Second Simplification Negation
            17 #> Assume(qa1 >= N1 & qa2 >= N2), // Assume Simplified is true.
            18 #> (qa2 >= N2) by AndE2(17),
            19 #> (!(qa2 < N2)) by Algebra * 18,
            20 #> F by negE(qa2 < N2)
          ), //End of Subproof 3
          21 #> (!(qa1 >= N1 & qa2 >= N2)) by NegI(16),
          22 #> ((!(qa1 < N1 & qa2 < N2)) & (!(qa1 >= N1 & qa2 >= N2))) by AndI(15, 21)
        ),
        23 #> ((qa1 >= N1 & qa1 < N2 & qa2 >= N1 & qa2 < N2) -->: ((!(qa1 < N1 & qa2 < N2)) & (!(qa1 >= N1 & qa2 >= N2)))) by ImplyI(1)
      )
    )

 */

    //CASE 1 -->: Simplified Open
    assert((qa1 < N1 & qa2 < N1) -->: (qa1 < N1 & qa2 < N2))
    //CASE 2 -->: Simplified Open
    assert((qa1 < N1 & qa2 < N2 & qa2 >= N1) -->: (qa1 < N1 & qa2 < N2))
    //CASE 5 -->: Simplified Closed
    assert((qa1 >= N1 & qa1 < N2 & qa2 >= N2) -->: (qa1 >= N1 & qa2 >= N2))
    //CASE 6 -->: Simplified Closed
    assert((qa1 >= N2 & qa2 >= N2) -->: (qa1 >= N1 & qa2 >= N2))
    //CASE 3 -->: Neither Simplification
    assert((qa1 < N1 & qa2 >= N2) -->: (!(qa1 < N1 & qa2 < N2) & !(qa1 >= N1 & qa2 >= N2)))
    //CASE 4 -->: Neither Simplification
    assert((qa1 >= N1 & qa1 < N2 & qa2 >= N1 & qa2 < N2) -->: (!(qa1 < N1 & qa2 < N2) & !(qa1 >= N1 & qa2 >= N2)))

    //Simplified Open
    if(qa1 < N1 & qa2 < N2){ //Case 1 and 2 [509]
      api.put_openPump0(T)
      api.put_openPump1(T)
      api.put_openPump2(T)
      api.put_openPump3(T)
    }
    else if (qa1 >= N1 & qa2 >= N2) { // Case 5 and 6 [509]
      api.put_openPump0(F)
      api.put_openPump1(F)
      api.put_openPump2(F)
      api.put_openPump3(F)
    }
    else{
      // Else, Case 3 and 4, Nothing happens.
    }
  }

  def activate(api: BoilerControl_i_Operational_Api): Unit = { }

  def deactivate(api: BoilerControl_i_Operational_Api): Unit = { }

  def finalise(api: BoilerControl_i_Operational_Api): Unit = { }

  def recover(api: BoilerControl_i_Operational_Api): Unit = { }
}
