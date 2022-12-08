package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SET_POSITION {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		   
		 driver.get("https://www.google.com");
		 
		 driver.switchTo();
		 
		 driver.get("https://www.amazon.com");
		 
		 Thread.sleep(3000);
		 
		Point p = new Point(600,400);
		
		driver.manage().window().setPosition(p);
		

}
}   
