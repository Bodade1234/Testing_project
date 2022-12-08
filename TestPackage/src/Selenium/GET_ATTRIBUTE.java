package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_ATTRIBUTE {
	
	public static void main(String[]args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitnya bodade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		 WebDriver driver=new ChromeDriver();
        
		 driver.get("https://www.facebook.com/r.php");
		 
		WebElement Attribute = driver.findElement(By.xpath("// input[@ name='lastname']"));
	
	          String result = Attribute.getAttribute("data-type");
	          
	           System.out.println(result); // GET ATTRIBUTE METHOD IS USE TO GET ATTRIBUTE VALUE OF GIVEN ATTRIBUTE
	
	}

}
