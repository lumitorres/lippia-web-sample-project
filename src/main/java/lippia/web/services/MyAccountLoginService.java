package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static lippia.web.constants.MyAccountLoginConstant.*;

public class MyAccountLoginService extends ActionManager {

    public static void navigateMyAccount() {
        ActionManager.click(LOCATOR_MY_ACCOUNT_LINK);
    }

    public static void clickLoginButton() {
        ActionManager.click(LOCATOR_LOGIN_BUTTON);
    }

    public static void clickBackButton() {
        WebDriver driver = new ChromeDriver( );
        driver.navigate( ).back( );
    }

    public static void clickUserName(String username) {
        setInput(INPUT_USERNAME, username);
    }

    public static void clickPassword(String password) {
        setInput(INPUT_PASSWORD, password);
    }

    public static void validateLoginFailedForIncorrectPassword(String userName) {
        String messageError = getText(LOCATOR_MESSAGE_LOGIN_INVALID);
        Assert.assertEquals(messageError, String.format("Error: The password you entered for the username %s is incorrect. Lost your password?", userName));
    }

    public static void clickLogOutLink() {
        ActionManager.click(LOCATOR_LOGOUT_LINK);
    }

    public static void validateUserIsLoggedIn(boolean isLoggedIn) {
        if (isLoggedIn) {
            Assert.assertTrue(ActionManager.getElement("xpath://*[@id=\"page-36\"]/div/div[1]/div/p[1]").isDisplayed( ));
            Assert.assertTrue(getText("xpath://*[@id=\"page-36\"]/div/div[1]/div/p[1]").contains("Hello"));
        } else {
            Assert.assertTrue(ActionManager.getElement("xpath://*[@id=\"customer_login\"]/div[1]/h2").isDisplayed( ));
            Assert.assertTrue(ActionManager.getElement("xpath://*[@id=\"customer_login\"]/div[2]/h2").isDisplayed( ));
        }
    }

    public static void verifyUserIsLoggedOut() {
        try {
            if (ActionManager.getElement("xpath://*[@id=\"page-36\"]/div/div[1]/div/p[1]").isDisplayed( )) {
                clickLogOutLink();
            }
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
        }
    }
}
