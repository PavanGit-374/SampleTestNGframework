package test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SauceLabs_LoginPage;

import java.util.concurrent.TimeUnit;

public class SauceLabsLoginFlow {
    private static WebDriver driver =null;


    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

    }

    @Test
    public void testSteps(){
        SauceLabs_LoginPage.Username(driver).sendKeys("problem_user");
        SauceLabs_LoginPage.Password(driver).sendKeys("secret_sauce");
        SauceLabs_LoginPage.LoginButton(driver).click();
        String PageURL = driver.getCurrentUrl();
        String PageTitle = driver.getTitle();
        System.out.println("PageURL is:" +PageURL);
        System.out.println("PageTitle is:" +PageTitle);
    }


}
