package com.step_definitions.SOB;

import com.pages.loginPage;
import com.utlities.BrowserUtils;
import com.utlities.ConfigurationReader;
import com.utlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class mockUsersStepDefinition {
    private static final Logger log = LoggerFactory.getLogger(mockUsersStepDefinition.class);

    @Given("mock user on VA staging environment for statement of benefits")
    public void mock_user_on_va_staging_environment_for_statement_of_benefits() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage loginPage = new loginPage();
        loginPage.IDme.click();
    }

    @When("mock user signs in to staging environment statement of benefits")
    public void mock_user_signs_in_to_staging_environment_statement_of_benefits() {
        loginPage loginPage = new loginPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        loginPage.emailInput.click();

        loginPage.passwordInput.click();
        loginPage.passwordInput.sendKeys("303SsNrLgPv5");
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
        BrowserUtils.waitFor(8);


    }

    @Then("mock user is able to see their statement of Benefits page")
    public void mock_user_is_able_to_see_their_statement_of_benefits_page() {

    }
}

