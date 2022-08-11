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
    By postTitleField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/textarea");
    By titleEmoticon = By.cssSelector("#root > div.Main_container__39jS7 > div.Main_mainCol__3MC7n > div > div > div.CreateBlastPage_headerSection__hFvYv > div > svg");
    By emoteSearchField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[2]/input");
    By emoteColorLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[2]/ul/li[1]/label");
    By blackColorLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[2]/ul/li[6]/label");
    By speakingEmoji = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[3]/section/ul[1]/li/button/img");
    By postStoryField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div");
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
    By insertLinkIcon = By.cssSelector("#insertLink-6 > svg");
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
    By imageByUrlField = By.xpath("//*[@id=\"fr-image-by-url-layer-text-3\"]");
    By insImageUrlButton = By.xpath("//*[@id=\"fr-image-by-url-layer-3\"]/div[2]/button");
    By insertVideo = By.xpath("//*[@id=\"insertVideo-3\"]/svg");
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
    public void enterPostTitleField(String title) {
        driver.findElement(postTitleField).sendKeys(Keys.TAB);
        driver.findElement(postTitleField).clear();
        driver.findElement(postTitleField).sendKeys(title);
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
    public void clickSpeakingEmoji() {
        driver.findElement(speakingEmoji).click();
    }
    public void emptyPostTitleField(String emptyTitle) {
        driver.findElement(postTitleField).clear();
    }
    public void enterPostStoryField(String story) {
        driver.findElement(postStoryField).sendKeys(story);
    }
    public void emptyPostStoryField(String emptyStory) {
        driver.findElement(postStoryField).clear();
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
