package java.generic_File_utility1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_utility {
  public String getDatafromPropertyFile(String key) throws IOException {
	  FileInputStream fis = new FileInputStream("./src/test/resources/commondata_vtiger.properties");
	  Properties p1 = new Properties();
	  p1.load(fis);
	  String data = p1.getProperty(key);
	  return data;
  }
}
