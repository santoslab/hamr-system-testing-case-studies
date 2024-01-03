# HAMR System Testing 2023 Case Studies

This repository presents artifacts supporting the paper "Integrated Contract-based Unit and System Testing for Component-based Systems" (submitted for publication).   The paper presents a property-based, randomizing, system testing framework for the [HAMR](https://hamr.sireum.org) model-driven development framework.   HAMR provides code generation from AADL models to multiple target platforms including the JVM, Linux, and seL4 verified micro-kernel.

The two folders linked below provide all development artifacts including AADL models with GUMBO behavioral contracts, generated Slang AADL-compliant runtime (Slang is a safety-critical subset of Scala), thread application code with HAMR-generated logic-based contracts (the [Logika](https://logika.sireum.org) SMT-based symbolic execution tool verifies that application code conforms to contracts) and HAMR-generated executable contracts to support both component and system testing, and JVM-based system deployments.

The contributions of the paper above focus on system testing, and for this, the following artifacts are provided:
 * developer-written specifications of state observer and injectors for system properties (with associated auto-generated infrastructure code for observations and injections),
 * developer-written properties and test execution schemas,
 * developer-written configurations for auto-generation of randomized state vectors to support system testing, in both IDE and distributed continuous integration test runners, and
 * HAMR-generated test coverage reports.

 The system testing framework generates system traces based on randomized injection of slices of the system state, check conformance to property-parameterized trace monitors that inject and observe portions of the system state relevant to the property being considered.  Executable versions of component (unit) contracts (checking pre/post-state properties of thread component dispatches) are also checked automatically during testing. 

## [Isolette](isolette/readme.md)

This system is based on an infant incubator example (called the "Isolette") presented in the FAA Requirements Engineering Management Handbook (written by Rockwell Collins engineers David Lempia and Steve Miller).

## [RTS](rts/readme.md)

This system is based on an open source specification of a nuclear reactor trip system (RTS) developed by Galois, Inc. as part of an NRC-funded SBIR project called [HARDENS](https://github.com/GaloisInc/HARDENS).

