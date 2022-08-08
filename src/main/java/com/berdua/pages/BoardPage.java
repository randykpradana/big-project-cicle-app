package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardPage {

    // Page Factory
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[1]/a/div")
    WebElement boardMenu;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/button")
    WebElement addList;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/form/div[1]/input")
    WebElement listName;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/form/div[2]/div/button")
    WebElement createList;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]")
    WebElement addCard1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]/div[3]/button")
    WebElement addCard2;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]/div[1]")
    WebElement cardName;

    @FindBy(xpath = "//*[@id=\"listcard_content-3\"]/div/div/div/a")
    WebElement cardBox;

    @FindBy(xpath = "//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/button")
    WebElement addMember;
    // Actions
    public BoardPage clickBoardMenu() {
        boardMenu.click();
        return new BoardPage();
    }

    public BoardPage clickAddList() {
        addList.click();
        return new BoardPage();
    }

    public BoardPage clickListName() {
        listName.click();
        return new BoardPage();
    }

    public BoardPage clickCreateList() {
        createList.sendKeys();
        return new BoardPage();
    }

    public BoardPage clickAddCard1() {
        addCard1.sendKeys();
        return new BoardPage();
    }

    public BoardPage clickAddCard2() {
        addCard2.sendKeys();
        return new BoardPage();
    }

    public BoardPage clickCardName() {
        cardName.sendKeys();
        return new BoardPage();
    }

    public BoardPage clickCardBox() {
        cardBox.sendKeys();
        return new BoardPage();
    }

    public BoardPage clickAddMember() {
        addMember.sendKeys();
        return new BoardPage();
    }
}
