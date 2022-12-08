package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FACEBOOK_SIGNUP{
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().timeouts().getImplicitWaitTimeout();
        
         driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("CHAITNYA");
         
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("JOSHI");
         
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nikhiljoshi123@gmail.com");
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("(//input[@ data-type='text'])[4]")).sendKeys("nikhiljoshi123@gmail.com");
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("NIKHIL@123");
         
          WebElement d = driver.findElement(By.xpath("//select[@ id='day']"));
          
          Select x= new Select(d);
          
          x.selectByIndex(14);
          
          Dimension S = d.getSize();
          
          System.out.println("THE SIZE OF LIST BOX IS:="+d);
          
          Thread.sleep(3000);
  
          WebElement c = driver.findElement(By.xpath("//select[@ aria-label='Month']"));
          
            Select y = new Select(c);
          
               y.selectByIndex(8);
               
               Thread.sleep(3000);
               
          WebElement j= driver.findElement(By.xpath("//select[@ title='Year']"));
          
          Select z = new Select(j);
          
          z.selectByValue("2000");
          
         WebElement MALE= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
         
            MALE.click();
            
           boolean result = MALE.isSelected();
           
             if(result==true) {
            	 System.out.println("RADIO BUTTON IS SELECTED");
             }
             else {
            	 System.out.println("RADOI BUTTON IS NOT SELECTED");
             }
   }
}