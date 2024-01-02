# System Testing Artifact Generator

## How to Use

```
git clone https://github.com/santoslab/hamr-system-testing-case-studies.git

cd hamr-system-testing-case-studies

# build a runnable jar
sireum proyek assemble --uber -m s.SystemTestArtifactGen report/util/SystemTestArtifactGen

# optionally create an alias to the runnable jar
alias sysgen=$(pwd)/report/util/SystemTestArtifactGen/out/SystemTestArtifactGen/assemble/SystemTestArtifactGen.jar.bat

# run the generator by passing it the paths to one or more files that contain
# input/output container definitions
sysgen isolette/hamr/slang src/main/util/isolette/system_tests/rst/Regulate_Subsystem_Containers.scala
```