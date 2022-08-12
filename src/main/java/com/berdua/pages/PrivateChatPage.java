package com.berdua.pages;

import org.openqa.selenium.By;

import static com.berdua.base.TestBase.driver;

public class PrivateChatPage {

    By pvtChatsLabel = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/h1");
    By searchField = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[2]/div/div[2]/input");
    By profileName = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]/p");
    By highlightedPN = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/div[1]/div[1]/div/span/img");
    By noRecentCht = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/span");
    By msgIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div[2]/div/svg");
    By contactsLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div/h1");
    By contactName = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/p");
    By attachIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[1]/div/svg");
    By msgField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div");
    By sendIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[3]/div/div");
    By msgDrpDwn = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[1]/svg");
    By dltMsgLabel = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/svg");
    By downloadLink = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/a");

    By chooseFilePpt = By.xpath("");

    public String validatePvtChatsLabel() {
        driver.findElement(pvtChatsLabel).isDisplayed();
        return driver.findElement(pvtChatsLabel).getText();
    }
    public void enterSearchField(String profileName) {
        driver.findElement(searchField).sendKeys(profileName);
    }
    public String validateProfileName() {
        driver.findElement(profileName).isDisplayed();
        return driver.findElement(profileName).getText();
    }
    public void clickHighlightedPN() {
        driver.findElement(highlightedPN).click();
    }
    public String validateProfileNotExist() {
        driver.findElement(noRecentCht).isDisplayed();
        return driver.findElement(noRecentCht).getText();
    }
    public void clickMsgIcon() {
        driver.findElement(msgIcon).click();
    }
    public String validateContactsSection() {
        driver.findElement(contactsLabel).isDisplayed();
        return driver.findElement(contactsLabel).getText();
    }
    public String validateMemberName() {
        driver.findElement(contactName).isDisplayed();
        return driver.findElement(contactName).getText();
    }
    public String validateInvMemberName() {
        driver.findElement(contactName).isDisplayed();
        return driver.findElement(contactName).getText();
    }
    public void clickAttachIcon() {
        driver.findElement(attachIcon).click();
    }
    public void enterMsgField(String msg) {
        driver.findElement(msgField).sendKeys(msg);
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
