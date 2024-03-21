package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	public WebDriver driver;
	public Actions actions;
	
	@FindBy(xpath = "//div[@class='spmn']/child::span[1]")
	private WebElement editBtn;
	
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

	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
	}
	
	public void clickonEditbtn() {
		if(editBtn.isEnabled()) {
			
			actions.moveToElement(editBtn).perform();
			editBtn.click();
		}
	}
	public void editAddress(String name,String building,String street,String pincode,String city,String state,String country,String mobile) {
		this.name.sendKeys(name);
		buildingName.sendKeys(building);
		streetAddress.sendKeys(street);
		this.pincode.sendKeys(pincode);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.country.sendKeys(country);
		mobileNo.sendKeys(mobile);
	}
	
	public void clickOnSave() {
		save.click();
	}
	
}
