package BPB1.Repositories;
import BPB1.Basic.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static BPB1.Basic.Basic.driver;
public class Board {

    /**
     * Locator
     */
    //Home
    By teamCompany = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a[1]");
    By BoardCard = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[1]/a/div");



    //Board
    By AddListMenu = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[5]/button/div");
    By AddListInputName = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[5]/div/div/form/div[1]/input");
    By AddListButt = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[5]/div/div/form/div[2]/div/button");
    By AddCardMenu= By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]");
    By AddCardInputName = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/div[1]/form/input");
    By AddCardButt = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/div[3]/button/div");
    By CBPrivateCard = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/div[2]/span/span[1]/input\n");
    By filterMenu = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[1]");
    By searchFilter = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/form/input");
    By closeFilter = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/svg");
    By clearFilter = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[9]/div/div");
    By archiveItemsMenu = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]");
    By enterArchiveName = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/form/input");
    By restoreBut = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div");
    By restoreButPri = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div");
    By editCardDisini = By.id("editCardMenu");
    By commentMenu = By.xpath("//*[@id=\"editCardMenuButton\"]/div[2]");
    By inputComment = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]");
    By inputComment2 = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[1]");
    By postButt = By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/button[2]");
    By changeNameMenu = By.id("editCardMenuButton__Name__text");
    By inputChangeName = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/form/input[1]");
    By saveNameChangeButt = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/button/div");

    //In card
    By editCardAyo = By.xpath("//*[@id=\"editCardMenu\"]");
    By cardPrivateTest = By.xpath("//*[@id=\"listcard_content-3\"]/div[1]/div/div/a");
    By cardTesttt = By.xpath("//*[@id=\"listcard_content-0\"]/div[2]/div/div/a");
    By cardDisini = By.xpath("//*[@id=\"listcard_content-0\"]/div[3]/div/div/a");
    By cardTesting = By.xpath("//*[@id=\"listcard_content-2\"]/div[1]/div/div/a");
    By cardCoba = By.xpath("//*[@id=\"listcard_content-2\"]/div[1]/div/div/a");
    By AddMemberMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/button/div");
    By MemberIndra = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/div/div[4]/div[6]");
    By ApplyMemberButt = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/div/div[5]/button");
    By AddLabelsMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/button/div");
    By InputSearchLabels = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/form/input");
    By SetLabelsMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/div");
    By InputNameLabels = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/form/input");
    By redColour = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/div[36]");
    By CreateLabelsBut = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[6]/button/div");
    By lowLabel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/div[2]/div/div");
    By applyLabelsBut = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[6]/button");
    By editLabels = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/div[1]/svg/path");
    By deleteLabelsButt = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[6]/button[2]");
    By DueDateMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[3]/button");
    By SetDueDate = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[3]/div/div[3]/div[1]/div/div/div/button");
    By valueDate = By.xpath("/html/body/div[25]/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div[3]/div[6]/button");
    By SaveDueDateBut = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[3]/div/div[4]/button[1]");
    By editDue = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[3]/div");
    By RemoveDueDateBut = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[3]/div[2]/div[4]/button[2]");
    By MoveMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/button");
    By MoveListDD = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[1]");
    By DDMoveBacklog = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
    By DDMoveDesign = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div[2]");
    By DDMoveTodo = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div[3]");
    By DDMoveDoing = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div[4]");
    By MovePositionDD = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/a");
    By DDPosition1 = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/div[1]");
    By MoveButt = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[4]/button/div");
    By ChangeToPrivateMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[2]/div/button/div");
    By ChangeToPublicMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[2]/div/button/div");
    By archiveMenu = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[3]/div/button/div");
    By editComment = By.xpath("//*[@id=\"comment_62f8f783358a2874252705a3\"]/div[2]/div[1]");
    By deleteComment = By.xpath("//*[@id=\"comment_62f8f783358a2874252705a3\"]/div[2]/div[1]/div[2]/div/div/div[2]");
    By deleteButt = By.xpath("/html/body/div[13]/div[3]/div/div/div[2]/div[2]/button");

    //verify
    By verifyBoard = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/div/nav/ol/li[5]/div/div/span");
    By vrfHeaderList = By.className("ListContainer_headerSection__title__text__36H_r");
    By vrfHeaderCard = By.className("OverlayButton_box__2jFLd");
    By noticeSuccess = By.id("notistack-snackbar");
    By vrfArchive = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div");
    By vrfArchivePrivate = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[1]");



    /**
     * Method
     * parameter digunakan untuk memasukan data contoh (String user) yang di ambil hanya variable karna variablenya menyimpan value
     */
    public Board() {
        PageFactory.initElements(driver, "/companies/61eba2c85080f47b25ddc8f8");
    }

    //Home
    public void clickTeamCompany() {
        driver.findElement(teamCompany).click();
    }
    public void selectCardBoard() {
        driver.findElement(BoardCard).click();
    }

    //Board
    public void clickAddListMenu() {
        driver.findElement(AddListMenu).click();
    }
    public void enterNameList(String text) {
        driver.findElement(AddListInputName).sendKeys(text);
    }
    public void clickAddListButton() {
        driver.findElement(AddListButt).click();
    }
    public void clickCardMenu() {
        driver.findElement(AddCardMenu).click();
    }
    public void enterNameCard(String text) {
        driver.findElement(AddCardInputName).sendKeys(text);
    }
    public void clickCardButton() {
        driver.findElement(AddCardButt).click();
    }
    public void selectCheckBoxPrivate() {
        driver.findElement(CBPrivateCard).click();
    }

    public void clickFilterMenu() {
        driver.findElement(filterMenu).click();
    }
    public void enterFilterName(String keys) {
        driver.findElement(searchFilter).sendKeys(keys);
    }
    public void clickCloseFilter() {
        driver.findElement(closeFilter).click();
    }
    public void clickClearFilter() {
        driver.findElement(clearFilter).click();
    }
    public void clickArchiveItems() {
        driver.findElement(archiveItemsMenu).click();
    }
    public void enterArchiveName(String name) {
        driver.findElement(enterArchiveName).sendKeys(name);
    }
    public void clickRestore() {
        driver.findElement(restoreBut).click();
    }
    public void clickRestorPri() {
        driver.findElement(restoreButPri).click();
    }
    public void clickEditCardDisini() {
        driver.findElement(editCardDisini).click();
    }
    public void clickCommentMenu() {
        driver.findElement(commentMenu).click();
    }
    public void selectTextArea(String comment) {
        driver.findElement(inputComment).sendKeys();
    }
    public void inputComment(String comment) {
        driver.findElement(inputComment2).sendKeys();
    }
    public void clickCommentButton() {
        driver.findElement(postButt).click();
    }
    public void clickChangeNameMenu() {
        driver.findElement(changeNameMenu).click();
    }
    public void clareName() {
        driver.findElement(inputChangeName).clear();
    }
    public void inputChangeName(String name) {
        driver.findElement(inputChangeName).sendKeys(name);
    }
    public void clickSaveName() {
        driver.findElement(saveNameChangeButt).click();
    }



    //In Card\
    public void selectEditCardAyo() {
        driver.findElement(editCardAyo).click();
    }
    public void selectPrivateTest() {
        driver.findElement(cardPrivateTest).click();
    }
    public void selectCardTestt() {
        driver.findElement(cardTesttt).click();
    }
    public void selectCardDisini() {
        driver.findElement(cardDisini).click();
    }
    public void selectCardTesting() {
        driver.findElement(cardTesting).click();
    }
    public void selectCardCoba() {
        driver.findElement(cardCoba).click();
    }
    public void clickAddMemberMenu() {
        driver.findElement(AddMemberMenu).click();
    }
    public void selectMember() {
        driver.findElement(MemberIndra).click();
    }
    public void clickAddMemberButt() {
        driver.findElement(ApplyMemberButt).click();
    }
    public void clickAddLabelsMenu() {
        driver.findElement(AddLabelsMenu).click();
    }
    public void enterSearchLabels(String searchvalue) {
        driver.findElement(InputSearchLabels).sendKeys(searchvalue);
    }
    public void clickSetLabelsMenu() {
        driver.findElement(SetLabelsMenu).click();
    }
    public void inputNameLabels(String text) {
        driver.findElement(InputNameLabels).sendKeys(text);
    }
    public void clickRedColour() {
        driver.findElement(redColour).click();
    }
    public void clickCreateLabelsButt() {
        driver.findElement(CreateLabelsBut).click();
    }
    public void clickLowLabels() {
        driver.findElement(lowLabel).click();
    }
    public void clickApplyLabel() {
        driver.findElement(applyLabelsBut).click();
    }
    public void clickEditLabel() {
        driver.findElement(editLabels).click();
    }
    public void clickDeleteLabelsButton() {
        driver.findElement(deleteLabelsButt).click();
    }
    public void clickDueDateMenu() {
        driver.findElement(DueDateMenu).click();
    }
    public void editDate() {
        driver.findElement(SetDueDate).click();
    }
    public void selectDue() {
        Select oSelect = new Select(driver.findElement(By.className("MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-ub1r1")));
        oSelect.selectByValue("20");
    }

    public void clickSaveDueDate() {
        driver.findElement(SaveDueDateBut).click();
    }
    public void clickDueDate() {
        driver.findElement(editDue).click();
    }
    public void clickRemoveDueDateButt() {
        driver.findElement(RemoveDueDateBut).click();
    }
    public void clickMenuMove() {
        driver.findElement(MoveMenu).click();
    }
    public void clickMoveList() {
        driver.findElement(MoveListDD).click();
    }
    public void selectMoveListBacklog() {
        driver.findElement(DDMoveBacklog).click();
    }
    public void selectMoveListDesign() {
        driver.findElement(DDMoveDesign).click();
    }
    public void selectMoveListTodo() {
        driver.findElement(DDMoveTodo).click();
    }
    public void selectMoveListDoing() {
        driver.findElement(DDMoveDoing).click();
    }
    public void clickMovePosition() {
        driver.findElement(MovePositionDD).click();
    }
    public void selectPosition1() {
        driver.findElement(DDPosition1).click();
    }

    public void clickMoveButt() {
        driver.findElement(MoveButt).click();
    }
    public void clickPrivateMenu() {
        driver.findElement(ChangeToPrivateMenu).click();
    }
    public void clickPublicMenu() {
        driver.findElement(ChangeToPublicMenu).click();
    }
    public void clickArchiveMenu() {
        driver.findElement(archiveMenu).click();
    }
    public void clickEditComment() {
        driver.findElement(editComment).click();
    }
    public void clickDeleteMenu() {
        driver.findElement(deleteComment).click();
    }
    public void clickDeleteButton() {
        driver.findElement(deleteButt).click();
    }





    //Verify
    public void displayBoardTitle() {
        driver.findElement(verifyBoard).isDisplayed();
    }
    public void displayNamelist() {
        driver.findElement(vrfHeaderList).isDisplayed();
    }
    public void displayNameCard() {
        driver.findElement(vrfHeaderCard).isDisplayed();
    }
    public void noticeSuccessIsDisplay() {
        driver.findElement(noticeSuccess).isDisplayed();
    }
    public void displayNameItems() {
        driver.findElement(vrfArchive).isDisplayed();
    }
    public void displayNamePrivateItems() {
        driver.findElement(vrfArchivePrivate).isDisplayed();
    }
}





