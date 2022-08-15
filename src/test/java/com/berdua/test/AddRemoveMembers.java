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
    //Add Your Company's Members
    @Test (priority = 1)
    public void AR01_User_or_team_adds_invite_with_active_input_emailthrows() throws InterruptedException {
        addRemovePage = new AddRemovePage();
        addRemovePage.clickShowMemberBtn();
        addRemovePage.clickInviteBtn();
        addRemovePage.enterAddEmailTextArea("triwhyni974@gmail.com");
        addRemovePage.clickSubmitNewEmailBtn();
        Assert.assertEquals(addRemovePage.validateInvitation(), "Invitations has been sent");
        Thread.sleep(3000);
    }

    //Your Big Project 2
    @Test (priority = 2)
    public void AR02_User_or_team_add_invite_on_team_card_members() throws InterruptedException {
        addRemovePage.clickProjectCard();
        addRemovePage.clickAddProjectMemberIcon();
        addRemovePage.clickTickMembers();
        addRemovePage.clickTickMembers();
        addRemovePage.clickApplyMemberBtn();
        Assert.assertEquals(addRemovePage.clickMessageToggle(), "Toggle member successful");
        Thread.sleep(3000);
    }

    @Test (priority = 3)
    public void AR03_User_or_team_remove_page_card() throws InterruptedException {
        addRemovePage.clickProjectcard();
        addRemovePage.clickaddProjectMemberIcon();
        addRemovePage.clickTickMember();
        Thread.sleep(3000);
        addRemovePage.clickTickMembers2();
        Thread.sleep(3000);
        addRemovePage.clickTickMembers2();
        Thread.sleep(3000);
        addRemovePage.clickApplyMemberButton();
        Assert.assertEquals(addRemovePage.clickMessageToggleSuccess(), "Toggle member successful");
        Thread.sleep(3000);
    }

    //Add Create Hq
    @Test (priority = 4)
    public void AR06_User_add_create_hq_on_page_Headquarter() throws InterruptedException {
        addRemovePage.clickCreateTeamBtn();
        addRemovePage.enterName("Big Project");
        addRemovePage.enterDescription("Project");
        addRemovePage.clickBtnCreateHq();
    }

    //Delete Create Hq (Big Project)
    @Test (priority = 5)
    public void AR07AR06_User_add_create_hq_on_page_Headquarter() throws InterruptedException {
        addRemovePage.clickBackgroundCard();
        Thread.sleep(3000);
        addRemovePage.clickIconPlusButton();
        Thread.sleep(3000);
        addRemovePage.clickDeleteMember();
        Thread.sleep(3000);
        addRemovePage.clickBtnApplyMembers();
        Assert.assertEquals(addRemovePage.clickToggleDelete(), "Toggle member successful");
        Thread.sleep(5000);
        addRemovePage.clickHomeHq();
        Thread.sleep(3000);
    }
    @Test (priority = 6)
    public void AR08_User_add_create_Team_on_page() throws InterruptedException {
        addRemovePage.clickBtnCreateTeam();
        addRemovePage.enterNameTeams("Your Big Project Here B");
        addRemovePage.enterDescriptionTeams("Project");
        addRemovePage.clickBtnCreateTeams();
        Thread.sleep(3000);
    }
    @Test (priority = 7)
    public void AR09_User_Remove_create_Team_on_page() throws InterruptedException{
        addRemovePage.clickBackGroundTeam();
        Thread.sleep(3000);
        addRemovePage.clickIconPlusButtonTeam();
        Thread.sleep(3000);
        addRemovePage.clickDeleteMemberTeam();
        Thread.sleep(3000);
        addRemovePage.clickApplyMembersTeam();
        Assert.assertEquals(addRemovePage.clickToggleDelete(), "Toggle member successful");
        Thread.sleep(5000);
        addRemovePage.clickHomeTeam();
        Thread.sleep(3000);
    }
    @Test(priority = 8)
    public void AR10_User_add_create_Projects_on_page() throws InterruptedException {
        addRemovePage.clickCreateProject();
        addRemovePage.enterInputNameProject("BigProject");
        addRemovePage.enterInputDescriptionProject("Project");
        addRemovePage.clickBtnCreateProject();
        Thread.sleep(3000);
    }
    @Test(priority = 9)
    public void AR11_User_Delete_create_Projects_on_page() throws InterruptedException {
        addRemovePage.clickBackGroundCardProjects();
        Thread.sleep(3000);
        addRemovePage.clickIconPlusButtonProjects();
        Thread.sleep(3000);
        addRemovePage.clickDeleteMemberProjects();
        Thread.sleep(3000);
        addRemovePage.clickBtnApplyMembersProjects();
        Assert.assertEquals(addRemovePage.clickToggleDeleteProjects(), "Toggle member successful");
        Thread.sleep(5000);
        addRemovePage.clickHomeProjects();
        Thread.sleep(3000);
    }
    @Test(priority = 10)
    public void AR12_Edit_Profil() throws InterruptedException {
        addRemovePage.clickImageProfil();
        addRemovePage.clickImageProfi2();
        addRemovePage.clickBtnEditProfil();
        addRemovePage.clickYourTitle();
        addRemovePage.clickYourBio();
        addRemovePage.clickBtnSave();
        Thread.sleep(3000);
    }
    @Test(priority = 11)
    public void AR13_User_add_Company() throws InterruptedException {
        addRemovePage.clickNavIcon();
        addRemovePage.clickSwitchCompanyPlusBtn();
        addRemovePage.enterInputCompanyName("Big Project");
        addRemovePage.enterInputYourCompanyDescription("Project");
        addRemovePage.clickBtnCreate();
        Thread.sleep(3000);
    }
    @Test(priority = 12)
    public void AR03User_or_team_remove_page_Your_Company_Member() throws InterruptedException {
        addRemovePage.clickNavIcoon();
        addRemovePage.clickCompany();
        addRemovePage.clickIcoonPlus();
        addRemovePage.clickButtonRemove();
        addRemovePage.clickButtonRemove2();
        Assert.assertEquals(addRemovePage.clickToggleSuccessRemove(), "Success remove member from company");
        Thread.sleep(3000);
    }
    @Test(priority = 13)
    public void AR14_User_or_team_input_false_email() throws InterruptedException {
        addRemovePage = new AddRemovePage();
        addRemovePage.clickFalseEmailShowMemberBtn();
        addRemovePage.clickFalseEmailInviteBtn();
        addRemovePage.enterFalseEmailAddEmailTextArea("triwhyni974gmail.com");
        addRemovePage.clickFalseEmailSubmitNewEmailBtn();
        Assert.assertEquals(addRemovePage.FailInvitationFalseEmail(), "Email is not valid or empty");
        Thread.sleep(3000);
    }
    @AfterMethod
        public void tearDown() {
        driver.quit();
    }
}
