package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[text()='Software'])[2]")
	private WebElement sofwareMain;
	
	@FindBy(xpath = "//h2[text()='Software']")
	private WebElement software;
	
	@FindBy(xpath = "//p[contains(text(),'There are')]")
	private WebElement softwareTextDescriptions;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continueButton;
	
	

}

