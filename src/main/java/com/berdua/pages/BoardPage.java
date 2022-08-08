package com.berdua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardPage {


    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[1]/a/div")
    WebElement BoardMenu;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/button")
    WebElement Addlist;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/form/div[1]/input")
    WebElement ListName;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/form/div[2]/div/button")
    WebElement CreateList;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]")
    WebElement Addcard1;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]/div[1]")
    WebElement CardName;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[4]/div[3]/button")
    WebElement Addcard2;
    @FindBy(xpath = "//*[@id=\"listcard_content-3\"]/div/div/div/a")
    WebElement Cardclick;
    @FindBy(xpath = "//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[1]/button")
    WebElement Addmember;
}
