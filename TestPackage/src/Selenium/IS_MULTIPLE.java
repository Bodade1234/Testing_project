package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IS_MULTIPLE {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.facebook.com/r.php");
		 
		WebElement MULTI = driver.findElement(By.xpath("//select[@id='year']"));
		 
		    Select d=new Select(MULTI);
		    
		       boolean result = d.isMultiple();
		       
		       System.out.println(result);
		       
		   if(result==true) {
		       System.out.println("THE LIST BOX IS MULTI-SELECTABLE");
             }
		   else {
			   System.out.println("THE LIST BOX IS NOT MULTI-SELECTABLE");
		   }

}
}