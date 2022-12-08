package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_FRAME {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		 
		 driver.switchTo().frame(iframe);// CHANGE FOCUS FROM MAIN PAGE TO I FRAME
		 
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().defaultContent();// CHANGE FOCUS FROM I FRAME TO MAIN PAGE
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[@id='tryhome'] ")).click();
		 
		 
		 
		 

}
}