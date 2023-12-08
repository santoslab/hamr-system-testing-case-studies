// #Sireum
package isolette.system_tests.rst

import org.sireum._
import isolette.Isolette_Data_Model._

object Regulate_Subsystem_Inputs_Container_GumboX {
  /** Compute Entrypoint Contract
    *
    * assumes lower_is_not_higher_than_upper
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    */
  @strictpure def compute_spec_lower_is_not_higher_than_upper_assume(api_lower_desired_tempWstatus: TempWstatus_impl,
                                                                     api_upper_desired_tempWstatus: TempWstatus_impl): B =
    api_lower_desired_tempWstatus.value <= api_upper_desired_tempWstatus.value

  /** CEP-T-Assm: Top-level assume contracts for manage_regulator_interface's compute entrypoint
    *
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    */
  @strictpure def compute_CEP_T_Assm(
                                      api_lower_desired_tempWstatus: TempWstatus_impl,
                                      api_upper_desired_tempWstatus: TempWstatus_impl): B =
    compute_spec_lower_is_not_higher_than_upper_assume(api_lower_desired_tempWstatus, api_upper_desired_tempWstatus)

  /** CEP-Pre: Compute Entrypoint Pre-Condition for manage_regulator_interface
    *
    * @param api_current_tempWstatus incoming data port
    * @param api_lower_desired_tempWstatus incoming data port
    * @param api_regulator_mode incoming data port
    * @param api_upper_desired_tempWstatus incoming data port
    */
  @strictpure def compute_CEP_Pre(lowerDesiredTempWStatus: TempWstatus_impl,
                                  upperDesiredTempWStatus: TempWstatus_impl,

                                  currentTempWStatus: TempWstatus_impl,

                                  mode: Regulator_Mode.Type,

                                  internalFailure: Failure_Flag_impl): B =
    compute_CEP_T_Assm(lowerDesiredTempWStatus, upperDesiredTempWStatus)


  def system_Pre_Container(container: Regulate_Subsystem_Inputs_Container): B = {
    return compute_CEP_Pre(
      container.lowerDesiredTempWStatus,
      container.upperDesiredTempWStatus,
      container.currentTempWStatus,
      container.mode,
      container.internalFailure)
  }
}
