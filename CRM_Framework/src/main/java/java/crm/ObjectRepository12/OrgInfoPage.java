package java.crm.ObjectRepository12;
//create java class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPage {
	//object initialization
	WebDriver driver;
	public OrgInfoPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	//object identification
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement headerinfo;
    @FindBy(xpath="//span[@id='dtlview_Phone']")
    private WebElement phoneTF;
    
    @FindBy(xpath="//span[@id='dtlview_Industry']")
    private WebElement industrytf;
    		   
    
    //object encapsulation
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getIndustrytf() {
		return industrytf;
	}

	public WebElement getHeaderinfo() {
		return headerinfo;
	}
	public WebElement getPhoneTF() {
		return phoneTF;
	}
			
	
	
	
    
	
}
