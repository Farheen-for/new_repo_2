package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//create java class
public class CreateNewConPage {
//Initialize the objects
	WebDriver driver;
	public CreateNewConPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//identify the objects
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastnameeTF;
	
	@FindBy(xpath="//input[@name='account_id']/following-sibling::img")
	private WebElement plusorgbtn;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchbarTF;
	
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement searchdd;

	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//input[@name='support_start_date']")
	private WebElement StartdateTF;
	
	@FindBy(xpath="//input[@name='support_end_date']")
	private WebElement EndDateTF;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	//object encapsulated
	
	public void  getSearchbarTF(String OrgName) {
	searchbarTF.sendKeys(OrgName);
	//Select sel = new Select(searchdd);
	//sel.deselectByVisibleText("Organization name");
	searchbtn.click();
	}


	public WebElement getLastnameeTF() {
		return LastnameeTF;
	}

	public WebElement getPlusorgbtn() {
		return plusorgbtn;
	}

	public WebElement getSearchbarTF() {
		return searchbarTF;
	}

	public WebElement getSearchdd() {
		return searchdd;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getStartdateTF() {
		return StartdateTF;
	}

	public WebElement getEndDateTF() {
		return EndDateTF;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	
	
		
}
