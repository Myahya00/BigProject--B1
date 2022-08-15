package BPB1.Test;
import BPB1.Basic.Basic;
import BPB1.Repositories.GroupChat;
import BPB1.Repositories.Login;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class GroupChatTest extends Basic {
    Login loginPage;
    GroupChat groupChat;

    public GroupChatTest(){super();
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
        groupChat = new GroupChat(); }

    @Test(priority = 1)
    public void TCP01_As_a_user_I_want_to_send_message_in_Group_Chat_at_Cicle_App_Staging_site() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("testing");
        Thread.sleep(2000);
        groupChat.ClickSend_logo();
        Thread.sleep(3000);
        Assert.assertEquals(groupChat.AssertMessageContent_testing(), "testing");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void TCP02_As_a_user_I_want_to_delete_message_chat_in_Group_Chat_at_Cicle_App_Staging_site() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.clicktesting_fordelete();
        Thread.sleep(2000);
        groupChat.ClickDownArrow_logo();
        Thread.sleep(2000);
        groupChat.ClickDeleteMessage();
        Thread.sleep(3000);
        groupChat.clickDeleteButton_popup();
        Thread.sleep(2000);
        Assert.assertEquals(groupChat.PopupDeleteMessage_success(), "Delete group chat message success");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void TCP03_As_a_user_I_want_to_Download_Excel_Xlsx_file_in_Group_Chat_at_Cicle_App_Staging_site_To_Be_Discuss() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.clickDownloadExcel();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void TCP04_As_a_user_I_want_to_make_my_writing_Bold() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickBold_font();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
        Assert.assertEquals(groupChat.AssertBoldItalicEct_message(), "indri");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void TCP05_As_a_user_I_want_to_make_my_writing_Italic() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickItalic_font();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
        Assert.assertEquals(groupChat.AssertItalic_message(), "indri");
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void TCP06_As_a_user_I_want_to_make_my_writing_Underline() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickUnderline_font();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
        Assert.assertEquals(groupChat.AssertUnderline_message(), "indri");
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void TCP07_As_a_user_I_want_to_make_my_writing_Strikethrough() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickStrikeThrough_typographical();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
        Assert.assertEquals(groupChat.AssertStrikeThrough_message(), "indri");
    }

    @Test(priority = 8)
    public void TCP08_As_a_user_I_want_to_make_my_writing_Ordered_List() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickOrderedlist();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void TCP09_As_a_user_I_want_to_make_my_writing_Unordered_List_Default() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickUnorderedlist();
        Thread.sleep(3000);
        groupChat.clickDefault();
        Thread.sleep(2000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void TCP10_As_a_user_I_want_to_select_Circle_to_make_my_posts_Unordered_List() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickUnorderedlist();
        Thread.sleep(2000);
        groupChat.clickCircle();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void TCP11_As_a_user_I_want_to_select_Disc_to_make_my_posts_Unordered_List() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickUnorderedlist();
        Thread.sleep(2000);
        groupChat.clickDisc();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void TCP12_As_a_user_I_want_to_select_Square_to_make_my_posts_Unordered_List() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickUnorderedlist();
        Thread.sleep(2000);
        groupChat.clickSquare();
        Thread.sleep(3000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void TCP13_As_a_user_I_want_to_change_the_writing_background_be_colored_before_I_send() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickBackgroundColor();
        Thread.sleep(3000);
        groupChat.clickColor();
        Thread.sleep(2000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void TCP14_As_a_user_I_want_to_remove_the_writing_background_become_colorless_before_I_send() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("indri");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        groupChat.clickBackgroundColor();
        Thread.sleep(3000);
        groupChat.clickColor();
        Thread.sleep(2000);
        groupChat.clickBackgroundColor();
        Thread.sleep(2000);
        groupChat.clickDelete_button();
        Thread.sleep(2000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void TCN06_As_a_user_I_want_send_the_chat_in_column_Type_message_here_no_spaced_the_send_icon_will_shift_to_the_right_and_not_parallel_to_the_top_line_To_Be_Discuss() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("IndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndraIndra");
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void TCN09_As_a_user_I_want_to_send_emoticon_but_there_is_no_emoticon_feature_and_I_have_to_enter_any_word_and_double_click_on_the_word_then_the_emoticon_feature_appears() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("testing");
        groupChat.swifeleft_IndriMessage_select();
        Thread.sleep(2000);
        groupChat.clickEmoticon();
        Thread.sleep(2000);
        groupChat.clickEmojiImage();
        Thread.sleep(2000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void TCN10_As_a_user_I_want_to_send_an_emoticon_and_words_not_spaced_but_emoticon_makes_the_first_letter_of_the_word_closed_and_the_second_letter_automatically_to_a_space() throws InterruptedException {
        groupChat.clickProjectCard();
        Thread.sleep(2000);
        groupChat.clickGroupChat_feature();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("testing");
        Thread.sleep(2000);
        groupChat.swifeleft_IndriMessage_select();
        Thread.sleep(2000);
        groupChat.clickEmoticon();
        Thread.sleep(2000);
        groupChat.clickEmojiImage();
        Thread.sleep(2000);
        groupChat.EnterTypeMessageHere("testing");
        Thread.sleep(2000);
        groupChat.ClickSend_logo();
        Thread.sleep(2000);

    }


}
