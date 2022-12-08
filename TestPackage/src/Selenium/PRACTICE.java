package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class PRACTICE {
	
  public static void main(String[]args) throws InterruptedException, IOException  {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		 Thread.sleep(3000);
		 
		
		
 }

}

