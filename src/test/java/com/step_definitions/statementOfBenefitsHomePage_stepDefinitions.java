package com.step_definitions;

import com.github.javafaker.Faker;
import com.pages.loginPage;
import com.utlities.ConfigurationReader;
import com.utlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class statementOfBenefitsHomePage_stepDefinitions {
    @Given("user on VA staging environment for statement of benefits")
    public void user_on_va_staging_environment_for_statement_of_benefits() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
loginPage loginPage = new loginPage();
loginPage.IDme.click();


    }
    @When("user signs in to staging environment statement of benefits")
    public void user_signs_in_to_staging_environment_statement_of_benefits() {
        loginPage loginPage = new loginPage();
        loginPage.emailInput.click();
        loginPage.emailInput.sendKeys("vets.gov.user+0@gmail.com");
        loginPage.passwordInput.click();
        loginPage.passwordInput.sendKeys("369SsNrLgPv5");




    }
    @Then("user is able to see their statement of Benefits page")
    public void user_is_able_to_see_their_statement_of_benefits_page() {

    }

}
