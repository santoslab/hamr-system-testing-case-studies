// #Sireum

package bc.BoilerControl

import org.sireum._
import art.Art
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait PumpControl_i_bcproc_pumpControl2_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2)
  }

  /** helper function to set the values of all input ports.
   * @param opMode payloads for event data port opMode.
   *   ART currently supports single element event data queues so
   *   only the last element of opMode will be used
   * @param openPump payloads for event data port openPump.
   *   ART currently supports single element event data queues so
   *   only the last element of openPump will be used
   * @param programReady the number of events to place in the programReady event port queue.
   *   ART currently supports single element event queues so at most
   *   one event will be placed in the queue.
   */
  def put_concrete_inputs(opMode : ISZ[BoilerControl.OpMode.Type],
                          openPump : ISZ[Base_Types.Boolean],
                          programReady : Z): Unit = {
    for(v <- opMode){
      put_opMode(v)
    }
    for(v <- openPump){
      put_openPump(v)
    }
    for(i <- 0 until programReady) {
      put_programReady()
    }
  }


  /** helper function to check PumpControl_i_bcproc_pumpControl2's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param pumpOpen method that will be called with the payloads to be sent
   *        on the outgoing event data port 'pumpOpen'.
   * @param pumpFlow method that will be called with the payloads to be sent
   *        on the outgoing event data port 'pumpFlow'.
   * @param ready method that will be called with the number of events to be sent
   *        on the outgoing event port 'ready'.
   */
  def check_concrete_output(pumpOpen: ISZ[Base_Types.Boolean] => B,
                            pumpFlow: ISZ[Base_Types.Boolean] => B,
                            ready: Z => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    var pumpOpenValue: ISZ[Base_Types.Boolean] = ISZ()
    // TODO: event data port getter should return all of the events/payloads
    //       received on event data ports when queue sizes > 1 support is added
    //       to ART
    if(get_pumpOpen().nonEmpty) { pumpOpenValue = pumpOpenValue :+ get_pumpOpen().get }
    if(!pumpOpen(pumpOpenValue)) {
      testFailures = testFailures :+ st"'pumpOpen' did not match expected: received ${pumpOpenValue.size} events with the following payloads ${pumpOpenValue}"
    }
    var pumpFlowValue: ISZ[Base_Types.Boolean] = ISZ()
    // TODO: event data port getter should return all of the events/payloads
    //       received on event data ports when queue sizes > 1 support is added
    //       to ART
    if(get_pumpFlow().nonEmpty) { pumpFlowValue = pumpFlowValue :+ get_pumpFlow().get }
    if(!pumpFlow(pumpFlowValue)) {
      testFailures = testFailures :+ st"'pumpFlow' did not match expected: received ${pumpFlowValue.size} events with the following payloads ${pumpFlowValue}"
    }
    // TODO: event port getter should return the number of events in
    //       the output queue when queue sizes > 1 support is added to ART
    val readyValue: Z = if(get_ready().nonEmpty) z"1" else z"0"
    if(!ready(readyValue)) {
      testFailures = testFailures :+ st"'ready' did not match expected: ${readyValue} events were in the outgoing event queue"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // setter for in EventDataPort
  def put_opMode(value : BoilerControl.OpMode.Type): Unit = {
    Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2.operational_api.opMode_Id, BoilerControl.OpMode_Payload(value))
  }

  // setter for in EventDataPort
  def put_openPump(value : Base_Types.Boolean): Unit = {
    Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2.operational_api.openPump_Id, Base_Types.Boolean_Payload(value))
  }

  // setter for in EventPort
  def put_programReady(): Unit = {
    Art.insertInInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2.operational_api.programReady_Id, art.Empty())
  }

  // getter for out EventDataPort
  def get_pumpOpen(): Option[Base_Types.Boolean] = {
    val value: Option[Base_Types.Boolean] = get_pumpOpen_payload() match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port pumpOpen.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // payload getter for out EventDataPort
  def get_pumpOpen_payload(): Option[Base_Types.Boolean_Payload] = {
    return Art.observeOutInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2.initialization_api.pumpOpen_Id).asInstanceOf[Option[Base_Types.Boolean_Payload]]
  }

  // getter for out EventDataPort
  def get_pumpFlow(): Option[Base_Types.Boolean] = {
    val value: Option[Base_Types.Boolean] = get_pumpFlow_payload() match {
      case Some(Base_Types.Boolean_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port pumpFlow.  Expecting 'Base_Types.Boolean_Payload' but received ${v}")
      case _ => None[Base_Types.Boolean]()
    }
    return value
  }

  // payload getter for out EventDataPort
  def get_pumpFlow_payload(): Option[Base_Types.Boolean_Payload] = {
    return Art.observeOutInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2.initialization_api.pumpFlow_Id).asInstanceOf[Option[Base_Types.Boolean_Payload]]
  }

  // getter for out EventPort
  def get_ready(): Option[art.Empty] = {
    val value: Option[art.Empty] = get_ready_payload() match {
      case Some(art.Empty()) => Some(art.Empty())
      case Some(v) => halt(s"Unexpected payload on port ready.  Expecting 'art.Empty' but received ${v}")
      case _ => None[art.Empty]()
    }
    return value
  }

  // payload getter for out EventPort
  def get_ready_payload(): Option[art.Empty] = {
    return Art.observeOutInfrastructurePort(Arch.BoilerControlSystem_i_Instance_bcproc_pumpControl2.initialization_api.ready_Id).asInstanceOf[Option[art.Empty]]
  }

}
