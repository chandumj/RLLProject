package steps;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.SearchPage;

public class AddToCartStepDefination {
	
	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	LoginPage lp=new LoginPage(driver);
	HomePage hp=new HomePage(driver);
	SearchPage sp=new SearchPage(driver);
	ProductsPage pp=new ProductsPage(driver);
	
	@Given("User navigate to the FirstCry URL")
	public void user_navigate_to_the_first_cry_url() {
	    driver.get("https://www.firstcry.com/");
	}

	@When("User log into the application with credentials")
	public void user_log_into_the_application_with_credentials() throws InterruptedException {
	    lp.clickOnLogin();
	   lp.enterEmail("chandumj787013@gmail.com");
	   Thread.sleep(1000);
	    lp.clickOnContinue();
	    Thread.sleep(30000);
	   lp.clickOnSubmit();
	}

	@Then("User should be redirected to the homepage")
	public void user_should_be_redirected_to_the_homepage() {
	    
	}

	@When("User search for a specific product")
	public void user_search_for_a_specific_product() throws InterruptedException {
		Thread.sleep(1000);
	    hp.EnterProduct("diaper");
	    //hp.clickOnSearch();
	}

	@When("click on Add to Cart for the selected product")
	public void click_on_for_the_selected_product() throws InterruptedException {
	    sp.clickonFirstProduct();
	    Thread.sleep(2000);
	    ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		pp.clickOnAddToCart();
	}

	@Then("the selected product should be added to my cart")
	public void the_selected_product_should_be_added_to_my_cart() {
	    hp.clickonCart();
	}
}
