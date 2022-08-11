package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.LoginPage;
import com.berdua.pages.AddRemovePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveMembers extends TestBase {
    LoginPage loginPage;
    AddRemovePage addRemovePage;

    public AddRemoveMembers(){super();}

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
        loginPage.selectCompanyLabel();
        org.testng.Assert.assertEquals(loginPage.validateDashboard(), "Home");
        addRemovePage = new AddRemovePage();

    }

    @Test (priority = 1)
    public void AR01_User_or_team_adds_invite_with_active_input_emailthrows() throws InterruptedException {
        addRemovePage = new AddRemovePage();
        addRemovePage.clickShowMemberBtn();
        addRemovePage.clickInviteBtn();
        addRemovePage.enterAddEmailTextArea("triwhyni974@gmail.com");
        addRemovePage.clickSubmitNewEmailBtn();
        Assert.assertEquals(addRemovePage.validateInvitation(), "Invitations has been sent");
        Thread.sleep(3000);
        /** WebElement overview = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("title")));
         assertTrue(complete.isDisplayed());*/
        /** driver. getCurrentUrl();
         assertEquals(BASE_URL, "https://www.sekolahqa.com");*/
    }

    @Test (priority = 2)
    public void AR02_User_or_team_add_invite_on_team_card_members() throws InterruptedException {
        addRemovePage.clickProjectCard();
        addRemovePage.clickAddProjectMemberIcon();
        addRemovePage.clickTickMember();
        addRemovePage.clickTickMember();
        addRemovePage.clickApplyMemberBtn();
        Assert.assertEquals(addRemovePage.clickMessageToggle(), "Toggle member successful");
        Thread.sleep(3000);
    }

    @Test (priority = 3)
    public void AR03_User_or_team_remove_page_card() throws InterruptedException {
        addRemovePage.clickProjectCard();
        addRemovePage.clickAddProjectMemberIcon();
        addRemovePage.clickTickMember();
        addRemovePage.clickApplyMemberBtn();
        Assert.assertEquals(addRemovePage.clickMessageToggle(), "Toggle member successful");
        Thread.sleep(3000);
    }
    @Test (priority = 4)
    public void AR06_User_add_create_hq_on_page_Headquarter_() throws InterruptedException {
        addRemovePage.clickCreateTeamBtn();
        addRemovePage.enterName("Big Project");
        addRemovePage.enterDescription("Project");
        addRemovePage.clickBtnCreateHq();
        Thread.sleep(3000);
    }
    @Test (priority = 5)
    public void AR07_User_add_create_Team_on_page() throws InterruptedException {
        addRemovePage.clickCreateTeamBtn();
        addRemovePage.enterNameTeams("Your Big Project Here B");
        addRemovePage.enterDescriptionTeams("Project");
        addRemovePage.clickBtnCreateTeams();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void AR08_User_add_create_Projects_on_page() throws InterruptedException {
        addRemovePage.clickCreateProject();
        addRemovePage.enterInputNameProject("Your Big Project Here B");
        addRemovePage.enterInputDescriptionProject("Project");
        addRemovePage.clickBtnCreateProject();
        Thread.sleep(3000);
    }
    @Test(priority = 7)
    public void AR10_User_add_Company() throws InterruptedException {
        addRemovePage.clickNavIcon();
        addRemovePage.clickSwitchCompanyPlusBtn();
        addRemovePage.enterInputCompanyName("Big Project");
        addRemovePage.enterInputYourCompanyDescription("Project");
        addRemovePage.clickBtnCreate();
        Thread.sleep(3000);
    }
    @AfterMethod
        public void tearDown() {
        driver.quit();
    }
}
