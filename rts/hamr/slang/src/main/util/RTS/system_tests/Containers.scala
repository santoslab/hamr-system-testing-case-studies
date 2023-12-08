// #Sireum
package RTS.system_tests

import org.sireum._
import RTS.Base_Types._

@datatype class Actuation_Subsystem_Inputs_Container(
   au1_temp_coincidenceLogic_channel1: Boolean,
   au1_temp_coincidenceLogic_channel2: Boolean,
   au1_temp_coincidenceLogic_channel3: Boolean,
   au1_temp_coincidenceLogic_channel4: Boolean,
   au1_press_coincidenceLogic_channel1: Boolean,
   au1_press_coincidenceLogic_channel2: Boolean,
   au1_press_coincidenceLogic_channel3: Boolean,
   au1_press_coincidenceLogic_channel4: Boolean,
   au1_satlogic_coincidenceLogic_channel1: Boolean,
   au1_satlogic_coincidenceLogic_channel2: Boolean,
   au1_satlogic_coincidenceLogic_channel3: Boolean,
   au1_satlogic_coincidenceLogic_channel4: Boolean,
   //
   au2_temp_coincidenceLogic_channel1: Boolean,
   au2_temp_coincidenceLogic_channel2: Boolean,
   au2_temp_coincidenceLogic_channel3: Boolean,
   au2_temp_coincidenceLogic_channel4: Boolean,
   au2_press_coincidenceLogic_channel1: Boolean,
   au2_press_coincidenceLogic_channel2: Boolean,
   au2_press_coincidenceLogic_channel3: Boolean,
   au2_press_coincidenceLogic_channel4: Boolean,
   au2_satlogic_coincidenceLogic_channel1: Boolean,
   au2_satlogic_coincidenceLogic_channel2: Boolean,
   au2_satlogic_coincidenceLogic_channel3: Boolean,
   au2_satlogic_coincidenceLogic_channel4: Boolean,
   //
   tempPressManualActuatorInput: Boolean,
   satManualActuatorInput: Boolean)

@datatype class Actuation_Subsystem_Outputs_Container(
   TPAU_tempPressA_actuator_output: Boolean,
   SAU_satActuator_actuator:Boolean)

