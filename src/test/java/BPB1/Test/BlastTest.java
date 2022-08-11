package BPB1.Test;

import BPB1.Repositories.Blast;
import BPB1.Repositories.Home;
import BPB1.Basic.Basic;
import BPB1.Repositories.Login;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends Basic {

    Login loginPage;
    Home homePage;
    //TeamPage teamPage;
    Blast blastPage;

    public BlastTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new Login();
        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
    }
    @Test(priority = 1)
    public void B01_User_directed_to_Blast_page_when_select_Blast_on_dropdown_navigation_bar() {
        homePage.clickTeamCard();
        homePage.clickNavbarDrpDwnIcon();
        homePage.selectBlastDrpDwn();

        blastPage.displayBlastsLabel();
        Assert.assertEquals("Blast", "Blast");
    }
    @Test(priority = 2)
    public void B02_User_directed_to_Create_a_Blast_page_when_click_Create_Post_bar_button() {
        homePage.clickTeamCard();
        homePage.clickNavbarDrpDwnIcon();
        homePage.selectBlastDrpDwn();

        //teamPage.clickBlastWidget();

        blastPage.clickCreateBlastBarBtn();
        blastPage.displayCreateBlastLabel();
        Assert.assertEquals("Create a Blast", "Create a Blast");
    }
    @Test(priority = 3)
    public void User_create_a_new_post_with_all_completed_fields() {
        homePage.clickTeamCard();
        homePage.clickNavbarDrpDwnIcon();
        homePage.selectBlastDrpDwn();

        //teamPage.clickBlastWidget();

        blastPage.clickCreateBlastBarBtn();
        blastPage.displayCreateBlastLabel();
        Assert.assertEquals("Create a Blast", "Create a Blast");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
