package BPB1.Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static BPB1.Basic.Basic.driver;

public class Blast {
    /**
     * Blasts List
     */
    By createBlastBarBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[3]/div/div[2]/p");
    By blastsLabel = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/h1");
    By postContainer = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/div[1]/a/div");
    By threeDotsIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div/svg");
    By editIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/svg");
    By archiveIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/svg");
    /**
     * Cheers
     */
    By cheersIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div");
    By cheersField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[2]/form/input");
    By cheersEmoteIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[3]/svg[1]");
    By cheersCheck = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[3]/svg[2]");
    By cheersCancel = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[3]/svg[3]");
    /**
     * Comment Section
     */
    By addNewCommentField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div/input");
    By commentField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/span");
    By postButton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[2]/button[2]/div/h1");
    /**
     * Create Blast
     */
    By createBlastLabel = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/h1");
    By postTitleField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div");
    By postStoryField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div");
    /**
     * Text Formatting
     */
    By boldIcon = By.xpath("//*[@id=\"bold-8\"]/svg");
    By italicIcon = By.xpath("//*[@id=\"italic-8\"]/svg");
    By strikethroughIcon = By.xpath("//*[@id=\"strikeThrough-8\"]/svg");
    By bgColorIcon = By.xpath("//*[@id=\"backgroundColor-8\"]/svg");
    By greenBgColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[10]/div[1]/span[1]");
    By trashBgColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[10]/div[1]/span[28]");
    By fontSizeDrpDwn = By.xpath("//*[@id=\"fontSize-8\"]/svg");
    By fontSizePts = By.xpath("//*[@id=\"dropdown-menu-fontSize-8\"]/div/div/ul/li[11]/a");
    By moreTextIcon = By.xpath("//*[@id=\"moreText-8\"]/svg");
    By underlineIcon = By.xpath("//*[@id=\"underline-8\"]/svg");
    By subscriptIcon = By.xpath("//*[@id=\"subscript-8\"]");
    By superscriptIcon = By.xpath("//*[@id=\"dropdown-menu-fontSize-8\"]/div/div/ul/li[11]/a");
    By fontFamilyDrpDwn = By.xpath("//*[@id=\"fontFamily-1\"]");
    By tnrFontStyle = By.xpath("//*[@id=\"dropdown-menu-fontFamily-8\"]/div/div/ul/li[5]/a");
    By textColorIcon = By.xpath("//*[@id=\"textColor-8\"]/svg");
    By blueTextColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[11]/div[1]/span[4]");
    By trashTextColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[9]/div[1]/span[28]/svg");
    By clearFormatting = By.xpath("//*[@id=\"clearFormatting-1\"]/svg");
    By orderedListIcon = By.xpath("//*[@id=\"formatOLSimple-1\"]/svg");
    By unorderedListIcon = By.xpath("//*[@id=\"formatUL-1\"]/svg");
    By unorderedListDrpDwn = By.xpath("//*[@id=\"formatULOptions-1\"]");
    By discUndList = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-5\"]/div/div/ul/li[3]/a");
    By moreParagraphIcon = By.xpath("//*[@id=\"moreParagraph-1\"]/svg");
    By alignCenter = By.xpath("//*[@id=\"alignCenter-1\"]/svg");
    By increaseInd = By.xpath("//*[@id=\"indent-3\"]/svg");
    By decreaseInd = By.xpath("//*[@id=\"outdent-3\"]/svg");
    By quoteDrpDwn = By.xpath("//*[@id=\"quote-3\"]");
    By increaseQuo = By.xpath("//*[@id=\"dropdown-menu-quote-3\"]/div/div/ul/li[1]/a");
    By decreaseQuo = By.xpath("//*[@id=\"dropdown-menu-quote-3\"]/div/div/ul/li[2]/a");
    By storyEmoticon = By.xpath("//*[@id=\"emoticons-3\"]/svg");
    By smileEmoticon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[10]/div[2]/span[2]");
    /**
     * Insert Files
     */
    By insertFilesIcon = By.xpath("//*[@id=\"insertFiles-3\"]/svg");
    By uploadFileBox = By.xpath("//*[@id=\"fr-files-upload-layer-3\"]/div/div[2]/input");
    By fileCheckBox = By.xpath("//*[@id=\"fr-link-target-3\"]");
    By insertIcon = By.xpath("//*[@id=\"fr-file-insert-button-0\"]/svg");
    By viewIcon = By.xpath("//*[@id=\"fr-file-view-button-0\"]/svg");
    By deleteIcon = By.xpath("//*[@id=\"fr-file-delete-button-0\"]/svg");
    By byUrl = By.xpath("//*[@id=\"filesByURL-3\"]/svg");
    By byUrlField = By.xpath("//*[@id=\"fr-files-by-url-layer-text-3\"]");
    By addUrlButton = By.xpath("//*[@id=\"fr-files-by-url-layer-3\"]/div[2]/button");
    By embedCode = By.xpath("//*[@id=\"filesEmbed-3\"]/svg");
    By embedCodeField = By.xpath("//*[@id=\"fr-files-embed-layer-text3\"]");
    By insertEmbedButton = By.xpath("//*[@id=\"fr-files-embed-layer-3\"]/div[2]/button");
    /**
     * Insert Link
     */
    By insertLinkIcon = By.xpath("//*[@id=\"insertLink-3\"]/svg");
    By insertUrlField = By.xpath("//*[@id=\"fr-link-insert-layer-url-3\"]");
    By insertUrlText = By.xpath("//*[@id=\"fr-link-insert-layer-text-3\"]");
    By insertUrlButton = By.xpath("//*[@id=\"fr-link-insert-layer-3\"]/div[3]/button");
    /**
     * More Rich
     */
    By moreRichIcon = By.xpath("//*[@id=\"moreRich-3\"]/svg");
    By insertImage = By.xpath("//*[@id=\"insertImage-3\"]/svg");
    By dropImageBox = By.xpath("//*[@id=\"fr-image-upload-layer-3\"]/div");
    By imageByUrl = By.xpath("//*[@id=\"imageByURL-3\"]");
    By insertVideo = By.xpath("//*[@id=\"insertVideo-3\"]/svg");
    By imageByUrlField = By.xpath("//*[@id=\"fr-image-by-url-layer-text-3\"]");
    By insImageUrlButton = By.xpath("//*[@id=\"fr-image-by-url-layer-3\"]/div[2]/button");
    By videoUrlField = By.xpath("//*[@id=\"fr-video-by-url-layer-text-3\"]");
    By autoplayCheckbox = By.xpath("//*[@id=\"videoPluginAutoplay\"]");
    By insertVideoButton = By.xpath("//*[@id=\"fr-video-by-url-layer-3\"]/div[2]/button");
    By insertTable = By.xpath("//*[@id=\"insertTable-3\"]/svg");
    By tableFormat = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[16]/div[2]/div[2]/span[3]");
    By speCharacters = By.xpath("//*[@id=\"specialCharacters-3\"]/svg");
    By copyrightSign = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[17]/div[2]/span[9]");
    By horizontalLine = By.xpath("//*[@id=\"insertHR-3\"]/svg");
    /**
     * Undo & Redo
     */
    By undoIcon = By.xpath("//*[@id=\"undo-3\"]/svg");
    By redoIcon = By.xpath("//*[@id=\"redo-3\"]/svg");
    /**
     * Blast Auto Complete
     */
    By autoComDrpDwn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[1]/div/div/div");
    By dateManually = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    By autoComInDrpDwn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/div/div");
    By threeDays = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");

    public Blast() {
        PageFactory.initElements(driver, "/62e394ac341d713a982e2243/blasts/62e394ac341d713a982e224a");
    }
    /**
     * Blasts List Methods
     */
    public void clickCreateBlastBarBtn() {
        driver.findElement(createBlastBarBtn).click();
    }
    public void displayBlastsLabel() {
        driver.findElement(blastsLabel).isDisplayed();
    }
    public void clickPostContainer() {
        driver.findElement(postContainer).click();
    }
    public void clickArchiveIcon() {
        driver.findElement(archiveIcon).click();
    }
    public void clickEditIcon() {
        driver.findElement(editIcon).click();
    }
    /**
     * Cheers
     */
    public void clickCheersIcon() {
        driver.findElement(cheersIcon).click();
    }
    public void enterCheersField() {
        driver.findElement(cheersField).sendKeys();
    }
    public void clickCheersEmoteIcon() {
        driver.findElement(cheersEmoteIcon).click();
    }
    public void clickCheersCheck() {
        driver.findElement(cheersCheck).click();
    }
    public void clickCheersCancel() {
        driver.findElement(cheersCancel).click();
    }
    /**
     * Comment Section
     */
    public void clickAddNewCommentField() {
        driver.findElement(addNewCommentField).click();
    }
    public void enterCommentField() {
        driver.findElement(commentField).sendKeys();
    }
    public void clickPostButton() {
        driver.findElement(postButton).click();
    }
    /**
     * Create Blast
     */
    public void displayCreateBlastLabel() {
        driver.findElement(createBlastLabel).isDisplayed();
    }
    public void enterPostTitleField() {
        driver.findElement(postTitleField).sendKeys();
    }
    public void enterPostStoryField() {
        driver.findElement(postStoryField).sendKeys();
    }
    /**
     * Text Formatting
     */
    public void clickBoldIcon() {
        driver.findElement(boldIcon).click();
    }
    public void clickItalicIcon() {
        driver.findElement(italicIcon).click();
    }
    public void clickStrikethroughIcon() {
        driver.findElement(strikethroughIcon).click();
    }
    public void clickBgColorIcon() {
        driver.findElement(bgColorIcon).click();
    }
    public void clickGreenBgColor() {
        driver.findElement(greenBgColor).click();
    }
    public void clickTrashBgColor() {
        driver.findElement(trashBgColor).click();
    }
    public void clickFontSizeDrpDwn() {
        driver.findElement(fontSizeDrpDwn).click();
    }
    public void selectFontSizePts() {
        driver.findElement(fontSizePts).click();
    }
    public void clickMoreTextIcon() {
        driver.findElement(moreTextIcon).click();
    }
    public void clickUnderlineIcon() {
        driver.findElement(underlineIcon).click();
    }
    public void clickSubscriptIcon() {
        driver.findElement(subscriptIcon).click();
    }
    public void clickSuperscriptIcon() {
        driver.findElement(superscriptIcon).click();
    }
    public void clickFontFamilyDrpDwn() {
        driver.findElement(fontFamilyDrpDwn).click();
    }
    public void selectTnrFontStyle() {
        driver.findElement(tnrFontStyle).click();
    }
    public void clickTextColorIcon() {
        driver.findElement(textColorIcon).click();
    }
    public void clickBlueTextColor() {
        driver.findElement(blueTextColor).click();
    }
    public void clickTrashTextColor() {
        driver.findElement(trashTextColor).click();
    }
    public void clickClearFormatting() {
        driver.findElement(clearFormatting).click();
    }
    public void clickOrderedListIcon() {
        driver.findElement(orderedListIcon).click();
    }
    public void clickUnorderedListIcon() {
        driver.findElement(unorderedListIcon).click();
    }
    public void clickUnorderedListDrpDwn() {
        driver.findElement(unorderedListDrpDwn).click();
    }
}
