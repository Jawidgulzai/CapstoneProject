package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base{
	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement mainComponents;
	
	@FindBy(xpath = "(//a[text()='Mice and Trackballs (0)'])[1]")
	private WebElement mainDropdownMiceAndTrackballs;
	
	@FindBy(xpath = "(//a[text()='Monitors (2)'])[1]")
	private WebElement mainDropdownMonitors;
	
	@FindBy(xpath = "(//a[text()='Printers (0)'])[1]")
	private WebElement mainDropdownPrinters;
	
	@FindBy(xpath = "(//a[text()='Scanners (0)'])[1]")
	private WebElement mainDropdownScanners;
	
	@FindBy(xpath = "(//a[text()='Web Cameras (0)'])[1]")
	private WebElement mainDropdownWebCameras;
	
	@FindBy(xpath = "//a[text()='Show All Components']")
	private WebElement showAllComponents;
	
	@FindBy(xpath = "(//*[text()='Components'])[4]")
	private WebElement pageComponents;
	
	@FindBy(tagName = "//h3[text()='Refine Search']")
	private WebElement refineSearch;
	
	@FindBy(xpath = "(//*[text()='Mice and Trackballs (0)'])[2]")
	private WebElement miceAndTrackballs;
	
	@FindBy(xpath = "(//*[text()='Monitors (2)'])[2]")
	private WebElement monitors;
	
	@FindBy(xpath= "(//*[text()='Printers (0)'])[2]")
	private WebElement printers;
	
	@FindBy(xpath = "(//a[text()='Scanners (0)'])[2]")
	private WebElement scanners;
	
	@FindBy(xpath= "(//a[text()='Web Cameras (0)'])[2]")
	private WebElement webCameras;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement imgResponsive;
	
	

}
