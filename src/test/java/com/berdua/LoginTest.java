package com.berdua;

import com.berdua.base.TestBase;
import com.berdua.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.berdua.base.TestBase.initialization;
import static com.berdua.base.TestBase.prop;

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

    @Test(priority=1)
    public void loginTest() {
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
