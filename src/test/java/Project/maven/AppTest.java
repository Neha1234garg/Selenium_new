package Project.maven;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Usage;

    
  
public class AppTest
{
	  WebElement element;
	    WebDriver driver;
	    Properties prop = new Properties();
	    Usage use = new Usage();
		InputStream input = null;
		String url;
		String name;
//	@BeforeClass
//	public void setup()
//	{
//	    System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver.exe");
//	    driver = new ChromeDriver();
//	    //driver =new FirefoxDriver();
//	    driver.get(Usage.url);
//	}
//	
//	@BeforeTest
//    public void openingGoogle()
//    {
//	//Reporter.log("Getting search tab");
////		element = driver.findElement(By.id("lst-ib"));
////		Reporter.log("Typing search value");
////		element.sendKeys("Neha Garg");
//    }
//       
	@Test
        public void testCase(){
//		try {
//
//			input = new FileInputStream(new File("db.properties"));
//			prop.load(input);
//		}catch (IOException ex) {
//			ex.printStackTrace();
	//	}
		prop = use.getProp();
			
			driver=use.getBrowser();
		 url = prop.getProperty("url");
		 System.out.println(url);
		 driver.get(url);
		 
		name= prop.getProperty("name");
		Reporter.log("Getting search tab");
		element = use.getId();
		Reporter.log("Typing search value");
		element.sendKeys(name);
		driver.findElement(By.name("btnG")).click();
		
		
			//String prop.getProperty("dbpassword"));
		

		
        	
//           Reporter.log("MyName");
//        	System.setProperty("webdriver.chrome.driver","chromedriver"); 
//        	Reporter.log("Opening Browser");
//        	driver = new ChromeDriver();	
        	
    		//driver.get(Usage.url);
        	
//        	Reporter.log("Getting search tab");
//    		WebElement element = driver.findElement(By.id("lst-ib"));
//    		Reporter.log("Typing search value");
//    		element.sendKeys("Neha Garg");
//    		//focusable
//    		driver.findElement(By.name("btnG")).click();
    		
        }
}