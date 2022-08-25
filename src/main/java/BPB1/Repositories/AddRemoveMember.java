package BPB1.Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static BPB1.Basic.Basic.driver;

public class AddRemoveMember {

    public AddRemoveMember(){
        PageFactory.initElements(driver, "/companies/61eba2c85080f47b25ddc8f8");
    }

    //Page Factory
    /** Locator: Add Member in company */
    By showMemberBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div");
    By inviteBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/button");
    By addEmailTextArea = By.name("emails");
    By submitNewEmailBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[4]/button");
    By messageInvite= By.className("SnackbarItem-message");


    /** Locator: Add Member in project */
    By projectCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div");
    By addProjectMemberIcon= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[6]");
    By tickMember= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[65]");
    By applyMemberBtn= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button");
    By messageToggle= By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div");

    /** Locator: Update Profile */
    By profileIcon= By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div/span");
    By profileEditIcon= By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[5]/div/div[1]/a/div/div/div/span");
    By editButton= By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div[2]/button");
    By statusField= By.name("status");
    By bioField= By.name("bio");
    By saveBtn= By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div/div[2]/div[2]/div/button[1]");
    By cancelBtn= By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div/div[2]/div[2]/div/button[2]");
    By checkStatus= By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div[1]/div[2]/p[1]");


    // Initialize Page Objects
    /** Method: Add new member in company */
    public void clickShowMemberBtn(){
        driver.findElement(showMemberBtn).click();
    }
    public void clickInviteBtn(){
        driver.findElement(inviteBtn).click();
    }
    public void enterAddEmailTextArea(String email){
        driver.findElement(addEmailTextArea ).sendKeys(email);
    }
    public void clickSubmitNewEmailBtn(){
        driver.findElement(submitNewEmailBtn).click();
    }
    public String validateInvitation() {
        return driver.findElement(messageInvite).getText();
    }


    /** Method: Add & remove member in Project */
    public void clickProjectCard(){
        driver.findElement(projectCard).click();
    }
    public void clickAddProjectMemberIcon(){
        driver.findElement(addProjectMemberIcon).click();
    }
    public void clickTickMember(){
        driver.findElement(tickMember).click();
    }
    public void clickApplyMemberBtn(){
        driver.findElement(applyMemberBtn).click();
    }
    public String clickMessageToggle(){
        return driver.findElement(messageToggle).getText();
    }


    /** Method: Update Profile*/

    public void clickProfileIcon(){
        driver.findElement(profileIcon).click();
    }
    public void clickProfileEditIcon(){
        driver.findElement(profileEditIcon).click();
    }
    public void clickEditButton(){
        driver.findElement(editButton).click();
    }
    public void enterStatusField(String status){
        driver.findElement(statusField).sendKeys(status);
    }
    public void clearStatusField(){
        driver.findElement(statusField).clear();
    }
    public void enterBioField(String bio){
        driver.findElement(bioField).sendKeys(bio);
    }
    public void clearBioField(){
        driver.findElement(bioField).clear();
    }
    public void clickSaveBtn(){
        driver.findElement(saveBtn).click();
    }
    public void clickCancelBtn(){
        driver.findElement(cancelBtn).click();
    }
    public String validateCheckStatus() {
        return driver.findElement(checkStatus).getText();
    }



}