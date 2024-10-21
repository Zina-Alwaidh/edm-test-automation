package com.pages;

import com.utlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
public loginPage() {
    PageFactory.initElements((Driver.getDriver()), this);
}
@FindBy(xpath = "//button[@class='usa-button idme-button vads-u-margin-y--1p5 vads-u-padding-y--2']")
    public WebElement IDme;

@FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailInput;

@FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordInput;

@FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement signInButton;

@FindBy(xpath = "//button[.='Continue']")
    public WebElement continueButton;
}
