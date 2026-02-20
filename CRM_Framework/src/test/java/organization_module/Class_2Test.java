package organization_module;

import org.testng.annotations.Test;

public class Class_2Test{
	
	      @Test
	      public void createClass() {
	    	  
	    	  String Browser = System.getProperty("browser" ,"chrome");
	    	  String URL= System.getProperty("url");
	    	  String UN = System.getProperty("un");
	    	  String PSWD = System.getProperty("pswd");
	    	  System.out.println(Browser);
	    	  System.out.println(URL);
	    	  System.out.println(UN);
	    	  System.out.println(PSWD);
	      }
	      @Test
	      public void createproduct() {
	    	  
	    	  System.out.println("class_2 created");
	    	  System.out.println("class_67 created");
	    	  System.out.println("class_2 created");
	      }
}
