package bc.BoilerControl

import org.sireum._
import bc.BoilerControl._
import bc._
import org.sireum.Random.Impl.Xoshiro256

// This file will not be overwritten so is safe to edit

class Boiler_i_bcproc_boiler_GumboX_Tests extends Boiler_i_bcproc_boiler_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override val verbose: B = T

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F

  // profiles that will be used for the initialise tests
  override def getInitialiseProfiles: MSZ[Boiler_i_bcproc_boiler_Profile] = {
    return MSZ(getDefaultInitialiseProfile)
  }

  // profiles that will be used to generate the incoming port values
  override def getProfiles_P: MSZ[Boiler_i_bcproc_boiler_Profile_P] = {
    return MSZ(getDefaultProfile_P)
  }

  // profiles that will be used to generate the incoming port values
  // and the pre-state values of the state variables
  override def getProfiles_PS: MSZ[Boiler_i_bcproc_boiler_Profile_PS] = {
    return MSZ(getDefaultProfile_PS)
  }


  //REPLAY TESTS
  test("Replay: Profile \"Default Port Profile\": testComputeCB_0") {
    val json = st"""{  "type" : "BoilerControl.Boiler_i_bcproc_boiler_PreState_Container_P","api_programReady" : { "type" : "None"},"api_valve" : { "type" : "None"},"api_opMode" : { "type" : "None"}}""".render
    val testVector = bc.JSON.toBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(json).left
    assert(testComputeCBV(testVector) == bc.GumboXUtil.GumboXResult.Post_Condition_Pass)
  }
}