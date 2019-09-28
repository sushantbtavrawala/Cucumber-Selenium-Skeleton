package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitelement {

    public static void waitforelement (WebDriver driver,String id) {
        WebDriverWait wait = new WebDriverWait(driver, 50);//Wait Function Use
        WebElement wait2 = wait.until(ExpectedConditions.elementToBeClickable(By.id(id))); }
}
