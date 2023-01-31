package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomatioLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/SeliniumBasic.java/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("https://demosite.executeautomation.com/login.html");
		  
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("Passward")).sendKeys("admin");
		  driver.findElement(By.name("Login")).submit();
		 
	


	}

}
