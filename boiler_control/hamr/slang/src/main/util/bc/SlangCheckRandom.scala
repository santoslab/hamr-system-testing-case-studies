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

@msig trait RandomLibI {
  def gen: org.sireum.Random.Gen

  def get_numElement: Z
  def set_numElement(s: Z): Unit

  // ========  Z ==========
    def get_Config_Z: Config_Z
    def set_Config_Z(config: Config_Z): RandomLib

    def nextZ(): Z = {
      val conf = get_Config_Z

      var r: Z = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextZ()
          else
            gen.nextZBetween(S64.Min.toZ, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextZBetween(conf.low.get, S64.Max.toZ)
          else
            gen.nextZBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_Z.attempts >= 0) {
       for (i <- 0 to get_Config_Z.attempts) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_Z.filter(r)) {
           return r
         }
         if (get_Config_Z.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextZ()
           else
              gen.nextZBetween(S64.Min.toZ, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextZBetween(conf.low.get, S64.Max.toZ)
            else
             gen.nextZBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  B ==========}
    def get_Config_B: Config_B
    def set_Config_B(config: Config_B): RandomLib

    def nextB(): B = {
      var r = gen.nextB()
      if(get_Config_B.attempts >= 0) {
       for (i <- 0 to get_Config_B.attempts) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      } else {
       while(T) {
         if (get_Config_B.filter(r)) {
           return r
         }
         if (get_Config_B.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = gen.nextB()
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  C ==========
    def get_Config_C: Config_C
    def set_Config_C(config: Config_C): RandomLib

    def nextC(): C = {
      val conf = get_Config_C

      var r: C = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextC()
          else
            gen.nextCBetween(C.fromZ(0), conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextCBetween(conf.low.get, C.fromZ(1114111))
          else
            gen.nextCBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_C.attempts >= 0) {
       for (i <- 0 to get_Config_C.attempts) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_C.filter(r)) {
           return r
         }
         if (get_Config_C.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextC()
           else
              gen.nextCBetween(C.fromZ(0), conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextCBetween(conf.low.get, C.fromZ(1114111))
            else
             gen.nextCBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  R ==========
    def get_Config_R: Config_R
    def set_Config_R(config: Config_R): RandomLib

    def nextR(): R = {
      val conf = get_Config_R

      var r: R = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextR()
          else
            gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
          else
            gen.nextRBetween(conf.low.get, conf.high.get)
        }

      if(get_Config_R.attempts >= 0) {
       for (i <- 0 to get_Config_R.attempts) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_R.filter(r)) {
           return r
         }
         if (get_Config_R.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextR()
           else
              gen.nextRBetween(r"-1.7976931348623157E308", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextRBetween(conf.low.get, r"1.7976931348623157E308")
            else
             gen.nextRBetween(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F32 ==========
    def get_Config_F32: Config_F32
    def set_Config_F32(config: Config_F32): RandomLib

    def nextF32(): F32 = {
      val conf = get_Config_F32

      var r: F32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF32()
          else
            gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
          else
            gen.nextF32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F32.attempts >= 0) {
       for (i <- 0 to get_Config_F32.attempts) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F32.filter(r)) {
           return r
         }
         if (get_Config_F32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF32()
           else
              gen.nextF32Between(f32"-3.40282347E38f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF32Between(conf.low.get, f32"3.4028235E38f")
            else
             gen.nextF32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  F64 ==========
    def get_Config_F64: Config_F64
    def set_Config_F64(config: Config_F64): RandomLib

    def nextF64(): F64 = {
      val conf = get_Config_F64

      var r: F64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextF64()
          else
            gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
          else
            gen.nextF64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_F64.attempts >= 0) {
       for (i <- 0 to get_Config_F64.attempts) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_F64.filter(r)) {
           return r
         }
         if (get_Config_F64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextF64()
           else
              gen.nextF64Between(f64"-1.7976931348623157E308f", conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextF64Between(conf.low.get, f64"1.7976931348623157E308f")
            else
             gen.nextF64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S8 ==========
    def get_Config_S8: Config_S8
    def set_Config_S8(config: Config_S8): RandomLib

    def nextS8(): S8 = {
      val conf = get_Config_S8

      var r: S8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS8()
          else
            gen.nextS8Between(S8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS8Between(conf.low.get, S8.Max)
          else
            gen.nextS8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S8.attempts >= 0) {
       for (i <- 0 to get_Config_S8.attempts) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S8.filter(r)) {
           return r
         }
         if (get_Config_S8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS8()
           else
              gen.nextS8Between(S8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS8Between(conf.low.get, S8.Max)
            else
             gen.nextS8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S16 ==========
    def get_Config_S16: Config_S16
    def set_Config_S16(config: Config_S16): RandomLib

    def nextS16(): S16 = {
      val conf = get_Config_S16

      var r: S16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS16()
          else
            gen.nextS16Between(S16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS16Between(conf.low.get, S16.Max)
          else
            gen.nextS16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S16.attempts >= 0) {
       for (i <- 0 to get_Config_S16.attempts) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S16.filter(r)) {
           return r
         }
         if (get_Config_S16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS16()
           else
              gen.nextS16Between(S16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS16Between(conf.low.get, S16.Max)
            else
             gen.nextS16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S32 ==========
    def get_Config_S32: Config_S32
    def set_Config_S32(config: Config_S32): RandomLib

    def nextS32(): S32 = {
      val conf = get_Config_S32

      var r: S32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS32()
          else
            gen.nextS32Between(S32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS32Between(conf.low.get, S32.Max)
          else
            gen.nextS32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S32.attempts >= 0) {
       for (i <- 0 to get_Config_S32.attempts) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S32.filter(r)) {
           return r
         }
         if (get_Config_S32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS32()
           else
              gen.nextS32Between(S32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS32Between(conf.low.get, S32.Max)
            else
             gen.nextS32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  S64 ==========
    def get_Config_S64: Config_S64
    def set_Config_S64(config: Config_S64): RandomLib

    def nextS64(): S64 = {
      val conf = get_Config_S64

      var r: S64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextS64()
          else
            gen.nextS64Between(S64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextS64Between(conf.low.get, S64.Max)
          else
            gen.nextS64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_S64.attempts >= 0) {
       for (i <- 0 to get_Config_S64.attempts) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_S64.filter(r)) {
           return r
         }
         if (get_Config_S64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextS64()
           else
              gen.nextS64Between(S64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextS64Between(conf.low.get, S64.Max)
            else
             gen.nextS64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U8 ==========
    def get_Config_U8: Config_U8
    def set_Config_U8(config: Config_U8): RandomLib

    def nextU8(): U8 = {
      val conf = get_Config_U8

      var r: U8 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU8()
          else
            gen.nextU8Between(U8.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU8Between(conf.low.get, U8.Max)
          else
            gen.nextU8Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U8.attempts >= 0) {
       for (i <- 0 to get_Config_U8.attempts) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U8.filter(r)) {
           return r
         }
         if (get_Config_U8.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU8()
           else
              gen.nextU8Between(U8.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU8Between(conf.low.get, U8.Max)
            else
             gen.nextU8Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U16 ==========
    def get_Config_U16: Config_U16
    def set_Config_U16(config: Config_U16): RandomLib

    def nextU16(): U16 = {
      val conf = get_Config_U16

      var r: U16 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU16()
          else
            gen.nextU16Between(U16.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU16Between(conf.low.get, U16.Max)
          else
            gen.nextU16Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U16.attempts >= 0) {
       for (i <- 0 to get_Config_U16.attempts) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U16.filter(r)) {
           return r
         }
         if (get_Config_U16.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU16()
           else
              gen.nextU16Between(U16.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU16Between(conf.low.get, U16.Max)
            else
             gen.nextU16Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U32 ==========
    def get_Config_U32: Config_U32
    def set_Config_U32(config: Config_U32): RandomLib

    def nextU32(): U32 = {
      val conf = get_Config_U32

      var r: U32 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU32()
          else
            gen.nextU32Between(U32.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU32Between(conf.low.get, U32.Max)
          else
            gen.nextU32Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U32.attempts >= 0) {
       for (i <- 0 to get_Config_U32.attempts) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U32.filter(r)) {
           return r
         }
         if (get_Config_U32.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU32()
           else
              gen.nextU32Between(U32.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU32Between(conf.low.get, U32.Max)
            else
             gen.nextU32Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ========  U64 ==========
    def get_Config_U64: Config_U64
    def set_Config_U64(config: Config_U64): RandomLib

    def nextU64(): U64 = {
      val conf = get_Config_U64

      var r: U64 = if (conf.low.isEmpty) {
          if (conf.high.isEmpty)
            gen.nextU64()
          else
            gen.nextU64Between(U64.Min, conf.high.get)
        } else {
          if (conf.high.isEmpty)
            gen.nextU64Between(conf.low.get, U64.Max)
          else
            gen.nextU64Between(conf.low.get, conf.high.get)
        }

      if(get_Config_U64.attempts >= 0) {
       for (i <- 0 to get_Config_U64.attempts) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      } else {
       while(T) {
         if (get_Config_U64.filter(r)) {
           return r
         }
         if (get_Config_U64.verbose) {
           println(s"Retrying for failing value: $r")
         }
         r = if (conf.low.isEmpty) {
           if (conf.high.isEmpty)
             gen.nextU64()
           else
              gen.nextU64Between(U64.Min, conf.high.get)
          } else {
            if (conf.high.isEmpty)
              gen.nextU64Between(conf.low.get, U64.Max)
            else
             gen.nextU64Between(conf.low.get, conf.high.get)
         }
       }
      }
      assert(F, "Requirements too strict to generate")
      halt("Requirements too strict to generate")
    }

  // ============= String ===================

  def get_Config_String: Config_String
  def set_Config_String(config: Config_String): RandomLib

  def nextString(): String = {

    var length: Z = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
    var str: String = ""
    for(r <- 0 until length){
      str = s"${str}${nextC().string}"
    }

    if(get_Config_String.attempts >= 0) {
      for (i <- 0 to get_Config_String.attempts) {
        if(get_Config_String.filter(str)) {
          return str
        }
        if(get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    } else {
      while(T) {
        if (get_Config_String.filter(str)) {
          return str
        }
        if (get_Config_String.verbose) {
          println(s"Retrying for failing value: $str")
        }

        length = gen.nextZBetween(get_Config_String.minSize, get_Config_String.maxSize)
        str = ""
        for (r <- 0 until length) {
          str = s"${str}${nextC().string}"
        }
      }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.DataContent ===================

  def get_Config__artDataContent: Config__artDataContent
  def set_Config__artDataContent(config: Config__artDataContent): RandomLib

  def next_artDataContent(): art.DataContent = {
    var callEnum: ISZ[_artDataContent_DataTypeId.Type] = ISZ(_artDataContent_DataTypeId._artEmpty_Id, _artDataContent_DataTypeId.Base_TypesBits_Payload_Id, _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id, _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id, _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id, _artDataContent_DataTypeId.Base_TypesString_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id, _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id, _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlOpMode_Payload_Id, _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id, _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id, _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id)

    if(get_Config__artDataContent.additiveTypeFiltering) {
       callEnum = get_Config__artDataContent.typeFilter
    } else {
       for(h <- get_Config__artDataContent.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: art.DataContent = c match {
      case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
      case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
      case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlOpMode_Payload_Id => (nextBoilerControlOpMode_Payload _).apply()
      case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _).apply()
      case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _).apply()
      case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config__artDataContent.attempts >= 0) {
     for(i <- 0 to get_Config__artDataContent.attempts) {
       if(get_Config__artDataContent.filter(v)) {
        return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlOpMode_Payload_Id => (nextBoilerControlOpMode_Payload _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config__artDataContent.filter(v)) {
         return v
       }
       if (get_Config__artDataContent.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case _artDataContent_DataTypeId._artEmpty_Id => (next_artEmpty _).apply()
         case _artDataContent_DataTypeId.Base_TypesBits_Payload_Id => (nextBase_TypesBits_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesBoolean_Payload_Id => (nextBase_TypesBoolean_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesCharacter_Payload_Id => (nextBase_TypesCharacter_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_32_Payload_Id => (nextBase_TypesFloat_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_64_Payload_Id => (nextBase_TypesFloat_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesFloat_Payload_Id => (nextBase_TypesFloat_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_16_Payload_Id => (nextBase_TypesInteger_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_32_Payload_Id => (nextBase_TypesInteger_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_64_Payload_Id => (nextBase_TypesInteger_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_8_Payload_Id => (nextBase_TypesInteger_8_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesInteger_Payload_Id => (nextBase_TypesInteger_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesString_Payload_Id => (nextBase_TypesString_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_16_Payload_Id => (nextBase_TypesUnsigned_16_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_32_Payload_Id => (nextBase_TypesUnsigned_32_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_64_Payload_Id => (nextBase_TypesUnsigned_64_Payload _).apply()
         case _artDataContent_DataTypeId.Base_TypesUnsigned_8_Payload_Id => (nextBase_TypesUnsigned_8_Payload _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlOpMode_Payload_Id => (nextBoilerControlOpMode_Payload _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _).apply()
         case _artDataContent_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= art.Empty ===================

  def get_Config__artEmpty: Config__artEmpty
  def set_Config__artEmpty(config: Config__artEmpty): RandomLib

  def next_artEmpty(): art.Empty = {

    var v: art.Empty = art.Empty()

    if(get_Config__artEmpty.attempts >= 0) {
     for(i <- 0 to get_Config__artEmpty.attempts) {
        if(get_Config__artEmpty.filter(v)) {
          return v
        }
        if (get_Config__artEmpty.verbose) {
          println(s"Retrying for failing value: $v")
        }
        v = art.Empty()
     }
    } else {
     while(T) {
       if(get_Config__artEmpty.filter(v)) {
         return v
       }
       if (get_Config__artEmpty.verbose) {
         println(s"Retrying for failing value: $v")
       }
       v = art.Empty()
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Boolean_Payload ===================

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload
  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib

  def nextBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
    var value: B = nextB()

    var v: Base_Types.Boolean_Payload = Base_Types.Boolean_Payload(value)

    if(get_Config_Base_TypesBoolean_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBoolean_Payload.attempts) {
        if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBoolean_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextB()
        v = Base_Types.Boolean_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBoolean_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBoolean_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextB()
       v = Base_Types.Boolean_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_Payload ===================

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload
  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib

  def nextBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
    var value: Z = nextZ()

    var v: Base_Types.Integer_Payload = Base_Types.Integer_Payload(value)

    if(get_Config_Base_TypesInteger_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_Payload.attempts) {
        if(get_Config_Base_TypesInteger_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextZ()
        v = Base_Types.Integer_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextZ()
       v = Base_Types.Integer_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_8_Payload ===================

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload
  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib

  def nextBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
    var value: S8 = nextS8()

    var v: Base_Types.Integer_8_Payload = Base_Types.Integer_8_Payload(value)

    if(get_Config_Base_TypesInteger_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_8_Payload.attempts) {
        if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS8()
        v = Base_Types.Integer_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS8()
       v = Base_Types.Integer_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_16_Payload ===================

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload
  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib

  def nextBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
    var value: S16 = nextS16()

    var v: Base_Types.Integer_16_Payload = Base_Types.Integer_16_Payload(value)

    if(get_Config_Base_TypesInteger_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_16_Payload.attempts) {
        if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS16()
        v = Base_Types.Integer_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS16()
       v = Base_Types.Integer_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_32_Payload ===================

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload
  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib

  def nextBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
    var value: S32 = nextS32()

    var v: Base_Types.Integer_32_Payload = Base_Types.Integer_32_Payload(value)

    if(get_Config_Base_TypesInteger_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_32_Payload.attempts) {
        if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS32()
        v = Base_Types.Integer_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS32()
       v = Base_Types.Integer_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Integer_64_Payload ===================

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload
  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib

  def nextBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
    var value: S64 = nextS64()

    var v: Base_Types.Integer_64_Payload = Base_Types.Integer_64_Payload(value)

    if(get_Config_Base_TypesInteger_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesInteger_64_Payload.attempts) {
        if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesInteger_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextS64()
        v = Base_Types.Integer_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesInteger_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesInteger_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextS64()
       v = Base_Types.Integer_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_8_Payload ===================

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload
  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib

  def nextBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
    var value: U8 = nextU8()

    var v: Base_Types.Unsigned_8_Payload = Base_Types.Unsigned_8_Payload(value)

    if(get_Config_Base_TypesUnsigned_8_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_8_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU8()
        v = Base_Types.Unsigned_8_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_8_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_8_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU8()
       v = Base_Types.Unsigned_8_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_16_Payload ===================

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload
  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib

  def nextBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
    var value: U16 = nextU16()

    var v: Base_Types.Unsigned_16_Payload = Base_Types.Unsigned_16_Payload(value)

    if(get_Config_Base_TypesUnsigned_16_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_16_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU16()
        v = Base_Types.Unsigned_16_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_16_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_16_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU16()
       v = Base_Types.Unsigned_16_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_32_Payload ===================

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload
  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib

  def nextBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
    var value: U32 = nextU32()

    var v: Base_Types.Unsigned_32_Payload = Base_Types.Unsigned_32_Payload(value)

    if(get_Config_Base_TypesUnsigned_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_32_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU32()
        v = Base_Types.Unsigned_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU32()
       v = Base_Types.Unsigned_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Unsigned_64_Payload ===================

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload
  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib

  def nextBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
    var value: U64 = nextU64()

    var v: Base_Types.Unsigned_64_Payload = Base_Types.Unsigned_64_Payload(value)

    if(get_Config_Base_TypesUnsigned_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesUnsigned_64_Payload.attempts) {
        if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextU64()
        v = Base_Types.Unsigned_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesUnsigned_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesUnsigned_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextU64()
       v = Base_Types.Unsigned_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_Payload ===================

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload
  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib

  def nextBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
    var value: R = nextR()

    var v: Base_Types.Float_Payload = Base_Types.Float_Payload(value)

    if(get_Config_Base_TypesFloat_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_Payload.attempts) {
        if(get_Config_Base_TypesFloat_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextR()
        v = Base_Types.Float_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextR()
       v = Base_Types.Float_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_32_Payload ===================

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload
  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib

  def nextBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
    var value: F32 = nextF32()

    var v: Base_Types.Float_32_Payload = Base_Types.Float_32_Payload(value)

    if(get_Config_Base_TypesFloat_32_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_32_Payload.attempts) {
        if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_32_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF32()
        v = Base_Types.Float_32_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_32_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_32_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF32()
       v = Base_Types.Float_32_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Float_64_Payload ===================

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload
  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib

  def nextBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
    var value: F64 = nextF64()

    var v: Base_Types.Float_64_Payload = Base_Types.Float_64_Payload(value)

    if(get_Config_Base_TypesFloat_64_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesFloat_64_Payload.attempts) {
        if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesFloat_64_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextF64()
        v = Base_Types.Float_64_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesFloat_64_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesFloat_64_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextF64()
       v = Base_Types.Float_64_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Character_Payload ===================

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload
  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib

  def nextBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
    var value: C = nextC()

    var v: Base_Types.Character_Payload = Base_Types.Character_Payload(value)

    if(get_Config_Base_TypesCharacter_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesCharacter_Payload.attempts) {
        if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesCharacter_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextC()
        v = Base_Types.Character_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesCharacter_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesCharacter_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextC()
       v = Base_Types.Character_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.String_Payload ===================

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload
  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib

  def nextBase_TypesString_Payload(): Base_Types.String_Payload = {
    var value: String = nextString()

    var v: Base_Types.String_Payload = Base_Types.String_Payload(value)

    if(get_Config_Base_TypesString_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesString_Payload.attempts) {
        if(get_Config_Base_TypesString_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesString_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextString()
        v = Base_Types.String_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesString_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesString_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextString()
       v = Base_Types.String_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== ISZ[B] =====================
  def get_Config_ISZB: Config_ISZB
  def set_Config_ISZB(config: Config_ISZB): RandomLib

  def nextISZB(): ISZ[B] = {

    var length: Z = gen.nextZBetween(0, get_numElement)
    var v: ISZ[B] = ISZ()
    for (r <- 0 until length) {
      v = v :+ nextB()
    }

    if(get_Config_ISZB.attempts >= 0) {
     for(i <- 0 to get_Config_ISZB.attempts) {
        if(get_Config_ISZB.filter(v)) {
          return v
        }
        if (get_Config_ISZB.verbose) {
          println(s"Retrying for failing value: $v")
        }

        length = gen.nextZBetween(0, get_numElement)
        v = ISZ()
        for (r <- 0 until length) {
           v = v :+ nextB()
        }
     }
    } else {
     while(T) {
       if(get_Config_ISZB.filter(v)) {
         return v
       }
       if (get_Config_ISZB.verbose) {
         println(s"Retrying for failing value: $v")
       }

       length = gen.nextZBetween(0, get_numElement)
       v = ISZ()
       for (r <- 0 until length) {
          v = v :+ nextB()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= Base_Types.Bits_Payload ===================

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload
  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib

  def nextBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
    var value: ISZ[B] = nextISZB()

    var v: Base_Types.Bits_Payload = Base_Types.Bits_Payload(value)

    if(get_Config_Base_TypesBits_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_Base_TypesBits_Payload.attempts) {
        if(get_Config_Base_TypesBits_Payload.filter(v)) {
          return v
        }
        if (get_Config_Base_TypesBits_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextISZB()
        v = Base_Types.Bits_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_Base_TypesBits_Payload.filter(v)) {
         return v
       }
       if (get_Config_Base_TypesBits_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextISZB()
       v = Base_Types.Bits_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PreState_Container ===================

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container
  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container(config: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container): RandomLib

  def nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container = {
    var callEnum: ISZ[BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id, BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id)

    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container = c match {
      case BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _).apply()
      case BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.attempts) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _).apply()
         case BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _).apply()
         case BoilerControlBoilerControl_i_bcproc_control_PreState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[art.Empty] =====================
  def get_Config_Option_artEmpty: Config_Option_artEmpty
  def set_Config_Option_artEmpty(config: Config_Option_artEmpty): RandomLib

  def nextOption_artEmpty(): Option[art.Empty] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[art.Empty] = if(none == 0) {
      Some(next_artEmpty())
    } else {
      None()
    }

    if(get_Config_Option_artEmpty.attempts >= 0) {
     for(i <- 0 to get_Config_Option_artEmpty.attempts) {
        if(get_Config_Option_artEmpty.filter(v)) {
          return v
        }
        if (get_Config_Option_artEmpty.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(next_artEmpty())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_Option_artEmpty.filter(v)) {
         return v
       }
       if (get_Config_Option_artEmpty.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(next_artEmpty())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[B] =====================
  def get_Config_OptionB: Config_OptionB
  def set_Config_OptionB(config: Config_OptionB): RandomLib

  def nextOptionB(): Option[B] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[B] = if(none == 0) {
      Some(nextB())
    } else {
      None()
    }

    if(get_Config_OptionB.attempts >= 0) {
     for(i <- 0 to get_Config_OptionB.attempts) {
        if(get_Config_OptionB.filter(v)) {
          return v
        }
        if (get_Config_OptionB.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(nextB())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_OptionB.filter(v)) {
         return v
       }
       if (get_Config_OptionB.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(nextB())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[F32] =====================
  def get_Config_OptionF32: Config_OptionF32
  def set_Config_OptionF32(config: Config_OptionF32): RandomLib

  def nextOptionF32(): Option[F32] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[F32] = if(none == 0) {
      Some(nextF32())
    } else {
      None()
    }

    if(get_Config_OptionF32.attempts >= 0) {
     for(i <- 0 to get_Config_OptionF32.attempts) {
        if(get_Config_OptionF32.filter(v)) {
          return v
        }
        if (get_Config_OptionF32.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(nextF32())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_OptionF32.filter(v)) {
         return v
       }
       if (get_Config_OptionF32.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(nextF32())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P ===================

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P
  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(config: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P): RandomLib

  def nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = {
    var api_boilerReady: Option[art.Empty] = nextOption_artEmpty()
    var api_boilerWaiting: Option[art.Empty] = nextOption_artEmpty()
    var api_levelFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_steamMeterReady: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_stop: Option[art.Empty] = nextOption_artEmpty()
    var api_waterMeterReady: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow0: Option[B] = nextOptionB()
    var api_pumpFlow1: Option[B] = nextOptionB()
    var api_pumpFlow2: Option[B] = nextOptionB()
    var api_pumpFlow3: Option[B] = nextOptionB()
    var api_pumpOpen0: Option[B] = nextOptionB()
    var api_pumpOpen1: Option[B] = nextOptionB()
    var api_pumpOpen2: Option[B] = nextOptionB()
    var api_pumpOpen3: Option[B] = nextOptionB()
    var api_steamRate: Option[F32] = nextOptionF32()
    var api_waterLevel: Option[F32] = nextOptionF32()

    var v: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P = BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P(api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)

    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_boilerReady = nextOption_artEmpty()
        api_boilerWaiting = nextOption_artEmpty()
        api_levelFailAck = nextOption_artEmpty()
        api_levelRepair = nextOption_artEmpty()
        api_pumpControlFailAck0 = nextOption_artEmpty()
        api_pumpControlFailAck1 = nextOption_artEmpty()
        api_pumpControlFailAck2 = nextOption_artEmpty()
        api_pumpControlFailAck3 = nextOption_artEmpty()
        api_pumpControlReady0 = nextOption_artEmpty()
        api_pumpControlReady1 = nextOption_artEmpty()
        api_pumpControlReady2 = nextOption_artEmpty()
        api_pumpControlReady3 = nextOption_artEmpty()
        api_pumpControlRepair0 = nextOption_artEmpty()
        api_pumpControlRepair1 = nextOption_artEmpty()
        api_pumpControlRepair2 = nextOption_artEmpty()
        api_pumpControlRepair3 = nextOption_artEmpty()
        api_pumpFailAck0 = nextOption_artEmpty()
        api_pumpFailAck1 = nextOption_artEmpty()
        api_pumpFailAck2 = nextOption_artEmpty()
        api_pumpFailAck3 = nextOption_artEmpty()
        api_pumpRepair0 = nextOption_artEmpty()
        api_pumpRepair1 = nextOption_artEmpty()
        api_pumpRepair2 = nextOption_artEmpty()
        api_pumpRepair3 = nextOption_artEmpty()
        api_steamFailAck = nextOption_artEmpty()
        api_steamMeterReady = nextOption_artEmpty()
        api_steamRepair = nextOption_artEmpty()
        api_stop = nextOption_artEmpty()
        api_waterMeterReady = nextOption_artEmpty()
        api_pumpFlow0 = nextOptionB()
        api_pumpFlow1 = nextOptionB()
        api_pumpFlow2 = nextOptionB()
        api_pumpFlow3 = nextOptionB()
        api_pumpOpen0 = nextOptionB()
        api_pumpOpen1 = nextOptionB()
        api_pumpOpen2 = nextOptionB()
        api_pumpOpen3 = nextOptionB()
        api_steamRate = nextOptionF32()
        api_waterLevel = nextOptionF32()
        v = BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P(api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_boilerReady = nextOption_artEmpty()
       api_boilerWaiting = nextOption_artEmpty()
       api_levelFailAck = nextOption_artEmpty()
       api_levelRepair = nextOption_artEmpty()
       api_pumpControlFailAck0 = nextOption_artEmpty()
       api_pumpControlFailAck1 = nextOption_artEmpty()
       api_pumpControlFailAck2 = nextOption_artEmpty()
       api_pumpControlFailAck3 = nextOption_artEmpty()
       api_pumpControlReady0 = nextOption_artEmpty()
       api_pumpControlReady1 = nextOption_artEmpty()
       api_pumpControlReady2 = nextOption_artEmpty()
       api_pumpControlReady3 = nextOption_artEmpty()
       api_pumpControlRepair0 = nextOption_artEmpty()
       api_pumpControlRepair1 = nextOption_artEmpty()
       api_pumpControlRepair2 = nextOption_artEmpty()
       api_pumpControlRepair3 = nextOption_artEmpty()
       api_pumpFailAck0 = nextOption_artEmpty()
       api_pumpFailAck1 = nextOption_artEmpty()
       api_pumpFailAck2 = nextOption_artEmpty()
       api_pumpFailAck3 = nextOption_artEmpty()
       api_pumpRepair0 = nextOption_artEmpty()
       api_pumpRepair1 = nextOption_artEmpty()
       api_pumpRepair2 = nextOption_artEmpty()
       api_pumpRepair3 = nextOption_artEmpty()
       api_steamFailAck = nextOption_artEmpty()
       api_steamMeterReady = nextOption_artEmpty()
       api_steamRepair = nextOption_artEmpty()
       api_stop = nextOption_artEmpty()
       api_waterMeterReady = nextOption_artEmpty()
       api_pumpFlow0 = nextOptionB()
       api_pumpFlow1 = nextOptionB()
       api_pumpFlow2 = nextOptionB()
       api_pumpFlow3 = nextOptionB()
       api_pumpOpen0 = nextOptionB()
       api_pumpOpen1 = nextOptionB()
       api_pumpOpen2 = nextOptionB()
       api_pumpOpen3 = nextOptionB()
       api_steamRate = nextOptionF32()
       api_waterLevel = nextOptionF32()
       v = BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P(api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS ===================

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS
  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(config: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS): RandomLib

  def nextBoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(): BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = {
    var In_C: F32 = nextF32()
    var In_M1: F32 = nextF32()
    var In_M2: F32 = nextF32()
    var In_N1: F32 = nextF32()
    var In_N2: F32 = nextF32()
    var In_P: F32 = nextF32()
    var In_U1: F32 = nextF32()
    var In_U2: F32 = nextF32()
    var In_W: F32 = nextF32()
    var In_hasBoilerSentWaiting: B = nextB()
    var In_isPump0Failing: B = nextB()
    var In_isPump1Failing: B = nextB()
    var In_isPump2Failing: B = nextB()
    var In_isPump3Failing: B = nextB()
    var In_isSteamMeterFailing: B = nextB()
    var In_isWaterMeterFailing: B = nextB()
    var In_mode: BoilerControl.OpMode.Type = nextBoilerControlOpModeType()
    var In_p0: F32 = nextF32()
    var In_p1: F32 = nextF32()
    var In_p2: F32 = nextF32()
    var In_p3: F32 = nextF32()
    var In_q: F32 = nextF32()
    var In_qa1: F32 = nextF32()
    var In_qa2: F32 = nextF32()
    var In_qc1: F32 = nextF32()
    var In_qc2: F32 = nextF32()
    var In_shouldUpdatePumps: B = nextB()
    var In_transmissionFailure: B = nextB()
    var In_v_steamRate: F32 = nextF32()
    var api_boilerReady: Option[art.Empty] = nextOption_artEmpty()
    var api_boilerWaiting: Option[art.Empty] = nextOption_artEmpty()
    var api_levelFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlReady3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_steamMeterReady: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_stop: Option[art.Empty] = nextOption_artEmpty()
    var api_waterMeterReady: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow0: Option[B] = nextOptionB()
    var api_pumpFlow1: Option[B] = nextOptionB()
    var api_pumpFlow2: Option[B] = nextOptionB()
    var api_pumpFlow3: Option[B] = nextOptionB()
    var api_pumpOpen0: Option[B] = nextOptionB()
    var api_pumpOpen1: Option[B] = nextOptionB()
    var api_pumpOpen2: Option[B] = nextOptionB()
    var api_pumpOpen3: Option[B] = nextOptionB()
    var api_steamRate: Option[F32] = nextOptionF32()
    var api_waterLevel: Option[F32] = nextOptionF32()

    var v: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS = BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS(In_C, In_M1, In_M2, In_N1, In_N2, In_P, In_U1, In_U2, In_W, In_hasBoilerSentWaiting, In_isPump0Failing, In_isPump1Failing, In_isPump2Failing, In_isPump3Failing, In_isSteamMeterFailing, In_isWaterMeterFailing, In_mode, In_p0, In_p1, In_p2, In_p3, In_q, In_qa1, In_qa2, In_qc1, In_qc2, In_shouldUpdatePumps, In_transmissionFailure, In_v_steamRate, api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)

    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_C = nextF32()
        In_M1 = nextF32()
        In_M2 = nextF32()
        In_N1 = nextF32()
        In_N2 = nextF32()
        In_P = nextF32()
        In_U1 = nextF32()
        In_U2 = nextF32()
        In_W = nextF32()
        In_hasBoilerSentWaiting = nextB()
        In_isPump0Failing = nextB()
        In_isPump1Failing = nextB()
        In_isPump2Failing = nextB()
        In_isPump3Failing = nextB()
        In_isSteamMeterFailing = nextB()
        In_isWaterMeterFailing = nextB()
        In_mode = nextBoilerControlOpModeType()
        In_p0 = nextF32()
        In_p1 = nextF32()
        In_p2 = nextF32()
        In_p3 = nextF32()
        In_q = nextF32()
        In_qa1 = nextF32()
        In_qa2 = nextF32()
        In_qc1 = nextF32()
        In_qc2 = nextF32()
        In_shouldUpdatePumps = nextB()
        In_transmissionFailure = nextB()
        In_v_steamRate = nextF32()
        api_boilerReady = nextOption_artEmpty()
        api_boilerWaiting = nextOption_artEmpty()
        api_levelFailAck = nextOption_artEmpty()
        api_levelRepair = nextOption_artEmpty()
        api_pumpControlFailAck0 = nextOption_artEmpty()
        api_pumpControlFailAck1 = nextOption_artEmpty()
        api_pumpControlFailAck2 = nextOption_artEmpty()
        api_pumpControlFailAck3 = nextOption_artEmpty()
        api_pumpControlReady0 = nextOption_artEmpty()
        api_pumpControlReady1 = nextOption_artEmpty()
        api_pumpControlReady2 = nextOption_artEmpty()
        api_pumpControlReady3 = nextOption_artEmpty()
        api_pumpControlRepair0 = nextOption_artEmpty()
        api_pumpControlRepair1 = nextOption_artEmpty()
        api_pumpControlRepair2 = nextOption_artEmpty()
        api_pumpControlRepair3 = nextOption_artEmpty()
        api_pumpFailAck0 = nextOption_artEmpty()
        api_pumpFailAck1 = nextOption_artEmpty()
        api_pumpFailAck2 = nextOption_artEmpty()
        api_pumpFailAck3 = nextOption_artEmpty()
        api_pumpRepair0 = nextOption_artEmpty()
        api_pumpRepair1 = nextOption_artEmpty()
        api_pumpRepair2 = nextOption_artEmpty()
        api_pumpRepair3 = nextOption_artEmpty()
        api_steamFailAck = nextOption_artEmpty()
        api_steamMeterReady = nextOption_artEmpty()
        api_steamRepair = nextOption_artEmpty()
        api_stop = nextOption_artEmpty()
        api_waterMeterReady = nextOption_artEmpty()
        api_pumpFlow0 = nextOptionB()
        api_pumpFlow1 = nextOptionB()
        api_pumpFlow2 = nextOptionB()
        api_pumpFlow3 = nextOptionB()
        api_pumpOpen0 = nextOptionB()
        api_pumpOpen1 = nextOptionB()
        api_pumpOpen2 = nextOptionB()
        api_pumpOpen3 = nextOptionB()
        api_steamRate = nextOptionF32()
        api_waterLevel = nextOptionF32()
        v = BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS(In_C, In_M1, In_M2, In_N1, In_N2, In_P, In_U1, In_U2, In_W, In_hasBoilerSentWaiting, In_isPump0Failing, In_isPump1Failing, In_isPump2Failing, In_isPump3Failing, In_isSteamMeterFailing, In_isWaterMeterFailing, In_mode, In_p0, In_p1, In_p2, In_p3, In_q, In_qa1, In_qa2, In_qc1, In_qc2, In_shouldUpdatePumps, In_transmissionFailure, In_v_steamRate, api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_C = nextF32()
       In_M1 = nextF32()
       In_M2 = nextF32()
       In_N1 = nextF32()
       In_N2 = nextF32()
       In_P = nextF32()
       In_U1 = nextF32()
       In_U2 = nextF32()
       In_W = nextF32()
       In_hasBoilerSentWaiting = nextB()
       In_isPump0Failing = nextB()
       In_isPump1Failing = nextB()
       In_isPump2Failing = nextB()
       In_isPump3Failing = nextB()
       In_isSteamMeterFailing = nextB()
       In_isWaterMeterFailing = nextB()
       In_mode = nextBoilerControlOpModeType()
       In_p0 = nextF32()
       In_p1 = nextF32()
       In_p2 = nextF32()
       In_p3 = nextF32()
       In_q = nextF32()
       In_qa1 = nextF32()
       In_qa2 = nextF32()
       In_qc1 = nextF32()
       In_qc2 = nextF32()
       In_shouldUpdatePumps = nextB()
       In_transmissionFailure = nextB()
       In_v_steamRate = nextF32()
       api_boilerReady = nextOption_artEmpty()
       api_boilerWaiting = nextOption_artEmpty()
       api_levelFailAck = nextOption_artEmpty()
       api_levelRepair = nextOption_artEmpty()
       api_pumpControlFailAck0 = nextOption_artEmpty()
       api_pumpControlFailAck1 = nextOption_artEmpty()
       api_pumpControlFailAck2 = nextOption_artEmpty()
       api_pumpControlFailAck3 = nextOption_artEmpty()
       api_pumpControlReady0 = nextOption_artEmpty()
       api_pumpControlReady1 = nextOption_artEmpty()
       api_pumpControlReady2 = nextOption_artEmpty()
       api_pumpControlReady3 = nextOption_artEmpty()
       api_pumpControlRepair0 = nextOption_artEmpty()
       api_pumpControlRepair1 = nextOption_artEmpty()
       api_pumpControlRepair2 = nextOption_artEmpty()
       api_pumpControlRepair3 = nextOption_artEmpty()
       api_pumpFailAck0 = nextOption_artEmpty()
       api_pumpFailAck1 = nextOption_artEmpty()
       api_pumpFailAck2 = nextOption_artEmpty()
       api_pumpFailAck3 = nextOption_artEmpty()
       api_pumpRepair0 = nextOption_artEmpty()
       api_pumpRepair1 = nextOption_artEmpty()
       api_pumpRepair2 = nextOption_artEmpty()
       api_pumpRepair3 = nextOption_artEmpty()
       api_steamFailAck = nextOption_artEmpty()
       api_steamMeterReady = nextOption_artEmpty()
       api_steamRepair = nextOption_artEmpty()
       api_stop = nextOption_artEmpty()
       api_waterMeterReady = nextOption_artEmpty()
       api_pumpFlow0 = nextOptionB()
       api_pumpFlow1 = nextOptionB()
       api_pumpFlow2 = nextOptionB()
       api_pumpFlow3 = nextOptionB()
       api_pumpOpen0 = nextOptionB()
       api_pumpOpen1 = nextOptionB()
       api_pumpOpen2 = nextOptionB()
       api_pumpOpen3 = nextOptionB()
       api_steamRate = nextOptionF32()
       api_waterLevel = nextOptionF32()
       v = BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS(In_C, In_M1, In_M2, In_N1, In_N2, In_P, In_U1, In_U2, In_W, In_hasBoilerSentWaiting, In_isPump0Failing, In_isPump1Failing, In_isPump2Failing, In_isPump3Failing, In_isSteamMeterFailing, In_isWaterMeterFailing, In_mode, In_p0, In_p1, In_p2, In_p3, In_q, In_qa1, In_qa2, In_qc1, In_qc2, In_shouldUpdatePumps, In_transmissionFailure, In_v_steamRate, api_boilerReady, api_boilerWaiting, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlReady0, api_pumpControlReady1, api_pumpControlReady2, api_pumpControlReady3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamMeterReady, api_steamRepair, api_stop, api_waterMeterReady, api_pumpFlow0, api_pumpFlow1, api_pumpFlow2, api_pumpFlow3, api_pumpOpen0, api_pumpOpen1, api_pumpOpen2, api_pumpOpen3, api_steamRate, api_waterLevel)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PostState_Container ===================

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container
  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container(config: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container): RandomLib

  def nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container = {
    var callEnum: ISZ[BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id, BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id)

    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container = c match {
      case BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _).apply()
      case BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.attempts) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _).apply()
         case BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _).apply()
         case BoilerControlBoilerControl_i_bcproc_control_PostState_Container_DataTypeId.BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS_Id => (nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  //=================== Option[BoilerControl.OpMode.Type] =====================
  def get_Config_OptionBoilerControlOpModeType: Config_OptionBoilerControlOpModeType
  def set_Config_OptionBoilerControlOpModeType(config: Config_OptionBoilerControlOpModeType): RandomLib

  def nextOptionBoilerControlOpModeType(): Option[BoilerControl.OpMode.Type] = {

    var none: Z = gen.nextZBetween(0,1)
    var v: Option[BoilerControl.OpMode.Type] = if(none == 0) {
      Some(nextBoilerControlOpModeType())
    } else {
      None()
    }

    if(get_Config_OptionBoilerControlOpModeType.attempts >= 0) {
     for(i <- 0 to get_Config_OptionBoilerControlOpModeType.attempts) {
        if(get_Config_OptionBoilerControlOpModeType.filter(v)) {
          return v
        }
        if (get_Config_OptionBoilerControlOpModeType.verbose) {
          println(s"Retrying for failing value: $v")
        }

        none = gen.nextZBetween(0,1)
        v = if(none == 0) {
           Some(nextBoilerControlOpModeType())
        } else {
           None()
        }
     }
    } else {
     while(T) {
       if(get_Config_OptionBoilerControlOpModeType.filter(v)) {
         return v
       }
       if (get_Config_OptionBoilerControlOpModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }

       none = gen.nextZBetween(0,1)
       v = if(none == 0) {
          Some(nextBoilerControlOpModeType())
       } else {
          None()
       }
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P ===================

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P
  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(config: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P): RandomLib

  def nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = {
    var api_levelFail: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFail: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_valve: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump0: Option[B] = nextOptionB()
    var api_openPump1: Option[B] = nextOptionB()
    var api_openPump2: Option[B] = nextOptionB()
    var api_openPump3: Option[B] = nextOptionB()

    var v: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P = BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)

    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_levelFail = nextOption_artEmpty()
        api_levelRepairAck = nextOption_artEmpty()
        api_pumpControlFail0 = nextOption_artEmpty()
        api_pumpControlFail1 = nextOption_artEmpty()
        api_pumpControlFail2 = nextOption_artEmpty()
        api_pumpControlFail3 = nextOption_artEmpty()
        api_pumpControlRepairAck0 = nextOption_artEmpty()
        api_pumpControlRepairAck1 = nextOption_artEmpty()
        api_pumpControlRepairAck2 = nextOption_artEmpty()
        api_pumpControlRepairAck3 = nextOption_artEmpty()
        api_pumpFail0 = nextOption_artEmpty()
        api_pumpFail1 = nextOption_artEmpty()
        api_pumpFail2 = nextOption_artEmpty()
        api_pumpFail3 = nextOption_artEmpty()
        api_pumpRepairAck0 = nextOption_artEmpty()
        api_pumpRepairAck1 = nextOption_artEmpty()
        api_pumpRepairAck2 = nextOption_artEmpty()
        api_pumpRepairAck3 = nextOption_artEmpty()
        api_ready = nextOption_artEmpty()
        api_steamFail = nextOption_artEmpty()
        api_steamRepairAck = nextOption_artEmpty()
        api_valve = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump0 = nextOptionB()
        api_openPump1 = nextOptionB()
        api_openPump2 = nextOptionB()
        api_openPump3 = nextOptionB()
        v = BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_levelFail = nextOption_artEmpty()
       api_levelRepairAck = nextOption_artEmpty()
       api_pumpControlFail0 = nextOption_artEmpty()
       api_pumpControlFail1 = nextOption_artEmpty()
       api_pumpControlFail2 = nextOption_artEmpty()
       api_pumpControlFail3 = nextOption_artEmpty()
       api_pumpControlRepairAck0 = nextOption_artEmpty()
       api_pumpControlRepairAck1 = nextOption_artEmpty()
       api_pumpControlRepairAck2 = nextOption_artEmpty()
       api_pumpControlRepairAck3 = nextOption_artEmpty()
       api_pumpFail0 = nextOption_artEmpty()
       api_pumpFail1 = nextOption_artEmpty()
       api_pumpFail2 = nextOption_artEmpty()
       api_pumpFail3 = nextOption_artEmpty()
       api_pumpRepairAck0 = nextOption_artEmpty()
       api_pumpRepairAck1 = nextOption_artEmpty()
       api_pumpRepairAck2 = nextOption_artEmpty()
       api_pumpRepairAck3 = nextOption_artEmpty()
       api_ready = nextOption_artEmpty()
       api_steamFail = nextOption_artEmpty()
       api_steamRepairAck = nextOption_artEmpty()
       api_valve = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump0 = nextOptionB()
       api_openPump1 = nextOptionB()
       api_openPump2 = nextOptionB()
       api_openPump3 = nextOptionB()
       v = BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS ===================

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS
  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(config: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS): RandomLib

  def nextBoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(): BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = {
    var C: F32 = nextF32()
    var M1: F32 = nextF32()
    var M2: F32 = nextF32()
    var N1: F32 = nextF32()
    var N2: F32 = nextF32()
    var P: F32 = nextF32()
    var U1: F32 = nextF32()
    var U2: F32 = nextF32()
    var W: F32 = nextF32()
    var hasBoilerSentWaiting: B = nextB()
    var isPump0Failing: B = nextB()
    var isPump1Failing: B = nextB()
    var isPump2Failing: B = nextB()
    var isPump3Failing: B = nextB()
    var isSteamMeterFailing: B = nextB()
    var isWaterMeterFailing: B = nextB()
    var mode: BoilerControl.OpMode.Type = nextBoilerControlOpModeType()
    var p0: F32 = nextF32()
    var p1: F32 = nextF32()
    var p2: F32 = nextF32()
    var p3: F32 = nextF32()
    var q: F32 = nextF32()
    var qa1: F32 = nextF32()
    var qa2: F32 = nextF32()
    var qc1: F32 = nextF32()
    var qc2: F32 = nextF32()
    var shouldUpdatePumps: B = nextB()
    var transmissionFailure: B = nextB()
    var v_steamRate: F32 = nextF32()
    var api_levelFail: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFail: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_valve: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump0: Option[B] = nextOptionB()
    var api_openPump1: Option[B] = nextOptionB()
    var api_openPump2: Option[B] = nextOptionB()
    var api_openPump3: Option[B] = nextOptionB()

    var v: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS = BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS(C, M1, M2, N1, N2, P, U1, U2, W, hasBoilerSentWaiting, isPump0Failing, isPump1Failing, isPump2Failing, isPump3Failing, isSteamMeterFailing, isWaterMeterFailing, mode, p0, p1, p2, p3, q, qa1, qa2, qc1, qc2, shouldUpdatePumps, transmissionFailure, v_steamRate, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)

    if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        C = nextF32()
        M1 = nextF32()
        M2 = nextF32()
        N1 = nextF32()
        N2 = nextF32()
        P = nextF32()
        U1 = nextF32()
        U2 = nextF32()
        W = nextF32()
        hasBoilerSentWaiting = nextB()
        isPump0Failing = nextB()
        isPump1Failing = nextB()
        isPump2Failing = nextB()
        isPump3Failing = nextB()
        isSteamMeterFailing = nextB()
        isWaterMeterFailing = nextB()
        mode = nextBoilerControlOpModeType()
        p0 = nextF32()
        p1 = nextF32()
        p2 = nextF32()
        p3 = nextF32()
        q = nextF32()
        qa1 = nextF32()
        qa2 = nextF32()
        qc1 = nextF32()
        qc2 = nextF32()
        shouldUpdatePumps = nextB()
        transmissionFailure = nextB()
        v_steamRate = nextF32()
        api_levelFail = nextOption_artEmpty()
        api_levelRepairAck = nextOption_artEmpty()
        api_pumpControlFail0 = nextOption_artEmpty()
        api_pumpControlFail1 = nextOption_artEmpty()
        api_pumpControlFail2 = nextOption_artEmpty()
        api_pumpControlFail3 = nextOption_artEmpty()
        api_pumpControlRepairAck0 = nextOption_artEmpty()
        api_pumpControlRepairAck1 = nextOption_artEmpty()
        api_pumpControlRepairAck2 = nextOption_artEmpty()
        api_pumpControlRepairAck3 = nextOption_artEmpty()
        api_pumpFail0 = nextOption_artEmpty()
        api_pumpFail1 = nextOption_artEmpty()
        api_pumpFail2 = nextOption_artEmpty()
        api_pumpFail3 = nextOption_artEmpty()
        api_pumpRepairAck0 = nextOption_artEmpty()
        api_pumpRepairAck1 = nextOption_artEmpty()
        api_pumpRepairAck2 = nextOption_artEmpty()
        api_pumpRepairAck3 = nextOption_artEmpty()
        api_ready = nextOption_artEmpty()
        api_steamFail = nextOption_artEmpty()
        api_steamRepairAck = nextOption_artEmpty()
        api_valve = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump0 = nextOptionB()
        api_openPump1 = nextOptionB()
        api_openPump2 = nextOptionB()
        api_openPump3 = nextOptionB()
        v = BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS(C, M1, M2, N1, N2, P, U1, U2, W, hasBoilerSentWaiting, isPump0Failing, isPump1Failing, isPump2Failing, isPump3Failing, isSteamMeterFailing, isWaterMeterFailing, mode, p0, p1, p2, p3, q, qa1, qa2, qc1, qc2, shouldUpdatePumps, transmissionFailure, v_steamRate, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       C = nextF32()
       M1 = nextF32()
       M2 = nextF32()
       N1 = nextF32()
       N2 = nextF32()
       P = nextF32()
       U1 = nextF32()
       U2 = nextF32()
       W = nextF32()
       hasBoilerSentWaiting = nextB()
       isPump0Failing = nextB()
       isPump1Failing = nextB()
       isPump2Failing = nextB()
       isPump3Failing = nextB()
       isSteamMeterFailing = nextB()
       isWaterMeterFailing = nextB()
       mode = nextBoilerControlOpModeType()
       p0 = nextF32()
       p1 = nextF32()
       p2 = nextF32()
       p3 = nextF32()
       q = nextF32()
       qa1 = nextF32()
       qa2 = nextF32()
       qc1 = nextF32()
       qc2 = nextF32()
       shouldUpdatePumps = nextB()
       transmissionFailure = nextB()
       v_steamRate = nextF32()
       api_levelFail = nextOption_artEmpty()
       api_levelRepairAck = nextOption_artEmpty()
       api_pumpControlFail0 = nextOption_artEmpty()
       api_pumpControlFail1 = nextOption_artEmpty()
       api_pumpControlFail2 = nextOption_artEmpty()
       api_pumpControlFail3 = nextOption_artEmpty()
       api_pumpControlRepairAck0 = nextOption_artEmpty()
       api_pumpControlRepairAck1 = nextOption_artEmpty()
       api_pumpControlRepairAck2 = nextOption_artEmpty()
       api_pumpControlRepairAck3 = nextOption_artEmpty()
       api_pumpFail0 = nextOption_artEmpty()
       api_pumpFail1 = nextOption_artEmpty()
       api_pumpFail2 = nextOption_artEmpty()
       api_pumpFail3 = nextOption_artEmpty()
       api_pumpRepairAck0 = nextOption_artEmpty()
       api_pumpRepairAck1 = nextOption_artEmpty()
       api_pumpRepairAck2 = nextOption_artEmpty()
       api_pumpRepairAck3 = nextOption_artEmpty()
       api_ready = nextOption_artEmpty()
       api_steamFail = nextOption_artEmpty()
       api_steamRepairAck = nextOption_artEmpty()
       api_valve = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump0 = nextOptionB()
       api_openPump1 = nextOptionB()
       api_openPump2 = nextOptionB()
       api_openPump3 = nextOptionB()
       v = BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS(C, M1, M2, N1, N2, P, U1, U2, W, hasBoilerSentWaiting, isPump0Failing, isPump1Failing, isPump2Failing, isPump3Failing, isSteamMeterFailing, isWaterMeterFailing, mode, p0, p1, p2, p3, q, qa1, qa2, qc1, qc2, shouldUpdatePumps, transmissionFailure, v_steamRate, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_ready, api_steamFail, api_steamRepairAck, api_valve, api_opMode, api_openPump0, api_openPump1, api_openPump2, api_openPump3)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PreState_Container ===================

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container
  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container(config: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container): RandomLib

  def nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container = {
    var callEnum: ISZ[BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id, BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id)

    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container = c match {
      case BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _).apply()
      case BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.attempts) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _).apply()
         case BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _).apply()
         case BoilerControlBoiler_i_bcproc_boiler_PreState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P ===================

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P
  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(config: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P): RandomLib

  def nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = {
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_valve: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P = BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P(api_programReady, api_valve, api_opMode)

    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_programReady = nextOption_artEmpty()
        api_valve = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P(api_programReady, api_valve, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_programReady = nextOption_artEmpty()
       api_valve = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P(api_programReady, api_valve, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS ===================

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS
  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(config: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS): RandomLib

  def nextBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(): BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = {
    var In_Mode: BoilerControl.OpMode.Type = nextBoilerControlOpModeType()
    var In_ValveOpen: B = nextB()
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_valve: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS = BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS(In_Mode, In_ValveOpen, api_programReady, api_valve, api_opMode)

    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_Mode = nextBoilerControlOpModeType()
        In_ValveOpen = nextB()
        api_programReady = nextOption_artEmpty()
        api_valve = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS(In_Mode, In_ValveOpen, api_programReady, api_valve, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_Mode = nextBoilerControlOpModeType()
       In_ValveOpen = nextB()
       api_programReady = nextOption_artEmpty()
       api_valve = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS(In_Mode, In_ValveOpen, api_programReady, api_valve, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PostState_Container ===================

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container
  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container(config: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container): RandomLib

  def nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container = {
    var callEnum: ISZ[BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id, BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id)

    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container = c match {
      case BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _).apply()
      case BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.attempts) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _).apply()
         case BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _).apply()
         case BoilerControlBoiler_i_bcproc_boiler_PostState_Container_DataTypeId.BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS_Id => (nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P ===================

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P
  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(config: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P): RandomLib

  def nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = {
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_waiting: Option[art.Empty] = nextOption_artEmpty()

    var v: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P = BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P(api_ready, api_waiting)

    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_ready = nextOption_artEmpty()
        api_waiting = nextOption_artEmpty()
        v = BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P(api_ready, api_waiting)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_ready = nextOption_artEmpty()
       api_waiting = nextOption_artEmpty()
       v = BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P(api_ready, api_waiting)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS ===================

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS
  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(config: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS): RandomLib

  def nextBoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(): BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = {
    var Mode: BoilerControl.OpMode.Type = nextBoilerControlOpModeType()
    var ValveOpen: B = nextB()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_waiting: Option[art.Empty] = nextOption_artEmpty()

    var v: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS = BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS(Mode, ValveOpen, api_ready, api_waiting)

    if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        Mode = nextBoilerControlOpModeType()
        ValveOpen = nextB()
        api_ready = nextOption_artEmpty()
        api_waiting = nextOption_artEmpty()
        v = BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS(Mode, ValveOpen, api_ready, api_waiting)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       Mode = nextBoilerControlOpModeType()
       ValveOpen = nextB()
       api_ready = nextOption_artEmpty()
       api_waiting = nextOption_artEmpty()
       v = BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS(Mode, ValveOpen, api_ready, api_waiting)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OpMode.Type ===================

  def get_Config_BoilerControlOpModeType: Config_BoilerControlOpModeType
  def set_Config_BoilerControlOpModeType(config: Config_BoilerControlOpModeType): RandomLib

  def nextBoilerControlOpModeType(): BoilerControl.OpMode.Type = {

    var ordinal: Z = gen.nextZBetween(0, bc.BoilerControl.OpMode.numOfElements-1)

    var v: BoilerControl.OpMode.Type = bc.BoilerControl.OpMode.byOrdinal(ordinal).get
    if(get_Config_BoilerControlOpModeType.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOpModeType.attempts) {
       if(get_Config_BoilerControlOpModeType.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlOpModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, bc.BoilerControl.OpMode.numOfElements-1)
       v = bc.BoilerControl.OpMode.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_BoilerControlOpModeType.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlOpModeType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, bc.BoilerControl.OpMode.numOfElements-1)
       v = bc.BoilerControl.OpMode.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OpMode_Payload ===================

  def get_Config_BoilerControlOpMode_Payload: Config_BoilerControlOpMode_Payload
  def set_Config_BoilerControlOpMode_Payload(config: Config_BoilerControlOpMode_Payload): RandomLib

  def nextBoilerControlOpMode_Payload(): BoilerControl.OpMode_Payload = {
    var value: BoilerControl.OpMode.Type = nextBoilerControlOpModeType()

    var v: BoilerControl.OpMode_Payload = BoilerControl.OpMode_Payload(value)

    if(get_Config_BoilerControlOpMode_Payload.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOpMode_Payload.attempts) {
        if(get_Config_BoilerControlOpMode_Payload.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlOpMode_Payload.verbose) {
          println(s"Retrying for failing value: $v")
        }
        value = nextBoilerControlOpModeType()
        v = BoilerControl.OpMode_Payload(value)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlOpMode_Payload.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlOpMode_Payload.verbose) {
         println(s"Retrying for failing value: $v")
       }
       value = nextBoilerControlOpModeType()
       v = BoilerControl.OpMode_Payload(value)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container ===================

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container
  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container): RandomLib

  def nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container = {
    var callEnum: ISZ[BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id, BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id)

    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container = c match {
      case BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _).apply()
      case BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.attempts) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _).apply()
         case BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _).apply()
         case BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P ===================

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P
  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P): RandomLib

  def nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = {
    var api_levelFail: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFail: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P = BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)

    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_levelFail = nextOption_artEmpty()
        api_levelRepairAck = nextOption_artEmpty()
        api_pumpControlFail0 = nextOption_artEmpty()
        api_pumpControlFail1 = nextOption_artEmpty()
        api_pumpControlFail2 = nextOption_artEmpty()
        api_pumpControlFail3 = nextOption_artEmpty()
        api_pumpControlRepairAck0 = nextOption_artEmpty()
        api_pumpControlRepairAck1 = nextOption_artEmpty()
        api_pumpControlRepairAck2 = nextOption_artEmpty()
        api_pumpControlRepairAck3 = nextOption_artEmpty()
        api_pumpFail0 = nextOption_artEmpty()
        api_pumpFail1 = nextOption_artEmpty()
        api_pumpFail2 = nextOption_artEmpty()
        api_pumpFail3 = nextOption_artEmpty()
        api_pumpRepairAck0 = nextOption_artEmpty()
        api_pumpRepairAck1 = nextOption_artEmpty()
        api_pumpRepairAck2 = nextOption_artEmpty()
        api_pumpRepairAck3 = nextOption_artEmpty()
        api_steamFail = nextOption_artEmpty()
        api_steamRepairAck = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_levelFail = nextOption_artEmpty()
       api_levelRepairAck = nextOption_artEmpty()
       api_pumpControlFail0 = nextOption_artEmpty()
       api_pumpControlFail1 = nextOption_artEmpty()
       api_pumpControlFail2 = nextOption_artEmpty()
       api_pumpControlFail3 = nextOption_artEmpty()
       api_pumpControlRepairAck0 = nextOption_artEmpty()
       api_pumpControlRepairAck1 = nextOption_artEmpty()
       api_pumpControlRepairAck2 = nextOption_artEmpty()
       api_pumpControlRepairAck3 = nextOption_artEmpty()
       api_pumpFail0 = nextOption_artEmpty()
       api_pumpFail1 = nextOption_artEmpty()
       api_pumpFail2 = nextOption_artEmpty()
       api_pumpFail3 = nextOption_artEmpty()
       api_pumpRepairAck0 = nextOption_artEmpty()
       api_pumpRepairAck1 = nextOption_artEmpty()
       api_pumpRepairAck2 = nextOption_artEmpty()
       api_pumpRepairAck3 = nextOption_artEmpty()
       api_steamFail = nextOption_artEmpty()
       api_steamRepairAck = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P(api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS ===================

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS
  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS): RandomLib

  def nextBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(): BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
    var In_isLevelBroken: B = nextB()
    var In_isPumpBroken0: B = nextB()
    var In_isPumpBroken1: B = nextB()
    var In_isPumpBroken2: B = nextB()
    var In_isPumpBroken3: B = nextB()
    var In_isPumpControlBroken0: B = nextB()
    var In_isPumpControlBroken1: B = nextB()
    var In_isPumpControlBroken2: B = nextB()
    var In_isPumpControlBroken3: B = nextB()
    var In_isSteamBroken: B = nextB()
    var api_levelFail: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFail3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepairAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFail: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepairAck: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS = BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS(In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)

    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_isLevelBroken = nextB()
        In_isPumpBroken0 = nextB()
        In_isPumpBroken1 = nextB()
        In_isPumpBroken2 = nextB()
        In_isPumpBroken3 = nextB()
        In_isPumpControlBroken0 = nextB()
        In_isPumpControlBroken1 = nextB()
        In_isPumpControlBroken2 = nextB()
        In_isPumpControlBroken3 = nextB()
        In_isSteamBroken = nextB()
        api_levelFail = nextOption_artEmpty()
        api_levelRepairAck = nextOption_artEmpty()
        api_pumpControlFail0 = nextOption_artEmpty()
        api_pumpControlFail1 = nextOption_artEmpty()
        api_pumpControlFail2 = nextOption_artEmpty()
        api_pumpControlFail3 = nextOption_artEmpty()
        api_pumpControlRepairAck0 = nextOption_artEmpty()
        api_pumpControlRepairAck1 = nextOption_artEmpty()
        api_pumpControlRepairAck2 = nextOption_artEmpty()
        api_pumpControlRepairAck3 = nextOption_artEmpty()
        api_pumpFail0 = nextOption_artEmpty()
        api_pumpFail1 = nextOption_artEmpty()
        api_pumpFail2 = nextOption_artEmpty()
        api_pumpFail3 = nextOption_artEmpty()
        api_pumpRepairAck0 = nextOption_artEmpty()
        api_pumpRepairAck1 = nextOption_artEmpty()
        api_pumpRepairAck2 = nextOption_artEmpty()
        api_pumpRepairAck3 = nextOption_artEmpty()
        api_steamFail = nextOption_artEmpty()
        api_steamRepairAck = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS(In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_isLevelBroken = nextB()
       In_isPumpBroken0 = nextB()
       In_isPumpBroken1 = nextB()
       In_isPumpBroken2 = nextB()
       In_isPumpBroken3 = nextB()
       In_isPumpControlBroken0 = nextB()
       In_isPumpControlBroken1 = nextB()
       In_isPumpControlBroken2 = nextB()
       In_isPumpControlBroken3 = nextB()
       In_isSteamBroken = nextB()
       api_levelFail = nextOption_artEmpty()
       api_levelRepairAck = nextOption_artEmpty()
       api_pumpControlFail0 = nextOption_artEmpty()
       api_pumpControlFail1 = nextOption_artEmpty()
       api_pumpControlFail2 = nextOption_artEmpty()
       api_pumpControlFail3 = nextOption_artEmpty()
       api_pumpControlRepairAck0 = nextOption_artEmpty()
       api_pumpControlRepairAck1 = nextOption_artEmpty()
       api_pumpControlRepairAck2 = nextOption_artEmpty()
       api_pumpControlRepairAck3 = nextOption_artEmpty()
       api_pumpFail0 = nextOption_artEmpty()
       api_pumpFail1 = nextOption_artEmpty()
       api_pumpFail2 = nextOption_artEmpty()
       api_pumpFail3 = nextOption_artEmpty()
       api_pumpRepairAck0 = nextOption_artEmpty()
       api_pumpRepairAck1 = nextOption_artEmpty()
       api_pumpRepairAck2 = nextOption_artEmpty()
       api_pumpRepairAck3 = nextOption_artEmpty()
       api_steamFail = nextOption_artEmpty()
       api_steamRepairAck = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS(In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container ===================

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container
  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container): RandomLib

  def nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container = {
    var callEnum: ISZ[BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id, BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id)

    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container = c match {
      case BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _).apply()
      case BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.attempts) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _).apply()
         case BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _).apply()
         case BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_DataTypeId.BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS_Id => (nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P ===================

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P
  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P): RandomLib

  def nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = {
    var api_levelFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_stop: Option[art.Empty] = nextOption_artEmpty()

    var v: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P = BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P(api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)

    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_levelFailAck = nextOption_artEmpty()
        api_levelRepair = nextOption_artEmpty()
        api_pumpControlFailAck0 = nextOption_artEmpty()
        api_pumpControlFailAck1 = nextOption_artEmpty()
        api_pumpControlFailAck2 = nextOption_artEmpty()
        api_pumpControlFailAck3 = nextOption_artEmpty()
        api_pumpControlRepair0 = nextOption_artEmpty()
        api_pumpControlRepair1 = nextOption_artEmpty()
        api_pumpControlRepair2 = nextOption_artEmpty()
        api_pumpControlRepair3 = nextOption_artEmpty()
        api_pumpFailAck0 = nextOption_artEmpty()
        api_pumpFailAck1 = nextOption_artEmpty()
        api_pumpFailAck2 = nextOption_artEmpty()
        api_pumpFailAck3 = nextOption_artEmpty()
        api_pumpRepair0 = nextOption_artEmpty()
        api_pumpRepair1 = nextOption_artEmpty()
        api_pumpRepair2 = nextOption_artEmpty()
        api_pumpRepair3 = nextOption_artEmpty()
        api_steamFailAck = nextOption_artEmpty()
        api_steamRepair = nextOption_artEmpty()
        api_stop = nextOption_artEmpty()
        v = BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P(api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_levelFailAck = nextOption_artEmpty()
       api_levelRepair = nextOption_artEmpty()
       api_pumpControlFailAck0 = nextOption_artEmpty()
       api_pumpControlFailAck1 = nextOption_artEmpty()
       api_pumpControlFailAck2 = nextOption_artEmpty()
       api_pumpControlFailAck3 = nextOption_artEmpty()
       api_pumpControlRepair0 = nextOption_artEmpty()
       api_pumpControlRepair1 = nextOption_artEmpty()
       api_pumpControlRepair2 = nextOption_artEmpty()
       api_pumpControlRepair3 = nextOption_artEmpty()
       api_pumpFailAck0 = nextOption_artEmpty()
       api_pumpFailAck1 = nextOption_artEmpty()
       api_pumpFailAck2 = nextOption_artEmpty()
       api_pumpFailAck3 = nextOption_artEmpty()
       api_pumpRepair0 = nextOption_artEmpty()
       api_pumpRepair1 = nextOption_artEmpty()
       api_pumpRepair2 = nextOption_artEmpty()
       api_pumpRepair3 = nextOption_artEmpty()
       api_steamFailAck = nextOption_artEmpty()
       api_steamRepair = nextOption_artEmpty()
       api_stop = nextOption_artEmpty()
       v = BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P(api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS ===================

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS
  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS): RandomLib

  def nextBoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(): BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = {
    var isLevelBroken: B = nextB()
    var isPumpBroken0: B = nextB()
    var isPumpBroken1: B = nextB()
    var isPumpBroken2: B = nextB()
    var isPumpBroken3: B = nextB()
    var isPumpControlBroken0: B = nextB()
    var isPumpControlBroken1: B = nextB()
    var isPumpControlBroken2: B = nextB()
    var isPumpControlBroken3: B = nextB()
    var isSteamBroken: B = nextB()
    var api_levelFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_levelRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpControlRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFailAck3: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair0: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair1: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair2: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpRepair3: Option[art.Empty] = nextOption_artEmpty()
    var api_steamFailAck: Option[art.Empty] = nextOption_artEmpty()
    var api_steamRepair: Option[art.Empty] = nextOption_artEmpty()
    var api_stop: Option[art.Empty] = nextOption_artEmpty()

    var v: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS = BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS(isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)

    if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        isLevelBroken = nextB()
        isPumpBroken0 = nextB()
        isPumpBroken1 = nextB()
        isPumpBroken2 = nextB()
        isPumpBroken3 = nextB()
        isPumpControlBroken0 = nextB()
        isPumpControlBroken1 = nextB()
        isPumpControlBroken2 = nextB()
        isPumpControlBroken3 = nextB()
        isSteamBroken = nextB()
        api_levelFailAck = nextOption_artEmpty()
        api_levelRepair = nextOption_artEmpty()
        api_pumpControlFailAck0 = nextOption_artEmpty()
        api_pumpControlFailAck1 = nextOption_artEmpty()
        api_pumpControlFailAck2 = nextOption_artEmpty()
        api_pumpControlFailAck3 = nextOption_artEmpty()
        api_pumpControlRepair0 = nextOption_artEmpty()
        api_pumpControlRepair1 = nextOption_artEmpty()
        api_pumpControlRepair2 = nextOption_artEmpty()
        api_pumpControlRepair3 = nextOption_artEmpty()
        api_pumpFailAck0 = nextOption_artEmpty()
        api_pumpFailAck1 = nextOption_artEmpty()
        api_pumpFailAck2 = nextOption_artEmpty()
        api_pumpFailAck3 = nextOption_artEmpty()
        api_pumpRepair0 = nextOption_artEmpty()
        api_pumpRepair1 = nextOption_artEmpty()
        api_pumpRepair2 = nextOption_artEmpty()
        api_pumpRepair3 = nextOption_artEmpty()
        api_steamFailAck = nextOption_artEmpty()
        api_steamRepair = nextOption_artEmpty()
        api_stop = nextOption_artEmpty()
        v = BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS(isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       isLevelBroken = nextB()
       isPumpBroken0 = nextB()
       isPumpBroken1 = nextB()
       isPumpBroken2 = nextB()
       isPumpBroken3 = nextB()
       isPumpControlBroken0 = nextB()
       isPumpControlBroken1 = nextB()
       isPumpControlBroken2 = nextB()
       isPumpControlBroken3 = nextB()
       isSteamBroken = nextB()
       api_levelFailAck = nextOption_artEmpty()
       api_levelRepair = nextOption_artEmpty()
       api_pumpControlFailAck0 = nextOption_artEmpty()
       api_pumpControlFailAck1 = nextOption_artEmpty()
       api_pumpControlFailAck2 = nextOption_artEmpty()
       api_pumpControlFailAck3 = nextOption_artEmpty()
       api_pumpControlRepair0 = nextOption_artEmpty()
       api_pumpControlRepair1 = nextOption_artEmpty()
       api_pumpControlRepair2 = nextOption_artEmpty()
       api_pumpControlRepair3 = nextOption_artEmpty()
       api_pumpFailAck0 = nextOption_artEmpty()
       api_pumpFailAck1 = nextOption_artEmpty()
       api_pumpFailAck2 = nextOption_artEmpty()
       api_pumpFailAck3 = nextOption_artEmpty()
       api_pumpRepair0 = nextOption_artEmpty()
       api_pumpRepair1 = nextOption_artEmpty()
       api_pumpRepair2 = nextOption_artEmpty()
       api_pumpRepair3 = nextOption_artEmpty()
       api_steamFailAck = nextOption_artEmpty()
       api_steamRepair = nextOption_artEmpty()
       api_stop = nextOption_artEmpty()
       v = BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS(isLevelBroken, isPumpBroken0, isPumpBroken1, isPumpBroken2, isPumpBroken3, isPumpControlBroken0, isPumpControlBroken1, isPumpControlBroken2, isPumpControlBroken3, isSteamBroken, api_levelFailAck, api_levelRepair, api_pumpControlFailAck0, api_pumpControlFailAck1, api_pumpControlFailAck2, api_pumpControlFailAck3, api_pumpControlRepair0, api_pumpControlRepair1, api_pumpControlRepair2, api_pumpControlRepair3, api_pumpFailAck0, api_pumpFailAck1, api_pumpFailAck2, api_pumpFailAck3, api_pumpRepair0, api_pumpRepair1, api_pumpRepair2, api_pumpRepair3, api_steamFailAck, api_steamRepair, api_stop)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P(api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
    var In_isPumpFlow: B = nextB()
    var In_isPumpOpen: B = nextB()
    var In_pumpNumber: Z = nextZ()
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_isPumpFlow = nextB()
        In_isPumpOpen = nextB()
        In_pumpNumber = nextZ()
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_isPumpFlow = nextB()
       In_isPumpOpen = nextB()
       In_pumpNumber = nextZ()
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = {
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {
    var isPumpFlow: B = nextB()
    var isPumpOpen: B = nextB()
    var pumpNumber: Z = nextZ()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        isPumpFlow = nextB()
        isPumpOpen = nextB()
        pumpNumber = nextZ()
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       isPumpFlow = nextB()
       isPumpOpen = nextB()
       pumpNumber = nextZ()
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = {
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P(api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {
    var In_isPumpFlow: B = nextB()
    var In_isPumpOpen: B = nextB()
    var In_pumpNumber: Z = nextZ()
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_isPumpFlow = nextB()
        In_isPumpOpen = nextB()
        In_pumpNumber = nextZ()
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_isPumpFlow = nextB()
       In_isPumpOpen = nextB()
       In_pumpNumber = nextZ()
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = {
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {
    var isPumpFlow: B = nextB()
    var isPumpOpen: B = nextB()
    var pumpNumber: Z = nextZ()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        isPumpFlow = nextB()
        isPumpOpen = nextB()
        pumpNumber = nextZ()
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       isPumpFlow = nextB()
       isPumpOpen = nextB()
       pumpNumber = nextZ()
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = {
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P(api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {
    var In_isPumpFlow: B = nextB()
    var In_isPumpOpen: B = nextB()
    var In_pumpNumber: Z = nextZ()
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_isPumpFlow = nextB()
        In_isPumpOpen = nextB()
        In_pumpNumber = nextZ()
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_isPumpFlow = nextB()
       In_isPumpOpen = nextB()
       In_pumpNumber = nextZ()
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = {
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {
    var isPumpFlow: B = nextB()
    var isPumpOpen: B = nextB()
    var pumpNumber: Z = nextZ()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        isPumpFlow = nextB()
        isPumpOpen = nextB()
        pumpNumber = nextZ()
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       isPumpFlow = nextB()
       isPumpOpen = nextB()
       pumpNumber = nextZ()
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = {
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P(api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P(api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {
    var In_isPumpFlow: B = nextB()
    var In_isPumpOpen: B = nextB()
    var In_pumpNumber: Z = nextZ()
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()
    var api_openPump: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_isPumpFlow = nextB()
        In_isPumpOpen = nextB()
        In_pumpNumber = nextZ()
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        api_openPump = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_isPumpFlow = nextB()
       In_isPumpOpen = nextB()
       In_pumpNumber = nextZ()
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       api_openPump = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS(In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container = {
    var callEnum: ISZ[BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id, BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container = c match {
      case BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _).apply()
      case BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.attempts) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _).apply()
         case BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_DataTypeId.BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS_Id => (nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = {
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P = BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P(api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS ===================

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS
  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS): RandomLib

  def nextBoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(): BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {
    var isPumpFlow: B = nextB()
    var isPumpOpen: B = nextB()
    var pumpNumber: Z = nextZ()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_pumpFlow: Option[B] = nextOptionB()
    var api_pumpOpen: Option[B] = nextOptionB()

    var v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS = BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)

    if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        isPumpFlow = nextB()
        isPumpOpen = nextB()
        pumpNumber = nextZ()
        api_ready = nextOption_artEmpty()
        api_pumpFlow = nextOptionB()
        api_pumpOpen = nextOptionB()
        v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       isPumpFlow = nextB()
       isPumpOpen = nextB()
       pumpNumber = nextZ()
       api_ready = nextOption_artEmpty()
       api_pumpFlow = nextOptionB()
       api_pumpOpen = nextOptionB()
       v = BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS(isPumpFlow, isPumpOpen, pumpNumber, api_ready, api_pumpFlow, api_pumpOpen)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container ===================

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container
  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container): RandomLib

  def nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container = {
    var callEnum: ISZ[BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id, BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id)

    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container = c match {
      case BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _).apply()
      case BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.attempts) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _).apply()
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _).apply()
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P ===================

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P
  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P): RandomLib

  def nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = {
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P = BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P(api_programReady, api_opMode)

    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P(api_programReady, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P(api_programReady, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS ===================

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS
  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS): RandomLib

  def nextBoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {
    var In_computedRate: F32 = nextF32()
    var In_volume: F32 = nextF32()
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS = BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS(In_computedRate, In_volume, api_programReady, api_opMode)

    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_computedRate = nextF32()
        In_volume = nextF32()
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS(In_computedRate, In_volume, api_programReady, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_computedRate = nextF32()
       In_volume = nextF32()
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS(In_computedRate, In_volume, api_programReady, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container ===================

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container
  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container): RandomLib

  def nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container = {
    var callEnum: ISZ[BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id, BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id)

    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container = c match {
      case BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _).apply()
      case BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.attempts) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _).apply()
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _).apply()
         case BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_DataTypeId.BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS_Id => (nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P ===================

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P
  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P): RandomLib

  def nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = {
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_rate: Option[F32] = nextOptionF32()

    var v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P = BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P(api_ready, api_rate)

    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_ready = nextOption_artEmpty()
        api_rate = nextOptionF32()
        v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P(api_ready, api_rate)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_ready = nextOption_artEmpty()
       api_rate = nextOptionF32()
       v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P(api_ready, api_rate)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS ===================

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS
  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS): RandomLib

  def nextBoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(): BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {
    var computedRate: F32 = nextF32()
    var volume: F32 = nextF32()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_rate: Option[F32] = nextOptionF32()

    var v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS = BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS(computedRate, volume, api_ready, api_rate)

    if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        computedRate = nextF32()
        volume = nextF32()
        api_ready = nextOption_artEmpty()
        api_rate = nextOptionF32()
        v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS(computedRate, volume, api_ready, api_rate)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       computedRate = nextF32()
       volume = nextF32()
       api_ready = nextOption_artEmpty()
       api_rate = nextOptionF32()
       v = BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS(computedRate, volume, api_ready, api_rate)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container ===================

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container
  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container): RandomLib

  def nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container = {
    var callEnum: ISZ[BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.Type] = ISZ(BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id, BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id)

    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container = c match {
      case BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _).apply()
      case BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.attempts) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _).apply()
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _).apply()
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P ===================

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P
  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P): RandomLib

  def nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = {
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P = BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P(api_programReady, api_opMode)

    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P.attempts) {
        if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P(api_programReady, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P(api_programReady, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS ===================

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS
  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS): RandomLib

  def nextBoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {
    var In_volume: F32 = nextF32()
    var api_programReady: Option[art.Empty] = nextOption_artEmpty()
    var api_opMode: Option[BoilerControl.OpMode.Type] = nextOptionBoilerControlOpModeType()

    var v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS = BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS(In_volume, api_programReady, api_opMode)

    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS.attempts) {
        if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        In_volume = nextF32()
        api_programReady = nextOption_artEmpty()
        api_opMode = nextOptionBoilerControlOpModeType()
        v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS(In_volume, api_programReady, api_opMode)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       In_volume = nextF32()
       api_programReady = nextOption_artEmpty()
       api_opMode = nextOptionBoilerControlOpModeType()
       v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS(In_volume, api_programReady, api_opMode)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container ===================

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container
  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container): RandomLib

  def nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container = {
    var callEnum: ISZ[BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.Type] = ISZ(BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id, BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id)

    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.additiveTypeFiltering) {
       callEnum = get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.typeFilter
    } else {
       for(h <- get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.typeFilter) {
         callEnum = ops.ISZOps(callEnum).filter(f => h =!= f)
       }
    }

    var c = callEnum(gen.nextZBetween(0, callEnum.size-1))

    var v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container = c match {
      case BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _).apply()
      case BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _).apply()
      case _ => halt("Invalid Child")
    }


    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.attempts) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.filter(v)) {
        return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _).apply()
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container.verbose) {
         println(s"Retrying for failing value: $v")
       }
       c = callEnum(gen.nextZBetween(0, callEnum.size-1))

       v = c match {
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _).apply()
         case BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_DataTypeId.BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS_Id => (nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _).apply()
         case _ => halt("Invalid Child")
       }
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P ===================

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P
  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P): RandomLib

  def nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = {
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_level: Option[F32] = nextOptionF32()

    var v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P = BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P(api_ready, api_level)

    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P.attempts) {
        if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P.verbose) {
          println(s"Retrying for failing value: $v")
        }
        api_ready = nextOption_artEmpty()
        api_level = nextOptionF32()
        v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P(api_ready, api_level)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P.verbose) {
         println(s"Retrying for failing value: $v")
       }
       api_ready = nextOption_artEmpty()
       api_level = nextOptionF32()
       v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P(api_ready, api_level)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS ===================

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS
  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS): RandomLib

  def nextBoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(): BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {
    var volume: F32 = nextF32()
    var api_ready: Option[art.Empty] = nextOption_artEmpty()
    var api_level: Option[F32] = nextOptionF32()

    var v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS = BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS(volume, api_ready, api_level)

    if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS.attempts >= 0) {
     for(i <- 0 to get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS.attempts) {
        if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS.filter(v)) {
          return v
        }
        if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS.verbose) {
          println(s"Retrying for failing value: $v")
        }
        volume = nextF32()
        api_ready = nextOption_artEmpty()
        api_level = nextOptionF32()
        v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS(volume, api_ready, api_level)
     }
    } else {
     while(T) {
       if(get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS.filter(v)) {
         return v
       }
       if (get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS.verbose) {
         println(s"Retrying for failing value: $v")
       }
       volume = nextF32()
       api_ready = nextOption_artEmpty()
       api_level = nextOptionF32()
       v = BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS(volume, api_ready, api_level)
     }
    }

    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

  // ============= runtimemonitor.ObservationKind.Type ===================

  def get_Config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType
  def set_Config_runtimemonitorObservationKindType(config: Config_runtimemonitorObservationKindType): RandomLib

  def nextruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {

    var ordinal: Z = gen.nextZBetween(0, bc.runtimemonitor.ObservationKind.numOfElements-1)

    var v: runtimemonitor.ObservationKind.Type = bc.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
    if(get_Config_runtimemonitorObservationKindType.attempts >= 0) {
     for(i <- 0 to get_Config_runtimemonitorObservationKindType.attempts) {
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, bc.runtimemonitor.ObservationKind.numOfElements-1)
       v = bc.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    } else {
     while(T){
       if(get_Config_runtimemonitorObservationKindType.filter(v)) {
        return v
       }
       if (get_Config_runtimemonitorObservationKindType.verbose) {
         println(s"Retrying for failing value: $v")
       }
       ordinal= gen.nextZBetween(0, bc.runtimemonitor.ObservationKind.numOfElements-1)
       v = bc.runtimemonitor.ObservationKind.byOrdinal(ordinal).get
     }
    }
    assert(F, "Requirements too strict to generate")
    halt("Requirements too strict to generate")
  }

}

@record class RandomLib(val gen: org.sireum.Random.Gen) extends RandomLibI {

  var numElem: Z = 50

  var _verbose: B = F
  def verbose: RandomLib = {
    _verbose = !_verbose
    return this
  }

  def get_numElement: Z = {return numElem}

  def set_numElement(s: Z): Unit ={
    numElem = s
  }

  // ============= String =============

  def alwaysTrue_String(v: String): B = {return T}

  var config_String: Config_String = Config_String(0, numElem, 100, _verbose, alwaysTrue_String _)

  def get_Config_String: Config_String = {return config_String}

  def set_Config_String(config: Config_String): RandomLib = {
    config_String = config
    return this
  }

  // ============= Z ===================
  def alwaysTrue_Z(v: Z): B = {return T}

  var config_Z: Config_Z = Config_Z(None(), None(), 100, _verbose, alwaysTrue_Z _)
  def get_Config_Z: Config_Z = {return config_Z}

  def set_Config_Z(config: Config_Z): RandomLib ={
    config_Z = config
    return this
  }

  // ============= B ===================
  def alwaysTrue_B(v: B): B = {return T}

  var config_B: Config_B = Config_B(100, _verbose, alwaysTrue_B _)
  def get_Config_B: Config_B = {return config_B}

  def set_Config_B(config: Config_B): RandomLib ={
    config_B = config
    return this
  }

  // ============= C ===================
  def alwaysTrue_C(v: C): B = {return T}

  var config_C: Config_C = Config_C(None(), None(), 100, _verbose, alwaysTrue_C _)
  def get_Config_C: Config_C = {return config_C}

  def set_Config_C(config: Config_C): RandomLib ={
    config_C = config
    return this
  }

  // ============= R ===================
  def alwaysTrue_R(v: R): B = {return T}

  var config_R: Config_R = Config_R(None(), None(), 100, _verbose, alwaysTrue_R _)
  def get_Config_R: Config_R = {return config_R}

  def set_Config_R(config: Config_R): RandomLib ={
    config_R = config
    return this
  }

  // ============= F32 ===================
  def alwaysTrue_F32(v: F32): B = {return T}

  var config_F32: Config_F32 = Config_F32(None(), None(), 100, _verbose, alwaysTrue_F32 _)
  def get_Config_F32: Config_F32 = {return config_F32}

  def set_Config_F32(config: Config_F32): RandomLib ={
    config_F32 = config
    return this
  }

  // ============= F64 ===================
  def alwaysTrue_F64(v: F64): B = {return T}

  var config_F64: Config_F64 = Config_F64(None(), None(), 100, _verbose, alwaysTrue_F64 _)
  def get_Config_F64: Config_F64 = {return config_F64}

  def set_Config_F64(config: Config_F64): RandomLib ={
    config_F64 = config
    return this
  }

  // ============= S8 ===================
  def alwaysTrue_S8(v: S8): B = {return T}

  var config_S8: Config_S8 = Config_S8(None(), None(), 100, _verbose, alwaysTrue_S8 _)
  def get_Config_S8: Config_S8 = {return config_S8}

  def set_Config_S8(config: Config_S8): RandomLib ={
    config_S8 = config
    return this
  }

  // ============= S16 ===================
  def alwaysTrue_S16(v: S16): B = {return T}

  var config_S16: Config_S16 = Config_S16(None(), None(), 100, _verbose, alwaysTrue_S16 _)
  def get_Config_S16: Config_S16 = {return config_S16}

  def set_Config_S16(config: Config_S16): RandomLib ={
    config_S16 = config
    return this
  }

  // ============= S32 ===================
  def alwaysTrue_S32(v: S32): B = {return T}

  var config_S32: Config_S32 = Config_S32(None(), None(), 100, _verbose, alwaysTrue_S32 _)
  def get_Config_S32: Config_S32 = {return config_S32}

  def set_Config_S32(config: Config_S32): RandomLib ={
    config_S32 = config
    return this
  }

  // ============= S64 ===================
  def alwaysTrue_S64(v: S64): B = {return T}

  var config_S64: Config_S64 = Config_S64(None(), None(), 100, _verbose, alwaysTrue_S64 _)
  def get_Config_S64: Config_S64 = {return config_S64}

  def set_Config_S64(config: Config_S64): RandomLib ={
    config_S64 = config
    return this
  }

  // ============= U8 ===================
  def alwaysTrue_U8(v: U8): B = {return T}

  var config_U8: Config_U8 = Config_U8(None(), None(), 100, _verbose, alwaysTrue_U8 _)
  def get_Config_U8: Config_U8 = {return config_U8}

  def set_Config_U8(config: Config_U8): RandomLib ={
    config_U8 = config
    return this
  }

  // ============= U16 ===================
  def alwaysTrue_U16(v: U16): B = {return T}

  var config_U16: Config_U16 = Config_U16(None(), None(), 100, _verbose, alwaysTrue_U16 _)
  def get_Config_U16: Config_U16 = {return config_U16}

  def set_Config_U16(config: Config_U16): RandomLib ={
    config_U16 = config
    return this
  }

  // ============= U32 ===================
  def alwaysTrue_U32(v: U32): B = {return T}

  var config_U32: Config_U32 = Config_U32(None(), None(), 100, _verbose, alwaysTrue_U32 _)
  def get_Config_U32: Config_U32 = {return config_U32}

  def set_Config_U32(config: Config_U32): RandomLib ={
    config_U32 = config
    return this
  }

  // ============= U64 ===================
  def alwaysTrue_U64(v: U64): B = {return T}

  var config_U64: Config_U64 = Config_U64(None(), None(), 100, _verbose, alwaysTrue_U64 _)
  def get_Config_U64: Config_U64 = {return config_U64}

  def set_Config_U64(config: Config_U64): RandomLib ={
    config_U64 = config
    return this
  }

  // ============= art.DataContent ===================
  def alwaysTrue__artDataContent(v: art.DataContent): B = {return T}

  var config__artDataContent: Config__artDataContent = Config__artDataContent(100, _verbose, F, ISZ(), alwaysTrue__artDataContent _)

  def get_Config__artDataContent: Config__artDataContent = {return config__artDataContent}

  def set_Config__artDataContent(config: Config__artDataContent): RandomLib ={
    config__artDataContent = config
    return this
  }

  // ============= art.Empty ===================
  def alwaysTrue__artEmpty(v: art.Empty): B = {return T}

  var config__artEmpty: Config__artEmpty = Config__artEmpty(100, _verbose, alwaysTrue__artEmpty _)

  def get_Config__artEmpty: Config__artEmpty = {return config__artEmpty}

  def set_Config__artEmpty(config: Config__artEmpty): RandomLib ={
    config__artEmpty = config
    return this
  }

  // ============= Base_Types.Boolean_Payload ===================
  def alwaysTrue_Base_TypesBoolean_Payload(v: Base_Types.Boolean_Payload): B = {return T}

  var config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = Config_Base_TypesBoolean_Payload(100, _verbose, alwaysTrue_Base_TypesBoolean_Payload _)

  def get_Config_Base_TypesBoolean_Payload: Config_Base_TypesBoolean_Payload = {return config_Base_TypesBoolean_Payload}

  def set_Config_Base_TypesBoolean_Payload(config: Config_Base_TypesBoolean_Payload): RandomLib ={
    config_Base_TypesBoolean_Payload = config
    return this
  }

  // ============= Base_Types.Integer_Payload ===================
  def alwaysTrue_Base_TypesInteger_Payload(v: Base_Types.Integer_Payload): B = {return T}

  var config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = Config_Base_TypesInteger_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_Payload _)

  def get_Config_Base_TypesInteger_Payload: Config_Base_TypesInteger_Payload = {return config_Base_TypesInteger_Payload}

  def set_Config_Base_TypesInteger_Payload(config: Config_Base_TypesInteger_Payload): RandomLib ={
    config_Base_TypesInteger_Payload = config
    return this
  }

  // ============= Base_Types.Integer_8_Payload ===================
  def alwaysTrue_Base_TypesInteger_8_Payload(v: Base_Types.Integer_8_Payload): B = {return T}

  var config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = Config_Base_TypesInteger_8_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_8_Payload _)

  def get_Config_Base_TypesInteger_8_Payload: Config_Base_TypesInteger_8_Payload = {return config_Base_TypesInteger_8_Payload}

  def set_Config_Base_TypesInteger_8_Payload(config: Config_Base_TypesInteger_8_Payload): RandomLib ={
    config_Base_TypesInteger_8_Payload = config
    return this
  }

  // ============= Base_Types.Integer_16_Payload ===================
  def alwaysTrue_Base_TypesInteger_16_Payload(v: Base_Types.Integer_16_Payload): B = {return T}

  var config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = Config_Base_TypesInteger_16_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_16_Payload _)

  def get_Config_Base_TypesInteger_16_Payload: Config_Base_TypesInteger_16_Payload = {return config_Base_TypesInteger_16_Payload}

  def set_Config_Base_TypesInteger_16_Payload(config: Config_Base_TypesInteger_16_Payload): RandomLib ={
    config_Base_TypesInteger_16_Payload = config
    return this
  }

  // ============= Base_Types.Integer_32_Payload ===================
  def alwaysTrue_Base_TypesInteger_32_Payload(v: Base_Types.Integer_32_Payload): B = {return T}

  var config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = Config_Base_TypesInteger_32_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_32_Payload _)

  def get_Config_Base_TypesInteger_32_Payload: Config_Base_TypesInteger_32_Payload = {return config_Base_TypesInteger_32_Payload}

  def set_Config_Base_TypesInteger_32_Payload(config: Config_Base_TypesInteger_32_Payload): RandomLib ={
    config_Base_TypesInteger_32_Payload = config
    return this
  }

  // ============= Base_Types.Integer_64_Payload ===================
  def alwaysTrue_Base_TypesInteger_64_Payload(v: Base_Types.Integer_64_Payload): B = {return T}

  var config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = Config_Base_TypesInteger_64_Payload(100, _verbose, alwaysTrue_Base_TypesInteger_64_Payload _)

  def get_Config_Base_TypesInteger_64_Payload: Config_Base_TypesInteger_64_Payload = {return config_Base_TypesInteger_64_Payload}

  def set_Config_Base_TypesInteger_64_Payload(config: Config_Base_TypesInteger_64_Payload): RandomLib ={
    config_Base_TypesInteger_64_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_8_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_8_Payload(v: Base_Types.Unsigned_8_Payload): B = {return T}

  var config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = Config_Base_TypesUnsigned_8_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_8_Payload _)

  def get_Config_Base_TypesUnsigned_8_Payload: Config_Base_TypesUnsigned_8_Payload = {return config_Base_TypesUnsigned_8_Payload}

  def set_Config_Base_TypesUnsigned_8_Payload(config: Config_Base_TypesUnsigned_8_Payload): RandomLib ={
    config_Base_TypesUnsigned_8_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_16_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_16_Payload(v: Base_Types.Unsigned_16_Payload): B = {return T}

  var config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = Config_Base_TypesUnsigned_16_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_16_Payload _)

  def get_Config_Base_TypesUnsigned_16_Payload: Config_Base_TypesUnsigned_16_Payload = {return config_Base_TypesUnsigned_16_Payload}

  def set_Config_Base_TypesUnsigned_16_Payload(config: Config_Base_TypesUnsigned_16_Payload): RandomLib ={
    config_Base_TypesUnsigned_16_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_32_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_32_Payload(v: Base_Types.Unsigned_32_Payload): B = {return T}

  var config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = Config_Base_TypesUnsigned_32_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_32_Payload _)

  def get_Config_Base_TypesUnsigned_32_Payload: Config_Base_TypesUnsigned_32_Payload = {return config_Base_TypesUnsigned_32_Payload}

  def set_Config_Base_TypesUnsigned_32_Payload(config: Config_Base_TypesUnsigned_32_Payload): RandomLib ={
    config_Base_TypesUnsigned_32_Payload = config
    return this
  }

  // ============= Base_Types.Unsigned_64_Payload ===================
  def alwaysTrue_Base_TypesUnsigned_64_Payload(v: Base_Types.Unsigned_64_Payload): B = {return T}

  var config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = Config_Base_TypesUnsigned_64_Payload(100, _verbose, alwaysTrue_Base_TypesUnsigned_64_Payload _)

  def get_Config_Base_TypesUnsigned_64_Payload: Config_Base_TypesUnsigned_64_Payload = {return config_Base_TypesUnsigned_64_Payload}

  def set_Config_Base_TypesUnsigned_64_Payload(config: Config_Base_TypesUnsigned_64_Payload): RandomLib ={
    config_Base_TypesUnsigned_64_Payload = config
    return this
  }

  // ============= Base_Types.Float_Payload ===================
  def alwaysTrue_Base_TypesFloat_Payload(v: Base_Types.Float_Payload): B = {return T}

  var config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = Config_Base_TypesFloat_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_Payload _)

  def get_Config_Base_TypesFloat_Payload: Config_Base_TypesFloat_Payload = {return config_Base_TypesFloat_Payload}

  def set_Config_Base_TypesFloat_Payload(config: Config_Base_TypesFloat_Payload): RandomLib ={
    config_Base_TypesFloat_Payload = config
    return this
  }

  // ============= Base_Types.Float_32_Payload ===================
  def alwaysTrue_Base_TypesFloat_32_Payload(v: Base_Types.Float_32_Payload): B = {return T}

  var config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = Config_Base_TypesFloat_32_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_32_Payload _)

  def get_Config_Base_TypesFloat_32_Payload: Config_Base_TypesFloat_32_Payload = {return config_Base_TypesFloat_32_Payload}

  def set_Config_Base_TypesFloat_32_Payload(config: Config_Base_TypesFloat_32_Payload): RandomLib ={
    config_Base_TypesFloat_32_Payload = config
    return this
  }

  // ============= Base_Types.Float_64_Payload ===================
  def alwaysTrue_Base_TypesFloat_64_Payload(v: Base_Types.Float_64_Payload): B = {return T}

  var config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = Config_Base_TypesFloat_64_Payload(100, _verbose, alwaysTrue_Base_TypesFloat_64_Payload _)

  def get_Config_Base_TypesFloat_64_Payload: Config_Base_TypesFloat_64_Payload = {return config_Base_TypesFloat_64_Payload}

  def set_Config_Base_TypesFloat_64_Payload(config: Config_Base_TypesFloat_64_Payload): RandomLib ={
    config_Base_TypesFloat_64_Payload = config
    return this
  }

  // ============= Base_Types.Character_Payload ===================
  def alwaysTrue_Base_TypesCharacter_Payload(v: Base_Types.Character_Payload): B = {return T}

  var config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = Config_Base_TypesCharacter_Payload(100, _verbose, alwaysTrue_Base_TypesCharacter_Payload _)

  def get_Config_Base_TypesCharacter_Payload: Config_Base_TypesCharacter_Payload = {return config_Base_TypesCharacter_Payload}

  def set_Config_Base_TypesCharacter_Payload(config: Config_Base_TypesCharacter_Payload): RandomLib ={
    config_Base_TypesCharacter_Payload = config
    return this
  }

  // ============= Base_Types.String_Payload ===================
  def alwaysTrue_Base_TypesString_Payload(v: Base_Types.String_Payload): B = {return T}

  var config_Base_TypesString_Payload: Config_Base_TypesString_Payload = Config_Base_TypesString_Payload(100, _verbose, alwaysTrue_Base_TypesString_Payload _)

  def get_Config_Base_TypesString_Payload: Config_Base_TypesString_Payload = {return config_Base_TypesString_Payload}

  def set_Config_Base_TypesString_Payload(config: Config_Base_TypesString_Payload): RandomLib ={
    config_Base_TypesString_Payload = config
    return this
  }

  // ============= ISZ[B] ===================
  def alwaysTrue_ISZB(v: ISZ[B]): B = {return T}

  var config_ISZB: Config_ISZB = Config_ISZB(0, 20, 100, _verbose, alwaysTrue_ISZB _)
  def get_Config_ISZB: Config_ISZB = {return config_ISZB}

  def set_Config_ISZB(config: Config_ISZB): RandomLib ={
    config_ISZB = config
    return this
  }

  // ============= Base_Types.Bits_Payload ===================
  def alwaysTrue_Base_TypesBits_Payload(v: Base_Types.Bits_Payload): B = {return T}

  var config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = Config_Base_TypesBits_Payload(100, _verbose, alwaysTrue_Base_TypesBits_Payload _)

  def get_Config_Base_TypesBits_Payload: Config_Base_TypesBits_Payload = {return config_Base_TypesBits_Payload}

  def set_Config_Base_TypesBits_Payload(config: Config_Base_TypesBits_Payload): RandomLib ={
    config_Base_TypesBits_Payload = config
    return this
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PreState_Container ===================
  def alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PreState_Container(v: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container): B = {return T}

  var config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container = Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PreState_Container _)

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container = {return config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container}

  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container(config: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container): RandomLib ={
    config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container = config
    return this
  }

  // ============= Option[art.Empty] ===================
  def alwaysTrue_Option_artEmpty(v: Option[art.Empty]): B = {return T}

  var config_Option_artEmpty: Config_Option_artEmpty = Config_Option_artEmpty(0, 20, 100, _verbose, alwaysTrue_Option_artEmpty _)
  def get_Config_Option_artEmpty: Config_Option_artEmpty = {return config_Option_artEmpty}

  def set_Config_Option_artEmpty(config: Config_Option_artEmpty): RandomLib ={
    config_Option_artEmpty = config
    return this
  }

  // ============= Option[B] ===================
  def alwaysTrue_OptionB(v: Option[B]): B = {return T}

  var config_OptionB: Config_OptionB = Config_OptionB(0, 20, 100, _verbose, alwaysTrue_OptionB _)
  def get_Config_OptionB: Config_OptionB = {return config_OptionB}

  def set_Config_OptionB(config: Config_OptionB): RandomLib ={
    config_OptionB = config
    return this
  }

  // ============= Option[F32] ===================
  def alwaysTrue_OptionF32(v: Option[F32]): B = {return T}

  var config_OptionF32: Config_OptionF32 = Config_OptionF32(0, 20, 100, _verbose, alwaysTrue_OptionF32 _)
  def get_Config_OptionF32: Config_OptionF32 = {return config_OptionF32}

  def set_Config_OptionF32(config: Config_OptionF32): RandomLib ={
    config_OptionF32 = config
    return this
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P ===================
  def alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(v: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_P): B = {return T}

  var config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P = Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P _)

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P = {return config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P}

  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P(config: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P): RandomLib ={
    config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(v: BoilerControl.BoilerControl_i_bcproc_control_PreState_Container_PS): B = {return T}

  var config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS = Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS _)

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS = {return config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS}

  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS(config: Config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS): RandomLib ={
    config_BoilerControlBoilerControl_i_bcproc_control_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PostState_Container ===================
  def alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PostState_Container(v: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container): B = {return T}

  var config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container = Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PostState_Container _)

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container = {return config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container}

  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container(config: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container): RandomLib ={
    config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container = config
    return this
  }

  // ============= Option[BoilerControl.OpMode.Type] ===================
  def alwaysTrue_OptionBoilerControlOpModeType(v: Option[BoilerControl.OpMode.Type]): B = {return T}

  var config_OptionBoilerControlOpModeType: Config_OptionBoilerControlOpModeType = Config_OptionBoilerControlOpModeType(0, 20, 100, _verbose, alwaysTrue_OptionBoilerControlOpModeType _)
  def get_Config_OptionBoilerControlOpModeType: Config_OptionBoilerControlOpModeType = {return config_OptionBoilerControlOpModeType}

  def set_Config_OptionBoilerControlOpModeType(config: Config_OptionBoilerControlOpModeType): RandomLib ={
    config_OptionBoilerControlOpModeType = config
    return this
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P ===================
  def alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(v: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_P): B = {return T}

  var config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P = Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P _)

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P = {return config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P}

  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P(config: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P): RandomLib ={
    config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(v: BoilerControl.BoilerControl_i_bcproc_control_PostState_Container_PS): B = {return T}

  var config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS = Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS _)

  def get_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS = {return config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS}

  def set_Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS(config: Config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS): RandomLib ={
    config_BoilerControlBoilerControl_i_bcproc_control_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PreState_Container ===================
  def alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PreState_Container(v: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container): B = {return T}

  var config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container = Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PreState_Container _)

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container = {return config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container}

  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container(config: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container): RandomLib ={
    config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container = config
    return this
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P ===================
  def alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(v: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P): B = {return T}

  var config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P = Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P _)

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P = {return config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P}

  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(config: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P): RandomLib ={
    config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(v: BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_PS): B = {return T}

  var config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS = Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS _)

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS = {return config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS}

  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(config: Config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS): RandomLib ={
    config_BoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PostState_Container ===================
  def alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PostState_Container(v: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container): B = {return T}

  var config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container = Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PostState_Container _)

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container = {return config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container}

  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container(config: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container): RandomLib ={
    config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container = config
    return this
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P ===================
  def alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(v: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_P): B = {return T}

  var config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P = Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P _)

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P = {return config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P}

  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P(config: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P): RandomLib ={
    config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(v: BoilerControl.Boiler_i_bcproc_boiler_PostState_Container_PS): B = {return T}

  var config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS = Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS _)

  def get_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS = {return config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS}

  def set_Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS(config: Config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS): RandomLib ={
    config_BoilerControlBoiler_i_bcproc_boiler_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.OpMode.Type ===================
  def alwaysTrue_BoilerControlOpModeType(v: BoilerControl.OpMode.Type): B = {return T}

  var config_BoilerControlOpModeType: Config_BoilerControlOpModeType = Config_BoilerControlOpModeType(100, _verbose, alwaysTrue_BoilerControlOpModeType _)

  def get_Config_BoilerControlOpModeType: Config_BoilerControlOpModeType = {return config_BoilerControlOpModeType}

  def set_Config_BoilerControlOpModeType(config: Config_BoilerControlOpModeType): RandomLib ={
    config_BoilerControlOpModeType = config
    return this
  }

  // ============= BoilerControl.OpMode_Payload ===================
  def alwaysTrue_BoilerControlOpMode_Payload(v: BoilerControl.OpMode_Payload): B = {return T}

  var config_BoilerControlOpMode_Payload: Config_BoilerControlOpMode_Payload = Config_BoilerControlOpMode_Payload(100, _verbose, alwaysTrue_BoilerControlOpMode_Payload _)

  def get_Config_BoilerControlOpMode_Payload: Config_BoilerControlOpMode_Payload = {return config_BoilerControlOpMode_Payload}

  def set_Config_BoilerControlOpMode_Payload(config: Config_BoilerControlOpMode_Payload): RandomLib ={
    config_BoilerControlOpMode_Payload = config
    return this
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container ===================
  def alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(v: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container): B = {return T}

  var config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container = Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container _)

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container = {return config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container}

  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container): RandomLib ={
    config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container = config
    return this
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P ===================
  def alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(v: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_P): B = {return T}

  var config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P = Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P _)

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P = {return config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P}

  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P): RandomLib ={
    config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(v: BoilerControl.OperatorDesk_i_bcproc_desk_PreState_Container_PS): B = {return T}

  var config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS = Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS _)

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS = {return config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS}

  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS): RandomLib ={
    config_BoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container ===================
  def alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(v: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container): B = {return T}

  var config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container = Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container _)

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container = {return config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container}

  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container): RandomLib ={
    config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container = config
    return this
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P ===================
  def alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(v: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_P): B = {return T}

  var config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P = Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P _)

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P = {return config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P}

  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P): RandomLib ={
    config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(v: BoilerControl.OperatorDesk_i_bcproc_desk_PostState_Container_PS): B = {return T}

  var config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS = Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS _)

  def get_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS = {return config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS}

  def set_Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS(config: Config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS): RandomLib ={
    config_BoilerControlOperatorDesk_i_bcproc_desk_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PreState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl0_PostState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl0_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PreState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl1_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl1_PostState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl1_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PreState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl2_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl2_PostState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl2_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PreState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl3_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container = Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container = {return config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_P): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P = Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P = {return config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(v: BoilerControl.PumpControl_i_bcproc_pumpControl3_PostState_Container_PS): B = {return T}

  var config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS = Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS _)

  def get_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS = {return config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS}

  def set_Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS(config: Config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS): RandomLib ={
    config_BoilerControlPumpControl_i_bcproc_pumpControl3_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container ===================
  def alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container): B = {return T}

  var config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container = Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container _)

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container = {return config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container}

  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container): RandomLib ={
    config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container = config
    return this
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P ===================
  def alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_P): B = {return T}

  var config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P = Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P _)

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P = {return config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P}

  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P): RandomLib ={
    config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PreState_Container_PS): B = {return T}

  var config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS = Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS _)

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS = {return config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS}

  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS): RandomLib ={
    config_BoilerControlSteamMeter_i_bcproc_steamMeter_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container ===================
  def alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container): B = {return T}

  var config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container = Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container _)

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container = {return config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container}

  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container): RandomLib ={
    config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container = config
    return this
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P ===================
  def alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_P): B = {return T}

  var config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P = Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P _)

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P = {return config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P}

  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P): RandomLib ={
    config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(v: BoilerControl.SteamMeter_i_bcproc_steamMeter_PostState_Container_PS): B = {return T}

  var config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS = Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS _)

  def get_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS = {return config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS}

  def set_Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS(config: Config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS): RandomLib ={
    config_BoilerControlSteamMeter_i_bcproc_steamMeter_PostState_Container_PS = config
    return this
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container ===================
  def alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container): B = {return T}

  var config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container = Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container _)

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container = {return config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container}

  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container): RandomLib ={
    config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container = config
    return this
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P ===================
  def alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_P): B = {return T}

  var config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P = Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(100, _verbose, alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P _)

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P = {return config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P}

  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P): RandomLib ={
    config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_P = config
    return this
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS ===================
  def alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PreState_Container_PS): B = {return T}

  var config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS = Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(100, _verbose, alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS _)

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS = {return config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS}

  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS): RandomLib ={
    config_BoilerControlWaterMeter_i_bcproc_waterMeter_PreState_Container_PS = config
    return this
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container ===================
  def alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container): B = {return T}

  var config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container = Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(100, _verbose, F, ISZ(), alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container _)

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container = {return config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container}

  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container): RandomLib ={
    config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container = config
    return this
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P ===================
  def alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_P): B = {return T}

  var config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P = Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(100, _verbose, alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P _)

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P = {return config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P}

  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P): RandomLib ={
    config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_P = config
    return this
  }

  // ============= BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS ===================
  def alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(v: BoilerControl.WaterMeter_i_bcproc_waterMeter_PostState_Container_PS): B = {return T}

  var config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS = Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(100, _verbose, alwaysTrue_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS _)

  def get_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS = {return config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS}

  def set_Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS(config: Config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS): RandomLib ={
    config_BoilerControlWaterMeter_i_bcproc_waterMeter_PostState_Container_PS = config
    return this
  }

  // ============= runtimemonitor.ObservationKind.Type ===================
  def alwaysTrue_runtimemonitorObservationKindType(v: runtimemonitor.ObservationKind.Type): B = {return T}

  var config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType = Config_runtimemonitorObservationKindType(100, _verbose, alwaysTrue_runtimemonitorObservationKindType _)

  def get_Config_runtimemonitorObservationKindType: Config_runtimemonitorObservationKindType = {return config_runtimemonitorObservationKindType}

  def set_Config_runtimemonitorObservationKindType(config: Config_runtimemonitorObservationKindType): RandomLib ={
    config_runtimemonitorObservationKindType = config
    return this
  }
}

