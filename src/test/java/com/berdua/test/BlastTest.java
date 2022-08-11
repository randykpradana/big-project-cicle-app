package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.BlastPage;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.TeamPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    public void B01_User_directed_to_Blast_page_when_select_Blast_on_dropdown_navigation_bar() throws InterruptedException {
        homePage = new HomePage();
        blastPage = new BlastPage();

        homePage.clickTeamCard();
        System.out.println();
        Thread.sleep(2000);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(4000);
        homePage.selectBlastDrpDwn();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateBlastsLabel(), "Blasts");
    }
    @Test(priority = 2)
    public void B02_User_directed_to_Create_a_Blast_page_when_click_Create_Post_bar_button() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        teamPage.clickBlastWidget();
        Thread.sleep(2000);

        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        org.testng.Assert.assertEquals(blastPage.validateCreateBlastLabel(), "Create a Blast");
    }
    @Test(priority = 3)
    public void B03_User_create_a_new_post_with_all_completed_fields() throws InterruptedException {
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
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 4)
    public void B04_User_cannot_create_a_new_post_if_leaves_Title_field_empty() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

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
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateErrorPopUpMsg(), "Field parameter not complete.");
    }
    @Test(priority = 5)
    public void B05_User_can_still_create_a_new_post_if_leaves_Story_field_empty() throws InterruptedException {
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
        blastPage.emptyPostStoryField("");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 6)
    public void B06_User_search_emoticons_by_typing_emoticons_name() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

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
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @Test(priority = 7)
    public void B07_User_can_change_emoticon_color_by_clicking_color_label() throws InterruptedException {
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

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
        WebElement scroll = driver.findElement(By.cssSelector("#root > div.Main_container__39jS7 > div.Main_mainCol__3MC7n > div > div > div.CreateBlastPage_headerSection__hFvYv > div > div > aside > div.content-wrapper > section"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
    }
    @Test(priority = 8)
    public void B08_User_can_create_a_new_post_with_Bold_text_formatting() throws InterruptedException {
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
        blastPage.clickBoldIcon();
        //WebElement bold = driver.findElement(By.className("fr-command fr-btn"));
        //((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('aria-pressed',true);", bold);
        Thread.sleep(1000);
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
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
        //WebElement bold = driver.findElement(By.className("fr-command fr-btn"));
        //((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('aria-pressed',true);", bold);
        Thread.sleep(1000);
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
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
        //WebElement bold = driver.findElement(By.className("fr-command fr-btn"));
        //((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('aria-pressed',true);", bold);
        Thread.sleep(1000);
        blastPage.enterPostStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        blastPage.clickPublishButton();
        Thread.sleep(4000);
        org.testng.Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
