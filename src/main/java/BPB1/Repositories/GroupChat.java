package BPB1.Repositories;

import BPB1.Basic.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.PageFactory;

import static BPB1.Basic.Basic.driver;

public class GroupChat {
    public GroupChat() {
        PageFactory.initElements(driver, "/companies/61eba2c85080f47b25ddc8f8");
    }

    /**
     * Locator
     */

    By TypeMessageHere_input = By.xpath("//div[@class='fr-element fr-view']//p");
    By Attachment_logo = By.xpath("//div[@class='CreateMessage_attachment__2Z8Rx']//*[name()='svg']");
    By Send_logo = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[3]/div/div");
    By indra_message = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[2]/div/div/div[1]/div[2]/div/p");
    By ThisIsTest_Message = By.xpath("(//p[contains(text(),'This is test')])[1]");
    By DownArrow_logo = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[3]/div/div/div[1]/div[1]");
    By DeleteMessage_button = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[3]/div/div/div[1]/div[2]/div[3]/div/div/div/p");
    By GroupChat_feature = By.xpath("//h1[normalize-space()='Group Chat']");
    By projectCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div");
    By DownloadExcel = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/a");
    By testing_fordelete = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[3]/div/div/div[1]/div[2]/div/p");
    By DeleteButton_popup = By.xpath("/html/body/div[5]/div/div/div[3]/button/div");
    By IndriMessage_select = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div/p");

    //Title
    By Bold_font = By.xpath("//*[@id=\"bold-2\"]");
    By Italic_font = By.xpath("//*[@id=\"italic-2\"]");
    By Underline_font = By.xpath("//*[@id=\"underline-2\"]");
    By StrikeThrough_typographical = By.xpath("//*[@id=\"strikeThrough-2\"]");
    By Orderedlist = By.xpath("//*[@id=\"formatOLSimple-2\"]");
    By Emoticon = By.xpath("//button[@id='emoticons-2']//*[name()='svg']");
    By Emoji_image = By.xpath("/html/body/div[5]/div[3]/span[1]");
    By indri_messageFont = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p");

    //Unorderedlist
    By Unorderedlist = By.xpath("//*[@id=\"formatULOptions-2\"]");
    // Down Arrow
    By Unorderedlist_downarrow = By.id("formatULOptions-1");
    //Default
    By Default = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[1]/a");
    //Circle
    By Circle = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[2]/a");
    //Disc
    By Disc = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[3]/a");
    //Square
    By Square = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[4]/a");

    //BackgroundColor
    By BackgroundColor = By.id("backgroundColor-2");
    //Color Red
    By Color = By.xpath("//span[25]");
    By OK_button = By.xpath("//button[normalize-space()='OK']");
    By Delete_button = By.xpath("/html/body/div[5]/div[2]/span[28]");

    //Assert
    By MessageContent_testing = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p");
    By DeleteMessage_success = By.id("notistack-snackbar");
    By BoldItalicEct_message = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/strong");
    By Italic_message = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/em");
    By Underline_message = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/u");
    By StrikeThrough_message = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/s");
    By Emoji_message = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/span");

    /**
     * Method
     */

    public void EnterTypeMessageHere(String user) {
        driver.findElement(TypeMessageHere_input).sendKeys(user);
    }

    public void ClickAttachment_logo() {
        driver.findElement(Attachment_logo).click();
    }

    public void ClickSend_logo() { driver.findElement(Send_logo).click(); }

    public void ClickThisIsTest_Message() {
        driver.findElement(ThisIsTest_Message).click();
    }

    public void clickindra_message() {
        driver.findElement(indra_message).click();
    }

    public void uploadMcWord() { driver.findElement(By.xpath("//div[@class='CreateMessage_attachment__2Z8Rx']")).sendKeys("C:\\Users\\user\\Desktop\\sekolahqa\\tugas\\Big_Project\\Doc_Test\\test_word");}

    public void ClickDownArrow_logo() {
        driver.findElement(DownArrow_logo).click();
    }

    public void ClickDeleteMessage() { driver.findElement(DeleteMessage_button).click(); }

    public void clickGroupChat_feature() {
        driver.findElement(GroupChat_feature).click();
    }

    public void clickProjectCard(){
        driver.findElement(projectCard).click();
    }

    public void clickDownloadExcel() {
        driver.findElement((DownloadExcel)).click();
    }

    public void clicktesting_fordelete() {
        driver.findElement(testing_fordelete).click();
    }

    public void clickDeleteButton_popup() {
        driver.findElement(DeleteButton_popup).click();
    }

    public void swifeleft_IndriMessage_select() { driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p")).sendKeys(Keys.CONTROL + "a");}

    //Assert
    public String AssertMessageContent_testing() { return driver.findElement(MessageContent_testing).getText(); }

    public String PopupDeleteMessage_success() { return driver.findElement(DeleteMessage_success).getText(); }

    public String AssertBoldItalicEct_message() { return driver.findElement(BoldItalicEct_message).getText(); }

    public String AssertItalic_message() { return driver.findElement(Italic_message).getText(); }

    public String AssertUnderline_message() { return driver.findElement(Underline_message).getText(); }

    public String AssertStrikeThrough_message() { return driver.findElement(StrikeThrough_message).getText(); }

    public String AssertEmoji_message() { return driver.findElement(Emoji_message).getText(); }


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

    public void clickEmoticon() {
        driver.findElement(Emoticon).click();
    }

    public void clickEmojiImage() {
        driver.findElement(Emoji_image).click();
    }

    public void Indri_messageFont() {
        driver.findElement(indri_messageFont).click();
    }

    ///Unorderedlist

    public void clickUnorderedlist() {
        driver.findElement(Unorderedlist).click();
    }

    public void clickUnorderedlist_downarrow() {
        driver.findElement(Unorderedlist_downarrow).click();
    }

    public void clickDefault() {
        driver.findElement(Default).click();
    }

    public void clickCircle() {
        driver.findElement(Circle).click();
    }

    public void clickDisc() {
        driver.findElement(Disc).click();
    }

    public void clickSquare() {
        driver.findElement(Square).click();
    }

    //BackgroundColor

    public void clickBackgroundColor() {
        driver.findElement(BackgroundColor).click();
    }

    public void clickColor() {
        driver.findElement(Color).click();
    }

    public void clickOK_button() {
        driver.findElement(OK_button).click();
    }

    public void clickDelete_button() {
        driver.findElement(Delete_button).click();
    }
}
