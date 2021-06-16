package performance

import com.intuit.karate.gatling.PreDef._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import utils.environment.Environment

/**
 *
 * @author Lingaraja Ayyanar
 */

class UserInfoSimulation extends Simulation{
  //val httpProtocol = http.baseUrl(Environment.baseUrl)

  val getWordCount = scenario("Get word count")
                               .exec(karateFeature("classpath:performance/getWordCount.feature"))

  setUp(
    getWordCount.inject(rampUsers(Environment.users).during(Environment.duration seconds) )
  )
}
