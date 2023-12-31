// #Sireum
package bc.BoilerControl

import org.sireum._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@msig trait SteamMeter_i_bcproc_steamMeter_Injection_Provider {
  def pre_receiveInput(): Unit
}

object SteamMeter_i_bcproc_steamMeter_Injection_Service {

  var providers: MSZ[SteamMeter_i_bcproc_steamMeter_Injection_Provider] = MSZ()

  def register(provider: SteamMeter_i_bcproc_steamMeter_Injection_Provider): Unit = {
    providers = providers :+ provider
  }

  def pre_receiveInput(): Unit = {
    for (provider <- providers) {
      provider.pre_receiveInput()
    }
  }
}