package com.berdua.pages;

import org.openqa.selenium.By;

import static com.berdua.base.TestBase.driver;

public class PrivateChatPage {

    By pvtChatsLabel = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/h1");
    By searchField = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[2]/div/div[2]/input");
    By msgIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div[2]/div/svg");
    By contactsLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div/h1");
    By attachIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[1]/div/svg");
    By sendIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[3]/div/div");
    By msgDrpDwn = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[1]/svg");
    By dltMsgLabel = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/svg");
    By downloadLink = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/a");

    public String validatePvtChatsLabel() {
        driver.findElement(pvtChatsLabel).isDisplayed();
        return driver.findElement(pvtChatsLabel).getText();
    }
}
