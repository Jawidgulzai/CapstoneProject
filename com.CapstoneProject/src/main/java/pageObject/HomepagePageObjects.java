package pageObject;

import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.Utilities;

public class HomepagePageObjects extends Base{
	
	public HomepagePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyButton;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//li[1]")
	private WebElement currencyList;
	@FindBy(xpath = "//form//div//button[@data-toggle='dropdown']//strong")
	private WebElement euroCurrency;
	
	public void clickOnCurrencyDropdown() {
		Utilities.waitAndClickElement(currencyButton);
	}
	public void selectCurrencyFromDropdown() {
		List<WebElement> currencyDropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		for (int i = 1; i < currencyDropdown.size(); i++) {
			WebElement currencyList = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li["+i+"]"));
			String strCurrency = currencyList.getText();
			if(strCurrency.equalsIgnoreCase("$ US Dollar")) {
				Utilities.waitAndClickElement(currencyList);
			}else {
				System.out.println("Your currency was not found in the list");
			}
		}
	}
	public void verifyCurrencyEuro() {
		String actualStrEuroCurrency = euroCurrency.getText();
		String expectedStrEuroCurrency = "$";
		Assert.assertEquals(expectedStrEuroCurrency, actualStrEuroCurrency);
	}

}