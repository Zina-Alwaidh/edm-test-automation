package com.step_definitions;

import com.utlities.ConfigurationReader;
import com.utlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class statementOfBenefitsHomePage_stepDefinitions {
    @Given("user on VA staging environment for statement of benefits")
    public void user_on_va_staging_environment_for_statement_of_benefits() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user signs in to staging environment statement of benefits")
    public void user_signs_in_to_staging_environment_statement_of_benefits() {

    }
    @Then("user is able to see their statement of Benefits page")
    public void user_is_able_to_see_their_statement_of_benefits_page() {

    }

}
