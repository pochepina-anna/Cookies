package com.way2automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Класс <class>Way2automationPage</class>
 */

public class Way2automationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id='navbar']//ul[contains(concat(' ',@class,' '),' navbar-right ')]//a[contains(text(),'Login')]")
    private WebElement loginMenuButton;

    @FindBy(xpath = "//*[@id='navbar']//ul[contains(concat(' ',@class,' '),' navbar-right ')]//a[contains(text(),'Log Out')]")
    private WebElement logOutMenuButton;


    public Way2automationPage(WebDriver driver){
        PageFactory.initElements(this.driver,this);
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public void loginMenuButtonClick(){
        wait.until(ExpectedConditions.elementToBeClickable(loginMenuButton)).click();
    }

    public boolean logOutMenuButtonIsVisible(){
        return logOutMenuButton.isDisplayed();
    }

    public boolean loginMenuButtonIsVisible(){
        return loginMenuButton.isDisplayed();
    }

}
