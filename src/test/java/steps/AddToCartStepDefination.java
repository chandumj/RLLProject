package steps;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.SearchPage;

public class AddToCartStepDefination {

	SharedSteps shared = new SharedSteps();
	public WebDriver driver = shared.getDriver();
	LoginPage lp = new LoginPage(driver);
	HomePage hp = new HomePage(driver);
	SearchPage sp = new SearchPage(driver);
	ProductsPage pp = new ProductsPage(driver);
	CartPage cp = new CartPage(driver);

	@When("User search for a {string}")
	public void user_search_for_a(String string) throws InterruptedException {
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		try {
			hp.EnterProduct(string);
		} catch (Exception e) {

		}

	}

	@When("Click on one Product")
	public void click_on_one_product() throws InterruptedException {
		try {
			sp.clickonFirstProduct();
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		} catch (Exception e) {

		}

	}

	@When("click on Add to Cart for the selected product")
	public void click_on_add_to_cart_for_the_selected_product() {
		try {
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(tabs.size() - 1));
			pp.clickOnAddToCart();
		} catch (Exception e) {

		}

	}

	@Then("{string} should be added to my cart")
	public void should_be_added_to_my_cart(String expectedProductName) throws InterruptedException {
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		hp.clickonCart();

		try {
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			//Thread.sleep(2000);
			String actualValue1 = "Shopping Cart - Checkout | FirstCry.com";
			String expectedValue1 = driver.getTitle();
			assertEquals(expectedValue1, actualValue1);
		} catch (Exception e) {
			Assert.fail("ERROR", e);
		}
		cp.clickOnBacktoCart();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	        // Scroll to the top of the page
//	        js.executeScript("window.scrollTo(0, 0);");
//		//hp.clickOnFirstcryIcon();
//		
//		//hp.hovertoMyAccount();
//	//	hp.clickOnLogout();
	}
}
