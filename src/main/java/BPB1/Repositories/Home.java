package BPB1.Repositories;

import BPB1.Basic.Basic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends Basic {
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/p")
    WebElement company;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[4]/a/div/div[1]")
    WebElement teamCard;
    @FindBy(name = "//*[@id=\"root\"]/div[1]/div[2]/div[4]/div/span")
    WebElement profileIcon;
    @FindBy(name = "//*[@id=\"root\"]/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/div/div/svg")
    WebElement privateChatIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/input")
    WebElement searchBarField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/svg")
    WebElement navbarDrpDwnIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/a[2]/div/p")
    WebElement blastDrpDwn;

    // Actions
    public Home() {
        PageFactory.initElements(driver, this);
    }

    public Home clickTeamCard() {
        teamCard.click();
        return new Home();
    }
    public Home clickProfileIcon() {
        profileIcon.click();
        return new Home();
    }
    public Home clickPvtChatIcon() {
        privateChatIcon.click();
        return new Home();
    }
    public Home enterSearchBarFld() {
        searchBarField.sendKeys();
        return new Home();
    }
    public Home clickNavbarDrpDwnIcon() {
        navbarDrpDwnIcon.click();
        return new Home();
    }
    public Home selectBlastDrpDwn() {
        blastDrpDwn.click();
        return new Home();
    }
}
