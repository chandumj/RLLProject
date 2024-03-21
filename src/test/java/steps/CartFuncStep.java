package steps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;
import pages.SearchPage;

public class CartFuncStep {

	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	HomePage hp=new HomePage(driver);
	SearchPage sp=new SearchPage(driver);
	ProductsPage pp=new ProductsPage(driver);
	CartPage cp=new CartPage(driver);
	
	@When("User add a few products to the cart")
	public void user_add_a_few_products_to_the_cart(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> userLists = dataTable.asLists(String.class);
		for (List<String> userList : userLists) {
			 hp.EnterProduct(userList.get(0));
			  // hp.clickOnSearch();
			   Thread.sleep(1000);
			   sp.clickonFirstProduct();
			   ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
			   driver.switchTo().window(tabs.get(tabs.size()-1));
				pp.clickOnAddToCart();
				Thread.sleep(1000);
		}
	}

	@When("User click on cart")
	public void user_click_on_cart() throws InterruptedException {
	    hp.clickonCart();
	    Thread.sleep(1000);
	}
	
	@Then("user can see {string} in the cart")
	public void user_can_see_in_the_cart(String string) {
		String expectedresult=string;
	}



	@When("User move a product to the shortlist")
	public void user_move_a_product_to_the_shortlist() {
	    cp.moveToShortlist();
	}

	@When("User delete the product from the cart")
	public void user_delete_the_product_from_the_cart() {
	    cp.clickOnRemoveItem();
	}

	@Then("the {string} should be removed from the cart")
	public void the_should_be_removed_from_the_cart(String string) {
		String expectedresult=string;
	}

}
