package BPB1.Test;

import BPB1.Basic.Basic;
import BPB1.Repositories.Login;
import BPB1.Repositories.SearchBar;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBarTest extends Basic {
    Login loginPage;
    SearchBar searchBarPage;

    public SearchBarTest() {
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
        searchBarPage = new SearchBar();

    }
    @Test(priority = 1)
    public void TCP_Searchbar01_User_want_to_open_feature_Blast_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputsearchbarblast();
        searchBarPage.clickfeatureblast();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar(), "Blasts");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void TCP_Searchbar02_User_want_to_open_feature_Group_Chat_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputsearchbargroupchat();
        searchBarPage.clickfeaturegroupchat();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar(), "Group Chat - Your Big Project ...");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void TCP_Searchbar03_User_want_to_open_feature_Schedule_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputsearchbarschedule();
        searchBarPage.clickfeatureschedule();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar(), "Schedules");
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void TCP_Searchbar04_User_want_to_open_feature_Board_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputsearchbarboard();
        searchBarPage.clickfeatureboard();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar2(), "Board - Your Big Project Here ...");
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void TCP_Searchbar05_User_want_to_open_feature_Check_In_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputsearchbarcheckin();
        searchBarPage.clickfeaturecheckin();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar(), "Check-ins");
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void TCP_Searchbar06_User_want_to_open_feature_Docs_And_Files_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputsearchbardocsandfiles();
        searchBarPage.clickfeaturedocsandfiles();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar(), "Docs & Files");
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void TCN_Searchbar07_User_want_to_open_the_blast_that_was_made_previously_and_input_blast_tittle_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputpostblast();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar3(), "No result found");
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void TCN_Searchbar08_User_want_to_open_the_comments_at_blast_that_was_made_previously_and_input_comments_text_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputcomments();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar3(), "No result found");
        Thread.sleep(2000);
    }
    @Test(priority = 9)
    public void TCN_Searchbar09_User_want_to_open_the_reply_comments_at_blast_that_was_made_previously_and_input_reply_comments_text_via_search_bar_in_Your_Big_Project_Here_B_1_company() throws InterruptedException {
        searchBarPage.clicksearchbar();
        searchBarPage.inputreplycomments();
        Thread.sleep(2000);
        Assert.assertEquals(searchBarPage.validasisearchbar3(), "No result found");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
