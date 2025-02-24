package com.pages;

import com.utlities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SOB {
    public SOB() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Check your GI Bill Benefits']")
    public static WebElement checkYourGIBillBenefits;

    @FindBy(xpath = "//h1[.='Check Post-9/11 GI Bill Statement of Benefits']")
    public static WebElement checkPost9GIBillBenefitsTitle;

    @FindBy(xpath = "//div//a[.='Check your GI Bill Benefits']")
    public static WebElement greenArrowCheckYourGIBillBenefits;

    @FindBy(xpath = "//va-button[.]")
    public static WebElement getPrintableSOB;
    @FindBy(xpath = "//button[.='Print This Page']")
    public static WebElement printThisPage;
    @FindBy(xpath = "//h1[.='Print']")
    public static WebElement print;
}




