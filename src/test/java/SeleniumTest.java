import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static WebDriver driver;
@BeforeTest
public static void Setup(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
}
@Test
static void teststeps(){
    boolean isDisplayed = driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed();
    System.out.println("Login Button is displayed: " + isDisplayed);
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    driver.findElement(By.xpath("//input[@id='login-button']")).click();
    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    String currentURL = driver.getCurrentUrl();
    String CurrentPageTitle = driver.getTitle();
    System.out.println("Current URL is:" +currentURL);
    System.out.println("Current Page Title is:" +CurrentPageTitle);
    driver.close();

}
}
