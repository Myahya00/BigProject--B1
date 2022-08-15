package BPB1.Test;

import BPB1.Basic.Basic;
import BPB1.Repositories.CheckIns;
import BPB1.Repositories.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckInTest extends Basic {
        Login loginPage;
        CheckIns checkInPage;

        public CheckInTest() {
            super();
        }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new Login();
        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        Thread.sleep(3000);
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
        checkInPage = new CheckIns();
    }
    @Test(priority = 1)
    public void TCP_Check01_User_wants_to_create_check_in_message_for_public() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCreateCheckInBtn();
        checkInPage.enterQuestionField("apa khabar?");
        checkInPage.clickTueDayBtn();
        checkInPage.clickStartCollectingBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Create question successful");
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void TCP_Check04_User_wants_to_archive_the_current_checkIn_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickArchieveCheckInMessage();
        checkInPage.clickMenuBtn();
        checkInPage.clickArchieveBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Archive Question successful");
        Thread.sleep(3000);

    }
    @Test(priority = 3)
    public void TCP_Check02_User_wants_to_create_check_in_message_for_private() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCreateCheckInBtn();
        checkInPage.enterQuestionField("udah siap?");
        checkInPage.clickNotifiedBtn();
        checkInPage.clickTickPersonNoti();
        checkInPage.clickPrivateSelect();
        Thread.sleep(3000);
        checkInPage.clickStartCollectingBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Create question successful");
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void TCP_Check041_User_wants_to_archive_the_current_checkIn_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickArchieveCheckInMessage();
        checkInPage.clickMenuBtn();
        checkInPage.clickArchieveBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Archive Question successful");
        Thread.sleep(3000);

    }
    @Test(priority = 5)
    public void TCP_Check03_User_wants_to_edit_previous_check_in_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        checkInPage.clickMenuBtn();
        checkInPage.clickEditBtn();
        Thread.sleep(2000);
        checkInPage.clearQuestionField();
        checkInPage.enterQuestionField("are you ready?");
        checkInPage.clickTueDayBtn();
        checkInPage.clickSaveChangeBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Update question successful");
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void TCP_Check05_User_wants_to_cancel_creating_check_in_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCreateCheckInBtn();
        checkInPage.enterQuestionField("udah siap?");
        checkInPage.clickCancelCreateBtn();
        Thread.sleep(2000);
        Assert.assertEquals(checkInPage.validateDashboard(), "Check-Ins");
        Thread.sleep(3000);
    }
    @Test(priority = 7)
    public void TCP_Check06_User_wants_to_comment_on_checkIn_messages_using_a_variety_type_of_input() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        checkInPage.clickAddCommentBtn();
        checkInPage.enterCommentField("yes");
        checkInPage.clickPostBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Create comment on checkIn question successful");
        Thread.sleep(3000);
    }

    @Test(priority = 8)
    public void TCP_Check08_User_wants_to_edit_a_comment_on_the_checkIn_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        Thread.sleep(3000);
        checkInPage.clickMenuCommentIcon();
        checkInPage.clickEditCommentBtn();
        checkInPage.enterEditCommentField("...");
        checkInPage.clickPostCommentBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Update comment on checkIn question successful");
        Thread.sleep(3000);
    }
    @Test(priority = 9)
    public void TCP_Check09_User_wants_add_cheers_on_any_comment() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        checkInPage.clickAddCheersIcon();
        Thread.sleep(3000);
        checkInPage.enterInputCheers();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Create cheers on question comment successful");
        Thread.sleep(3000);
    }
    @Test(priority = 10)
    public void TCP_Check11_User_wants_to_cancel_on_commenting_checkIn_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        checkInPage.clickAddCommentBtn();
        checkInPage.enterCommentField("yes");
        Thread.sleep(2000);
        checkInPage.clickCancelBtn();
        Assert.assertEquals(checkInPage.validateTitleQuestion(), "are you ready?");
        Thread.sleep(3000);
    }
    @Test(priority = 11)
    public void TCP_Check12_User_wants_to_cancel_on_editing_check_in_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        checkInPage.clickMenuCommentIcon();
        checkInPage.clickEditCommentBtn();
        checkInPage.enterEditCommentField("...");
        Thread.sleep(2000);
        checkInPage.clickCancelEditCommentBtn();
        Assert.assertEquals(checkInPage.validateTitleQuestion(), "are you ready?");
        Thread.sleep(3000);
    }
    @Test(priority = 12)
    public void TCP_Check13_User_wants_to_reply_to_another_comment() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        Thread.sleep(2000);
        checkInPage.clickAddReply();
        Thread.sleep(2000);
        checkInPage.clickReplyBtn();
        Thread.sleep(2000);
        checkInPage.enterReplyField();
        //checkInPage.clickInsertFile("src/test/resources/chromedriver.exe");
        checkInPage.clickReplyPostBtn();
        Thread.sleep(2000);
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Create discussion on checkIn comment successful");
        Thread.sleep(3000);
    }
    @Test(priority = 13)
    public void TCP_Check14_User_wants_to_cancel_reply_to_another_comment() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCheckInMessage();
        Thread.sleep(2000);
        checkInPage.clickAddReply();
        Thread.sleep(2000);
        checkInPage.clickReplyBtn();
        Thread.sleep(2000);
        checkInPage.enterReplyField();
        //checkInPage.clickInsertFile("src/test/resources/chromedriver.exe");
        checkInPage.clickReplyCancelPostBtn();
        Thread.sleep(2000);
        Assert.assertEquals(checkInPage.validateTitleQuestion(), "[COMMENT] are you ready?");
        Thread.sleep(3000);
    }
    @Test(priority = 14)
    public void TCN_Check01_User_does_not_fill_out_the_form_completely() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCreateCheckInBtn();
        checkInPage.clickStartCollectingBtn();
        Assert.assertEquals(checkInPage.validateTitleQuestion(), "Create a Check-in");
        Thread.sleep(3000);
    }
    @Test(priority = 15)
    public void TCN_Check02_User_enters_wrong_time_format_to_create_check_in_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCreateCheckInBtn();
        checkInPage.enterQuestionField("apa khabar?");
        Thread.sleep(1000);
        checkInPage.clickTimeField();
        checkInPage.enterTimeField();
        checkInPage.clickStartCollectingBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Create question successful");
        Thread.sleep(3000);
    }
    @Test(priority = 16)
    public void TCP_Check042_User_wants_to_archive_the_current_checkIn_message() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickArchieveCheckInMessage();
        checkInPage.clickMenuBtn();
        checkInPage.clickArchieveBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Archive Question successful");
        Thread.sleep(3000);

    }
    @Test(priority = 17)
    public void TCN_Check03_User_does_not_choose_any_person_to_be_notified_when_set_to_private() throws InterruptedException {
        checkInPage.clickProjectCard();
        checkInPage.clickCheckInCard();
        checkInPage.clickCreateCheckInBtn();
        checkInPage.enterQuestionField("udah siap?");
        checkInPage.clickPrivateSelect();
        Thread.sleep(3000);
        checkInPage.clickStartCollectingBtn();
        Assert.assertEquals(checkInPage.validateMessageQuestion(), "Create question successful");
        Thread.sleep(3000);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}