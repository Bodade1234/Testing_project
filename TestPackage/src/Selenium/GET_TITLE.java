package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_TITLE {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		   
		 driver.get("https://www.facebook.com/r.php");
		 
		 Thread.sleep(3000);
	
	   String Title= driver.getTitle(); // use to get the title of current page open by browser
	   
      System.out.println(Title); 
      
     String exptitle="Sign up for Facebook | Facebook"; // expected TITLE 
      
  if(Title.equalsIgnoreCase(exptitle)) { // COMPAIRE THE BOTH TITLE 
	  
	  System.out.println("NAVIGET TO CORRECT PAGE");
	  }
    else {
    	 System.out.println("NAVIGET TO WRONG PAGE");
    }

 }
}