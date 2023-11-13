package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {
    @Given("The client is in the homepage for shop feature")
    public void theClientIsInTheHomepage() {
        ShopService.navigateHomePage();
    }

    @When("I Click on Shop Menu")
    public void shopMenu() {
        ShopService.clickShopMenu();
    }

    @And("I select sort by (.*) from sorting dropdown menu")
    public void selectSorting(String sortingChoice) {
        ShopService.clickSortingDropDownMenu();
        ShopService.clickDropdownItem(sortingChoice);
    }

    @Then("See sorted products by (.*)")
    public void verifySortingSelected(String sortingChoice) {
        ShopService.verifySortingOptionIsSelected(sortingChoice);
    }
}
