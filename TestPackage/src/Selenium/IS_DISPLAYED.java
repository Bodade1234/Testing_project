package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_DISPLAYED { // ISDISPALYED METHOD IS USE TO CHAECK THE HIDDEN ELEMENT PRESENT ON SCREEN
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php");
		 
		 Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@ name='firstname']")).sendKeys("NIKHIL");
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("// input[@ name='lastname']")).sendKeys("JOSHI");
         
         Thread.sleep(1000);
		 
         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nikhiljoshi123@gmail.com");
         
         Thread.sleep(3000);
        WebElement BUTTON = driver.findElement(By.xpath("(//input[@ data-type='text'])[4]"));
         
       
          boolean result = BUTTON.isDisplayed();
      
        if(result==true) {
       	 System.out.println("ELEMENT IS DISPLAYED");
        }
        else {
       	 System.out.println("ELEMENT IS NOT SELECTED");
        }
		 
		 
	}

}
