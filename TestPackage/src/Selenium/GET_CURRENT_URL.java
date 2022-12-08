package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_CURRENT_URL {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		   
		 driver.get("https://www.facebook.com/r.php");
		 
		 // driver.close();
		  
		  String url= driver.getCurrentUrl();
		  
		    System.out.println(url);
		    
		    String Title="https://www.facebook.com/r.php";
		    
		    if(url.equalsIgnoreCase(Title))
		    {
		    	System.out.println("NEVIGET TO CORRECT URL PAGE");
		    }
		   else{
		    	 System.out.println("NAVIGET TO WRONG URL PAGE");
		    }
 }

}