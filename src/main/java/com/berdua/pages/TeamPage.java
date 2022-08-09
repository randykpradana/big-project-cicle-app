package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamPage {
    // Page Factory
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[1]/a/div")
    WebElement groupChatWidget;
    @FindBy(name = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/a/div")
    WebElement blastWidget;
    @FindBy(name = "//*[@id=\"root\"]/div[3]/div[2]/div[1]/a/div")
    WebElement boardWidget;
    // Actions
    public TeamPage clickGroupChatWidget() {
        groupChatWidget.click();
        return new TeamPage();
    }
    public TeamPage clickBlastWidget() {
        blastWidget.click();
        return new TeamPage();
    }
    public TeamPage clickBoardWidget() {
        boardWidget.click();
        return new TeamPage();
    }
}
