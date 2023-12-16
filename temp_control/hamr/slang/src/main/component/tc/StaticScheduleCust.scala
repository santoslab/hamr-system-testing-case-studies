// #Sireum
package tc

import org.sireum._
import art.Art
import art.scheduling.static.Schedule
import art.scheduling.static.Schedule._


object StaticSchedulerCust {
  val maxExecutionTime: Z = 20

  val staticSchedule: DScheduleSpec = DScheduleSpec(0, 0, DSchedule(ISZ(
    Schedule.Slot(0, maxExecutionTime),
    Schedule.Slot(1, maxExecutionTime),
    Schedule.Slot(2, maxExecutionTime),
    Schedule.Slot(3, maxExecutionTime)
  )))

  val domainToBridgeIdMap: ISZ[Art.BridgeId] = ISZ(
    /* domain 0 */ Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.id,
    /* domain 1 */ Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempControl.id,
    /* domain 2 */ Arch.TempControlSoftwareSystem_p_Instance_tcproc_fan.id,
    /* domain 3 */ Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.id
  )

  val threadNickNames: Map[String, Art.BridgeId] = Map(
    ISZ(
      "TempSensor" ~> Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempSensor.id,
      "Fan" ~> Arch.TempControlSoftwareSystem_p_Instance_tcproc_fan.id,
      "TempControl" ~> Arch.TempControlSoftwareSystem_p_Instance_tcproc_tempControl.id,
      "OperatorInterface" ~> Arch.TempControlSoftwareSystem_p_Instance_tcproc_operatorInterface.id)
  )

}
