package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base{
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Phones & PDAs'])[1]")
	private WebElement phonesAndPADsMainMenu;
	
	@FindBy(xpath = "//h2[text()='Phones & PDAs']")
	private WebElement phonesAndPADsPage;
	
	@FindBy(id = "//*[@id='list-view']")
	private WebElement listView;
	
	@FindBy(id = "//*[@id='grid-view']")
	private WebElement gridView;
	
	@FindBy(id = "//*[@id='compare-total']")
	private WebElement productCompare;
	
	@FindBy(id = "//*[@id='input-sort']")
	private WebElement inputSort;
	
	@FindBy(id = "//*[@id='input-limit']")
	private WebElement inputLimit;
	
	@FindBy(className = "(//img[@class='img-responsive'])[2]")
	private WebElement HTCTouchHDimgResponsive;
	
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement HTCTouchHDnameLink;
	
	@FindBy(xpath = "//p[contains(text(),'HTC Touch')]")
	private WebElement HTCTouchHDtexDescriptions;
	
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement HTCTouchHDpriceTax;
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement HTCTouchAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement HTCTouchAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement HTCTouchCompareThisProduct;
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement iPhoneImgResponsive;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhoneNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'iPhone')]")
	private WebElement iPhoneTextDescriptions;
	
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement iPhonePrice;
	
	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement iPhoneAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[13]")
	private WebElement iPhoneAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement iPhoneCompareThisProduct;
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
	private WebElement palmTreoProImgResponsive;
	
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoProNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'Redefine')]")
	private WebElement palmTreoProTextDescription;
	
	@FindBy(className = "(//p[@class='price'])[3]")
	private WebElement palmTreoProPrice;
	
	@FindBy(xpath = "(//button[@type='button'])[15]")
	private WebElement palmTreoProAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[16]")
	private WebElement palmTreoProAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[17]")
	private WebElement palmTreoProCompareThisProduct;
	
	
	
	

}
