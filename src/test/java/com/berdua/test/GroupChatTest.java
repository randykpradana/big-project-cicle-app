package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupChatTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    GroupChatPage groupChatPage;

    public GroupChatTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        groupChatPage = new GroupChatPage();

        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
    }
    @Test(priority = 1)
    public void GC26Download_file_Excel() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.clickDownloadExcel();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void GC36Deleting_the_posts_in_the_group_chat_feature_column_something_happened_in_the_staging_cicle_app() throws InterruptedException{
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.clickKhususDelete();
        groupChatPage.clickDownArrow_logo();
        groupChatPage.clickDeleteMessage_button();
        groupChatPage.clickDeleteButton_popup();
        Assert.assertEquals(groupChatPage.DeleteMessege(),"Delete group chat message success");
    }
    @Test(priority = 3)
    public void GC01_create_as_many_words_aspossible_in_the_Group_Chat_column() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(), "Big Project");
    }

    @Test(priority = 4)
    public void GC08_User_Input_Link_in_group_chat_atcicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/62e394ac341d713a982e2243/group-chats/62e394ac341d713a982e2249");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(), "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/62e394ac341d713a982e2243/group-chats/62e394ac341d713a982e2249");
    }
    @Test(priority = 5)
    public void GC14The_user_types_in_the_group_chat_using_the_icon_bold_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickBold();
        Thread.sleep(5000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(),"Big Project");
    }
    @Test(priority = 6)
    public void GC15The_user_types_in_the_group_chat_using_the_icon_Italic_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickItalic();
        Thread.sleep(5000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(),"Big Project");
    }
    @Test(priority = 7)
    public void GC16The_user_types_in_the_group_chat_using_the_icon_strikethrough_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickStrikeThough();
        Thread.sleep(5000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(), "Big Project");
    }
    @Test(priority = 8)
    public void GC17The_users_types_in_the_group_chat_using_the_icon_Bold_italic_and_strikethrough_in_group_chat_at_cicle_app_staging_site() throws InterruptedException{
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickBold();
        Thread.sleep(5000);
        groupChatPage.clickItalic();
        Thread.sleep(2000);
        groupChatPage.clickStrikeThough();
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(),"Big Project");
    }
    @Test(priority = 9)
    public void GC18The_users_types_in_the_group_chat_using_the_icon_underline_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickUnderline();
        Thread.sleep(5000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(),"Big Project");
    }
    @Test(priority = 10)
    public void GC19The_users_types_in_the_group_chat_using_the_icon_ordered_list_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickOrderedList();
        Thread.sleep(5000);
        groupChatPage.ClickTab();
        groupChatPage.EnterKey();
        Thread.sleep(2000);
        groupChatPage.Enter();
        groupChatPage.SpaceKey();
        groupChatPage.EnterType("Project");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickTitle1(),"Big Project");
        Assert.assertEquals(groupChatPage.clcikTitle2(), "Project");
    }
    @Test(priority = 11)
    public void GC20The_users_types_in_the_group_chat_using_the_icon_unordered_list_Default_in_group_chat_at_cicle_app_staging_site() throws InterruptedException{
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickUnorderedlist();
        Thread.sleep(2000);
        groupChatPage.clickDefault();
        Thread.sleep(3000);
        groupChatPage.ClickTab();
        groupChatPage.EnterKey();
        Thread.sleep(2000);
        groupChatPage.InputText("Project");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickTitle1(),"Big Project");
        Assert.assertEquals(groupChatPage.clcikTitle2(), "Project");
    }
    @Test (priority =12)
    public void GC21The_users_types_in_the_group_chat_using_the_icon_unordered_list_Circle_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickUnorderedlist();
        Thread.sleep(2000);
        groupChatPage.clickCircle();
        Thread.sleep(2000);
        groupChatPage.ClickTab();
        groupChatPage.EnterKey();
        Thread.sleep(2000);
        groupChatPage.InputText("Project");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickTitle1(),"Big Project");
        Assert.assertEquals(groupChatPage.clcikTitle2(), "Project");
    }
    @Test (priority =13)
    public void GC22The_users_types_in_the_group_chat_using_the_icon_unordered_list_Disc_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickUnorderedlist();
        Thread.sleep(2000);
        groupChatPage.clickDisc();
        Thread.sleep(2000);
        groupChatPage.ClickTab();
        groupChatPage.EnterKey();
        Thread.sleep(2000);
        groupChatPage.InputText("Project");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickTitle1(),"Big Project");
        Assert.assertEquals(groupChatPage.clcikTitle2(), "Project");
    }
    @Test (priority =14)
    public void GC23The_users_types_in_the_group_chat_using_the_icon_unordered_list_Square_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickUnorderedlist();
        Thread.sleep(2000);
        groupChatPage.clickSquare();
        Thread.sleep(2000);
        groupChatPage.ClickTab();
        groupChatPage.EnterKey();
        Thread.sleep(2000);
        groupChatPage.InputText("Project");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickTitle1(),"Big Project");
        Assert.assertEquals(groupChatPage.clcikTitle2(), "Project");
    }
    @Test (priority =15)
    public void GC24The_users_types_in_the_group_chat_using_the_icon_Background_Color_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickBackGround();
        Thread.sleep(2000);
        groupChatPage.clickColor();
        Thread.sleep(3000);
        Thread.sleep(3000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(),"Big Project");
    }
    @Test(priority = 16)
    public void GC24The_users_types_in_the_group_chat_using_the_icon_Emoticons_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(2000);
        groupChatPage.swifeleft_BigProjectMessage_select();
        Thread.sleep(2000);
        groupChatPage.clickemoticons();
        Thread.sleep(2000);
        groupChatPage.clickemoticons1();
        Thread.sleep(5000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(),"Big Project");
    }

    @Test(priority = 17)
    public void GC034_Send_icon_in_the_group_chat_column_an_erorr_occurred() throws InterruptedException {
        homePage.clickTeamCard();
        Thread.sleep(2000);
        groupChatPage.clickGroupChatFeature();
        groupChatPage.enterTypeMessageHere("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Thread.sleep(2000);
        groupChatPage.clickSendIcon();
        Thread.sleep(2000);
        Assert.assertEquals(groupChatPage.clickMessageContent(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}

