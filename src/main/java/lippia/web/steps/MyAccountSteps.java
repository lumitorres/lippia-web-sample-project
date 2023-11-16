package lippia.web.steps;


import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.MyAccountService;

public class MyAccountSteps extends PageSteps {

    @And("The user must successfully login to the web page")
    public void verifyUserIsLoggedIn() {
        MyAccountService.validateLoginStatus(true);
    }

    @And("The user clicks on Account details")
    public void theUserClicksOnAccountDetails() {
        MyAccountService.clicksOnAccountDetails( );
    }

    @Then("The user ser view account details where he can change his password also {string}")
    public void verifyUserSeeAccountDetails(String email) {
        MyAccountService.verifyAccountDetails(email);
    }

    @Then("The user user successfully comes out from the site")
    public void verifyUserIsNotLoggedIn() {
        MyAccountService.validateLoginStatus(false);
    }

}
