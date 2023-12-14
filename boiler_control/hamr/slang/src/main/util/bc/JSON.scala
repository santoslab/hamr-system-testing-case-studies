// #Sireum
// @formatter:off

// This file is auto-generated from OpMode.scala, Base_Types.scala, Boiler_i_bcproc_boiler__Containers.scala, PumpControl_i_bcproc_pumpControl0__Containers.scala, PumpControl_i_bcproc_pumpControl1__Containers.scala, PumpControl_i_bcproc_pumpControl2__Containers.scala, PumpControl_i_bcproc_pumpControl3__Containers.scala, WaterMeter_i_bcproc_waterMeter__Containers.scala, SteamMeter_i_bcproc_steamMeter__Containers.scala, OperatorDesk_i_bcproc_desk__Containers.scala, BoilerControl_i_bcproc_control__Containers.scala, ObservationKind.scala, DataContent.scala, Aux_Types.scala

package bc

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printBoilerControlOpModeType(o: BoilerControl.OpMode.Type): ST = {
      val value: String = o match {
        case BoilerControl.OpMode.Init => "Init"
        case BoilerControl.OpMode.Norm => "Norm"
        case BoilerControl.OpMode.Degr => "Degr"
        case BoilerControl.OpMode.Resc => "Resc"
        case BoilerControl.OpMode.Stop => "Stop"
      }
      return printObject(ISZ(
        ("type", printString("BoilerControl.OpMode")),
        ("value", printString(value))
      ))
    }

    @pure def printBoilerControlOpMode_Payload(o: BoilerControl.OpMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.OpMode_Payload""""),
        ("value", printBoilerControlOpModeType(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printBoilerControlBoiler_i_bcproc_boiler_PreState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container): ST = {
      o match {
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P => return printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS => return printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P""""),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_valve", printOption(F, o.api_valve, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS""""),
        ("In_Mode", printBoilerControlOpModeType(o.In_Mode)),
        ("In_ValveOpen", printB(o.In_ValveOpen)),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_valve", printOption(F, o.api_valve, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlBoiler_i_bcproc_boiler_PostState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container): ST = {
      o match {
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P => return printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS => return printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P""""),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_waiting", printOption(F, o.api_waiting, print_artEmpty _))
      ))
    }

    @pure def printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS""""),
        ("Mode", printBoilerControlOpModeType(o.Mode)),
        ("ValveOpen", printB(o.ValveOpen)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_waiting", printOption(F, o.api_waiting, print_artEmpty _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P""""),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS""""),
        ("In_isPumpFlow", printB(o.In_isPumpFlow)),
        ("In_isPumpOpen", printB(o.In_isPumpOpen)),
        ("In_pumpNumber", printZ(o.In_pumpNumber)),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P""""),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS""""),
        ("isPumpFlow", printB(o.isPumpFlow)),
        ("isPumpOpen", printB(o.isPumpOpen)),
        ("pumpNumber", printZ(o.pumpNumber)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P""""),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS""""),
        ("In_isPumpFlow", printB(o.In_isPumpFlow)),
        ("In_isPumpOpen", printB(o.In_isPumpOpen)),
        ("In_pumpNumber", printZ(o.In_pumpNumber)),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P""""),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS""""),
        ("isPumpFlow", printB(o.isPumpFlow)),
        ("isPumpOpen", printB(o.isPumpOpen)),
        ("pumpNumber", printZ(o.pumpNumber)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P""""),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS""""),
        ("In_isPumpFlow", printB(o.In_isPumpFlow)),
        ("In_isPumpOpen", printB(o.In_isPumpOpen)),
        ("In_pumpNumber", printZ(o.In_pumpNumber)),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P""""),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS""""),
        ("isPumpFlow", printB(o.isPumpFlow)),
        ("isPumpOpen", printB(o.isPumpOpen)),
        ("pumpNumber", printZ(o.pumpNumber)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P""""),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS""""),
        ("In_isPumpFlow", printB(o.In_isPumpFlow)),
        ("In_isPumpOpen", printB(o.In_isPumpOpen)),
        ("In_pumpNumber", printZ(o.In_pumpNumber)),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump", printOption(T, o.api_openPump, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container): ST = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P""""),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS""""),
        ("isPumpFlow", printB(o.isPumpFlow)),
        ("isPumpOpen", printB(o.isPumpOpen)),
        ("pumpNumber", printZ(o.pumpNumber)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_pumpFlow", printOption(T, o.api_pumpFlow, printB _)),
        ("api_pumpOpen", printOption(T, o.api_pumpOpen, printB _))
      ))
    }

    @pure def printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container): ST = {
      o match {
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P""""),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS""""),
        ("In_volume", printF32(o.In_volume)),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container): ST = {
      o match {
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P""""),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_level", printOption(T, o.api_level, printF32 _))
      ))
    }

    @pure def printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS""""),
        ("volume", printF32(o.volume)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_level", printOption(T, o.api_level, printF32 _))
      ))
    }

    @pure def printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container): ST = {
      o match {
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P""""),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS""""),
        ("In_computedRate", printF32(o.In_computedRate)),
        ("In_volume", printF32(o.In_volume)),
        ("api_programReady", printOption(F, o.api_programReady, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container): ST = {
      o match {
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P""""),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_rate", printOption(T, o.api_rate, printF32 _))
      ))
    }

    @pure def printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS""""),
        ("computedRate", printF32(o.computedRate)),
        ("volume", printF32(o.volume)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_rate", printOption(T, o.api_rate, printF32 _))
      ))
    }

    @pure def printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container): ST = {
      o match {
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P => return printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS => return printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P""""),
        ("api_levelFail", printOption(F, o.api_levelFail, print_artEmpty _)),
        ("api_levelRepairAck", printOption(F, o.api_levelRepairAck, print_artEmpty _)),
        ("api_pumpControlFail0", printOption(F, o.api_pumpControlFail0, print_artEmpty _)),
        ("api_pumpControlFail1", printOption(F, o.api_pumpControlFail1, print_artEmpty _)),
        ("api_pumpControlFail2", printOption(F, o.api_pumpControlFail2, print_artEmpty _)),
        ("api_pumpControlFail3", printOption(F, o.api_pumpControlFail3, print_artEmpty _)),
        ("api_pumpControlRepairAck0", printOption(F, o.api_pumpControlRepairAck0, print_artEmpty _)),
        ("api_pumpControlRepairAck1", printOption(F, o.api_pumpControlRepairAck1, print_artEmpty _)),
        ("api_pumpControlRepairAck2", printOption(F, o.api_pumpControlRepairAck2, print_artEmpty _)),
        ("api_pumpControlRepairAck3", printOption(F, o.api_pumpControlRepairAck3, print_artEmpty _)),
        ("api_pumpFail0", printOption(F, o.api_pumpFail0, print_artEmpty _)),
        ("api_pumpFail1", printOption(F, o.api_pumpFail1, print_artEmpty _)),
        ("api_pumpFail2", printOption(F, o.api_pumpFail2, print_artEmpty _)),
        ("api_pumpFail3", printOption(F, o.api_pumpFail3, print_artEmpty _)),
        ("api_pumpRepairAck0", printOption(F, o.api_pumpRepairAck0, print_artEmpty _)),
        ("api_pumpRepairAck1", printOption(F, o.api_pumpRepairAck1, print_artEmpty _)),
        ("api_pumpRepairAck2", printOption(F, o.api_pumpRepairAck2, print_artEmpty _)),
        ("api_pumpRepairAck3", printOption(F, o.api_pumpRepairAck3, print_artEmpty _)),
        ("api_steamFail", printOption(F, o.api_steamFail, print_artEmpty _)),
        ("api_steamRepairAck", printOption(F, o.api_steamRepairAck, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS""""),
        ("In_isLevelBroken", printB(o.In_isLevelBroken)),
        ("In_isPumpBroken0", printB(o.In_isPumpBroken0)),
        ("In_isPumpBroken1", printB(o.In_isPumpBroken1)),
        ("In_isPumpBroken2", printB(o.In_isPumpBroken2)),
        ("In_isPumpBroken3", printB(o.In_isPumpBroken3)),
        ("In_isPumpControlBroken0", printB(o.In_isPumpControlBroken0)),
        ("In_isPumpControlBroken1", printB(o.In_isPumpControlBroken1)),
        ("In_isPumpControlBroken2", printB(o.In_isPumpControlBroken2)),
        ("In_isPumpControlBroken3", printB(o.In_isPumpControlBroken3)),
        ("In_isSteamBroken", printB(o.In_isSteamBroken)),
        ("api_levelFail", printOption(F, o.api_levelFail, print_artEmpty _)),
        ("api_levelRepairAck", printOption(F, o.api_levelRepairAck, print_artEmpty _)),
        ("api_pumpControlFail0", printOption(F, o.api_pumpControlFail0, print_artEmpty _)),
        ("api_pumpControlFail1", printOption(F, o.api_pumpControlFail1, print_artEmpty _)),
        ("api_pumpControlFail2", printOption(F, o.api_pumpControlFail2, print_artEmpty _)),
        ("api_pumpControlFail3", printOption(F, o.api_pumpControlFail3, print_artEmpty _)),
        ("api_pumpControlRepairAck0", printOption(F, o.api_pumpControlRepairAck0, print_artEmpty _)),
        ("api_pumpControlRepairAck1", printOption(F, o.api_pumpControlRepairAck1, print_artEmpty _)),
        ("api_pumpControlRepairAck2", printOption(F, o.api_pumpControlRepairAck2, print_artEmpty _)),
        ("api_pumpControlRepairAck3", printOption(F, o.api_pumpControlRepairAck3, print_artEmpty _)),
        ("api_pumpFail0", printOption(F, o.api_pumpFail0, print_artEmpty _)),
        ("api_pumpFail1", printOption(F, o.api_pumpFail1, print_artEmpty _)),
        ("api_pumpFail2", printOption(F, o.api_pumpFail2, print_artEmpty _)),
        ("api_pumpFail3", printOption(F, o.api_pumpFail3, print_artEmpty _)),
        ("api_pumpRepairAck0", printOption(F, o.api_pumpRepairAck0, print_artEmpty _)),
        ("api_pumpRepairAck1", printOption(F, o.api_pumpRepairAck1, print_artEmpty _)),
        ("api_pumpRepairAck2", printOption(F, o.api_pumpRepairAck2, print_artEmpty _)),
        ("api_pumpRepairAck3", printOption(F, o.api_pumpRepairAck3, print_artEmpty _)),
        ("api_steamFail", printOption(F, o.api_steamFail, print_artEmpty _)),
        ("api_steamRepairAck", printOption(F, o.api_steamRepairAck, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _))
      ))
    }

    @pure def printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container): ST = {
      o match {
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P => return printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS => return printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P""""),
        ("api_levelFailAck", printOption(F, o.api_levelFailAck, print_artEmpty _)),
        ("api_levelRepair", printOption(F, o.api_levelRepair, print_artEmpty _)),
        ("api_pumpControlFailAck0", printOption(F, o.api_pumpControlFailAck0, print_artEmpty _)),
        ("api_pumpControlFailAck1", printOption(F, o.api_pumpControlFailAck1, print_artEmpty _)),
        ("api_pumpControlFailAck2", printOption(F, o.api_pumpControlFailAck2, print_artEmpty _)),
        ("api_pumpControlFailAck3", printOption(F, o.api_pumpControlFailAck3, print_artEmpty _)),
        ("api_pumpControlRepair0", printOption(F, o.api_pumpControlRepair0, print_artEmpty _)),
        ("api_pumpControlRepair1", printOption(F, o.api_pumpControlRepair1, print_artEmpty _)),
        ("api_pumpControlRepair2", printOption(F, o.api_pumpControlRepair2, print_artEmpty _)),
        ("api_pumpControlRepair3", printOption(F, o.api_pumpControlRepair3, print_artEmpty _)),
        ("api_pumpFailAck0", printOption(F, o.api_pumpFailAck0, print_artEmpty _)),
        ("api_pumpFailAck1", printOption(F, o.api_pumpFailAck1, print_artEmpty _)),
        ("api_pumpFailAck2", printOption(F, o.api_pumpFailAck2, print_artEmpty _)),
        ("api_pumpFailAck3", printOption(F, o.api_pumpFailAck3, print_artEmpty _)),
        ("api_pumpRepair0", printOption(F, o.api_pumpRepair0, print_artEmpty _)),
        ("api_pumpRepair1", printOption(F, o.api_pumpRepair1, print_artEmpty _)),
        ("api_pumpRepair2", printOption(F, o.api_pumpRepair2, print_artEmpty _)),
        ("api_pumpRepair3", printOption(F, o.api_pumpRepair3, print_artEmpty _)),
        ("api_steamFailAck", printOption(F, o.api_steamFailAck, print_artEmpty _)),
        ("api_steamRepair", printOption(F, o.api_steamRepair, print_artEmpty _)),
        ("api_stop", printOption(F, o.api_stop, print_artEmpty _))
      ))
    }

    @pure def printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS""""),
        ("isLevelBroken", printB(o.isLevelBroken)),
        ("isPumpBroken0", printB(o.isPumpBroken0)),
        ("isPumpBroken1", printB(o.isPumpBroken1)),
        ("isPumpBroken2", printB(o.isPumpBroken2)),
        ("isPumpBroken3", printB(o.isPumpBroken3)),
        ("isPumpControlBroken0", printB(o.isPumpControlBroken0)),
        ("isPumpControlBroken1", printB(o.isPumpControlBroken1)),
        ("isPumpControlBroken2", printB(o.isPumpControlBroken2)),
        ("isPumpControlBroken3", printB(o.isPumpControlBroken3)),
        ("isSteamBroken", printB(o.isSteamBroken)),
        ("api_levelFailAck", printOption(F, o.api_levelFailAck, print_artEmpty _)),
        ("api_levelRepair", printOption(F, o.api_levelRepair, print_artEmpty _)),
        ("api_pumpControlFailAck0", printOption(F, o.api_pumpControlFailAck0, print_artEmpty _)),
        ("api_pumpControlFailAck1", printOption(F, o.api_pumpControlFailAck1, print_artEmpty _)),
        ("api_pumpControlFailAck2", printOption(F, o.api_pumpControlFailAck2, print_artEmpty _)),
        ("api_pumpControlFailAck3", printOption(F, o.api_pumpControlFailAck3, print_artEmpty _)),
        ("api_pumpControlRepair0", printOption(F, o.api_pumpControlRepair0, print_artEmpty _)),
        ("api_pumpControlRepair1", printOption(F, o.api_pumpControlRepair1, print_artEmpty _)),
        ("api_pumpControlRepair2", printOption(F, o.api_pumpControlRepair2, print_artEmpty _)),
        ("api_pumpControlRepair3", printOption(F, o.api_pumpControlRepair3, print_artEmpty _)),
        ("api_pumpFailAck0", printOption(F, o.api_pumpFailAck0, print_artEmpty _)),
        ("api_pumpFailAck1", printOption(F, o.api_pumpFailAck1, print_artEmpty _)),
        ("api_pumpFailAck2", printOption(F, o.api_pumpFailAck2, print_artEmpty _)),
        ("api_pumpFailAck3", printOption(F, o.api_pumpFailAck3, print_artEmpty _)),
        ("api_pumpRepair0", printOption(F, o.api_pumpRepair0, print_artEmpty _)),
        ("api_pumpRepair1", printOption(F, o.api_pumpRepair1, print_artEmpty _)),
        ("api_pumpRepair2", printOption(F, o.api_pumpRepair2, print_artEmpty _)),
        ("api_pumpRepair3", printOption(F, o.api_pumpRepair3, print_artEmpty _)),
        ("api_steamFailAck", printOption(F, o.api_steamFailAck, print_artEmpty _)),
        ("api_steamRepair", printOption(F, o.api_steamRepair, print_artEmpty _)),
        ("api_stop", printOption(F, o.api_stop, print_artEmpty _))
      ))
    }

    @pure def printBoilerControlBoilerControl_i_bcproc_control_PreState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container): ST = {
      o match {
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P => return printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS => return printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o)
      }
    }

    @pure def printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P""""),
        ("api_boilerReady", printOption(F, o.api_boilerReady, print_artEmpty _)),
        ("api_boilerWaiting", printOption(F, o.api_boilerWaiting, print_artEmpty _)),
        ("api_levelFailAck", printOption(F, o.api_levelFailAck, print_artEmpty _)),
        ("api_levelRepair", printOption(F, o.api_levelRepair, print_artEmpty _)),
        ("api_pumpControlFailAck0", printOption(F, o.api_pumpControlFailAck0, print_artEmpty _)),
        ("api_pumpControlFailAck1", printOption(F, o.api_pumpControlFailAck1, print_artEmpty _)),
        ("api_pumpControlFailAck2", printOption(F, o.api_pumpControlFailAck2, print_artEmpty _)),
        ("api_pumpControlFailAck3", printOption(F, o.api_pumpControlFailAck3, print_artEmpty _)),
        ("api_pumpControlReady0", printOption(F, o.api_pumpControlReady0, print_artEmpty _)),
        ("api_pumpControlReady1", printOption(F, o.api_pumpControlReady1, print_artEmpty _)),
        ("api_pumpControlReady2", printOption(F, o.api_pumpControlReady2, print_artEmpty _)),
        ("api_pumpControlReady3", printOption(F, o.api_pumpControlReady3, print_artEmpty _)),
        ("api_pumpControlRepair0", printOption(F, o.api_pumpControlRepair0, print_artEmpty _)),
        ("api_pumpControlRepair1", printOption(F, o.api_pumpControlRepair1, print_artEmpty _)),
        ("api_pumpControlRepair2", printOption(F, o.api_pumpControlRepair2, print_artEmpty _)),
        ("api_pumpControlRepair3", printOption(F, o.api_pumpControlRepair3, print_artEmpty _)),
        ("api_pumpFailAck0", printOption(F, o.api_pumpFailAck0, print_artEmpty _)),
        ("api_pumpFailAck1", printOption(F, o.api_pumpFailAck1, print_artEmpty _)),
        ("api_pumpFailAck2", printOption(F, o.api_pumpFailAck2, print_artEmpty _)),
        ("api_pumpFailAck3", printOption(F, o.api_pumpFailAck3, print_artEmpty _)),
        ("api_pumpRepair0", printOption(F, o.api_pumpRepair0, print_artEmpty _)),
        ("api_pumpRepair1", printOption(F, o.api_pumpRepair1, print_artEmpty _)),
        ("api_pumpRepair2", printOption(F, o.api_pumpRepair2, print_artEmpty _)),
        ("api_pumpRepair3", printOption(F, o.api_pumpRepair3, print_artEmpty _)),
        ("api_steamFailAck", printOption(F, o.api_steamFailAck, print_artEmpty _)),
        ("api_steamMeterReady", printOption(F, o.api_steamMeterReady, print_artEmpty _)),
        ("api_steamRepair", printOption(F, o.api_steamRepair, print_artEmpty _)),
        ("api_stop", printOption(F, o.api_stop, print_artEmpty _)),
        ("api_waterMeterReady", printOption(F, o.api_waterMeterReady, print_artEmpty _)),
        ("api_pumpFlow0", printOption(T, o.api_pumpFlow0, printB _)),
        ("api_pumpFlow1", printOption(T, o.api_pumpFlow1, printB _)),
        ("api_pumpFlow2", printOption(T, o.api_pumpFlow2, printB _)),
        ("api_pumpFlow3", printOption(T, o.api_pumpFlow3, printB _)),
        ("api_pumpOpen0", printOption(T, o.api_pumpOpen0, printB _)),
        ("api_pumpOpen1", printOption(T, o.api_pumpOpen1, printB _)),
        ("api_pumpOpen2", printOption(T, o.api_pumpOpen2, printB _)),
        ("api_pumpOpen3", printOption(T, o.api_pumpOpen3, printB _)),
        ("api_steamRate", printOption(T, o.api_steamRate, printF32 _)),
        ("api_waterLevel", printOption(T, o.api_waterLevel, printF32 _))
      ))
    }

    @pure def printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS""""),
        ("In_C", printF32(o.In_C)),
        ("In_M1", printF32(o.In_M1)),
        ("In_M2", printF32(o.In_M2)),
        ("In_N1", printF32(o.In_N1)),
        ("In_N2", printF32(o.In_N2)),
        ("In_P", printF32(o.In_P)),
        ("In_U1", printF32(o.In_U1)),
        ("In_U2", printF32(o.In_U2)),
        ("In_W", printF32(o.In_W)),
        ("In_hasBoilerSentWaiting", printB(o.In_hasBoilerSentWaiting)),
        ("In_isPump0Failing", printB(o.In_isPump0Failing)),
        ("In_isPump1Failing", printB(o.In_isPump1Failing)),
        ("In_isPump2Failing", printB(o.In_isPump2Failing)),
        ("In_isPump3Failing", printB(o.In_isPump3Failing)),
        ("In_isSteamMeterFailing", printB(o.In_isSteamMeterFailing)),
        ("In_isWaterMeterFailing", printB(o.In_isWaterMeterFailing)),
        ("In_mode", printBoilerControlOpModeType(o.In_mode)),
        ("In_p0", printF32(o.In_p0)),
        ("In_p1", printF32(o.In_p1)),
        ("In_p2", printF32(o.In_p2)),
        ("In_p3", printF32(o.In_p3)),
        ("In_q", printF32(o.In_q)),
        ("In_qa1", printF32(o.In_qa1)),
        ("In_qa2", printF32(o.In_qa2)),
        ("In_qc1", printF32(o.In_qc1)),
        ("In_qc2", printF32(o.In_qc2)),
        ("In_shouldUpdatePumps", printB(o.In_shouldUpdatePumps)),
        ("In_transmissionFailure", printB(o.In_transmissionFailure)),
        ("In_v_steamRate", printF32(o.In_v_steamRate)),
        ("api_boilerReady", printOption(F, o.api_boilerReady, print_artEmpty _)),
        ("api_boilerWaiting", printOption(F, o.api_boilerWaiting, print_artEmpty _)),
        ("api_levelFailAck", printOption(F, o.api_levelFailAck, print_artEmpty _)),
        ("api_levelRepair", printOption(F, o.api_levelRepair, print_artEmpty _)),
        ("api_pumpControlFailAck0", printOption(F, o.api_pumpControlFailAck0, print_artEmpty _)),
        ("api_pumpControlFailAck1", printOption(F, o.api_pumpControlFailAck1, print_artEmpty _)),
        ("api_pumpControlFailAck2", printOption(F, o.api_pumpControlFailAck2, print_artEmpty _)),
        ("api_pumpControlFailAck3", printOption(F, o.api_pumpControlFailAck3, print_artEmpty _)),
        ("api_pumpControlReady0", printOption(F, o.api_pumpControlReady0, print_artEmpty _)),
        ("api_pumpControlReady1", printOption(F, o.api_pumpControlReady1, print_artEmpty _)),
        ("api_pumpControlReady2", printOption(F, o.api_pumpControlReady2, print_artEmpty _)),
        ("api_pumpControlReady3", printOption(F, o.api_pumpControlReady3, print_artEmpty _)),
        ("api_pumpControlRepair0", printOption(F, o.api_pumpControlRepair0, print_artEmpty _)),
        ("api_pumpControlRepair1", printOption(F, o.api_pumpControlRepair1, print_artEmpty _)),
        ("api_pumpControlRepair2", printOption(F, o.api_pumpControlRepair2, print_artEmpty _)),
        ("api_pumpControlRepair3", printOption(F, o.api_pumpControlRepair3, print_artEmpty _)),
        ("api_pumpFailAck0", printOption(F, o.api_pumpFailAck0, print_artEmpty _)),
        ("api_pumpFailAck1", printOption(F, o.api_pumpFailAck1, print_artEmpty _)),
        ("api_pumpFailAck2", printOption(F, o.api_pumpFailAck2, print_artEmpty _)),
        ("api_pumpFailAck3", printOption(F, o.api_pumpFailAck3, print_artEmpty _)),
        ("api_pumpRepair0", printOption(F, o.api_pumpRepair0, print_artEmpty _)),
        ("api_pumpRepair1", printOption(F, o.api_pumpRepair1, print_artEmpty _)),
        ("api_pumpRepair2", printOption(F, o.api_pumpRepair2, print_artEmpty _)),
        ("api_pumpRepair3", printOption(F, o.api_pumpRepair3, print_artEmpty _)),
        ("api_steamFailAck", printOption(F, o.api_steamFailAck, print_artEmpty _)),
        ("api_steamMeterReady", printOption(F, o.api_steamMeterReady, print_artEmpty _)),
        ("api_steamRepair", printOption(F, o.api_steamRepair, print_artEmpty _)),
        ("api_stop", printOption(F, o.api_stop, print_artEmpty _)),
        ("api_waterMeterReady", printOption(F, o.api_waterMeterReady, print_artEmpty _)),
        ("api_pumpFlow0", printOption(T, o.api_pumpFlow0, printB _)),
        ("api_pumpFlow1", printOption(T, o.api_pumpFlow1, printB _)),
        ("api_pumpFlow2", printOption(T, o.api_pumpFlow2, printB _)),
        ("api_pumpFlow3", printOption(T, o.api_pumpFlow3, printB _)),
        ("api_pumpOpen0", printOption(T, o.api_pumpOpen0, printB _)),
        ("api_pumpOpen1", printOption(T, o.api_pumpOpen1, printB _)),
        ("api_pumpOpen2", printOption(T, o.api_pumpOpen2, printB _)),
        ("api_pumpOpen3", printOption(T, o.api_pumpOpen3, printB _)),
        ("api_steamRate", printOption(T, o.api_steamRate, printF32 _)),
        ("api_waterLevel", printOption(T, o.api_waterLevel, printF32 _))
      ))
    }

    @pure def printBoilerControlBoilerControl_i_bcproc_control_PostState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container): ST = {
      o match {
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P => return printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS => return printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o)
      }
    }

    @pure def printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P""""),
        ("api_levelFail", printOption(F, o.api_levelFail, print_artEmpty _)),
        ("api_levelRepairAck", printOption(F, o.api_levelRepairAck, print_artEmpty _)),
        ("api_pumpControlFail0", printOption(F, o.api_pumpControlFail0, print_artEmpty _)),
        ("api_pumpControlFail1", printOption(F, o.api_pumpControlFail1, print_artEmpty _)),
        ("api_pumpControlFail2", printOption(F, o.api_pumpControlFail2, print_artEmpty _)),
        ("api_pumpControlFail3", printOption(F, o.api_pumpControlFail3, print_artEmpty _)),
        ("api_pumpControlRepairAck0", printOption(F, o.api_pumpControlRepairAck0, print_artEmpty _)),
        ("api_pumpControlRepairAck1", printOption(F, o.api_pumpControlRepairAck1, print_artEmpty _)),
        ("api_pumpControlRepairAck2", printOption(F, o.api_pumpControlRepairAck2, print_artEmpty _)),
        ("api_pumpControlRepairAck3", printOption(F, o.api_pumpControlRepairAck3, print_artEmpty _)),
        ("api_pumpFail0", printOption(F, o.api_pumpFail0, print_artEmpty _)),
        ("api_pumpFail1", printOption(F, o.api_pumpFail1, print_artEmpty _)),
        ("api_pumpFail2", printOption(F, o.api_pumpFail2, print_artEmpty _)),
        ("api_pumpFail3", printOption(F, o.api_pumpFail3, print_artEmpty _)),
        ("api_pumpRepairAck0", printOption(F, o.api_pumpRepairAck0, print_artEmpty _)),
        ("api_pumpRepairAck1", printOption(F, o.api_pumpRepairAck1, print_artEmpty _)),
        ("api_pumpRepairAck2", printOption(F, o.api_pumpRepairAck2, print_artEmpty _)),
        ("api_pumpRepairAck3", printOption(F, o.api_pumpRepairAck3, print_artEmpty _)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_steamFail", printOption(F, o.api_steamFail, print_artEmpty _)),
        ("api_steamRepairAck", printOption(F, o.api_steamRepairAck, print_artEmpty _)),
        ("api_valve", printOption(F, o.api_valve, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump0", printOption(T, o.api_openPump0, printB _)),
        ("api_openPump1", printOption(T, o.api_openPump1, printB _)),
        ("api_openPump2", printOption(T, o.api_openPump2, printB _)),
        ("api_openPump3", printOption(T, o.api_openPump3, printB _))
      ))
    }

    @pure def printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS""""),
        ("C", printF32(o.C)),
        ("M1", printF32(o.M1)),
        ("M2", printF32(o.M2)),
        ("N1", printF32(o.N1)),
        ("N2", printF32(o.N2)),
        ("P", printF32(o.P)),
        ("U1", printF32(o.U1)),
        ("U2", printF32(o.U2)),
        ("W", printF32(o.W)),
        ("hasBoilerSentWaiting", printB(o.hasBoilerSentWaiting)),
        ("isPump0Failing", printB(o.isPump0Failing)),
        ("isPump1Failing", printB(o.isPump1Failing)),
        ("isPump2Failing", printB(o.isPump2Failing)),
        ("isPump3Failing", printB(o.isPump3Failing)),
        ("isSteamMeterFailing", printB(o.isSteamMeterFailing)),
        ("isWaterMeterFailing", printB(o.isWaterMeterFailing)),
        ("mode", printBoilerControlOpModeType(o.mode)),
        ("p0", printF32(o.p0)),
        ("p1", printF32(o.p1)),
        ("p2", printF32(o.p2)),
        ("p3", printF32(o.p3)),
        ("q", printF32(o.q)),
        ("qa1", printF32(o.qa1)),
        ("qa2", printF32(o.qa2)),
        ("qc1", printF32(o.qc1)),
        ("qc2", printF32(o.qc2)),
        ("shouldUpdatePumps", printB(o.shouldUpdatePumps)),
        ("transmissionFailure", printB(o.transmissionFailure)),
        ("v_steamRate", printF32(o.v_steamRate)),
        ("api_levelFail", printOption(F, o.api_levelFail, print_artEmpty _)),
        ("api_levelRepairAck", printOption(F, o.api_levelRepairAck, print_artEmpty _)),
        ("api_pumpControlFail0", printOption(F, o.api_pumpControlFail0, print_artEmpty _)),
        ("api_pumpControlFail1", printOption(F, o.api_pumpControlFail1, print_artEmpty _)),
        ("api_pumpControlFail2", printOption(F, o.api_pumpControlFail2, print_artEmpty _)),
        ("api_pumpControlFail3", printOption(F, o.api_pumpControlFail3, print_artEmpty _)),
        ("api_pumpControlRepairAck0", printOption(F, o.api_pumpControlRepairAck0, print_artEmpty _)),
        ("api_pumpControlRepairAck1", printOption(F, o.api_pumpControlRepairAck1, print_artEmpty _)),
        ("api_pumpControlRepairAck2", printOption(F, o.api_pumpControlRepairAck2, print_artEmpty _)),
        ("api_pumpControlRepairAck3", printOption(F, o.api_pumpControlRepairAck3, print_artEmpty _)),
        ("api_pumpFail0", printOption(F, o.api_pumpFail0, print_artEmpty _)),
        ("api_pumpFail1", printOption(F, o.api_pumpFail1, print_artEmpty _)),
        ("api_pumpFail2", printOption(F, o.api_pumpFail2, print_artEmpty _)),
        ("api_pumpFail3", printOption(F, o.api_pumpFail3, print_artEmpty _)),
        ("api_pumpRepairAck0", printOption(F, o.api_pumpRepairAck0, print_artEmpty _)),
        ("api_pumpRepairAck1", printOption(F, o.api_pumpRepairAck1, print_artEmpty _)),
        ("api_pumpRepairAck2", printOption(F, o.api_pumpRepairAck2, print_artEmpty _)),
        ("api_pumpRepairAck3", printOption(F, o.api_pumpRepairAck3, print_artEmpty _)),
        ("api_ready", printOption(F, o.api_ready, print_artEmpty _)),
        ("api_steamFail", printOption(F, o.api_steamFail, print_artEmpty _)),
        ("api_steamRepairAck", printOption(F, o.api_steamRepairAck, print_artEmpty _)),
        ("api_valve", printOption(F, o.api_valve, print_artEmpty _)),
        ("api_opMode", printOption(F, o.api_opMode, printBoilerControlOpModeType _)),
        ("api_openPump0", printOption(T, o.api_openPump0, printB _)),
        ("api_openPump1", printOption(T, o.api_openPump1, printB _)),
        ("api_openPump2", printOption(T, o.api_openPump2, printB _)),
        ("api_openPump3", printOption(T, o.api_openPump3, printB _))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_boiler_postInit => "BoilerControlSystem_i_Instance_bcproc_boiler_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_boiler_preCompute => "BoilerControlSystem_i_Instance_bcproc_boiler_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_boiler_postCompute => "BoilerControlSystem_i_Instance_bcproc_boiler_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl0_postInit => "BoilerControlSystem_i_Instance_bcproc_pumpControl0_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl0_preCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl0_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl0_postCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl0_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl1_postInit => "BoilerControlSystem_i_Instance_bcproc_pumpControl1_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl1_preCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl1_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl1_postCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl1_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl2_postInit => "BoilerControlSystem_i_Instance_bcproc_pumpControl2_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl2_preCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl2_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl2_postCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl2_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl3_postInit => "BoilerControlSystem_i_Instance_bcproc_pumpControl3_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl3_preCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl3_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_pumpControl3_postCompute => "BoilerControlSystem_i_Instance_bcproc_pumpControl3_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_waterMeter_postInit => "BoilerControlSystem_i_Instance_bcproc_waterMeter_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_waterMeter_preCompute => "BoilerControlSystem_i_Instance_bcproc_waterMeter_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_waterMeter_postCompute => "BoilerControlSystem_i_Instance_bcproc_waterMeter_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_steamMeter_postInit => "BoilerControlSystem_i_Instance_bcproc_steamMeter_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_steamMeter_preCompute => "BoilerControlSystem_i_Instance_bcproc_steamMeter_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_steamMeter_postCompute => "BoilerControlSystem_i_Instance_bcproc_steamMeter_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_desk_postInit => "BoilerControlSystem_i_Instance_bcproc_desk_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_desk_preCompute => "BoilerControlSystem_i_Instance_bcproc_desk_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_desk_postCompute => "BoilerControlSystem_i_Instance_bcproc_desk_postCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_control_postInit => "BoilerControlSystem_i_Instance_bcproc_control_postInit"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_control_preCompute => "BoilerControlSystem_i_Instance_bcproc_control_preCompute"
        case runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_control_postCompute => "BoilerControlSystem_i_Instance_bcproc_control_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: art.Empty => return print_artEmpty(o)
        case o: BoilerControl.OpMode_Payload => return printBoilerControlOpMode_Payload(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P => return printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS => return printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P => return printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS => return printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P => return printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS => return printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P => return printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS => return printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS => return printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS => return printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P => return printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS => return printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P => return printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS => return printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS => return printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseBoilerControlOpModeType(): BoilerControl.OpMode.Type = {
      val r = parseBoilerControlOpModeT(F)
      return r
    }

    def parseBoilerControlOpModeT(typeParsed: B): BoilerControl.OpMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.OpMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BoilerControl.OpMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BoilerControl.OpMode.")
          return BoilerControl.OpMode.byOrdinal(0).get
      }
    }

    def parseBoilerControlOpMode_Payload(): BoilerControl.OpMode_Payload = {
      val r = parseBoilerControlOpMode_PayloadT(F)
      return r
    }

    def parseBoilerControlOpMode_PayloadT(typeParsed: B): BoilerControl.OpMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.OpMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseBoilerControlOpModeType()
      parser.parseObjectNext()
      return BoilerControl.OpMode_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P", "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(T); return r
        case "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = {
      val r = parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P")
      }
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_valve")
      val api_valve = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P(api_programReady, api_valve, api_opMode)
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = {
      val r = parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS")
      }
      parser.parseObjectKey("In_Mode")
      val In_Mode = parseBoilerControlOpModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_ValveOpen")
      val In_ValveOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_valve")
      val api_valve = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS(In_Mode, In_ValveOpen, api_programReady, api_valve, api_opMode)
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P", "BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(T); return r
        case "BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = {
      val r = parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P")
      }
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_waiting")
      val api_waiting = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      return BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P(api_ready, api_waiting)
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
      val r = parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS")
      }
      parser.parseObjectKey("Mode")
      val Mode = parseBoilerControlOpModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("ValveOpen")
      val ValveOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_waiting")
      val api_waiting = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      return BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS(Mode, ValveOpen, api_ready, api_waiting)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P")
      }
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS")
      }
      parser.parseObjectKey("In_isPumpFlow")
      val In_isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpOpen")
      val In_isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_pumpNumber")
      val In_pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P")
      }
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS")
      }
      parser.parseObjectKey("isPumpFlow")
      val isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpOpen")
      val isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("pumpNumber")
      val pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P")
      }
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS")
      }
      parser.parseObjectKey("In_isPumpFlow")
      val In_isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpOpen")
      val In_isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_pumpNumber")
      val In_pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P")
      }
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS")
      }
      parser.parseObjectKey("isPumpFlow")
      val isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpOpen")
      val isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("pumpNumber")
      val pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P")
      }
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS")
      }
      parser.parseObjectKey("In_isPumpFlow")
      val In_isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpOpen")
      val In_isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_pumpNumber")
      val In_pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P")
      }
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS")
      }
      parser.parseObjectKey("isPumpFlow")
      val isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpOpen")
      val isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("pumpNumber")
      val pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P")
      }
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS")
      }
      parser.parseObjectKey("In_isPumpFlow")
      val In_isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpOpen")
      val In_isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_pumpNumber")
      val In_pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump")
      val api_openPump = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P")
      }
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {
      val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS")
      }
      parser.parseObjectKey("isPumpFlow")
      val isPumpFlow = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpOpen")
      val isPumpOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("pumpNumber")
      val pumpNumber = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow")
      val api_pumpFlow = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen")
      val api_pumpOpen = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P", "BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(T); return r
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = {
      val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P")
      }
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P(api_programReady, api_opMode)
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {
      val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS")
      }
      parser.parseObjectKey("In_volume")
      val In_volume = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS(In_volume, api_programReady, api_opMode)
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P", "BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(T); return r
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = {
      val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P")
      }
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_level")
      val api_level = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P(api_ready, api_level)
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
      val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS")
      }
      parser.parseObjectKey("volume")
      val volume = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_level")
      val api_level = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS(volume, api_ready, api_level)
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P", "BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(T); return r
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
      val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P")
      }
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P(api_programReady, api_opMode)
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
      val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS")
      }
      parser.parseObjectKey("In_computedRate")
      val In_computedRate = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_volume")
      val In_volume = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_programReady")
      val api_programReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS(In_computedRate, In_volume, api_programReady, api_opMode)
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P", "BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(T); return r
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = {
      val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P")
      }
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_rate")
      val api_rate = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P(api_ready, api_rate)
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {
      val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS")
      }
      parser.parseObjectKey("computedRate")
      val computedRate = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("volume")
      val volume = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_rate")
      val api_rate = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS(computedRate, volume, api_ready, api_rate)
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P", "BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(T); return r
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = {
      val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P")
      }
      parser.parseObjectKey("api_levelFail")
      val api_levelFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepairAck")
      val api_levelRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail0")
      val api_pumpControlFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail1")
      val api_pumpControlFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail2")
      val api_pumpControlFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail3")
      val api_pumpControlFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck0")
      val api_pumpControlRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck1")
      val api_pumpControlRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck2")
      val api_pumpControlRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck3")
      val api_pumpControlRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail0")
      val api_pumpFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail1")
      val api_pumpFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail2")
      val api_pumpFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail3")
      val api_pumpFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck0")
      val api_pumpRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck1")
      val api_pumpRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck2")
      val api_pumpRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck3")
      val api_pumpRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFail")
      val api_steamFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepairAck")
      val api_steamRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
      val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS")
      }
      parser.parseObjectKey("In_isLevelBroken")
      val In_isLevelBroken = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpBroken0")
      val In_isPumpBroken0 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpBroken1")
      val In_isPumpBroken1 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpBroken2")
      val In_isPumpBroken2 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpBroken3")
      val In_isPumpBroken3 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpControlBroken0")
      val In_isPumpControlBroken0 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpControlBroken1")
      val In_isPumpControlBroken1 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpControlBroken2")
      val In_isPumpControlBroken2 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPumpControlBroken3")
      val In_isPumpControlBroken3 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isSteamBroken")
      val In_isSteamBroken = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelFail")
      val api_levelFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepairAck")
      val api_levelRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail0")
      val api_pumpControlFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail1")
      val api_pumpControlFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail2")
      val api_pumpControlFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail3")
      val api_pumpControlFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck0")
      val api_pumpControlRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck1")
      val api_pumpControlRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck2")
      val api_pumpControlRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck3")
      val api_pumpControlRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail0")
      val api_pumpFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail1")
      val api_pumpFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail2")
      val api_pumpFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail3")
      val api_pumpFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck0")
      val api_pumpRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck1")
      val api_pumpRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck2")
      val api_pumpRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck3")
      val api_pumpRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFail")
      val api_steamFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepairAck")
      val api_steamRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      return BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS(In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P", "BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(T); return r
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = {
      val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P")
      }
      parser.parseObjectKey("api_levelFailAck")
      val api_levelFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepair")
      val api_levelRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck0")
      val api_pumpControlFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck1")
      val api_pumpControlFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck2")
      val api_pumpControlFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck3")
      val api_pumpControlFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair0")
      val api_pumpControlRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair1")
      val api_pumpControlRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair2")
      val api_pumpControlRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair3")
      val api_pumpControlRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck0")
      val api_pumpFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck1")
      val api_pumpFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck2")
      val api_pumpFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck3")
      val api_pumpFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair0")
      val api_pumpRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair1")
      val api_pumpRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair2")
      val api_pumpRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair3")
      val api_pumpRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFailAck")
      val api_steamFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepair")
      val api_steamRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_stop")
      val api_stop = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      return BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P(api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = {
      val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS")
      }
      parser.parseObjectKey("isLevelBroken")
      val isLevelBroken = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpBroken0")
      val isPumpBroken0 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpBroken1")
      val isPumpBroken1 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpBroken2")
      val isPumpBroken2 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpBroken3")
      val isPumpBroken3 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpControlBroken0")
      val isPumpControlBroken0 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpControlBroken1")
      val isPumpControlBroken1 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpControlBroken2")
      val isPumpControlBroken2 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPumpControlBroken3")
      val isPumpControlBroken3 = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isSteamBroken")
      val isSteamBroken = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelFailAck")
      val api_levelFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepair")
      val api_levelRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck0")
      val api_pumpControlFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck1")
      val api_pumpControlFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck2")
      val api_pumpControlFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck3")
      val api_pumpControlFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair0")
      val api_pumpControlRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair1")
      val api_pumpControlRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair2")
      val api_pumpControlRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair3")
      val api_pumpControlRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck0")
      val api_pumpFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck1")
      val api_pumpFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck2")
      val api_pumpFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck3")
      val api_pumpFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair0")
      val api_pumpRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair1")
      val api_pumpRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair2")
      val api_pumpRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair3")
      val api_pumpRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFailAck")
      val api_steamFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepair")
      val api_steamRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_stop")
      val api_stop = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      return BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS(isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P", "BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS"))
      t.native match {
        case "BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(T); return r
        case "BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(T); return r
        case _ => val r = parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(T); return r
      }
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = {
      val r = parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(F)
      return r
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_boilerReady")
      val api_boilerReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_boilerWaiting")
      val api_boilerWaiting = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelFailAck")
      val api_levelFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepair")
      val api_levelRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck0")
      val api_pumpControlFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck1")
      val api_pumpControlFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck2")
      val api_pumpControlFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck3")
      val api_pumpControlFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady0")
      val api_pumpControlReady0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady1")
      val api_pumpControlReady1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady2")
      val api_pumpControlReady2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady3")
      val api_pumpControlReady3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair0")
      val api_pumpControlRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair1")
      val api_pumpControlRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair2")
      val api_pumpControlRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair3")
      val api_pumpControlRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck0")
      val api_pumpFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck1")
      val api_pumpFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck2")
      val api_pumpFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck3")
      val api_pumpFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair0")
      val api_pumpRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair1")
      val api_pumpRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair2")
      val api_pumpRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair3")
      val api_pumpRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFailAck")
      val api_steamFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamMeterReady")
      val api_steamMeterReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepair")
      val api_steamRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_stop")
      val api_stop = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_waterMeterReady")
      val api_waterMeterReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow0")
      val api_pumpFlow0 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow1")
      val api_pumpFlow1 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow2")
      val api_pumpFlow2 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow3")
      val api_pumpFlow3 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen0")
      val api_pumpOpen0 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen1")
      val api_pumpOpen1 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen2")
      val api_pumpOpen2 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen3")
      val api_pumpOpen3 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRate")
      val api_steamRate = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_waterLevel")
      val api_waterLevel = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      return BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P(api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = {
      val r = parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(F)
      return r
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS")
      }
      parser.parseObjectKey("In_C")
      val In_C = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_M1")
      val In_M1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_M2")
      val In_M2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_N1")
      val In_N1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_N2")
      val In_N2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_P")
      val In_P = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_U1")
      val In_U1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_U2")
      val In_U2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_W")
      val In_W = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_hasBoilerSentWaiting")
      val In_hasBoilerSentWaiting = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPump0Failing")
      val In_isPump0Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPump1Failing")
      val In_isPump1Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPump2Failing")
      val In_isPump2Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isPump3Failing")
      val In_isPump3Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isSteamMeterFailing")
      val In_isSteamMeterFailing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_isWaterMeterFailing")
      val In_isWaterMeterFailing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_mode")
      val In_mode = parseBoilerControlOpModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_p0")
      val In_p0 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_p1")
      val In_p1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_p2")
      val In_p2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_p3")
      val In_p3 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_q")
      val In_q = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_qa1")
      val In_qa1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_qa2")
      val In_qa2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_qc1")
      val In_qc1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_qc2")
      val In_qc2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("In_shouldUpdatePumps")
      val In_shouldUpdatePumps = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_transmissionFailure")
      val In_transmissionFailure = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_v_steamRate")
      val In_v_steamRate = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_boilerReady")
      val api_boilerReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_boilerWaiting")
      val api_boilerWaiting = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelFailAck")
      val api_levelFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepair")
      val api_levelRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck0")
      val api_pumpControlFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck1")
      val api_pumpControlFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck2")
      val api_pumpControlFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFailAck3")
      val api_pumpControlFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady0")
      val api_pumpControlReady0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady1")
      val api_pumpControlReady1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady2")
      val api_pumpControlReady2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlReady3")
      val api_pumpControlReady3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair0")
      val api_pumpControlRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair1")
      val api_pumpControlRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair2")
      val api_pumpControlRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepair3")
      val api_pumpControlRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck0")
      val api_pumpFailAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck1")
      val api_pumpFailAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck2")
      val api_pumpFailAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFailAck3")
      val api_pumpFailAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair0")
      val api_pumpRepair0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair1")
      val api_pumpRepair1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair2")
      val api_pumpRepair2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepair3")
      val api_pumpRepair3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFailAck")
      val api_steamFailAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamMeterReady")
      val api_steamMeterReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepair")
      val api_steamRepair = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_stop")
      val api_stop = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_waterMeterReady")
      val api_waterMeterReady = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow0")
      val api_pumpFlow0 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow1")
      val api_pumpFlow1 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow2")
      val api_pumpFlow2 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFlow3")
      val api_pumpFlow3 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen0")
      val api_pumpOpen0 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen1")
      val api_pumpOpen1 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen2")
      val api_pumpOpen2 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpOpen3")
      val api_pumpOpen3 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRate")
      val api_steamRate = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_waterLevel")
      val api_waterLevel = parser.parseOption(parser.parseF32 _)
      parser.parseObjectNext()
      return BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS(In_C, In_M1, In_M2, In_N1, In_N2, In_P, In_U1, In_U2, In_W, In_hasBoilerSentWaiting, In_isPump0Failing, In_isPump1Failing, In_isPump2Failing, In_isPump3Failing, In_isSteamMeterFailing, In_isWaterMeterFailing, In_mode, In_p0, In_p1, In_p2, In_p3, In_q, In_qa1, In_qa2, In_qc1, In_qc2, In_shouldUpdatePumps, In_transmissionFailure, In_v_steamRate, api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P", "BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS"))
      t.native match {
        case "BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(T); return r
        case "BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(T); return r
      }
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = {
      val r = parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(F)
      return r
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_levelFail")
      val api_levelFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepairAck")
      val api_levelRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail0")
      val api_pumpControlFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail1")
      val api_pumpControlFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail2")
      val api_pumpControlFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail3")
      val api_pumpControlFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck0")
      val api_pumpControlRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck1")
      val api_pumpControlRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck2")
      val api_pumpControlRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck3")
      val api_pumpControlRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail0")
      val api_pumpFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail1")
      val api_pumpFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail2")
      val api_pumpFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail3")
      val api_pumpFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck0")
      val api_pumpRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck1")
      val api_pumpRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck2")
      val api_pumpRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck3")
      val api_pumpRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFail")
      val api_steamFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepairAck")
      val api_steamRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_valve")
      val api_valve = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump0")
      val api_openPump0 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump1")
      val api_openPump1 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump2")
      val api_openPump2 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump3")
      val api_openPump3 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = {
      val r = parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(F)
      return r
    }

    def parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS")
      }
      parser.parseObjectKey("C")
      val C = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("M1")
      val M1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("M2")
      val M2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("N1")
      val N1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("N2")
      val N2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("P")
      val P = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("U1")
      val U1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("U2")
      val U2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("W")
      val W = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("hasBoilerSentWaiting")
      val hasBoilerSentWaiting = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPump0Failing")
      val isPump0Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPump1Failing")
      val isPump1Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPump2Failing")
      val isPump2Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isPump3Failing")
      val isPump3Failing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isSteamMeterFailing")
      val isSteamMeterFailing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("isWaterMeterFailing")
      val isWaterMeterFailing = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parseBoilerControlOpModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("p0")
      val p0 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("p1")
      val p1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("p2")
      val p2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("p3")
      val p3 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("q")
      val q = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("qa1")
      val qa1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("qa2")
      val qa2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("qc1")
      val qc1 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("qc2")
      val qc2 = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("shouldUpdatePumps")
      val shouldUpdatePumps = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("transmissionFailure")
      val transmissionFailure = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("v_steamRate")
      val v_steamRate = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelFail")
      val api_levelFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_levelRepairAck")
      val api_levelRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail0")
      val api_pumpControlFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail1")
      val api_pumpControlFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail2")
      val api_pumpControlFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlFail3")
      val api_pumpControlFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck0")
      val api_pumpControlRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck1")
      val api_pumpControlRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck2")
      val api_pumpControlRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpControlRepairAck3")
      val api_pumpControlRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail0")
      val api_pumpFail0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail1")
      val api_pumpFail1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail2")
      val api_pumpFail2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpFail3")
      val api_pumpFail3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck0")
      val api_pumpRepairAck0 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck1")
      val api_pumpRepairAck1 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck2")
      val api_pumpRepairAck2 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_pumpRepairAck3")
      val api_pumpRepairAck3 = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_ready")
      val api_ready = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamFail")
      val api_steamFail = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_steamRepairAck")
      val api_steamRepairAck = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_valve")
      val api_valve = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_opMode")
      val api_opMode = parser.parseOption(parseBoilerControlOpModeType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump0")
      val api_openPump0 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump1")
      val api_openPump1 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump2")
      val api_openPump2 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_openPump3")
      val api_openPump3 = parser.parseOption(parser.parseB _)
      parser.parseObjectNext()
      return BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS(C, M1, M2, N1, N2, P, U1, U2, W, hasBoilerSentWaiting, isPump0Failing, isPump1Failing, isPump2Failing, isPump3Failing, isSteamMeterFailing, isWaterMeterFailing, mode, p0, p1, p2, p3, q, qa1, qa2, qc1, qc2, shouldUpdatePumps, transmissionFailure, v_steamRate, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "art.Empty", "BoilerControl.OpMode_Payload", "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P", "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS", "BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P", "BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS", "BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P", "BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS", "BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P", "BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS", "BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P", "BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P", "BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS", "BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS", "BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P", "BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P", "BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS", "BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS", "BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P", "BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS", "BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P", "BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P", "BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS", "BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS"))
      t.native match {
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "BoilerControl.OpMode_Payload" => val r = parseBoilerControlOpMode_PayloadT(T); return r
        case "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(T); return r
        case "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(T); return r
        case "BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(T); return r
        case "BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS" => val r = parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(T); return r
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(T); return r
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(T); return r
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(T); return r
        case "BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS" => val r = parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(T); return r
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(T); return r
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(T); return r
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(T); return r
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(T); return r
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(T); return r
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(T); return r
        case "BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS" => val r = parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(T); return r
        case "BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS" => val r = parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(T); return r
        case "BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(T); return r
        case "BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(T); return r
        case "BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(T); return r
        case "BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS" => val r = parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(T); return r
        case "BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS" => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T); return r
        case _ => val r = parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromBoilerControlOpMode_Payload(o: BoilerControl.OpMode_Payload, isCompact: B): String = {
    val st = Printer.printBoilerControlOpMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlOpMode_Payload(s: String): Either[BoilerControl.OpMode_Payload, Json.ErrorMsg] = {
    def fBoilerControlOpMode_Payload(parser: Parser): BoilerControl.OpMode_Payload = {
      val r = parser.parseBoilerControlOpMode_Payload()
      return r
    }
    val r = to(s, fBoilerControlOpMode_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlBoiler_i_bcproc_boiler_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PreState_Container(s: String): Either[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PreState_Container(parser: Parser): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container = {
      val r = parser.parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlBoiler_i_bcproc_boiler_PreState_Container _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(s: String): Either[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(parser: Parser): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = {
      val r = parser.parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(s: String): Either[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(parser: Parser): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = {
      val r = parser.parseBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PostState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlBoiler_i_bcproc_boiler_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PostState_Container(s: String): Either[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PostState_Container(parser: Parser): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container = {
      val r = parser.parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlBoiler_i_bcproc_boiler_PostState_Container _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(s: String): Either[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(parser: Parser): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = {
      val r = parser.parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(s: String): Either[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(parser: Parser): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
      val r = parser.parseBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(s: String): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(parser: Parser): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {
      val r = parser.parseBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(s: String): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(parser: Parser): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container = {
      val r = parser.parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(s: String): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(parser: Parser): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = {
      val r = parser.parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(s: String): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(parser: Parser): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {
      val r = parser.parseBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(s: String): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(parser: Parser): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container = {
      val r = parser.parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(s: String): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(parser: Parser): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = {
      val r = parser.parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(s: String): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(parser: Parser): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
      val r = parser.parseBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(s: String): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(parser: Parser): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container = {
      val r = parser.parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(s: String): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(parser: Parser): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
      val r = parser.parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(s: String): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(parser: Parser): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
      val r = parser.parseBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(s: String): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(parser: Parser): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container = {
      val r = parser.parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(s: String): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(parser: Parser): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = {
      val r = parser.parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(s: String): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(parser: Parser): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {
      val r = parser.parseBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(s: String): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(parser: Parser): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container = {
      val r = parser.parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(s: String): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(parser: Parser): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = {
      val r = parser.parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(s: String): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(parser: Parser): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
      val r = parser.parseBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(s: String): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(parser: Parser): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container = {
      val r = parser.parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(s: String): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(parser: Parser): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = {
      val r = parser.parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(s: String): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(parser: Parser): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = {
      val r = parser.parseBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PreState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlBoilerControl_i_bcproc_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PreState_Container(s: String): Either[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container, Json.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PreState_Container(parser: Parser): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container = {
      val r = parser.parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container()
      return r
    }
    val r = to(s, fBoilerControlBoilerControl_i_bcproc_control_PreState_Container _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(s: String): Either[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(parser: Parser): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = {
      val r = parser.parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(s: String): Either[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(parser: Parser): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = {
      val r = parser.parseBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PostState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printBoilerControlBoilerControl_i_bcproc_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PostState_Container(s: String): Either[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container, Json.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PostState_Container(parser: Parser): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container = {
      val r = parser.parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container()
      return r
    }
    val r = to(s, fBoilerControlBoilerControl_i_bcproc_control_PostState_Container _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(s: String): Either[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P, Json.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(parser: Parser): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = {
      val r = parser.parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P()
      return r
    }
    val r = to(s, fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(s: String): Either[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(parser: Parser): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = {
      val r = parser.parseBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}