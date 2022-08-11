package com.berdua.pages;

import com.berdua.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    By teamCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a[1]");
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/p")
    WebElement company;
    By profileIcon = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div/span");
    By privateChatIcon = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/div/div/svg");
    By searchBarField = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/input");
    By navbarDrpDwnIcon = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/p");
    By blastDrpDwn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/a[2]/div/p");

    public HomePage() {
        PageFactory.initElements(driver, "/companies");
    }
    /**
     * Methods
     */
    public void clickTeamCard() {
        driver.findElement(teamCard).click();
    }
    public void clickProfileIcon() {
        driver.findElement(profileIcon).click();
    }
    public void clickPvtChatIcon() {
        driver.findElement(privateChatIcon).click();
    }
    public void clickSearchBarField() {
        driver.findElement(searchBarField).click();
    }
    public void clickNavbarDrpDwnIcon() {
        driver.findElement(navbarDrpDwnIcon).click();
    }
    public void selectBlastDrpDwn() {
        driver.findElement(blastDrpDwn).click();
    }

    public HomePage selectGroupChatDrpDwn() {
        groupchatDrpDwn.click();
        return new HomePage();
    }
}



