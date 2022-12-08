package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP_GETTEXT {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		 
		 driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		 
		String ALT = driver.switchTo().alert().getText();
		
		System.out.println(ALT);

}
}