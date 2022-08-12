package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.*;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TeamPage teampage;
    BoardPage boardPage;

    public BoardTest() {
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

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test(priority = 1)
    public void KB01_Add_card() throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickAddCard1();
        Thread.sleep(2000);
        boardPage.enterCardName("mencoba");
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "mencoba";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 2)
    public void KB20_Add_list() throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickAddList();
        Thread.sleep(2000);
        boardPage.enterlabelName("Mencoba");
    }

    @Test(priority = 3)
    public void KB38_Filter_Due_Soon() throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.clickFilterDueSoon();
    }

}