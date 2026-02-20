package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	 //object initialization
	WebDriver driver;
	public Productpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	//object identification 
	@FindBy(xpath="//img[@title='Create Product...']")
	 private WebElement proNamebtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProNamebtn() {
		return proNamebtn;
	}
	 
}
