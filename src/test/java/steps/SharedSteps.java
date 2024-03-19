package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class SharedSteps {

	public static WebDriver driver;
	@BeforeAll
	public static void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	@AfterAll
	public static void tearDown() {
		driver.quit();
	}
}
