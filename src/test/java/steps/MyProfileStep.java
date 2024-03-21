package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MyProfilePage;

public class MyProfileStep {
	SharedSteps shared=new SharedSteps();
	public WebDriver driver=shared.getDriver();
	HomePage hp=new HomePage(driver);
	MyProfilePage prp=new MyProfilePage(driver);
	
	@When("User click on My Account")
	public void user_click_on_my_account() {
	   hp.hovertoMyAccount();
	}

	@When("User select My Profile")
	public void user_select_my_profile() throws InterruptedException {
	   hp.clickonMyProfile();
	   Thread.sleep(1000);
	}

	@When("User perform an Edit operation on My Address Book")
	public void user_perform_an_edit_operation_on_my_address_book() {
	   prp.clickonEditbtn();
	}

	@When("User add\\/change delivery address of {string}")
	public void user_add_change_delivery_address_of(String string) throws InterruptedException {
		String name=null;
		String building=null;
		String street=null;
		String pincode=null;
		String city=null;
		String state=null;
		String country=null;
		String mobile=null;
		 prp.editAddress(name, building, street, pincode, city, state, country, mobile);
		   Thread.sleep(1000);
	}
	@When("User add delivery address like {string},{string} ,{string},{string},{string},{string},{string},{string}")
	public void user_add_delivery_address_like(String name, String building, String street, String pincode, String city, String state, String country, String mobile) throws InterruptedException {
	   prp.editAddress(name, building, street, pincode, city, state, country, mobile);
	   Thread.sleep(1000);
	}

	@When("click on Save")
	public void click_on_save() {
	   prp.clickOnSave();
	}

	@Then("User can view the edited address")
	public void user_can_view_the_edited_address() {
	   
	}

}
