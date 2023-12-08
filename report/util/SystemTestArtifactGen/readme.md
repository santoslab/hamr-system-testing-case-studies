# System Test Artifact Generator

## How to Use

```
git clone https://github.com/santoslab/hamr-system-testing-case-studies.git

cd hamr-system-testing-case-studies

 sireum proyek assemble --uber -m s.SystemTestArtifactGen report/util/SystemTestArtifactGen

alias genny=$(pwd)/report/util/SystemTestArtifactGen/out/SystemTestArtifactGen/assemble/SystemTestArtifactGen.jar.bat

genny isolette/hamr/slang src/main/util/isolette/system_tests/rst/Regulate_Subsystem_Containers.scala
```