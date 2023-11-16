package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstant;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstant.*;

public class MyAccountService {
    public static void validateLoginStatus(Boolean isLoggedIn) {
        if (isLoggedIn) {
            Assert.assertTrue(ActionManager.getElement("xpath://*[@id=\"page-36\"]/div/div[1]/div/p[1]").isDisplayed( ));
            Assert.assertTrue(ActionManager.getText("xpath://*[@id=\"page-36\"]/div/div[1]/div/p[1]").contains("Hello"));
        } else {
            Assert.assertTrue(ActionManager.getElement("xpath://*[@id=\"customer_login\"]/div[1]/h2").isDisplayed( ));
            Assert.assertTrue(ActionManager.getElement("xpath://*[@id=\"customer_login\"]/div[2]/h2").isDisplayed( ));
        }
    }

    public static void clicksOnAccountDetails() {
        ActionManager.click(MyAccountConstant.LOCATOR_ACCOUNT_DETAILS);
    }

    public static void verifyAccountDetails(String email) {
        Assert.assertEquals(ActionManager.getAttribute(LOCATOR_ACCOUNT_DETAILS_EMAIL_INPUT, "value"), email);
        Assert.assertTrue(ActionManager.getElement(LOCATOR_ACCOUNT_DETAILS_PASSWORD_CHANGE_TITLE).isDisplayed());
        Assert.assertTrue(ActionManager.getElement(LOCATOR_ACCOUNT_DETAILS_PASSWORD_CHANGE_INPUT).isEnabled());
    }

}
