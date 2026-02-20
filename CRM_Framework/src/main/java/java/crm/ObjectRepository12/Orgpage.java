package java.crm.ObjectRepository12;
 //create java class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orgpage {
	//object initiliazation
	WebDriver driver;
	public Orgpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//object identification
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement orgbtn;
	//object encapsulation

	public WebElement getOrgbtn() {
		return orgbtn;
	}
	

}
