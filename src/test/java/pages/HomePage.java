package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public Actions action;
	
	@FindBy(xpath = "//input[@id='search_box']")
	private WebElement searchInputField;
	
	@FindBy(xpath = "//span[@class='search-button']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//span[contains(@class,'anch myacc_2')]")
	private WebElement myAccount;
	
	@FindBy(linkText = "My Profile")
	private WebElement myProfile;
	
	@FindBy(xpath="//span[text()='Stores & Preschools']")
    WebElement storespreschool;
	
	@FindBy(xpath="//span[text()='Find Stores']")
	WebElement findstores;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/ul/li[2]/a/span")
	WebElement findpreschool;
	
	@FindBy(xpath="//span[@id='cart_TotalCount']")
	WebElement cartBtn;

	@FindBy(xpath  =  "//div[@id='searchlist']")
	private WebElement searchList;
	
	@FindBy(xpath = "//div[@id='searchlist']/descendant::li[1]")
	private WebElement firstItemInList;

	@FindBy(xpath = "")
	WebElement shortlistBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action=new Actions(driver);
	}
	
	public void EnterProduct(String productName) throws InterruptedException {
		searchInputField.clear();
		searchInputField.sendKeys(productName);
		Thread.sleep(1000);
		action.moveToElement(firstItemInList).click().build().perform();
	}
	
	public void clickOnSearch() {
		searchBtn.click();
	}
	
	public void hovertoMyAccount() {
		action.moveToElement(myAccount).perform();
		
	}
	public void clickonMyProfile() {
		action.moveToElement(myProfile).click().build().perform();
	}
	public void hovertoStoresandPreSchool() {
		action.moveToElement(storespreschool);
	}
	public void clickonCart() {
		cartBtn.click();
	}
	
	public void clickonShortlist() {
		shortlistBtn.click();
	}
}
