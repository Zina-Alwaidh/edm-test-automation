package com.step_definitions.SOB;

import com.pages.SOB;
import com.pages.loginPage;
import com.pages.vaGOV;
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

public class sobPrintStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(sobPrintStepDefinitions.class);

    @Given("user signs in to staging environment using ID.me")
    public void user_signs_in_to_staging_environment_using_id_me() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage loginPage = new loginPage();
        loginPage.IDme.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        loginPage.emailInput.click();
        loginPage.emailInput.sendKeys("vets.gov.user+17@gmail.com");

        loginPage.passwordInput.click();
        loginPage.passwordInput.sendKeys("199SsNrLgPv5");
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
        BrowserUtils.waitFor(10);

    }
    @When("user checks statement of benefits")
    public void user_checks_statement_of_benefits() {
        vaGOV vaGoV = new vaGOV();
        vaGOV.vaBenefitsAndHealthCare.click();
        vaGOV.educationAndTraining.click();
        vaGOV.checkPost911SOB.click();
        BrowserUtils.waitFor(5);

        String expectedTitle = "Check Post-9/11 GI Bill Statement of Benefits";
        String actualTitle = Driver.getDriver().findElement(By.xpath("//h1[.='Check Post-9/11 GI Bill Statement of Benefits']")).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        BrowserUtils.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,450)");
        BrowserUtils.waitFor(3);
    }
    @Then("user is able to print their statement of benefits page")
    public void user_is_able_to_print_their_statement_of_benefits_page() {
        SOB SOB = new SOB();
        SOB.greenArrowCheckYourGIBillBenefits.click();
        BrowserUtils.waitFor(3);
        SOB.getPrintableSOB.click();
        SOB.printThisPage.click();

    }
}
