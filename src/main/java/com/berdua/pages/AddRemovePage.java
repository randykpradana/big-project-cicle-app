package com.berdua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemovePage {
    WebDriver driver;

    public AddRemovePage(WebDriver driver) {this.driver = driver;}

    //Add Create Hq
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div" )
    WebElement CreateTeamBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div/input")
    WebElement InputNameCreateHq;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/div[3]/div/textarea")
    WebElement InputDescriptionCreateHq;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[2]/div[2]/button/div")
    WebElement BtnCreateHq;

    //Add Teams
    @FindBy (xpath = "//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div")
    WebElement createTeamBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/div[2]/div/input")
    WebElement InputName;
    @FindBy (xpath = "//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/div[3]/div/textarea")
    WebElement InputDescription;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[3]/div[2]/div[2]/div[2]/button/div")
    WebElement BtnCreate;

    //AddProject
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div")
    WebElement CreateProject;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/div[2]/div/input")
    WebElement inputName;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/div[3]/div/textarea")
    WebElement inputDescription;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[5]/div[2]/div[2]/div[2]/button/div")
    WebElement btnCreate;

    //Add Your Company's Members
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/button/div")
    WebElement BtnInvite;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[3]/div/div/div")
    WebElement InputEmails;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[4]/button/div")
    WebElement btnInvite;

    //Your Big Project 2
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div[6]")
    WebElement IconTambah;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div/input")
    WebElement searchMembers;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[6]/svg")
    WebElement CentangMembers1;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[7]/svg")
    WebElement CentangMembers2;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]/svg")
    WebElement CentangMembers3;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div/svg")
    WebElement CentangMembers4;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/button" )
    WebElement BtnApplyMembers;

    //AddPageEmailBaru
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[1]/div[2]/svg")
    WebElement NavIcon;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]")
    WebElement SwitchCompanyPlusBtn;
    @FindBy(xpath = "//*[@id=\"companyName\"]")
    WebElement InputCompanyName;
    @FindBy(xpath = "//*[@id=\"companyDesc\"]")
    WebElement InputYourCompanyDescription;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[3]/div/button")
    WebElement btncreate;
}
