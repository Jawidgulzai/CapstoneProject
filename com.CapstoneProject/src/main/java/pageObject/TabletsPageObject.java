package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base{
	public TabletsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Tablets'])[1]")
	private WebElement taletsMainMenu;
	
	@FindBy(xpath = "//h2[text()='Tablets']")
	private WebElement talets;
	
	@FindBy(id = "//button[@id='list-view']")
	private WebElement tabletsListView;
	
	@FindBy(id = "//button[@id='grid-view']")
	private WebElement tabletsGridView;
	
	@FindBy(id = "//a[@id='compare-total']")
	private WebElement productCompare;
	
	@FindBy(id = "//select[@id='input-sort']")
	private WebElement tabletsInputSort;
	
	@FindBy(id = "//select[@id='input-limit']")
	private WebElement tabletsInputLimits;
	
	@FindBy(className = "(//img[@class='img-responsive'])[2]")
	private WebElement HTCTouchHDimgResponsive;
	
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement HTCTouchHDnameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'HTC Touch')]")
	private WebElement HTCTouchTextDescription;
	
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement HTCTouchPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[9]")
	private WebElement HTCTouchAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[10]")
	private WebElement HTCTouchAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[11]")
	private WebElement HTCTouchCompareThisProduct;
	
	@FindBy(className = "(//img[@class='img-responsive'])[3]")
	private WebElement iPhoneimgResponsive;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhoneNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'iPhone')]")
	private WebElement iPhoneTextDescription;
	
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement iPhonePrice;
	
	@FindBy(xpath = "(//*[@type='button'])[12]")
	private WebElement iPhoneAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[13]")
	private WebElement iPhoneAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[14]")
	private WebElement iPhoneCompareThisProduct;
	
	@FindBy(className = "(//img[@class='img-responsive'])[4]")
	private WebElement palmTreoProimgResponsive;
	
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoProNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'Redefine your workday')]")
	private WebElement palmTreoProTextDescription;
	
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement palmTreoProPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[15]")
	private WebElement palmTreoProAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[16]")
	private WebElement palmTreoProAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[17]")
	private WebElement palmTreoProCompareThisProduct;
	
	
	

}
