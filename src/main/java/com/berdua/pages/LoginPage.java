package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Log;

import static com.berdua.base.TestBase.driver;

public class LoginPage {
    // Page Factory
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
    WebElement loginNextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/span")
    WebElement passNextButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div")
    WebElement companyLabel;

    // Initialize Page Objects
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Actions
    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage();
    }

    public LoginPage enterEmailField(String username) {
        emailField.sendKeys(username);
        return new LoginPage();
    }

    public LoginPage clickLoginNextButton() {
        loginNextButton.click();
        return new LoginPage();
    }

    public LoginPage enterPasswordField(String password) {
        passwordField.sendKeys(password);
        return new LoginPage();
    }

    public LoginPage clickPassNextButton() {
        passNextButton.click();
        return new LoginPage();
    }

    public LoginPage selectCompanyLabel() {
        companyLabel.click();
        return new LoginPage();
    }
}
