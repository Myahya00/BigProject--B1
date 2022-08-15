package BPB1.Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import static BPB1.Basic.Basic.driver;

public class PrivateChat {

    public PrivateChat(){
        PageFactory.initElements(driver, "/companies/61eba2c85080f47b25ddc8f8");
    }

    /**
     * Locator
     */

    By Profile_member = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div/span");
    By PrivateChat_feature = By.xpath("//div[@aria-label='Private Chat']//div[@class='IconItem_container__2XsfF']//*[name()='svg']");
    By SearchPeople_box = By.xpath("//input[@placeholder='Search people']");
    By Message_logo = By.xpath("//*[name()='path' and contains(@d,'M4 4h16v12')]");
    By TriWahyuni_profile = By.xpath("//p[normalize-space()='Tri Wahyuni_QA13']");
    By LeftArrow_contact = By.xpath("//*[name()='path' and contains(@d,'M11.67 3.8')]");
    By TypeMessageHere_input = By.xpath("//div[@class='fr-element fr-view']//p");
    By Attachment_logo = By.xpath("//div[@class='CreateMessage_attachment__2Z8Rx']//*[name()='svg']");
    By Send_logo = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[3]");
    By dadada_message = By.xpath("//div[@class='Message_content__21YIN']//p[contains(text(),'dadadad')]");
    By DownArrow_logo = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[2]/div/div/div[1]/div[1]");
    By DeleteMessage_button = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div/div/p");
    By DeletePopUp_button = By.xpath("/html/body/div[4]/div/div/div[3]/button/div");
    By testing_verify = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[2]/div/div/div[1]/div[2]/div/p");
    By testing_fordelete = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[2]/div/div/div[1]/div[2]/div/p");

    //Title
    By Bold_font = By.id("bold-1");
    By Italic_font = By.id("italic-1");
    By Underline_font = By.id("underline-1");
    By StrikeThrough_typographical = By.id("strikeThrough-1");
    By Orderedlist = By.id("formatOLSimple-1");
    By Emoticon = By.id("emoticons-1");
    By Emoji_image = By.xpath("/html/body/div[4]/div[3]/span[1]");

    //Unorderedlist
    By Unorderedlist = By.id("formatUL-1");
    // Down Arrow
    By Unorderedlist_downarrow = By.id("formatULOptions-1");
    //Default
    By Default = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[1]/a");
    //Circle
    By Circle = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-1\"]/div/div/ul/li[2]/a");
    //Disc
    By Disc = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-1\"]/div/div/ul/li[3]/a");
    //Square
    By Square = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-1\"]/div/div/ul/li[4]/a");

    //BackgroundColor
    By BackgroundColor = By.id("backgroundColor-1");
    //Color Red
    By Color = By.xpath("//span[25]");
    By OK_button = By.xpath("//button[normalize-space()='OK']");
    By Delete_button = By.xpath("/html/body/div[4]/div[2]/span[28]");

    //Assert
    By StartChatting_private = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/p");
    By PrivateChat_TriWahyuni = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/h1");
    By RecentChat_private = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div[1]/h1");
    By Contact_private = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div/h1");
    By ThereInNoMember = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/span");
    By ThereIsNoRecentChats = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/span");

    /**
     * Method
     */

    public void clickProfile_member() {
        driver.findElement(Profile_member).click();
    }

    public void clickPrivateChat_feature() {
        driver.findElement(PrivateChat_feature).click();
    }

    public void EnterSearchPeople_box(String user) {
        driver.findElement(SearchPeople_box).sendKeys(user);
    }

    public void ClickMessage_logo() {
        driver.findElement(Message_logo).click();
    }

    public void ClickTriWahyuni_profile() {
        driver.findElement(TriWahyuni_profile).click();
    }

    public void ClickLeftArrow_contact() {
        driver.findElement(LeftArrow_contact).click();
    }

    public void EnterTypeMessageHere_input(String user) {
        driver.findElement(TypeMessageHere_input).sendKeys(user);
    }

    public void ClickAttachment_logo() {
        driver.findElement(Attachment_logo).click();
    }

    public void ClickSend_logo() {
        driver.findElement(Send_logo).click();
    }

    public void Clickdadada_message() {
        driver.findElement(dadada_message).click();
    }

    public void ClickDownArrow_logo() {
        driver.findElement(DownArrow_logo).click();
    }

    public void ClickDeleteMessage_button() {
        driver.findElement(DeleteMessage_button).click();
    }

    public void clickDeletePopUp_button() { driver.findElement(DeletePopUp_button).click(); }

    public void clicktesting_fordelete() {
        driver.findElement(testing_fordelete).click();
    }

    public void swifelefttext_select() { driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div/p")).sendKeys(Keys.CONTROL + "a"); }

    public String ValidateText_testing() {
        driver.findElement(testing_verify).isDisplayed();
        return driver.findElement(testing_verify).getText();
    }

    //Title

    public void clickBold_font() {
        driver.findElement(Bold_font).click();
    }

    public void clickItalic_font() {
        driver.findElement(Italic_font).click();
    }

    public void clickUnderline_font() {
        driver.findElement(Underline_font).click();
    }

    public void clickStrikeThrough_typographical() {
        driver.findElement(StrikeThrough_typographical).click();
    }

    public void clickOrderedlist() {
        driver.findElement(Orderedlist).click();
    }

    ///Unorderedlist

    public void clickUnorderedlist() { driver.findElement(Unorderedlist).click();}

    public void clickUnorderedDownArrow() { driver.findElement(Unorderedlist_downarrow).click(); }

    public void clickCircle_Unordered() { driver.findElement(Circle).click(); }

    public void clickDisc_Unordered() { driver.findElement(Disc).click(); }

    public void clickSquare_Unordered() { driver.findElement(Square).click(); }

    public void clickEmoticon() {
        driver.findElement(Emoticon).click();
    }

    public void clickEmojiImage() {
        driver.findElement(Emoji_image).click();
    }

    //Background Color

    public void clickBackgroundColor() { driver.findElement(BackgroundColor).click(); }

    public void clickColorRed() { driver.findElement(Color).click(); }

    public void clickDelete_button() { driver.findElement(Delete_button).click(); }

    //Assert

    public String AssertStartChatting_private() { return driver.findElement(StartChatting_private).getText(); }

    public String AssertPrivateChat_TriWahyuni() { return driver.findElement(PrivateChat_TriWahyuni).getText(); }

    public String AssertRecentChat_private() { return driver.findElement(RecentChat_private).getText(); }

    public String AssertContact_private() { return driver.findElement(Contact_private).getText(); }

    public String AssertThereIsNoMember() { return driver.findElement(ThereInNoMember).getText(); }

    public String AssertThersIsNoRecentChats() { return driver.findElement(ThereIsNoRecentChats).getText(); }

}
