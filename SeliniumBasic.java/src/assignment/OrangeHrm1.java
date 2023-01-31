package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm1 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe ");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.manage().window();
		 
		 driver.get("https://opensourse-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.findElement(By.name("usrename")).sendKeys("Admin");    //keys.tab
		 
		 driver.findElement(By.name("passward")).sendKeys("admin123");   //keys.enter
		 
		 driver.findElement(By.tagName("login")).click();
		 
		 driver.findElement(By.xpath("html/body/div/div/div/aside/nav/div/ul/li[2]")).click();
		 
		 
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div[2]/div/button"));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Advait");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("chavan");
		
		//	Thread.sleep(1000);
		 
		 
		
		

	}

}



-