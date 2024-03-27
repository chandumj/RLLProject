package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath = "//input[@id='cty_pin']")
	private WebElement pinCode;
	
	@FindBy(xpath = "//div[@id='apply_pin']")
	private WebElement applyPinCode;
	
	//span[@class='quantity-icon']
	@FindBy(xpath = "//span[@class='J13M_42 cl_21 selectarrow cart-icon']")
	private WebElement quantityIcon;
	
	@FindBy(xpath = "((//span[@class='cnt-no selected J14R_42 cl_21'])[2]")
	private WebElement changeQty;
	
	@FindBy(xpath = "((//span[@id='activeshortlist'])[1]")
	private WebElement moveToShortlist;
	
	@FindBy(xpath = "//div[@id='shortlist_15934334']")
	private WebElement placeOrder;
	
	@FindBy(xpath = "//label[@id='ShortlistTab']")
	private WebElement myShortlist;
	
	@FindBy(xpath="//pro15666795[contains(text(),'Pine Kids Cotton Woven Full Sleeves Solid Color Sh')]")
	private WebElement productInCart;
	
	@FindBy(xpath="//pro15414449[contains(text(),'Pine Kids Cotton Woven Full Sleeve Denim Hooded Sh')]")
	private WebElement productInCart1;
	
	@FindBy(xpath = "//span[@class='mback_arrow cart-icon']")
	private WebElement backtoHomePage;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void EnterPinCode(String pincode) {
		pinCode.clear();
		pinCode.sendKeys(pincode);
	}
	
	public void clickOnApply() {
		applyPinCode.click();
	}
	
	public void changeQuantity() {
		wait.until(ExpectedConditions.visibilityOf(changeQty));
		changeQty.click();
	}
	
	public void moveToShortlist() {
		wait.until(ExpectedConditions.visibilityOf(moveToShortlist));
		moveToShortlist.click();
	}
	
	public void clickOnQuantyIcon() {
		wait.until(ExpectedConditions.visibilityOf(quantityIcon));
		quantityIcon.click();
	}
	
	public void clickOnBacktoCart() {
		wait.until(ExpectedConditions.visibilityOf(backtoHomePage));
		backtoHomePage.click();
	}

	public String getProductNameFromCart() {
        return productInCart.getText();
        //return productInCart1.getText();
    }
}
