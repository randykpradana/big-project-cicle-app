package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlastPage {
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
}
