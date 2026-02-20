package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfopage {
	//Initialization of object
	WebDriver driver ;
	public ContactInfopage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//identify the objects
	@FindBy(xpath="//span[@class='dvHeaderText']")
	 private WebElement headerinfo;
	@FindBy(xpath="(//td[@class='dvtCellInfo'])[26]")
	private WebElement startdate;
	@FindBy(xpath="(//td[@class='dvtCellInfo'])[27]")
	private WebElement enddate;
	
	//encapsulation of object
		public WebElement getHeaderinfo() {
		return headerinfo;
	}
	public WebElement getStartdate() {
		return startdate;
	}
	public WebElement getEnddate() {
		return enddate;
	}
    
   //encapsulation of object
	

}
