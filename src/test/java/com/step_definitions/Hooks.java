package com.step_definitions;

import com.utlities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

/*
 In this class we will be able to pass pre- @ post-conditions to each scenario and each step
  */
public class Hooks {
    // import from io.cucumber.java not from junit
    @Before(order = 0)
    public void setupScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void teardownScenario(Scenario scenario){

        if(scenario.isFailed()){
            byte [] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }

        //BrowserUtils.sleep(5);
        Driver.closeDriver();


//        System.out.println("===== Closing browser using cucumber @After");
//        System.out.println("==== Scenario ended/ Take screenshot if failed!");
    }

    // @BeforeStep
    public void setupStep(){
        System.out.println("---------> applying setup using @BeforeStep");
    }

    // @AfterStep
    public void afterStep(){
        System.out.println("----------> applying tearDown using @AfterStep");
    }

}
