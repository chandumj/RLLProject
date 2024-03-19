package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class MyProfileStep {
	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	HomePage hp=new HomePage(driver);
	
	@When("User click on My Account")
	public void user_click_on_my_account() {
	   hp.hovertoMyAccount();
	}

	@When("User select My Profile")
	public void user_select_my_profile() throws InterruptedException {
	   hp.clickonMyProfile();
	   Thread.sleep(1000);
	}

	@When("User perform an Edit operation")
	public void user_perform_an_edit_operation() {
	   
	}

	@Then("User details should be edited")
	public void user_details_should_be_edited() {
	    
	}
}
