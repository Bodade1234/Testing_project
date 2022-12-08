package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SELECT_YEAR {
	
        public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");

              WebDriver driver= new ChromeDriver();
              
              driver.get("https://www.facebook.com/r.php");
              
       WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
          
             Select C=new Select(year);
             
            List<WebElement> result = C.getOptions();
            
                 System.out.println(result);
                 
                 int M = result.size();
                 
                 System.out.println("THE SIZE OF LIST BOX IS:-"+M);
              
              for(int i=0;i<=result.size()-1;i++) {
            	  
            	  System.out.println(result.get(i).getText());
            	  
              }
                  
               
    
        }

}