package java.generic_database_utility1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Database_utility {
  Connection con;
  public void getdbconnection() {
	  
		  //Driver driver =new Driver();
		 // DriverManager.registerDriver(driver);
		         //   con =  DriverManager.getConnection();
		  
	    
  }
  public void getDataBaseConnection(String URL,String UN,String PSWD) {
	  try {
		  Driver driver =new Driver();
		  DriverManager.registerDriver(driver);
		            con =  DriverManager.getConnection(URL,UN,PSWD);
		  
	  }catch(Exception e){
		  
	  }
  }
  public ResultSet getExecutetheselectQuery(String query) {
	   ResultSet  resul = null;
	   try {
		    Statement stat = con.createStatement();
		              resul = stat.executeQuery(query);
	   }catch(Exception e ){
		   
	   }
	   return resul;
	  
  }
  public int getExecutenonselectQuery(String query) {
	  int result = 0;
	  try {
		 Statement stat = con.createStatement();
		  result= stat.executeUpdate(query);
	  }catch(Exception e ){
		  
	  }
	  return result;
  }
  public void databaseclose() {
	  try {
		  con.close();
	  }catch(Exception  e ){
		  
	  }
  }
}
 
