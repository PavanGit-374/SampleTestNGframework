import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static WebDriver driver;
@BeforeTest
public static void Setup(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://facebook.com");
}
@Test
static void teststeps(){
    boolean isDisplayed = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
    System.out.println("Email input is displayed: " + isDisplayed);
    driver.close();

}
}
