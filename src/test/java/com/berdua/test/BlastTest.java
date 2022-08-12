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
        Thread.sleep(1000);
        loginPage.enterEmailField(prop.getProperty("username"));
        Thread.sleep(1000);
        loginPage.clickLoginNextButton();
        Thread.sleep(1000);
        loginPage.enterPasswordField(prop.getProperty("password"));
        Thread.sleep(1000);
        loginPage.clickPassNextButton();
        Thread.sleep(1000);
        loginPage.selectCompanyLabel();
        Thread.sleep(1000);
        Assert.assertEquals(loginPage.validateDashboard(), "Home");
    }
    @Test(priority = 1)
    public void B01_User_directed_to_Blast_page_when_select_Blast_on_dropdown_navigation_bar() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(2000);
        homePage.selectBlastDrpDwn();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateBlastsLabel(), "Blasts");
    }
    @Test(priority = 2)
    public void B02_User_directed_to_Create_a_Blast_page_when_click_Create_Post_bar_button() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);

        Assert.assertEquals(blastPage.validateCreateBlastLabel(), "Create a Blast");
    }
    @Test(priority = 3)
    public void B03_User_create_a_new_post_with_all_completed_fields() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterPostTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 4)
    public void B04_User_cannot_create_a_new_post_if_leaves_Title_field_empty() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.emptyPostTitleField("");
        Thread.sleep(2000);
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateErrorPopUpMsg(), "Field parameter not complete.");
    }
    @Test(priority = 5)
    public void B05_User_can_still_create_a_new_post_if_leaves_Story_field_empty() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterPostTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.emptyPostStoryField("");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 6)
    public void B06_User_search_emoticons_by_typing_emoticons_name() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickTitleEmoticon();
        Thread.sleep(2000);
        blastPage.enterEmoteSearchField(prop.getProperty("emoticonName"));
        Thread.sleep(2000);
        blastPage.clickSpeakingEmoji();
        Thread.sleep(2000);
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 7)
    public void B07_User_can_change_emoticon_color_by_clicking_color_label() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickTitleEmoticon();
        Thread.sleep(2000);
        blastPage.clickEmoteColorLabel();
        Thread.sleep(2000);
        blastPage.clickBlackLabel();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void B08_User_can_create_a_new_post_with_Bold_text_formatting() throws InterruptedException {

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterPostTitleField("Big Project");
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickBoldIcon();
        blastPage.enterPostStoryField("this is my story");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 9)
    public void B09_User_can_create_a_new_post_with_Italic_text_formatting() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterPostTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickItalicIcon();
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 10)
    public void B10_User_can_create_a_new_post_with_Strikethrough_text_formatting() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterPostTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStrikethroughIcon();
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(3000);
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
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
        blastPage.enterByUrlField(prop.getProperty("fileUrl"));
        Thread.sleep(2000);
        blastPage.clickAddUrlButton();
        Thread.sleep(2000);
        Assert.assertEquals(blastPage.validateInsertedLink(), "Url entered is invalid. Please try again.");
        Thread.sleep(3000);
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
        System.out.println("Error message is displayed");
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
