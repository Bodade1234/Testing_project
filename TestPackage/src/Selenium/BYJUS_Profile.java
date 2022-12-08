package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BYJUS_Profile {
	
	public static void main(String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\chaitnya bodade\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class");
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ChaituBodade");
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8390116619");
		 driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chaitanya02072000@gmail.com");
		
		 WebElement List = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));	 
		   List.click();
		   
		   Select S= new Select(List);
		   
		     S.selectByVisibleText("Maharashtra");
		     
		     Thread.sleep(10000);
		     
		 driver.findElement(By.xpath("//button[text()='Try Now']")).click();
		     
	}

}
