package handlingMultipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

      public class RedBus {

	   public static void main(String[] args) {

	   System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe ");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.Redbus.in");
		

		  driver.findElement(By.name("db")).sendKeys("pune");
		 
		 
		 
		 
		 
	   }


}
