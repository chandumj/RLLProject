package steps;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.SearchPage;

public class ShortListStep {
	
	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	LoginPage lp=new LoginPage(driver);
	HomePage hp=new HomePage(driver);
	SearchPage sp=new SearchPage(driver);
	ProductsPage pp=new ProductsPage(driver);
	
	@When("User shortlist few products")
	public void user_shortlist_few_products() throws InterruptedException {
	   hp.EnterProduct("jacket");
	  // hp.clickOnSearch();
	   Thread.sleep(1000);
	   sp.clickonFirstProduct();
	   ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
	   driver.switchTo().window(tabs.get(1));
		pp.clickOnShortlistBtn();
	}

	@When("User click on the Shortlist button")
	public void user_click_on_the_shortlist_button() {
	    hp.clickonShortlist();
	}

	@Then("the selected products should be in my Shortlist")
	public void the_selected_products_should_be_in_my_shortlist() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
