package com.pages;

import com.utlities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SOB {
public SOB(){PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//a[.='Check your GI Bill Benefits']")
    public static WebElement checkYourGIBillBenefits;


}




