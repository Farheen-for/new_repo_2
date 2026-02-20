package java.crm.ObjectRepository12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OppoInfoPage {
	//object initialization 
		WebDriver driver;
		public OppoInfoPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this );
		}
		//object identification 
		@FindBy(xpath="//span[@class='dvHeaderText']")
		private WebElement headerinfo;
		
			
		@FindBy(xpath="(//td[@class='dvtCellInfo'])[12]")
		private WebElement probiTF;
		
		
		@FindBy(xpath="(//td[@class='dvtCellInfo'])[5]")
		private WebElement typedd;
		
		@FindBy(xpath="(//td[@class='dvtCellInfo'])[7]")
		private WebElement Lsdd;
		
		@FindBy(xpath="(//td[@class='dvtCellInfo'])[6]")
		private WebElement closedate;
		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getHeaderinfo() {
			return headerinfo;
		}

		public WebElement getProbiTF() {
			return probiTF;
		}

		public WebElement getTypedd() {
			return typedd;
		}

		public WebElement getLsdd() {
			return Lsdd;
		}

		public WebElement getClosedate() {
			return closedate;
		}
				
		
		//encapsulation
		
	



}