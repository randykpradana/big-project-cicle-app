package com.berdua.pages;

import com.berdua.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/p")
    WebElement company;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[4]/a/div/div[1]")
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
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

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
    public HomePage clickNavbarDrpDwnIcon() {
        navbarDrpDwnIcon.click();
        return new HomePage();
    }
    public HomePage selectBlastDrpDwn() {
        blastDrpDwn.click();
        return new HomePage();
    }
}
