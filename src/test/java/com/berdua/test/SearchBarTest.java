package com.berdua.test;

import com.berdua.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.berdua.base.TestBase.initialization;
import static com.berdua.base.TestBase.prop;

public class SearchBarTest {
    LoginPage loginPage;
    HomePage homePage;
    TeamPage teamPage;
    SearchPage searchPage;

    public SearchBarTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();
        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        Thread.sleep(5000);
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
        Thread.sleep(5000);
    }



    @Test(priority = 1)
    public void S01_Find_Team_Sekolah_QA_13() {
        homePage.clickTeamCard();

        searchPage.clickSearchBar();
        searchPage.clickTeamSekolahQA();




    }


}
