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
	
	@FindBy(xpath = "(//div[@class='sb_head lft wt'])[2]")
	private WebElement logout;

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
	public void editAddress(String name,String building,String street,String pincode,String city,String state,String country,String mobile) throws InterruptedException {
		this.name.clear();
		this.name.sendKeys(name);
		buildingName.clear();
		buildingName.sendKeys(building);
		streetAddress.clear();
		streetAddress.sendKeys(street);
		this.pincode.clear();
		this.pincode.sendKeys(pincode);
		this.city.clear();
		this.city.sendKeys(city);
		
		this.state.sendKeys(state);
		
		this.country.sendKeys(country);
		mobileNo.clear();
		
		mobileNo.sendKeys(mobile);
		Thread.sleep(1000);
	}
	
	public void clickOnSave() {
		save.click();
	}
	
	public void clickonLogutprofile() {
		logout.click();
	}
	
}
