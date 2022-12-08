package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAG_DROP {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       
        WebDriver driver= new ChromeDriver(); 

        driver.get("https://demo.guru99.com/test/drag_drop.html"); 
        
        Thread.sleep(3000);
        
        WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        
        WebElement ADD = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
          
             Actions D= new Actions(driver);
             
           
          D.moveToElement(amount).clickAndHold().moveToElement(ADD).release().build().perform();
	
	    //D.dragAndDrop(amount, ADD);
	}

}
