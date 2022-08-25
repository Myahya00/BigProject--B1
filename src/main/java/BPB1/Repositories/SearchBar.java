package BPB1.Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static BPB1.Basic.Basic.driver;

public class SearchBar {
    //Home Page
    By searchbar = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/input");

    //Search Bar
    By featureblast = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a/div/div[2]/div");
    By featuregroupchat = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a/div/div[1]/div[2]/h1");
    By featureschedule = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a/div/div[1]/div[2]/h1/span/mark");
    By featureboard = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a/div/div[1]/div[2]/h1/span/mark");
    By featurecheckin = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a/div/div[1]/div[2]/h1/span/mark[1]");
    By featuredocsandfiles = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a/div/div[1]/div[2]/h1/span/mark");

    //Validasi SearhBar
    By validasisearhbar = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/h1");
    By validasisearhbar2= By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div[1]/h1");
    By validasisearhbar3 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/p");

    public SearchBar() {PageFactory.initElements(driver, "/62e394ac341d713a982e2243/blasts/62e394ac341d713a982e224a");}
    //Company Page
    public void clicksearchbar(){driver.findElement(searchbar).click();}
    public void inputsearchbarblast(){driver.findElement(searchbar).sendKeys("Blast");}
    public void inputsearchbargroupchat(){driver.findElement(searchbar).sendKeys("group chat");}
    public void inputsearchbarschedule(){driver.findElement(searchbar).sendKeys("schedule");}
    public void inputsearchbarboard(){driver.findElement(searchbar).sendKeys("board");}
    public void inputsearchbarcheckin(){driver.findElement(searchbar).sendKeys("check in");}
    public void inputsearchbardocsandfiles(){driver.findElement(searchbar).sendKeys("docs & files");}
    public void inputpostblast(){driver.findElement(searchbar).sendKeys("testing2");}
    public void inputcomments(){driver.findElement(searchbar).sendKeys("edit comments");}
    public void inputreplycomments(){driver.findElement(searchbar).sendKeys("edit reply comments");}

    //Search Bar
    public void clickfeatureblast(){driver.findElement(featureblast).click();}
    public void clickfeaturegroupchat(){driver.findElement(featuregroupchat).click();}
    public void clickfeatureschedule(){driver.findElement(featureschedule).click();}
    public void clickfeatureboard(){driver.findElement(featureboard).click();}
    public void clickfeaturecheckin(){driver.findElement(featurecheckin).click();}
    public void clickfeaturedocsandfiles(){driver.findElement(featuredocsandfiles).click();}

    //Validasi Searh Bar
    public String validasisearchbar() {return driver.findElement(validasisearhbar).getText();}
    public String validasisearchbar2() {return driver.findElement(validasisearhbar2).getText();}
    public String validasisearchbar3() {return driver.findElement(validasisearhbar3).getText();}
}
