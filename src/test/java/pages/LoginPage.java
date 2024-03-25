package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;
	public WebDriverWait wait;
	
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
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
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
