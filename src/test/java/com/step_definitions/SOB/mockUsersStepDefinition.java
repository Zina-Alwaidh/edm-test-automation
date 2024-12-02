package com.step_definitions.SOB;

import com.pages.loginPage;
import com.pages.vaGOV;
import com.utlities.BrowserUtils;
import com.utlities.CSVReader;
import com.utlities.ConfigurationReader;
import com.utlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class mockUsersStepDefinition {
    private static final Logger log = LoggerFactory.getLogger(mockUsersStepDefinition.class);
    List<Map<String, String>> mUserCredentials;

    @Given("mock user on VA staging environment for statement of benefits")
    public void mock_user_on_va_staging_environment_for_statement_of_benefits() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage loginPage = new loginPage();
        vaGOV vaGOV = new vaGOV();
        vaGOV.signInVA.click();
        loginPage.IDme.click();
    }

    @When("mock user signs in to staging environment statement of benefits")
    public void mock_user_signs_in_to_staging_environment_statement_of_benefits() {
        loginPage loginPage = new loginPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String filePath = "src/test/resources/mockusers.csv";
        mUserCredentials = CSVReader.readCSV(filePath);

        for (Map<String, String> user : mUserCredentials) {
            String username = user.get("username");
            String password = user.get("password");

            loginPage.emailInput.click();
            loginPage.emailInput.sendKeys(username);
            loginPage.passwordInput.click();
            loginPage.passwordInput.sendKeys(password);
            js.executeScript("window.scrollBy(0,250)");
            BrowserUtils.waitFor(3);
            loginPage.signInButton.click();
            js.executeScript("window.scrollBy(0,1500)");
            BrowserUtils.waitFor(2);
            loginPage.continueButton.click();
            js.executeScript("window.scrollBy(0,1500)");
            BrowserUtils.waitFor(2);
            loginPage.continueButton.click();
            BrowserUtils.waitFor(8);

            vaGOV.profileName.click();
            vaGOV.signOut.click();

        }
//        loginPage.emailInput.click();
//
//        loginPage.passwordInput.click();
//        loginPage.passwordInput.sendKeys("303SsNrLgPv5");
//        js.executeScript("window.scrollBy(0,250)");
//        BrowserUtils.waitFor(3);
//        loginPage.signInButton.click();
//        js.executeScript("window.scrollBy(0,250)");
//        BrowserUtils.waitFor(3);
//        js.executeScript("window.scrollBy(0,250)");
//        loginPage.continueButton.click();
//        js.executeScript("window.scrollBy(0,250)");
//        BrowserUtils.waitFor(2);
//        loginPage.continueButton.click();
//        BrowserUtils.waitFor(8);


    }

    @Then("mock user is able to see their statement of Benefits page")
    public void mock_user_is_able_to_see_their_statement_of_benefits_page() {

    }
}

