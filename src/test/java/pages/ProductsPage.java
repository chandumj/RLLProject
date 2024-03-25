package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

	public WebDriver driver;
	public WebDriverWait wait;

	@FindBy(xpath = "//span[contains(text(),'ADD TO CART')]")
	private WebElement addToCartButton;

	@FindBy(id = "shortlist")
	private WebElement shortlist;

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	public void clickOnAddToCart() {
		wait.until(ExpectedConditions.visibilityOf(addToCartButton));
		addToCartButton.click();
	}
	public void clickOnShortlistBtn() {
		wait.until(ExpectedConditions.visibilityOf(shortlist));
		shortlist.click();
	}

}
