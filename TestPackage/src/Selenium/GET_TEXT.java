package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_TEXT {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php");
		 
		 
       WebElement TEXT= driver.findElement(By.xpath("//div[contains(@class,'_8esf ')]"));
       
                  String result =TEXT.getText();
                  
             System.out.println(result);
		 

  }
}