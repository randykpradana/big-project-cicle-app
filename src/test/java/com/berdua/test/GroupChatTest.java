package com.berdua.test;

import com.berdua.pages.GroupChatPage;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.TeamPage;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.berdua.base.TestBase.initialization;

public class GroupChatTest {
    LoginPage loginPage;
    HomePage homepage;
    TeamPage teamPage;
    GroupChatPage GroupChatPage;

    public GroupChatTest() {
        super();
    }
    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
    }
    @Test(priority=1)
    public void G01_User_create_as_many_words_aspossible_in_the_Group_Chat_column() {
        loginPage.clickLoginButton();
        loginPage.enterEmailField("username");
    }


}
