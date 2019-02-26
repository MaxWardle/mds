package spec.publicFrontend

import geb.spock.GebReportingSpec
import pages.Dashboard
import pages.LoginPage
import spock.lang.Narrative
import spock.lang.Stepwise
import spock.lang.Title
import utils.Const

@Title("MineSpace-LoginPage")
@Narrative("I can log into MineSpace using my BCEID")
@Stepwise
class LoginPageSpec extends GebReportingSpec {
    def "I can log into the app given valid credentials"(){
        given:"I go to the homepage"
        to LoginPage

        when: "Page loaded"
        at LoginPage

        and: "I input username and password"
        BCEIDusername = Const.BCEID_USERNAME
        BCEIDpassword = Const.BCEID_PASSWORD
        BCEIDloginButton.click()

        then: "I am on the homepage page"
        at Dashboard
    }
}