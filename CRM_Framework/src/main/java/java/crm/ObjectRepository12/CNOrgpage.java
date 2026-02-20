package java.crm.ObjectRepository12;
//create java class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CNOrgpage {
 //object initialization
	WebDriver driver;
	public CNOrgpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//object identification
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrgNameTF;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement indusdd;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement typedd;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phonenumtf;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingTF;
	
	
	//object encapsulation
	public WebDriver getDriver() {
			return driver;
		}
		public WebElement getOrgNameTF() {
			return OrgNameTF;
		}
		public WebElement getIndusdd() {
			return indusdd;
		}

		public WebElement getTypedd() {
			return typedd;
		}
		
		public WebElement getShippingTF() {
			return shippingTF;
		}
		public WebElement getSavebtn() {
			return savebtn;
		}
		
		public void createOrg3(String OrgName) {
			OrgNameTF.sendKeys(OrgName);
			
		}
	    public void createOrg1(String Industry) {
		//OrgNameTF.sendKeys(OrgName);
		Select sel = new Select(indusdd);
		sel.selectByVisibleText(Industry);		
		
	    }
	    public void createOrg2(String Type) {
		//OrgNameTF.sendKeys(OrgName);
		Select sel = new Select(typedd);
		sel.selectByVisibleText(Type);		
		
	    }
	    
	    public void getPhonenumtf(String Phonenum) {
			Phonenumtf.sendKeys(Phonenum);
			
		}
	
}
