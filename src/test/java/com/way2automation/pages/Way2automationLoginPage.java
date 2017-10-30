package com.way2automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс <class>Way2automationLoginPage</class>
 */
public class Way2automationLoginPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement loginInput;

    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='new_user']//input[contains(concat(' ',@class,' '),' login-button ')]")
    private WebElement loginButton;

    public Way2automationLoginPage(WebDriver driver){
        PageFactory.initElements(this.driver,this);
        this.driver = driver;
    }

    public void setLoginInput(String login){
        loginInput.clear();
        loginInput.sendKeys(login);
    }

    public void setPasswordInput(String password){
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void loginButtonClick(){
        loginButton.click();
    }
}
