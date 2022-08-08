package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.berdua.base.TestBase.driver;

public class LoginPage {
    // Page Factory
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]")
    WebElement loginButton;

    @FindBy(name = "//*[@id=\"identifierId\"]")
    WebElement emailField;

    @FindBy(name = "//*[@id=\"identifierNext\"]/div/button/span")
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
    public LoginPage login(String username, String password) {
        loginButton.click();
        emailField.sendKeys(username);
        loginNextButton.sendKeys();
        passwordField.sendKeys(password);
        passNextButton.click();
        companyLabel.click();

        return new LoginPage();
    }
}
