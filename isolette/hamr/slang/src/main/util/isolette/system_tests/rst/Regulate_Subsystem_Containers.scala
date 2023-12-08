// #Sireum

package isolette.system_tests.rst

import org.sireum._
import isolette.Isolette_Data_Model._

@datatype class Regulate_Subsystem_Inputs_Container(val lowerDesiredTempWStatus: TempWstatus_impl,
                                                    val upperDesiredTempWStatus: TempWstatus_impl,

                                                    val currentTempWStatus: TempWstatus_impl,

                                                    val mode: Regulator_Mode.Type,

                                                    val internalFailure: Failure_Flag_impl)

@datatype class Regulate_Subsystem_Outputs_Container(val heat_control: On_Off.Type,
                                                     val display_temperature: Temp_impl,
                                                     val regulator_status: Status.Type,
                                                     val mode: Regulator_Mode.Type)
