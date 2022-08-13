package com.berdua.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.berdua.base.TestBase;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.PrivateChatPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrivateChatTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    PrivateChatPage pvtChatPage;

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

    public PrivateChatTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.out.println("Test is started");

        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("MyReport");
        extent.attachReporter(spark);

        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        pvtChatPage = new PrivateChatPage();

        loginPage.clickLoginButton();
        Thread.sleep(1000);
        loginPage.enterEmailField(prop.getProperty("username"));
        Thread.sleep(1000);
        loginPage.clickLoginNextButton();
        Thread.sleep(1000);
        loginPage.enterPasswordField(prop.getProperty("password"));
        Thread.sleep(1000);
        loginPage.clickPassNextButton();
        Thread.sleep(2000);
        loginPage.selectCompanyLabel();
        Thread.sleep(2000);
        Assert.assertEquals(loginPage.validateDashboard(), "Home");
    }
    @Test(priority = 1)
    public void PC01_User_can_see_Private_Chats_page() throws InterruptedException {

        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Thread.sleep(2000);
        Assert.assertEquals(pvtChatPage.validatePvtChatsLabel(), "Private Chats");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void PC02_User_can_search_chat_history_by_typing_the_profile_name_on_Search_field() throws InterruptedException {

        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Thread.sleep(2000);
        pvtChatPage.enterSearchField(prop.getProperty("profileName"));
        Thread.sleep(2000);
        Assert.assertEquals(pvtChatPage.validateProfileName(), "Randy Pradana_QA13");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void PC03_User_cannot_find_chat_history_if_the_profile_name_does_not_exists() throws InterruptedException {

        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Thread.sleep(2000);
        pvtChatPage.enterSearchField(prop.getProperty("invProfileName"));
        Thread.sleep(2000);
        Assert.assertEquals(pvtChatPage.validateChatHistory(), "There is no recent chats");
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void PC04_User_can_change_section_from_Recent_Chats_to_Contacts() throws InterruptedException {

        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Thread.sleep(2000);
        pvtChatPage.clickMsgIcon();
        Thread.sleep(2000);
        Assert.assertEquals(pvtChatPage.validateContactsSection(), "Contacts");
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void PC05_User_can_search_team_members_by_profile_name_in_Contact_section() throws InterruptedException {

        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Thread.sleep(2000);
        pvtChatPage.clickMsgIcon();
        Thread.sleep(2000);
        pvtChatPage.enterSearchField(prop.getProperty("memberName"));
        Assert.assertEquals(pvtChatPage.validateMemberName(), "berdua testing");
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void PC06_User_cannot_find_the_contacts_of_members_who_are_not_registered_as_part_of_the_team() throws InterruptedException {

        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Thread.sleep(2000);
        pvtChatPage.clickMsgIcon();
        Thread.sleep(2000);
        pvtChatPage.enterSearchField(prop.getProperty("invMemberName"));
        Assert.assertEquals(pvtChatPage.validateInvMemberName(), "There is no members");
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void PC07_User_can_send_message_with_presentation_file_extensions_attachments() throws InterruptedException {

        homePage.clickProfileIcon();
        Thread.sleep(2000);
        homePage.clickPvtChatIcon();
        Thread.sleep(2000);
        pvtChatPage.clickMsgIcon();
        Thread.sleep(2000);
        pvtChatPage.enterSearchField(prop.getProperty("profileName"));
        Thread.sleep(2000);
        pvtChatPage.clickHighlightedProfile();
        Thread.sleep(2000);
        pvtChatPage.clickAttachIcon();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown() {
        extent.flush();
        driver.quit();
    }
}
