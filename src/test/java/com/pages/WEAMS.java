package com.pages;

import com.utlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WEAMS {
    public WEAMS() {
        PageFactory.initElements((Driver.getDriver()), this);
    }
    @FindBy(xpath = "//a[.='GI Bill® Comparison Tool']")
    public static WebElement giComparisonTool;

    @FindBy(xpath = "//input[@id='downshift-input-2']")
    public static WebElement giComparisonToolSearchBox;

    @FindBy(xpath = "//button[@class='usa-button vads-u-margin--0 vads-u-width--full find-form-button medium-screen:vads-u-width--auto name-search-button vads-u-display--flex vads-u-align-items--center']")
    public static WebElement giComparisonToolSearchButton;

    @FindBy(xpath = "//div//h3//a")
    public static WebElement giComparisonToolInstituteExample;

    @FindBy(xpath = "//a[.='See All']")
    public static WebElement giComparisonToolNonCollegeDegreeSeeAll;
}
