// #Sireum

package isolette.system_tests.monitor1

import org.sireum._
import isolette.Isolette_Data_Model._

@datatype class Monitor_Subsystem_Inputs_Container(val lowerAlarmTempWStatus: TempWstatus_impl,
                                                   val upperAlarmTempWStatus: TempWstatus_impl,

                                                   val currentTempWStatus: TempWstatus_impl,

                                                   val monitor_mode: Monitor_Mode.Type,

                                                   val internalFailure: Failure_Flag_impl)

@datatype class Monitor_Subsystem_Outputs_Container(val monitor_status: Status.Type,

                                                    val alarm_control: On_Off.Type,

                                                    val monitor_mode: Monitor_Mode.Type)
