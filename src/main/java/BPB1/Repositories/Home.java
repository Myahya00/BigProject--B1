package BPB1.Repositories;

import BPB1.Basic.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends Basic {

    By teamCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a[3]/div");


    // Actions
    public Home() {
        PageFactory.initElements(driver, "/companies");
    }

    public void clickteamCard() {
        driver.findElement(teamCard).click();
    }
}
