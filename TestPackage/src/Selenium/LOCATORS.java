package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATORS {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		   
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("chaitanya@02072000@gmail.com");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chaitu@1234");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@ value='1']")).click();
	}

}
