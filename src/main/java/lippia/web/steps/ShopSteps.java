package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {

    @Given("The client is in google page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When( "The client tap on Shop menu" )
    public void theClientTapOnShop() {
        SuperiorBarNavigationBarService.tapMenu();
    }

    @Then( "The client see Filter By Price" )
    public void theClientSee(  ) {
        ShopService.verifyPage();
    }

    @And("The user fills in the fields to complete the order, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}    And The user opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.")
    public void theUserFillsInTheFieldsToCompleteTheOrderAndTheUserOptAnyPaymentInThePaymentGatewayLikeDirectBankTransferChequeCashOrPaypal(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {
    }

//    @Then("the total always is greater than subtotal because taxes are added to the subtotal.")
//    public void verifytheTotalAlwaysIsGreaterThanSubtotal() {
//        ShopService.ValidateTotalValue();
//    }
}
