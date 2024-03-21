package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindStoresPage {

	public WebDriver driver;
	public Actions action;

	@FindBy(xpath = "//select[@id=\"storetype\"]")
	private WebElement selectStoreType;

	@FindBy(xpath = "//select[@name=\"state\"]")
	private WebElement selectState;

	@FindBy(xpath = "//select[@name=\"city\"]")
	private WebElement selectCity;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchStoreBtn;

	public FindStoresPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	public void selectOneStore(String store) {
		Select select = new Select(selectStoreType);
		select.selectByValue(store);
	}

	public void selectOneState(String state) {
		Select select = new Select(selectState);
		select.selectByValue(state);
	}

	public void selectOneCity(String city) {
		Select select = new Select(selectCity);
		select.selectByValue(city);
	}

	public void clickOnSearchStore() {
		searchStoreBtn.click();
	}

}
