# Maven output demo
- [maven test](#maven-test)
- [maven verify](#maven-verify)
### maven test
```log
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< org.example:spock >--------------------------
[INFO] Building spock 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ spock ---
[INFO] Deleting C:\Users\NetBurst\IdeaProjects\spock\target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ spock ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\NetBurst\IdeaProjects\spock\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ spock ---
[INFO] No sources to compile
[INFO] 
[INFO] --- gmavenplus-plugin:1.11.0:compile (default) @ spock ---
[INFO] No sources specified for compilation. Skipping.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ spock ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ spock ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Users\NetBurst\IdeaProjects\spock\target\test-classes
[INFO] 
[INFO] --- gmavenplus-plugin:1.11.0:compileTests (default) @ spock ---
[INFO] Using isolated classloader, without GMavenPlus classpath.
[INFO] Using Groovy 3.0.6 to perform compileTests.
[INFO] Parallel parsing enabled.
[INFO] Compiled 3 files.
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spock ---
[INFO] Surefire report directory: C:\Users\NetBurst\IdeaProjects\spock\target\surefire-reports
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
Spock extension start
Spock extension stop
[INFO] Running FirstTest
JUnit first test
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.03 s - in FirstTest
[INFO] Running SecondTest
JUnit second test
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in SecondTest
Spock extension stop
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.941 s
[INFO] Finished at: 2020-11-26T20:58:30+02:00
[INFO] ------------------------------------------------------------------------
```
### maven verify
```log
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< org.example:spock >--------------------------
[INFO] Building spock 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ spock ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\NetBurst\IdeaProjects\spock\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ spock ---
[INFO] No sources to compile
[INFO] 
[INFO] --- gmavenplus-plugin:1.11.0:compile (default) @ spock ---
[INFO] No sources specified for compilation. Skipping.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ spock ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ spock ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- gmavenplus-plugin:1.11.0:compileTests (default) @ spock ---
[INFO] Using isolated classloader, without GMavenPlus classpath.
[INFO] Using Groovy 3.0.6 to perform compileTests.
[INFO] Parallel parsing enabled.
[INFO] Compiled 3 files.
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spock ---
[INFO] Surefire report directory: C:\Users\NetBurst\IdeaProjects\spock\target\surefire-reports
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
Spock extension start
Spock extension stop
[INFO] Running FirstTest
JUnit first test
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.029 s - in FirstTest
[INFO] Running SecondTest
JUnit second test
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in SecondTest
Spock extension stop
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ spock ---
[INFO] 
[INFO] --- maven-failsafe-plugin:2.22.2:integration-test (default) @ spock ---
[INFO] Failsafe report directory: C:\Users\NetBurst\IdeaProjects\spock\target\failsafe-reports
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
Spock extension start
Spock extension start visitSpec FirstSpec
Spock extension start visitSpec SecondSpec
Spock extension start visitSpec FirstSpec
Spock extension start visitSpec SecondSpec
[INFO] Running FirstSpec
Spock first test
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 s - in FirstSpec
[INFO] Running SecondSpec
Spock second test
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in SecondSpec
Spock extension stop
Spock extension stop
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-failsafe-plugin:2.22.2:verify (default) @ spock ---
[INFO] Failsafe report directory: C:\Users\NetBurst\IdeaProjects\spock\target\failsafe-reports
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.765 s
[INFO] Finished at: 2020-11-26T20:52:12+02:00
[INFO] ------------------------------------------------------------------------
```
