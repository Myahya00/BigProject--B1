package BPB1.Test;

import BPB1.Basic.Basic;
import BPB1.Repositories.Login;
import BPB1.Repositories.PrivateChat;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrivateChatTest extends Basic {
    Login loginPage;
    PrivateChat privateChat;

    public PrivateChatTest() {super();
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
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
        privateChat = new PrivateChat();

    }

    @Test(priority = 1)
    public void TCP01_As_a_user_I_want_to_send_a_private_chat_to_someone_I_havent_chatted_with_at_all() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        Assert.assertEquals(privateChat.AssertStartChatting_private(), "Start chatting with your team members!");
        privateChat.ClickMessage_logo();
        Thread.sleep(2000);
        privateChat.EnterSearchPeople_box("Tri Wahyuni_QA13");
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        Assert.assertEquals(privateChat.AssertPrivateChat_TriWahyuni(), "Private Chat: Tri Wahyuni_QA13");
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void TCP02_As_a_user_I_want_to_message_someone_Ive_messaged_before() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        Assert.assertEquals(privateChat.AssertRecentChat_private(), "Recent Chats");
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        Assert.assertEquals(privateChat.AssertPrivateChat_TriWahyuni(), "Private Chat: Tri Wahyuni_QA13");
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void TCP03_As_a_user_I_want_to_send_a_private_chat_to_someone_who_is_not_a_member() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickMessage_logo();
        Thread.sleep(2000);
        Assert.assertEquals(privateChat.AssertContact_private(), "Contacts");
        privateChat.EnterSearchPeople_box("indri");
        Thread.sleep(2000);
        Assert.assertEquals(privateChat.AssertThereIsNoMember(), "There is no members");
    }

    @Test(priority = 4)
    public void TCP04_As_a_user_I_want_to_send_a_message_to_someone_I_havent_chatted_with_but_looking_for_that_persons_profile_via_the_Recent_Chat_field() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.EnterSearchPeople_box("Thomas");
        Thread.sleep(2000);
        Assert.assertEquals(privateChat.AssertThersIsNoRecentChats(), "There is no recent chats");
    }

    @Test(priority = 5)
    public void TCP05_As_a_user_I_want_to_delete_message_chat_in_Private_Chat_at_Cicle_App_Staging_site() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.clicktesting_fordelete();
        Thread.sleep(2000);
        privateChat.ClickDownArrow_logo();
        Thread.sleep(2000);
        privateChat.ClickDeleteMessage_button();
        Thread.sleep(2000);
        privateChat.clickDeletePopUp_button();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void TCP06_As_a_user_I_want_to_make_my_writing_Bold_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickBold_font();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void TCP07_As_a_user_I_want_to_make_my_writing_Italic_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickItalic_font();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void TCP08_As_a_user_I_want_to_make_my_writing_Underline_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickUnderline_font();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void TCP09_As_a_user_I_want_to_make_my_writing_Strikethrough_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickStrikeThrough_typographical();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void TCP10_As_a_user_I_want_to_make_my_writing_Ordered_List_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickOrderedlist();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void TCP11_As_a_user_I_want_to_make_my_writing_Unordered_List_Default_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickUnorderedlist();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void TCP12_As_a_user_I_want_to_make_my_writing_Unordered_List_Circle_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickUnorderedDownArrow();
        Thread.sleep(2000);
        privateChat.clickCircle_Unordered();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void TCP13_As_a_user_I_want_to_make_my_writing_Unordered_List_Disc_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickUnorderedDownArrow();
        Thread.sleep(2000);
        privateChat.clickDisc_Unordered();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void TCP14_As_a_user_I_want_to_make_my_writing_Unordered_List_Square_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickUnorderedDownArrow();
        Thread.sleep(2000);
        privateChat.clickSquare_Unordered();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void TCP15_As_a_user_I_want_to_make_my_writing_background_be_colored_before_I_send_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickBackgroundColor();
        Thread.sleep(2000);
        privateChat.clickColorRed();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void TCP16_As_a_user_I_want_to_remove_the_writing_background_become_colorless_before_I_send_in_Private_Chat() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickBackgroundColor();
        Thread.sleep(2000);
        privateChat.clickColorRed();
        Thread.sleep(2000);
        privateChat.clickBackgroundColor();
        Thread.sleep(2000);
        privateChat.clickDelete_button();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void TCN09_As_a_user_I_want_to_send_emoticon_but_there_is_no_emoticon_feature_in_Private_Chat_and_I_have_to_enter_any_word_and_double_click_on_the_word_then_the_emoticon_feature_appears() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickEmoticon();
        Thread.sleep(2000);
        privateChat.clickEmojiImage();
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

    @Test(priority = 18)
    public void TCN10_As_a_user_I_want_to_send_an_emoticon_and_words_not_spaced_in_Private_Chat_but_emoticon_makes_the_first_letter_of_the_word_closed_and_the_second_letter_automatically_to_a_space() throws InterruptedException {
        privateChat.clickProfile_member();
        Thread.sleep(2000);
        privateChat.clickPrivateChat_feature();
        Thread.sleep(2000);
        privateChat.ClickTriWahyuni_profile();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.swifelefttext_select();
        Thread.sleep(2000);
        privateChat.clickEmoticon();
        Thread.sleep(2000);
        privateChat.clickEmojiImage();
        Thread.sleep(2000);
        privateChat.EnterTypeMessageHere_input("testing");
        Thread.sleep(2000);
        privateChat.ClickSend_logo();
        Thread.sleep(2000);
    }

}
