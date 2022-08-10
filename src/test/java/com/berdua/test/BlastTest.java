package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.helper.Login;
import com.berdua.pages.BlastPage;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.TeamPage;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends TestBase {
    /**
     * Helper Start
     */
    Login loginHelper;
    /**
     * Helper End
     */
    LoginPage loginPage;
    HomePage homePage;
    TeamPage teamPage;
    BlastPage blastPage;

    public BlastTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginHelper.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void B01_User_directed_to_Blast_page_when_select_Blast_on_dropdown_navigation_bar() {
        homePage.clickNavbarDrpDwnIcon();
        homePage.selectBlastDrpDwn();

        blastPage.displayBlastsLabel();
        Assert.assertEquals("Blast", "Blast");
    }
    @Test(priority = 2)
    public void B02_User_directed_to_Create_a_Blast_page_when_click_Create_Post_bar_button() {
        homePage.clickNavbarDrpDwnIcon();
        homePage.selectBlastDrpDwn();

        teamPage.clickBlastWidget();

        blastPage.clickCreateBlastBarBtn();
        blastPage.displayCreateBlastLabel();
        Assert.assertEquals("Create a Blast", "Create a Blast");
    }
    @Test(priority = 3)
    public void User_create_a_new_post_with_all_completed_fields() {
        homePage.clickNavbarDrpDwnIcon();
        homePage.selectBlastDrpDwn();

        teamPage.clickBlastWidget();

        blastPage.clickCreateBlastBarBtn();
        blastPage.displayCreateBlastLabel();
        Assert.assertEquals("Create a Blast", "Create a Blast");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
