package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CNproPage {
	 //object initialization
		WebDriver driver;
		public CNproPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}
		
		//object identification 
		@FindBy(xpath="//input[@name='productname']")
		 private WebElement proNameTF;
		@FindBy(xpath="//select[@name='manufacturer']")
		 private WebElement Mandd;
		@FindBy(xpath="//select[@name='productcategory']")
		 private WebElement Procatdd;
		@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
		private WebElement savebtn;
		
		
		public WebDriver getDriver() {
			return driver;
		}


		public WebElement getProNameTF() {
			return proNameTF;
		}


		public WebElement getMandd() {
			return Mandd;
		}


		public WebElement getProcatdd() {
			return Procatdd;
		}
                                                                                             

		public WebElement getSavebtn() {
			return savebtn;
		}


		public void createpro(String ProName) {
			proNameTF.sendKeys(ProName);
		}
		
		public void createprowithma(String Manudd) {
			Select sel1 = new Select(Mandd);
		sel1.selectByVisibleText(Manudd);
		}
		public void createprowithpro( String prodcat) {
			Select sel1 = new Select(Procatdd); 
					sel1.selectByVisibleText(prodcat);
				
		}
	   
}
