package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_ENABLED {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php");
		 
		boolean Button =driver.findElement(By.xpath("(//Button[@ type='submit'])[1]")).isEnabled();
		       
              System.out.println(Button);// IS ENABLED METHOD IS USE TO CHECK THE BUTTON IS ENABLE OR DISABLE
              
           if(Button==true) {
        	    System.out.println("Button IS ENABLED");
           }
           else
           {
        	   System.out.println("Button IS DISABLE");
           }
 }
}