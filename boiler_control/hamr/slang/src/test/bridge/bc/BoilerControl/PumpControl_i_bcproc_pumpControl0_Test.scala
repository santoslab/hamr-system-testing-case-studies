package bc.BoilerControl

import org.sireum._
import bc.BoilerControl._

// This file will not be overwritten so is safe to edit
class PumpControl_i_bcproc_pumpControl0_Test extends PumpControl_i_bcproc_pumpControl0_ScalaTest {

  test("Example Unit Test for Initialise Entry Point"){
    // Initialise Entry Point doesn't read input port values, so just proceed with
    // launching the entry point code
    testInitialise()
    // use get_XXX methods and check_concrete_output() from test/util/../YYY_TestApi
    // retrieve values from output ports and check against expected results
  }

  test("Example Unit Test for Compute Entry Point"){
    // use put_XXX methods from test/util/../YYY_TestApi to seed input ports with values
    /*
    put_concrete_inputs(ISZ(OpMode.Init),ISZ(true),1)
    val api_openPump: B = T
    val api_programReady: Option[art.Empty] = Option.some()
    testCompute()
    get_pumpFlow()
    PumpControl_i_bcproc_pumpControl0_GumboX.compute_CEP_Post(
      api_openPump =
    )
    */

    // use get_XXX methods and check_concrete_output() from test/util/../YYY_TestApi
    // retrieve values from output ports and check against expected results
  }
}
