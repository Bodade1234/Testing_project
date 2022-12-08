package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class INSTA {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(1000);
	         
         driver.findElement(By.xpath("(//a[@ role='button'])[2]")).click();
	       
         Thread.sleep(1000);
        
         driver.findElement(By.xpath("//input[@ name='firstname']")).sendKeys("NIKHIL");
	     
         driver.findElement(By.xpath("// input[@ name='lastname']")).sendKeys("JOSHI");
         
         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nikhiljoshi123@gmail.com");
         
         driver.findElement(By.xpath("(//input[@ data-type='text'])[4]")).sendKeys("nikhiljoshi123@gmail.com");
         
         driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("NIKHIL@123");
         
          WebElement d = driver.findElement(By.xpath("//select[@ id='day']"));
          
          Select x= new Select(d);
          
          x.selectByIndex(14);
  
          WebElement c = driver.findElement(By.xpath("//select[@ aria-label='Month']"));
          
            Select y = new Select(c);
          
               y.selectByIndex(8);
               
          WebElement j= driver.findElement(By.xpath("//select[@ title='Year']"));
          
          Select z = new Select(j);
          
          z.selectByValue("2000");
          
         
              




   }
}