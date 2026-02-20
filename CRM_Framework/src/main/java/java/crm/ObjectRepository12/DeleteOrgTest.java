package java.crm.ObjectRepository12;
//create java class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteOrgTest {
//object initilization
	WebDriver driver;
	public void DeletOrgTest(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	//object identification
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchTF;
	
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement searchdd;

	@FindBy(xpath="(//input[@class='crmbutton small create'])[1]")
	private WebElement searchbtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSearchdd() {
		return searchdd;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
    
}
