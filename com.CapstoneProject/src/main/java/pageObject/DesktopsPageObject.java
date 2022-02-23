package pageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class DesktopsPageObject extends Base{
	
	private static final WebElement BlueCanon = null;

	private static final WebElement GreenCanon = null;


	public DesktopsPageObject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidate;
	
	@FindBy(className = "(//*[@class='dropdown-toggle'])[2]")
	private WebElement desktopsTab;
	
	@FindBy(xpath = "//*[text()='PC (0)']")
	private WebElement dropDownPC;
	
	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement dropDownMac;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "(//*[text()='Desktops'])[4]")
	private WebElement desktopName;
	
	@FindBy(xpath = "//*[@class='img-thumbnail']")
	private WebElement imgThumbnail;
	
	@FindBy(xpath = "//*[@class='col-sm-10']")
	private WebElement ExampleOfCategoryDescriptionText;
	
	@FindBy(xpath = "//*[text()='Refine Search']")
	private WebElement refineSearch;

	@FindBy(xpath = "(//*[text()='PC (0)'])[2]")
	private WebElement PClink;
	
	@FindBy(xpath = "(//*[text()='Mac (1)'])[2]")
	private WebElement macLink;
	
	@FindBy(id = "//*[@id='list-view']")
	private WebElement listView;
	
	@FindBy(id = "//*[@id='grid-view']")
	private WebElement gridView;
	
	@FindBy(id = "//*[@id='compare-total']")
	private WebElement productCompare;
	
	@FindBy(id = "//*[@id='input-sort']")
	private WebElement inputSort;
	
	@FindBy(id = "//*[@id='input-limit']")
	private WebElement inputLimint;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[2]")
	private WebElement appleCinema30ImgResposive;
	
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinema30NameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD')]")
	private WebElement appleCinema30TexDescription;
	
	@FindBy(className = "(//*[@class='price-new'])[1]")
	private WebElement appleCinema30PriceNew;
	
	@FindBy(className = "(//*[@class='price-old'])[1]")
	private WebElement appleCinema30PriceOld;
	
	@FindBy(className = "(//*[@class='price-tax'])[1]")
	private WebElement appleCinema30PriceTax;
	
	@FindBy(xpath = "(//*[@type='button'])[9]")
	private WebElement appleCinema30AddToCart;
	
	@FindBy(className = "(//*[@type='button'])[10]")
	private WebElement appleCinema30AddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[11]")
	private WebElement appleCinema30CompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[3]")
	private WebElement canonEOS5DimgResponsive;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5DnameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'press material for the EOS 5D')]")
	private WebElement canonEOS5DtextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price-new'])[2]")
	private WebElement canonEOS5DpriceNew;
	
	@FindBy(xpath = "(//*[@class='price-old'])[2]")
	private WebElement canonEOS5DpriceOld;
	
	@FindBy(xpath = "(//*[@class='price-tax'])[2]")
	private WebElement canonEOS5DpriceTax;
	
	@FindBy(xpath = "(//*[@type='button'])[12]")
	private WebElement canonEOS5DaddToCart;
	
	@FindBy(id = "//select[@id='input-option226']")
	private WebElement canonEOS5DdropdownButton;
	
	@FindBy(xpath = "//option[@value='15']")
	private WebElement canonEOS5DdropdownRedColor;
	
	@FindBy(id = "//input[@id='input-quantity']")
	private WebElement canonEOS5DQuantity;
	
	@FindBy(id = "//button[@id='button-cart']")
	private WebElement canonEOS5DaddToShoppingCart;
	
	@FindBy(xpath = "(//*[@type='button'])[14]")
	private WebElement canonEOS5DaddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[15]")
	private WebElement canonEOS5DcompareThisProduct;
	
	@FindBy(className = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement canonEOS5DSuccessMessage;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement canonEOS5DWriteAreview;
	
	@FindBy(id = "//input[@id='input-name']")
	private WebElement canonEOS5DenterYourName;
	
	@FindBy(id = "//textarea[@id='input-review']")
	private WebElement canonEOS5DWriteYourReview;
	
	@FindBy(xpath = "//input[@value='5']")
	private WebElement canonEOS5DputYourRate;
	
	@FindBy(id = "//button[@id='button-review']")
	private WebElement canonEOS5DcontinueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement canonEOS5DsuccessMessageForReveiw;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[4]")
	private WebElement HPLP3065imgResponsive;
	
	@FindBy(xpath = "//p[contains(text(),'Stop your co-workers')]")
	private WebElement HPLP3065TextDescriptions;
	
	@FindBy(xpath = "//*[text()='HP LP3065']")
	private WebElement HPLP3065linkName;
	
	@FindBy(xpath = "(//*[@class='price'])[3]")
	private WebElement HPLP3065price;
	
	@FindBy(xpath = "(//*[@type='button'])[16]")
	private WebElement HPLP3065addToCart;
	
	@FindBy(id = "//input[@id='input-quantity']")
	private WebElement HPLP3065Quantity;
	
	@FindBy(id = "//button[@id='button-cart']")
	private WebElement HPLP3065addToShopingCart;
	
	@FindBy(xpath = "(//*[@type='button'])[17]")
	private WebElement HPLP3065addToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[18]")
	private WebElement HPLP3065CopareThisProduct;
	
	@FindBy(className = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessageHPLP3065addToShopingCart;
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[5]")
	private WebElement HTCTouchHDimgResponsive;
	
	@FindBy(xpath = "//*[text()='HTC Touch HD']")
	private WebElement HTCTouchHDnameLink;
	
	@FindBy(xpath = "//p[contains(text(),'HTC Touch - in High Definition')]")
	private WebElement HTCTouchHDTextDescriptions;

	@FindBy(xpath = "(//*[@class='price'])[4]")
	private WebElement HTCTouchHDprice;
	
	@FindBy(xpath = "(//*[@type='button'])[19]")
	private WebElement HTCTouchHDaddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[20]")
	private WebElement HTCTouchHDaddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[21]")
	private WebElement HTCTouchHDcopareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[6]")
	private WebElement iPhoneImgResponsive;
	
	@FindBy(xpath = "//*[text()='iPhone']")
	private WebElement iPhoneNameLink;
	
	@FindBy(xpath = "//p[contains(text(),'iPhone is a revolutionary')]")
	private WebElement iPhoneDescription;
	
	@FindBy(xpath = "(//*[@class='price'])[5]")
	private WebElement iPhonePrice;
	
	@FindBy(xpath = "(//*[@type='button'])[22]")
	private WebElement iPhoneAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[23]")
	private WebElement iPhoneAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[24]")
	private WebElement iPhoneCompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[7]")
	private WebElement iPodClassicImgResponsive;
	
	@FindBy(xpath = "//*[text()='iPod Classic']")
	private WebElement iPodClassicNameLink;
	
	@FindBy(xpath = "//p[contains(text(),'More room to move')]")
	private WebElement iPodClassicTextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price'])[6]")
	private WebElement iPodClassicPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[25]")
	private WebElement iPodClassicAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[26]")
	private WebElement iPodClassicAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[27]")
	private WebElement iPodClassicCompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[8]")
	private WebElement macBookImgResponsive;
	
	@FindBy(xpath = "(//*[text()='MacBook'])")
	private WebElement macBookNameLink;
	
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
	private WebElement macBookTextDescription;
	
	@FindBy(xpath = "(//*[@class='price'])[7]")
	private WebElement macBookPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[28]")
	private WebElement macBookAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[29]")
	private WebElement macBookAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[30]")
	private WebElement macBookCopareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[9]")
	private WebElement macBookAirImgResposive;
	
	@FindBy(xpath = "//*[text()='MacBook Air']")
	private WebElement macBookAirNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'MacBook Air is ultrathin')]")
	private WebElement macBookTextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price'])[8]")
	private WebElement macBookAirPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[31]")
	private WebElement macBookAirAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[32]")
	private WebElement macBookAirAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[33]")
	private WebElement macBookAirCopareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[10]")
	private WebElement palmTreoProImgResponsive;
	
	@FindBy(xpath = "//*[text()='Palm Treo Pro']")
	private WebElement palmTreoProLinkedName;
	
	@FindBy(xpath = "//p[contains(text(),'Redefine your workday')]")
	private WebElement palmTreoProTextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price'])[9]")
	private WebElement palmTreoProPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[34]")
	private WebElement palmTreoProAddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[35]")
	private WebElement palmTreoProAddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[36]")
	private WebElement palmTreoProCompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[11]")
	private WebElement product8ImgResponsive;
	
	@FindBy(xpath = "//*[text()='Product 8']")
	private WebElement product8LinkedNmae;
	
	@FindBy(xpath = "(//*[@class='price'])[10]")
	private WebElement product8Price;
	
	@FindBy(xpath = "(//*[@type='button'])[37]")
	private WebElement product8AddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[38]")
	private WebElement product8AddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[39]")
	private WebElement product8CompareThisProduct;
	
	@FindBy(xpath = "//*[@title='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMaster941BWimgResponsive;
	
	@FindBy(xpath = "//*[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMaster941BWlinkedName;
	
	@FindBy(xpath = "//p[contains(text(),'Imagine the advantages')]")
	private WebElement samsungSyncMaster941BWtexDescriptions;
	
	@FindBy(xpath = "(//*[@class='price'])[11]")
	private WebElement samsungSyncMaster941BWPrice;
	
	@FindBy(xpath = "(//*[@type='button'])[40]")
	private WebElement samsungSyncMaster941BWaddToCart;
	
	@FindBy(xpath = "(//*[@type='button'])[41]")
	private WebElement samsungSyncMaster941BWaddToWihsList;
	
	@FindBy(xpath = "(//*[@type='button'])[42]")
	private WebElement samsungSyncMaster941CompareThisProduct;
	
	@FindBy(xpath = "(//*[@class='img-responsive'])[13]")
	private WebElement sonyVAIOimgResponsive;
	
	@FindBy(xpath = "(//*[text()='Sony VAIO'])")
	private WebElement sonyVAIOnameLinkded;
	
	@FindBy(xpath = "//p[contains(text(),'Unprecedented power')]")
	private WebElement sonyVAIOtextDescriptions;
	
	@FindBy(xpath = "(//*[@class='price'])[12]")
	private WebElement sonyVAIOprice;
	
	@FindBy(xpath = "(//*[@type='button'])[43]")
	private WebElement sonyVAIOaddToCartButton;
	
	@FindBy(xpath = "(//*[@type='button'])[44]")
	private WebElement sonyVAIOaddToWishList;
	
	@FindBy(xpath = "(//*[@type='button'])[45]")
	private WebElement sonyVAIOcompareThisProduct;

	private WebElement RedCanon;

	private WebElement pleaseselectCanonColor;
	
	
	public void validateHomePage() {
		String text = textToValidate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("text verified");
			
		}else {
			logger.info("text does not match");
		}
		
	}
	public void clickOnDesktopsTab() {
		desktopsTab.click();
	}
	public void clickOnshowAllDesktops() {
		showAllDesktops.click();
		
	}
	public void desktopPageScreenshot() throws IOException {
		Utilities.scrolldownPage();
		Utilities.takeScreenShot("desktop items Screenshot");
		
	}
	public void HPLP3065addToCartFromDestop() {
		HPLP3065addToCart.click();
		
	}
	public void HPLP3065Quantity() {
		String text = HPLP3065Quantity.getAttribute("value");
		if(text.equalsIgnoreCase("1")) {
			logger.info("Text Verified");
		}else {
			logger.info("Text does not match!");
		}
		
	}
	public void HPLP3065addToShopingCart() {
		HPLP3065addToShopingCart.click();
		
	}
	@SuppressWarnings("unused")
	public void SuccessMessageHPLP3065addToShopingCart() {
		System.out.println(SuccessMessageHPLP3065addToShopingCart.getText());
		String text = SuccessMessageHPLP3065addToShopingCart.getText();
		Utilities.highlightelementRedBorder(SuccessMessageHPLP3065addToShopingCart);
		try {
			Utilities.takeScreenShot("SuccessMessageHPLP3065addToShopingCart");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void clickOnCanonEOS5DaddToCart() {
		canonEOS5DaddToCart.click();
		
	}
	public void clickOnCanonEOS5DdropdownRedColor() {
		canonEOS5DdropdownRedColor.click();
	}
	public void canonEOS5DdropdownRedColor(String color) {
			canonEOS5DdropdownRedColor.click();
			if(color.equalsIgnoreCase("Red")) {
				RedCanon.click();
				System.out.println(RedCanon.getText());
		}else if (color.equalsIgnoreCase("Blue")){
			BlueCanon.click();
			System.out.println(BlueCanon.getText());
		}else if(color.equalsIgnoreCase("Green")) {
			GreenCanon.click();
			
		}else {pleaseselectCanonColor.click();
			System.out.println(pleaseselectCanonColor.getText());
		}
		
	}
	public void clickOnCanonEOS5DQuantity() {
		canonEOS5DQuantity.click();

	}
	public void canonEOS5DaddToShoppingCart() {
		canonEOS5DaddToShoppingCart.click();
	
	}
	public void canonEOS5DSuccessMessage() {
		String text = canonEOS5DSuccessMessage.getText();
		Utilities.highlightelementRedBorder(canonEOS5DSuccessMessage);
		try {
			Utilities.takeScreenShot("sccess Message For Add Canon");
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		if (text.equalsIgnoreCase("Success: You have added Canon EOS 5D to your shopping cart!")) {
			logger.info("Text Verified!");
			
		}else {
			logger.info("Text does not match!");
		}
		
	}
	public void canonEOS5DWriteAreview() {
		canonEOS5DWriteAreview.click();
			
	}
	public void canonEOS5DenterYourName(String yourname) {
		canonEOS5DWriteAreview.sendKeys("name");
		
	}
	public void canonEOS5DWriteYourReview(String yourreview) {
		canonEOS5DWriteYourReview.sendKeys("Srtin yourRewardddddddddddddddddddddddddddddddddddddddddddd");
		
		
	}
	public void canonEOS5DputYourRate(String Rating) {
		canonEOS5DputYourRate.click();	
		
	}
	public void canonEOS5DcontinueButton() {
		canonEOS5DcontinueButton.click();
		
	}
	public void canonEOS5DsuccessMessageForReveiw() {
		
		System.out.println(canonEOS5DsuccessMessageForReveiw.getText());
		
		
	}




	
	

}
