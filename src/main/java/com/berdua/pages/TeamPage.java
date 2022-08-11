package com.berdua.pages;

import org.openqa.selenium.By;

import static com.berdua.base.TestBase.driver;

public class TeamPage {
    // Page Factory
    By groupChatWidget = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/a/div");
    By blastWidget = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]");
    By boardWidget = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[1]/a/div");
    // Actions
    public void clickGroupChatWidget() {
        driver.findElement(groupChatWidget).click();
    }
    public void clickBlastWidget() {
        driver.findElement(blastWidget).click();
    }
    public void clickBoardWidget() {
        driver.findElement(boardWidget).click();
    }
}
