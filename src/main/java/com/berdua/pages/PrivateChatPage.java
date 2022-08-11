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
    public void enterSearchField(String profileName) {
        driver.findElement(searchField).sendKeys(profileName);
    }
    public void clickMsgIcon() {
        driver.findElement(msgIcon).click();
    }
    public String validateContactsLabel() {
        driver.findElement(contactsLabel).isDisplayed();
        return driver.findElement(contactsLabel).getText();
    }
    public void clickAttachIcon() {
        driver.findElement(attachIcon).click();
    }
    public void clickSendIcon() {
        driver.findElement(sendIcon).click();
    }
    public void clickMsgDrpDwn() {
        driver.findElement(msgDrpDwn).click();
    }
    public void clickDltMsgLabel() {
        driver.findElement(dltMsgLabel).click();
    }
    public void clickDownloadLink() {
        driver.findElement(downloadLink).click();
    }
}
