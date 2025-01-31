package com.pages;

import com.utlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vaGOV {
public vaGOV(){PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//button[.='VA Benefits and Health Care']")
public static WebElement vaBenefitsAndHealthCare;

@FindBy(xpath = "//button[.='Education and training']")
    public static WebElement educationAndTraining;

@FindBy(xpath = "//a[.='Check your remaining Post-9/11 GI Bill benefits']")
    public static WebElement checkRemainingPost911SOB;

@FindBy(xpath = "//button[.='Sign in']")
    public static WebElement signInVA;

@FindBy(xpath = "//span[@class='user-dropdown-email']")
    public static WebElement profileName;

@FindBy(xpath = "//a[.='Sign Out']")
    public static WebElement signOut;

}
