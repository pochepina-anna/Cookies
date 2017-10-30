package com.way2automation;

import com.way2automation.helpers.DriverSetUp;
import com.way2automation.helpers.FileWorker;
import com.way2automation.pages.Way2automationLoginPage;
import com.way2automation.pages.Way2automationPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;


/**
 * Класс <class>CookiesTest</class>
 *
 */

public class CookiesTest extends DriverSetUp{

    private static final String URL = RunningAllSuiteTest.getUrl();
    private static final String USER = RunningAllSuiteTest.getUser();
    private static final String PASSWORD = RunningAllSuiteTest.getPassword();

    private Way2automationPage way2automationPage = new Way2automationPage(driver);
    private Way2automationLoginPage way2automationLoginPage = new Way2automationLoginPage(driver);

    @Test
    public void getSetCookie()throws Exception {
        openWay2automationPage(driver,URL);
        loginWay2automation();
        Set<Cookie> allCookies=getCookies(driver);
        driver.manage().deleteAllCookies();
        tearDown();
        setUp();
        openWay2automationPage(driver,URL);
        setCookies(driver, allCookies);
        driver.navigate().refresh();
        Assert.assertTrue("LogIn is Failed",way2automationPage.logOutMenuButtonIsVisible());

    }

    private void openWay2automationPage(WebDriver driver, String url) {
        driver.get(url);
    }

    private void loginWay2automation() {
        Assert.assertTrue("Main Page is Failed",way2automationPage.loginMenuButtonIsVisible());
        way2automationPage.loginMenuButtonClick();
        way2automationLoginPage.setLoginInput(USER);
        way2automationLoginPage.setPasswordInput(PASSWORD);
        way2automationLoginPage.loginButtonClick();
        Assert.assertTrue("LogIn is Failed",way2automationPage.logOutMenuButtonIsVisible());

    }

    private Set<Cookie> getCookies(WebDriver driver){return driver.manage().getCookies(); }

    private void setCookies(WebDriver driver, Set<Cookie> cookie){
        for (Cookie loadedCookie : cookie) {
            driver.manage().addCookie(loadedCookie);
        }
    }

 }
