package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue="stepDefinitions",features ="..//ecomm//src//test//java//features"
, dryRun = false,monochrome = true
,plugin = {"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunnerTestng extends AbstractTestNGCucumberTests  {

}
