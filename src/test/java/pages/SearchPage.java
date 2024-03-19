package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public WebDriver driver;
	@FindBy(xpath = "(//div[@class='li_inner_block'])[1]/descendant::img")
	private WebElement firstProduct;
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonFirstProduct() {
		firstProduct.click();
	}
}
