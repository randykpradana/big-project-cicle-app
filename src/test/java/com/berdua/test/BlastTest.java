package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.BlastPage;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.TeamPage;
import org.junit.Assert;
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

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(2000);
        homePage.selectBlastDrpDwn();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Blast!";
        Assert.assertEquals(expectedTitle, actualTitle);
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
        blastPage.displayCreateBlastLabel();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "New post";
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(5000);
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
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
