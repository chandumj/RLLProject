package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "steps", dryRun = false, plugin = {
		"html:target/Firstcry_Findstore_report.html", "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/" }, tags = "@FirstCry"

// monochrome = true

)
public class TestRunner extends AbstractTestNGCucumberTests {

	
}
