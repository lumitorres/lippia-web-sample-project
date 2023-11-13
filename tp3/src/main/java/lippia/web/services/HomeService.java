package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.ActionManager.getElement;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService {

    public static Object click;

    public static void navigateHome() {
        navigateTo(PropertyManager.getProperty("web.url.tp3-home"));
    }

    public static void clickShopMenu() {
        ActionManager.click(HomeConstants.LOCATOR_SHOP_MENU);
    }

    public static void clickHomeButton() {
        ActionManager.click(HomeConstants.LOCATOR_HOME_BUTTON);
    }

    public static void verifySlidersCount(int number) {
        WebElement sliderContainer = getElement(HomeConstants.LOCATOR_CONTAINER_SLIDER);
        List<WebElement> sliders = sliderContainer.findElements(By.xpath("*"));

        // Verify container has 'number' of children
        Assert.assertEquals(number, sliders.size( ));
    }

    public static void verifyArrivalsCount(int number) {
        WebElement arrivalsContainer = getElement(HomeConstants.LOCATOR_CONTAINER_ARRIVALS);
        List<WebElement> arrivals = arrivalsContainer.findElements(By.xpath("*"));

        Assert.assertEquals(number, arrivals.size( ));
    }
}
