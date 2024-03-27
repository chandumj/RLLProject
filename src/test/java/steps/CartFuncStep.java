package steps;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
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

	SharedSteps shared = new SharedSteps();
	public WebDriver driver = shared.getDriver();
	HomePage hp = new HomePage(driver);
	SearchPage sp = new SearchPage(driver);
	ProductsPage pp = new ProductsPage(driver);
	CartPage cp = new CartPage(driver);

	@When("User add a few products to the cart")
	public void user_add_a_few_products_to_the_cart(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<List<String>> userLists = dataTable.asLists(String.class);
		for (List<String> userList : userLists) {
			hp.EnterProduct(userList.get(0));

			sp.clickonFirstProduct();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(tabs.size() - 1));
			pp.clickOnAddToCart();

		}
	}

	@When("User click on cart")
	public void user_click_on_cart() throws InterruptedException {
	    hp.clickonCart();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	   // Thread.sleep(1000);
	}

	@Then("user can see {string} in the cart")
	public void user_can_see_in_the_cart(String string) {
		String actualValue1 = "Shopping Cart - Checkout | FirstCry.com";
		String expectedValue1 = driver.getTitle();
		assertEquals(expectedValue1, actualValue1);
	}

	@When("User move a product to the shortlist")
	public void user_move_a_product_to_the_shortlist() throws InterruptedException {
		//cp.moveToShortlist();
	}

	@When("User change the quantity of product from the cart")
	public void user_change_the_quantity_of_product_from_the_cart() {
		cp.clickOnQuantyIcon();
		cp.changeQuantity();
	}

	@Then("the {string} should be changed")
	public void the_should_be_changed(String string) throws InterruptedException {

		hp.clickOnFirstcryIcon();
		hp.hovertoMyAccount();
		hp.clickOnLogout();
	}

}
