// #Sireum
package tc.TempControlSoftwareSystem

import org.sireum._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@msig trait OperatorInterfacePeriodic_p_tcproc_operatorInterface_Injection_Provider {
  def pre_receiveInput(): Unit
}

object OperatorInterfacePeriodic_p_tcproc_operatorInterface_Injection_Service {

  var providers: MSZ[OperatorInterfacePeriodic_p_tcproc_operatorInterface_Injection_Provider] = MSZ()

  def register(provider: OperatorInterfacePeriodic_p_tcproc_operatorInterface_Injection_Provider): Unit = {
    providers = providers :+ provider
  }

  def pre_receiveInput(): Unit = {
    for (provider <- providers) {
      provider.pre_receiveInput()
    }
  }
}