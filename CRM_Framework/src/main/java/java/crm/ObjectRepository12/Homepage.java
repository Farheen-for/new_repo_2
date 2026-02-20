package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//create java class
public class Homepage {
	//object initialization
	WebDriver driver = null;
	public Homepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//object identification
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement orglink;
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contlink;
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opplink;
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement prodlink;
	@FindBy(xpath = "//a[text()='More']")
	private WebElement morelink;
	@FindBy(xpath = "//a[text()='Vendors']")
	private WebElement vendlink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminimg;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutlink;
	//object encapsulation
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrglink() {
		return orglink;
	}
	public WebElement getContlink() {
		return contlink;
	}
	public WebElement getOpplink() {
		return opplink;
	}
	public WebElement getProdlink() {
		return prodlink;
	}
	public WebElement getMorelink() {
		return morelink;
	}
	public WebElement getAdminimg() {
		return adminimg;
	}
	public WebElement getSignoutlink() {
		return signoutlink;
	}
	public WebElement getVendlink() {
		return vendlink;
	}
	public void navigateToVendor() {
		Actions act = new Actions(driver);
		act.moveToElement(morelink).perform();
		vendlink.click();
	}
	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(adminimg).perform();
		signoutlink.click();
	}
     
}
