package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NAVIGATE_GET {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		   
		 driver.get("https://www.amazon.in/");
		 
		 driver.get("https://www.amazon.in/electronics");
		    
		  Thread.sleep(5000);
		 
		  driver.navigate().forward(); 
		     Thread.sleep(5000); 
		  driver.navigate().back();
		    Thread.sleep(5000);
		  driver.navigate().refresh();
  }
}