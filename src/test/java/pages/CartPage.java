package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='cty_pin']")
	private WebElement pinCode;
	
	@FindBy(xpath = "//div[@id='apply_pin']")
	private WebElement applyPinCode;
	
	//span[@class='quantity-icon']
	@FindBy(xpath = "//span[@class='quantity-icon']")
	private WebElement quantityIcon;
	
	@FindBy(xpath = "(//div[@class='qty_popup-value'])[2]")
	private WebElement changeQty;
	
	@FindBy(xpath = "(//div[@title='Shortlist']")
	private WebElement moveToShortlist;
	
	@FindBy(xpath = "//div[@id='shortlist_15934334']")
	private WebElement placeOrder;
	
	@FindBy(xpath = "//label[@id='ShortlistTab']")
	private WebElement myShortlist;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPinCode(String pincode) {
		
		pinCode.clear();
		pinCode.sendKeys(pincode);
	}
	public void clickOnApply() {
		applyPinCode.click();
	}
	
	public void changeQuantity() {
		changeQty.click();
	}
	public void moveToShortlist() {
		moveToShortlist.click();
	}
	public void clickOnQuantyIcon() {
		quantityIcon.click();
	}
}
