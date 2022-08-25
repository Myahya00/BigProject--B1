package BPB1.Test;

import BPB1.Repositories.Blast;
import BPB1.Basic.Basic;
import BPB1.Repositories.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends Basic {

    Login loginPage;
    Blast blastPage;

    public BlastTest() {
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
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
        Thread.sleep(1500);
        blastPage = new Blast();

    }
    @Test(priority = 1)
    public void TCP_Blast01_User_want_to_create_a_new_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickcreateblastbutton();
        blastPage.inputtittle1();
        blastPage.inputstories();
        blastPage.clickautocompmletelistbox();
        blastPage.clickinautocompletelistbox();
        blastPage.clicksetautocompletelistbox();
        blastPage.clickonedayfromtodaylistbox();
        Thread.sleep(2500);
        blastPage.clickpublisbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Create post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 2)
    public void TCP_Blast03_User_want_to_create_a_new_blast_and_upload_some_link_in_this_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickcreateblastbutton();
        blastPage.inputtittle2();
        blastPage.clickinsertlinkbutton();
        blastPage.inputurl();
        blastPage.inputtexturl();
        blastPage.inserturlbutton();
        blastPage.clickautocompmletelistbox();
        blastPage.clickinautocompletelistbox();
        blastPage.clicksetautocompletelistbox();
        blastPage.clickonedayfromtodaylistbox();
        Thread.sleep(2500);
        blastPage.clickpublisbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Create post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 3)
    public void TCP_Blast04_User_want_to_edit_my_testing_blast_at_set_auto_complete_to_3_Days_From_Today_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast2button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickcheckbutton();
        blastPage.clicksetautocompletelistbox2();
        blastPage.clickthreedayfromtodaylistbox();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 4)
    public void TCP_Blast05_User_want_to_create_a_new_blast_and_set_auto_complete_to_7_Days_from_today_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickcreateblastbutton();
        blastPage.inputtittle3();
        blastPage.inputstories();
        blastPage.clickautocompmletelistbox();
        blastPage.clickinautocompletelistbox();
        blastPage.clicksetautocompletelistbox();
        blastPage.clicksevendayfromtodaylistbox();
        Thread.sleep(2500);
        blastPage.clickpublisbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Create post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 5)
    public void TCP_Blast07_User_want_to_create_a_new_blast_and_set_post_to_private_and_then_hide_from_some_people_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickcreateblastbutton();
        blastPage.inputtittle4();
        blastPage.inputstories();
        blastPage.clickautocompmletelistbox();
        blastPage.clickinautocompletelistbox();
        blastPage.clicksetautocompletelistbox();
        blastPage.clickonedayfromtodaylistbox();
        blastPage.clickprivatebutton();
        blastPage.clickaddbutton();
        blastPage.clickuncheckbutton();
        Thread.sleep(2500);
        blastPage.clickpublisbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Create post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 6)
    public void TCP_Blast08_User_want_to_archive_my_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickarchivepostbutton();
        Thread.sleep(2500);
        blastPage.clickarchivebutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Archive Post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 7)
    public void TCP_Blast09_User_want_to_comments_at_my_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clickcommentsbutton();
        blastPage.inputcomments();
        Thread.sleep(2500);
        blastPage.clickpostcommentsbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Create comment on blast post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 8)
    public void TCP_Blast10_User_want_to_edit_comments_at_my_comments_in_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingcommentsbutton();
        blastPage.clickeditcommentsbutton();
        blastPage.inputeditcomments();
        Thread.sleep(2500);
        blastPage.clickposteditcommentsbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update comment on blast post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 9)
    public void TCP_Blast11_User_want_to_reply_comments_at_my_comments_in_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clickreplycommentsbutton();
        blastPage.clickaddnewreplybutton();
        blastPage.inputreply();
        Thread.sleep(2500);
        blastPage.clickpostreplybutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Create discussion on post comment successful");
        Thread.sleep(2500);
    }
    @Test(priority = 10)
    public void TCP_Blast12_User_want_to_edit_reply_comments_at_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clickreplycommentsbutton();
        blastPage.clicksettingreplycommentsbutton();
        blastPage.clickeditreplycommentsbutton();
        blastPage.inputeditreplycomments();
        Thread.sleep(2500);
        blastPage.clickposteditreplycommentsbutton();
        Thread.sleep(4500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update discussion on blast comment successful");
        Thread.sleep(2500);
    }
    @Test(priority = 11)
    public void TCP_Blast15_User_want_to_give_cheers_at_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clickcheersbutton();
        blastPage.inputcheers();
        Thread.sleep(2500);
        blastPage.clickcheckcheersbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Create cheers on post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 12)
    public void TCP_Blast16_User_want_delete_cheers_at_blast_at_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clickgivecheersbutton();
        Thread.sleep(2500);
        blastPage.clickdeletegivecheersbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Delete cheers on post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 13)
    public void TCP_Blast17_User_want_to_edit_blast_at_story_text_and_user_want_to_change_backgroundcolour_story_text_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickstories();
        blastPage.BlockEnteredText();
        blastPage.clickbackgroundcolourbutton();
        blastPage.clickbackgroundcolouryellowbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 14)
    public void TCP_Blast18_User_want_to_edit_blast_at_story_text_and_user_want_to_change_font_to_bold_at_story_text_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickstories();
        blastPage.BlockEnteredText();
        blastPage.clickboldtextbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 15)
    public void TCP_Blast19_User_want_to_edit_blast_at_story_text_and_user_want_to_italic_font_at_story_text_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickstories();
        blastPage.BlockEnteredText();
        blastPage.clickitalictextbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 16)
    public void TCP_Blast20_User_want_to_edit_blast_at_story_text_and_user_want_to_strikethrough_font_at_story_text_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickstories();
        blastPage.BlockEnteredText();
        blastPage.clickstrikethroughtextbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 17)
    public void TCP_Blast21_User_want_to_edit_blast_at_story_text_and_user_want_to_change_font_size_at_story_text_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickstories();
        blastPage.BlockEnteredText();
        blastPage.clickfontsizetextbutton();
        blastPage.clickfontsize18textbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 18)
    public void TCP_Blast22_User_want_to_edit_blast_at_story_text_and_user_want_to_change_font_style_at_story_text_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickstories();
        blastPage.BlockEnteredText();
        blastPage.clickmoretextbutton();
        blastPage.clickfontfamilytextbutton();
        blastPage.clicktimenewsromantextbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 19)
    public void TCP_Blast23_User_want_to_edit_blast_at_story_text_and_user_want_to_clear_formatting_at_story_text_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickstories();
        blastPage.BlockEnteredText();
        blastPage.clickmoretextbutton();
        blastPage.clickclearformattingbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 20)
    public void TCP_Blast24_User_want_to_edit_post_blast_at_story_text_to_add_emoticons_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickpostblast1button();
        blastPage.clicksettingpostbutton();
        blastPage.clickeditpostbutton();
        blastPage.clickemoticonseditcommentsbutton();
        blastPage.clicksmileemoticonsbutton();
        Thread.sleep(2500);
        blastPage.clicksavechangesbutton();
        Thread.sleep(5500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Update post successful");
        Thread.sleep(2500);
    }
    @Test(priority = 21)
    public void TCN_Blast28_failed_create_a_new_blast_if_user_input_blank_text_in_tittle() throws InterruptedException {
        blastPage.clickcompanybutton();
        blastPage.clickblastbutton();
        blastPage.clickcreateblastbutton();
        blastPage.inputtittle5();
        blastPage.inputstories();
        blastPage.clickautocompmletelistbox();
        blastPage.clickinautocompletelistbox();
        blastPage.clicksetautocompletelistbox();
        blastPage.clickonedayfromtodaylistbox();
        Thread.sleep(2500);
        blastPage.clickpublisbutton();
        Thread.sleep(3500);
        Assert.assertEquals(blastPage.validateMessageQuestion(), "Field parameter not complete.");
        Thread.sleep(2500);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
