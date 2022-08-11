package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.*;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.berdua.base.TestBase.*;

public class SearchBarTest extends TestBase {
   LoginPage loginPage;
   HomePage homePage;
   SearchPage searchPage;

    public SearchBarTest() {
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
    public void S01_Find_Team_Sekolah_QA_13() throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.clickTeamSekolahQA();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sekolah QA 13";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 2)
    public void S02_Find_Team_Your_Big_Project_Here_B2 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.clickTeamB2();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sekolah QA 13";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 3)
    public void S03_Find_Team_Your_Big_Project_Here_B1 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.clickTeamB2();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sekolah QA 13";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 4)
    public void S04_Find_Group_Chat_Sekolah_QA_13 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.enterSearchBar("Group chat Sekolah QA 13");
        Thread.sleep(2000);
        searchPage.clickGroupchatSQA();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Group Chat - Sekolah QA 13";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 5)
    public void S05_Group_Chat_Your_Big_Project_Here_B2 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.enterSearchBar("Group chat Your Big Project Here B-2 ");
        Thread.sleep(2000);
        searchPage.clickGroupchatSQA();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Group Chat - Your Big Project Here B-2 ";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 6)
    public void S06_Group_Chat_Your_Big_Project_Here_B1 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.enterSearchBar("Group chat Your Big Project Here B-1 ");
        Thread.sleep(2000);
        searchPage.clickGroupchatSQA();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Group Chat - Your Big Project Here B-1 ";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 7)
    public void S07_Blast_Sekolah_QA_13 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.enterSearchBar("Blast Sekolah QA 13");
        Thread.sleep(2000);
        searchPage.clickGroupchatSQA();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Blast!";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 8)
    public void S08_Blast_Your_Big_Project_Here_B2 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.enterSearchBar("Blast Your Big Project Here B-2 ");
        Thread.sleep(2000);
        searchPage.clickGroupchatSQA();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Blast!";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 9)
    public void S09_Blast_Your_Big_Project_Here_B1 () throws InterruptedException {
        homePage = new HomePage();

        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickSearchBarField();
        Thread.sleep(2000);
        searchPage.enterSearchBar("Blast Your Big Project Here B-1 ");
        Thread.sleep(2000);
        searchPage.clickGroupchatSQA();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Blast!";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    
}
