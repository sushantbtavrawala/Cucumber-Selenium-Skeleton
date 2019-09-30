package AutomationTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverInitiate;

public class loginToApplication extends DriverInitiate {


    public static String url = "https://admin.easqa.dwp.gov.uk";

    public static By user_Name=By.id("Username");
    public static By password=By.id("OTP");
    public static By continuebutton= By.id("continue");

    public static void get_URL()
    {
    driver.get(url);
    }


    public static void enter_Username(String uname)
    {
        waitforelement();
        find(user_Name).sendKeys(uname);
    }

    public static void enter_password(String pass)
    {
        find(password).sendKeys(pass);
    }

    public static void continue_Button()
    {
        find(continuebutton).click();
    }


    public static void waitforelement()
    {
        WebDriverWait wait = new WebDriverWait(driver, 50);//Wait Function Use
        WebElement wait2 = wait.until(ExpectedConditions.elementToBeClickable(user_Name));
    }


}
