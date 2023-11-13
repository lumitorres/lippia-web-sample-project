package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ShopService extends ActionManager {

    public static void navigateHomePage() {
        navigateTo(PropertyManager.getProperty("web.url.tp3-home"));
    }

    public static void clickShopMenu() {
        click(ShopConstants.LOCATOR_SHOP_MENU);
    }

    public static void clickSortingDropDownMenu() {
        click(ShopConstants.LOCATOR_SORTING_DROPDOWN);
    }

    public static void clickDropdownItem(String sortingChoice) {
        List<WebElement> options = getSortingDropdownMenuOptions();
        for (WebElement option : options) {
            try {
                if (option.getText().equals(sortingChoice)) {
                    click(option);
                }
            } catch (Exception e) {

            }
        }
    }

    public static void verifySortingOptionIsSelected(String sortingChoice) {
        List<WebElement> options = getSortingDropdownMenuOptions();
        WebElement selectedOption = null;
        for (WebElement option : options) {
            if (option.isSelected()) {
                selectedOption = option;
            }
        }
        if (selectedOption == null) throw new IllegalStateException();
        Assert.assertEquals(selectedOption.getText(), sortingChoice);
    }

    private static List<WebElement> getSortingDropdownMenuOptions() {
        WebElement dropdownMenu = getElement(ShopConstants.LOCATOR_SORTING_DROPDOWN);
        return dropdownMenu.findElements(By.xpath("*"));
    }
}
