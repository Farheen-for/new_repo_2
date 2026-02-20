package java.generic_File_utility1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public  class File_2_utility {
    public  String get_Data_From_JSON_File(String key) throws ParseException, IOException {
    	//FileInputStream fis1 = new FileInputStream("./Testdata/new_data.json");
    	JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("./Testdata/new_data.json"));
		      JSONObject map= (JSONObject)obj;
		        String data = (String) map.get(key);
		        return data;
    }
    
}
