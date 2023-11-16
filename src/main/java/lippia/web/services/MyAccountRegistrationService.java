package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountRegistrationConstants;
import org.testng.Assert;

public class MyAccountRegistrationService extends ActionManager {

    public static void clickOnEmail(String email) {
        setInput(MyAccountRegistrationConstants.INPUT_EMAIL, email);
    }

    public static void clickOnPassword(String password) {
        setInput(MyAccountRegistrationConstants.INPUT_PASSWORD, password);
    }

    public static void clickRegistrationButton() {
        ActionManager.click(MyAccountRegistrationConstants.LOCATOR_REGISTRATION_BUTTON);
    }

    public static void validateMassage(String message) {
        String errorMessage = getText(MyAccountRegistrationConstants.LOCATOR_MESSAGE_REGISTRATION);
        Assert.assertEquals(errorMessage, message);
    }

}
