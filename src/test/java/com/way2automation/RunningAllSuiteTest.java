package com.way2automation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Класс <class>RunningAllSuiteTest</class>
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CookiesTest.class
})
public class RunningAllSuiteTest {

    private static final String URL = "https://courses.way2automation.com/sign_in";
    private static final String USER = "pochepina@yandex.ru";
    private static final String PASSWORD = "qwerty";

    public static String getUrl() {
        return URL;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }

}
