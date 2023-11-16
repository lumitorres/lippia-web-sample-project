package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopConstant;
import org.testng.Assert;

public class ShopService extends ActionManager {
    public static void clickOnShopMenuLink() {
        ActionManager.click(ShopConstant.LOCATOR_SHOP_MENU_LINK);
    }

    public static void clickOnItemLevelViewBasket() {
        ActionManager.click(ShopConstant.LOCATOR_VIEW_BASKET_LINK);
    }

    public static void clickOnTheAddToBasketButton() {
        // TODO Bottom Google Add is messing with the click action
        ActionManager.click(ShopConstant.LOCATOR_ADD_TO_BASKET_BUTTON);
    }

    public static void validateTotalAndSubTotal() {
        float priceSubtotal = Float.parseFloat(getText(ShopConstant.LOCATOR_PRICE_SUBTOTAL).replace("₹", ""));
        float priceTotal = Float.parseFloat(getText(ShopConstant.LOCATOR_PRICE_TOTAL).replace("₹", ""));
        Assert.assertTrue(priceSubtotal < priceTotal);
    }

}
