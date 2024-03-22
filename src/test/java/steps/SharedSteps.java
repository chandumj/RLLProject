package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class SharedSteps {

	public static WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	@Before
	public void setupScenario() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardownScenario() {
		driver.quit();
	}
	
	
	
	@Given("User navigate to the FirstCry URL")
	public void user_navigate_to_the_first_cry_url() {
	    driver.get("https://www.firstcry.com/");
	    driver.manage().deleteAllCookies();
	}

	@When("User log into the application with credentials")
	public void user_log_into_the_application_with_credentials() throws InterruptedException {
	    LoginPage lp=new LoginPage(driver);
	    
	    Thread.sleep(5000);
		lp.clickOnLogin();
	   lp.enterEmail("chandumj787013@gmail.com");
	   Thread.sleep(1000);
	    lp.clickOnContinue();
	    Thread.sleep(30000);
	   lp.clickOnSubmit();
	}
	public WebDriver getDriver() {
		return driver;
	}
	
}
