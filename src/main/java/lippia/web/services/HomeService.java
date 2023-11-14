package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeConstants;
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
        Assert.assertTrue(test.contains(HomeConstants.ITEM_PRICE_TEXT));
    }

    public static void clickCheckOutButton() {
        ActionManager.click(HomeConstants.LOCATOR_CHECKOUT_BUTTON);
    }

    public static void validateDataPageCheckout() {
        String checkoutTitle = getText(HomeConstants.LOCATOR_CHECKOUT_PAGE_TITLE);
        Assert.assertEquals(checkoutTitle, HomeConstants.CHECKOUT_PAGE_TITLE_TEXT);
    }

}
