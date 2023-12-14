// #Sireum

package bc.BoilerControl

import org.sireum._
import bc._
import bc.GumboXUtil.GumboXResult

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait OperatorDesk_i_bcproc_desk_GumboX_TestHarness extends OperatorDesk_i_bcproc_desk_TestApi {
  def verbose: B

  /** Contract-based test harness for the initialise entry point
    */
  def testInitialiseCB(
      ): GumboXResult.Type = {

    if (verbose) {
      println(st"""Pre State Values:
                  """.render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testInitialise()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_levelFailAck: Option[art.Empty] = get_levelFailAck()
    val api_levelRepair: Option[art.Empty] = get_levelRepair()
    val api_pumpControlFailAck0: Option[art.Empty] = get_pumpControlFailAck0()
    val api_pumpControlFailAck1: Option[art.Empty] = get_pumpControlFailAck1()
    val api_pumpControlFailAck2: Option[art.Empty] = get_pumpControlFailAck2()
    val api_pumpControlFailAck3: Option[art.Empty] = get_pumpControlFailAck3()
    val api_pumpControlRepair0: Option[art.Empty] = get_pumpControlRepair0()
    val api_pumpControlRepair1: Option[art.Empty] = get_pumpControlRepair1()
    val api_pumpControlRepair2: Option[art.Empty] = get_pumpControlRepair2()
    val api_pumpControlRepair3: Option[art.Empty] = get_pumpControlRepair3()
    val api_pumpFailAck0: Option[art.Empty] = get_pumpFailAck0()
    val api_pumpFailAck1: Option[art.Empty] = get_pumpFailAck1()
    val api_pumpFailAck2: Option[art.Empty] = get_pumpFailAck2()
    val api_pumpFailAck3: Option[art.Empty] = get_pumpFailAck3()
    val api_pumpRepair0: Option[art.Empty] = get_pumpRepair0()
    val api_pumpRepair1: Option[art.Empty] = get_pumpRepair1()
    val api_pumpRepair2: Option[art.Empty] = get_pumpRepair2()
    val api_pumpRepair3: Option[art.Empty] = get_pumpRepair3()
    val api_steamFailAck: Option[art.Empty] = get_steamFailAck()
    val api_steamRepair: Option[art.Empty] = get_steamRepair()
    val api_stop: Option[art.Empty] = get_stop()
    val isPumpBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken0
    val isPumpBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken1
    val isPumpBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken2
    val isPumpBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken3
    val isPumpControlBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken0
    val isPumpControlBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken1
    val isPumpControlBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken2
    val isPumpControlBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken3
    val isLevelBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isLevelBroken
    val isSteamBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isSteamBroken

    if (verbose) {
      println(st"""Post State Values:
                  |  api_levelFailAck = ${api_levelFailAck.string}
                  |  api_levelRepair = ${api_levelRepair.string}
                  |  api_pumpControlFailAck0 = ${api_pumpControlFailAck0.string}
                  |  api_pumpControlFailAck1 = ${api_pumpControlFailAck1.string}
                  |  api_pumpControlFailAck2 = ${api_pumpControlFailAck2.string}
                  |  api_pumpControlFailAck3 = ${api_pumpControlFailAck3.string}
                  |  api_pumpControlRepair0 = ${api_pumpControlRepair0.string}
                  |  api_pumpControlRepair1 = ${api_pumpControlRepair1.string}
                  |  api_pumpControlRepair2 = ${api_pumpControlRepair2.string}
                  |  api_pumpControlRepair3 = ${api_pumpControlRepair3.string}
                  |  api_pumpFailAck0 = ${api_pumpFailAck0.string}
                  |  api_pumpFailAck1 = ${api_pumpFailAck1.string}
                  |  api_pumpFailAck2 = ${api_pumpFailAck2.string}
                  |  api_pumpFailAck3 = ${api_pumpFailAck3.string}
                  |  api_pumpRepair0 = ${api_pumpRepair0.string}
                  |  api_pumpRepair1 = ${api_pumpRepair1.string}
                  |  api_pumpRepair2 = ${api_pumpRepair2.string}
                  |  api_pumpRepair3 = ${api_pumpRepair3.string}
                  |  api_steamFailAck = ${api_steamFailAck.string}
                  |  api_steamRepair = ${api_steamRepair.string}
                  |  api_stop = ${api_stop.string}
                  |  isPumpBroken0 = ${isPumpBroken0.string}
                  |  isPumpBroken1 = ${isPumpBroken1.string}
                  |  isPumpBroken2 = ${isPumpBroken2.string}
                  |  isPumpBroken3 = ${isPumpBroken3.string}
                  |  isPumpControlBroken0 = ${isPumpControlBroken0.string}
                  |  isPumpControlBroken1 = ${isPumpControlBroken1.string}
                  |  isPumpControlBroken2 = ${isPumpControlBroken2.string}
                  |  isPumpControlBroken3 = ${isPumpControlBroken3.string}
                  |  isLevelBroken = ${isLevelBroken.string}
                  |  isSteamBroken = ${isSteamBroken.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = bc.BoilerControl.OperatorDesk_i_bcproc_desk_GumboX.inititialize_IEP_Post(isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }

  def testComputeCBJ(json: String): GumboXResult.Type = {
    bc.JSON.toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(json) match {
      case Either.Left(o) => return testComputeCBV(o)
      case Either.Right(msg) => halt(msg.string)
    }
  }

  def testComputeCBV(o: OperatorDesk_i_bcproc_desk_PreState_Container): GumboXResult.Type = {
    return testComputeCB(o.api_levelFail, o.api_levelRepairAck, o.api_pumpControlFail0, o.api_pumpControlFail1, o.api_pumpControlFail2, o.api_pumpControlFail3, o.api_pumpControlRepairAck0, o.api_pumpControlRepairAck1, o.api_pumpControlRepairAck2, o.api_pumpControlRepairAck3, o.api_pumpFail0, o.api_pumpFail1, o.api_pumpFail2, o.api_pumpFail3, o.api_pumpRepairAck0, o.api_pumpRepairAck1, o.api_pumpRepairAck2, o.api_pumpRepairAck3, o.api_steamFail, o.api_steamRepairAck, o.api_opMode)
  }

  /** Contract-based test harness for the compute entry point
    * @param api_levelFail incoming event port
    * @param api_levelRepairAck incoming event port
    * @param api_pumpControlFail0 incoming event port
    * @param api_pumpControlFail1 incoming event port
    * @param api_pumpControlFail2 incoming event port
    * @param api_pumpControlFail3 incoming event port
    * @param api_pumpControlRepairAck0 incoming event port
    * @param api_pumpControlRepairAck1 incoming event port
    * @param api_pumpControlRepairAck2 incoming event port
    * @param api_pumpControlRepairAck3 incoming event port
    * @param api_pumpFail0 incoming event port
    * @param api_pumpFail1 incoming event port
    * @param api_pumpFail2 incoming event port
    * @param api_pumpFail3 incoming event port
    * @param api_pumpRepairAck0 incoming event port
    * @param api_pumpRepairAck1 incoming event port
    * @param api_pumpRepairAck2 incoming event port
    * @param api_pumpRepairAck3 incoming event port
    * @param api_steamFail incoming event port
    * @param api_steamRepairAck incoming event port
    * @param api_opMode incoming event data port
    */
  def testComputeCB(
      api_levelFail: Option[art.Empty],
      api_levelRepairAck: Option[art.Empty],
      api_pumpControlFail0: Option[art.Empty],
      api_pumpControlFail1: Option[art.Empty],
      api_pumpControlFail2: Option[art.Empty],
      api_pumpControlFail3: Option[art.Empty],
      api_pumpControlRepairAck0: Option[art.Empty],
      api_pumpControlRepairAck1: Option[art.Empty],
      api_pumpControlRepairAck2: Option[art.Empty],
      api_pumpControlRepairAck3: Option[art.Empty],
      api_pumpFail0: Option[art.Empty],
      api_pumpFail1: Option[art.Empty],
      api_pumpFail2: Option[art.Empty],
      api_pumpFail3: Option[art.Empty],
      api_pumpRepairAck0: Option[art.Empty],
      api_pumpRepairAck1: Option[art.Empty],
      api_pumpRepairAck2: Option[art.Empty],
      api_pumpRepairAck3: Option[art.Empty],
      api_steamFail: Option[art.Empty],
      api_steamRepairAck: Option[art.Empty],
      api_opMode: Option[BoilerControl.OpMode.Type]): GumboXResult.Type = {

    // [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    val In_isPumpBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken0
    val In_isPumpBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken1
    val In_isPumpBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken2
    val In_isPumpBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken3
    val In_isPumpControlBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken0
    val In_isPumpControlBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken1
    val In_isPumpControlBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken2
    val In_isPumpControlBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken3
    val In_isLevelBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isLevelBroken
    val In_isSteamBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isSteamBroken

    // [CheckPre]: check/filter based on pre-condition.
    //   desk's compute entry point does not have top level assume clauses

    // [PutInPorts]: put values on the input ports
    if (api_levelFail.nonEmpty) {
      put_levelFail()
    }
    if (api_levelRepairAck.nonEmpty) {
      put_levelRepairAck()
    }
    if (api_pumpControlFail0.nonEmpty) {
      put_pumpControlFail0()
    }
    if (api_pumpControlFail1.nonEmpty) {
      put_pumpControlFail1()
    }
    if (api_pumpControlFail2.nonEmpty) {
      put_pumpControlFail2()
    }
    if (api_pumpControlFail3.nonEmpty) {
      put_pumpControlFail3()
    }
    if (api_pumpControlRepairAck0.nonEmpty) {
      put_pumpControlRepairAck0()
    }
    if (api_pumpControlRepairAck1.nonEmpty) {
      put_pumpControlRepairAck1()
    }
    if (api_pumpControlRepairAck2.nonEmpty) {
      put_pumpControlRepairAck2()
    }
    if (api_pumpControlRepairAck3.nonEmpty) {
      put_pumpControlRepairAck3()
    }
    if (api_pumpFail0.nonEmpty) {
      put_pumpFail0()
    }
    if (api_pumpFail1.nonEmpty) {
      put_pumpFail1()
    }
    if (api_pumpFail2.nonEmpty) {
      put_pumpFail2()
    }
    if (api_pumpFail3.nonEmpty) {
      put_pumpFail3()
    }
    if (api_pumpRepairAck0.nonEmpty) {
      put_pumpRepairAck0()
    }
    if (api_pumpRepairAck1.nonEmpty) {
      put_pumpRepairAck1()
    }
    if (api_pumpRepairAck2.nonEmpty) {
      put_pumpRepairAck2()
    }
    if (api_pumpRepairAck3.nonEmpty) {
      put_pumpRepairAck3()
    }
    if (api_steamFail.nonEmpty) {
      put_steamFail()
    }
    if (api_steamRepairAck.nonEmpty) {
      put_steamRepairAck()
    }
    if (api_opMode.nonEmpty) {
      put_opMode(api_opMode.get)
    }

    if (verbose) {
      println(st"""Pre State Values:
                  |  In_isLevelBroken = ${In_isLevelBroken.string}
                  |  In_isPumpBroken0 = ${In_isPumpBroken0.string}
                  |  In_isPumpBroken1 = ${In_isPumpBroken1.string}
                  |  In_isPumpBroken2 = ${In_isPumpBroken2.string}
                  |  In_isPumpBroken3 = ${In_isPumpBroken3.string}
                  |  In_isPumpControlBroken0 = ${In_isPumpControlBroken0.string}
                  |  In_isPumpControlBroken1 = ${In_isPumpControlBroken1.string}
                  |  In_isPumpControlBroken2 = ${In_isPumpControlBroken2.string}
                  |  In_isPumpControlBroken3 = ${In_isPumpControlBroken3.string}
                  |  In_isSteamBroken = ${In_isSteamBroken.string}
                  |  api_levelFail = ${api_levelFail.string}
                  |  api_levelRepairAck = ${api_levelRepairAck.string}
                  |  api_pumpControlFail0 = ${api_pumpControlFail0.string}
                  |  api_pumpControlFail1 = ${api_pumpControlFail1.string}
                  |  api_pumpControlFail2 = ${api_pumpControlFail2.string}
                  |  api_pumpControlFail3 = ${api_pumpControlFail3.string}
                  |  api_pumpControlRepairAck0 = ${api_pumpControlRepairAck0.string}
                  |  api_pumpControlRepairAck1 = ${api_pumpControlRepairAck1.string}
                  |  api_pumpControlRepairAck2 = ${api_pumpControlRepairAck2.string}
                  |  api_pumpControlRepairAck3 = ${api_pumpControlRepairAck3.string}
                  |  api_pumpFail0 = ${api_pumpFail0.string}
                  |  api_pumpFail1 = ${api_pumpFail1.string}
                  |  api_pumpFail2 = ${api_pumpFail2.string}
                  |  api_pumpFail3 = ${api_pumpFail3.string}
                  |  api_pumpRepairAck0 = ${api_pumpRepairAck0.string}
                  |  api_pumpRepairAck1 = ${api_pumpRepairAck1.string}
                  |  api_pumpRepairAck2 = ${api_pumpRepairAck2.string}
                  |  api_pumpRepairAck3 = ${api_pumpRepairAck3.string}
                  |  api_steamFail = ${api_steamFail.string}
                  |  api_steamRepairAck = ${api_steamRepairAck.string}
                  |  api_opMode = ${api_opMode.string}""".render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_levelFailAck: Option[art.Empty] = get_levelFailAck()
    val api_levelRepair: Option[art.Empty] = get_levelRepair()
    val api_pumpControlFailAck0: Option[art.Empty] = get_pumpControlFailAck0()
    val api_pumpControlFailAck1: Option[art.Empty] = get_pumpControlFailAck1()
    val api_pumpControlFailAck2: Option[art.Empty] = get_pumpControlFailAck2()
    val api_pumpControlFailAck3: Option[art.Empty] = get_pumpControlFailAck3()
    val api_pumpControlRepair0: Option[art.Empty] = get_pumpControlRepair0()
    val api_pumpControlRepair1: Option[art.Empty] = get_pumpControlRepair1()
    val api_pumpControlRepair2: Option[art.Empty] = get_pumpControlRepair2()
    val api_pumpControlRepair3: Option[art.Empty] = get_pumpControlRepair3()
    val api_pumpFailAck0: Option[art.Empty] = get_pumpFailAck0()
    val api_pumpFailAck1: Option[art.Empty] = get_pumpFailAck1()
    val api_pumpFailAck2: Option[art.Empty] = get_pumpFailAck2()
    val api_pumpFailAck3: Option[art.Empty] = get_pumpFailAck3()
    val api_pumpRepair0: Option[art.Empty] = get_pumpRepair0()
    val api_pumpRepair1: Option[art.Empty] = get_pumpRepair1()
    val api_pumpRepair2: Option[art.Empty] = get_pumpRepair2()
    val api_pumpRepair3: Option[art.Empty] = get_pumpRepair3()
    val api_steamFailAck: Option[art.Empty] = get_steamFailAck()
    val api_steamRepair: Option[art.Empty] = get_steamRepair()
    val api_stop: Option[art.Empty] = get_stop()
    val isPumpBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken0
    val isPumpBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken1
    val isPumpBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken2
    val isPumpBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken3
    val isPumpControlBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken0
    val isPumpControlBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken1
    val isPumpControlBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken2
    val isPumpControlBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken3
    val isLevelBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isLevelBroken
    val isSteamBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isSteamBroken

    if (verbose) {
      println(st"""Post State Values:
                  |  api_levelFailAck = ${api_levelFailAck.string}
                  |  api_levelRepair = ${api_levelRepair.string}
                  |  api_pumpControlFailAck0 = ${api_pumpControlFailAck0.string}
                  |  api_pumpControlFailAck1 = ${api_pumpControlFailAck1.string}
                  |  api_pumpControlFailAck2 = ${api_pumpControlFailAck2.string}
                  |  api_pumpControlFailAck3 = ${api_pumpControlFailAck3.string}
                  |  api_pumpControlRepair0 = ${api_pumpControlRepair0.string}
                  |  api_pumpControlRepair1 = ${api_pumpControlRepair1.string}
                  |  api_pumpControlRepair2 = ${api_pumpControlRepair2.string}
                  |  api_pumpControlRepair3 = ${api_pumpControlRepair3.string}
                  |  api_pumpFailAck0 = ${api_pumpFailAck0.string}
                  |  api_pumpFailAck1 = ${api_pumpFailAck1.string}
                  |  api_pumpFailAck2 = ${api_pumpFailAck2.string}
                  |  api_pumpFailAck3 = ${api_pumpFailAck3.string}
                  |  api_pumpRepair0 = ${api_pumpRepair0.string}
                  |  api_pumpRepair1 = ${api_pumpRepair1.string}
                  |  api_pumpRepair2 = ${api_pumpRepair2.string}
                  |  api_pumpRepair3 = ${api_pumpRepair3.string}
                  |  api_steamFailAck = ${api_steamFailAck.string}
                  |  api_steamRepair = ${api_steamRepair.string}
                  |  api_stop = ${api_stop.string}
                  |  isPumpBroken0 = ${isPumpBroken0.string}
                  |  isPumpBroken1 = ${isPumpBroken1.string}
                  |  isPumpBroken2 = ${isPumpBroken2.string}
                  |  isPumpBroken3 = ${isPumpBroken3.string}
                  |  isPumpControlBroken0 = ${isPumpControlBroken0.string}
                  |  isPumpControlBroken1 = ${isPumpControlBroken1.string}
                  |  isPumpControlBroken2 = ${isPumpControlBroken2.string}
                  |  isPumpControlBroken3 = ${isPumpControlBroken3.string}
                  |  isLevelBroken = ${isLevelBroken.string}
                  |  isSteamBroken = ${isSteamBroken.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = bc.BoilerControl.OperatorDesk_i_bcproc_desk_GumboX.compute_CEP_Post(In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFail, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_steamFail, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }

  def testComputeCBwLJ(json: String): GumboXResult.Type = {
    bc.JSON.toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(json) match {
      case Either.Left(o) => return testComputeCBwLV(o)
      case Either.Right(msg) => halt(msg.string)
    }
  }

  def testComputeCBwLV(o: OperatorDesk_i_bcproc_desk_PreState_Container_PS): GumboXResult.Type = {
    return testComputeCBwL(o.In_isLevelBroken, o.In_isPumpBroken0, o.In_isPumpBroken1, o.In_isPumpBroken2, o.In_isPumpBroken3, o.In_isPumpControlBroken0, o.In_isPumpControlBroken1, o.In_isPumpControlBroken2, o.In_isPumpControlBroken3, o.In_isSteamBroken, o.api_levelFail, o.api_levelRepairAck, o.api_pumpControlFail0, o.api_pumpControlFail1, o.api_pumpControlFail2, o.api_pumpControlFail3, o.api_pumpControlRepairAck0, o.api_pumpControlRepairAck1, o.api_pumpControlRepairAck2, o.api_pumpControlRepairAck3, o.api_pumpFail0, o.api_pumpFail1, o.api_pumpFail2, o.api_pumpFail3, o.api_pumpRepairAck0, o.api_pumpRepairAck1, o.api_pumpRepairAck2, o.api_pumpRepairAck3, o.api_steamFail, o.api_steamRepairAck, o.api_opMode)
  }

  /** Contract-based test harness for the compute entry point
    * @param In_isLevelBroken pre-state state variable
    * @param In_isPumpBroken0 pre-state state variable
    * @param In_isPumpBroken1 pre-state state variable
    * @param In_isPumpBroken2 pre-state state variable
    * @param In_isPumpBroken3 pre-state state variable
    * @param In_isPumpControlBroken0 pre-state state variable
    * @param In_isPumpControlBroken1 pre-state state variable
    * @param In_isPumpControlBroken2 pre-state state variable
    * @param In_isPumpControlBroken3 pre-state state variable
    * @param In_isSteamBroken pre-state state variable
    * @param api_levelFail incoming event port
    * @param api_levelRepairAck incoming event port
    * @param api_pumpControlFail0 incoming event port
    * @param api_pumpControlFail1 incoming event port
    * @param api_pumpControlFail2 incoming event port
    * @param api_pumpControlFail3 incoming event port
    * @param api_pumpControlRepairAck0 incoming event port
    * @param api_pumpControlRepairAck1 incoming event port
    * @param api_pumpControlRepairAck2 incoming event port
    * @param api_pumpControlRepairAck3 incoming event port
    * @param api_pumpFail0 incoming event port
    * @param api_pumpFail1 incoming event port
    * @param api_pumpFail2 incoming event port
    * @param api_pumpFail3 incoming event port
    * @param api_pumpRepairAck0 incoming event port
    * @param api_pumpRepairAck1 incoming event port
    * @param api_pumpRepairAck2 incoming event port
    * @param api_pumpRepairAck3 incoming event port
    * @param api_steamFail incoming event port
    * @param api_steamRepairAck incoming event port
    * @param api_opMode incoming event data port
    */
  def testComputeCBwL(
      In_isLevelBroken: Base_Types.Boolean,
      In_isPumpBroken0: Base_Types.Boolean,
      In_isPumpBroken1: Base_Types.Boolean,
      In_isPumpBroken2: Base_Types.Boolean,
      In_isPumpBroken3: Base_Types.Boolean,
      In_isPumpControlBroken0: Base_Types.Boolean,
      In_isPumpControlBroken1: Base_Types.Boolean,
      In_isPumpControlBroken2: Base_Types.Boolean,
      In_isPumpControlBroken3: Base_Types.Boolean,
      In_isSteamBroken: Base_Types.Boolean,
      api_levelFail: Option[art.Empty],
      api_levelRepairAck: Option[art.Empty],
      api_pumpControlFail0: Option[art.Empty],
      api_pumpControlFail1: Option[art.Empty],
      api_pumpControlFail2: Option[art.Empty],
      api_pumpControlFail3: Option[art.Empty],
      api_pumpControlRepairAck0: Option[art.Empty],
      api_pumpControlRepairAck1: Option[art.Empty],
      api_pumpControlRepairAck2: Option[art.Empty],
      api_pumpControlRepairAck3: Option[art.Empty],
      api_pumpFail0: Option[art.Empty],
      api_pumpFail1: Option[art.Empty],
      api_pumpFail2: Option[art.Empty],
      api_pumpFail3: Option[art.Empty],
      api_pumpRepairAck0: Option[art.Empty],
      api_pumpRepairAck1: Option[art.Empty],
      api_pumpRepairAck2: Option[art.Empty],
      api_pumpRepairAck3: Option[art.Empty],
      api_steamFail: Option[art.Empty],
      api_steamRepairAck: Option[art.Empty],
      api_opMode: Option[BoilerControl.OpMode.Type]): GumboXResult.Type = {

    // [CheckPre]: check/filter based on pre-condition.
    //   desk's compute entry point does not have top level assume clauses

    // [PutInPorts]: put values on the input ports
    if (api_levelFail.nonEmpty) {
      put_levelFail()
    }
    if (api_levelRepairAck.nonEmpty) {
      put_levelRepairAck()
    }
    if (api_pumpControlFail0.nonEmpty) {
      put_pumpControlFail0()
    }
    if (api_pumpControlFail1.nonEmpty) {
      put_pumpControlFail1()
    }
    if (api_pumpControlFail2.nonEmpty) {
      put_pumpControlFail2()
    }
    if (api_pumpControlFail3.nonEmpty) {
      put_pumpControlFail3()
    }
    if (api_pumpControlRepairAck0.nonEmpty) {
      put_pumpControlRepairAck0()
    }
    if (api_pumpControlRepairAck1.nonEmpty) {
      put_pumpControlRepairAck1()
    }
    if (api_pumpControlRepairAck2.nonEmpty) {
      put_pumpControlRepairAck2()
    }
    if (api_pumpControlRepairAck3.nonEmpty) {
      put_pumpControlRepairAck3()
    }
    if (api_pumpFail0.nonEmpty) {
      put_pumpFail0()
    }
    if (api_pumpFail1.nonEmpty) {
      put_pumpFail1()
    }
    if (api_pumpFail2.nonEmpty) {
      put_pumpFail2()
    }
    if (api_pumpFail3.nonEmpty) {
      put_pumpFail3()
    }
    if (api_pumpRepairAck0.nonEmpty) {
      put_pumpRepairAck0()
    }
    if (api_pumpRepairAck1.nonEmpty) {
      put_pumpRepairAck1()
    }
    if (api_pumpRepairAck2.nonEmpty) {
      put_pumpRepairAck2()
    }
    if (api_pumpRepairAck3.nonEmpty) {
      put_pumpRepairAck3()
    }
    if (api_steamFail.nonEmpty) {
      put_steamFail()
    }
    if (api_steamRepairAck.nonEmpty) {
      put_steamRepairAck()
    }
    if (api_opMode.nonEmpty) {
      put_opMode(api_opMode.get)
    }

    // [SetInStateVars]: set the pre-state values of state variables
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken0 = In_isPumpBroken0
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken1 = In_isPumpBroken1
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken2 = In_isPumpBroken2
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken3 = In_isPumpBroken3
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken0 = In_isPumpControlBroken0
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken1 = In_isPumpControlBroken1
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken2 = In_isPumpControlBroken2
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken3 = In_isPumpControlBroken3
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isLevelBroken = In_isLevelBroken
    bc.BoilerControl.OperatorDesk_i_bcproc_desk.isSteamBroken = In_isSteamBroken

    if (verbose) {
      println(st"""Pre State Values:
                  |  In_isLevelBroken = ${In_isLevelBroken.string}
                  |  In_isPumpBroken0 = ${In_isPumpBroken0.string}
                  |  In_isPumpBroken1 = ${In_isPumpBroken1.string}
                  |  In_isPumpBroken2 = ${In_isPumpBroken2.string}
                  |  In_isPumpBroken3 = ${In_isPumpBroken3.string}
                  |  In_isPumpControlBroken0 = ${In_isPumpControlBroken0.string}
                  |  In_isPumpControlBroken1 = ${In_isPumpControlBroken1.string}
                  |  In_isPumpControlBroken2 = ${In_isPumpControlBroken2.string}
                  |  In_isPumpControlBroken3 = ${In_isPumpControlBroken3.string}
                  |  In_isSteamBroken = ${In_isSteamBroken.string}
                  |  api_levelFail = ${api_levelFail.string}
                  |  api_levelRepairAck = ${api_levelRepairAck.string}
                  |  api_pumpControlFail0 = ${api_pumpControlFail0.string}
                  |  api_pumpControlFail1 = ${api_pumpControlFail1.string}
                  |  api_pumpControlFail2 = ${api_pumpControlFail2.string}
                  |  api_pumpControlFail3 = ${api_pumpControlFail3.string}
                  |  api_pumpControlRepairAck0 = ${api_pumpControlRepairAck0.string}
                  |  api_pumpControlRepairAck1 = ${api_pumpControlRepairAck1.string}
                  |  api_pumpControlRepairAck2 = ${api_pumpControlRepairAck2.string}
                  |  api_pumpControlRepairAck3 = ${api_pumpControlRepairAck3.string}
                  |  api_pumpFail0 = ${api_pumpFail0.string}
                  |  api_pumpFail1 = ${api_pumpFail1.string}
                  |  api_pumpFail2 = ${api_pumpFail2.string}
                  |  api_pumpFail3 = ${api_pumpFail3.string}
                  |  api_pumpRepairAck0 = ${api_pumpRepairAck0.string}
                  |  api_pumpRepairAck1 = ${api_pumpRepairAck1.string}
                  |  api_pumpRepairAck2 = ${api_pumpRepairAck2.string}
                  |  api_pumpRepairAck3 = ${api_pumpRepairAck3.string}
                  |  api_steamFail = ${api_steamFail.string}
                  |  api_steamRepairAck = ${api_steamRepairAck.string}
                  |  api_opMode = ${api_opMode.string}""".render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_levelFailAck: Option[art.Empty] = get_levelFailAck()
    val api_levelRepair: Option[art.Empty] = get_levelRepair()
    val api_pumpControlFailAck0: Option[art.Empty] = get_pumpControlFailAck0()
    val api_pumpControlFailAck1: Option[art.Empty] = get_pumpControlFailAck1()
    val api_pumpControlFailAck2: Option[art.Empty] = get_pumpControlFailAck2()
    val api_pumpControlFailAck3: Option[art.Empty] = get_pumpControlFailAck3()
    val api_pumpControlRepair0: Option[art.Empty] = get_pumpControlRepair0()
    val api_pumpControlRepair1: Option[art.Empty] = get_pumpControlRepair1()
    val api_pumpControlRepair2: Option[art.Empty] = get_pumpControlRepair2()
    val api_pumpControlRepair3: Option[art.Empty] = get_pumpControlRepair3()
    val api_pumpFailAck0: Option[art.Empty] = get_pumpFailAck0()
    val api_pumpFailAck1: Option[art.Empty] = get_pumpFailAck1()
    val api_pumpFailAck2: Option[art.Empty] = get_pumpFailAck2()
    val api_pumpFailAck3: Option[art.Empty] = get_pumpFailAck3()
    val api_pumpRepair0: Option[art.Empty] = get_pumpRepair0()
    val api_pumpRepair1: Option[art.Empty] = get_pumpRepair1()
    val api_pumpRepair2: Option[art.Empty] = get_pumpRepair2()
    val api_pumpRepair3: Option[art.Empty] = get_pumpRepair3()
    val api_steamFailAck: Option[art.Empty] = get_steamFailAck()
    val api_steamRepair: Option[art.Empty] = get_steamRepair()
    val api_stop: Option[art.Empty] = get_stop()
    val isPumpBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken0
    val isPumpBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken1
    val isPumpBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken2
    val isPumpBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpBroken3
    val isPumpControlBroken0: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken0
    val isPumpControlBroken1: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken1
    val isPumpControlBroken2: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken2
    val isPumpControlBroken3: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isPumpControlBroken3
    val isLevelBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isLevelBroken
    val isSteamBroken: Base_Types.Boolean = bc.BoilerControl.OperatorDesk_i_bcproc_desk.isSteamBroken

    if (verbose) {
      println(st"""Post State Values:
                  |  api_levelFailAck = ${api_levelFailAck.string}
                  |  api_levelRepair = ${api_levelRepair.string}
                  |  api_pumpControlFailAck0 = ${api_pumpControlFailAck0.string}
                  |  api_pumpControlFailAck1 = ${api_pumpControlFailAck1.string}
                  |  api_pumpControlFailAck2 = ${api_pumpControlFailAck2.string}
                  |  api_pumpControlFailAck3 = ${api_pumpControlFailAck3.string}
                  |  api_pumpControlRepair0 = ${api_pumpControlRepair0.string}
                  |  api_pumpControlRepair1 = ${api_pumpControlRepair1.string}
                  |  api_pumpControlRepair2 = ${api_pumpControlRepair2.string}
                  |  api_pumpControlRepair3 = ${api_pumpControlRepair3.string}
                  |  api_pumpFailAck0 = ${api_pumpFailAck0.string}
                  |  api_pumpFailAck1 = ${api_pumpFailAck1.string}
                  |  api_pumpFailAck2 = ${api_pumpFailAck2.string}
                  |  api_pumpFailAck3 = ${api_pumpFailAck3.string}
                  |  api_pumpRepair0 = ${api_pumpRepair0.string}
                  |  api_pumpRepair1 = ${api_pumpRepair1.string}
                  |  api_pumpRepair2 = ${api_pumpRepair2.string}
                  |  api_pumpRepair3 = ${api_pumpRepair3.string}
                  |  api_steamFailAck = ${api_steamFailAck.string}
                  |  api_steamRepair = ${api_steamRepair.string}
                  |  api_stop = ${api_stop.string}
                  |  isPumpBroken0 = ${isPumpBroken0.string}
                  |  isPumpBroken1 = ${isPumpBroken1.string}
                  |  isPumpBroken2 = ${isPumpBroken2.string}
                  |  isPumpBroken3 = ${isPumpBroken3.string}
                  |  isPumpControlBroken0 = ${isPumpControlBroken0.string}
                  |  isPumpControlBroken1 = ${isPumpControlBroken1.string}
                  |  isPumpControlBroken2 = ${isPumpControlBroken2.string}
                  |  isPumpControlBroken3 = ${isPumpControlBroken3.string}
                  |  isLevelBroken = ${isLevelBroken.string}
                  |  isSteamBroken = ${isSteamBroken.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = bc.BoilerControl.OperatorDesk_i_bcproc_desk_GumboX.compute_CEP_Post(In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFail, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_steamFail, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }
}