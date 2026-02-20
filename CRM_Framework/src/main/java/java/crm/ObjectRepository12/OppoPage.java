package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OppoPage {
   //object initialization 
	WebDriver driver;
	public OppoPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this );
	}
	//object identification 
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement oppbtn;
	
	//encapsulation 
	
	public WebElement getOppbtn() {
		return oppbtn;
	}
	

	
}
