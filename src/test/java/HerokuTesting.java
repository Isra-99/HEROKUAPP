import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class HerokuTesting extends BaseTestCase {
    @Test
    public void startLoginActivity() throws IOException {
    Actions actions = new Actions(driver);
    actions.pressLogin(driver);
    actions.clickNotUserYet(driver);
    ReadFromExcel readFromExcel = new ReadFromExcel(driver);
    String fs = readFromExcel.readFirstName(driver);
    actions.enterFirstName(fs,driver);
    String ls = readFromExcel.readLastName(driver);
    actions.enterLastName(ls,driver);
    String e = actions.emailGenerator();
    actions.enterEmail(e,driver);
    Double  d = (readFromExcel.readPassword(driver));
    String str = new BigDecimal(d).toString();
    actions.enterPassword(str,driver);
    actions.enterConfirmPassword(str,driver);
   actions.clickSignUpButton(driver);
   LoginPage loginPage = new LoginPage(driver);
   loginPage.enterSavedEmail(e);
   loginPage.enterSavedPassword(str);

    }


}
