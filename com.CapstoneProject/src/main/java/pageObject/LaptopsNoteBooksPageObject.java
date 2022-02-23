package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {
	
	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class='dropdown'])[3]")
	private WebElement dropdownLaptopsAndNoteBooks;
	
	@FindBy(xpath = "//*[text()='Macs (0)']")
	private WebElement mainDropdownMacs;
	
	@FindBy(xpath = "//*[text()='Windows (0)']")
	private WebElement mainDropdownWindows;
	
	@FindBy(xpath = "//*[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebooks;
	
	@FindBy(xpath = "(//*[text()='Laptops & Notebooks'])[4]")
	private WebElement laptopsAndNotebooks;
	
	@FindBy(xpath = "//*[@class='col-sm-10']")
	private WebElement laptopsAndNotebooksDescriptionText;
	
	@FindBy(xpath = "//*[text()='Refine Search']")
	private WebElement refineSearch;
	
	@FindBy(xpath = "(//*[text()='Macs (0)'])[2]")
	private WebElement macLinkedName;
	
	@FindBy(xpath = "(//*[text()='Windows (0)'])[2]")
	private WebElement windowsLinkedName;
	
	@FindBy(id = "//*[@id='list-view']")
	private WebElement listView;
	
	@FindBy(id = "//*[@id='grid-view']")
	private WebElement gridView;
	
	@FindBy(xpath = "//*[text()='Product Compare (1)']")
	private WebElement productCopareLink;
	
	@FindBy(id = "//*[@id='input-sort']")
	private WebElement intputSortTextBox;
	
	@FindBy(className = "//*[@id='input-limit']")
	private WebElement inputLimitTextBox;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[2]")
	private WebElement hPLP3065ImgResposive;
	
	@FindBy(xpath = "//*[text()='HP LP3065']")
	private WebElement HPLP3065LinkedName;
	
	@FindBy(xpath = "//p[contains(text(),'Stop your co-workers')]")
	private WebElement HPLP3065TextDescriptions;
	
	@FindBy(xpath = "//span[text()='Ex Tax: $100.00']")
	private WebElement HPLP3065Price;
	
	@FindBy(xpath = "(//*[@type='button'])[10]")
	private WebElement HPLP3065AddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[11]")
	private WebElement HPLP3065AddtoWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[12]")
	private WebElement HPLP3065CompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[3]")
	private WebElement macBookImgResponsive;
	
	@FindBy(xpath = "//*[text()='MacBook']")
	private WebElement macBookLinkName;
	
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
	private WebElement macBookTextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price-tax'])[2]")
	private WebElement macBookPriceTax;
	
	@FindBy(xpath = "(//*[@type='button'])[13]")
	private WebElement macBookAddToCart;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartOption;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement macBookRedXbutton;
	
	@FindBy(id = "//span[@id='cart-total']")
	private WebElement removeItemFromCart;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement productComparisonIcon;
	
	@FindBy(xpath = "(//*[@type='button'])[14]")
	private WebElement macBookAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[15]")
	private WebElement macBookCompareThisProduct;
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
	private WebElement macBookAirImgResponsive;
	
	@FindBy(xpath = "//h2[text()='£1,225.00']")
	private WebElement macBookAirActualPrice;
	
	@FindBy(xpath = "//*[text()='MacBook Air']")
	private WebElement macBookAirNameLink;
	
	@FindBy(xpath = "//p[contains(text(),'MacBook Air is ultrathin')]")
	private WebElement mackBookAirTexDescriptions;
	
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement macBookAirPrice;
	
	@FindBy(xpath = "(//button[@type='button'])[15]")
	private WebElement macBookAirAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[16]")
	private WebElement macBookAirAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[17]")
	private WebElement macBookAirCompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[5]")
	private WebElement macBookProImgResponsive;
	
	@FindBy(xpath = "(//*[text()='MacBook Pro'])")
	private WebElement macBookProNameLink;
	
	@FindBy(xpath = "//p[contains(text(),'Latest Intel mobile')]")
	private WebElement macBookProTextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price'])[4]")
	private WebElement macBookProPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[18]")
	private WebElement macBookProAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[19]")
	private WebElement macBookProAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[20]")
	private WebElement macBookProCompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[6]")
	private WebElement sonyVAIOimgResponsive;
	
	@FindBy(xpath = "//*[text()='Sony VAIO']")
	private WebElement sonyVAIOlinkedName;
	
	@FindBy(xpath = "//p[contains(text(),'Unprecedented power')]")
	private WebElement sonyVAIOtextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price'])[5]")
	private WebElement sonyVAIOpriceTax;
	
	@FindBy(xpath = "(//*[@type='button'])[21]")
	private WebElement sonyVAIOAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[22]")
	private WebElement sonyVAIOAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[23]")
	private WebElement sonyVAIOcopareThisProduct;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement sonyVAIOsuccessMessage;

	
	public void dropdownLaptopsAndNoteBooks() {
		dropdownLaptopsAndNoteBooks.click();
		
	}


	public void showAllLaptopsNotebooks() {
		showAllLaptopsNotebooks.click();
		
	}


	public void macBookImgResponsive() {
		macBookImgResponsive.click();
		
	}


	public void macBookTextDescriptions() {
		macBookTextDescriptions.getText();
		
	}


	public void macBookAddToCart() {
		macBookAddToCart.getText();
		
		
	}


	public void addToCartOption() {
		addToCartOption.click();
		
		
	}


	public void macBookRedXbutton() {
		macBookRedXbutton.click();
		
		
	}


	public void removeItemFromCart() {
		removeItemFromCart.clear();
		
		
	}


	public void productComparisonIcon() {
		productComparisonIcon.click();
		
	}


	public void macBookAirCompareThisProduct() {
		macBookAirCompareThisProduct.click();
		
	}


	public void macBookAirImgResponsive() {
		macBookAirImgResponsive.click();
		
	}


	public void sonyVAIOAddToWishList() {
		sonyVAIOAddToWishList.click();
		
	}


	public void sonyVAIOsuccessMessage() {
		sonyVAIOsuccessMessage.getText();
		
	}


	public void macBookProImgResponsive() {
		macBookProImgResponsive.click();
		
	}


	public void macBookAirActualPrice() {
		macBookAirActualPrice.getText();
		
	}
	
	
	

}
