package com.berdua.helper;

import com.berdua.base.TestBase;
import com.berdua.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Login extends TestBase {
    // Page Factory
    By loginButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]");
    By emailField = By.xpath("//*[@id=\"identifierId\"]");
    By loginNextButton = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");
    By passwordField = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    By passNextButton = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");
    By companyLabel = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/p");


    // Initialize Page Objects
    public Login() {
        PageFactory.initElements(driver, "/signin");
    }
    // Actions
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public Login enterEmailField(String username) {
        driver.findElement(emailField).sendKeys(username);
        return new Login();
    }
    public Login clickLoginNextButton() {
        driver.findElement(loginNextButton).click();
        return new Login();
    }
    public Login enterPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return new Login();
    }
    public Login clickPassNextButton() {
        driver.findElement(passNextButton).click();
        return new Login();
    }
    public Login selectCompanyLabel() {
        driver.findElement(companyLabel).click();
        return new Login();
    }

    public HomePage login(String email, String pass) {
        this.clickLoginButton();
        this.enterEmailField(email);
        this.clickLoginNextButton();
        this.enterPasswordField(pass);
        this.clickPassNextButton();
        this.selectCompanyLabel();

        return new HomePage();
    }
}
