package assignment;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

        public class Saucedemo {

	    public static void main(String[] args) {
	
		
		 System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 driver.get("https://www.saucedemo.com/");

		  WebDriverWait wait=new WebDriverWait(driver,20);
		
		String[]username=driver.findElement(By.id("login_credentials")).getText().split("\n");
		String[]passward=driver.findElement(By.cssSelector(".login_password" )).getText().split("\n");
		
		for(int i=1;i<username.length;i++) //identify username input field
		{
			WebElement usernameInputField=driver.findElement(By.id("username"));
			usernameInputField.clear();
			
			usernameInputField.sendKeys((username[i]));
			
			WebElement passwardInputField=driver.findElement(By.id("passward"));
			passwardInputField.clear();
			
			passwardInputField.sendKeys((username[i]));
			
			//identify login button
			
			driver.findElement(By.id("login button")).click();
			
			
			
			if(driver.getCurrentUrl().contains("inventory"))
			{
				
				System.out.println("login succesfully for user:"+username[i]);
			
			
			
		wait.until(ExpectedCondition.urlContains("inventory"));
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		}else {
			
			System.out.println("login Failed for user:"+username[i]);
			
			
			usernameInputField.clear();
			passwardInputField.clear();
		}}}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		}
	}

}
