package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;

public class CartFuncStep {

	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	HomePage hp=new HomePage(driver);
	CartPage cp=new CartPage(driver);
	
	@When("User add a few products to the cart")
	public void user_add_a_few_products_to_the_cart() {
	   
	}

	@When("User click on cart")
	public void user_click_on_cart() throws InterruptedException {
	    hp.clickonCart();
	    Thread.sleep(1000);
	}

	@When("User enter {string} and apply")
	public void user_enter_and_apply(String string) throws InterruptedException {
	   Thread.sleep(1000);
		cp.EnterPinCode(string);
	    cp.clickOnApply();
	}

	@When("User move a product to the shortlist")
	public void user_move_a_product_to_the_shortlist() {
	    cp.moveToShortlist();
	}

	@When("User delete the product from the cart")
	public void user_delete_the_product_from_the_cart() {
	    cp.clickOnRemoveItem();
	}

	@Then("the product should be removed from the cart")
	public void the_product_should_be_removed_from_the_cart() {
	    
	}

}
