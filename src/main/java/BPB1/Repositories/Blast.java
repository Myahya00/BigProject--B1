package BPB1.Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static BPB1.Basic.Basic.driver;

public class Blast {
    //Home Page
    By companybutton = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div");

    //Dashboard Page
    By blastbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]");
    //Blast Page
    By createblastbutton = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[3]/div/div[2]/p");
    By postblast1button = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/div[1]/a/div");
    By postblast2button = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/div[2]/a/div");

    //Post Blast Page
    By settingpostbutton = By.className("More_container__2VGML");
    By editpostbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div[1]");
    By archivepostbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/p");
    By archivebutton = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[2]/button");
    By commentsbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div/input");
    By inputcomments = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/div/p");
    By postcommentsbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[2]/button[2]");
    By cheersbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div");
    By inputcheers = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[2]/form/input");
    By checkcheersbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[3]");
    By givecheersbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[1]/div/div/div[2]");
    By deletegivecheersbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[1]/div/div/div[3]");

    //Edit Post Page
    By checkbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[2]/div/span/input");
    By savechangesbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[6]/button/div/h1");
    By emoticonseditcommentsbutton = By.xpath("//*[@id=\"emoticons-1\"]");
    By smileemoticonsbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div[1]/div[9]/div[2]/span[9]");
    By backgroundcolourbutton = By.xpath("//*[@id=\"backgroundColor-1\"]");
    By backgroundcolouryellowbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div[1]/div[9]/div[1]/span[15]");
    By boldtextbutton = By.xpath("//*[@id=\"bold-1\"]");
    By italictextbutton = By.xpath("//*[@id=\"italic-1\"]");
    By strikethroughtextbutton = By.xpath("//*[@id=\"strikeThrough-1\"]");
    By fontsizetextbutton = By.xpath("//*[@id=\"fontSize-1\"]");
    By fontsize18textbutton = By.xpath("//*[@id=\"dropdown-menu-fontSize-1\"]/div/div/ul/li[7]/a");
    By moretextbutton = By.xpath("//*[@id=\"moreText-1\"]");
    By fontfamilytextbutton = By.xpath("//*[@id=\"fontFamily-1\"]");
    By timenewsromantextbutton = By.xpath("//*[@id=\"dropdown-menu-fontFamily-1\"]/div/div/ul/li[5]/a");
    By clearformattingbutton = By.xpath("//*[@id=\"clearFormatting-1\"]");

    //Comments Page
    By settingcommentsbutton = By.xpath("//*[@id=\"comment_62f7ee9be45be782f5aaaca2\"]/div[2]/div[1]");
    By editcommentsbutton = By.xpath("//*[@id=\"comment_62f7ee9be45be782f5aaaca2\"]/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/p");
    By inputeditcomments = By.xpath("//*[@id=\"comment_62f7ee9be45be782f5aaaca2\"]/div[2]/div[3]/div/div[1]/div/div/div[3]/div/p");
    By posteditcommentsbutton = By.xpath("//*[@id=\"comment_62f7ee9be45be782f5aaaca2\"]/div[2]/div[3]/div/div[2]/button[2]/div/h1");
    By deletecommentsbutton = By.xpath("//*[@id=\"comment_62f523b3ede053ae1ff0217d\"]/div[2]/div[1]/div[2]/div/div/div[2]");
    By delete2commentsbutton = By.className("Main_container__3r1Cm");


    //Reply Comments Page
    By replycomementsbutton = By.xpath("//*[@id=\"comment_62f7ee9be45be782f5aaaca2\"]/div[2]/div[5]/div/a/div/p");
    By addnewreplybutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/div[2]/div/input");
    By inputreply = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/p");
    By postreplybutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/div[2]/div[2]/button[2]");
    By settingreplycommentsbutton = By.xpath("//*[@id=\"comment_62f7f0e6e45be782f5aab258\"]/div[2]/div[1]");
    By editreplycommentsbutton = By.xpath("//*[@id=\"comment_62f7f0e6e45be782f5aab258\"]/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/p");
    By inputeditreplycomments = By.xpath("//*[@id=\"comment_62f7f0e6e45be782f5aab258\"]/div[2]/div[3]/div/div[1]/div/div/div[3]/div/p");
    By posteditreplycommentsbutton = By.xpath("//*[@id=\"comment_62f7f0e6e45be782f5aab258\"]/div[2]/div[3]/div/div[2]/button[2]/div/h1");
    By deletereplycommentsbutton = By.xpath("//*[@id=\"comment_62f7b9aec6f91f8ad5dd46bc\"]/div[2]/div[1]/div[2]/div/div/div[2]");
    By deletereplybutton = By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[2]");

    //Create Blast Page
    By inputtittle = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/textarea");
    By inputstories = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div/p");
    By clickstories = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div[3]/div");
    By autocompletelistbox = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[1]/div/div/div");
    By inautocompletelistbox = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    By setautocompletelistbox = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/div/div");
    By setautocompletelistbox2 = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[2]/div[3]/div/div");
    By onedayfromtodaylistbox = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    By threedayfromtodaylistbox = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    By sevendayfromtodaylistbox = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]");
    By publishbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[6]/button/div/h1");
    By insertlinkbutton = By.id("insertLink-1");
    By inputurl = By.id("fr-link-insert-layer-url-1");
    By inputtexturl = By.id("fr-link-insert-layer-text-1");
    By inserturlbutton = By.xpath("//*[@id=\"fr-link-insert-layer-1\"]/div[3]/button");
    By privatebutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[5]/div[2]/label/span[1]/span[1]/input");
    By addbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div[2]/div/div[23]");
    By uncheckbutton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div[2]/div[2]/div/div/div[5]/div[2]");

    //Validasi Blast
    By messageQuestion = By.className("SnackbarItem-message");

    public Blast() {
        PageFactory.initElements(driver, "/62e394ac341d713a982e2243/blasts/62e394ac341d713a982e224a");
    }
    //Company Page
    public void clickcompanybutton(){driver.findElement(companybutton).click();}

    //Dashboard
    public void clickblastbutton() {
        driver.findElement(blastbutton).click();
    }

    //Blast Page
    public void clickcreateblastbutton() {driver.findElement(createblastbutton).click();}
    public void clickpostblast1button() {driver.findElement(postblast1button).click();}
    public void clickpostblast2button() {driver.findElement(postblast2button).click();}

    //Post Blast Page
    public void clicksettingpostbutton() {driver.findElement(settingpostbutton).click();}
    public void clickeditpostbutton() {driver.findElement(editpostbutton).click();}
    public void clickarchivepostbutton() {driver.findElement(archivepostbutton).click();}
    public void clickarchivebutton() {driver.findElement(archivebutton).click();}
    public void clickcommentsbutton() {driver.findElement(commentsbutton).click();}
    public void inputcomments() {driver.findElement(inputcomments).sendKeys("comments");}
    public void clickpostcommentsbutton() {driver.findElement(postcommentsbutton).click();}
    public void clickcheersbutton() {driver.findElement(cheersbutton).click();}
    public void inputcheers() {driver.findElement(inputcheers).sendKeys("cheers");}
    public void clickcheckcheersbutton() {driver.findElement(checkcheersbutton).click();}
    public void clickgivecheersbutton() {driver.findElement(givecheersbutton).click();}
    public void clickdeletegivecheersbutton() {driver.findElement(deletegivecheersbutton).click();}

    //Edit Post Page
    public void clickcheckbutton() {driver.findElement(checkbutton).click();}
    public void clicksavechangesbutton() {driver.findElement(savechangesbutton).click();}
    public void clickemoticonseditcommentsbutton() {driver.findElement(emoticonseditcommentsbutton).click();}
    public void clicksmileemoticonsbutton() {driver.findElement(smileemoticonsbutton).click();}
    public void clickbackgroundcolourbutton() {driver.findElement(backgroundcolourbutton).click();}
    public void clickbackgroundcolouryellowbutton() {driver.findElement(backgroundcolouryellowbutton).click();}
    public void clickboldtextbutton() {driver.findElement(boldtextbutton).click();}
    public void clickitalictextbutton() {driver.findElement(italictextbutton).click();}
    public void clickstrikethroughtextbutton() {driver.findElement(strikethroughtextbutton).click();}
    public void clickfontsizetextbutton() {driver.findElement(fontsizetextbutton).click();}
    public void clickfontsize18textbutton() {driver.findElement(fontsize18textbutton).click();}
    public void clickmoretextbutton() {driver.findElement(moretextbutton).click();}
    public void clickfontfamilytextbutton() {driver.findElement(fontfamilytextbutton).click();}
    public void clicktimenewsromantextbutton() {driver.findElement(timenewsromantextbutton).click();}
    public void clickclearformattingbutton() {driver.findElement(clearformattingbutton).click();}

    //Comments Post Page
    public void clicksettingcommentsbutton() {driver.findElement(settingcommentsbutton).click();}
    public void clickeditcommentsbutton() {driver.findElement(editcommentsbutton).click();}
    public void inputeditcomments() {driver.findElement(inputeditcomments).sendKeys("edit ");}
    public void clickposteditcommentsbutton() {driver.findElement(posteditcommentsbutton).click();}
    public void clickdeletecommentsbutton() {driver.findElement(deletecommentsbutton).click();}
    public void clickdelete2commentsbutton() {driver.findElement(delete2commentsbutton).click();}

    //Reply Comments Page
    public void clickreplycommentsbutton() {driver.findElement(replycomementsbutton).click();}
    public void clickaddnewreplybutton() {driver.findElement(addnewreplybutton).click();}
    public void inputreply() {driver.findElement(inputreply).sendKeys("reply comments");}
    public void clickpostreplybutton() {driver.findElement(postreplybutton).click();}
    public void clicksettingreplycommentsbutton() {driver.findElement(settingreplycommentsbutton).click();}
    public void clickeditreplycommentsbutton() {driver.findElement(editreplycommentsbutton).click();}
    public void inputeditreplycomments() {driver.findElement(inputeditreplycomments).sendKeys("edit ");}
    public void clickposteditreplycommentsbutton() {driver.findElement(posteditreplycommentsbutton).click();}
    public void clickdeletereplycommentsbutton() {driver.findElement(deletereplycommentsbutton).click();}
    public void clickdeletereplybutton() {driver.findElement(deletereplybutton).click();}

    //Create Blast Page
    public void inputtittle1() {driver.findElement(inputtittle).sendKeys("testing");}
    public void inputtittle2() {driver.findElement(inputtittle).sendKeys("upload link");}
    public void inputtittle3() {driver.findElement(inputtittle).sendKeys("testing2");}
    public void inputtittle4() {driver.findElement(inputtittle).sendKeys("testing4");}
    public void inputtittle5() {driver.findElement(inputtittle).sendKeys("");}
    public void inputstories() {driver.findElement(inputstories).sendKeys("story testing");}
    public void clickautocompmletelistbox() {driver.findElement(autocompletelistbox).click();}
    public void clickinautocompletelistbox() {driver.findElement(inautocompletelistbox).click();}
    public void clicksetautocompletelistbox() {driver.findElement(setautocompletelistbox).click();}
    public void clicksetautocompletelistbox2() {driver.findElement(setautocompletelistbox2).click();}
    public void clickonedayfromtodaylistbox() {driver.findElement(onedayfromtodaylistbox).click();}
    public void clickthreedayfromtodaylistbox() {driver.findElement(threedayfromtodaylistbox).click();}
    public void clicksevendayfromtodaylistbox() {driver.findElement(sevendayfromtodaylistbox).click();}
    public void clickpublisbutton() {driver.findElement(publishbutton).click();}
    public void clickinsertlinkbutton() {driver.findElement(insertlinkbutton).click();}
    public void inputurl() {driver.findElement(inputurl).sendKeys("https://staging.cicle.app/");}
    public void inputtexturl() {driver.findElement(inputtexturl).sendKeys("Big Project");}
    public void inserturlbutton() {driver.findElement(inserturlbutton).click();}
    public void clickprivatebutton() {driver.findElement(privatebutton).click();}
    public void clickaddbutton() {driver.findElement(addbutton).click();}
    public void clickuncheckbutton() {driver.findElement(uncheckbutton).click();}

    //Validasi Blast
    public String validateMessageQuestion() {return driver.findElement(messageQuestion).getText();}

    //Block Text
    public void clickstories() {driver.findElement(clickstories).click();}
    public void BlockEnteredText(){
        String story = "story testing";
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.HOME).build().perform();
        int length = story.substring(0, story.indexOf("g")).length();

        actions.keyDown(Keys.LEFT_SHIFT);
        for (int i = 0; i < length; i++){
            actions.sendKeys(Keys.ARROW_RIGHT);
        }
        actions.keyUp(Keys.LEFT_SHIFT);
        actions.build().perform();
    }
}
