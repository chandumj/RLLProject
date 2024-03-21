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
	
	
	@When("User search for a {string}")
	public void user_search_for_a(String string) throws InterruptedException {
		Thread.sleep(1000);
	    hp.EnterProduct(string);
	}

	@When("Click on one Product")
	public void click_on_one_product() throws InterruptedException {
		 sp.clickonFirstProduct();
		    Thread.sleep(2000);
	}
	@When("click on Add to Cart for the selected product")
	public void click_on_add_to_cart_for_the_selected_product() {
	    pp.clickOnAddToCart();
	}

	@Then("{string} should be added to my cart")
	public void should_be_added_to_my_cart(String string) {
		  hp.clickonCart();
		  String expectedresult=string;
	}
}
