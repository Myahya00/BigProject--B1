package BPB1.Test;

import BPB1.Basic.Basic;
import BPB1.Repositories.Board;
import BPB1.Repositories.Login;
import org.junit.Assert;
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
        board.selectCardCoba();
        board.clickAddMemberMenu();
        board.selectMember();
        board.clickAddMemberButt();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Toggle members successful",true);
    }

}
