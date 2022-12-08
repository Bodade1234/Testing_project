package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLL_UP_DOWN {
	
	
	 public static void main(String[]args) throws InterruptedException  {
		  
			System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			 WebDriver driver= new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.globalsqa.com/");
			 
			 Thread.sleep(3000);
			 
			 JavascriptExecutor JS=  (JavascriptExecutor)driver;
			 
			  JS.executeScript("window.scrollBy(0,3000)");//SCROLL DOWN
			  
			  Thread.sleep(3000);
			  	 
			  JS.executeScript("window.scrollBy(0,-3000)");//SCROLL UP
			  
			  Thread.sleep(3000);
				 
			  
			 JS.executeScript("window.scrollBy(3000,0)");// SCROLL RIGHT
			 
			 Thread.sleep(3000);
			 	  
			 JS.executeScript("window.scrollBy(-3000,0)");//SCROLL LEFT

}
}