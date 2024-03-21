package steps;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.SearchPage;
import pages.ShortListPage;

public class ShortListStep {
	
	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	LoginPage lp=new LoginPage(driver);
	HomePage hp=new HomePage(driver);
	SearchPage sp=new SearchPage(driver);
	ProductsPage pp=new ProductsPage(driver);
	ShortListPage slp=new ShortListPage(driver);
	
	@When("User shortlist few products")
	public void user_shortlist_few_products() throws InterruptedException {
	   hp.EnterProduct("jacket");
	  // hp.clickOnSearch();
	   Thread.sleep(1000);
	   sp.clickonFirstProduct();
	   ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
	   driver.switchTo().window(tabs.get(1));
		pp.clickOnShortlistBtn();
		Thread.sleep(1000);
	}

	@When("User click on the Shortlist button")
	public void user_click_on_the_shortlist_button() throws InterruptedException {
	    hp.clickOnFirstcryIcon();
		hp.clickonShortlist();
		Thread.sleep(1000);
		
	}
	@When("User add a product to the cart from the shortlist")
	public void user_add_a_product_to_the_cart_from_the_shortlist() {
	    slp.clickOnAddtoCartFromSL();
	}

	@When("User delete a product from the shortlist")
	public void user_delete_a_product_from_the_shortlist() {
	    slp.clickOnDeleteFromSL();
	}

	@Then("the product should be removed from the shortlist")
	public void the_product_should_be_removed_from_the_shortlist() {
	    
	}

}
