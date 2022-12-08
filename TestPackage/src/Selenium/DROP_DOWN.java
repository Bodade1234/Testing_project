package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DROP_DOWN {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
       
         WebDriver driver= new ChromeDriver(); 

         driver.get("https://www.flipkart.com/"); 
         
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
          
          WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
          
                Actions S = new Actions(driver);
                
                S.moveToElement(login).perform();
                
                Thread.sleep(3000);
                
                WebElement Order = driver.findElement(By.xpath("//div[text()='Orders']"));
                
                S.click(Order).perform();
                
                Thread.sleep(3000);

	}

}
