// #Sireum
// @formatter:off

// This file is auto-generated from OpMode.scala, Base_Types.scala, Boiler_i_bcproc_boiler__Containers.scala, PumpControl_i_bcproc_pumpControl0__Containers.scala, PumpControl_i_bcproc_pumpControl1__Containers.scala, PumpControl_i_bcproc_pumpControl2__Containers.scala, PumpControl_i_bcproc_pumpControl3__Containers.scala, WaterMeter_i_bcproc_waterMeter__Containers.scala, SteamMeter_i_bcproc_steamMeter__Containers.scala, OperatorDesk_i_bcproc_desk__Containers.scala, BoilerControl_i_bcproc_control__Containers.scala, ObservationKind.scala, DataContent.scala, Aux_Types.scala

package bc

import org.sireum._

object MsgPack {

  object Constants {

    val BoilerControlOpMode_Payload: Z = -32

    val Base_TypesBoolean_Payload: Z = -31

    val Base_TypesInteger_Payload: Z = -30

    val Base_TypesInteger_8_Payload: Z = -29

    val Base_TypesInteger_16_Payload: Z = -28

    val Base_TypesInteger_32_Payload: Z = -27

    val Base_TypesInteger_64_Payload: Z = -26

    val Base_TypesUnsigned_8_Payload: Z = -25

    val Base_TypesUnsigned_16_Payload: Z = -24

    val Base_TypesUnsigned_32_Payload: Z = -23

    val Base_TypesUnsigned_64_Payload: Z = -22

    val Base_TypesFloat_Payload: Z = -21

    val Base_TypesFloat_32_Payload: Z = -20

    val Base_TypesFloat_64_Payload: Z = -19

    val Base_TypesCharacter_Payload: Z = -18

    val Base_TypesString_Payload: Z = -17

    val Base_TypesBits_Payload: Z = -16

    val BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P: Z = -15

    val BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS: Z = -14

    val BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P: Z = -13

    val BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS: Z = -12

    val BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P: Z = -11

    val BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS: Z = -10

    val BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P: Z = -9

    val BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS: Z = -8

    val BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P: Z = -7

    val BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS: Z = -6

    val BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P: Z = -5

    val BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS: Z = -4

    val BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P: Z = -3

    val BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS: Z = -2

    val BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P: Z = -1

    val BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS: Z = 0

    val BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P: Z = 1

    val BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS: Z = 2

    val BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P: Z = 3

    val BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS: Z = 4

    val BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P: Z = 5

    val BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS: Z = 6

    val BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P: Z = 7

    val BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS: Z = 8

    val BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P: Z = 9

    val BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS: Z = 10

    val BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P: Z = 11

    val BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS: Z = 12

    val BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P: Z = 13

    val BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS: Z = 14

    val BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P: Z = 15

    val BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS: Z = 16

    val BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P: Z = 17

    val BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS: Z = 18

    val BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P: Z = 19

    val BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS: Z = 20

    val _artEmpty: Z = 21

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeBoilerControlOpModeType(o: BoilerControl.OpMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeBoilerControlOpMode_Payload(o: BoilerControl.OpMode_Payload): Unit = {
      writer.writeZ(Constants.BoilerControlOpMode_Payload)
      writeBoilerControlOpModeType(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P => writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS => writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_valve, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS)
      writeBoilerControlOpModeType(o.In_Mode)
      writer.writeB(o.In_ValveOpen)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_valve, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P => writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS => writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_waiting, write_artEmpty _)
    }

    def writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS)
      writeBoilerControlOpModeType(o.Mode)
      writer.writeB(o.ValveOpen)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_waiting, write_artEmpty _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS)
      writer.writeB(o.In_isPumpFlow)
      writer.writeB(o.In_isPumpOpen)
      writer.writeZ(o.In_pumpNumber)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS)
      writer.writeB(o.isPumpFlow)
      writer.writeB(o.isPumpOpen)
      writer.writeZ(o.pumpNumber)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS)
      writer.writeB(o.In_isPumpFlow)
      writer.writeB(o.In_isPumpOpen)
      writer.writeZ(o.In_pumpNumber)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS)
      writer.writeB(o.isPumpFlow)
      writer.writeB(o.isPumpOpen)
      writer.writeZ(o.pumpNumber)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS)
      writer.writeB(o.In_isPumpFlow)
      writer.writeB(o.In_isPumpOpen)
      writer.writeZ(o.In_pumpNumber)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS)
      writer.writeB(o.isPumpFlow)
      writer.writeB(o.isPumpOpen)
      writer.writeZ(o.pumpNumber)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS)
      writer.writeB(o.In_isPumpFlow)
      writer.writeB(o.In_isPumpOpen)
      writer.writeZ(o.In_pumpNumber)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS)
      writer.writeB(o.isPumpFlow)
      writer.writeB(o.isPumpOpen)
      writer.writeZ(o.pumpNumber)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow, writer.writeB _)
      writer.writeOption(o.api_pumpOpen, writer.writeB _)
    }

    def writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS)
      writer.writeF32(o.In_volume)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_level, writer.writeF32 _)
    }

    def writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS)
      writer.writeF32(o.volume)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_level, writer.writeF32 _)
    }

    def writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS)
      writer.writeF32(o.In_computedRate)
      writer.writeF32(o.In_volume)
      writer.writeOption(o.api_programReady, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_rate, writer.writeF32 _)
    }

    def writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS)
      writer.writeF32(o.computedRate)
      writer.writeF32(o.volume)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_rate, writer.writeF32 _)
    }

    def writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P => writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS => writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P)
      writer.writeOption(o.api_levelFail, write_artEmpty _)
      writer.writeOption(o.api_levelRepairAck, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_steamFail, write_artEmpty _)
      writer.writeOption(o.api_steamRepairAck, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS)
      writer.writeB(o.In_isLevelBroken)
      writer.writeB(o.In_isPumpBroken0)
      writer.writeB(o.In_isPumpBroken1)
      writer.writeB(o.In_isPumpBroken2)
      writer.writeB(o.In_isPumpBroken3)
      writer.writeB(o.In_isPumpControlBroken0)
      writer.writeB(o.In_isPumpControlBroken1)
      writer.writeB(o.In_isPumpControlBroken2)
      writer.writeB(o.In_isPumpControlBroken3)
      writer.writeB(o.In_isSteamBroken)
      writer.writeOption(o.api_levelFail, write_artEmpty _)
      writer.writeOption(o.api_levelRepairAck, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_steamFail, write_artEmpty _)
      writer.writeOption(o.api_steamRepairAck, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
    }

    def writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P => writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS => writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P)
      writer.writeOption(o.api_levelFailAck, write_artEmpty _)
      writer.writeOption(o.api_levelRepair, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair3, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair3, write_artEmpty _)
      writer.writeOption(o.api_steamFailAck, write_artEmpty _)
      writer.writeOption(o.api_steamRepair, write_artEmpty _)
      writer.writeOption(o.api_stop, write_artEmpty _)
    }

    def writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS)
      writer.writeB(o.isLevelBroken)
      writer.writeB(o.isPumpBroken0)
      writer.writeB(o.isPumpBroken1)
      writer.writeB(o.isPumpBroken2)
      writer.writeB(o.isPumpBroken3)
      writer.writeB(o.isPumpControlBroken0)
      writer.writeB(o.isPumpControlBroken1)
      writer.writeB(o.isPumpControlBroken2)
      writer.writeB(o.isPumpControlBroken3)
      writer.writeB(o.isSteamBroken)
      writer.writeOption(o.api_levelFailAck, write_artEmpty _)
      writer.writeOption(o.api_levelRepair, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair3, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair3, write_artEmpty _)
      writer.writeOption(o.api_steamFailAck, write_artEmpty _)
      writer.writeOption(o.api_steamRepair, write_artEmpty _)
      writer.writeOption(o.api_stop, write_artEmpty _)
    }

    def writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container): Unit = {
      o match {
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P => writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS => writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o)
      }
    }

    def writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P)
      writer.writeOption(o.api_boilerReady, write_artEmpty _)
      writer.writeOption(o.api_boilerWaiting, write_artEmpty _)
      writer.writeOption(o.api_levelFailAck, write_artEmpty _)
      writer.writeOption(o.api_levelRepair, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair3, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair3, write_artEmpty _)
      writer.writeOption(o.api_steamFailAck, write_artEmpty _)
      writer.writeOption(o.api_steamMeterReady, write_artEmpty _)
      writer.writeOption(o.api_steamRepair, write_artEmpty _)
      writer.writeOption(o.api_stop, write_artEmpty _)
      writer.writeOption(o.api_waterMeterReady, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow0, writer.writeB _)
      writer.writeOption(o.api_pumpFlow1, writer.writeB _)
      writer.writeOption(o.api_pumpFlow2, writer.writeB _)
      writer.writeOption(o.api_pumpFlow3, writer.writeB _)
      writer.writeOption(o.api_pumpOpen0, writer.writeB _)
      writer.writeOption(o.api_pumpOpen1, writer.writeB _)
      writer.writeOption(o.api_pumpOpen2, writer.writeB _)
      writer.writeOption(o.api_pumpOpen3, writer.writeB _)
      writer.writeOption(o.api_steamRate, writer.writeF32 _)
      writer.writeOption(o.api_waterLevel, writer.writeF32 _)
    }

    def writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS)
      writer.writeF32(o.In_C)
      writer.writeF32(o.In_M1)
      writer.writeF32(o.In_M2)
      writer.writeF32(o.In_N1)
      writer.writeF32(o.In_N2)
      writer.writeF32(o.In_P)
      writer.writeF32(o.In_U1)
      writer.writeF32(o.In_U2)
      writer.writeF32(o.In_W)
      writer.writeB(o.In_hasBoilerSentWaiting)
      writer.writeB(o.In_isPump0Failing)
      writer.writeB(o.In_isPump1Failing)
      writer.writeB(o.In_isPump2Failing)
      writer.writeB(o.In_isPump3Failing)
      writer.writeB(o.In_isSteamMeterFailing)
      writer.writeB(o.In_isWaterMeterFailing)
      writeBoilerControlOpModeType(o.In_mode)
      writer.writeF32(o.In_p0)
      writer.writeF32(o.In_p1)
      writer.writeF32(o.In_p2)
      writer.writeF32(o.In_p3)
      writer.writeF32(o.In_q)
      writer.writeF32(o.In_qa1)
      writer.writeF32(o.In_qa2)
      writer.writeF32(o.In_qc1)
      writer.writeF32(o.In_qc2)
      writer.writeB(o.In_shouldUpdatePumps)
      writer.writeB(o.In_transmissionFailure)
      writer.writeF32(o.In_v_steamRate)
      writer.writeOption(o.api_boilerReady, write_artEmpty _)
      writer.writeOption(o.api_boilerWaiting, write_artEmpty _)
      writer.writeOption(o.api_levelFailAck, write_artEmpty _)
      writer.writeOption(o.api_levelRepair, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlReady3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepair3, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpFailAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepair3, write_artEmpty _)
      writer.writeOption(o.api_steamFailAck, write_artEmpty _)
      writer.writeOption(o.api_steamMeterReady, write_artEmpty _)
      writer.writeOption(o.api_steamRepair, write_artEmpty _)
      writer.writeOption(o.api_stop, write_artEmpty _)
      writer.writeOption(o.api_waterMeterReady, write_artEmpty _)
      writer.writeOption(o.api_pumpFlow0, writer.writeB _)
      writer.writeOption(o.api_pumpFlow1, writer.writeB _)
      writer.writeOption(o.api_pumpFlow2, writer.writeB _)
      writer.writeOption(o.api_pumpFlow3, writer.writeB _)
      writer.writeOption(o.api_pumpOpen0, writer.writeB _)
      writer.writeOption(o.api_pumpOpen1, writer.writeB _)
      writer.writeOption(o.api_pumpOpen2, writer.writeB _)
      writer.writeOption(o.api_pumpOpen3, writer.writeB _)
      writer.writeOption(o.api_steamRate, writer.writeF32 _)
      writer.writeOption(o.api_waterLevel, writer.writeF32 _)
    }

    def writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container): Unit = {
      o match {
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P => writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS => writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o)
      }
    }

    def writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P): Unit = {
      writer.writeZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P)
      writer.writeOption(o.api_levelFail, write_artEmpty _)
      writer.writeOption(o.api_levelRepairAck, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_steamFail, write_artEmpty _)
      writer.writeOption(o.api_steamRepairAck, write_artEmpty _)
      writer.writeOption(o.api_valve, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump0, writer.writeB _)
      writer.writeOption(o.api_openPump1, writer.writeB _)
      writer.writeOption(o.api_openPump2, writer.writeB _)
      writer.writeOption(o.api_openPump3, writer.writeB _)
    }

    def writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS)
      writer.writeF32(o.C)
      writer.writeF32(o.M1)
      writer.writeF32(o.M2)
      writer.writeF32(o.N1)
      writer.writeF32(o.N2)
      writer.writeF32(o.P)
      writer.writeF32(o.U1)
      writer.writeF32(o.U2)
      writer.writeF32(o.W)
      writer.writeB(o.hasBoilerSentWaiting)
      writer.writeB(o.isPump0Failing)
      writer.writeB(o.isPump1Failing)
      writer.writeB(o.isPump2Failing)
      writer.writeB(o.isPump3Failing)
      writer.writeB(o.isSteamMeterFailing)
      writer.writeB(o.isWaterMeterFailing)
      writeBoilerControlOpModeType(o.mode)
      writer.writeF32(o.p0)
      writer.writeF32(o.p1)
      writer.writeF32(o.p2)
      writer.writeF32(o.p3)
      writer.writeF32(o.q)
      writer.writeF32(o.qa1)
      writer.writeF32(o.qa2)
      writer.writeF32(o.qc1)
      writer.writeF32(o.qc2)
      writer.writeB(o.shouldUpdatePumps)
      writer.writeB(o.transmissionFailure)
      writer.writeF32(o.v_steamRate)
      writer.writeOption(o.api_levelFail, write_artEmpty _)
      writer.writeOption(o.api_levelRepairAck, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpControlRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_pumpFail0, write_artEmpty _)
      writer.writeOption(o.api_pumpFail1, write_artEmpty _)
      writer.writeOption(o.api_pumpFail2, write_artEmpty _)
      writer.writeOption(o.api_pumpFail3, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck0, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck1, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck2, write_artEmpty _)
      writer.writeOption(o.api_pumpRepairAck3, write_artEmpty _)
      writer.writeOption(o.api_ready, write_artEmpty _)
      writer.writeOption(o.api_steamFail, write_artEmpty _)
      writer.writeOption(o.api_steamRepairAck, write_artEmpty _)
      writer.writeOption(o.api_valve, write_artEmpty _)
      writer.writeOption(o.api_opMode, writeBoilerControlOpModeType _)
      writer.writeOption(o.api_openPump0, writer.writeB _)
      writer.writeOption(o.api_openPump1, writer.writeB _)
      writer.writeOption(o.api_openPump2, writer.writeB _)
      writer.writeOption(o.api_openPump3, writer.writeB _)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: art.Empty => write_artEmpty(o)
        case o: BoilerControl.OpMode_Payload => writeBoilerControlOpMode_Payload(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P => writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS => writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P => writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o)
        case o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS => writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P => writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS => writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P => writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o)
        case o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS => writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o)
        case o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS => writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o)
        case o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS => writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P => writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS => writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P => writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o)
        case o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS => writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o)
        case o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS => writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readBoilerControlOpModeType(): BoilerControl.OpMode.Type = {
      val r = reader.readZ()
      return BoilerControl.OpMode.byOrdinal(r).get
    }

    def readBoilerControlOpMode_Payload(): BoilerControl.OpMode_Payload = {
      val r = readBoilerControlOpMode_PayloadT(F)
      return r
    }

    def readBoilerControlOpMode_PayloadT(typeParsed: B): BoilerControl.OpMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlOpMode_Payload)
      }
      val value = readBoilerControlOpModeType()
      return BoilerControl.OpMode_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PreState_Container(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P => val r = readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(T); return r
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS => val r = readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.Boiler_i_bcproc_boiler_PreState_Container.")
          val r = readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = {
      val r = readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P)
      }
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_valve = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P(api_programReady, api_valve, api_opMode)
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = {
      val r = readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS)
      }
      val In_Mode = readBoilerControlOpModeType()
      val In_ValveOpen = reader.readB()
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_valve = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS(In_Mode, In_ValveOpen, api_programReady, api_valve, api_opMode)
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PostState_Container(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P => val r = readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(T); return r
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS => val r = readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.Boiler_i_bcproc_boiler_PostState_Container.")
          val r = readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = {
      val r = readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P)
      }
      val api_ready = reader.readOption(read_artEmpty _)
      val api_waiting = reader.readOption(read_artEmpty _)
      return BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P(api_ready, api_waiting)
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
      val r = readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(typeParsed: B): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS)
      }
      val Mode = readBoilerControlOpModeType()
      val ValveOpen = reader.readB()
      val api_ready = reader.readOption(read_artEmpty _)
      val api_waiting = reader.readOption(read_artEmpty _)
      return BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS(Mode, ValveOpen, api_ready, api_waiting)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P)
      }
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS)
      }
      val In_isPumpFlow = reader.readB()
      val In_isPumpOpen = reader.readB()
      val In_pumpNumber = reader.readZ()
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P)
      }
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS)
      }
      val isPumpFlow = reader.readB()
      val isPumpOpen = reader.readB()
      val pumpNumber = reader.readZ()
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P)
      }
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS)
      }
      val In_isPumpFlow = reader.readB()
      val In_isPumpOpen = reader.readB()
      val In_pumpNumber = reader.readZ()
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P)
      }
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS)
      }
      val isPumpFlow = reader.readB()
      val isPumpOpen = reader.readB()
      val pumpNumber = reader.readZ()
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P)
      }
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS)
      }
      val In_isPumpFlow = reader.readB()
      val In_isPumpOpen = reader.readB()
      val In_pumpNumber = reader.readZ()
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P)
      }
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS)
      }
      val isPumpFlow = reader.readB()
      val isPumpOpen = reader.readB()
      val pumpNumber = reader.readZ()
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P)
      }
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P(api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS)
      }
      val In_isPumpFlow = reader.readB()
      val In_isPumpOpen = reader.readB()
      val In_pumpNumber = reader.readZ()
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P)
      }
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {
      val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(typeParsed: B): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS)
      }
      val isPumpFlow = reader.readB()
      val isPumpOpen = reader.readB()
      val pumpNumber = reader.readZ()
      val api_ready = reader.readOption(read_artEmpty _)
      val api_pumpFlow = reader.readOption(reader.readB _)
      val api_pumpOpen = reader.readOption(reader.readB _)
      return BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(T); return r
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container.")
          val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = {
      val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P)
      }
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P(api_programReady, api_opMode)
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {
      val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS)
      }
      val In_volume = reader.readF32()
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS(In_volume, api_programReady, api_opMode)
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(T); return r
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container.")
          val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = {
      val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P)
      }
      val api_ready = reader.readOption(read_artEmpty _)
      val api_level = reader.readOption(reader.readF32 _)
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P(api_ready, api_level)
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
      val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(typeParsed: B): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS)
      }
      val volume = reader.readF32()
      val api_ready = reader.readOption(read_artEmpty _)
      val api_level = reader.readOption(reader.readF32 _)
      return BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS(volume, api_ready, api_level)
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(T); return r
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container.")
          val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
      val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P)
      }
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P(api_programReady, api_opMode)
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
      val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS)
      }
      val In_computedRate = reader.readF32()
      val In_volume = reader.readF32()
      val api_programReady = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS(In_computedRate, In_volume, api_programReady, api_opMode)
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(T); return r
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container.")
          val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = {
      val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P)
      }
      val api_ready = reader.readOption(read_artEmpty _)
      val api_rate = reader.readOption(reader.readF32 _)
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P(api_ready, api_rate)
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {
      val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(typeParsed: B): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS)
      }
      val computedRate = reader.readF32()
      val volume = reader.readF32()
      val api_ready = reader.readOption(read_artEmpty _)
      val api_rate = reader.readOption(reader.readF32 _)
      return BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS(computedRate, volume, api_ready, api_rate)
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(T); return r
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container.")
          val r = readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = {
      val r = readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P)
      }
      val api_levelFail = reader.readOption(read_artEmpty _)
      val api_levelRepairAck = reader.readOption(read_artEmpty _)
      val api_pumpControlFail0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck3 = reader.readOption(read_artEmpty _)
      val api_pumpFail0 = reader.readOption(read_artEmpty _)
      val api_pumpFail1 = reader.readOption(read_artEmpty _)
      val api_pumpFail2 = reader.readOption(read_artEmpty _)
      val api_pumpFail3 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck3 = reader.readOption(read_artEmpty _)
      val api_steamFail = reader.readOption(read_artEmpty _)
      val api_steamRepairAck = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
      val r = readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS)
      }
      val In_isLevelBroken = reader.readB()
      val In_isPumpBroken0 = reader.readB()
      val In_isPumpBroken1 = reader.readB()
      val In_isPumpBroken2 = reader.readB()
      val In_isPumpBroken3 = reader.readB()
      val In_isPumpControlBroken0 = reader.readB()
      val In_isPumpControlBroken1 = reader.readB()
      val In_isPumpControlBroken2 = reader.readB()
      val In_isPumpControlBroken3 = reader.readB()
      val In_isSteamBroken = reader.readB()
      val api_levelFail = reader.readOption(read_artEmpty _)
      val api_levelRepairAck = reader.readOption(read_artEmpty _)
      val api_pumpControlFail0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck3 = reader.readOption(read_artEmpty _)
      val api_pumpFail0 = reader.readOption(read_artEmpty _)
      val api_pumpFail1 = reader.readOption(read_artEmpty _)
      val api_pumpFail2 = reader.readOption(read_artEmpty _)
      val api_pumpFail3 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck3 = reader.readOption(read_artEmpty _)
      val api_steamFail = reader.readOption(read_artEmpty _)
      val api_steamRepairAck = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      return BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS(In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(T); return r
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container.")
          val r = readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = {
      val r = readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P)
      }
      val api_levelFailAck = reader.readOption(read_artEmpty _)
      val api_levelRepair = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair3 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpRepair3 = reader.readOption(read_artEmpty _)
      val api_steamFailAck = reader.readOption(read_artEmpty _)
      val api_steamRepair = reader.readOption(read_artEmpty _)
      val api_stop = reader.readOption(read_artEmpty _)
      return BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P(api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = {
      val r = readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(typeParsed: B): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS)
      }
      val isLevelBroken = reader.readB()
      val isPumpBroken0 = reader.readB()
      val isPumpBroken1 = reader.readB()
      val isPumpBroken2 = reader.readB()
      val isPumpBroken3 = reader.readB()
      val isPumpControlBroken0 = reader.readB()
      val isPumpControlBroken1 = reader.readB()
      val isPumpControlBroken2 = reader.readB()
      val isPumpControlBroken3 = reader.readB()
      val isSteamBroken = reader.readB()
      val api_levelFailAck = reader.readOption(read_artEmpty _)
      val api_levelRepair = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair3 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpRepair3 = reader.readOption(read_artEmpty _)
      val api_steamFailAck = reader.readOption(read_artEmpty _)
      val api_steamRepair = reader.readOption(read_artEmpty _)
      val api_stop = reader.readOption(read_artEmpty _)
      return BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS(isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PreState_Container(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P => val r = readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(T); return r
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS => val r = readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.BoilerControl_i_bcproc_control_PreState_Container.")
          val r = readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = {
      val r = readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(F)
      return r
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P)
      }
      val api_boilerReady = reader.readOption(read_artEmpty _)
      val api_boilerWaiting = reader.readOption(read_artEmpty _)
      val api_levelFailAck = reader.readOption(read_artEmpty _)
      val api_levelRepair = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady0 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady1 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady2 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair3 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpRepair3 = reader.readOption(read_artEmpty _)
      val api_steamFailAck = reader.readOption(read_artEmpty _)
      val api_steamMeterReady = reader.readOption(read_artEmpty _)
      val api_steamRepair = reader.readOption(read_artEmpty _)
      val api_stop = reader.readOption(read_artEmpty _)
      val api_waterMeterReady = reader.readOption(read_artEmpty _)
      val api_pumpFlow0 = reader.readOption(reader.readB _)
      val api_pumpFlow1 = reader.readOption(reader.readB _)
      val api_pumpFlow2 = reader.readOption(reader.readB _)
      val api_pumpFlow3 = reader.readOption(reader.readB _)
      val api_pumpOpen0 = reader.readOption(reader.readB _)
      val api_pumpOpen1 = reader.readOption(reader.readB _)
      val api_pumpOpen2 = reader.readOption(reader.readB _)
      val api_pumpOpen3 = reader.readOption(reader.readB _)
      val api_steamRate = reader.readOption(reader.readF32 _)
      val api_waterLevel = reader.readOption(reader.readF32 _)
      return BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P(api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = {
      val r = readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(F)
      return r
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS)
      }
      val In_C = reader.readF32()
      val In_M1 = reader.readF32()
      val In_M2 = reader.readF32()
      val In_N1 = reader.readF32()
      val In_N2 = reader.readF32()
      val In_P = reader.readF32()
      val In_U1 = reader.readF32()
      val In_U2 = reader.readF32()
      val In_W = reader.readF32()
      val In_hasBoilerSentWaiting = reader.readB()
      val In_isPump0Failing = reader.readB()
      val In_isPump1Failing = reader.readB()
      val In_isPump2Failing = reader.readB()
      val In_isPump3Failing = reader.readB()
      val In_isSteamMeterFailing = reader.readB()
      val In_isWaterMeterFailing = reader.readB()
      val In_mode = readBoilerControlOpModeType()
      val In_p0 = reader.readF32()
      val In_p1 = reader.readF32()
      val In_p2 = reader.readF32()
      val In_p3 = reader.readF32()
      val In_q = reader.readF32()
      val In_qa1 = reader.readF32()
      val In_qa2 = reader.readF32()
      val In_qc1 = reader.readF32()
      val In_qc2 = reader.readF32()
      val In_shouldUpdatePumps = reader.readB()
      val In_transmissionFailure = reader.readB()
      val In_v_steamRate = reader.readF32()
      val api_boilerReady = reader.readOption(read_artEmpty _)
      val api_boilerWaiting = reader.readOption(read_artEmpty _)
      val api_levelFailAck = reader.readOption(read_artEmpty _)
      val api_levelRepair = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady0 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady1 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady2 = reader.readOption(read_artEmpty _)
      val api_pumpControlReady3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepair3 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck0 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck1 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck2 = reader.readOption(read_artEmpty _)
      val api_pumpFailAck3 = reader.readOption(read_artEmpty _)
      val api_pumpRepair0 = reader.readOption(read_artEmpty _)
      val api_pumpRepair1 = reader.readOption(read_artEmpty _)
      val api_pumpRepair2 = reader.readOption(read_artEmpty _)
      val api_pumpRepair3 = reader.readOption(read_artEmpty _)
      val api_steamFailAck = reader.readOption(read_artEmpty _)
      val api_steamMeterReady = reader.readOption(read_artEmpty _)
      val api_steamRepair = reader.readOption(read_artEmpty _)
      val api_stop = reader.readOption(read_artEmpty _)
      val api_waterMeterReady = reader.readOption(read_artEmpty _)
      val api_pumpFlow0 = reader.readOption(reader.readB _)
      val api_pumpFlow1 = reader.readOption(reader.readB _)
      val api_pumpFlow2 = reader.readOption(reader.readB _)
      val api_pumpFlow3 = reader.readOption(reader.readB _)
      val api_pumpOpen0 = reader.readOption(reader.readB _)
      val api_pumpOpen1 = reader.readOption(reader.readB _)
      val api_pumpOpen2 = reader.readOption(reader.readB _)
      val api_pumpOpen3 = reader.readOption(reader.readB _)
      val api_steamRate = reader.readOption(reader.readF32 _)
      val api_waterLevel = reader.readOption(reader.readF32 _)
      return BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS(In_C, In_M1, In_M2, In_N1, In_N2, In_P, In_U1, In_U2, In_W, In_hasBoilerSentWaiting, In_isPump0Failing, In_isPump1Failing, In_isPump2Failing, In_isPump3Failing, In_isSteamMeterFailing, In_isWaterMeterFailing, In_mode, In_p0, In_p1, In_p2, In_p3, In_q, In_qa1, In_qa2, In_qc1, In_qc2, In_shouldUpdatePumps, In_transmissionFailure, In_v_steamRate, api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PostState_Container(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P => val r = readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(T); return r
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS => val r = readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of BoilerControl.BoilerControl_i_bcproc_control_PostState_Container.")
          val r = readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(T)
          return r
      }
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = {
      val r = readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(F)
      return r
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P)
      }
      val api_levelFail = reader.readOption(read_artEmpty _)
      val api_levelRepairAck = reader.readOption(read_artEmpty _)
      val api_pumpControlFail0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck3 = reader.readOption(read_artEmpty _)
      val api_pumpFail0 = reader.readOption(read_artEmpty _)
      val api_pumpFail1 = reader.readOption(read_artEmpty _)
      val api_pumpFail2 = reader.readOption(read_artEmpty _)
      val api_pumpFail3 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck3 = reader.readOption(read_artEmpty _)
      val api_ready = reader.readOption(read_artEmpty _)
      val api_steamFail = reader.readOption(read_artEmpty _)
      val api_steamRepairAck = reader.readOption(read_artEmpty _)
      val api_valve = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump0 = reader.readOption(reader.readB _)
      val api_openPump1 = reader.readOption(reader.readB _)
      val api_openPump2 = reader.readOption(reader.readB _)
      val api_openPump3 = reader.readOption(reader.readB _)
      return BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = {
      val r = readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(F)
      return r
    }

    def readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(typeParsed: B): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS)
      }
      val C = reader.readF32()
      val M1 = reader.readF32()
      val M2 = reader.readF32()
      val N1 = reader.readF32()
      val N2 = reader.readF32()
      val P = reader.readF32()
      val U1 = reader.readF32()
      val U2 = reader.readF32()
      val W = reader.readF32()
      val hasBoilerSentWaiting = reader.readB()
      val isPump0Failing = reader.readB()
      val isPump1Failing = reader.readB()
      val isPump2Failing = reader.readB()
      val isPump3Failing = reader.readB()
      val isSteamMeterFailing = reader.readB()
      val isWaterMeterFailing = reader.readB()
      val mode = readBoilerControlOpModeType()
      val p0 = reader.readF32()
      val p1 = reader.readF32()
      val p2 = reader.readF32()
      val p3 = reader.readF32()
      val q = reader.readF32()
      val qa1 = reader.readF32()
      val qa2 = reader.readF32()
      val qc1 = reader.readF32()
      val qc2 = reader.readF32()
      val shouldUpdatePumps = reader.readB()
      val transmissionFailure = reader.readB()
      val v_steamRate = reader.readF32()
      val api_levelFail = reader.readOption(read_artEmpty _)
      val api_levelRepairAck = reader.readOption(read_artEmpty _)
      val api_pumpControlFail0 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail1 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail2 = reader.readOption(read_artEmpty _)
      val api_pumpControlFail3 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpControlRepairAck3 = reader.readOption(read_artEmpty _)
      val api_pumpFail0 = reader.readOption(read_artEmpty _)
      val api_pumpFail1 = reader.readOption(read_artEmpty _)
      val api_pumpFail2 = reader.readOption(read_artEmpty _)
      val api_pumpFail3 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck0 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck1 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck2 = reader.readOption(read_artEmpty _)
      val api_pumpRepairAck3 = reader.readOption(read_artEmpty _)
      val api_ready = reader.readOption(read_artEmpty _)
      val api_steamFail = reader.readOption(read_artEmpty _)
      val api_steamRepairAck = reader.readOption(read_artEmpty _)
      val api_valve = reader.readOption(read_artEmpty _)
      val api_opMode = reader.readOption(readBoilerControlOpModeType _)
      val api_openPump0 = reader.readOption(reader.readB _)
      val api_openPump1 = reader.readOption(reader.readB _)
      val api_openPump2 = reader.readOption(reader.readB _)
      val api_openPump3 = reader.readOption(reader.readB _)
      return BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS(C, M1, M2, N1, N2, P, U1, U2, W, hasBoilerSentWaiting, isPump0Failing, isPump1Failing, isPump2Failing, isPump3Failing, isSteamMeterFailing, isWaterMeterFailing, mode, p0, p1, p2, p3, q, qa1, qa2, qc1, qc2, shouldUpdatePumps, transmissionFailure, v_steamRate, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.BoilerControlOpMode_Payload => val r = readBoilerControlOpMode_PayloadT(T); return r
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P => val r = readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PT(T); return r
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS => val r = readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PST(T); return r
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P => val r = readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PT(T); return r
        case Constants.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS => val r = readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PST(T); return r
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PT(T); return r
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PST(T); return r
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PT(T); return r
        case Constants.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS => val r = readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PST(T); return r
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PT(T); return r
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PT(T); return r
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PST(T); return r
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PST(T); return r
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PT(T); return r
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PT(T); return r
        case Constants.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS => val r = readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PST(T); return r
        case Constants.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS => val r = readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PST(T); return r
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P => val r = readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PT(T); return r
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS => val r = readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PST(T); return r
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P => val r = readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PT(T); return r
        case Constants.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS => val r = readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PT(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PST(T); return r
        case Constants.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS => val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromBoilerControlOpMode_Payload(o: BoilerControl.OpMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlOpMode_Payload(o)
    return w.result
  }

  def toBoilerControlOpMode_Payload(data: ISZ[U8]): Either[BoilerControl.OpMode_Payload, MessagePack.ErrorMsg] = {
    def fBoilerControlOpMode_Payload(reader: Reader): BoilerControl.OpMode_Payload = {
      val r = reader.readBoilerControlOpMode_Payload()
      return r
    }
    val r = to(data, fBoilerControlOpMode_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container(o)
    return w.result
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PreState_Container(data: ISZ[U8]): Either[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PreState_Container(reader: Reader): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container = {
      val r = reader.readBoilerControlBoiler_i_bcproc_boiler_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlBoiler_i_bcproc_boiler_PreState_Container _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(reader: Reader): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = {
      val r = reader.readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(reader: Reader): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = {
      val r = reader.readBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PostState_Container(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container(o)
    return w.result
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PostState_Container(data: ISZ[U8]): Either[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PostState_Container(reader: Reader): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container = {
      val r = reader.readBoilerControlBoiler_i_bcproc_boiler_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlBoiler_i_bcproc_boiler_PostState_Container _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(reader: Reader): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = {
      val r = reader.readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _)
    return r
  }

  def fromBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(reader: Reader): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
      val r = reader.readBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _)
    return r
  }

  def fromBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(reader: Reader): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {
      val r = reader.readBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(o)
    return w.result
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(data: ISZ[U8]): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(reader: Reader): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container = {
      val r = reader.readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(reader: Reader): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = {
      val r = reader.readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(reader: Reader): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {
      val r = reader.readBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(o)
    return w.result
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(data: ISZ[U8]): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(reader: Reader): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container = {
      val r = reader.readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(reader: Reader): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = {
      val r = reader.readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _)
    return r
  }

  def fromBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(reader: Reader): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
      val r = reader.readBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(o)
    return w.result
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(data: ISZ[U8]): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(reader: Reader): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container = {
      val r = reader.readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(reader: Reader): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
      val r = reader.readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(reader: Reader): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
      val r = reader.readBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(o)
    return w.result
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(data: ISZ[U8]): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(reader: Reader): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container = {
      val r = reader.readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(reader: Reader): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = {
      val r = reader.readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _)
    return r
  }

  def fromBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(reader: Reader): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {
      val r = reader.readBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(o)
    return w.result
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(data: ISZ[U8]): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(reader: Reader): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container = {
      val r = reader.readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(reader: Reader): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = {
      val r = reader.readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(reader: Reader): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
      val r = reader.readBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(o)
    return w.result
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(data: ISZ[U8]): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(reader: Reader): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container = {
      val r = reader.readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(reader: Reader): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = {
      val r = reader.readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _)
    return r
  }

  def fromBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(reader: Reader): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = {
      val r = reader.readBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PreState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container(o)
    return w.result
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PreState_Container(data: ISZ[U8]): Either[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PreState_Container(reader: Reader): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container = {
      val r = reader.readBoilerControlBoilerControl_i_bcproc_control_PreState_Container()
      return r
    }
    val r = to(data, fBoilerControlBoilerControl_i_bcproc_control_PreState_Container _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(o)
    return w.result
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(data: ISZ[U8]): Either[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(reader: Reader): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = {
      val r = reader.readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(o)
    return w.result
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(data: ISZ[U8]): Either[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(reader: Reader): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = {
      val r = reader.readBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PostState_Container(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container(o)
    return w.result
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PostState_Container(data: ISZ[U8]): Either[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container, MessagePack.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PostState_Container(reader: Reader): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container = {
      val r = reader.readBoilerControlBoilerControl_i_bcproc_control_PostState_Container()
      return r
    }
    val r = to(data, fBoilerControlBoilerControl_i_bcproc_control_PostState_Container _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(o)
    return w.result
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(data: ISZ[U8]): Either[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(reader: Reader): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = {
      val r = reader.readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P()
      return r
    }
    val r = to(data, fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _)
    return r
  }

  def fromBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(o)
    return w.result
  }

  def toBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(data: ISZ[U8]): Either[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(reader: Reader): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = {
      val r = reader.readBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS()
      return r
    }
    val r = to(data, fBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}