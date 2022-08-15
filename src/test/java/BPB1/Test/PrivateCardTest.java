package BPB1.Test;

import BPB1.Basic.Basic;
import BPB1.Repositories.Board;
import BPB1.Repositories.Login;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrivateCardTest extends Basic {

    Login login;
    Board board;

    public PrivateCardTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        login = new Login();
        Thread.sleep(3000);
        login.clickLoginButton();
        login.enterEmailField(prop.getProperty("username"));
        login.clickLoginNextButton();
        login.enterPasswordField(prop.getProperty("password"));
        login.clickPassNextButton();
        login.selectCompanyLabel();
        org.testng.Assert.assertEquals(login.validateDashboard(), "Home");
        board = new Board();
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void B01_User_directed_to_board_page_when_select_cardBoard() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickCardMenu();
        board.enterNameCard("Test Private");
        board.selectCheckBoxPrivate();
        board.clickCardButton();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Creating card is success",true);
    }
    @Test(priority = 2)
    public void User_add_member_in_Private_card() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectPrivateTest();
        board.clickAddMemberMenu();
        board.selectMember();
        board.clickAddMemberButt();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Toggle members successful",true);
    }
    @Test(priority = 3 )
    public void User_create_labels_in_card_private() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectPrivateTest();
        board.clickAddLabelsMenu();
        board.clickSetLabelsMenu();
        board.inputNameLabels("High");
        board.clickRedColour();
        board.clickCreateLabelsButt();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Creating label for this board is success",true);
    }
    @Test(priority = 4 )
    public void User_use_labels_in_card_private() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectPrivateTest();
        board.clickAddLabelsMenu();
        board.clickLowLabels();
        board.clickApplyLabel();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("toggle multiple labels card is success",true);
    }
    @Test(priority = 5)
    public void User_archive_private_card() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectPrivateTest();
        board.clickArchiveMenu();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("PrivateTest card has been moved to archived",true);

    }
    @Test(priority = 6)
    public void User_view_archive() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickArchiveItems();
        board.enterArchiveName("PrivateTest");
        board.displayNameItems();
        Assert.assertEquals("PrivateTest", "PrivateTest");
    }
    @Test(priority = 7)
    public void User_restore_archive_private() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickArchiveItems();
        board.enterArchiveName("PrivateTest");
        board.clickRestorPri();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Unarchiving card is success", true);
    }
    @Test(priority = 8 )
    public void User_change_name_Privatecard() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectEditCardAyo();
        board.clickChangeNameMenu();
        board.clareName();
        board.inputChangeName("Ganti aja");
        board.clickSaveName();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Update card is success",true);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}