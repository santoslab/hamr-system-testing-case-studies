// #Sireum

package bc

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

OpMode.scala

Base_Types.scala

Boiler_i_bcproc_boiler__Containers.scala

PumpControl_i_bcproc_pumpControl0__Containers.scala

PumpControl_i_bcproc_pumpControl1__Containers.scala

PumpControl_i_bcproc_pumpControl2__Containers.scala

PumpControl_i_bcproc_pumpControl3__Containers.scala

WaterMeter_i_bcproc_waterMeter__Containers.scala

SteamMeter_i_bcproc_steamMeter__Containers.scala

OperatorDesk_i_bcproc_desk__Containers.scala

BoilerControl_i_bcproc_control__Containers.scala

ObservationKind.scala

DataContent.scala

Aux_Types.scala

*/
@datatype class Config_String(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: String => B) {}
@datatype class Config_Z(low: Option[Z], high: Option[Z], attempts: Z, verbose: B, filter: Z => B) {}

@datatype class Config_B(attempts: Z, verbose: B, filter: B => B) {}

@datatype class Config_C(low: Option[C], high: Option[C], attempts: Z, verbose: B, filter: C => B) {}

@datatype class Config_R(low: Option[R], high: Option[R], attempts: Z, verbose: B, filter: R => B) {}

@datatype class Config_F32(low: Option[F32], high: Option[F32], attempts: Z, verbose: B, filter: F32 => B) {}

@datatype class Config_F64(low: Option[F64], high: Option[F64], attempts: Z, verbose: B, filter: F64 => B) {}

@datatype class Config_S8(low: Option[S8], high: Option[S8], attempts: Z, verbose: B, filter: S8 => B) {}

@datatype class Config_S16(low: Option[S16], high: Option[S16], attempts: Z, verbose: B, filter: S16 => B) {}

@datatype class Config_S32(low: Option[S32], high: Option[S32], attempts: Z, verbose: B, filter: S32 => B) {}

@datatype class Config_S64(low: Option[S64], high: Option[S64], attempts: Z, verbose: B, filter: S64 => B) {}

@datatype class Config_U8(low: Option[U8], high: Option[U8], attempts: Z, verbose: B, filter: U8 => B) {}

@datatype class Config_U16(low: Option[U16], high: Option[U16], attempts: Z, verbose: B, filter: U16 => B) {}

@datatype class Config_U32(low: Option[U32], high: Option[U32], attempts: Z, verbose: B, filter: U32 => B) {}

@datatype class Config_U64(low: Option[U64], high: Option[U64], attempts: Z, verbose: B, filter: U64 => B) {}

@datatype class Config__artDataContent(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[_artDataContent_DataTypeId.Type], filter: art.DataContent => B) {}

@datatype class Config__artEmpty(attempts: Z, verbose: B, filter: art.Empty => B) {}

@datatype class Config_Base_TypesBoolean_Payload(attempts: Z, verbose: B, filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(attempts: Z, verbose: B, filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(attempts: Z, verbose: B, filter: Base_Types.String_Payload => B) {}

@datatype class Config_ISZB(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: ISZ[B] => B) {}

@datatype class Config_Base_TypesBits_Payload(attempts: Z, verbose: B, filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.Type], filter: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container => B) {}

@datatype class Config_Option_artEmpty(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: Option[art.Empty] => B) {}

@datatype class Config_OptionB(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: Option[B] => B) {}

@datatype class Config_OptionF32(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: Option[F32] => B) {}

@datatype class Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P => B) {}

@datatype class Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.Type], filter: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container => B) {}

@datatype class Config_OptionBoilerControlOpModeType(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: Option[BoilerControl.OpMode.Type] => B) {}

@datatype class Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P => B) {}

@datatype class Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.Type], filter: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container => B) {}

@datatype class Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P => B) {}

@datatype class Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.Type], filter: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container => B) {}

@datatype class Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P => B) {}

@datatype class Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlOpModeType(attempts: Z, verbose: B, filter: BoilerControl.OpMode.Type => B) {}

@datatype class Config_BoilerControlOpMode_Payload(attempts: Z, verbose: B, filter: BoilerControl.OpMode_Payload => B) {}

@datatype class Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.Type], filter: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container => B) {}

@datatype class Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P => B) {}

@datatype class Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.Type], filter: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container => B) {}

@datatype class Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P => B) {}

@datatype class Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.Type], filter: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P => B) {}

@datatype class Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.Type], filter: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container => B) {}

@datatype class Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P => B) {}

@datatype class Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.Type], filter: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container => B) {}

@datatype class Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P => B) {}

@datatype class Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS => B) {}

@datatype class Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.Type], filter: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container => B) {}

@datatype class Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P => B) {}

@datatype class Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS => B) {}

@datatype class Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.Type], filter: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container => B) {}

@datatype class Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(attempts: Z, verbose: B, filter: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P => B) {}

@datatype class Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(attempts: Z, verbose: B, filter: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


