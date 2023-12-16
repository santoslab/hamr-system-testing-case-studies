// #Sireum

package tc.system_tests

import org.sireum._
import tc.{TempControlSoftwareSystem, TempSensor, CoolingFan}


@datatype class TempControl_Inputs_Container(
   currentTemp: TempSensor.Temperature_i,
   setPoint: TempControlSoftwareSystem.SetPoint_i,
   latestFanCmd: CoolingFan.FanCmd.Type)

@datatype class TempControl_Outputs_Container(
                   fanCmd: CoolingFan.FanCmd.Type)


