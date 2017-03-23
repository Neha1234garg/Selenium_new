package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usage {
	 WebDriver driver;
	 WebElement element;
	 Properties prop = new Properties();
	 InputStream input = null;
	 //public String url = "http://www.google.com";
	
	 public Properties getProp(){
		 try {
			input = new FileInputStream("db.properties");
			// load a properties file
			prop.load(input);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
			
			
	 }
	         public WebDriver getBrowser() {
	        	

//	     			input = new FileInputStream("db.properties");
//	     			// load a properties file
//	     			prop.load(input);
	        	 getProp();
	        	 
	        	 String dp = prop.getProperty("driver_path");
	        	 String dn = prop.getProperty("driver_name");
	        	 
	        	 	//return driver.get(url);  
	        		System.setProperty(dp,dn); 
	        		driver =new ChromeDriver();
	        		
	        
				return driver;
	 }
	         
	         public WebElement getId(){
	        	  element = driver.findElement(By.id("lst-ib"));
				return element;
	         }


}