package assignment;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOps {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		//driver.manage().window().setSize(new Dimension(400,600));
		driver.findElement(By.linkText("WebTable")).click();
		
		Thread.sleep(1500);
		 driver.navigate().back();
		Thread.sleep(1500);
		
		driver.navigate().forward();
		Thread.sleep(1500);
		
		driver.navigate().refresh();
		Thread.sleep(1500);
		
		driver.navigate().to("http://www.google.com");
		

}
}