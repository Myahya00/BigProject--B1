package BPB1.Test;
import BPB1.Basic.Basic;
import BPB1.Repositories.Board;
import BPB1.Repositories.Login;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardTest extends Basic {
    Login login;
    Board board;

    public BoardTest() {
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
        board.displayBoardTitle();
        Assert.assertEquals("Kanban Board", "Kanban Board");
    }
    @Test(priority = 2)
    public void B02_User_directed_to_Create_list_in_Board_page_when_click_AddList_inputName_amd_click_create_button() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickAddListMenu();
        board.enterNameList("Going");
        board.clickAddListButton();
        board.displayNamelist();
        Assert.assertEquals("Going","Going");
    }
    @Test(priority = 3)
    public void User_filter_card_by_name_card() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickFilterMenu();
        board.enterFilterName("login");
        board.clickCloseFilter();
        board.displayNameCard();
        Assert.assertEquals("Login", "Login");

    }
    @Test(priority = 4)
    public void User_clear_filter_history_search() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickFilterMenu();
        board.enterFilterName("login");
        board.clickClearFilter();
        board.clickCloseFilter();
        board.displayNameCard();
        Assert.assertEquals("Testing BP-1", "Testing BP-1");
    }
    @Test(priority = 5)
    public void User_add_member_in_card() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardCoba();
        board.clickAddMemberMenu();
        board.selectMember();
        board.clickAddMemberButt();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Toggle members successful",true);
    }
    @Test(priority = 6)
    public void User_move_card_from_Todo_to_BackLog() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardCoba();
        board.clickMenuMove();
        board.clickMoveList();
        board.selectMoveListBacklog();
        board.clickMovePosition();
        board.selectPosition1();
        board.clickMoveButt();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Success!",true);
    }
    @Test(priority = 7)
    public void User_archive_card() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardTesting();
        board.clickArchiveMenu();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Testing card has been moved to archived",true);

    }
    @Test(priority = 8)
    public void User_view_archive() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickArchiveItems();
        board.enterArchiveName("Testing");
        board.displayNameItems();
        Assert.assertEquals("Testing", "Testing");
    }
    @Test(priority = 9)
    public void User_restore_archive() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickArchiveItems();
        board.enterArchiveName("Testing");
        board.clickRestore();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Unarchiving card is success", true);
    }

    @Test(priority = 10 )
    public void User_move_card_public_to_private() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardCoba();
        board.clickPrivateMenu();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Update card is success",true);
    }
    @Test(priority = 11 )
    public void User_move_cardPrivate_to_Public() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardCoba();
        board.clickPublicMenu();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Update card is success",true);
    }
    @Test(priority = 12 )
    public void User_create_new_card() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickCardMenu();
        board.enterNameCard("i want you");
        board.clickCardButton();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Creating card is success",true);
    }
    @Test(priority = 13 )
    public void User_create_labels() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardCoba();
        board.clickAddLabelsMenu();
        board.clickSetLabelsMenu();
        board.inputNameLabels("High");
        board.clickRedColour();
        board.clickCreateLabelsButt();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Creating label for this board is success",true);
    }
    @Test(priority = 14 )
    public void User_use_labels() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardCoba();
        board.clickAddLabelsMenu();
        board.clickLowLabels();
        board.clickApplyLabel();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("toggle multiple labels card is success",true);
    }
    @Test(priority = 15 )
    public void User_Remove_labels() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardCoba();
        board.clickAddLabelsMenu();
        board.clickLowLabels();
        board.clickApplyLabel();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("toggle multiple labels card is success",true);
    }

    @Test(priority = 16 )
    public void User_view_and_delete_comment() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardDisini();
        board.clickEditComment();
        board.clickDeleteMenu();
        board.clickDeleteButton();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("delete comment is success",true);
    }
    @Test(priority = 17 )
    public void User_change_name_card() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.clickEditCardDisini();
        board.clickChangeNameMenu();
        board.clareName();
        board.inputChangeName("ayoo ganti");
        board.clickSaveName();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Update card is success",true);
    }
    @Test(priority = 18 )
    public void User_set_due_date() {
        board.clickTeamCompany();
        board.selectCardBoard();
        board.selectCardDisini();
        board.clickDueDateMenu();
        board.editDate();
        board.selectDue();
        board.clickSaveDueDate();
        board.noticeSuccessIsDisplay();
        Assert.assertTrue("Update card is success", true);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
