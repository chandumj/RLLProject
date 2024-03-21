package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindPreSchoolPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='pincode-center-finder']")
	private WebElement cityInputField;
	
	@FindBy(xpath = "//input[@class='serch-finder-btn']")
	private WebElement citySearchBtn;
	
	@FindBy(xpath = "")
	private WebElement anyPreSchool;

	public FindPreSchoolPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCity(String city) {
		cityInputField.sendKeys(city);
	}
	
	public void clickOnCitySearch() {
		citySearchBtn.click();
	}
	
	public void selectAnySchool() {
		anyPreSchool.click();
	}
}
