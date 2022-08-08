package com.berdua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroupChatPage {
    WebDriver driver;

    public GroupChatPage(WebDriver driver) {this.driver = driver;}

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[1]/a/div")
    WebElement GroupChatMenu;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div")
    WebDriver TypeMessageHere;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[3]/div/div/svg")
    WebDriver SendIcon;

    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[1]/div/svg")
    WebDriver AttachFileIcon;

    @FindBy(xpath = "//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[1]/svg")
    WebDriver IcoonRoot;

    @FindBy(xpath = "//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div")
    WebDriver DeleteMessege;

    @FindBy(xpath = "/html/body/div[6]/div/div/div[3]/button")
    WebDriver BtnDelete;

    //Actions
    public String clickGroupChatMenu() {
        return  driver.getTitle();
    }
    public String clickTypeMessageHere() {
        return driver.getTitle();
    }
    public String SendIcon() {
        return driver.getTitle();
    }
    public String AttachFileIcon() {
        return driver.getTitle();
    }
    public String IcoonRoot() {
        return driver.getTitle();
    }
    public String DeleteMessege() {
        return driver.getTitle();
    }
    public String BtnDelete() {
        return driver.getTitle();
    }
}
