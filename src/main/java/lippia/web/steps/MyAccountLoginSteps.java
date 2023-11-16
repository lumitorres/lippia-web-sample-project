package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MyAccountLoginService;
import org.testng.Assert;


public class MyAccountLoginSteps extends PageSteps {
    @And("The user clicks on My Account Menu")
    public void theUserClicksOnMyAccountMenu() {
        MyAccountLoginService.navigateMyAccount( );
    }

    @When("The user enter case changed username {string}")
    public void theUserEnterCaseChangedUsernameUsername(String username) {
        MyAccountLoginService.clickUserName(username);
    }

    @And("The user enter case changed password {string}")
    public void theUserEnterCaseChangedPassword(String password) {
        MyAccountLoginService.clickPassword(password);
    }

    @And("The user clicks on login button")
    public void theUserClicksOnLoginButton() {
        MyAccountLoginService.clickLoginButton( );
    }

    @And("The user clicks back button")
    public void theUserClicksBackButton() {
        MyAccountLoginService.clickBackButton( );
    }

    @Then("Login must fail saying incorrect username or password {string}")
    public void loginMustFailSayingIncorrectUsernamePassword(String userName) {
        MyAccountLoginService.validateLoginFailedForIncorrectPassword(userName);
    }

    @And("The user clicks on logout link")
    public void theUserClicksOnLogoutLink() {
        MyAccountLoginService.clickLogOutLink( );
    }

    @Then("The user must not be logged into their account {string}, but rather a general web page must be visible.")
    public void validateUserLoggedStatus(String isLoggedIn) {
        MyAccountLoginService.navigateMyAccount( );
        MyAccountLoginService.validateUserIsLoggedIn(isLoggedIn.equals("true"));
    }

    @And("The user verify LogOut")
    public void theUserVerifyLogOut() {
        MyAccountLoginService.verifyUserIsLoggedOut();
    }
}
