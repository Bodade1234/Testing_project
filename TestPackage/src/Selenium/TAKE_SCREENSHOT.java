package Selenium;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TAKE_SCREENSHOT {
	
	public static void main(String[]args) throws InterruptedException,IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		 Thread.sleep(2000);
		 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		for(int i=1;i<5;i--) {
		
		File destination=new File("C:\\Users\\chaitnya bodade\\OneDrive\\Documents\\Custom Office Templates\\TEST09"+i+".jpg");
		 
		 FileHandler.copy(src,destination);
	
		     
		 
		
	}

	}

	}
