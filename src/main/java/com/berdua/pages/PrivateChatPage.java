package com.berdua.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.berdua.base.TestBase.driver;

public class PrivateChatPage {
    // Objects
    By pvtChatsLabel = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/h1");
    By searchField = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[2]/div/div[2]/input");
    By profileName = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/div[2]");
    By searchedProfile = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/div");
    By highlightedProfile = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/div[1]/div[1]/div/span/img");
    By noRecentChats = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/span");
    By msgIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div[2]/div");
    By contactsLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div/h1");
    By contactName = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/p");
    By noMembersLabel = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/span");
    By attachIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[1]/div");
    By msgField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div");
    By blockText = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div/p");
    By sendIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[3]/div/div");
    By msgTextBox = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]");
    By msgDrpDwn = By.className("Message_iconOption__3F-Ru");
    By dltMsgLabel = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[3]/div/div");
    By deleteButton = By.cssSelector("body > div.fade.modal.show > div > div > div.modal-footer > button > div");
    By msgDeleted = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]");
    By successDeleteMsg = By.xpath("//*[@id=\"notistack-snackbar\"]");
    By downloadLink = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/a");
    // Text Formatting
    By emoticons = By.id("emoticons-1");
    By smileIcon = By.xpath("/html/body/div[4]/div[3]/span[17]");
    By bold = By.id("bold-1");
    By italic = By.id("italic-1");
    By underline = By.id("underline-1");
    By strikethrough = By.id("strikeThrough-1");
    By orderedList = By.id("formatOLSimple-1");
    By unorderedList = By.id("formatUL-1");
    By unorderedListDrpDwn = By.id("formatULOptions-1");
    By circleUndList = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-1\"]/div/div/ul/li[2]/a");
    By bgColor = By.id("backgroundColor-1");
    By blueBgColor = By.xpath("/html/body/div[4]/div[2]/span[4]");

    // Validation - Text Formatting
    By enteredEmoticon = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/span");
    By boldText = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div/p");
    By dispBoldText = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/strong");
    By italicText = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div");
    By dispItalicText = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/em");
    By underlineText = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div/p/u");
    By dispUnderlineText = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/u");
    By strikethroughText = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div");
    By dispStrikethroughText = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/s");
    By ordList = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div/ol/li");
    By dispOrdList = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/ol/li");
    By undList = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div");
    By dispUndList = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/ul/li");
    By circleUndListFormat = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div");
    By dispCircleUndList = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/ul/li");
    By blueBgTextColor = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[3]/div/div[2]/div/div/div");
    By dispBlueBgTextColor = By.xpath("//*[@id=\"list-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/p/span");

    // Methods
    public void enterSearchField(String profileName) {
        driver.findElement(searchField).sendKeys(profileName);
    }
    public void clickSearchedProfile() {
        driver.findElement(searchedProfile).click();
    }
    public void clickMsgIcon() {
        driver.findElement(msgIcon).click();
    }
    public void clickAttachIcon() {
        driver.findElement(attachIcon).click();
    }
    public void enterMsgField(String msg) {
        driver.findElement(msgField).sendKeys(Keys.TAB);
        driver.findElement(msgField).clear();
        driver.findElement(msgField).sendKeys(msg);
    }
    public void clickMsgField() {
        driver.findElement(msgField).click();
    }
    public void clickSendIcon() {
        driver.findElement(sendIcon).click();
    }
    public void clickMsgTextBox() {
        driver.findElement(msgTextBox).click();
    }
    public void clickMsgDrpDwn() {
        driver.findElement(msgDrpDwn).click();
    }
    public void clickDltMsgLabel() {
        driver.findElement(dltMsgLabel).click();
    }
    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();
    }
    public void clickDownloadLink() {
        driver.findElement(downloadLink).click();
    }
    public void blockEnteredText() {
        driver.findElement(blockText).sendKeys(Keys.CONTROL + "a");
    }

    // Text Formatting
    public void clickEmoticonsIcon() {
        driver.findElement(emoticons).click();
    }
    public void clickSmileIcon() {
        driver.findElement(smileIcon).click();
    }
    public void clickBoldIcon() {
        driver.findElement(bold).click();
    }
    public void clickItalicIcon() {
        driver.findElement(italic).click();
    }
    public void clickUnderlineIcon() {
        driver.findElement(underline).click();
    }
    public void clickStrikethroughIcon() {
        driver.findElement(strikethrough).click();
    }
    public void clickOrdListIcon() {
        driver.findElement(orderedList).click();
    }
    public void clickUndList() {
        driver.findElement(unorderedList).click();
    }
    public void clickUndListDrpDwn() {
        driver.findElement(unorderedListDrpDwn).click();
    }
    public void selectCircleUndList() {
        driver.findElement(circleUndList).click();
    }
    public void clickBgColorIcon() {
        driver.findElement(bgColor).click();
    }
    public void selectBlueBgColor() {
        driver.findElement(blueBgColor).click();
    }

    // Validation
    public boolean validateEnteredEmoticon() {
        driver.findElement(enteredEmoticon).isDisplayed();
        return true;
    }
    public String validatePvtChatsLabel() {
        driver.findElement(pvtChatsLabel).isDisplayed();
        return driver.findElement(pvtChatsLabel).getText();
    }
    public String validateProfileName() {
        driver.findElement(profileName).isDisplayed();
        return driver.findElement(profileName).getText();
    }
    public String validateChatHistory() {
        driver.findElement(noRecentChats).isDisplayed();
        return driver.findElement(noRecentChats).getText();
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
        driver.findElement(noMembersLabel).isDisplayed();
        return driver.findElement(noMembersLabel).getText();
    }
    public String validateMsgDeleted() {
        driver.findElement(msgDeleted).isDisplayed();
        return driver.findElement(msgDeleted).getText();
    }
    public String validateSuccessDeleteMsg() {
        driver.findElement(successDeleteMsg).isDisplayed();
        return driver.findElement(successDeleteMsg).getText();
    }

    // Validation - Text Formatting
    public String validateBoldText() {
        driver.findElement(boldText).isDisplayed();
        return driver.findElement(boldText).getText();
    }
    public String validateDispTextIsBold() {
        driver.findElement(dispBoldText).isDisplayed();
        return driver.findElement(dispBoldText).getText();
    }
    public String validateItalicText() {
        driver.findElement(italicText).isDisplayed();
        return driver.findElement(italicText).getText();
    }
    public String validateDispTextIsItalic() {
        driver.findElement(dispItalicText).isDisplayed();
        return driver.findElement(dispItalicText).getText();
    }
    public String validateUnderlineText() {
        driver.findElement(underlineText).isDisplayed();
        return driver.findElement(underlineText).getText();
    }
    public String validateDispUnderlineText() {
        driver.findElement(dispUnderlineText).isDisplayed();
        return driver.findElement(dispUnderlineText).getText();
    }
    public String validateStrikethroughText() {
        driver.findElement(strikethroughText).isDisplayed();
        return driver.findElement(strikethroughText).getText();
    }
    public String validateDispStrikethroughText() {
        driver.findElement(dispStrikethroughText).isDisplayed();
        return driver.findElement(dispStrikethroughText).getText();
    }
    public String validateOrdList() {
        driver.findElement(ordList).isDisplayed();
        return driver.findElement(ordList).getText();
    }
    public String validateDispOrdList() {
        driver.findElement(dispOrdList).isDisplayed();
        return driver.findElement(dispOrdList).getText();
    }
    public String validateUndList() {
        driver.findElement(undList).isDisplayed();
        return driver.findElement(undList).getText();
    }
    public String validateDispUndList() {
        driver.findElement(dispUndList).isDisplayed();
        return driver.findElement(dispUndList).getText();
    }
    public String validateCircleUndListFormat() {
        driver.findElement(circleUndListFormat).isDisplayed();
        return driver.findElement(undList).getText();
    }
    public String validateDispCircleUndList() {
        driver.findElement(dispCircleUndList).isDisplayed();
        return driver.findElement(dispCircleUndList).getText();
    }
    public String validateBlueBgTextColor() {
        driver.findElement(blueBgTextColor).isDisplayed();
        return driver.findElement(blueBgTextColor).getText();
    }
    public String validateDispBlueBgTextColor() {
        driver.findElement(dispBlueBgTextColor).isDisplayed();
        return driver.findElement(dispBlueBgTextColor).getText();
    }
}
