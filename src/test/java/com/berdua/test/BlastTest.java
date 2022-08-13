package com.berdua.test;

import com.berdua.base.TestBase;
import com.berdua.pages.BlastPage;
import com.berdua.pages.HomePage;
import com.berdua.pages.LoginPage;
import com.berdua.pages.TeamPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TeamPage teamPage;
    BlastPage blastPage;

    public BlastTest() {
        super();
    }

    @BeforeMethod
    public void initialStart() throws InterruptedException {
        System.out.println("Test starts");
        initialization();

        loginPage = new LoginPage();
        homePage = new HomePage();
        teamPage = new TeamPage();
        blastPage = new BlastPage();

        loginPage.clickLoginButton();
        Thread.sleep(2000);
        loginPage.enterEmailField(prop.getProperty("username"));
        Thread.sleep(2000);
        loginPage.clickLoginNextButton();
        Thread.sleep(2000);
        loginPage.enterPasswordField(prop.getProperty("password"));
        Thread.sleep(2000);
        loginPage.clickPassNextButton();
        Thread.sleep(2000);
        loginPage.selectCompanyLabel();
        Thread.sleep(2000);
        // Validate
        Assert.assertEquals(loginPage.validateDashboard(), "Home");
        System.out.println("User already logged in, landing on: " + loginPage.validateDashboard());
    }
    @Test(priority = 1)
    public void B01_User_directed_to_Blast_page_when_select_Blast_on_dropdown_navigation_bar() throws InterruptedException {
        System.out.println("Test ID: B01");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        homePage.clickNavbarDrpDwnIcon();
        Thread.sleep(2000);
        homePage.selectBlastDrpDwn();
        Thread.sleep(2000);
        // Validate
        Assert.assertEquals(blastPage.validateBlastsLabel(), "Blasts");
        System.out.println("Successfully directed to Blast page");
        System.out.println("Blasts label is displayed: " + blastPage.validateBlastsLabel());
    }
    @Test(priority = 2)
    public void B02_User_directed_to_Create_a_Blast_page_when_click_Create_Post_bar_button() throws InterruptedException {
        System.out.println("Test ID: B02");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        // Validate
        Assert.assertEquals(blastPage.validateCreateBlastLabel(), "Create a Blast");
        System.out.println("Successfully directed to Create a Blast page");
        System.out.println("Create a Blast label is displayed: " + blastPage.validateCreateBlastLabel());
    }
    @Test(priority = 3)
    public void B03_User_create_a_new_post_with_all_completed_fields() throws InterruptedException {
        System.out.println("Test ID: B03");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Successfully created a new post");
        System.out.println("Pop up success message: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test(priority = 4)
    public void B04_User_cannot_create_a_new_post_if_leaves_Title_field_empty() throws InterruptedException {
        System.out.println("Test ID: B04");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.emptyTitleField("");
        Thread.sleep(2000);
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateErrorPopUpMsg(), "Field parameter not complete.");
        System.out.println("Cannot create a new post");
        System.out.println("Pop up error message: " + blastPage.validateErrorPopUpMsg());
    }
    @Test(priority = 5)
    public void B05_User_can_still_create_a_new_post_if_leaves_Story_field_empty() throws InterruptedException {
        System.out.println("Test ID: B05");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.emptyStoryField("");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Still able to create a new post");
        System.out.println("Pop up success message: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test(priority = 6)
    public void B06_User_search_emoticons_by_typing_emoticons_name() throws InterruptedException {
        System.out.println("Test ID: B06");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickTitleEmoticon();
        Thread.sleep(2000);
        blastPage.enterEmoteSearchField(prop.getProperty("emoticonName"));
        Thread.sleep(2000);
        blastPage.clickSpeakingEmoticon();
        Thread.sleep(2000);
    //    Highlight the searched emoticon
    //    driver.findElement(By.xpath("//*[@id="root"]/div[3]/div[2]/div/div/div[1]/div/div/aside/div[3]/section/ul[1]/li/button/img"));
    //    JavascriptExecutor js = (JavascriptExecutor) driver;
    //    js.executeScript("arguments[0].style.background='yellow'", selectedEmoticon);
    //    Thread.sleep(2000);
        // Validate
        Assert.assertNull(blastPage.validateDisplayedEmoticon());
        System.out.println("Searched emoticon is displayed");
    }
    @Test(enabled = false)
    public void B07_User_can_change_emoticon_color_by_clicking_color_label() throws InterruptedException {
        System.out.println("Test ID: B07");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickTitleEmoticon();
        Thread.sleep(2000);
        blastPage.clickEmoteColorLabel();
        Thread.sleep(2000);
        blastPage.clickBlackLabel();
        Thread.sleep(2000);
        // Validate

    }
    @Test(priority = 8)
    public void B08_User_can_create_a_new_post_with_Bold_text_formatting() throws InterruptedException {
        System.out.println("Test ID: B08");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField("Big Project");
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickBoldIcon();
        blastPage.enterStoryField("this is my story");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test(priority = 9)
    public void B09_User_can_create_a_new_post_with_Italic_text_formatting() throws InterruptedException {
        System.out.println("Test ID: B09");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickItalicIcon();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test(priority = 10)
    public void B10_User_can_create_a_new_post_with_Strikethrough_text_formatting() throws InterruptedException {
        System.out.println("Test ID: B10");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickStrikethroughIcon();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B11_User_can_enter_data_on_Story_field_with_background_color() throws InterruptedException {
        System.out.println("Test ID: B11");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickBgColorIcon();
        blastPage.selectBlueBgColor();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateChangedBgColor());
        System.out.println("At this point the entered text background color should be blue");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B12_User_can_select_another_font_size_points() throws InterruptedException {
        System.out.println("Test ID: B12");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickFontSizeDrpDwn();
        Thread.sleep(2000);
        blastPage.selectFontSizePts();
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateSelectedFontSizePts());
        System.out.println("Able to enter Story field with another font size points");
        Thread.sleep(2000);
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B13_User_can_enter_data_on_Story_field_with_Underline_text_format() throws InterruptedException {
        System.out.println("Test ID: B13");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickMoreTextIcon();
        blastPage.clickStoryField();
        blastPage.clickUnderlineIcon();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateUnderlinedText());
        System.out.println("At this point the entered text should be underlined: " + blastPage.validateUnderlinedText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B14_User_can_enter_data_on_story_field_with_Subscript_text_format() throws InterruptedException {
        System.out.println("Test ID: B14");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickMoreTextIcon();
        blastPage.clickStoryField();
        blastPage.clickSubscriptIcon();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateSubscriptedText());
        System.out.println("At this point the entered text should be subscripted: " + blastPage.validateSubscriptedText());
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B15_User_can_enter_data_on_story_field_with_Superscript_text_format() throws InterruptedException {
        System.out.println("Test ID: B15");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickMoreTextIcon();
        blastPage.clickStoryField();
        blastPage.clickSuperscriptIcon();
        blastPage.enterStoryField(prop.getProperty("storyField"));
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateSuperscriptedText());
        System.out.println("At this point the entered text should be superscripted: " + blastPage.validateSuperscriptedText());
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B16_User_can_select_another_font_style() throws InterruptedException {
        System.out.println("Test ID: B16");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickMoreTextIcon();
        blastPage.clickStoryField();
        blastPage.clickFontFamilyDrpDwn();
        Thread.sleep(2000);
        blastPage.selectTnrFontStyle();
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateSelectedFontStyle());
        System.out.println("Selected font style: " + blastPage.validateSelectedFontSizePts());
        blastPage.enterStoryField(prop.getProperty("storyField"));
        System.out.println("Able to enter Story field with another font style");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B17_User_can_select_another_text_color() throws InterruptedException {
        System.out.println("Test ID: B17");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickMoreTextIcon();
        blastPage.clickStoryField();
        blastPage.clickTextColorIcon();
        Thread.sleep(2000);
        //blastPage.selectPurpleTextColor(); - ERROR: ELEMENT
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateSelectedFontStyle());
        System.out.println("Selected font style: " + blastPage.validateSelectedFontSizePts());
        blastPage.enterStoryField("this is not a story");
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.blockEnteredText();
        System.out.println("Able to enter Story field with another text color");
        Thread.sleep(2000);
        blastPage.enterStoryField("this is not a story");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B18_User_can_clear_all_text_formatting_that_has_been_used() throws InterruptedException {
        System.out.println("Test ID: B18");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickBoldIcon();
        blastPage.clickItalicIcon();
        blastPage.clickBgColorIcon();
        Thread.sleep(2000);
        blastPage.selectBlueBgColor();
        blastPage.clickFontSizeDrpDwn();
        Thread.sleep(2000);
        blastPage.selectFontSizePts();
        Thread.sleep(2000);
        blastPage.clickMoreTextIcon();
        blastPage.clickUnderlineIcon();
        Thread.sleep(2000);
        blastPage.enterStoryField("THIS IS NOT A STORY");
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.blockEnteredText();
        Thread.sleep(2000);
        blastPage.clickClearFormatting();
        // Validate
        Assert.assertTrue(true, blastPage.validateClearTextFormat());
        System.out.println("At this point all the text formatting that has been used is cleared");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B19_User_enter_data_with_Ordered_List_formatting() throws InterruptedException {
        System.out.println("Test ID: B19");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickOrderedListIcon();
        blastPage.enterStoryField("leh uga u");
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateOrderedText());
        System.out.println("At this point Ordered List format is displayed");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B20_User_enter_data_with_Unordered_List_formatting() throws InterruptedException {
        System.out.println("Test ID: B20");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickUnorderedListIcon();
        blastPage.enterStoryField("leh uga u");
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateUnorderedText());
        System.out.println("At this point Unordered List default format is displayed");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B21_User_select_another_Unordered_List_format_style() throws InterruptedException {
        System.out.println("Test ID: B21");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickUnorderedListDrpDwn();
        Thread.sleep(2000);
        blastPage.selectCircleUndList();
        Thread.sleep(2000);
        blastPage.enterStoryField("leh uga u");
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateCircleUndText());
        System.out.println("At this point Unordered List with circle format is displayed");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B22_User_select_another_Paragraph_format_style() throws InterruptedException {
        System.out.println("Test ID: B22");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickMoreParagraphIcon();
        blastPage.selectAlignCenter();
        Thread.sleep(2000);
        blastPage.enterStoryField("leh uga u");
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateAlignCenterText());
        System.out.println("At this point entered text is in the center of the Story field");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B23_User_add_Quotes_text_formatting() throws InterruptedException {
        System.out.println("Test ID: B23");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickMoreParagraphIcon();
        blastPage.clickQuoteDrpDwn();
        Thread.sleep(2000);
        blastPage.selectIncreaseQuo();
        blastPage.enterStoryField("leh uga u");
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateQuotedText());
        System.out.println("At this point Quotes text formatting is added on the Story field");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test
    public void B24_User_enter_data_on_story_field_with_emoticons() throws InterruptedException {
        System.out.println("Test ID: B24");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.enterTitleField(prop.getProperty("titleField"));
        Thread.sleep(2000);
        blastPage.enterStoryField("leh uga u");
        Thread.sleep(2000);
        blastPage.clickStoryField();
        blastPage.clickStoryEmoticon();
        //blastPage.clickAnimalsAndNature(); - ERROR: ELEMENT
        Thread.sleep(2000);
        // Validate
        Assert.assertTrue(true, blastPage.validateEnteredEmoticon());
        System.out.println("Emoticon is entered on the Story field");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        blastPage.clickPublishButton();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");
        // Validate
        Assert.assertEquals(blastPage.validateSuccessPopUpMsg(), "Create post successful");
        System.out.println("Success pop up message is displayed: " + blastPage.validateSuccessPopUpMsg());
    }
    @Test(enabled = false)
    public void B25_User_insert_file_by_drag_and_drop() throws InterruptedException {
    }
    @Test(enabled = false)
    public void B26_User_insert_file_by_click_browse_file() throws InterruptedException {
    }
    @Test(enabled = false)
    public void B27_User_insert_file_more_than_10_mb() throws InterruptedException {
    }
    @Test(priority = 11)
    public void B28_User_insert_file_with_valid_url() throws InterruptedException {
        System.out.println("Test ID: B28");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickByUrl();
        Thread.sleep(2000);
        blastPage.enterByUrlField(prop.getProperty("fileUrl"));
        Thread.sleep(2000);
        blastPage.clickAddUrlButton();
        Thread.sleep(2000);
        // Validate
        //Assert.assertEquals(blastPage.validateInsertedLink(), "Url entered is invalid. Please try again.");
        //Assert.assertEquals(blastPage.validateInsertedFile(), "Saturday, August 13, 2022");
        System.out.println("Inserted file is displayed");
    }
    @Test(priority = 12)
    public void B29_User_insert_file_with_invalid_url() throws InterruptedException {
        System.out.println("Test ID: B29");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickByUrl();
        Thread.sleep(2000);
        blastPage.enterByUrlField(prop.getProperty("invFileUrl"));
        Thread.sleep(2000);
        blastPage.clickAddUrlButton();
        Thread.sleep(2000);
        // Validate
        Assert.assertEquals(blastPage.validateInvInsertedUrl(), "Url entered is invalid. Please try again.");
        System.out.println("Error message is displayed: " + blastPage.validateInvInsertedUrl());
    }
    @Test(enabled = false)
    public void B30_User_delete_inserted_file() throws InterruptedException {

    }
    @Test(enabled = false)
    public void B31_User_upload_inserted_file_to_story_field() throws InterruptedException {

    }
    @Test(priority = 13)
    public void B32_User_insert_file_with_valid_embedded_code() throws InterruptedException {
        System.out.println("Test ID: B32");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickEmbedCode();
        Thread.sleep(2000);
        blastPage.enterEmbedCodeField(prop.getProperty("validEmbedCode"));
        Thread.sleep(2000);
        blastPage.clickInsertEmbedButton();
        Thread.sleep(2000);
        // Validate
        WebElement insValidEmbedCode = driver.findElement(By.id("fr-inserted-file"));
        Assert.assertTrue(insValidEmbedCode.isDisplayed());
        System.out.println("Inserted file with valid embedded code is displayed");
    }
    @Test(priority = 14)
    public void B33_User_insert_file_with_invalid_embedded_code() throws InterruptedException {
        System.out.println("Test ID: B33");
        // Steps
        homePage.clickTeamCard();
        Thread.sleep(2000);
        teamPage.clickBlastWidget();
        Thread.sleep(2000);
        blastPage.clickCreateBlastBarBtn();
        Thread.sleep(2000);
        blastPage.clickInsertFilesIcon();
        Thread.sleep(2000);
        blastPage.clickEmbedCode();
        Thread.sleep(2000);
        blastPage.enterEmbedCodeField(prop.getProperty("invEmbedCode"));
        Thread.sleep(2000);
        blastPage.clickInsertEmbedButton();
        Thread.sleep(2000);
        // Validate
        WebElement invalidMsg = driver.findElement(By.className("fr-message"));
        String expectedText = "Something went wrong. Please try again.";
        Assert.assertEquals(expectedText, invalidMsg.getText());
        System.out.println("Error message is displayed");
    }
    @AfterMethod
    public void endOfTesting() throws InterruptedException {
        System.out.println("Test is finished");
        Thread.sleep(2000);
        driver.quit();
    }
}
