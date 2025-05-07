package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLabs_LoginPage {
    static WebElement element = null;
    public static WebElement Username(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='user-name']"));
        return element;
    }
    public static WebElement Password(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='password']"));
        return element;
    }
    public static WebElement LoginButton(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='login-button']"));
        return element;
    }
}
