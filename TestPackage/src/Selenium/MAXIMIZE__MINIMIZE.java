package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAXIMIZE__MINIMIZE {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		   
		 driver.get("https://www.amazon.in/");
		 
		  
		 driver.manage().window().maximize();
		     
		    Thread.sleep(3000);
		 driver.manage().window().minimize();
		 


 }
 
}