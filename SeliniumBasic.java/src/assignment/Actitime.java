package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","G:\\JavaWorkspace\\SeliniumBasic.java\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.get("https://demo.actitime.com/login.do");
		  WebDriverWait Wait =new WebDriverWait(driver,20);
		  
		 String[]username=driver.findElement(ById.id("userCredentialsUsername")).getText().split("");
		 String[]Passward=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(4)>td")).getText().split("");
		 
		 driver.findElement(By.id("username")).sendKeys(username[1]);
		 driver.findElement(By.id("passward")).sendKeys(Passward[1]);
		 driver.findElement(By.id("loginbutton")).click();

	}

}
