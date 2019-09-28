package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utils.DriverInitiate;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.System.*;

public class VirtualOTP extends DriverInitiate {

    public static String vt_url = "https://easr-token-status-tool-qa.azurewebsites.net/Home/Token?SerialNumber=";
    public static By otp = By.xpath("/html/body/div/h1[2]");
    public static By password=By.id("OTP");

    public static void Virtual_token(String tokenserialnum)
    {
        //driver.findElement(By.cssSelector("Body")).sendKeys(Keys.COMMAND+"t");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open();");

        ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(al.get(1));
        driver.get(vt_url+tokenserialnum);
        String value = find(otp).getText();
        String pass = value.substring(6,14);
        driver.close();
        driver.switchTo().window(al.get(0));
        find(password).sendKeys(pass);
    }
}
