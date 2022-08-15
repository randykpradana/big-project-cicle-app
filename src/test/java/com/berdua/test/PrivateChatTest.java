package com.berdua.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.berdua.base.TestBase;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.PrivateChatPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class PrivateChatTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    PrivateChatPage pvtChatPage;

    static ExtentReports extent;
    ExtentSparkReporter sparkReporter;

    public PrivateChatTest() {
        super();
    }
    @BeforeSuite
    public void BeforeSuite() {
        extent = new ExtentReports();
        sparkReporter = new ExtentSparkReporter("PrivateChatTestReports.html");
        extent.attachReporter(sparkReporter);
    }
    @AfterSuite
    public void AfterSuite() {
        extent.flush();
    }

    @BeforeMethod
    public void initialStart() throws InterruptedException {
        System.out.println("Test starts");
        Thread.sleep(2000);
        initialization();

        loginPage = new LoginPage();
        homePage = new HomePage();
        pvtChatPage = new PrivateChatPage();

        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        loginPage.selectCompanyLabel();
        // Validate
        Assert.assertEquals(loginPage.validateDashboard(), "Home");
        System.out.println("User already logged in, landing on: " + loginPage.validateDashboard());
    }
    @Test(priority = 1)
    public void PC01_User_can_see_Private_Chats_page() throws InterruptedException {
        ExtentTest test = extent.createTest("PC01_User_can_see_Private_Chats_page");
        System.out.println("Test ID: PC01");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validatePvtChatsLabel(), "Private Chats");
        System.out.println("System can display: " + pvtChatPage.validatePvtChatsLabel());

    }
    @Test(priority = 2)
    public void PC02_User_can_search_chat_history_by_typing_the_profile_name_on_Search_field() throws InterruptedException {
        ExtentTest test = extent.createTest("PC02_User_can_search_chat_history_by_typing_the_profile_name_on_Search_field");
        System.out.println("Test ID: PC02");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField(prop.getProperty("profileName"));
        // Validate
        Assert.assertEquals(pvtChatPage.validateProfileName(), "Randy Pradana_QA13");
        System.out.println("System show the profile: " + pvtChatPage.validateProfileName());

    }
    @Test(priority = 3)
    public void PC03_User_cannot_find_chat_history_if_the_profile_name_does_not_exists() throws InterruptedException {
        ExtentTest test = extent.createTest("PC03_User_cannot_find_chat_history_if_the_profile_name_does_not_exists");
        System.out.println("Test ID: PC03");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField(prop.getProperty("invProfileName"));
        // Validate
        Assert.assertEquals(pvtChatPage.validateChatHistory(), "There is no recent chats");
        System.out.println("System show the message: " + pvtChatPage.validateChatHistory());

    }
    @Test(priority = 4)
    public void PC04_User_can_change_section_from_Recent_Chats_to_Contacts() throws InterruptedException {
        ExtentTest test = extent.createTest("PC04_User_can_change_section_from_Recent_Chats_to_Contacts");
        System.out.println("Test ID: PC04");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.clickMsgIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateContactsSection(), "Contacts");
        System.out.println("System can display: " + pvtChatPage.validateContactsSection());

    }
    @Test(priority = 5)
    public void PC05_User_can_search_team_members_by_profile_name_in_Contact_section() throws InterruptedException {
        ExtentTest test = extent.createTest("PC05_User_can_search_team_members_by_profile_name_in_Contact_section");
        System.out.println("Test ID: PC05");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.clickMsgIcon();
        pvtChatPage.enterSearchField(prop.getProperty("memberName"));
        // Validate
        Assert.assertEquals(pvtChatPage.validateMemberName(), "randy testing");
        System.out.println("System display the profile: " + pvtChatPage.validateMemberName());
    }
    @Test(priority = 6)
    public void PC06_User_cannot_find_the_contacts_of_members_who_are_not_registered_as_part_of_the_team() throws InterruptedException {
        ExtentTest test = extent.createTest("PC06_User_cannot_find_the_contacts_of_members_who_are_not_registered_as_part_of_the_team");
        System.out.println("Test ID: PC06");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.clickMsgIcon();
        pvtChatPage.enterSearchField(prop.getProperty("invMemberName"));
        // Validate
        Assert.assertEquals(pvtChatPage.validateInvMemberName(), "There is no members");
        System.out.println("System show the message: " + pvtChatPage.validateInvMemberName());
    }
    @Test(priority = 7)
    public void PC15_User_can_download_attached_file() throws InterruptedException {
        ExtentTest test = extent.createTest("PC15_User_can_download_attached_file");
        System.out.println("Test ID: PC15");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.clickMsgTextBox();
        pvtChatPage.clickDownloadLink();
        // Validate
    }
    @Test(priority = 8)
    public void PC16_User_can_delete_message_that_has_been_sent() throws InterruptedException {
        ExtentTest test = extent.createTest("PC16_User_can_delete_message_that_has_been_sent");
        System.out.println("Test ID: PC16");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.clickMsgTextBox();
        pvtChatPage.clickMsgDrpDwn();
        pvtChatPage.clickDltMsgLabel();
        pvtChatPage.clickDeleteButton();
        // Validate
        Assert.assertEquals(pvtChatPage.validateSuccessDeleteMsg(), "Delete chat message success");
        System.out.println("System display: " + pvtChatPage.validateSuccessDeleteMsg());
    }
    @Test(priority = 9)
    public void PC17_User_can_add_emoticon_on_the_chat_field() throws InterruptedException {
        ExtentTest test = extent.createTest("PC17_User_can_add_emoticon_on_the_chat_field");
        System.out.println("Test ID: PC17");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickEmoticonsIcon();
        pvtChatPage.clickSmileIcon();
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertTrue(pvtChatPage.validateEnteredEmoticon());
        System.out.println("Successfully entered the emoticon");
    }
    @Test(priority = 10)
    public void PC18_User_can_enter_text_with_Bold_text_formatting() throws InterruptedException {
        ExtentTest test = extent.createTest("PC18_User_can_enter_text_with_Bold_text_formatting");
        System.out.println("Test ID: PC18");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickBoldIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateBoldText(), "leh uga L");
        System.out.println("At this point the entered text: " + pvtChatPage.validateBoldText() +
                " - is changed to bold");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispTextIsBold(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @Test(priority = 11)
    public void PC19_User_can_enter_text_with_Italic_text_formatting() throws InterruptedException {
        ExtentTest test = extent.createTest("PC19_User_can_enter_text_with_Italic_text_formatting");
        System.out.println("Test ID: PC19");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickItalicIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateItalicText(), "leh uga L");
        System.out.println("At this point the entered text: " + pvtChatPage.validateItalicText() +
                " - is changed to italic");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispTextIsItalic(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @Test(priority = 12)
    public void PC20_User_can_enter_text_with_Underline_text_formatting() throws InterruptedException {
        ExtentTest test = extent.createTest("PC20_User_can_enter_text_with_Underline_text_formatting");
        System.out.println("Test ID: PC20");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickUnderlineIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateUnderlineText(), "leh uga L");
        System.out.println("At this point the entered text: " + pvtChatPage.validateItalicText() +
                " - is changed to underline");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispUnderlineText(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @Test(priority = 13)
    public void PC21_User_can_enter_text_with_Strikethrough_text_formatting() throws InterruptedException {
        ExtentTest test = extent.createTest("PC21_User_can_enter_text_with_Strikethrough_text_formatting");
        System.out.println("Test ID: PC21");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickStrikethroughIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateStrikethroughText(), "leh uga L");
        System.out.println("At this point the entered text: " + pvtChatPage.validateItalicText() +
                " - is changed to strikethrough");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispStrikethroughText(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @Test(priority = 14)
    public void PC22_User_can_enter_text_with_Ordered_List_text_formatting() throws InterruptedException {
        ExtentTest test = extent.createTest("PC22_User_can_enter_text_with_Ordered_List_text_formatting");
        System.out.println("Test ID: PC22");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickOrdListIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateOrdList(), "leh uga L");
        System.out.println("At this point the entered text: " + pvtChatPage.validateOrdList() +
                " - is changed to ordered list format");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispOrdList(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @Test(priority = 15)
    public void PC23_User_can_enter_text_with_Unordered_List_text_formatting() throws InterruptedException {
        ExtentTest test = extent.createTest("PC23_User_can_enter_text_with_Unordered_List_text_formatting");
        System.out.println("Test ID: PC23");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickUndList();
        // Validate
        Assert.assertEquals(pvtChatPage.validateUndList(), "leh uga L");
        System.out.println("At this point the entered text: " + pvtChatPage.validateUndList() +
                " - is changed to ordered list format");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispUndList(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @Test(priority = 16)
    public void PC24_User_can_select_another_Unordered_List_text_formatting_style() throws InterruptedException {
        ExtentTest test = extent.createTest("PC24_User_can_select_another_Unordered_List_text_formatting_style");
        System.out.println("Test ID: PC24");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickUndListDrpDwn();
        // Validate
        Assert.assertEquals(pvtChatPage.validateCircleUndListFormat(), "leh uga L");
        System.out.println("At this point the entered text: " + pvtChatPage.validateCircleUndListFormat() +
                " - is changed to unordered list circle format");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispCircleUndList(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @Test(priority = 17)
    public void PC25_User_can_enter_text_with_background_color() throws InterruptedException {
        ExtentTest test = extent.createTest("PC25_User_can_enter_text_with_background_color");
        System.out.println("Test ID: PC25");
        // Steps
        homePage.clickProfileIcon();
        homePage.clickPvtChatIcon();
        pvtChatPage.enterSearchField("randy pradana");
        pvtChatPage.clickSearchedProfile();
        pvtChatPage.enterMsgField("leh uga L");
        pvtChatPage.blockEnteredText();
        pvtChatPage.clickBgColorIcon();
        pvtChatPage.selectBlueBgColor();
        // Validate
        Assert.assertEquals(pvtChatPage.validateBlueBgTextColor(), "leh uga L");
        System.out.println("At this point the entered text background color: " + pvtChatPage.validateBlueBgTextColor() +
                " - is changed to blue");
        pvtChatPage.clickMsgField();
        pvtChatPage.clickSendIcon();
        // Validate
        Assert.assertEquals(pvtChatPage.validateDispBlueBgTextColor(), "leh uga L");
        System.out.println("Successfully displayed on the chat section");
    }
    @AfterMethod
    public void endOfTest() throws InterruptedException {
        System.out.println("Test is finished");
        Thread.sleep(2000);
        driver.quit();
    }
}
