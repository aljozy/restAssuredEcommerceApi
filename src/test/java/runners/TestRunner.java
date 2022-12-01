package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue="stepDefinitions",features ="..//ecomm//src//test//java//features"
,stepNotifications = true, dryRun = false,monochrome = true,
tags = "@regression or @smoke or @functional"

,plugin = {"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunner {

}
