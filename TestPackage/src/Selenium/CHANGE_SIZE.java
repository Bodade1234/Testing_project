package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHANGE_SIZE {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		   
		 driver.get("https://www.amazon.in/");
		 
		 Dimension a= new Dimension(300,500);
		 
		 driver.manage().window().setSize(a);
		 

}
	
}
