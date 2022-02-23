package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DesktopsPageObject;
import utilities.Utilities;


public class DesktopsStepDefinitions extends Base{
	
	DesktopsPageObject desktop = new DesktopsPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@When("User click on Desktops tab")
	public void user_click_on_destops_tab() {
		desktop.clickOnDesktopsTab();
		logger.info("User successfully clicked on Destops tab");
	   
	}
	@And ("User click on Show all Desktops")
	public void user_click_on_show_all_destops() {
		desktop.clickOnshowAllDesktops();
		logger.info("User clicked on Show all Destops tab successfully");
	   
	}
	@Then("User should see all items are present in Desktops page")
	public void user_should_see_all_items_are_present_in_desktops_page() throws IOException {
		Utilities.scrolldownPage();
		Utilities.takeScreenShot("all items in desktopPage");
		logger.info("User should see all items are present in Desktops page successfully");
	    
	}
	@When("User click ADD TO CART option on 'HP LP3065' items")
	public void user_click_add_to_cart_option_on_hp_lp3065_items() {
		desktop.HPLP3065addToCartFromDestop();
		logger.info("User click ADD TO CART option on 'HP LP3065' items successfully");
	 
	}
	@When("User click on quantiy 1")
	public void user_click_on_quantiy() {
		desktop.HPLP3065Quantity();
		logger.info("User click on quantiy 1 successfully");
		
	   
	}
	//duplicate stepDef
//	@When("User click on add to cart button")
//	public void user_click_on_add_to_cart_button() {
//		desktop.HPLP3065addToShopingCart();
//		logger.info("User click on add to cart button");
//	   
//	}
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
		desktop.SuccessMessageHPLP3065addToShopingCart();
		logger.info("User successfully see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’");
		
	   
	}
	@And("User click ADD TO CART option on 'Canon EOS 5D' item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.clickOnCanonEOS5DaddToCart();
		logger.info("User successfully click ADD TO CART option on ‘Canon EOS 5D’ item");
		
	   
	}
	@And("User select color from dropdown 'Red'")
	public void user_select_color_from_dropdown_red() {
		desktop.clickOnCanonEOS5DdropdownRedColor();
		logger.info("User successfully select color red from dropdown");
	    
	}
	@When("User select quantity 1")
	public void user_select_quantity() {
		desktop.clickOnCanonEOS5DQuantity();
		logger.info("User successfully select quantity 1");
		
	   
	}
	//duplicate stepDef
//	@When("User click add to Cart button")
//	public void user_click_add_to_cart_button() {
//		desktop.canonEOS5DaddToShoppingCart();
//		logger.info("User successfully click add to Cart button");
//	  
//	}
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		desktop.canonEOS5DSuccessMessage();
		logger.info("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’");
	   
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.canonEOS5DWriteAreview();
		logger.info("User click on write a review link");
	   
	}
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>>data = dataTable.asMaps(String.class, String.class);
		desktop.canonEOS5DenterYourName(data.get(0).get("yourName"));
		desktop.canonEOS5DWriteYourReview(data.get(0).get("yourReview"));
		desktop.canonEOS5DputYourRate(data.get(0).get("Rating"));
		logger.info("verify user successfully fill the review information");

	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktop.canonEOS5DcontinueButton();
		logger.info("User successfully click on Continue Button");
	    
	}
	@Then("User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		desktop.canonEOS5DsuccessMessageForReveiw();
		logger.info("User should see a message for adding review");
	   
	}
	

}
