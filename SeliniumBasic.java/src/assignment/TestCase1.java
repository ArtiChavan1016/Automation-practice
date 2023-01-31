package assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdrier.chrome.driver","/Drivers/chromedriver.exe");
    
    WebDriver driver =new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.get("http://www.amazon.in");
      
    driver.manage().window().maximize();
    
   Thread.sleep(1500);
    
   //driver.findElement(By.cssSelector("");
   
   String pageTitle()findElement(By.)
   
   
    
    
 
  
 
 
 
 
 

	}

}
