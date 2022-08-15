package com.berdua.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.berdua.base.TestBase.driver;

public class BoardPage {

    // Page Factory
    // Card
    By boardMenu = By.xpath ("//*[@id=\"root\"]/div[3]/div[2]/div[1]/a/div");
    By addCard1 = By.xpath ("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]");
    By addCard2 = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]/div[3]/button");
    By cardName = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]/div[1]/form/input");
    By cardBox = By.xpath("//*[@id=\"listcard_content-3\"]/div/div/div/a");
    By addMember = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/button");
    By addMemberPlus = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div/div[2]");
    By memberRandy = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/div/div[4]/div[4]/p");
    By memberNurul = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div[2]/div[4]/div[3]/p");
    By applyMember = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/div/div[5]/button/div/h1");
    By applymemberPlus = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div[2]/div[5]/button/div/h1");
    By labels = By.xpath ("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/button/div");
    By searchLabel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/form/input");
    By addLabel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/div");
    By labelName = By. xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/form/input");
    By colourRed = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/div[13]");
    By createLabel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[6]/button/div");
    By editLabel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/div/svg");
    By applylabel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[6]/button/div/h1");
    By dueDate = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[3]/button/div");
    By date = By.xpath("//*[@id=\"mui-3\"]");
    By time = By.xpath("//*[@id=\"mui-6\"]");
    By save = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[3]/div/div[4]/button[1]/div");
    By remove = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[3]/div/div[4]/button[2]/div");
    By attachFile = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[4]/div/button/div");
    By move = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/button");
    By moveList = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[1]");
    By moveNameList = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/div/div[2]");
    By movePosition = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]");
    By moveNumList = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div/div");
    By moveBtn = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[1]/div/div[4]/button");
    By privateCard = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[2]/div");
    By publicCard = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[2]/div/button");
    By archive = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[2]/div[3]/div/button/div");
    By addNote = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[4]/div[2]/div");
    By typeNote = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[4]/div[2]/div/div[1]/div/div[2]/div/p");
    By saveNote = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[4]/div[2]/div/div[2]/div/button");
    By editNote = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[4]/div[1]/div");
    By cheersBtn = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div/div");
    By cheersEmote = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div/div/div/div[3]/svg[1]");
    By cheersSmileyEmote = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div/div/div/div[3]/div/aside/div[3]/section/ul[2]/li[2]/button");
    By cheersText = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div/div/div/div[2]/form/input");
    By cheersConfirm = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div/div/div/div[3]/svg[2]/path");
    By cheersCancel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div/div/div/div[3]/svg[3]/path");
    By cheersIcon = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div[1]/div/div");
    By cheersDelete = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[6]/div/div/div[1]/div/div/div[3]/svg");
    By comment = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div/input");
    By commentText = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div/p");
    By commentPost = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[2]/button[2]");
    By commentCancel = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[2]/button[1]/div/h1");
    By commentReply = By.xpath("//*[@id=\"comment_62f326882a691682f859aaf3\"]/div[2]/div[5]/div/a/div");
    By commentReplyText = By.xpath("//*[@id=\"comment_62f326882a691682f859aaf3\"]/div[2]/div[5]/div/a/div");
    By commentReplyPost = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/div[2]/div[2]/button[2]");
    By commentReplyCancel = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/div[2]/div[2]/button[1]/div/h1");
    By commentDots = By.xpath("//*[@id=\"comment_62f76eeac6f91f8ad5dcf8f1\"]/div[2]/div[1]");
    By commentEdit = By.xpath("//*[@id=\"comment_62f76eeac6f91f8ad5dcf8f1\"]/div[2]/div[1]/div[2]/div/div/div[1]");
    By commentEditText = By.xpath("//*[@id=\"comment_62f76eeac6f91f8ad5dcf8f1\"]/div[2]/div[3]/div/div[1]/div/div/div[2]/div");
    By commentEditPost = By.xpath("//*[@id=\"comment_62f76eeac6f91f8ad5dcf8f1\"]/div[2]/div[3]/div/div[2]/button[2]");
    By commentDelete = By.xpath("//*[@id=\"comment_62f76eeac6f91f8ad5dcf8f1\"]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/p");
    By commentDeleteConfirm = By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/div[2]/button");
    By mencobaCard = By.xpath("//*[@id=\"listcard_content-3\"]/div[1]/div/div/a");
    By memberNurulDisplay = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div/div[2]/div/span/img");
    By memberRandyDisplay = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div/div[3]/div/span/img");
    By labelHigh = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[5]/div/div/div");
    By applyLabel = By.xpath("///*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[6]/button");
    By highLabelInput = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[2]/div");
    By cardIsMoved = By.xpath("//*[@id=\"listcard_content-1\"]/div[1]/div/div/a");
    By cardLock = By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/h1/svg/path");


    //List
    By addList = By.xpath( "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/button");
    By listName = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/form/div[1]/input");
    By createList = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/form/div[2]/div/button");
    By listAction = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div[1]/svg");
    By listArchiveAllCard = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[1]/p");
    By listArchiveThisList = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[2]/p");
    By listComplete = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[3]/p");
    By listSortAZ = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[4]/p");
    By listSortZA = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[5]/p");
    By listNearestDuedate = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[6]/p");
    By listFurthestDuedate = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[7]/p");
    By listNearestCreatedDate = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[8]/p");
    By listFurthestCreatedDate = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[9]/p");
    By newListDisplay = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[5]");

    //Filter
    By filter = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[1]");
    By filterSearchCard = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/form/input");
    By filterMember = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[5]/div[2]/div[2]/p");
    By filterDueSoon = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[7]/div[1]/div/p");
    By filterDueToday = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[7]/div[2]/div/p");
    By filterOverdue = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[7]/div[3]/div");
    By filterClear = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[9]/div/div");
    By filterLabel = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[3]/div[1]");
    By searchTestingdisplay = By.xpath("//*[@id=\"listcard_content-0\"]/div/div/div/a");

    //Archived items
    By archivedItems = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]");
    By archivedSearchCard = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/form/input");
    By archivedSwitchList = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/div[2]/button");
    By archivedRestoreList = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]/button");
    By archivedRestoreCard = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/p");



    // Actions

    //Card
    public void clickBoardMenu() {driver.findElement(boardMenu).click();}
    public void clickAddCard1() {driver.findElement(addCard1).click();}
    public void clickAddCard2() {driver.findElement(addCard2).click();}
    public void enterCardName(String card) {driver.findElement(cardName).sendKeys(card);}
    public void clickCardBox() {driver.findElement(cardBox).click();}
    public void clickAddMember() {driver.findElement(addMember).click();}
    public void clickAddMemberPlus() {driver.findElement(addMemberPlus).click();}
    public void clickMemberRandy() {driver.findElement(memberRandy).click();}
    public void clickMemberNurul() {driver.findElement(memberNurul).click();}
    public void clickApplyMemberPlus() {driver.findElement(applymemberPlus).click();}
    public void clickApplymember() {driver.findElement(applyMember).click();}
    public void clickLabels() {driver.findElement(labels).click();}
    public void enterSearchLabel(String label) {driver.findElement(searchLabel).sendKeys(label);}
    public void clickAddLabel() {driver.findElement(addLabel).click();}
    public void enterLabelName(String labelname) {driver.findElement(labelName).sendKeys(labelname);}
    public void clickColourRed() {driver.findElement(colourRed).click();}
    public void clickEditlabel() {driver.findElement(editLabel).click();}
    public void clickCreateLabel() {driver.findElement(createLabel).click();}
    public void clickApplyLabel() {driver.findElement(applylabel).click();}
    public void clickDueDate() {driver.findElement(dueDate).click();}
    public void clickDate() {driver.findElement(date).click();}
    public void enterDate(String Date) {driver.findElement(date).sendKeys(Date);}
    public void clickTime() {driver.findElement(time).click();}
    public void enterTime(String Time) {driver.findElement(time).sendKeys(Time);}
    public void clickSave() {driver.findElement(save).click();}
    public void clickRemove() {driver.findElement(remove).click();}
    public void clickAttachFile() {driver.findElement(attachFile).click();}
    public void clickMove() {driver.findElement(move).click();}
    public void clickMoveList() {driver.findElement(moveList).click();}
    public void clickMoveNamelist() {driver.findElement(moveNameList).click();}
    public void clickMovePosition() {driver.findElement(movePosition).click();}
    public void clickMoveNumlist() {driver.findElement(moveNumList).click();}
    public void clickMoveBtn() {driver.findElement(moveBtn).click();}
    public void clickPrivateCard() {driver.findElement(privateCard).click();}
    public void clickPublicCard() {driver.findElement(publicCard).click();}
    public void clickArchive() {driver.findElement(archive).click();}
    public void clickAddNote() {driver.findElement(addNote).click();}
    public void enterTypeNote(String tnote) {driver.findElement(typeNote).sendKeys(tnote);}
    public void clickSavenote() {driver.findElement(saveNote).click();}
    public void clickEditnote() {driver.findElement(editNote).click();}
    public void clickCheersbtn() {driver.findElement(cheersBtn).click();}
    public void clickCheersEmote() {driver.findElement(cheersEmote).click();}
    public void clickCheersSmiley() {driver.findElement(cheersSmileyEmote).click();}
    public void enterCheersText(String Cheerst) {driver.findElement(cheersText).sendKeys(Cheerst);}
    public void clickCheersConfirm() {driver.findElement(cheersConfirm).click();}
    public void clickCheersCancel() {driver.findElement(cheersCancel).click();}
    public void clickCheersIcon() {driver.findElement(cheersIcon).click();}
    public void clickCheersDelete() {driver.findElement(cheersDelete).click();}
    public void clickComment() {driver.findElement(comment).click();}
    public void enterCommentText(String textcomment) {driver.findElement(commentText).sendKeys(textcomment);}
    public void clickCommentPost() {driver.findElement(commentPost).click();}
    public void clickCommentCancel() {driver.findElement(commentCancel).click();}
    public void clickCommentReply() {driver.findElement(commentReply).click();}
    public void enterCommentReplyText(String textreply) {driver.findElement(commentReplyText).sendKeys(textreply);}
    public void clickCommentReplyPost() {driver.findElement(commentReplyPost).click();}
    public void clickCommentReplyCancel() {driver.findElement(commentReplyCancel).click();}
    public void clickCommentDots() {driver.findElement(commentDots).click();}
    public void clickCommentEdit() {driver.findElement(commentEdit).click();}
    public void clickCommentEditText() {driver.findElement(commentEditText).click();}
    public void enterCommentEditText(String textcommentedit) {driver.findElement(commentEditText).sendKeys(textcommentedit);}
    public void clickCommentEditPost() {driver.findElement(commentEditPost).click();}
    public void clickCommentDelete() {driver.findElement(commentDelete).click();}
    public void clickCommentDeleteConfirm() {driver.findElement(commentDeleteConfirm).click();}
    public void clickHighLabel() {driver.findElement(labelHigh).click();}
    public void clickApplylabels() {driver.findElement(applylabel).click();}
    public String getCard() {
        String mencoba= driver.findElement(mencobaCard).getText();
        return mencoba;
    }

    public String getMemberNurulDisplay() {
        String memberN= driver.findElement(memberNurulDisplay).getText();
        return memberN;
    }

    public String getMemberRandyDisplay() {
        String memberR= driver.findElement(memberRandyDisplay).getText();
        return memberR;
    }

    public String getHighLabelDisplay() {
        String labelH= driver.findElement(labelHigh).getText();
        return labelH;
    }
    public String getApplyLabelDisplay() {
        String labelI = driver.findElement(highLabelInput).getText();
        return labelI;
    }
    public String getCardIsMoved() {
        String movedCard = driver.findElement(cardIsMoved).getText();
        return movedCard;
    }

    public String getCardLock() {
        String lockCard = driver.findElement(cardLock).getText();
        return lockCard;
    }


    //List
    public void clickAddList() {driver.findElement(addList).click();}
    public void enterListName(String listname) {driver.findElement(listName).sendKeys(listname);}
    public void clickCreateList() {driver.findElement(createList).click();}
    public void clickListAction() {driver.findElement(listAction).click();}
    public void clickListArchiveAllCard() {driver.findElement(listArchiveAllCard).click();}
    public void clickListArchiveThisList() {driver.findElement(listArchiveThisList).click();}
    public void clickListComplete() {driver.findElement(listComplete).click();}
    public void clickListSortAZ() {driver.findElement(listSortAZ).click();}
    public void clickListSortZA() {driver.findElement(listSortZA).click();}
    public void clickListNearestDueDate() {driver.findElement(listNearestDuedate).click();}
    public void clickListFurthestDueDate() {driver.findElement(listFurthestDuedate).click();}
    public void clickListNearestCreatedDate() {driver.findElement(listNearestCreatedDate).click();}
    public void clickListFurthestCreatedDate() {driver.findElement(listFurthestCreatedDate).click();}
    public String getListDisplay() {
        String listDisplay = driver.findElement(newListDisplay).getText();
        return listDisplay;
    }



    //Filter
    public void clickFilter() {driver.findElement(filter).click();}
    public void enterFilterSearchCard(String searchCard) {driver.findElement(filterSearchCard).sendKeys(searchCard);}
    public void clickFilterMember() {driver.findElement(filterMember).click();}
    public void clickFilterDueSoon() {driver.findElement(filterDueSoon).click();}
    public void clickFilterDueToday() {driver.findElement(filterDueToday).click();}
    public void clickFilterOverdue() {driver.findElement(filterOverdue).click();}
    public void clickFilterClear() {driver.findElement(filterClear).click();}
    public void clickFilterLabel() {driver.findElement(filterLabel).click();}
    public String getTestingDisplay() {
        String testingDisplay = driver.findElement(searchTestingdisplay).getText();
        return testingDisplay;
    }


    //Archived Item
    public void clickArchivedItems() {driver.findElement(archivedItems).click();}
    public void enterArchivedSearchCard(String archivedSearch) {driver.findElement(archivedSearchCard).sendKeys(archivedSearch);}
    public void clickArchivedSwitchList() {driver.findElement(archivedSwitchList).click();}
    public void clickArchivedRestoreList() {driver.findElement(archivedRestoreList).click();}
    public void clickArchivedRestoreCard() {driver.findElement(archivedRestoreCard).click();}




}




