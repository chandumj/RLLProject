package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//li[@class='logreg']/child::span[1]")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//input[@id='lemail']")
	private WebElement loginInputField;
	
	@FindBy(xpath = "//div[@id='loginotp']")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//div[@id='verfiedbtn']")
	private WebElement submitBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	
	public void enterEmail(String email) {
		loginInputField.sendKeys(email);
	}
	
	public void clickOnContinue() {
		continueBtn.click();
	}
	
	public void clickOnSubmit() {
		submitBtn.click();
	}
}
