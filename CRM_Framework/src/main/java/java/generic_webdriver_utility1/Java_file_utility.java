package java.generic_webdriver_utility1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Java_file_utility {
	public String getDataYYYYMMDD(){
	//system date
	Date dateobj=new Date();
	SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
	   String StartDate = sim.format(dateobj);
	   return StartDate;
	}
	   //particular date
	   public String getDataCal(int days) {
		Date dateobj1=new Date();
			SimpleDateFormat sim1 = new SimpleDateFormat("yyyy-MM-dd");
			   String StartDate1 = sim1.format(dateobj1);
			   Calendar cal = sim1.getCalendar();
			   cal.add(Calendar.DAY_OF_MONTH, days);
			    String EndDate = sim1.format(cal.getTime());
			    return EndDate;
		
}
	   public int getRandomdata() {
		   Random r1 = new Random();
			int r1int = r1.nextInt(80000);
			return r1int;
            
	   }
	   public int getRandomdataprob() {
		   Random r2 = new Random();
			
            int r2int = r2.nextInt(100);
            return r2int;
	   }
	  
}