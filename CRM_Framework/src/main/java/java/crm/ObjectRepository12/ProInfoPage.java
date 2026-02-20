package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProInfoPage {
   //object initialization
	WebDriver driver;
	public ProInfoPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	//object identification 
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	 private WebElement headerinfo;
	@FindBy(xpath="(//span[@class='dvHeaderText'])[6]")
	 private WebElement Mandd;
	@FindBy(xpath="(//span[@class='dvHeaderText'])[7]")
	 private WebElement Procatdd;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHeaderinfo() {
		return headerinfo;
	}
	public WebElement getMandd() {
		return Mandd;
	}
	public WebElement getProcatdd() {
		return Procatdd;
	}
	
   
}

