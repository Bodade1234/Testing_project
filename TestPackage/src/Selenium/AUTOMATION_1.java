package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTOMATION_1 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		                                                                               // >  PATH OF CHROMEDRIVER.EXE
		   WebDriver driver= new ChromeDriver(); // LAUNCH THE CHROME BROWSER
		   
		   driver.get("https://www.facebook.com/r.php");// ENTER URL IN LAUNCHED CHROME BROWSER 
		   
		   Thread.sleep(3000); // THREAD.SLEEP METHOD IS USE TO DELAY FOR 3 SECONDS
		   
		     driver.close();// USE TO CLOSE THE CURRENT TAB OR CURRENT BROWSER OPEN BY SELENIUM
		     
		     driver.quit();// USE TO CLOSE ALL THE  TABS OR ALL BROWSER OPEN BY SELENIUM 
		   
		  
}

}