package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlastPage {
    // Blasts List
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[3]/div/div[2]/p")
    WebElement createBlastBarBtn;
    @FindBy(name = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/div[1]/a/div")
    WebElement postContainer;
    @FindBy(name = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div/svg")
    WebElement threeDotsIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/svg")
    WebElement editIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/svg")
    WebElement archiveIcon;
    // Blast Post Section
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div")
    WebElement cheersIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[2]/form/input")
    WebElement cheersField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[3]/svg[1]")
    WebElement cheersEmoteIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[3]/svg[2]")
    WebElement cheersCheck;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div[3]/svg[3]")
    WebElement cheersCancel;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div/input")
    WebElement addNewCommentField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/span")
    WebElement commentField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[2]/button[2]/div/h1")
    WebElement postButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/h1")
    WebElement blastLabel;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/h1")
    WebElement createPostLabel;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div")
    WebElement postTitleField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div")
    WebElement postStoryField;
    @FindBy(xpath = "//*[@id=\"bold-8\"]/svg")
    WebElement boldIcon;
    @FindBy(xpath = "//*[@id=\"italic-8\"]/svg")
    WebElement italicIcon;
    @FindBy(xpath = "//*[@id=\"strikeThrough-8\"]/svg")
    WebElement strikethroughIcon;
    @FindBy(xpath = "//*[@id=\"backgroundColor-8\"]/svg")
    WebElement bgColorIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[10]/div[1]/span[1]")
    WebElement greenBgColor;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[10]/div[1]/span[28]")
    WebElement trashBgColor;
    @FindBy(xpath = "//*[@id=\"fontSize-8\"]/svg")
    WebElement fontSizeDrpDwn;
    @FindBy(xpath = "//*[@id=\"dropdown-menu-fontSize-8\"]/div/div/ul/li[11]/a")
    WebElement fontSizePts;
    @FindBy(xpath = "//*[@id=\"moreText-8\"]/svg")
    WebElement moreTextIcon;
    @FindBy(xpath = "//*[@id=\"underline-8\"]/svg")
    WebElement underlineIcon;
    @FindBy(xpath = "//*[@id=\"subscript-8\"]")
    WebElement subscriptIcon;
    @FindBy(xpath = "//*[@id=\"superscript-8\"]/svg")
    WebElement superscriptIcon;
    @FindBy(xpath = "//*[@id=\"underline-8\"]/svg")
    WebElement fontFamilyDrpDwn;
    @FindBy(xpath = "//*[@id=\"dropdown-menu-fontFamily-8\"]/div/div/ul/li[5]/a")
    WebElement tnrFontStyle;
    @FindBy(xpath = "//*[@id=\"textColor-8\"]/svg")
    WebElement textColorIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[11]/div[1]/span[4]")
    WebElement blueTextColor;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[9]/div[1]/span[28]/svg")
    WebElement trashTextColor;
    @FindBy(xpath = "//*[@id=\"clearFormatting-1\"]/svg")
    WebElement clearFormatting;
    @FindBy(xpath = "//*[@id=\"formatOLSimple-1\"]/svg")
    WebElement orderedListIcon;
    @FindBy(xpath = "//*[@id=\"formatUL-1\"]/svg")
    WebElement unorderedListIcon;
    @FindBy(xpath = "//*[@id=\"formatULOptions-1\"]")
    WebElement unorderedListDrpDwn;
    @FindBy(xpath = "//*[@id=\"moreParagraph-1\"]/svg")
    WebElement moreParagraphIcon;
    @FindBy(xpath = "//*[@id=\"alignCenter-1\"]/svg")
    WebElement alignCenter;
    // Blasts List Methods
    public BlastPage clickCreateBlastBarBtn() {
        createBlastBarBtn.click();
        return new BlastPage();
    }
    public BlastPage clickProfileIcon() {
        postContainer.click();
        return new BlastPage();
    }
    public BlastPage clickThreeDotsIcon() {
        threeDotsIcon.click();
        return new BlastPage();
    }
    public BlastPage clickEditIcon() {
        editIcon.click();
        return new BlastPage();
    }
    public BlastPage clickArchiveIcon() {
        archiveIcon.click();
        return new BlastPage();
    }
    // Blast Post Section Methods
    public BlastPage clickCheersIcon() {
        cheersIcon.click();
        return new BlastPage();
    }
    public BlastPage enterCheersField() {
        cheersField.sendKeys();
        return new BlastPage();
    }
    public BlastPage clickCheersEmoteIcon() {
        cheersEmoteIcon.click();
        return new BlastPage();
    }
    public BlastPage clickCheersCheck() {
        cheersCheck.click();
        return new BlastPage();
    }
    public BlastPage clickCheersCancel() {
        cheersCancel.click();
        return new BlastPage();
    }
    public BlastPage clickAddNewCommentField() {
        addNewCommentField.click();
        return new BlastPage();
    }
    public BlastPage enterCommentField() {
        commentField.click();
        return new BlastPage();
    }
    public BlastPage clickPostButton() {
        postButton.click();
        return new BlastPage();
    }
    public BlastPage displayBlastLabel() {
        blastLabel.isDisplayed();
        return new BlastPage();
    }
    public BlastPage displayCreatePostLabel() {
        blastLabel.isDisplayed();
        return new BlastPage();
    }
}
