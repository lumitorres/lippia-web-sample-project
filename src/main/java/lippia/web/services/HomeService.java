package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService extends ActionManager {
    public static void navigateHome() {
        navigateTo("http://practice.automationtesting.in/");
        // navigateTo(PropertyManager.getProperty(web.base.url));
    }

    public static void selectArrival() {
        ActionManager.click(HomeConstants.LOCATOR_FIRST_ARRIVAL);
    }

    public static void clickAddToBasketButton() {
        ActionManager.click(HomeConstants.LOCATOR_ADD_TO_BASKET_BUTTON); //using Selenium click button method
    }

    public static void clickViewBasketButton() {
        ActionManager.click(HomeConstants.LOCATOR_VIEW_BASKET_BUTTON);
    }

    public static void validateMenuItemPrice() {
        String test = getText(HomeConstants.LOCATOR_ITEM_PRICE);
        Assert.assertFalse(test.contains(HomeConstants.ITEM_PRICE_NO_ITEMS));
    }

    public static void clickCheckOutButton() {
        ActionManager.click(HomeConstants.LOCATOR_CHECKOUT_BUTTON);
    }

    public static void validateDataPageCheckout() throws InterruptedException {
        Thread.sleep(2000);
        String checkoutTitle = getText(HomeConstants.LOCATOR_CHECKOUT_PAGE_TITLE);
        Assert.assertEquals(checkoutTitle, HomeConstants.CHECKOUT_PAGE_TITLE_TEXT);
    }

    public static void clickFirstName(String text) {
        setInput(HomeConstants.INPUT_FIRSTNAME_XPATH, text);
    }

    public static void clickLastName(String text) {
        setInput(HomeConstants.INPUT_LASTNAME_XPATH, text);
    }

    public static void clickEmail(String text) {
        setInput(HomeConstants.INPUT_EMAIL_XPATH, text);
    }

    public static void clickPhone(String text) {
        setInput(HomeConstants.INPUT_PHONE_XPATH, text);
    }

    public static void selectSpinnerCountry(String countryName) {
        // Click dropdown arrow
        click(HomeConstants.LOCATOR_COUNTRY_DROPDOWN_ARROW);
        // Enter country name in search input field
        setInput(HomeConstants.LOCATOR_COUNTRY_DROPDOWN_SEARCH_INPUT, countryName);
        // Click first option
        click(HomeConstants.LOCATOR_COUNTRY_DROPDOWN_FIRST_OPTION);
    }

    public static void clickAddress(String text) {
        setInput(HomeConstants.INPUT_ADDRESS_XPATH, text);
    }

    public static void clickTown(String text) {
        setInput(HomeConstants.INPUT_TOWN_XPATH, text);
    }

    public static void selectSpinnerState(String State) {
        click(HomeConstants.LOCATOR_SPINNER_STATE_ARROW);
        setInput(HomeConstants.SELECT_STATE_XPATH_SEARCH, State);
        click(HomeConstants.LOCATOR_STATE_OPTION);
    }

    public static void clickPostcode(String text) {
        setInput(HomeConstants.INPUT_POSTCODE_XPATH, text);
    }

    public static void validateTotalAndSubTotalValues() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getElement(HomeConstants.LOCATOR_TOTAL).isDisplayed( ));
        Assert.assertTrue(getElement(HomeConstants.LOCATOR_SUB_TOTAL).isDisplayed( ));
    }

    public static void clickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(4000);
        WebElement placeOrderButton = getElement(HomeConstants.LOCATOR_PLACE_ORDER_BUTTON);
        waitClickable(HomeConstants.LOCATOR_PLACE_ORDER_BUTTON);
        placeOrderButton.click( );

    }

    public static void validateUserSeesOrderDetails() throws InterruptedException {
        Thread.sleep(4000);
        WebElement orderDetailsTitle = getElement(HomeConstants.LOCATOR_ORDER_DETAILS_TITLE);
        Assert.assertTrue(orderDetailsTitle.isDisplayed( ));
    }

}
