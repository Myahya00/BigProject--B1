package BPB1.Test;


import BPB1.Basic.Basic;
import BPB1.Repositories.AddRemoveMember;
import BPB1.Repositories.Login;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveTest extends Basic {
    Login loginPage;
    AddRemoveMember addRemovePage;

    public AddRemoveTest(){super();}

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
        Assert.assertEquals(loginPage.validateDashboard(), "Home");
        addRemovePage = new AddRemoveMember();
    }

    @Test(priority = 1)
    public void TCP_Add01_User_wants_to_add_new_members_into_company() throws InterruptedException {
        addRemovePage.clickShowMemberBtn();
        addRemovePage.clickInviteBtn();
        addRemovePage.enterAddEmailTextArea("nurul.qawork@gmail.com");
        addRemovePage.clickSubmitNewEmailBtn();
        Assert.assertEquals(addRemovePage.validateInvitation(), "Invitations has been sent");
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void TCP_Add03_User_wants_to_add_new_members_into_project() throws InterruptedException {
        addRemovePage.clickProjectCard();
        addRemovePage.clickAddProjectMemberIcon();
        addRemovePage.clickTickMember();
        addRemovePage.clickApplyMemberBtn();
        Assert.assertEquals(addRemovePage.clickMessageToggle(), "Toggle member successful");
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void TCP_Add04_User_wants_to_remove_members_from_project() throws InterruptedException {
        addRemovePage.clickProjectCard();
        addRemovePage.clickAddProjectMemberIcon();
        addRemovePage.clickTickMember();
        addRemovePage.clickApplyMemberBtn();
        Assert.assertEquals(addRemovePage.clickMessageToggle(), "Toggle member successful");
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void TCP_Add06_Users_want_to_update_their_profiles() throws InterruptedException {
        addRemovePage.clickProfileIcon();
        addRemovePage.clickProfileEditIcon();
        addRemovePage.clickEditButton();
        addRemovePage.clearStatusField();
        addRemovePage.enterStatusField("Student");
        addRemovePage.clearBioField();
        addRemovePage.enterBioField("Test");
        addRemovePage.clickSaveBtn();
        Assert.assertEquals(addRemovePage.validateCheckStatus(), "Student");
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void TCP_Add07_Users_want_to_cancel_update_their_profiles() throws InterruptedException {
        addRemovePage.clickProfileIcon();
        addRemovePage.clickProfileEditIcon();
        addRemovePage.clickEditButton();
        addRemovePage.enterStatusField("Student");
        addRemovePage.enterBioField("Test");
        addRemovePage.clickCancelBtn();
        Assert.assertEquals(addRemovePage.validateCheckStatus(), "Student");
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void TCN_Add01_User_wants_to_add_new_members_into_company_by_invalid_email() throws InterruptedException {
        addRemovePage.clickShowMemberBtn();
        addRemovePage.clickInviteBtn();
        addRemovePage.enterAddEmailTextArea("nurul.qawork@gmail.com" + Keys.ENTER + "izzanniroshlei@gmail.com");
        addRemovePage.clickSubmitNewEmailBtn();
        Assert.assertEquals(addRemovePage.validateInvitation(), "Invitations has been sent");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }



}
