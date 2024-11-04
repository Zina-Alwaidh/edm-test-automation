package com.step_definitions.WEAMinCT;

import com.pages.WEAMS;
import com.pages.vaGOV;
import com.step_definitions.SOB.sobHomePageStepDefinitions;
import com.utlities.BrowserUtils;
import com.utlities.ConfigurationReader;
import com.utlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class giComparisonToolFontStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(giComparisonToolFontStepDefinitions.class);

    @Given("User is able to locate Comparison Tool and search for an institution")
    public void user_is_able_to_locate_comparison_tool_and_search_for_an_institution() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        vaGOV vaGOV = new vaGOV();
        WEAMS weams = new WEAMS();
        vaGOV.vaBenefitsAndHealthCare.click();
        vaGOV.educationAndTraining.click();
        WEAMS.giComparisonTool.click();
        WEAMS.giComparisonToolSearchBox.click();
        WEAMS.giComparisonToolSearchBox.sendKeys("New York State Department of Labor Rensselaer County Career Center");


    }

    @When("User clicks on the institution, scrolls down and is able to click on Non College-Degree programs")
    public void user_clicks_on_the_institution_scrolls_down_and_is_able_to_click_on_non_college_degree_programs() {
        WEAMS.giComparisonToolSearchButton.click();
        BrowserUtils.waitFor(2);
        WEAMS.giComparisonToolInstituteExample.click();
        BrowserUtils.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, 3500)");
        BrowserUtils.waitFor(3);
        WEAMS.giComparisonToolNonCollegeDegreeSeeAll.click();

    }

    @When("User is taken to the search page with filters")
    public void user_is_taken_to_the_search_page_with_filters() {
        String expectedTitle = "NEW YORK STATE DEPARTMENT OF LABOR RENSSELAER COUNTY CAREER CENTER";
        String actualTitle = Driver.getDriver().findElement(By.xpath("//div//h1[.='NEW YORK STATE DEPARTMENT OF LABOR RENSSELAER COUNTY CAREER CENTER']")).getText();

        String expectedResult = ""

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        };


    }

    @Then("User is able to search programs with the intended font in display")
    public void user_is_able_to_search_programs_with_the_intended_font_in_display() {

    }
}
