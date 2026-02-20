package organization_module;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Create_orz_with_industries_test  {
//	@Test
//	public void Create_orz_with_industries() throws Throwable, IOException {
//
//	    //read the data from excel
//	     String OrgName = xl_util.getDataFromExcel("Org",1,2)+Jutil.getRandomdata();
//	     String Industry = xl_util.getDataFromExcel("Org",4,3);
//	     String Type = xl_util.getDataFromExcel("Org",4,4);
//	     String shipadd = xl_util.getDataFromExcel("org", 1, 3);
//	 //step-2 navigate to organization module;
//		Homepage hp = new Homepage(driver);
//		hp.getOrglink().click();
//	//click on create organization button
//		Orgpage orp = new Orgpage(driver);
//		orp.getOrgbtn().click();	
//	//Enter all details and create new organization
//		CNOrgpage cno = new CNOrgpage(driver);
//		cno.getOrgNameTF().sendKeys(OrgName);
//		cno.getShippingTF().sendKeys(shipadd);
//		cno.createOrg1( Industry);
//		cno.createOrg2(Type);
//		cno.getSavebtn().click();
//	//verify header message expected result 	
//		  OrgInfoPage oip = new OrgInfoPage(driver);
//		  String actindustry = oip.getIndustrytf().getText();
//			if(actindustry.equals(Industry)) {
//				System.out.println(Industry + "is created===pass");
//			}else {
//				System.out.println(Industry+ "is not created===fail");
//			}
//		
//		}
}