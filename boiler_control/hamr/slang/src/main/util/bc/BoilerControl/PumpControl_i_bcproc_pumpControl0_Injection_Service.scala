// #Sireum
package bc.BoilerControl

import org.sireum._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@msig trait PumpControl_i_bcproc_pumpControl0_Injection_Provider {
  def pre_receiveInput(): Unit
}

object PumpControl_i_bcproc_pumpControl0_Injection_Service {

  var providers: MSZ[PumpControl_i_bcproc_pumpControl0_Injection_Provider] = MSZ()

  def register(provider: PumpControl_i_bcproc_pumpControl0_Injection_Provider): Unit = {
    providers = providers :+ provider
  }

  def pre_receiveInput(): Unit = {
    for (provider <- providers) {
      provider.pre_receiveInput()
    }
  }
}