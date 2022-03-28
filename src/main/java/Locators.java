import org.openqa.selenium.By;

public class Locators {
    ///Locator for LoginLink
    static public By loginLink = By.xpath("//span[contains(text(),'Login')]");
    ///Locator for Not user yet
    static public By notUser = By.linkText("Not a user yet?");
    static public By firstName = By.xpath("//input[@name='first_name']");
    static public By lastName = By.xpath("//input[@name='last_name']");
    static public By email = By.xpath("//input[@name='email']");
    static public By password = By.xpath("//input[@name='password']");
    static public By confirmPassword = By.xpath("//input[@name='confirm_password']");
    static public By signUpButton = By.xpath("//button//span[contains(text(),'Sign Up')]");
    static public By savedEmail = By.xpath("//div[@id='root']//input[@name='email']");
    static public By savedPassword = By.xpath("//div[@id='root']//input[@name='password']");
}
