package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindStoresPage {

	public WebDriver driver;
	public Actions action;
	
	@FindBy(xpath = "//select[@id='storetype']")
	private WebElement selectStoreType;
	
	@FindBy(xpath = "//select[@name='state']")
	private WebElement selectState;
	
	@FindBy(xpath = "//select[@name='city']")
	private WebElement selectCity;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchStoreBtn;

	public FindStoresPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action=new Actions(driver);
	}
	
	public void clickOnStoreType() {
		action.moveToElement(selectStoreType).click().build().perform();
	}
	
	public void selectOneStore() {
		Select select=new Select(selectStoreType);
		select.selectByIndex(0);
	}
	
	public void clickOnSelectState() {
		action.moveToElement(selectState).click().build().perform();
	}
	
	public void selectOneState() {
		Select select=new Select(selectState);
		select.selectByIndex(0);
	}
	public void clickOnSelectCity() {
		action.moveToElement(selectCity).click().build().perform();
	}
	
	public void selectOneCity() {
		Select select=new Select(selectCity);
		select.selectByIndex(0);
	}

	public void clickOnSearchStore() {
		searchStoreBtn.click();
	}
	
}
