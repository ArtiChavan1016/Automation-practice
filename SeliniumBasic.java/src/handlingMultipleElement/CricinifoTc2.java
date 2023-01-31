package handlingMultipleElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinifoTc2 {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "\\Drivers\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 driver.get("https://www.Cricinifo.com/");
	 
	  
	 
	 

	}

}
