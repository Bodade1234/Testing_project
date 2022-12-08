package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BYJUS {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\chaitnya bodade\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		 driver.get("");
		 
		 WebElement dropdown = driver.findElement(By.xpath(""));
		 
		 driver.findElement(By.xpath(""));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("window().scrollby(0,1000)");
		 
		 Select S= new Select(dropdown);
		 
		 for(int i=0;i<7;i++) {
			 
			 S.selectByIndex(i);
			 
			 System.out.println("AVAILABLE VIDEO FOE CLASS"+(i+4));
			 
			 List<WebElement> Videos = driver.findElements(By.xpath(""));
			 
			 if(Videos.size()==2) {
				 
				 System.out.println("PASSED");
		    }
			Videos.get(0).click();
			
			driver.switchTo().frame(0);
			
			String VideoName = driver.findElement(By.xpath("")).getText();
			
			 System.out.println(VideoName);
			 
			 
			 
		 }	 
		 
		 
	}

}
