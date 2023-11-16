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

    @When("The user clicks on the image in the Arrivals")
    public void selectArrivalItem() {
        HomeService.selectArrival( );
    }

    @And("The user clicks on the Add To Basket button which adds that book to your basket")
    public void addToBasket() {
        HomeService.clickAddToBasketButton( );
    }

    @And("The User can view that Book in the Menu item with price")
    public void verifyMenuItemPRice() throws InterruptedException {
        HomeService.validateMenuItemPrice( );
    }

    @And("The user clicks on View Basket button")
    public void viewBasket() {
        HomeService.clickViewBasketButton( );
    }

    @And("The user clicks on Proceed to Check out button")
    public void ClickOnCheckOutButton() {
        HomeService.clickCheckOutButton( );
    }

    @Then("The user has the feasibility to add coupon in the payment gateway page and also he can find billing, order and additional details.")
    public void theUserHasTheFeasibilityToAddCouponInThePaymentGatewayPageAndAlsoHeCanFindBillingOrderAndAdditionalDetails() throws InterruptedException {
        HomeService.validateDataPageCheckout( );
    }

    @And("The user clicks place-order button")
    public void theUserClicksPlaceOrderButton() {
        HomeService.clickPlaceOrderButton( );
    }

    @And("The user fills in the fields to complete the order, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void theUserFillsInTheFieldsToCompleteTheOrder(String firstName, String lastName, String email, String phone, String address, String townCity, String postcodeZip, String country, String state) {
        HomeService.clickFirstName(firstName);
        HomeService.clickLastName(lastName);
        HomeService.clickEmail(email);
        HomeService.clickPhone(phone);
        HomeService.selectSpinnerCountry(country);
        HomeService.clickAddress(address);
        HomeService.clickTown(townCity);
        HomeService.selectSpinnerState(state);
        HomeService.clickPostcode(postcodeZip);
    }

    @And("The user can find total and subtotal values just above the Proceed to Checkout button.")
    public void CanFindTotalAndSubtotalValues() throws InterruptedException {
        HomeService.validateTotalAndSubTotalValues( );
    }

    @Then("The user navigates to Order confirmation page with order details, bank details, customer details and billing details")
    public void validateUserIsInOrderDetailsPage() {
        HomeService.validateUserSeesOrderDetails( );
    }

}
