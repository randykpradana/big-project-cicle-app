package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test()
    public void loginTest() {
        loginPage.clickLoginButton();
        loginPage.enterEmailField(prop.getProperty("username"));
        loginPage.clickLoginNextButton();
        loginPage.enterPasswordField(prop.getProperty("password"));
        loginPage.clickPassNextButton();
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }
}
