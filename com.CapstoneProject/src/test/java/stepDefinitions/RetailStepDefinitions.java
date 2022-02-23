package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RetailStepDefinitions extends Base{
	
	pageObject.RetailPageObject retailPage = new pageObject.RetailPageObject();
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPage.clickOnMyAccountButton();
		logger.info("verify user successfully clicked on MyAccount");

	}
	@When("User click on Login")
	public void user_click_on_login() {
		retailPage.clicOnloginDropdownButton();
		logger.info("verify user successfully clicked on loginButton");

	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		retailPage.enterYourNameInTextBox();
		retailPage.enterYourPassworInTextBox(string2);
		logger.info("verify user successfully entered username and password");
		
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.clickOnLoginButton();
		logger.info("verify user successfully clicked on login button");

	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailPage.validateMyAccountOnPage();
		logger.info("verify user successfully loged in to my account dashboard");

	}



	}
