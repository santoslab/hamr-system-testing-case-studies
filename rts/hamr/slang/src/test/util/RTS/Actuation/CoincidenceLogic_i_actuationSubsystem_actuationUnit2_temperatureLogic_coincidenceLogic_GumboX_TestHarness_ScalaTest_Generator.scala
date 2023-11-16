package RTS.Actuation

import org.sireum._
import RTS.Actuation._
import RTS.GumboXUtil
import RTS.GumboXUtil.GumboXResult
import RTS.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256
import org.scalatest.BeforeAndAfterAll

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_GumboX_TestHarness_ScalaTest_Generator {

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
    val filename = dir / s"CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_GumboX_TestHarness_ScalaTest_Generator_${System.currentTimeMillis()}.json"
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

import CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_GumboX_TestHarness_ScalaTest_Generator._

trait CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_GumboX_TestHarness_ScalaTest_Generator extends CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_GumboX_TestHarness_ScalaTest
  with BeforeAndAfterAll {

  // return a directory path if you want to serialize the report
  def serializeReportPath: Option[Os.Path] = None()

  def failOnUnsatPreconditions: B = F

  def seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)

  def freshRandomLib: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  def getProfiles_P: MSZ[CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_Profile_P]

  def getDefaultProfile_P: CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_Profile_P = {
    return CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_Profile_P (
      name = "Default Port Profile", 
      numTests = 100, 
      numTestVectorGenRetries = 100, 
      api_channel1 = freshRandomLib, 
      api_channel2 = freshRandomLib, 
      api_channel3 = freshRandomLib, 
      api_channel4 = freshRandomLib)
  }

  def next(profile: CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_Profile_P): Option[CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P] = {
    try {
      val api_channel1 = profile.api_channel1.nextB()
      val api_channel2 = profile.api_channel2.nextB()
      val api_channel3 = profile.api_channel3.nextB()
      val api_channel4 = profile.api_channel4.nextB()

      return Some(CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(api_channel1,api_channel2,api_channel3,api_channel4))
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

  for (profile <- getProfiles_P) {
    testComputeCB_Profile_P(profile)
  }

  def testComputeCB_Profile_P(profile: CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_Profile_P): Unit = {
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

              val json = RTS.JSON.fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(o, T)
              updateReport("testComputeCB_Profile_P", results.name, testName, j, Some(json))

              if (verbose) {
                val tq = "\"\"\""
                println(st"""Replay Unit Test:
                            |  test("Replay: $escapedTestName") {
                            |    val json = st${tq}${json}${tq}.render
                            |    val testVector = RTS.JSON.toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(json).left
                            |    assert (testComputeCBV(testVector) == RTS.GumboXUtil.GumboXResult.$results)
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
}