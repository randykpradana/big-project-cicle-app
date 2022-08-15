package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test(priority = 1)
    public void S01_Find_Team_Sekolah_QA_13() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        driver.get("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/620392e96df2f624cb8610f5");
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sekolah QA 13";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 2)
    public void S02_Find_Team_Your_Big_Project_Here_B2 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        searchPage.clickTeamB2();
        Thread.sleep(2000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Your Big Project Here B-2";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 3)
    public void S03_Find_Team_Your_Big_Project_Here_B1 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        searchPage.clickTeamB1();
        Thread.sleep(2000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Your Big Project Here B-1";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 4)
    public void S04_Find_Group_Chat_Sekolah_QA_13 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickTeamCard();
        Thread.sleep(2000);

        homePage.clickSearchBarField();
        Thread.sleep(2000);
        String keyword = "Group chat Sekolah QA 13";
        homePage.enterSearchBar(keyword);

        Thread.sleep(2000);

        String expectedTitle = "Group chat Sekolah QA 13";
        Assert.assertEquals(expectedTitle, keyword);
    }
    @Test(priority = 5)
    public void S05_Group_Chat_Your_Big_Project_Here_B2 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Group Chat Your Big Project Here B-2");
        Thread.sleep(2000);

        searchPage.clickGroupchatB2();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Group Chat Your Big Project Here B-2";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Test(priority = 6)
    public void S06_Group_Chat_Your_Big_Project_Here_B1 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Group Chat Your Big Project Here B-1");
        Thread.sleep(2000);

        searchPage.clickGroupchatB1();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Group Chat Your Big Project Here B-1";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 7)
    public void S07_Blast_Sekolah_QA_13 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Blast Sekolah QA 13");
        Thread.sleep(2000);

        searchPage.clickBlastSQA();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Blast!";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test(priority = 8)
    public void S08_Blast_Your_Big_Project_Here_B2 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Blast Your Big Project Here B-2");
        Thread.sleep(2000);

        searchPage.clickBlastB2();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Blast!";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 9)
    public void S09_Blast_Your_Big_Project_Here_B1 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Blast Your Big Project Here B-1");
        Thread.sleep(2000);

        searchPage.clickBlastB1();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Blast!";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 10)
    public void S10_Schedule_Sekolah_QA_13 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Schedule Sekolah QA 13");
        Thread.sleep(2000);

        searchPage.clickScheduleSQA();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Schedule";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 11)
    public void S11_Schedule_Your_Big_Project_Here_B2 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Schedule Your Big Project Here B2");
        Thread.sleep(2000);

        searchPage.clickScheduleB2();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Schedule";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 12)
    public void S12_Schedule_Your_Big_Project_Here_B1 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Schedule Your Big Project Here B1");
        Thread.sleep(2000);

        searchPage.clickScheduleB1();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Schedule";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 13)
    public void S13_Kanban_Board_Sekolah_QA_13 () throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Kanban Board Sekolah QA 13");
        Thread.sleep(2000);

        searchPage.clickBoardSQA();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Kanban Board - Sekolah QA 13";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 14)
    public void S14_Kanban_Your_Big_Project_Here_B2() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Kanban Your Big Project Here B2");
        Thread.sleep(2000);

        searchPage.clickBoardB2();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Kanban Board - Your Big Project Here B-2";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 15)
    public void S15_Kanban_Your_Big_Project_Here_B1() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Kanban Your Big Project Here B1");
        Thread.sleep(2000);

        searchPage.clickBoardB1();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Kanban Board - Your Big Project Here B-1";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 16)
    public void S16_Check_in_Sekolah_QA_13() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Check in Sekolah QA 13");
        Thread.sleep(2000);

        searchPage.clickCheckinSQA();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Check-Ins";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 17)
    public void S17_Check_in_Your_Big_Project_Here_B2() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Check in Your Big Project Here B-2");
        Thread.sleep(2000);

        searchPage.clickCheckinB2();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Check-Ins";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 18)
    public void S18_Check_in_Your_Big_Project_Here_B1() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Check in Your Big Project Here B-1");
        Thread.sleep(2000);

        searchPage.clickCheckinB1();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Check-Ins";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 19)
    public void S19_Docs_And_File_Sekolah_QA_13() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Docs & file Sekolah QA 13");
        Thread.sleep(2000);

        searchPage.clickDocsSQA();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Docs & Files";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Test(priority = 20)
    public void S20_Docs_And_File_Your_Big_Project_Here_B2() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Docs & file Your Big Project Here B-2");
        Thread.sleep(2000);

        searchPage.clickDocsB2();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Docs & Files";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 21)
    public void S21_Docs_And_File_Your_Big_Project_Here_B1() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Docs & file Your Big Project Here B-1");
        Thread.sleep(2000);

        searchPage.clickDocsB1();
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Docs & Files";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(priority = 21)
    public void S22_Invalid_search_item() throws InterruptedException {
        homePage = new HomePage();
        searchPage = new SearchPage();

        homePage.clickSearchBarField();
        Thread.sleep(2000);

        homePage.enterSearchBar("Coffee");
        Thread.sleep(2000);

        //Assertion
        searchPage.getNotFound();
        Thread.sleep(2000);

    }


}
