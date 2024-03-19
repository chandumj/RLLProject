package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class CartFuncStep {

	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	HomePage hp=new HomePage(driver);
	
	@When("User Click on cart")
	public void user_click_on_cart() throws InterruptedException {
	    hp.clickonCart();
	    Thread.sleep(1000);
	}

	@When("User perform actions")
	public void user_perform_actions() {
	    
	}

	@Then("Cart should be updated")
	public void cart_should_be_updated() {
	   
	}
}
