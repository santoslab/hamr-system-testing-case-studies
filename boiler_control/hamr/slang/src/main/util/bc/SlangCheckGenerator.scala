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

@record class Gen_String(param: RandomLibI) extends MJen[String] {
  override def generate(f: String => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextString())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Z(param: RandomLibI) extends MJen[Z] {
  override def generate(f: Z => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextZ())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_B(param: RandomLibI) extends MJen[B] {
  override def generate(f: B => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_C(param: RandomLibI) extends MJen[C] {
  override def generate(f: C => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextC())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_R(param: RandomLibI) extends MJen[R] {
  override def generate(f: R => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextR())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F32(param: RandomLibI) extends MJen[F32] {
  override def generate(f: F32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_F64(param: RandomLibI) extends MJen[F64] {
  override def generate(f: F64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextF64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S8(param: RandomLibI) extends MJen[S8] {
  override def generate(f: S8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S16(param: RandomLibI) extends MJen[S16] {
  override def generate(f: S16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S32(param: RandomLibI) extends MJen[S32] {
  override def generate(f: S32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_S64(param: RandomLibI) extends MJen[S64] {
  override def generate(f: S64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextS64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U8(param: RandomLibI) extends MJen[U8] {
  override def generate(f: U8 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU8())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U16(param: RandomLibI) extends MJen[U16] {
  override def generate(f: U16 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU16())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U32(param: RandomLibI) extends MJen[U32] {
  override def generate(f: U32 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_U64(param: RandomLibI) extends MJen[U64] {
  override def generate(f: U64 => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextU64())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


@record class Gen__artDataContent(param: RandomLibI) extends MJen[art.DataContent] {
  override def generate(f: art.DataContent => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artDataContent())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen__artEmpty(param: RandomLibI) extends MJen[art.Empty] {
  override def generate(f: art.Empty => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.next_artEmpty())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBoolean_Payload(param: RandomLibI) extends MJen[Base_Types.Boolean_Payload] {
  override def generate(f: Base_Types.Boolean_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBoolean_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_Payload] {
  override def generate(f: Base_Types.Integer_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_8_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_8_Payload] {
  override def generate(f: Base_Types.Integer_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_16_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_16_Payload] {
  override def generate(f: Base_Types.Integer_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_32_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_32_Payload] {
  override def generate(f: Base_Types.Integer_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesInteger_64_Payload(param: RandomLibI) extends MJen[Base_Types.Integer_64_Payload] {
  override def generate(f: Base_Types.Integer_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesInteger_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_8_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_8_Payload] {
  override def generate(f: Base_Types.Unsigned_8_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_8_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_16_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_16_Payload] {
  override def generate(f: Base_Types.Unsigned_16_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_16_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_32_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_32_Payload] {
  override def generate(f: Base_Types.Unsigned_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesUnsigned_64_Payload(param: RandomLibI) extends MJen[Base_Types.Unsigned_64_Payload] {
  override def generate(f: Base_Types.Unsigned_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesUnsigned_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_Payload(param: RandomLibI) extends MJen[Base_Types.Float_Payload] {
  override def generate(f: Base_Types.Float_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_32_Payload(param: RandomLibI) extends MJen[Base_Types.Float_32_Payload] {
  override def generate(f: Base_Types.Float_32_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_32_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesFloat_64_Payload(param: RandomLibI) extends MJen[Base_Types.Float_64_Payload] {
  override def generate(f: Base_Types.Float_64_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesFloat_64_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesCharacter_Payload(param: RandomLibI) extends MJen[Base_Types.Character_Payload] {
  override def generate(f: Base_Types.Character_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesCharacter_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesString_Payload(param: RandomLibI) extends MJen[Base_Types.String_Payload] {
  override def generate(f: Base_Types.String_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesString_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_ISZB(param: RandomLibI) extends MJen[ISZ[B]] {
  override def generate(f: ISZ[B] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextISZB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Base_TypesBits_Payload(param: RandomLibI) extends MJen[Base_Types.Bits_Payload] {
  override def generate(f: Base_Types.Bits_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBase_TypesBits_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoilerControl_i_bcproc_control_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container] {
  override def generate(f: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_Option_artEmpty(param: RandomLibI) extends MJen[Option[art.Empty]] {
  override def generate(f: Option[art.Empty] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOption_artEmpty())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_OptionB(param: RandomLibI) extends MJen[Option[B]] {
  override def generate(f: Option[B] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOptionB())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_OptionF32(param: RandomLibI) extends MJen[Option[F32]] {
  override def generate(f: Option[F32] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOptionF32())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P] {
  override def generate(f: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS] {
  override def generate(f: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoilerControl_i_bcproc_control_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container] {
  override def generate(f: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_OptionBoilerControlOpModeType(param: RandomLibI) extends MJen[Option[BoilerControl.OpMode.Type]] {
  override def generate(f: Option[BoilerControl.OpMode.Type] => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextOptionBoilerControlOpModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P] {
  override def generate(f: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS] {
  override def generate(f: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoiler_i_bcproc_boiler_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container] {
  override def generate(f: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P] {
  override def generate(f: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS] {
  override def generate(f: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoiler_i_bcproc_boiler_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container] {
  override def generate(f: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P] {
  override def generate(f: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS] {
  override def generate(f: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOpModeType(param: RandomLibI) extends MJen[BoilerControl.OpMode.Type] {
  override def generate(f: BoilerControl.OpMode.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOpModeType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOpMode_Payload(param: RandomLibI) extends MJen[BoilerControl.OpMode_Payload] {
  override def generate(f: BoilerControl.OpMode_Payload => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOpMode_Payload())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container] {
  override def generate(f: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P] {
  override def generate(f: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS] {
  override def generate(f: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container] {
  override def generate(f: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P] {
  override def generate(f: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS] {
  override def generate(f: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS] {
  override def generate(f: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container] {
  override def generate(f: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P] {
  override def generate(f: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS] {
  override def generate(f: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container] {
  override def generate(f: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P] {
  override def generate(f: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS] {
  override def generate(f: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(param: RandomLibI) extends MJen[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container] {
  override def generate(f: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(param: RandomLibI) extends MJen[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P] {
  override def generate(f: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS] {
  override def generate(f: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(param: RandomLibI) extends MJen[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container] {
  override def generate(f: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(param: RandomLibI) extends MJen[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P] {
  override def generate(f: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(param: RandomLibI) extends MJen[BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS] {
  override def generate(f: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}

@record class Gen_runtimemonitorObservationKindType(param: RandomLibI) extends MJen[runtimemonitor.ObservationKind.Type] {
  override def generate(f: runtimemonitor.ObservationKind.Type => Jen.Action): Jen.Action = {
    var continue = Jen.Continue
    while (T) {

      continue = f(param.nextruntimemonitorObservationKindType())

      if (!continue) {
        return Jen.End
      }
    }
    return continue
  }

  override def string: String = {
    return s""
  }
}


