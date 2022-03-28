import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Random;

public class Actions {
    ///Creating constructor for Actions class
    public Actions(WebDriver d){}
    static public void pressLogin(WebDriver driver){
        driver.findElement(Locators.loginLink).click();
    }
    static public  void clickNotUserYet(WebDriver driver){
        driver.findElement(Locators.notUser).click();
    }
    static public void enterFirstName(String text,WebDriver driver )  {
        driver.findElement(Locators.firstName).sendKeys(text);
    }
    static public void enterLastName(String text,WebDriver driver )  {
        driver.findElement(Locators.lastName).sendKeys(text);
    }
    static public String emailGenerator(){
        Random random = new Random();
        int randomInt = random.nextInt(1000);
        return   ( "username"+randomInt+"@gmail.com");
    }

    static public void enterEmail(String text,WebDriver driver )  {
        driver.findElement(Locators.email).sendKeys(text);
    }
    static public void enterPassword(String text,WebDriver driver )  {
        driver.findElement(Locators.password).sendKeys(text);
    }
    static public void enterConfirmPassword(String text,WebDriver driver )  {
        driver.findElement(Locators.confirmPassword).sendKeys(text);
    }
    static public LoginPage  clickSignUpButton(WebDriver driver){
        driver.findElement(Locators.signUpButton).click();
        return new LoginPage(driver);
    }




}
