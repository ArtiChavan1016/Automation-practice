package assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe ");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://demo.actitime.com/login.do");
	 
	 String loginpageTitle=driver.getTitle();
	 System.out.println("login page title:"+loginpageTitle);
	 System.out.println("login page title lenght:"+loginpageTitle.length());
	 String expectedTitle="activeTIME - Login";
	 System.out.println("Login Page validation"+loginpageTitle.equals(expectedTitle));
	 
	 driver.findElement(By.id("Username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginButton")).click();
	 
	 WebDriverWait Wait =new WebDriverWait(driver,20);
	 
	 Wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time - Track"));
	 
	
	 
	 String actualHomePageTitle=driver.getTitle(); 
	 String  ExpectedHomePageTitle="actiTIME - Enter Time-Track";
	 
	 System.out.println("actual home Page title:"+actualHomePageTitle);
	 System.out.println("home page validation status is :"+actualHomePageTitle.equals(ExpectedHomePageTitle));
	 
	 
	 
	 
	 
	 
	 
	   
	 
	 
	 
	 
	 

	}

}
