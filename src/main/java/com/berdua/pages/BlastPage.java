package com.berdua.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import static com.berdua.base.TestBase.driver;

public class BlastPage {
    /**
     * Blasts List
     */
    By createBlastBarBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[3]/div/div[2]/p");
    By blastsLabel = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]");
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
    By titleField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/textarea");
    By titleEmoticon = By.cssSelector("#root > div.Main_container__39jS7 > div.Main_mainCol__3MC7n > div > div > div.CreateBlastPage_headerSection__hFvYv > div > svg");
    By emoteSearchField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[2]/input");
    By emoteColorLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[2]/ul/li[1]/label");
    By blackColorLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[2]/ul/li[6]/label");
    By speakingEmoticon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[3]/section/ul[1]/li/button/img");
    By storyField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div");
    By publishButton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[6]/button/div/h1");
    By successPopUpMsg = By.xpath("//*[@id=\"notistack-snackbar\"]");
    By errorPopUpMsg = By.xpath("//*[@id=\"notistack-snackbar\"]");

    /**
     * Text Formatting
     */
    By boldIcon = By.id("bold-1");
    By italicIcon = By.id("italic-1");
    By strikethroughIcon = By.id("strikeThrough-1");
    By bgColorIcon = By.id("backgroundColor-1");
    By greenBgColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/span[1]");
    By trashBgColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[10]/div[1]/span[28]");
    By fontSizeDrpDwn = By.xpath("fontSize-1");
    By fontSizePts = By.xpath("//*[@id=\"dropdown-menu-fontSize-1\"]/div/div/ul/li[7]/a");
    By moreTextIcon = By.id("moreText-1");
    By underlineIcon = By.id("underline-1");
    By subscriptIcon = By.id("subscript-1");
    By superscriptIcon = By.id("superscript-1");
    By fontFamilyDrpDwn = By.id("fontFamily-1");
    By tnrFontStyle = By.xpath("//*[@id=\"dropdown-menu-fontFamily-1\"]/div/div/ul/li[5]/a");
    By textColorIcon = By.xpath("//*[@id=\"textColor-8\"]/svg");
    By blueTextColor = By.id("textColor-1");
    By trashTextColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[11]/div[1]/span[28]");
    By clearFormatting = By.id("clearFormatting-1");
    By orderedListIcon = By.id("formatOLSimple-1");
    By unorderedListIcon = By.id("formatUL-1");
    By unorderedListDrpDwn = By.id("formatULOptions-1");
    By discUndList = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-1\"]/div/div/ul/li[3]/a");
    By moreParagraphIcon = By.id("moreParagraph-1");
    By alignCenter = By.id("alignCenter-1");
    By increaseInd = By.id("indent-1");
    By decreaseInd = By.id("outdent-1");
    By quoteDrpDwn = By.id("quote-1");
    By increaseQuo = By.xpath("//*[@id=\"dropdown-menu-quote-1\"]/div/div/ul/li[1]/a");
    By decreaseQuo = By.xpath("//*[@id=\"dropdown-menu-quote-1\"]/div/div/ul/li[2]/a");
    By storyEmoticon = By.id("emoticons-1");
    By smileEmoticon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[12]/div[2]/span[17]");

    /**
     * Insert Files
     */
    By insertFilesIcon = By.id("insertFiles-1");
    By uploadFileBox = By.id("fr-files-upload-layer-1");
    By fileCheckBox = By.id("checkbox-key-0");
    By insertIcon = By.id("fr-file-insert-button-0");
    By viewIcon = By.id("fr-file-view-button-0");
    By deleteIcon = By.id("fr-file-delete-button-0");
    By byUrl = By.id("filesByURL-1");
    By byUrlField = By.id("fr-files-by-url-layer-text-1");
    By addUrlButton = By.xpath("//*[@id=\"fr-files-by-url-layer-1\"]/div[2]/button");
    By insertedLink = By.xpath("//*[@id=\"fr-file-0\"]/div[1]/div[2]");
    By invInsertedLink = By.className("fr-message");
    By embedCode = By.id("filesEmbed-1");
    By embedCodeField = By.id("fr-files-embed-layer-text1");
    By insertEmbedButton = By.xpath("//*[@id=\"fr-files-embed-layer-1\"]/div[2]/button");

    /**
     * Insert Link
     */
    By insertLinkIcon = By.id("insertLink-1");
    By insertUrlField = By.id("fr-link-insert-layer-url-1");
    By insertUrlText = By.id("fr-link-insert-layer-text-1");
    By insertUrlButton = By.xpath("//*[@id=\"fr-link-insert-layer-1\"]/div[3]/button");

    /**
     * More Rich
     */
    By moreRichIcon = By.id("moreRich-1");
    By insertImage = By.id("insertImage-1");
    By dropImageBox = By.id("fr-image-upload-layer-1");
    By imageByUrl = By.id("imageByURL-1");
    By imageByUrlField = By.id("fr-image-by-url-layer-text-1");
    By insImageUrlButton = By.xpath("//*[@id=\"fr-image-by-url-layer-1\"]/div[2]/button");
    By insertVideo = By.id("insertVideo-1");
    By videoUrlField = By.id("fr-video-by-url-layer-text-1");
    By autoplayCheckbox = By.id("videoPluginAutoplay");
    By insertVideoButton = By.xpath("//*[@id=\"fr-video-by-url-layer-1\"]/div[2]/button");
    By uploadFile = By.id("insertFile-1");
    By uplFileLayer = By.id("fr-file-upload-layer-1");
    By insertTable = By.id("insertTable-1");
    By tableFormat = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[18]/div[2]/div[2]/span[3]");
    By speCharacters = By.xpath("//*[@id=\"specialCharacters-3\"]/svg");
    By copyrightSign = By.id("specialCharacters-1");
    By horizontalLine = By.id("insertHR-1");

    /**
     * Undo & Redo
     */
    By undoIcon = By.id("undo-1");
    By redoIcon = By.id("redo-1");

    /**
     * Blast Auto Complete
     */
    By autoComDrpDwn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[1]/div/div/div");
    By dateManually = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    By autoComInDrpDwn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/div/div");
    By threeDays = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]");

    /**
     * Notified Members
     */
    By plusIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div[2]/div/div[17]/svg");
    By searchMembersField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div[2]/div[2]/div/div/div[3]/div/input");
    By selectAllCheckbox = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div[2]/div[2]/div/div/div[4]/div/svg");
    By memberCheckbox = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div[2]/div[2]/div/div/div[5]/div[1]/svg");
    By doneButton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div[2]/div[2]/div/div/div[1]/div");

    /**
     * Private
     */
    By pvtSwitchButton = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[5]/div[2]/label/span[1]/span[1]/input");

    public BlastPage() {
        PageFactory.initElements(driver, "/62e394ac341d713a982e2243/blasts/62e394ac341d713a982e224a");
    }

    /**
     * Blasts List Methods
     */
    public void clickCreateBlastBarBtn() {
        driver.findElement(createBlastBarBtn).click();
    }
    public String validateBlastsLabel() {
        driver.findElement(blastsLabel).isDisplayed();
        return driver.findElement(blastsLabel).getText();
    }
    public void clickPostContainer() {
        driver.findElement(postContainer).click();
    }
    public void clickThreeDotsIcon() {
        driver.findElement(threeDotsIcon).click();
    }
    public void clickArchiveIcon() {
        driver.findElement(archiveIcon).click();
    }
    public void clickEditIcon() {
        driver.findElement(editIcon).click();
    }
    /**
     * Cheers Methods
     */
    public void clickCheersIcon() {
        driver.findElement(cheersIcon).click();
    }
    public void enterCheersField(String cheers) {
        driver.findElement(cheersField).sendKeys(cheers);
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
     * Comment Section Methods
     */
    public void clickAddNewCommentField() {
        driver.findElement(addNewCommentField).click();
    }
    public void enterCommentField(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    public void clickPostButton() {
        driver.findElement(postButton).click();
    }
    /**
     * Create Blast Methods
     */
    public String validateCreateBlastLabel() {
        driver.findElement(createBlastLabel).isDisplayed();
        return driver.findElement(createBlastLabel).getText();
    }
    public void enterTitleField(String title) {
        driver.findElement(titleField).sendKeys(Keys.TAB);
        driver.findElement(titleField).clear();
        driver.findElement(titleField).sendKeys(title);
    }
    public void clickTitleEmoticon() {
        driver.findElement(titleEmoticon).click();
    }
    public void enterEmoteSearchField(String emoteName) {
        driver.findElement(emoteSearchField).sendKeys(emoteName);
    }
    public void clickEmoteColorLabel() {
        driver.findElement(emoteColorLabel).click();
    }
    public void clickBlackLabel() {
        driver.findElement(blackColorLabel).click();
    }
    public void clickSpeakingEmoticon() {
        driver.findElement(speakingEmoticon).click();
    }
    public void emptyTitleField(String emptyTitle) {
        driver.findElement(titleField).clear();
    }
    public void enterStoryField(String story) {
        driver.findElement(storyField).sendKeys(story);
    }
    public void emptyStoryField(String emptyStory) {
        driver.findElement(storyField).clear();
    }
    public void clickStoryField(){
        driver.findElement(storyField).click();
    }
    public void clickPublishButton() {
        driver.findElement(publishButton).click();
    }
    public String validateSuccessPopUpMsg() {
        driver.findElement(successPopUpMsg).isDisplayed();
        return driver.findElement(successPopUpMsg).getText();
    }
    public String validateErrorPopUpMsg() {
        driver.findElement(errorPopUpMsg).isDisplayed();
        return driver.findElement(errorPopUpMsg).getText();
    }
    /**
     * Text Formatting Methods
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
    public void selectDiscUndList() {
        driver.findElement(discUndList).click();
    }
    public void clickMoreParagraphIcon() {
        driver.findElement(moreParagraphIcon).click();
    }
    public void selectAlignCenter() {
        driver.findElement(alignCenter).click();
    }
    public void clickIncreaseInd() {
        driver.findElement(increaseInd).click();
    }
    public void clickDecreaseInd() {
        driver.findElement(decreaseInd).click();
    }
    public void clickQuoteDrpDwn() {
        driver.findElement(quoteDrpDwn).click();
    }
    public void selectIncreaseQuo() {
        driver.findElement(increaseQuo).click();
    }
    public void selectDecreaseQuo() {
        driver.findElement(decreaseQuo).click();
    }
    public void clickStoryEmoticon() {
        driver.findElement(storyEmoticon).click();
    }
    public void clickSmileEmoticon() {
        driver.findElement(smileEmoticon).click();
    }
    /**
     * Insert Files Methods
     */
    public void clickInsertFilesIcon() {
        driver.findElement(insertFilesIcon).click();
    }
    public void clickUploadFileBox() {
        driver.findElement(uploadFileBox).click();
    }
    public void clickFileCheckBox() {
        driver.findElement(fileCheckBox).click();
    }
    public void clickInsertIcon() {
        driver.findElement(insertIcon).click();
    }
    public void clickViewIcon() {
        driver.findElement(viewIcon).click();
    }
    public void clickDeleteIcon() {
        driver.findElement(deleteIcon).click();
    }
    public void clickByUrl() {
        driver.findElement(byUrl).click();
    }
    public void enterByUrlField(String fileUrl) {
        driver.findElement(byUrlField).sendKeys(fileUrl);
    }
    public void clickAddUrlButton() {
        driver.findElement(addUrlButton).click();
    }
    public String validateInsertedLink() {
        driver.findElement(insertedLink).isDisplayed();
        return driver.findElement(insertedLink).getText();
    }
    public String validateInvInsertedLink() {
        driver.findElement(invInsertedLink).isDisplayed();
        return driver.findElement(invInsertedLink).getText();
    }
    public void clickEmbedCode() {
        driver.findElement(embedCode).click();
    }
    public void enterEmbedCodeField(String fileEmbedCode) {
        driver.findElement(embedCodeField).sendKeys(fileEmbedCode);
    }
    public void clickInsertEmbedButton() {
        driver.findElement(insertEmbedButton).click();
    }
    /**
     * Insert Link Methods
     */
    public void clickInsertLinkIcon() {
        driver.findElement(insertLinkIcon).click();
    }
    public void enterInsertUrlField(String linkUrl) {
        driver.findElement(insertUrlField).sendKeys(linkUrl);
    }
    public void enterInsertUrlText(String textUrl) {
        driver.findElement(insertUrlText).sendKeys(textUrl);
    }
    public void clickInsertUrlButton() {
        driver.findElement(insertUrlButton).click();
    }
    /**
     * More Rich Methods
     */
    public void clickMoreRichIcon() {
        driver.findElement(moreRichIcon).click();
    }
    public void clickInsertImage() {
        driver.findElement(insertImage).click();
    }
    public void clickDropImageBox() {
        driver.findElement(dropImageBox).click();
    }
    public void clickImageByUrl() {
        driver.findElement(imageByUrl).click();
    }
    public void enterImageByUrlField() {
        driver.findElement(imageByUrlField).sendKeys();
    }
    public void clickInsImageUrlButton() {
        driver.findElement(insImageUrlButton).click();
    }
    public void clickInsertVideo() {
        driver.findElement(insertVideo).click();
    }
    public void enterVideoUrlField() {
        driver.findElement(videoUrlField).click();
    }
    public void clickAutoplayCheckbox() {
        driver.findElement(autoplayCheckbox).click();
    }
    public void clickInsertVideoButton() {
        driver.findElement(insertVideoButton).click();
    }
    public void clickUploadFile() {
        driver.findElement(uploadFile).click();
    }
    public void clickUplFileLayer() {
        driver.findElement(uplFileLayer).click();
    }
    public void clickInsertTable() {
        driver.findElement(insertTable).click();
    }
    public void selectTableFormat() {
        driver.findElement(tableFormat).click();
    }
    public void clickSpeCharacters() {
        driver.findElement(speCharacters).click();
    }
    public void selectCopyrightSign() {
        driver.findElement(copyrightSign).click();
    }
    public void clickHorizontalLine() {
        driver.findElement(horizontalLine).click();
    }
    /**
     * Undo & Redo Methods
     */
    public void clickUndoIcon() {
        driver.findElement(undoIcon).click();
    }
    public void clickRedoIcon() {
        driver.findElement(redoIcon).click();
    }
    /**
     * Blast Auto Complete
     */
    public void clickAutoComDrpDwn() {
        driver.findElement(autoComDrpDwn).click();
    }
    public void selectDateManually() {
        driver.findElement(dateManually).click();
    }
    public void clickAutoComInDrpDwn() {
        driver.findElement(autoComInDrpDwn).click();
    }
    public void selectThreeDays() {
        driver.findElement(threeDays).click();
    }
    /**
     * Notified Members
     */
    public void clickPlusIcon() {
        driver.findElement(plusIcon).click();
    }
    public void enterSearchMembersField() {
        driver.findElement(searchMembersField).sendKeys();
    }
    public void uncheckSelectAllCheckbox() {
        driver.findElement(selectAllCheckbox).click();
    }
    public void checkMemberCheckbox() {
        driver.findElement(memberCheckbox).click();
    }
    public void clickDoneButton() {
        driver.findElement(doneButton).click();
    }
    /**
     * Private
     */
    public void slidePvtSwitchButton() {
        driver.findElement(pvtSwitchButton).click();
    }
}
