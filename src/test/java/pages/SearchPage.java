package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath = "(//div[@class='li_inner_block'])[1]/descendant::img")
	private WebElement firstProduct;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void clickonFirstProduct() {
		wait.until(ExpectedConditions.visibilityOf(firstProduct));
		firstProduct.click();
	}
}
