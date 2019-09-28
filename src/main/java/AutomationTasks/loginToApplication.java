package AutomationTasks;

import org.openqa.selenium.By;
import utils.DriverInitiate;

public class loginToApplication extends DriverInitiate {


    public static String url = "http://www.gcrit.com/build3/admin";

    public static By username=By.name("username");
    public static By password=By.name("password");
    public static By continuebutton= By.id("tdb1");

    public static void get_URL()
    {
    driver.get(url);
    }

    public static void enter_Username(String uname)
    {
        find(username).sendKeys(uname);
    }

    public static void enter_password(String pass)
    {
        find(password).sendKeys(pass);
    }

    public static void continue_Button()
    {
        find(continuebutton).click();
    }

}
