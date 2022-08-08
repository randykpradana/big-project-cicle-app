package com.berdua.utils;

import org.openqa.selenium.support.ui.WebDriverWait;

import static com.berdua.base.TestBase.driver;

public class TestUtil {
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;
    WebDriverWait wait = new WebDriverWait(driver, 10);
}