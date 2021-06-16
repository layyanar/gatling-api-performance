package utils.environment

object Environment {

  val baseUrl = scala.util.Properties.envOrElse("bseUrl", "http://localhost:8080")
  val users = scala.util.Properties.envOrElse("numberOfUsers", "10").toInt
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "5000")
  val duration = scala.util.Properties.envOrElse("duration", "60").toInt
  // mvn clean test-compile gatling:test -Dgatling.simulationClass=performance.UserSimulation


}
