package java.generic_File_utility1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_3_utility {
   public String getDataFromExcel(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException {
	  FileInputStream fis2 = new FileInputStream("./Testdata/Vtigerdata4.xlsx");
	   Workbook wb = WorkbookFactory.create(fis2);
	    String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	    wb.close();
	    return data;
   }
   public int getRowcount(String sheetname) throws EncryptedDocumentException, IOException {
		  FileInputStream fis3 = new FileInputStream("./Testdata/Vtigerdata4.xlsx");
		   Workbook wb = WorkbookFactory.create(fis3);
		    int rowcount = wb.getSheet(sheetname).getLastRowNum();
		    wb.close();
		    return rowcount;
   }
   public void setDataIntoexcel(String sheetname, int rownum, int cellnum,String data) throws EncryptedDocumentException, IOException {
		  FileInputStream fis4 = new FileInputStream("./Testdata/Vtigerdata4.xlsx");
		   Workbook wb = WorkbookFactory.create(fis4);
		    wb.getSheet(sheetname).getRow(rownum).createCell(cellnum);
		    FileOutputStream fos=  new FileOutputStream("./Testdata/Vtigerdata4.xlsx");
		    wb.write(fos);
		    wb.close();
   }
   
}
