
##### Karate Run test suite
````
mvn clean test
mvn clean test -Dtest=AutomationSuiteTest
````
# Karate Gatling Performance Testing
````
mvn clean test-compile gatling:test
mvn clean test-compile gatling:test -Dgatling.simulationClass=performance.UserInfoSimulation
````