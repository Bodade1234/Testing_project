package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FETCH_DATA_WEBTABLE {
	
	
	 public static void main(String[]args) throws InterruptedException  {
		  
			System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			 WebDriver driver= new ChromeDriver();
			 
			 driver.get("https://vctcpune.com/selenium/practice.html");
			 
			 List<WebElement> ROW = driver.findElements(By.xpath("//table[@id='product']//tr"));
			 
			         System.out.println(ROW.size());
			         
			  for(int i=1;i<=ROW.size();i++) {
				   
				  List<WebElement> CELL = driver.findElements(By.xpath("//table[@id='product']//tr["+(i+1)+"]//td"));
			  
			  for(int j=0;j<CELL.size();j++) {
				  
				  System.out.print(CELL.get(j).getText()+"  ");
				  
			  }
		        System.out.println();
			  }


}
}