package com.berdua.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static com.berdua.base.TestBase.driver;

public class AddRemovePage {

    public AddRemovePage() {
        PageFactory.initElements(driver, "/companies/61eba2c85080f47b25ddc8f8");
    }
    //BackGroundCard
    By background = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a[2]/div");

    //AR 01 User or team adds invite with active input email (Add Your Company's Members)
        //** Locator
    By showMemberBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div");
    By inviteBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/button");
    By addEmailTextArea = By.name("emails");
    By submitNewEmailBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[4]/button");
    By messageInvite= By.className("SnackbarItem-message");
        //** Actions
    public void clickShowMemberBtn(){
        driver.findElement(showMemberBtn).click();
    }
    public void clickInviteBtn(){
        driver.findElement(inviteBtn).click();
    }
    public void enterAddEmailTextArea(String email){
        driver.findElement(addEmailTextArea ).sendKeys(email);
    }
    public void clickSubmitNewEmailBtn(){
        driver.findElement(submitNewEmailBtn).click();
    }
    public String validateInvitation() {
        return driver.findElement(messageInvite).getText();
    }

    //GC 02 User or team add invite on team card members (Your Big Project 2)
        //** Locator
    By projectCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div");
    By addProjectMemberIcon= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[6]");
    By tickMembers= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[65]");
    By applyMemberBtn= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button");
    By messageToggle= By.xpath("//*[@id=\"notistack-snackbar\"]");
        //** Actions
    public void clickProjectCard(){
        driver.findElement(projectCard).click();
    }
    public void clickAddProjectMemberIcon(){
        driver.findElement(addProjectMemberIcon).click();
    }
    public void clickTickMembers(){
        driver.findElement(tickMembers).click();
    }
    public void clickApplyMemberBtn(){
        driver.findElement(applyMemberBtn).click();
    }
    public String clickMessageToggle(){
        return driver.findElement(messageToggle).getText();
    }

    //AR 03 User or team remove page card (Your Big Project 2)
    //** Locator
    By ProjectCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div");
    By AddProjectMemberIcon= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[6]");
    By tickMember= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[65]");
    By TickMember2 = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[79]");
    By ApplyMemberBtn= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button");
    By MessageToggle= By.xpath("//*[@id=\"notistack-snackbar\"]");
    //** Actions
    public void clickProjectcard(){
        driver.findElement(ProjectCard).click();
    }
    public void clickaddProjectMemberIcon(){
        driver.findElement(AddProjectMemberIcon).click();
    }
    public void clickTickMember(){
        driver.findElement(tickMember).click();
    }
    public void clickTickMembers2() {
        driver.findElement(TickMember2).click();
    }
    public void clickApplyMemberButton(){
        driver.findElement(ApplyMemberBtn).click();
    }
    public String clickMessageToggleSuccess(){
        return driver.findElement(MessageToggle).getText();
    }

    //AR06_User_add_create_hq_on_page_Headquarter (Add Create HQ)
        //**Locator
    By CreateTeamBtn = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div" );
    By InputName = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div/input");
    By InputDescription = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/div[3]/div/textarea");
    By BtnCreateHq = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/button/div");
        //**Actions
    public void clickCreateTeamBtn() {
        driver.findElement(CreateTeamBtn).click();
    }
    public void enterName(String Name){
        driver.findElement(InputName).sendKeys(Name);
    }
    public void enterDescription(String Description) {
        driver.findElement(InputDescription).sendKeys(Description);
    }
    public void clickBtnCreateHq() {
        driver.findElement(BtnCreateHq).click();
    }

    //AR07_User Remove Create hq on page "Headquarter" (Delete Create HQ)
        //** Locator
    By BackgroundCard = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/a/div");
    By IconPlusButton = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[2]");
    By DeleteMember = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[78]");
    By BtnApplyMembers = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button/div/h1");
    By ToggleDelete = By.xpath("//*[@id=\"notistack-snackbar\"]");
    By HomeHq = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/nav/ol/li[1]/div/a");
        //** Actions
    public void clickBackgroundCard() {
        driver.findElement(BackgroundCard).click();
    }
    public void clickIconPlusButton() {
        driver.findElement(IconPlusButton).click();
    }
    public void clickDeleteMember(){
        driver.findElement(DeleteMember).click();
    }
    public void clickBtnApplyMembers(){
        driver.findElement(BtnApplyMembers).click();
    }
    public String clickToggleDelete(){
        return driver.findElement(ToggleDelete).getText();
    }
    public void clickHomeHq(){
        driver.findElement(HomeHq).click();
    }

    //AR08_User_add_create_Team_on_page (Team)
        //** Locator
    By BtnCreateTeam = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div");
    By InputNameTeams = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/div[2]/div/input");
    By InputDescriptionTeams = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/div[3]/div/textarea");
    By BtnCreate = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/button/div");
        //** Actions
    public void clickBtnCreateTeam() {
        driver.findElement(BtnCreateTeam).click();
    }
    public void enterNameTeams(String Name){
        driver.findElement(InputNameTeams).sendKeys(Name);
    }
    public void enterDescriptionTeams(String Description) {
        driver.findElement(InputDescriptionTeams).sendKeys(Description);
    }
    public void clickBtnCreateTeams() {
        driver.findElement(BtnCreate).click();
    }

    //AR09 User Remove create Team on page (Your Big Project Here B)
        //** Locator
    By BackGroundTeam = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a[2]/div");
    By IconPlusButtonTeam = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]");
    By DeleteMemberTeam = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[78]");
    By ApplyMembersTeam = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button/div");
    By ToggleDeleteTeam = By.xpath("//*[@id=\"notistack-snackbar\"]");
    By HomeTeam = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/nav/ol/li[1]/div/a");
        //** Actions
    public void clickBackGroundTeam() {
        driver.findElement(BackGroundTeam).click();
    }
    public void clickIconPlusButtonTeam() {
        driver.findElement(IconPlusButtonTeam).click();
    }
    public void clickDeleteMemberTeam(){
        driver.findElement(DeleteMemberTeam).click();
    }
    public void clickApplyMembersTeam(){
        driver.findElement(ApplyMembersTeam).click();
    }
    public String clickToggleDeleteTeam(){
        return driver.findElement(ToggleDeleteTeam).getText();
    }
    public void clickHomeTeam(){
        driver.findElement(HomeTeam).click();
    }
    //AR10_User_add_create_Projects_on_page
    //Locator
    By CreateProject = By.xpath ("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div");
    By inputNameProject = By.xpath ("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/div[2]/div/input");
    By inputDescriptionProject = By.xpath("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/div[3]/div/textarea");
    By btnCreateProject = By.xpath ("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/button");

    //Actions
    public void clickCreateProject() {
        driver.findElement(CreateProject).click();
    }
    public void enterInputNameProject(String Name) {
        driver.findElement(inputNameProject).sendKeys(Name);
    }
    public void enterInputDescriptionProject(String Description) {
        driver.findElement(inputDescriptionProject).sendKeys(Description);
    }
    public void clickBtnCreateProject() {
        driver.findElement(btnCreateProject).click();
    }

    //AR11 User Delete Create Projects on Page
        //Locator
    By BackgroundCardProjects = By.xpath("//*[@id=\"root\"]/div[3]/div[6]/a/div");
    By IconPlusButtonProjects = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[2]");
    By DeleteMemberProjects = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[78]");
    By BtnApplyMembersProjects = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button/div/h1");
    By ToggleDeleteProjects = By.xpath("//*[@id=\"notistack-snackbar\"]");
    By HomeProjects = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/nav/ol/li[1]/div/a");
        //Actions
    public void clickBackGroundCardProjects() {
        driver.findElement(BackgroundCardProjects).click();
        }
    public void clickIconPlusButtonProjects() {
        driver.findElement(IconPlusButtonProjects).click();
    }
    public void clickDeleteMemberProjects(){
        driver.findElement(DeleteMemberProjects).click();
    }
    public void clickBtnApplyMembersProjects(){
        driver.findElement(BtnApplyMembersProjects).click();
    }
    public String clickToggleDeleteProjects(){
        return driver.findElement(ToggleDeleteProjects).getText();
    }
    public void clickHomeProjects(){
        driver.findElement(HomeProjects).click();
    }

    //AR 12 User Edit Profil
        //** Locator
    By ImageProfil = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div/span");
    By ImageProfil2 = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[5]/div/div[1]/a/div/div/div/span");
    By BtnEditProfil = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div[2]/button");
    By YourTitle = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[2]/input");
    By YourBio = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div/div[2]/div[1]/form/div[3]/textarea");
    By BtnSave = By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div/div/div/div/div[2]/div[2]/div/button[1]/div");
        //** Actions
    public void clickImageProfil() {
        driver.findElement(ImageProfil).click();
    }
    public void clickImageProfi2() {
        driver.findElement(ImageProfil2).click();
    }
    public void clickBtnEditProfil() {
        driver.findElement(BtnEditProfil).click();
    }
    public void clickYourTitle() {
        driver.findElement(YourTitle).click();
    }
    public void clickYourBio() {
        driver.findElement(YourBio).click();
    }
    public void clickBtnSave() {
        driver.findElement(BtnSave).click();
    }

    //AR 13Let's Build a Company
        //** Locator
    By NavIcon = By.xpath ("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]");
    By SwitchCompanyPlusBtn = By.xpath ("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]");
    By EnterInputCompanyName = By.xpath ("//*[@id=\"companyName\"]");
    By EnterInputYourCompanyDescription = By.xpath ("//*[@id=\"companyDesc\"]");
    By Btncreate = By.xpath ("/html/body/div[3]/div/div/div[2]/div[3]/div/button");
        //** Actions
    public void clickNavIcon() {
        driver.findElement(NavIcon).click();
        }
    public void clickSwitchCompanyPlusBtn() {
        driver.findElement(SwitchCompanyPlusBtn).click();
    }
    public void enterInputCompanyName(String DreamCo) {
        driver.findElement(EnterInputCompanyName).sendKeys(DreamCo);
    }
    public void enterInputYourCompanyDescription(String EnterYourComapany) {
        driver.findElement(EnterInputYourCompanyDescription).sendKeys(EnterYourComapany);
    }
    public void clickBtnCreate() {
        driver.findElement(Btncreate).click();
    }

    // AR 03 User or team remove page "Your Company's Member"
        //**Locator
    By NavIcoon = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]");
    By Company = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/div/a[1]/div");
    By IcoonPlus = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]");
    By ButtonRemove = By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div[2]/button/div/h1");
    By ButtonRemove2 = By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div[2]/div/div[4]/button/div");
    By ToggleSuccessRemove = By.xpath("//*[@id=\"notistack-snackbar\"]");
        //**Actions
    public void clickNavIcoon() {
        driver.findElement(NavIcoon).click();
    }
    public void clickCompany() {
        driver.findElement(Company).click();
    }
    public void clickIcoonPlus() {
        driver.findElement(IcoonPlus).click();
    }
    public void clickButtonRemove() {
        driver.findElement(ButtonRemove).click();
    }
    public void clickButtonRemove2() {
        driver.findElement(ButtonRemove2).click();
    }
    public String clickToggleSuccessRemove(){
        return driver.findElement(ToggleSuccessRemove).getText();
    }

    //AR14 User or team input false email
        //**Locator
    By FalseEmailshowMemberBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div");
    By FalseEmailinviteBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/button");
    By FalseEmailaddEmailTextArea = By.name("emails");
    By FalseEmailsubmitNewEmailBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[4]/button");
    By FalseEmailmessageInvite= By.className("SnackbarItem-message");
    //** Actions
    public void clickFalseEmailShowMemberBtn(){
        driver.findElement(FalseEmailshowMemberBtn).click();
    }
    public void clickFalseEmailInviteBtn(){
        driver.findElement(FalseEmailinviteBtn).click();
    }
    public void enterFalseEmailAddEmailTextArea(String email){
        driver.findElement(FalseEmailaddEmailTextArea ).sendKeys(email);
    }
    public void clickFalseEmailSubmitNewEmailBtn(){
        driver.findElement(FalseEmailsubmitNewEmailBtn).click();
    }
    public String FailInvitationFalseEmail() {
        return driver.findElement(FalseEmailmessageInvite).getText();
    }

}

