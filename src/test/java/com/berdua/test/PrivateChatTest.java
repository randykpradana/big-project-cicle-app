package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrivateChatTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    PrivateChatPage pvtChatPage;

    public PrivateChatTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();

        loginPage.clickLoginButton();
        Thread.sleep(1000);
        loginPage.enterEmailField(prop.getProperty("username"));
        Thread.sleep(1000);
        loginPage.clickLoginNextButton();
        Thread.sleep(1000);
        loginPage.enterPasswordField(prop.getProperty("password"));
        Thread.sleep(1000);
        loginPage.clickPassNextButton();
        Thread.sleep(3000);
        loginPage.selectCompanyLabel();
        Thread.sleep(3000);
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
    }
    @Test(priority = 1)
    public void PC01_User_can_see_Private_Chats_page() throws InterruptedException {
        homePage = new HomePage();
        pvtChatPage = new PrivateChatPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Assert.assertEquals(pvtChatPage.validatePvtChatsLabel(), "Private Chats");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
