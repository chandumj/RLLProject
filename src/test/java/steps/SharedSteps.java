package steps;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ScreenShotUtility;

public class SharedSteps {

	public static WebDriver driver;

	public static Logger logger;
	public static ExtentReports extentReport;
	ExtentTest extentTest;
	int i;

	@BeforeAll
	public static void setUp() {
		logger = LogManager.getLogger(SharedSteps.class);
		logger.info("Execution Started");
		extentReport = new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("FirstCryExtentReport.html");
		extentReport.setSystemInfo("OS", System.getProperty("os.name"));
		extentReport.setSystemInfo("Java Version", System.getProperty("java.version"));
		extentReport.setSystemInfo("Browser", "Chrome");
		extentReport.setSystemInfo("Team Name", "TeamAlpha001");
		extentReport.attachReporter(sparkreporter);
		driver = new ChromeDriver();

	}

	@Before
	public void setupScenario(Scenario scenario) {
		logger.info(scenario.getName() + " Scenario Started");
		extentTest = extentReport.createTest(scenario.getName() + " Scenario");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		i = 1;

	}

	@AfterStep
	public void afterStep(Scenario scenario) throws NoSuchMethodException, SecurityException {
		if (scenario.isFailed()) {
			extentTest.fail("Step-" + i + ": Test case Failed");
			String path = ScreenShotUtility.captureScreenshot(scenario.getName());
			extentTest.addScreenCaptureFromPath(path, "Test Failed");
			logger.fatal("Step-" + i + " Test Case Failed");
		} else {
			extentTest.pass("Step-" + i + ": Test Case Passed");
			logger.debug("Step-" + i + " Test Case Passed");
		}
		i++;
	}

	@After
	public void teardownScenario(Scenario scenario) {
		String originalHandle = driver.getWindowHandle();

		// Get all window handles
		ArrayList<String> allHandles = new ArrayList<>(driver.getWindowHandles());

		// Close all other windows except the original one
		for (String handle : allHandles) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}

		// Switch back to the original window
		driver.switchTo().window(originalHandle);
		logger.info(scenario.getName() + "Scenario Completed");

	}

	@AfterAll
	public static void tearDown() throws IOException {
		extentReport.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File("FirstCryExtentReport.html").toURI());
		logger.info("Execution Finished");
	}

	@Given("User navigate to the FirstCry URL")
	public void user_navigate_to_the_first_cry_url() {
		driver.get("https://www.firstcry.com/");
		driver.manage().deleteAllCookies();
	}

	@When("User log into the application with credentials")
	public void user_log_into_the_application_with_credentials() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.clickOnLogin();
		lp.enterEmail("");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		Thread.sleep(1000);
		lp.clickOnContinue();
		Thread.sleep(30000);
		lp.clickOnSubmit();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
