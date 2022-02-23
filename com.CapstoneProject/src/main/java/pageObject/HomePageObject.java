package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyButton;
	
	@FindBy(id = "//form[@id='form-currency']")
	private WebElement dropDownCurrencyButton;
	
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroCurrency;
	
	@FindBy(xpath = "//button[text()='£ Pound Sterling']")
	private WebElement poundSterling;
	
	@FindBy(xpath ="//button[text()='$ US Dollar']")
	private WebElement usDollar;
	
	@FindBy(className = "//i[@class='fa fa-phone']")
	private WebElement phoneIcon;
	
	@FindBy(xpath = "//span[text()='123456789']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//i[@class='fa fa-user']")
	private WebElement userIcon;
	
	@FindBy(className = "//span[text()='My Account']")
	private WebElement myAccountHeaderMain;
	
	@FindBy(className = "//span[@class='caret']")
	private WebElement dorpDownMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(className = "//span[text()='Wish List (0)']")
	private WebElement wishListMain;
	
	@FindBy(tagName ="//span[text()='Shopping Cart']")
	private WebElement shoppingCartMain;
	
	@FindBy(xpath = "//i[@class='fa fa-share']")
	private WebElement shareIconHomePage;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkoutMain;
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement tesEnvironment;
	
	@FindBy(className = "//input[@name='search']")
	private WebElement searchInoutMain;
	
	@FindBy(id = "//span[@id='cart-total']")
	private WebElement cartTotalMain;
	
	@FindBy(id = "//div[@id='slideshow0']")
	private WebElement sildeShowMainPage;
	
	@FindBy(xpath = "//h3[text()='Featured']")
	private WebElement Featured;
	
	@FindBy(className = "(//img[@class='img-responsive'])[5]")
	private WebElement macPicture;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
	private WebElement macDsscription;
	
	@FindBy(className = "(//p[@class='price'])[1]")
	private WebElement macPriceTax;
	
	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div[3]//button[1]")
	private WebElement macAddToCart;
	
	@FindBy(className = "//div[contains(@class,'product-layout')][1]//div//div[3]//button[2]")
	private WebElement macAddToWishList;
	
	@FindBy(className = "//div[contains(@class,'product-layout')][1]//div//div[3]//button[3]")
	private WebElement macCompareThisProductArrow;
	
	@FindBy(className = "(//img[@class='img-responsive'])[6]")
	private WebElement iphoneImgResponsive;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhoneLinkName;
	
	@FindBy(xpath = "//p[contains(text(),'iPhone is a revolutionary')]")
	private WebElement iPhoneTextDescription;
	
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement iPhonePrice;
	
	@FindBy(className = "(//span[@class='price-tax'])[2]")
	private WebElement iphonePriceTax;
	
	@FindBy(className = "(//span[@class='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement iphoneAddToCart;
	
	@FindBy(className = "(//button[@type='button'])[12]")
	private WebElement iphoneAddToWishList;
	
	@FindBy(className = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement iphoneCompareThisProductArrow;
	
	@FindBy(id = "(//img[@class='img-responsive'])[7]")
	private WebElement appleCinema30imgResposnsive;
	
	@FindBy(xpath = "(//a[text()='Apple Cinema 30\"'])")
	private WebElement appleCinema30LinkName;
	
	@FindBy(xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD Display')]")
	private WebElement appleCinema30TextDescriptions;
	
	@FindBy(className = "(//span[@class='price-new'])[1]")
	private WebElement appleCinema30PriceNew;
	
	@FindBy(className = "(//span[@class='price-old'])[1]")
	private WebElement appleCinema30PriceOld;
	
	@FindBy(className = "(//span[@class='price-tax'])[3]")
	private WebElement appleCinema30PriceTax;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement appleCinema30AddToCart;
	
	@FindBy(className = "(//button[@type='button'])[15]")
	private WebElement appleCinema30AddToWishList;
	
	@FindBy(className = "(//button[@type='button'])[16]")
	private WebElement appleCinema30CompareThisProductArrow;
	
	@FindBy(id = "(//div[@class='image'])[4]")
	private WebElement canonEOS5DPicture;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5DlinkName;
	
	@FindBy(xpath = "//p[contains(text(),'Canon')]")
	private WebElement canonTextDescriptions;
	
	@FindBy(className = "(//span[@class='price-new'])[2]")
	private WebElement canonEOS5DPriceNew;
	
	@FindBy(className = "(//span[@class='price-old'])[2]")
	private WebElement canonEOS5DPriceOld;
	
	@FindBy(className = "(//span[@class='price-tax'])[4]")
	private WebElement canonEOS5DPriceTax;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement canonEOS5DaddToCart;
	
	@FindBy(className = "(//i[@class='fa fa-heart'])[5]")
	private WebElement canonEOS5DaddToWishList;
	
	@FindBy(className = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement canonEOS5DCompareThisProductArrow;
	
	@FindBy(className = "(//div[@class='container'])[5]")
	private WebElement footer;
	
	@FindBy(xpath = "//h5[text()='Information']")
	private WebElement information;
	
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformation;
	
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement privacyPolicy;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termsAndConditions;
	
	@FindBy(xpath = "//h5[text()='Customer Service']")
	private WebElement customerService;
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement returns;
	
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement siteMap;
	
	@FindBy(xpath = "//h5[text()='Extras']")
	private WebElement extras;
	
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement brands;
	
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertificates;
	
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement affiliate;
	
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement specials;
	
	@FindBy(xpath = "//h5[text()='My Account']")
	private WebElement myAccountfooterParent;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccountFooterChild;
	
	@FindBy(xpath = "//a[text()='Order History']")
	private WebElement orderHistory;
	
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement wishList;
	
	@FindBy(xpath = "//a[text()='Newsletter']")
	private WebElement newsletter;
	
	@FindBy(xpath = "//p[contains(text(),'Powered By')]")
	private WebElement poweredByOpenCart;
	
	@FindBy(tagName = "a")
	private List <WebElement> tagA;
	

	
	
	public void validateHomePage() {
		String text = tesEnvironment.getText();
		if (text.equalsIgnoreCase("TEST INVORONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		}
	
	

	}
	

}
