package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MyAccountRegistrationService;

public class MyAccountRegistrationSteps extends PageSteps {
    @When("The user enter {string} in Email Address TextBox")
    public void theUserEnterInEmailAddressTextBox(String email) {
        MyAccountRegistrationService.clickOnEmail(email);
    }

    @And("The user enter {string} in password TextBox")
    public void theUserEnterInPasswordTextBox(String password) {
        MyAccountRegistrationService.clickOnPassword(password);

    }

    @And("The user clicks on register button")
    public void theUserClicksOnRegisterButton() {
        MyAccountRegistrationService.clickRegistrationButton( );
    }

    @Then("Registration must fail with a warning {string}")
    public void registrationMustFailWithAWarning(String message) {
        MyAccountRegistrationService.validateMassage(message);
    }
}
