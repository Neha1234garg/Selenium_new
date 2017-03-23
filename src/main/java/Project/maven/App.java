package Project.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.Test;
import utilities.Usage;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String [] args){
		
		 WebElement element1;
		    WebDriver driver;
		   
		    Usage use = new Usage();
		    
	System.setProperty("webdriver.chrome.driver","chromedriver"); 
	
	driver = new ChromeDriver();	
	
	driver.get("http://www.google.com");
	//use.getBrowser();
	
	 //element1 = driver.findElement(By.id("lst-ib"));
	//element1.sendKeys("Neha Garg");
	//driver.close();
	}
}
