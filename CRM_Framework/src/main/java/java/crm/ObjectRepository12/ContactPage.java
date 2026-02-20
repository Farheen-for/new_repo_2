package java.crm.ObjectRepository12;
//create java class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	//Initialize the 
  WebDriver driver;
  public ContactPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
  //identify the object
  @FindBy(xpath="//img[@title='Create Contact...']")
  private WebElement conbtn;
  //object encapsulated
  public WebDriver getDriver() {
	return driver;
  }
  public WebElement getConbtn() {
	return conbtn;
  }
  
	

}
