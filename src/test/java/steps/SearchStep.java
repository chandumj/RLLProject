package steps;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class SearchStep {

	SharedSteps shared = new SharedSteps();
	public WebDriver driver = shared.getDriver();
	HomePage hp = new HomePage(driver);
	SearchPage sp = new SearchPage(driver);

	@When("User search for {string}")
	public void user_search_for(String string) throws InterruptedException {
		try {
			hp.EnterProduct(string);
		} catch (Exception e) {
			hp.clickOnSearch();
		}

	}

	@When("select product from the search results")
	public void select_product_from_the_search_results() {
		try {
			sp.clickonFirstProduct();
		} catch (Exception e) {

		}

	}

	@When("User switches focus to the new tab")
	public void user_switches_focus_to_the_new_tab() {
		try {
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(tabs.size() - 1));
		} catch (Exception e) {

		}

	}

	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) throws InterruptedException {
		String actualTitle = driver.getTitle();
		try {
			assert expectedTitle.equals(actualTitle);
		} catch (Exception e) {

		}
//		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(0));
		hp.clickOnFirstcryIcon();
		hp.hovertoMyAccount();
		hp.clickOnLogout();
	}
}
