package lippia.web.constants;

public class MyAccountLoginConstant {
    public static final String LOCATOR_MY_ACCOUNT_LINK = "xpath://*[@id=\"menu-item-50\"]/a";
    public static final String LOCATOR_LOGIN_BUTTON = "xpath://*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]";
    public static final String INPUT_USERNAME = "xpath://*[@id=\"username\"]";
    public static final String INPUT_PASSWORD = "xpath://*[@id=\"password\"]";
    public static final String LOCATOR_MESSAGE_LOGIN_INVALID = "xpath://*[@id=\"page-36\"]/div/div[1]/ul/li";
    public static final String MESSAGE_LOGIN_INVALID = "Error: The password you entered for the username ludmilatorresg@gmail.com is incorrect. Lost your password?";
    public static final String LOCATOR_LOGOUT_LINK = "xpath://*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a";
    public static final String LOCATOR_MESSAGE_LOGIN_VALID = "xpath://*[@id=\"page-36\"]/div/div[1]/div/p[1]/text()[1]";
    public static final String MESSAGE_LOGIN_VALID = "Hello";
}
