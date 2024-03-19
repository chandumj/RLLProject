package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefination {

	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	LoginPage lp=new LoginPage(driver);
	
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
	   lp.clickOnLogin();
	}

	@When("user enter valid emailid")
	public void user_enter_valid_emailid() {
	   lp.enterEmail("chandumj787013@gmail.com");
	}

	@When("user click on the continue button")
	public void user_click_on_the_continue_button() throws InterruptedException {
	    Thread.sleep(2000);
		lp.clickOnContinue();
	}

	@When("user click the submit button")
	public void user_click_the_submit_button() throws InterruptedException {
	    Thread.sleep(30000);
		lp.clickOnSubmit();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	   
	}

}
