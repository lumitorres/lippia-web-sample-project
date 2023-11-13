package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {
    @Given("the client is in the homepage for home feature")
    public void homePage() {
        HomeService.navigateHome( );
    }

    @When("I click on Shop Menu")
    public void shopMenu() {
        HomeService.clickShopMenu( );
    }

    @And("I click on Home menu button")
    public void clickHomeButton() {
        HomeService.clickHomeButton( );
    }

    @Then("The Home page contains only (.*) sliders")
    public void verifySlidersCount(int number) {
        HomeService.verifySlidersCount(number);
    }

    @Then("The Home page contains only (.*) arrivals")
    public void verifyArrivalCount(int number) {
        HomeService.verifyArrivalsCount(number);
    }
}
