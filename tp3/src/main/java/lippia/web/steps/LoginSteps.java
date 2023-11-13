package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {
    @Given("the client is in the homepage for login feature")
    public void homePage() {
        LoginService.navigateHome();
    }

    @And("the client clicks on My Account Menu")
    public void myAccountPage() {
        LoginService.navigateMyAccount();
    }

    @When("Enter username (.*) in username textbox")
    public void enterUsername(String username) {
        LoginService.enterUserName(username);
    }

    @And("Enter password (.*) in password textbox")
    public void enterPassword(String password) {
        LoginService.enterPassword(password);
    }

    @And("The client clicks on login button")
    public void doLogin() {
        LoginService.login();
    }

    @Then("The client successfully login to the web page with (.*)")
    public void verifyLoginSuccess(String message) {
        LoginService.successLoginMessageIsDisplayed(message);
    }

    @Then("Proper error must be displayed invalid (.*) and prompt to enter login again")
    public void verifyErrorDisplayed(String message) {
        LoginService.errorLoginMessageIsDisplayed(message);
    }

}
