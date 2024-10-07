package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
/*
@ExtendedCucumberOptions(
        usageReport = true,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewChartsReport = true,
        overviewReport = true,
        toPDF = true,
outputFolder = "target") */
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/step_definitions",
        dryRun = false,
        tags = "wip"



)
public class CukesRunner {
}