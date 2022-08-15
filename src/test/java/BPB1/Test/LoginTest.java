package BPB1.Test;

import BPB1.Basic.Basic;
import BPB1.Repositories.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends Basic {
    Login loginPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new Login();
    }
    @Test()
    public void loginTest() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        loginPage.selectCompanyLabel();
        Assert.assertEquals(loginPage.validateDashboard(), "Home");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
