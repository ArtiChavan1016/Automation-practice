package xpathassignment;

   import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

     public class Assignment1 {

	  public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "G:\\JavaWorkspace\\SeliniumBasic.java\\Drivers\\chromedriver.exe");
	
	   WebDriver Driver =new ChromeDriver();
	   Driver.manage().window().maximize();
	   
       Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       Driver.get("https://www.amazon.com/"); 
       
        Driver.findElement(By.id("username")).sendKeys("admin");
       
       Driver.findElement(By.name("pass")).sendKeys("admin123");
       
       

      
 //div[div[div[text()='Google Pixel7 pro(Hazel,128 GB)']]]/div[2]   x path for mobile
       
       



//x path for checkbox of  1.anniversary 
}

	private static WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}
	//1.//span[text()='Anniversary']//precending-sibling::div
	//2.//span[text()='Brother']//precending-sibling::div
	//3.//span[text()='Google pay']//precending-sibling::div
	
	 
	 
	
	

 

}
