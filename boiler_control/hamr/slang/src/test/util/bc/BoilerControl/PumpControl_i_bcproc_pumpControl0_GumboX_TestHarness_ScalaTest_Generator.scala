package bc.BoilerControl

import org.sireum._
import bc.BoilerControl._
import bc.GumboXUtil
import bc.GumboXUtil.GumboXResult
import bc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256
import org.scalatest.BeforeAndAfterAll

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object PumpControl_i_bcproc_pumpControl0_GumboX_TestHarness_ScalaTest_Generator {

  // CB entrypoint id ~> (testName ~> (retry num ~> preStateContainer)))
  var report: HashSMap[String, HashSMap[String, Map[Z, Option[String]]]] = _

  def resetReport(): Unit = report = HashSMap.empty

  def updateReport(entryPoint: String, result: String, testName: String, retry: Z, jsonContainer: Option[String]): Unit = {
    val key = s"$entryPoint : $result"
    val cbEntries: HashSMap[String, Map[Z, Option[String]]] =
      if (report.contains(key)) report.get(key).get
      else HashSMap.empty
    val testNameEntries: Map[Z, Option[String]] =
      if (cbEntries.contains(testName)) cbEntries.get(testName).get
      else Map.empty
    assert (!testNameEntries.contains(retry))

    report = report + key ~> (cbEntries + (testName ~> (testNameEntries + (retry ~> jsonContainer))))
  }

  def emitReport(): Unit = {
    println("Test Results")
    for(e <- report.entries) {
      println(s"  ${e._1} = ${e._2.size}")
      val attempts = e._2.values.elements.foldLeft(z"0")((o, m) => o + m.size)
      println(s"    Total Attempts = $attempts")
    }
  }

  def deserializeReport(p: Os.Path): HashSMap[String, HashSMap[String, Map[Z, Option[String]]]] = {
    halt("Not yet")
  }

  def serializeReport(dir: Os.Path): Unit = {
    val filename = dir / s"PumpControl_i_bcproc_pumpControl0_GumboX_TestHarness_ScalaTest_Generator_${System.currentTimeMillis()}.json"
    //filename.write(JSON.from_artDataContent(GumboXUtil.Report(report), T))
    var map1: HashSMap[String, String] = HashSMap.empty
    for(e <- report.entries) {
      var map2: HashSMap[String, String] = HashSMap.empty
      for (t <- e._2.entries) {
        var map3: Map[Z, String] = Map.empty
        for (r <- t._2.entries) {
          val s: String =
            if (r._2.isEmpty) ""
            else r._2.get
          map3 = map3 + (r._1 ~> s)
        }
        map2 = map2 + (t._1 ~>
          org.sireum.Json.Printer.printMap(T, map3, org.sireum.Json.Printer.printZ _, org.sireum.Json.Printer.printString _).render)
      }
      map1 = map1 + (e._1 ~>
        org.sireum.Json.Printer.printHashSMap(T, map2, org.sireum.Json.Printer.printString _, org.sireum.Json.Printer.printString _).render)
    }
    val sreport = org.sireum.Json.Printer.printHashSMap(T, map1, org.sireum.Json.Printer.printString _, org.sireum.Json.Printer.printString _).render
    filename.write(sreport)
    println(s"Wrote: ${filename.toUri}")
  }
}

import PumpControl_i_bcproc_pumpControl0_GumboX_TestHarness_ScalaTest_Generator._

trait PumpControl_i_bcproc_pumpControl0_GumboX_TestHarness_ScalaTest_Generator extends PumpControl_i_bcproc_pumpControl0_GumboX_TestHarness_ScalaTest
  with BeforeAndAfterAll {

  // return a directory path if you want to serialize the report
  def serializeReportPath: Option[Os.Path] = None()

  def failOnUnsatPreconditions: B = F

  def seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

  def freshRandomLib: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  def getInitialiseProfiles: MSZ[PumpControl_i_bcproc_pumpControl0_Profile]

  def getDefaultInitialiseProfile: PumpControl_i_bcproc_pumpControl0_Profile = {
    return PumpControl_i_bcproc_pumpControl0_Profile (
      name = "Default Initialise Profile",
      numTests = 100)
  }

  def getProfiles_P: MSZ[PumpControl_i_bcproc_pumpControl0_Profile_P]

  def getDefaultProfile_P: PumpControl_i_bcproc_pumpControl0_Profile_P = {
    return PumpControl_i_bcproc_pumpControl0_Profile_P (
      name = "Default Port Profile", 
      numTests = 100, 
      numTestVectorGenRetries = 100, 
      api_programReady = freshRandomLib, 
      api_opMode = freshRandomLib, 
      api_openPump = freshRandomLib)
  }

  def getProfiles_PS: MSZ[PumpControl_i_bcproc_pumpControl0_Profile_PS]

  def getDefaultProfile_PS: PumpControl_i_bcproc_pumpControl0_Profile_PS = {
    return PumpControl_i_bcproc_pumpControl0_Profile_PS (
      name = "Default Port and State Variable Profile", 
      numTests = 100, 
      numTestVectorGenRetries = 100, 
      In_isPumpFlow = freshRandomLib, 
      In_isPumpOpen = freshRandomLib, 
      In_pumpNumber = freshRandomLib, 
      api_programReady = freshRandomLib, 
      api_opMode = freshRandomLib, 
      api_openPump = freshRandomLib)
  }

  def next(profile: PumpControl_i_bcproc_pumpControl0_Profile_P): Option[PumpControl_i_bcproc_pumpControl0_PreState_Container_P] = {
    try {
      val api_programReady = profile.api_programReady.nextOption_artEmpty()
      val api_opMode = profile.api_opMode.nextOptionBoilerControlOpModeType()
      val api_openPump = profile.api_openPump.nextOptionB()

      return Some(PumpControl_i_bcproc_pumpControl0_PreState_Container_P(api_programReady,api_opMode,api_openPump))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  def nextwL(profile: PumpControl_i_bcproc_pumpControl0_Profile_PS): Option[PumpControl_i_bcproc_pumpControl0_PreState_Container_PS] = {
    try {
      val In_isPumpFlow = profile.In_isPumpFlow.nextB()
      val In_isPumpOpen = profile.In_isPumpOpen.nextB()
      val In_pumpNumber = profile.In_pumpNumber.nextZ()
      val api_programReady = profile.api_programReady.nextOption_artEmpty()
      val api_opMode = profile.api_opMode.nextOptionBoilerControlOpModeType()
      val api_openPump = profile.api_openPump.nextOptionB()

      return Some(PumpControl_i_bcproc_pumpControl0_PreState_Container_PS(In_isPumpFlow,In_isPumpOpen,In_pumpNumber,api_programReady,api_opMode,api_openPump))
    } catch {
      case e: AssertionError =>
       // SlangCheck was unable to satisfy a datatype's filter
       return None()
    }
  }

  override def beforeAll(): Unit = resetReport()

  override def afterAll(): Unit = {
    emitReport()
    serializeReportPath match {
      case Some (p) => serializeReport(p)
      case _ =>
    }
  }

  for (profile <- getInitialiseProfiles) {
    testInitialiseCB_Profile(profile)
  }

  def testInitialiseCB_Profile(profile: PumpControl_i_bcproc_pumpControl0_Profile): Unit = {
    for (i <- 0 until profile.numTests) {
      val testName = s"Profile \"${profile.name}\": testInitialiseCB_$i"
      this.registerTest(testName) {
        val results = testInitialiseCB()
        updateReport("testInitialiseCB", results.name, testName, 0, None())

        results match {
          case GumboXResult.Pre_Condition_Unsat =>
            halt("Infeasible as initialize entry points cannot contain assume clauses and cannot access incoming ports or state variables")
          case GumboXResult.Post_Condition_Fail =>
            fail ("Post condition did not hold")
          case GumboXResult.Post_Condition_Pass =>
            if (verbose) {
              println ("Success!")
            }
        }
      }
    }
  }

  for (profile <- getProfiles_P) {
    testComputeCB_Profile_P(profile)
  }

  def testComputeCB_Profile_P(profile: PumpControl_i_bcproc_pumpControl0_Profile_P): Unit = {
    for (i <- 0 until profile.numTests) {
      val testName = s"Profile \"${profile.name}\": testComputeCB_$i"
      val escapedTestName = s"Profile \\\"${profile.name}\\\": testComputeCB_$i"

      this.registerTest(testName) {
        var retry: B = T

        var j: Z = 0
        while (j < profile.numTestVectorGenRetries && retry) {
          next(profile) match {
            case Some(o) =>

              if (verbose && j > 0) {
                println(s"Retry $j:")
              }

              val results = testComputeCBV(o)

              val json = bc.JSON.fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o, T)
              updateReport("testComputeCB_Profile_P", results.name, testName, j, Some(json))

              if (verbose) {
                val tq = "\"\"\""
                println(st"""Replay Unit Test:
                            |  test("Replay: $escapedTestName") {
                            |    val json = st${tq}${json}${tq}.render
                            |    val testVector = bc.JSON.toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(json).left
                            |    assert (testComputeCBV(testVector) == bc.GumboXUtil.GumboXResult.$results)
                            |  }""".render)
              }

              results match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
              updateReport("testComputeCB_Profile_P", "SlangCheck RTS", testName, j, None())
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }

  for (profile <- getProfiles_PS) {
    testComputeCBwL_Profile_PS(profile)
  }

  def testComputeCBwL_Profile_PS(profile: PumpControl_i_bcproc_pumpControl0_Profile_PS): Unit = {
    for (i <- 0 until profile.numTests) {
      val testName = s"Profile \"${profile.name}\": testComputeCBwL_$i"
      val escapedTestName = s"Profile \\\"${profile.name}\\\": testComputeCBwL_$i"

      this.registerTest(testName) {
        var retry: B = T

        var j: Z = 0
        while (j < profile.numTestVectorGenRetries && retry) {
          nextwL(profile) match {
            case Some(o) =>

              if (verbose && j > 0) {
                println(s"Retry $j:")
              }

              val results = testComputeCBwLV(o)

              val json = bc.JSON.fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o, T)
              updateReport("testComputeCBwL_Profile_PS", results.name, testName, j, Some(json))

              if (verbose) {
                val tq = "\"\"\""
                println(st"""Replay Unit Test:
                            |  test("Replay: $escapedTestName") {
                            |    val json = st${tq}${json}${tq}.render
                            |    val testVector = bc.JSON.toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(json).left
                            |    assert (testComputeCBwLV(testVector) == bc.GumboXUtil.GumboXResult.$results)
                            |  }""".render)
              }

              results match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail ("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println ("Success!")
                  }
                  retry = F
              }
            case _ =>
              updateReport("testComputeCBwL_Profile_PS", "SlangCheck RTS", testName, j, None())
          }
          j = j + 1
        }

        if (retry) {
          if (failOnUnsatPreconditions) {
            fail ("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }
}