package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class RetailPageObject extends Base{
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginDropdownButton;
	@FindBy(id = "//input[@id='input-email']")
	private WebElement enterYourEmailTextBox;
	@FindBy(id = "//input[@id='input-password']")
	private WebElement enterYourPasswordTextBox;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement validateMyAccountOnPage;
	
	public void clickOnMyAccountButton() {
		Utilities.waitAndClickElement(myAccountButton);
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void clicOnloginDropdownButton() {
		loginDropdownButton.click();
		
	}
	public void enterYourNameInTextBox() {
		enterYourEmailTextBox.sendKeys("alexnew123@gmail.com");
	}
	public void enterYourPassworInTextBox(String yourPassword) {
		enterYourPasswordTextBox.sendKeys("Alexnew");
		
	}
	public void clickOnLoginButton() {
		loginButton.click();
		
	}
	public void validateMyAccountOnPage() {
		validateMyAccountOnPage.getText();
	}
	

}
