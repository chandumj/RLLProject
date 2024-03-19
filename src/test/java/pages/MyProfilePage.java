package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage {

	@FindBy(id = "txtAddName")
	private WebElement name;
	
	@FindBy(id = "txtAddAddress1")
	private WebElement buildingName;
	
	@FindBy(id = "txtAddAddress2")
	private WebElement streetAddress;
	
	@FindBy(id = "txtAddPincode")
	private WebElement pincode;
	
	@FindBy(id = "txtAddcity")
	private WebElement city;
	
	@FindBy(id = "txtAddState")
	private WebElement state;
	
	@FindBy(id = "txtAddCountry")
	private WebElement country;
	
	@FindBy(id = "txtAddMobile")
	private WebElement mobileNo;
	
	@FindBy(id = "btnSaveAddress")
	private WebElement save;
	
	
}
