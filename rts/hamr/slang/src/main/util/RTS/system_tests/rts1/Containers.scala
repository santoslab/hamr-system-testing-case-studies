// #Sireum
package RTS.system_tests.rts1

import org.sireum._

@datatype class Actuation_Subsystem_Inputs_Container(
   au1_temp_coincidenceLogic_channel1: B,
   au1_temp_coincidenceLogic_channel2: B,
   au1_temp_coincidenceLogic_channel3: B,
   au1_temp_coincidenceLogic_channel4: B,
   au1_press_coincidenceLogic_channel1: B,
   au1_press_coincidenceLogic_channel2: B,
   au1_press_coincidenceLogic_channel3: B,
   au1_press_coincidenceLogic_channel4: B,
   au1_satlogic_coincidenceLogic_channel1: B,
   au1_satlogic_coincidenceLogic_channel2: B,
   au1_satlogic_coincidenceLogic_channel3: B,
   au1_satlogic_coincidenceLogic_channel4: B,
   //
   au2_temp_coincidenceLogic_channel1: B,
   au2_temp_coincidenceLogic_channel2: B,
   au2_temp_coincidenceLogic_channel3: B,
   au2_temp_coincidenceLogic_channel4: B,
   au2_press_coincidenceLogic_channel1: B,
   au2_press_coincidenceLogic_channel2: B,
   au2_press_coincidenceLogic_channel3: B,
   au2_press_coincidenceLogic_channel4: B,
   au2_satlogic_coincidenceLogic_channel1: B,
   au2_satlogic_coincidenceLogic_channel2: B,
   au2_satlogic_coincidenceLogic_channel3: B,
   au2_satlogic_coincidenceLogic_channel4: B,
   //
   tempPressManualActuatorInput: B,
   satManualActuatorInput: B)

@datatype class Actuation_Subsystem_Outputs_Container(
   TPAU_tempPressA_actuator_output: B,
   SAU_satActuator_actuator:B)

