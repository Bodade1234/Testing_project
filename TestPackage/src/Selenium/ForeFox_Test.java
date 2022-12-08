package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForeFox_Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\chaitnya bodade\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://byjus.com/learn/byjus-classes/book/session");
		 
		 
		
	} 

}
