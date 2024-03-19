package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'ADD TO CART')]")
	private WebElement addToCartButton;

	@FindBy(id = "shortlist")
	private WebElement shortlist;

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddToCart() {
		addToCartButton.click();
	}
	public void clickOnShortlistBtn() {
		shortlist.click();
	}

}
