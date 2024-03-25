package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShortListPage {
	
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@FindBy(xpath = "(//div[@class='bn_ctr nonehv lft wt'])[1]/child::div[1]")
	private WebElement shortListtoAddtocart;
	
	@FindBy(xpath = "(//div[@class='bn_ctr nonehv lft wt'])[1]/child::div[2]")
	private WebElement confirmShortListtoAddtocart;
	
	@FindBy(xpath = "(//div[@class='prd_delete'])[1]/child::span")
	private WebElement deleteFromShortlist;

	public ShortListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	public void clickOnAddtoCartFromSL() {
		wait.until(ExpectedConditions.visibilityOf(shortListtoAddtocart));
		shortListtoAddtocart.click();
	}
	
	public void clickOnDeleteFromSL() {
		wait.until(ExpectedConditions.visibilityOf(deleteFromShortlist));
		deleteFromShortlist.click();
	}

	public void clickOnConfirmAddToCartFromSL() {
		confirmShortListtoAddtocart.click();
	}


}
