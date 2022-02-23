package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomepageSteps extends Base{
	
	pageObject.HomepagePageObjects homePage = new pageObject.HomepagePageObjects();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrencyDropdown();		
		logger.info("Currency dropdwon was clicked successfully");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.selectCurrencyFromDropdown();
		logger.info("Currency was selected successfully");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePage.verifyCurrencyEuro();
		logger.info("Currency is validated successfully");
	}
}
