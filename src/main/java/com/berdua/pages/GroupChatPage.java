package com.berdua.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.berdua.base.TestBase.driver;

public class GroupChatPage {

    By GroupChatMenu = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/a/div");
    By addTypeMessageHere = By.xpath("//div[@class='fr-element fr-view']//p");
    By SendIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[3]/div/div");
    By AttachFileIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[1]/div/svg");
    By IconRoot = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[1]/svg");
    By DeleteMessage = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[1]");
    By MenuPopUpDelete = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[1]/svg");
    By BtnDelete = By.xpath("/html/body/div[6]/div/div/div[3]/button/div");

    //title
    By Bold = By.xpath("//*[@id=\"bold-2\"]");
    By Italic = By.xpath("//*[@id=\"italic-2\"]");
    By underline = By.xpath("//*[@id=\"underline-2\"]");
    By strikeThrough = By.xpath("//*[@id=\"strikeThrough-2\"]");
    By orderedlist = By.xpath("//*[@id=\"formatOLSimple-2\"]");

    //Unorderedlist
    By unorderedlist = By.xpath("//*[@id=\"formatULOptions-2\"]");
    //Default
    By Default = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[1]/a");
    //Cicle
    By Circle = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[2]/a");
    //Disc
    By Disc = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[3]/a");
    //Square
    By Squre = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[4]/a");

    //backgroundColor
    By backgroundColor = By.xpath("//*[@id=\"backgroundColor-2\"]");
    //Warna 1
    By Color = By.xpath("/html/body/div[5]/div[2]/span[11]");
    By btnOk = By.className("fr-command fr-submit");

    public GroupChatPage() {
        PageFactory.initElements(driver, "62e394ac341d713a982e2243/group-chats/62e394ac341d713a982e2249");
    }

    //Actions
    public void clickGroupChatMenu() {
        driver.findElement(GroupChatMenu).click();
    }

    public void enterTypeMessageHere(String Text) {
        driver.findElement(addTypeMessageHere).sendKeys(Text);
    }
    public void clickSendIcon() {
        driver.findElement(SendIcon).click();
    }
    public void clickAttachFileIcon() {
        driver.findElement(AttachFileIcon).click();
    }
    public void clickIconRoot() {
        driver.findElement(IconRoot).click();
    }
    public void clickDeleteMessage() {
        driver.findElement(DeleteMessage).click();
    }
    public void clickMenuPopUpDelete() {
        driver.findElement(MenuPopUpDelete).click();
    }
    public void clickBtnDelete() {
        driver.findElement(BtnDelete).click();
    }
    public void clickBold() {
        driver.findElement(Bold).click();
    }
    public void clickItalic() {
        driver.findElement(Italic).click();
    }
    public void clickUnderline() {
        driver.findElement(underline).click();
    }
    public void clickStrikeThough() {
        driver.findElement(strikeThrough).click();
    }
    public void clickOrderedList() {
        driver.findElement(orderedlist).click();
    }
    public void clickUnorderedList() {
        driver.findElement(unorderedlist).click();
    }
    public void clickDefault() {
        driver.findElement(Default).click();
    }
    public void clickCircle() {
        driver.findElement(Circle).click();
    }
    public void clickDisc() {
        driver.findElement(Disc).click();
    }
    public void clickSquare() {
        driver.findElement(Squre).click();
    }
    public void clickBackgroundColor() {
        driver.findElement(backgroundColor).click();
    }
    public void clickColor() {
        driver.findElement(Color).click();
    }
    public void clickBtnOk() {
        driver.findElement(btnOk).click();
    }
}