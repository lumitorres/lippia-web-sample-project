package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("The user is in home page URL")
    public void home() {
        HomeService.navigateHome( );
    }

    @When("The user click on the image in the Arrivals")
    public void selectArrivalItem() {
        HomeService.selectArrival( );
    }

    @And("The user click on the Add To Basket button which adds that book to your basket")
    public void addToBasket() {
        HomeService.clickAddToBasketButton( );
    }

    @And("The User can view that Book in the Menu item with price")
    public void verifyMenuItemPRice() {
        HomeService.validateMenuItemPrice( );
    }

    @And("The user click on View Basket button")
    public void viewBasket() {
        HomeService.clickViewBasketButton( );
    }

    @And("The user click on Proceed to Check out button")
    public void ClickOnCheckOutButton() {
        HomeService.clickCheckOutButton( );
    }

    @Then("The user has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.")
    public void theUserHasTheFeasibilityToAddCouponInThePaymentGatewayPageAndAlsoHeCanFindBillingOrderAndAdditionalDetails() {
        HomeService.validateDataPageCheckout( );
    }

}
