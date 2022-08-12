package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.BlastPage;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.TeamPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TeamPage teamPage;
    BlastPage blastPage;

    public BlastTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.out.println("Test is started");
        initialization();

        loginPage = new LoginPage();
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        loginPage.clickLoginButton();
        Thread.sleep(1500);
        loginPage.enterEmailField(prop.getProperty("username"));
        Thread.sleep(1500);
        loginPage.clickLoginNextButton();
        Thread.sleep(1500);
        loginPage.enterPasswordField(prop.getProperty("password"));
        Thread.sleep(1500);
        loginPage.clickPassNextButton();
        Thread.sleep(1500);
        loginPage.selectCompanyLabel();
        Thread.sleep(1500);

        Assert.assertEquals(loginPage.validateDashboard(), "Home");
    }
    @Test(priority = 1)
    public void B01_User_directed_to_Blast_page_when_select_Blast_on_dropdown_navigation_bar() throws InterruptedException {
        System.out.println("Test ID: B01");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(1500);
        homePage.selectBlastDrpDwn();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateBlastsLabel(), "Blasts");
        System.out.println("Successfully directed to Blast page");
        System.out.println("Blasts label is displayed: " + blastPage.validateBlastsLabel());
        Thread.sleep(1500);
    }
    @Test(priority = 2)
    public void B02_User_directed_to_Create_a_Blast_page_when_click_Create_Post_bar_button() throws InterruptedException {
        System.out.println("Test ID: B02");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateCreateBlastLabel(), "Create a Blast");
        System.out.println("Successfully directed to Create a Blast page");
        System.out.println("Create a Blast label is displayed: " + blastPage.validateCreateBlastLabel());
        Thread.sleep(1500);
    }
    @Test(priority = 3)
    public void B03_User_create_a_new_post_with_all_completed_fields() throws InterruptedException {
        System.out.println("Test ID: B03");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(1500);
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Successfully created a new post");
        System.out.println("Pop up success message: " + blastPage.validateSuccessPopUpMsg());
        Thread.sleep(1500);
    }
    @Test(priority = 4)
    public void B04_User_cannot_create_a_new_post_if_leaves_Title_field_empty() throws InterruptedException {
        System.out.println("Test ID: B04");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.emptyTitleField("");
        Thread.sleep(1500);
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateErrorPopUpMsg(), "Field parameter not complete.");
        System.out.println("Cannot create a new post");
        System.out.println("Pop up error message: " + blastPage.validateErrorPopUpMsg());
        Thread.sleep(1500);
    }
    @Test(priority = 5)
    public void B05_User_can_still_create_a_new_post_if_leaves_Story_field_empty() throws InterruptedException {
        System.out.println("Test ID: B05");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(1500);
        blastPage.emptyStoryField("");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Still able to create a new post");
        System.out.println("Pop up success message: " + blastPage.validateSuccessPopUpMsg());
        Thread.sleep(1500);
    }
    @Test(priority = 6)
    public void B06_User_search_emoticons_by_typing_emoticons_name() throws InterruptedException {
        System.out.println("Test ID: B06");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.clickTitleEmoticon();
        Thread.sleep(1500);
        blastPage.enterEmoteSearchField(prop.getProperty("emoticonName"));
        Thread.sleep(1500);
        blastPage.clickSpeakingEmoticon();
        Thread.sleep(1500);
        // Highlight the searched emoticon
        WebElement selectedEmoticon = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[3]/section/ul[1]/li/button/img"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.background='yellow'", selectedEmoticon);
        Thread.sleep(1500);
        WebElement speakingEmoticon = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[3]/section/ul[1]/li/button/img"));
        Assert.assertTrue((speakingEmoticon.isDisplayed()));
        System.out.println("Searched emoticon is displayed");
        Thread.sleep(2500);
    }
    @Test(priority = 7)
    public void B07_User_can_change_emoticon_color_by_clicking_color_label() throws InterruptedException {
        System.out.println("Test ID: B07");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.clickTitleEmoticon();
        Thread.sleep(1500);
        blastPage.clickEmoteColorLabel();
        Thread.sleep(1500);
        blastPage.clickBlackLabel();
        Thread.sleep(1500);
        // Validate

    }
    @Test(priority = 8)
    public void B08_User_can_create_a_new_post_with_Bold_text_formatting() throws InterruptedException {
        System.out.println("Test ID: B08");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.enterTitleField("Big Project");
        Thread.sleep(1500);
        blastPage.clickStoryField();
        blastPage.clickBoldIcon();
        blastPage.enterStoryField("this is my story");
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test(priority = 9)
    public void B09_User_can_create_a_new_post_with_Italic_text_formatting() throws InterruptedException {
        System.out.println("Test ID: B09");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(1500);
        blastPage.clickStoryField();
        blastPage.clickItalicIcon();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
        Thread.sleep(1500);
    }
    @Test(priority = 10)
    public void B10_User_can_create_a_new_post_with_Strikethrough_text_formatting() throws InterruptedException {
        System.out.println("Test ID: B10");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(1500);
        teamPage.clickBlastWidget();
        Thread.sleep(1500);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(1500);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(1500);
        blastPage.clickStoryField();
        blastPage.clickStrikethroughIcon();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(1500);
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
        Thread.sleep(1500);
    }
    @Test
    public void B25_User_insert_file_by_drag_and_drop() throws InterruptedException {

    }
    @Test
    public void B26_User_insert_file_by_click_browse_file() throws InterruptedException {

    }
    @Test
    public void B27_User_insert_file_more_than_10_mb() throws InterruptedException {

    }
    @Test
    public void B28_User_insert_file_with_valid_url() throws InterruptedException {
        System.out.println("Test ID: B28");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickByUrl();
        Thread.sleep(2000);
        blastPage.enterByUrlField(prop.getProperty("fileUrl"));
        Thread.sleep(2000);
        blastPage.clickAddUrlButton();
        Thread.sleep(2000);
        // Validate
        Assert.assertEquals(blastPage.validateInsertedLink(), "Url entered is invalid. Please try again.");
        System.out.println("Error");
    }
    @Test
    public void B29_User_insert_file_with_invalid_url() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickByUrl();
        Thread.sleep(2000);
        blastPage.enterByUrlField(prop.getProperty("invFileUrl"));
        Thread.sleep(2000);
        blastPage.clickAddUrlButton();
        Thread.sleep(2000);

        WebElement invalidMsg = driver.findElement(By.className("fr-message"));
        String expectedText = "Url entered is invalid. Please try again.";
        Assert.assertEquals(expectedText, invalidMsg.getText());
        System.out.println("Error message is displayed: " + expectedText);
        //Assert.assertEquals(blastPage.validateInvInsertedLink(), "Url entered is invalid. Please try again.");
    }
    @Test
    public void B30_User_delete_inserted_file() throws InterruptedException {

    }
    @Test
    public void B31_User_upload_inserted_file_to_story_field() throws InterruptedException {

    }
    @Test
    public void B32_User_insert_file_with_valid_embedded_code() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickEmbedCode();
        Thread.sleep(2000);
        blastPage.enterEmbedCodeField(prop.getProperty("validEmbedCode"));
        Thread.sleep(2000);
        blastPage.clickInsertEmbedButton();
        Thread.sleep(4000);

        // Validate inserted file with embedded code is displayed on Story field
        WebElement insValidEmbedCode = driver.findElement(By.id("fr-inserted-file"));
        Assert.assertTrue(insValidEmbedCode.isDisplayed());
        System.out.println("Inserted file with valid embedded code is displayed");
    }
    @Test
    public void B33_User_insert_file_with_invalid_embedded_code() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickEmbedCode();
        Thread.sleep(2000);
        blastPage.enterEmbedCodeField(prop.getProperty("invEmbedCode"));
        Thread.sleep(2000);
        blastPage.clickInsertEmbedButton();
        Thread.sleep(4000);

        // Validate pop up error message
        WebElement invalidMsg = driver.findElement(By.className("fr-message"));
        String expectedText = "Something went wrong. Please try again.";
        Assert.assertEquals(expectedText, invalidMsg.getText());
        System.out.println("Error message is displayed");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("Test is finished");
        driver.quit();
    }
}
