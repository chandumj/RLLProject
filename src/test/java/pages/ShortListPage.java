package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShortListPage {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class='addto-cart-button']")
	private WebElement shortListtoAddtocart;
	
	@FindBy(xpath = "//div[@id='dltfromsrtlst_15934334']")
	private WebElement deleteFromShortlist;

	public ShortListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddtoCartFromSL() {
		shortListtoAddtocart.click();
	}
	
	public void clickOnDeleteFromSL() {
		deleteFromShortlist.click();
	}




}
