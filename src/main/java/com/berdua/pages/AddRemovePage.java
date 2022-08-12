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

    //Add Create Hq
    By CreateTeamBtn = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div" );
    By InputName = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div/input");
    By InputDescription = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/div[3]/div/textarea");
    By BtnCreateHq = By.xpath ("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/button/div");


    //Add Teams
    By CreateTeam = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div");
    By InputNameTeams = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/div[2]/div/input");
    By InputDescriptionTeams = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/div[3]/div/textarea");
    By BtnCreate = By.xpath ("//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/button/div");

    //AddProject
    By CreateProject = By.xpath ("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div");
    By inputNameProject = By.xpath ("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/div[2]/div/input");
    By inputDescriptionProject = By.xpath("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/div[3]/div/textarea");
    By btnCreateProject = By.xpath ("//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/button");

    //Add Your Company's Members
    By showMemberBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div");
    By inviteBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/button");
    By addEmailTextArea = By.name("emails");
    By submitNewEmailBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[4]/button");
    By messageInvite= By.className("SnackbarItem-message");

    //Your Big Project 2
    By projectCard = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div");
    By addProjectMemberIcon= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[6]");
    By tickMember= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[65]");
    By applyMemberBtn= By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button");
    By messageToggle= By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div");

    //AddPageEmailBaru
    By NavIcon = By.xpath ("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]");
    By SwitchCompanyPlusBtn = By.xpath ("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]");
    By EnterInputCompanyName = By.xpath ("//*[@id=\"companyName\"]");
    By EnterInputYourCompanyDescription = By.xpath ("//*[@id=\"companyDesc\"]");
    By Btncreate = By.xpath ("/html/body/div[3]/div/div/div[2]/div[3]/div/button");

    //Add

    //Actions

    //BackGroundCard
    public void clickbackgroundCard() {
        driver.findElement(background).click();
    }
    //Add Create Hq
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

    //Add Teams
    public void clickCreateTeam() {
        driver.findElement(CreateTeam).click();
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

    //AddProject
    public void clickCreateProject() {
        driver.findElement(CreateProject).click();
    }
    public void enterInputNameProject(String Name) {
        driver.findElement(inputNameProject).sendKeys("Name");
    }
    public void enterInputDescriptionProject(String Description) {
        driver.findElement(inputDescriptionProject).sendKeys(Description);
    }
    public void clickBtnCreateProject() {
        driver.findElement(btnCreateProject).click();
    }

    //Add Your Company's Mambers
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

    //Your Big Project 2
    public void clickProjectCard(){
        driver.findElement(projectCard).click();
    }
    public void clickAddProjectMemberIcon(){
        driver.findElement(addProjectMemberIcon).click();
    }
    public void clickTickMember(){
        driver.findElement(tickMember).click();
    }
    public void clickApplyMemberBtn(){
        driver.findElement(applyMemberBtn).click();
    }
    public String clickMessageToggle(){
        return driver.findElement(messageToggle).getText();
    }

    //AddPageEmailBaru
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
 }

