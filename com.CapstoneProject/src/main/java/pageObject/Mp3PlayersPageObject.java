package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base{
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "(//a[@class='dropdown-toggle'])[6]")
	private WebElement mp3PlayersMainMenu;
	
	@FindBy(xpath = "(//div[@class='dropdown-inner'])[5]")
	private WebElement mp3PlayersDropdownInner;
	
	@FindBy(xpath = "(//a[@class='see-all'])[5]")
	private WebElement showAllMp3Players;
	
	@FindBy(xpath = "//h2[text()='MP3 Players']")
	private WebElement mp3PlayersText;
	
	@FindBy(className= "//*[@class='col-sm-2']")
	private WebElement mt3PlayersImgThumbnail;
	
	@FindBy(xpath = "//p[contains(text(),'Shop Laptop')]")
	private WebElement mp3PlayersTextDescriptions;
	
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;
	
	@FindBy(xpath = "(//a[text()='test 11 (0)'])[2]")
	private WebElement mp3PlayersTest11;
	
	@FindBy(xpath = "(//a[text()='test 12 (0)'])[2]")
	private WebElement mp3PlayersTest12;
	
	@FindBy(xpath = "(//a[text()='test 15 (0)'])[2]")
	private WebElement mp3PlayersTest15;
	
	@FindBy(xpath = "(//a[text()='test 16 (0)'])[2]")
	private WebElement mp3PlayersTest16;
	
	@FindBy(xpath = "(//a[text()='test 17 (0)'])[2]")
	private WebElement mp3PlayersTest17;
	
	@FindBy(xpath = "(//a[text()='test 18 (0)'])[2]")
	private WebElement mp3PlayersTest18;
	
	@FindBy(xpath = "(//a[text()='test 19 (0)'])[2]")
	private WebElement mp3PlayersTest19;
	
	@FindBy(xpath = "(//a[text()='test 20 (0)'])[2]")
	private WebElement mp3PlayersTest20;
	
	@FindBy(xpath = "(//a[text()='test 21 (0)'])[2]")
	private WebElement mp3PlayersTest21;
	
	@FindBy(xpath = "(//a[text()='test 22 (0)'])[2]")
	private WebElement mp3PlayersTest22;
	
	@FindBy(xpath = "(//a[text()='test 23 (0)'])[2]")
	private WebElement mp3PlayersTest23;
	
	@FindBy(xpath = "(//a[text()='test 24 (0)'])[2]")
	private WebElement mp3PlayersTest24;
	
	@FindBy(xpath = "(//a[text()='test 4 (0)'])[2]")
	private WebElement mp3PlayersTest4;
	
	@FindBy(xpath = "(//a[text()='test 5 (0)'])[2]")
	private WebElement mp3PlayersTest5;
	
	@FindBy(xpath = "(//a[text()='test 6 (0)'])[2]")
	private WebElement mp3PlayersTest6;
	
	@FindBy(xpath = "(//a[text()='test 7 (0)'])[2]")
	private WebElement mp3PlayersTest7;
	
	@FindBy(xpath = "(//a[text()='test 8 (0)'])[2]")
	private WebElement mp3PlayersTest8;
	
	@FindBy(xpath = "(//a[text()='test 9 (0)'])[2]")
	private WebElement mp3PlayersTest9;
	
	@FindBy(id = "//*[@id='list-view']")
	private WebElement mp3PlayersListView;
	
	@FindBy(id = "//*[@id='grid-view']")
	private WebElement mp3PlayersGridView;
	
	@FindBy(id = "//*[@id='compare-total']")
	private WebElement mp3PlayersProductCompare;
	
	@FindBy (id = "//*[@id='input-sort']")
	private WebElement mp3PlayerInputSort;
	
	@FindBy(id = "//*[@id='input-limit']")
	private WebElement mp3PlayerInputLimit;
	
	@FindBy(className = "(//*[@class='img-responsive'])[2]")
	private WebElement iPodClassicImgResponsive;
	
	@FindBy(xpath = "//a[text()='iPod Classic']")
	private WebElement iPodClassicNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'More room to move')]")
	private WebElement iPodClassicTextDescription;
	
	@FindBy(className = "(//p[@class='price'])[1]")
	private WebElement iPodClassicPriceTax;
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement iPodClassicAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement iPodClassicAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement iPodClassicCompareThisProduct;
	
	@FindBy(className = "(//*[@class='img-responsive'])[3]")
	private WebElement iPodNanoImgResponsive;
	
	@FindBy(xpath = "//a[text()='iPod Nano']")
	private WebElement iPodNanoNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'Video in your pocket')]")
	private WebElement iPodNanoTextDescriptions;
	
	@FindBy(className = "(//p[@class='price'])[2]")
	private WebElement iPodNanoPriceTax;
	
	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement iPodNanoAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[13]")
	private WebElement iPodNanoAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement iPodNanoCompareThisProduct;	
	
	@FindBy(className = "(//*[@class='img-responsive'])[4]")
	private WebElement iPodShuffleImgResponsive;
	
	@FindBy(xpath = "//a[text()='iPod Shuffle']")
	private WebElement iPodShuffleNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'Born to be worn')]")
	private WebElement iPodShuffleTextDescriptions;
	
	@FindBy(className = "(//p[@class='price'])[3]")
	private WebElement iPodShufflePriceTax;
	
	@FindBy(xpath = "(//button[@type='button'])[15]")
	private WebElement iPodShuffleAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[16]")
	private WebElement iPodShuffleAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[17]")
	private WebElement iPodShuffleCompareThisProduct;
	
	@FindBy(className = "(//*[@class='img-responsive'])[5]")
	private WebElement iPodTouchImgResponsive;
	
	@FindBy(xpath = "//a[text()='iPod Shuffle']")
	private WebElement iPodTouchNameLinked;
	
	@FindBy(xpath = "//p[contains(text(),'Revolutionary multi-touch interface')]")
	private WebElement iPodTouchTextDescriptions;
	
	@FindBy(className = "(//p[@class='price'])[4]")
	private WebElement iPodTouchPriceTax;
	
	@FindBy(xpath = "(//button[@type='button'])[18]")
	private WebElement iPodTouchAddToCart;
	
	@FindBy(xpath = "(//button[@type='button'])[19]")
	private WebElement iPodTouchAddToWishList;
	
	@FindBy(xpath = "(//button[@type='button'])[20]")
	private WebElement iPodTouchCompareThisProduct;
	
	
	
	
	

}
