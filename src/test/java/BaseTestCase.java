import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestCase {
    static public WebDriver driver;
    @BeforeTest
    public void launchBrowser(){
    //// creating path to open chrome
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        /// creating object of chrome
        driver = new ChromeDriver();
        driver.get("https://emumba-test.herokuapp.com/");



    }
    /*@AfterTest
    public void closeBrowser(){
        driver.quit();
    }*/

}
