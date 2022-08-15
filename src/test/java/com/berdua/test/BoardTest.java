package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static java.awt.SystemColor.text;
import static org.junit.Assert.assertTrue;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;

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
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickAddCard1();
        Thread.sleep(2000);
        boardPage.enterCardName("mencoba");
        Thread.sleep(2000);
        boardPage.clickAddCard2();
        Thread.sleep(5000);

        boardPage.getCard();
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void KB02_Add_notes() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        ;
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickAddNote();
        Thread.sleep(2000);
        boardPage.enterTypeNote("ntap");
        Thread.sleep(2000);
        boardPage.clickSavenote();
        Thread.sleep(2000);

        String actualString = driver.findElement(By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[4]/div[2]/div")).getText();
        assertTrue(actualString.contains("ntap"));

    }

    @Test(priority = 3)
    public void KB08_Edit_notes() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        ;
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickEditnote();
        Thread.sleep(2000);
        boardPage.enterTypeNote("testing");
        Thread.sleep(2000);
        boardPage.clickSavenote();
        Thread.sleep(2000);

        String actualString = driver.findElement(By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[4]/div[2]/div")).getText();
        assertTrue(actualString.contains("testingntap"));
    }

    @Test(priority = 4)
    public void KB09_Add_Members_Plus() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickAddMemberPlus();
        Thread.sleep(2000);
        boardPage.clickMemberNurul();
        Thread.sleep(2000);
        boardPage.clickApplyMemberPlus();
        Thread.sleep(2000);

        boardPage.getMemberNurulDisplay();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void KB10_Add_Members_Menu() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickAddMember();
        Thread.sleep(2000);
        boardPage.clickMemberRandy();
        Thread.sleep(2000);
        boardPage.clickApplymember();
        Thread.sleep(2000);

        boardPage.getMemberRandyDisplay();


    }

    @Test(priority = 6)
    public void KB11_Add_Labels() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickLabels();
        Thread.sleep(2000);
        boardPage.clickAddLabel();
        Thread.sleep(2000);
        boardPage.enterLabelName("High");
        Thread.sleep(2000);
        boardPage.clickColourRed();
        Thread.sleep(2000);
        boardPage.clickCreateLabel();
        Thread.sleep(2000);

        boardPage.getHighLabelDisplay();
    }

    @Test(priority = 7)
    public void KB12_Apply_Labels() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickLabels();
        Thread.sleep(2000);
        boardPage.clickAddLabel();
        Thread.sleep(2000);
        boardPage.clickHighLabel();
        Thread.sleep(2000);
        boardPage.clickApplylabels();
        Thread.sleep(2000);

        boardPage.getApplyLabelDisplay();
        Thread.sleep(2000);
    }




    @Test(priority = 8)
    public void KB18_Add_New_Comment() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickComment();
        Thread.sleep(2000);
        boardPage.enterCommentText("Testing Comment");
        Thread.sleep(2000);
        boardPage.clickCommentPost();
        Thread.sleep(2000);

        String actualString = driver.findElement(By.xpath("//*[@id=\"comment_62f9e3cd6e24fcdcc4b41816\"]/div[2]/div[3]")).getText();
        assertTrue(actualString.contains("Testing Comment"));
    }

    @Test(priority = 9)
    public void KB19_Edit_Comment() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickComment();
        Thread.sleep(2000);
        boardPage.clickCommentDots();
        Thread.sleep(5000);
        boardPage.clickCommentEdit();
        Thread.sleep(2000);
        boardPage.clickCommentEditText();
        Thread.sleep(2000);
        boardPage.enterCommentEditText("please comment");
        Thread.sleep(2000);
        boardPage.clickCommentEditPost();
        Thread.sleep(2000);

        String actualString = driver.findElement(By.xpath("//*[@id=\"comment_62f9e3cd6e24fcdcc4b41816\"]/div[2]/div[3]")).getText();
        assertTrue(actualString.contains("please commentTesting Comment"));
    }

    @Test(priority = 10)
    public void KB20_Delete_Comment() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickCommentDots();
        Thread.sleep(5000);
        boardPage.clickCommentDelete();
        Thread.sleep(2000);
        boardPage.clickCommentDeleteConfirm();
        Thread.sleep(2000);


    }

    @Test(priority = 11)
    public void KB21_Move_Card() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickMove();
        Thread.sleep(2000);
        boardPage.clickMoveList();
        Thread.sleep(2000);
        boardPage.clickMoveNamelist();
        Thread.sleep(2000);
        boardPage.clickMovePosition();
        Thread.sleep(2000);
        boardPage.clickMoveNumlist();
        Thread.sleep(2000);
        boardPage.clickMoveBtn();
        Thread.sleep(2000);

        boardPage.getCardIsMoved();
        Thread.sleep(2000);

    }

    @Test(priority = 12)
    public void KB22_Private_Card() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickPrivateCard();
        Thread.sleep(2000);

        boardPage.getCardLock();
        Thread.sleep(2000);

    }

    @Test(priority = 13)
    public void KB23_Public_Card() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickPublicCard();
        Thread.sleep(2000);

    }

    @Test(priority = 14)
    public void KB24_Archive_Card() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickCardBox();
        Thread.sleep(2000);
        boardPage.clickArchive();
        Thread.sleep(2000);

    }

    @Test(priority = 15)
    public void KB25_Add_list() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickAddList();
        Thread.sleep(2000);
        boardPage.enterListName("Testing");
        Thread.sleep(2000);
        boardPage.clickCreateList();
        Thread.sleep(2000);

        boardPage.getListDisplay();
        Thread.sleep(2000);

    }

    @Test(priority = 16)
    public void KB26_Archive_list() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(5000);
        boardPage.clickListAction();
        Thread.sleep(5000);
        boardPage.clickListArchiveThisList();
        Thread.sleep(2000);

    }

    @Test(priority = 17)
    public void KB36_Restore_Archived_Card() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickArchivedItems();
        Thread.sleep(2000);
        boardPage.clickArchivedRestoreCard();
        Thread.sleep(2000);

    }

    @Test(priority = 18)
    public void KB37_Restore_Archived_List() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickArchivedItems();
        Thread.sleep(2000);
        boardPage.clickArchivedSwitchList();
        Thread.sleep(2000);
        boardPage.clickArchivedRestoreList();
        Thread.sleep(2000);

    }

    @Test(priority = 19)
    public void KB38_Search_Cards() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.enterFilterSearchCard("Testing");
        Thread.sleep(2000);

        boardPage.getTestingDisplay();
        Thread.sleep(2000);
    }

    @Test(priority = 20)
    public void KB39_Filter_Member() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.clickFilterMember();
        Thread.sleep(2000);

        boardPage.getTestingDisplay();
        Thread.sleep(2000);
    }

    @Test(priority = 21)
    public void KB40_Filter_Due_Soon() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.clickFilterDueSoon();
        Thread.sleep(2000);

        boardPage.getCard();
        Thread.sleep(2000);
    }

    @Test(priority = 22)
    public void KB41_Filter_Due_Today() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.clickFilterDueToday();
        Thread.sleep(2000);

        boardPage.getCard();
        Thread.sleep(2000);
    }

    @Test(priority = 23)
    public void KB42_Filter_Over_Due() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.clickFilterOverdue();
        Thread.sleep(2000);

        boardPage.getTestingDisplay();
        Thread.sleep(2000);
    }

    @Test(priority = 24)
    public void KB43_Filter_Clear_Filter() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.clickFilterOverdue();
        Thread.sleep(2000);
        boardPage.clickFilterClear();
        Thread.sleep(2000);

        boardPage.getTestingDisplay();
        Thread.sleep(2000);
        boardPage.getCard();
        Thread.sleep(2000);

    }

    @Test(priority = 25)
    public void KB44_Filter_Label() throws InterruptedException {
        homePage = new HomePage();
        boardPage = new BoardPage();

        homePage.clickTeamB2();
        Thread.sleep(2000);
        boardPage.clickBoardMenu();
        Thread.sleep(2000);
        boardPage.clickFilter();
        Thread.sleep(2000);
        boardPage.clickFilterLabel();
        Thread.sleep(2000);

        boardPage.getCard();
        Thread.sleep(2000);
    }
}




