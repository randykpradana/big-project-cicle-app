package com.berdua.pages;

import com.berdua.base.TestBase;
import org.openqa.selenium.By;

import static com.berdua.base.TestBase.driver;

public class SearchPage extends TestBase {

    //Page Factory
    By searchBar = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/input");
//    By teamSekolahQA = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/a[1]");
    By teamSekolahQA = By.partialLinkText("Sekolah QA 13");
    By teamB2 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/a[2]/div/div[2]/h1");
    By teamB1 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/a[3]/div/div[2]/h1");
    By GroupchatSQA = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[1]/div/div[1]/div[2]/h1");
    By GroupchatB2 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By GroupchatB1 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By BlastSQA = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[1]/div/div[1]");
    By BlastB2 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By BlastB1 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By ScheduleSQA = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[1]/div/div[1]/div[2]/h1");
    By ScheduleB2 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By ScheduleB1 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[3]/div/div[1]/div[2]/h1");
    By BoardSQA = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[1]/div/div[1]/div[2]/h1");
    By BoardB2 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By BoardB1 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[3]/div/div[1]/div[2]/h1");
    By CheckinSQA = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[1]/div/div[1]/div[2]/h1");
    By CheckinB2 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By CheckinB1 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[3]/div/div[1]/div[2]/h1");
    By DocsSQA = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[1]/div/div[1]/div[2]/h1");
    By DocsB2 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[2]/div/div[1]/div[2]/h1");
    By DocsB1 = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/a[3]/div/div[1]/div[2]/h1");

    //Action
    public void clickSearchBar() {
        driver.findElement(searchBar).click();
    }

    public void clickTeamSekolahQA() {
        driver.findElement(teamSekolahQA).click();
    }
    public void clickTeamB2() {driver.findElement(teamB2).click();}
    public void clickTeamB1() {driver.findElement(teamB1).click();}
    public void clickGroupchatSQA() {driver.findElement(GroupchatSQA).click();}
    public void clickGroupchatB2() {driver.findElement(GroupchatB2).click();}
    public void clickGroupchatB1() {driver.findElement(GroupchatB1).click();}
    public void clickBlastSQA() {driver.findElement(BlastSQA).click();}
    public void clickBlastB2() {driver.findElement(BlastB2).click();}
    public void clickBlastB1() {driver.findElement(BlastB1).click();}
    public void clickScheduleSQA() {driver.findElement(ScheduleSQA).click();}
    public void clickScheduleB2() {driver.findElement(ScheduleB2).click();}
    public void clickScheduleB1() {driver.findElement(ScheduleB1).click();}
    public void clickBoardSQA() {driver.findElement(BoardSQA).click();}
    public void clickBoardB2() {driver.findElement(BoardB2).click();}
    public void clickBoardB1() {driver.findElement(BoardB1).click();}
    public void clickCheckinSQA() {driver.findElement(CheckinSQA).click();}
    public void clickCheckinB2() {driver.findElement(CheckinB2).click();}
    public void clickCheckinB1() {driver.findElement(CheckinB1).click();}
    public void clickDocsSQA() {driver.findElement(DocsSQA).click();}
    public void clickDocsB2() {driver.findElement(DocsB2).click();}
    public void clickDocsB1() {driver.findElement(DocsB1).click();}

}
