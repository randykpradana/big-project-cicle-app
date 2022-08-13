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
    By companyLabel = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div/div/div[2]");

    // Initialize Page Objects
    public LoginPage() {
        PageFactory.initElements(driver, "/signin");
    }

    // Actions
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void enterEmailField(String username) {
        driver.findElement(emailField).sendKeys(username);
    }
    public void clickLoginNextButton() {
        driver.findElement(loginNextButton).click();
    }
    public void enterPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickPassNextButton() {
        driver.findElement(passNextButton).click();
    }
    public void selectCompanyLabel() {
        driver.findElement(companyLabel).click();
    }

    // Validate
    public String validateDashboard() {
        return driver.getTitle();
    }
}
