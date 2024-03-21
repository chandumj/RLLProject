package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "F:\\Mphasis Practice Eclipse\\RLLProject\\src\\test\\resources\\features",
	    glue =  "Stepdefinition",
	    dryRun = false,
	   plugin = {
	        "html:target/Firstcry_Findstore_report.html",
	        "pretty",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	        "timeline:test-output-thread/"
	    }
	    
	   
	   // monochrome = true
	    
	    
	     
	)
public class TestRunner extends AbstractTestNGCucumberTests {

}
