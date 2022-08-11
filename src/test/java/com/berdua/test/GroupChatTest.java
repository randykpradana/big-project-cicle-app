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
        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void GC01_create_as_many_words_aspossible_in_the_Group_Chat_column() throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(1500);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(1500);

        groupChatPage = new GroupChatPage();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(3000);
        groupChatPage.clickSendIcon();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
        public void GC14_The_user_types_in_the_group_chat_using_the_icon_bold_in_group_chat_at_cicle_app_staging_site() throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(1500);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(1500);

        groupChatPage = new GroupChatPage();
        groupChatPage.enterTypeMessageHere("Big Project");
        Thread.sleep(3000);
    }

    @Test(priority = 3)
        public void GC08_User_Input_Link_in_group_chat_atcicle_app_staging_site() throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(1500);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(1500);

        groupChatPage = new GroupChatPage();
        groupChatPage.enterTypeMessageHere("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/62e394ac341d713a982e2243/group-chats/62e394ac341d713a982e2249");
        Thread.sleep(3000);
        groupChatPage.clickSendIcon();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
        public void GC36_Deleting_the_posts_in_the_group_chat_feature_column_something_happened_in_the_staging_cicle_app() throws InterruptedException{
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(1500);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(1500);

        groupChatPage = new GroupChatPage();
        groupChatPage.clickMenuPopUpDelete();
        groupChatPage.clickDeleteMessage();
        groupChatPage.clickBtnDelete();
        Thread.sleep(3000);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

