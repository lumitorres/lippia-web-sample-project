package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class LoginService extends ActionManager {

    public static void navigateHome(){
       navigateTo(PropertyManager.getProperty("web.url.tp3-home"));
    }

    public static void navigateMyAccount() {
        navigateTo(PropertyManager.getProperty("web.url.tp3-myAccount"));
    }

    public static void enterUserName(String username) {
        setInput(LoginConstants.LOCATOR_NAME_INPUT_FIELD, username);
    }

    public static void enterPassword(String password) {
        setInput(LoginConstants.LOCATOR_PASSWORD_INPUT_FIELD, password);
    }

    public static void login() {
        click(LoginConstants.LOCATOR_LOGIN_BUTTON);
    }

    public static void successLoginMessageIsDisplayed(String message) {
        // Get the element on the screen with the 'login success message' and get its text
        String bodyText = getElement(LoginConstants.LOCATOR_SUCCESS_MESSAGE_CONTAINER).getText();

        // Print info in console
        System.out.println("LUDMI - messageIsDisplayed 3 bodyText = " + bodyText);
        System.out.println("LUDMI - messageIsDisplayed 4 message = " + message);

        // Do the validation, message is displayed
        Assert.assertTrue(bodyText.contains(message));
    }

    public static void errorLoginMessageIsDisplayed(String message) {
        // Get the element on the screen with the 'login error message' and get its text
        String bodyText = getElement(LoginConstants.LOCATOR_ERROR_MESSAGE_CONTAINER).getText();

        // Print info in console
        System.out.println("LUDMI - errorMessageIsDisplayed 3 bodyText = " + bodyText);
        System.out.println("LUDMI - errorMessageIsDisplayed 4 message = " + message);

        // Do the validation, message is displayed
        Assert.assertTrue(bodyText.contains(message));
    }
}