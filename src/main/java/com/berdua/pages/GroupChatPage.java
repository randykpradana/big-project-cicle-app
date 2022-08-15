package com.berdua.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.berdua.base.TestBase.driver;

public class GroupChatPage {
    //GC
    public GroupChatPage() {
        PageFactory.initElements(driver, "62e394ac341d713a982e2243/group-chats/62e394ac341d713a982e2249");
    }
    By GroupChat_feature = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/a/div");
    By addTypeMessageHere = By.xpath("//div[@class='fr-element fr-view']//p");
    By SendIcon = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[3]/div/div");
    //**Actions
    public void clickGroupChatFeature() {
        driver.findElement(GroupChat_feature).click();
    }
    public void enterTypeMessageHere(String Text) {
        driver.findElement(addTypeMessageHere).sendKeys(Text);
    }
    public void clickSendIcon() {
        driver.findElement(SendIcon).click();
    }

    //GC14 The user types in the group chat using the icon bold in group chat at cicle app staging site Delete Massage
        //**Locator And Actions
    public void swifeleft_BigProjectMessage_select() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p")).sendKeys(Keys.CONTROL + "a");}
        //title
    By Bold = By.xpath("//*[@id=\"bold-2\"]");
    By Italic = By.xpath("//*[@id=\"italic-2\"]");
    By underline = By.xpath("//*[@id=\"underline-2\"]");
    By strikeThrough = By.xpath("//*[@id=\"strikeThrough-2\"]");
    By orderedlist = By.xpath("//*[@id=\"formatOLSimple-2\"]");
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


    //** GC19
    public void ClickTab(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div")).click();
    }
    public void Enter(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/ol/li[2]")).click();
    }
    public void EnterKey(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div")).sendKeys(Keys.ENTER);
    }
    public void SpaceKey() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/ol/li[2]")).sendKeys(Keys.SPACE);
    }
    By AddEnterType = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/ol/li[2]");
    public void EnterType(String Text){
        driver.findElement(AddEnterType).sendKeys(Text);
    }

    //GC36 (priority 16 (Delete Message)
        //**Locator
    By KhususDelete = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[2]/div/div/div[1]/div[2]/div/p");
    By DownArrow_logo = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[2]/div/div/div[1]/div[1]");
    By DeleteMessage_button = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div/div");
    By DeleteButton_popup = By.xpath("/html/body/div[5]/div/div/div[3]/button/div");
        //** Actions
    public void clickDownArrow_logo() {
        driver.findElement(DownArrow_logo).click();
    }
    public void clickDeleteMessage_button() {
        driver.findElement(DeleteMessage_button).click();
    }
    public void clickDeleteButton_popup() {
        driver.findElement(DeleteButton_popup).click();
    }
    public  void clickKhususDelete() {
        driver.findElement(KhususDelete).click();
    }

    //DownloadExcel
    By DownloadExcel = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/a");

    //**Actions
    public void clickDownloadExcel() {
        driver.findElement(DownloadExcel).click();
    }


    //Unorderedlist
    //**Locator
    By UnorderedList = By.xpath("//*[@id=\"formatULOptions-2\"]");
    //**Actions
    public void clickUnorderedlist() {
        driver.findElement(UnorderedList).click();
    }

        //Default
        //Locator
    By Default = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[1]/a");
    By InputText = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/ul/li[2]");
        //Actions
    public void clickDefault() {
        driver.findElement(Default).click();
    }
    public void InputText(String Text) {
        driver.findElement(InputText).sendKeys(Text);
    }
        //Circle
    By Circle = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[2]/a");
    public void clickCircle() {
        driver.findElement(Circle).click();
    }
        //Disc
    By Disc = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[3]/a");
    public void clickDisc() {
        driver.findElement(Disc).click();
    }
        //Square
    By Square = By.xpath("//*[@id=\"dropdown-menu-formatULOptions-2\"]/div/div/ul/li[4]/a");
    public void clickSquare() {
        driver.findElement(Square).click();
    }

    //backgroundColor
    By backgroundColor = By.xpath("//*[@id=\"backgroundColor-2\"]");
    public void clickBackGround (){
        driver.findElement(backgroundColor).click();
    }
    //Warna 1
    By Color = By.xpath("/html/body/div[5]/div[2]/span[11]");
    public void clickColor (){
        driver.findElement(Color).click();
    }
    By btnOk = By.className("fr-command fr-submit");
    public void clickButtonOK () {
        driver.findElement(btnOk).click();
    }

    //Emoticons
    By Emoticons = By.xpath("//button[@id='emoticons-2']//*[name()='svg']");
    public void clickemoticons () {
        driver.findElement(Emoticons).click();
    }

    By Emoticons1 = By.xpath("/html/body/div[5]/div[3]/span[1]");
    public void clickemoticons1 () {
        driver.findElement(Emoticons1).click();
    }

    //Assert
        //**GC (priority 3-9) , (priority 15-17)
    By messageContent= By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]");
    public String clickMessageContent(){
        return driver.findElement(messageContent).getText();
    }

        //** (priority 10-14).
    By TitleBigProject = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/ul/li[1]");
    By TitleProject = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[2]/div/ul/li[2]");
    public String clickTitle1(){
        return driver.findElement(TitleBigProject).getText();
    }
    public String clcikTitle2(){
        return driver.findElement(TitleProject).getText();
    }

        //** (priority 16) Delete Chat
    By DeleteMessage = By.id("notistack-snackbar");
    public String DeleteMessege(){
        return driver.findElement(DeleteMessage).getText();
}

}