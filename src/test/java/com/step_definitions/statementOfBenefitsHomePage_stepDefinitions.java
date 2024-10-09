package com.step_definitions;

import com.github.javafaker.Faker;
import com.pages.SOB;
import com.pages.loginPage;
import com.pages.vaGOV;
import com.utlities.BrowserUtils;
import com.utlities.ConfigurationReader;
import com.utlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class statementOfBenefitsHomePage_stepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(statementOfBenefitsHomePage_stepDefinitions.class);

    @Given("user on VA staging environment for statement of benefits")
    public void user_on_va_staging_environment_for_statement_of_benefits() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
loginPage loginPage = new loginPage();
loginPage.IDme.click();


    }
    @When("user signs in to staging environment statement of benefits")
    public void user_signs_in_to_staging_environment_statement_of_benefits() {
        loginPage loginPage = new loginPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        loginPage.emailInput.click();
        loginPage.emailInput.sendKeys("vets.gov.user+0@gmail.com");

        loginPage.passwordInput.click();
        loginPage.passwordInput.sendKeys("369SsNrLgPv5");
        js.executeScript("window.scrollBy(0,250)");
        BrowserUtils.waitFor(3);
        loginPage.signInButton.click();
        js.executeScript("window.scrollBy(0,250)");
        BrowserUtils.waitFor(3);
        js.executeScript("window.scrollBy(0,250)");
        loginPage.continueButton.click();
        js.executeScript("window.scrollBy(0,250)");
        BrowserUtils.waitFor(2);
        loginPage.continueButton.click();




    }
    @Then("user is able to see their statement of Benefits page")
    public void user_is_able_to_see_their_statement_of_benefits_page() {
        vaGOV vaGoV = new vaGOV();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        vaGOV.vaBenefitsAndHealthCare.click();
        vaGOV.educationAndTraining.click();
        vaGOV.checkPost911SOB.click();
        BrowserUtils.waitFor(2);
        js.executeScript("window.scrollBy(0,500)");
        BrowserUtils.waitFor(4);
        SOB.checkYourGIBillBenefits.click();
        BrowserUtils.waitFor(2);


    }

}
