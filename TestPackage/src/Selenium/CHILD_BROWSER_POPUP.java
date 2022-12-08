package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHILD_BROWSER_POPUP {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList <String> al= new ArrayList <String>(ids);
		
		String Cwin = al.get(1);
		
		 System.out.println(Cwin);
		
		driver.switchTo().window(Cwin);
		
		Thread.sleep(3000);
		
	     driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	     
	     driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
    }
}