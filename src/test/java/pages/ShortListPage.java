package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShortListPage {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='bn_ctr nonehv lft wt'])[1]/child::div[1]")
	private WebElement shortListtoAddtocart;
	
	@FindBy(xpath = "(//div[@class='bn_ctr nonehv lft wt'])[1]/child::div[2]")
	private WebElement confirmShortListtoAddtocart;
	
	@FindBy(xpath = "(//div[@class='prd_delete'])[1]/child::span")
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

	public void clickOnConfirmAddToCartFromSL() {
		confirmShortListtoAddtocart.click();
	}


}
