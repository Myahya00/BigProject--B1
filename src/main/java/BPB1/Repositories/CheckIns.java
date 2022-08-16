package BPB1.Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static BPB1.Basic.Basic.driver;

public class CheckIns {

    public CheckIns() {
        PageFactory.initElements(driver, "/companies/61eba2c85080f47b25ddc8f8");
    }

//Page Factory
    /** Locator: Add new checkIn message */
    By projectCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a[2]");
    By checkInCard = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/a/div");
    By createCheckInBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[3]/div");
    By questionField = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[1]/div[1]/input");

    /** Locator: Clock setting */
    By tueDayBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div/div/div[2]");
    By timeField = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[1]/div[3]/div/div");


    /** Locator: Fill checkIn message */
    By startCollectingBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[3]/button[1]");
    By privateSelect = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[2]/div[2]/label/span[1]");
    By notifiedBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[1]/div[4]/div/div[2]/div/div");
    By tickPersonNoti = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[1]/div[4]/div/div[2]/div[2]/div/div/div[5]/div[5]");

    /** Locator: Fill checkIn message */
    By checkInMessage = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div/div/a[8]");
    By archieveCheckInMessage = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div/div/a[1]");
    By menuBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div[1]/div[2]/div");
    By archieveBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div/div/div[2]");

    By editBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div/div/div[1]");
    By cancelCreateBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[3]/button[2]");
    By saveChangeBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div[3]/button[1]");
    By messageQuestion = By.className("SnackbarItem-message");

    By titleQuestion = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]");

    /** Locator: Comment in CheckIn page */

    By addCommentBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[3]");
    By commentField = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div[3]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/div");
    By postBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div[3]/div/div/div/div[1]/div[2]/div[2]/div[2]/button[2]");
    By cancelBtn = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div[3]/div/div/div/div[1]/div[2]/div[2]/div[2]/button[1]");
    By menuCommentIcon = By.xpath("//*[@id=\"comment_62f7c13573b7eefe3ea83f38\"]/div[2]/div[1]");
    By editCommentBtn = By.xpath("//*[@id=\"comment_62f7c13573b7eefe3ea83f38\"]/div[2]/div[1]/div[2]/div/div/div[1]");
    By editCommentField = By.xpath("//*[@id=\"comment_62f7c13573b7eefe3ea83f38\"]/div[2]/div[3]/div/div[1]/div/div/div[3]/div");

    By postCommentBtn = By.xpath("//*[@id=\"comment_62f7c13573b7eefe3ea83f38\"]/div[2]/div[3]/div/div[2]/button[2]");
    By cancelEditCommentBtn = By.xpath("//*[@id=\"comment_62f7c13573b7eefe3ea83f38\"]/div[2]/div[3]/div/div[2]/button[1]");

    /** Locator: Cheers in CheckIn page */
    By addCheersIcon = By.xpath("//*[@id=\"comment_62f7c13573b7eefe3ea83f38\"]/div[2]/div[4]/div/div/div");

    /** Locator: Reply comments */

    By replyBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[3]");

    By replyField = By.className("fr-wrapper show-placeholder");

    By replyPostBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/div[2]/div[2]/button[2]");

    By replyCancelPostBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/div[2]/div[2]/button[1]");



    // https://staging.cicle.app/check-login?userId=62f4d893f1a809958795558b&tempToken=1e8b2894d17ce64dcf5a3f9634a7a6c8a7e1ea98b5e9f61a5339c73e3dfbcf8a54d1f9cd0d0951f9d1bf8efd5679f7a98b87907faecc47221d0dd398aa909a5f
    // https://staging.cicle.app/check-login?userId=62f4d893f1a809958795558b&tempToken=0e16e1fe82d6d8fd1573f1a1160b1445d6f127e37ba5e8254ceb765aea661f39c3d009e11c8cd28041d986d3c308e21b6bc78d142b24e62bc97f7a791b30bb62

    // Initialize Page Objects

    /** Method: Add new checkIn message */
    public void clickProjectCard(){
        driver.findElement(projectCard).click();
    }
    public void clickCheckInCard(){
        driver.findElement(checkInCard).click();
    }
    public void clickCreateCheckInBtn(){
        driver.findElement(createCheckInBtn).click();
    }
    public void enterQuestionField(String question){
        driver.findElement(questionField).sendKeys(question);
    }
    public void clearQuestionField(){
        driver.findElement(questionField).clear();
    }

    /** Method: Clock setting */
    public void clickTueDayBtn(){
        driver.findElement(tueDayBtn).click();
    }
    public void clickTimeField(){
        driver.findElement(timeField).click();
    }

    public void enterTimeField(){
        String time ="10:00 AM";
        Actions actions = new Actions(driver);
        actions.sendKeys(time).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    /** Method: Fill checkIn message */
    public void clickStartCollectingBtn(){
        driver.findElement(startCollectingBtn).click();
    }
    public void clickPrivateSelect(){
        driver.findElement(privateSelect).click();
    }
    public void clickNotifiedBtn(){
        driver.findElement(notifiedBtn).click();
    }
    public void clickTickPersonNoti(){
        driver.findElement(tickPersonNoti).click();
    }
    public void clickArchieveCheckInMessage(){
        driver.findElement(archieveCheckInMessage).click();
    }
    public void clickArchieveBtn(){
        driver.findElement(archieveBtn).click();
    }


    /** Method: Edit checkIn message */
    public void clickCheckInMessage(){
        driver.findElement(checkInMessage).click();
    }
    public void clickMenuBtn(){
        driver.findElement(menuBtn).click();
    }
    public void clickEditBtn(){
        driver.findElement(editBtn).click();
    }
    public void clickCancelCreateBtn(){
        driver.findElement(cancelCreateBtn).click();
    }
    public void clickSaveChangeBtn(){
        driver.findElement(saveChangeBtn).click();
    }


    /** Method: Comment in CheckIn page */

    public void clickAddCommentBtn(){
        driver.findElement(addCommentBtn).click();
    }
    public void enterCommentField(String comment){
        driver.findElement(commentField).sendKeys(comment);
    }
    public void clickPostBtn(){
        driver.findElement(postBtn).click();
    }
    public void clickMenuCommentIcon(){
        driver.findElement(menuCommentIcon).click();
    }
    public void clickEditCommentBtn(){
        driver.findElement(editCommentBtn).click();
    }
    public void enterEditCommentField(String editcomment){
        driver.findElement(editCommentField).sendKeys(editcomment);
    }
    public void clickPostCommentBtn(){
        driver.findElement(postCommentBtn).click();
    }
    public void clickCancelEditCommentBtn(){
        driver.findElement(cancelEditCommentBtn).click();
    }
    public void clickCancelBtn(){
        driver.findElement(cancelBtn).click();
    }

    /** Method: Cheers in CheckIn page */
    public void clickAddCheersIcon(){
        driver.findElement(addCheersIcon).click();
    }

    public void enterInputCheers(){
        String story ="\u2764";
        Actions actions = new Actions(driver);
        actions.sendKeys(story).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
    }
    /** Method: Reply comments */
    public void clickAddReply(){
        WebElement addReply = driver.findElement(By.xpath("//*[@id=\"comment_62f7c13573b7eefe3ea83f38\"]/div[2]/div[5]/div/a/div"));
        Actions actions = new Actions(driver);
        actions.click(addReply).build().perform();
    }
    public void clickReplyBtn(){
        driver.findElement(replyBtn).click();
    }
    public void clickReplyField(){
        driver.findElement(replyField).click();
    }
    public void enterReplyField(){
        String reply ="Good";
        Actions actions = new Actions(driver);
        actions.sendKeys(reply + Keys.ENTER).build().perform();
    }

    public void clickReplyPostBtn(){
        driver.findElement(replyPostBtn).click();
    }
    public void clickReplyCancelPostBtn(){
        driver.findElement(replyCancelPostBtn).click();
    }

    /** Method: validate CheckIn page */
    public String validateMessageQuestion() {
        return driver.findElement(messageQuestion).getText();
    }
    public String validateDashboard() {
        return driver.getTitle();
    }
    public String validateTitleQuestion() {
        return driver.findElement(titleQuestion).getText();
    }


}