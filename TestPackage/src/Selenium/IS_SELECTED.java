package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_SELECTED {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(1000);
	         
       driver.findElement(By.xpath("(//a[@ role='button'])[2]")).click();
	       
        Thread.sleep(3000);
        
        WebElement MALE= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        
          MALE.click();
        
       boolean result = MALE.isSelected(); // THIS METHOD IS UDE TO VALIDATE THE RADIO BUTTON,CHECK BOX IS SELECTED OR NOT
       
         if(result==true) {
        	 System.out.println("RADIO BUTTON IS SELECTED");
         }
         else {
        	 System.out.println("RADOI BUTTON IS NOT SELECTED");
         }
     
	
	}

}
