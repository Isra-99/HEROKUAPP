import org.openqa.selenium.WebDriver;

public class LoginPage {
    static public WebDriver driver;
    public LoginPage (WebDriver d){
        this.driver  = d;
    }
    static public void  enterSavedEmail( String text ){
        driver.findElement(Locators.savedEmail).sendKeys(text);
    }
    static public void  enterSavedPassword( String text ){
        driver.findElement(Locators.savedPassword).sendKeys(text);
    }

}
