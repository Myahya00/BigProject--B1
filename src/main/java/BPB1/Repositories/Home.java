package BPB1.Repositories;

import BPB1.Basic.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Home extends Basic {
    By teamCompany = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div");
    By navbarDropdown = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/svg");
    By BoardDropdown = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/a[3]/div/p");


    public Home() {
        PageFactory.initElements(driver, "/companies");
    }
    public void clickTeamCard() {
        driver.findElement(teamCompany).click();
    }
    public void clickNavbarDrpDwnIcon() {
        driver.findElement(navbarDropdown).click();
    }
    public void selectBoardDrpDwn() {
        driver.findElement(BoardDropdown).click();
    }
}
