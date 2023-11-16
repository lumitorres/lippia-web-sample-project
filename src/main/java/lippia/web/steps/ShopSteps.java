package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {
    @And("The user clicks on Shop Menu top menu link")
    public void theUserClicksOnShopMenuTopMenuLink() {
        ShopService.clickOnShopMenuLink( );
    }

    @And("The user clicks on Item level View Basket link  which navigates to Basket page.")
    public void theUserClicksOnItemLevelViewBasketLink() {
        ShopService.clickOnItemLevelViewBasket( );
    }

    @Given("The user clicks on the Add To Basket button")
    public void theUserClicksOnTheAddToBasketButton() {
        ShopService.clickOnTheAddToBasketButton( );
    }

    @Then("the total always is greater than subtotal because taxes are added to the subtotal.")
    public void validateTotalAndSubTotal() {
        ShopService.validateTotalAndSubTotal( );
    }

}
