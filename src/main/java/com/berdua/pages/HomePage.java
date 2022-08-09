package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    // Page Factory
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[4]/a[2]/div")
    WebElement teamCard;
    @FindBy(name = "//*[@id=\"root\"]/div[1]/div[2]/div[4]/div/span")
    WebElement profileIcon;
    @FindBy(name = "//*[@id=\"root\"]/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/div/div/svg")
    WebElement privateChatIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/input")
    WebElement searchBarField;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/svg")
    WebElement navbarDrpDwnIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/a[2]/div/p")
    WebElement blastDrpDwn;
    // Actions
    public HomePage clickTeamCard() {
        teamCard.click();
        return new HomePage();
    }
    public HomePage clickProfileIcon() {
        profileIcon.click();
        return new HomePage();
    }
    public HomePage clickPvtChatIcon() {
        privateChatIcon.click();
        return new HomePage();
    }
    public HomePage enterSearchBarFld() {
        searchBarField.sendKeys();
        return new HomePage();
    }
}
