package com.berdua.pages;

import com.berdua.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    // Page Factory
    By loginButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]");
    By emailField = By.xpath("//*[@id=\"identifierId\"]");
    By loginNextButton = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");
    By passwordField = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    By passNextButton = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");
    By companyLabel = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/p");


    // Initialize Page Objects
    public LoginPage() {
        PageFactory.initElements(driver, "/signin");
    }
    // Actions
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public LoginPage enterEmailField(String username) {
        driver.findElement(emailField).sendKeys(username);
        return new LoginPage();
    }
    public LoginPage clickLoginNextButton() {
        driver.findElement(loginNextButton).click();
        return new LoginPage();
    }
    public LoginPage enterPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return new LoginPage();
    }
    public LoginPage clickPassNextButton() {
        driver.findElement(passNextButton).click();
        return new LoginPage();
    }
    public LoginPage selectCompanyLabel() {
        driver.findElement(companyLabel).click();
        return new LoginPage();
    }
    public String validateDashboard() {
        return driver.getTitle();
    }
}
