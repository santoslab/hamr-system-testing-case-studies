package bc

import org.sireum._
import art.Art
import art.scheduling.static._

// This file will not be overwritten so is safe to edit

class SystemTests extends SystemTestSuite {

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
  var scheduler: StaticScheduler = Schedulers.getStaticSchedulerH(MNone())

  def compute(isz: ISZ[Command]): Unit = {
    scheduler = scheduler(commandProvider = ISZCommandProvider(isz :+ Stop()))

    Art.computePhase(scheduler)
  }

  // Suggestion: add the following import renamings of the components' SystemTestAPIs,
  //             replacing nickname with shortened versions that are easier to reference
  // import slang.BoilerControl.{Boiler_i_bcproc_boiler_SystemTestAPI => nickname}
  // import slang.BoilerControl.{PumpControl_i_bcproc_pumpControl0_SystemTestAPI => nickname}
  // import slang.BoilerControl.{PumpControl_i_bcproc_pumpControl1_SystemTestAPI => nickname}
  // import slang.BoilerControl.{PumpControl_i_bcproc_pumpControl2_SystemTestAPI => nickname}
  // import slang.BoilerControl.{PumpControl_i_bcproc_pumpControl3_SystemTestAPI => nickname}
  // import slang.BoilerControl.{WaterMeter_i_bcproc_waterMeter_SystemTestAPI => nickname}
  // import slang.BoilerControl.{SteamMeter_i_bcproc_steamMeter_SystemTestAPI => nickname}
  // import slang.BoilerControl.{OperatorDesk_i_bcproc_desk_SystemTestAPI => nickname}
  // import slang.BoilerControl.{BoilerControl_i_bcproc_control_SystemTestAPI => nickname}

  test("Example system test") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run components' compute entrypoints through one hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' put methods to change the prestate values for components
    // TODO

    // run another hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' check or get methods to check the poststate values for components
    // TODO
  }
}
