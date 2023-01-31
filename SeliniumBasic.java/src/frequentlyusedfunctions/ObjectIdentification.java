package frequentlyusedfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) {
		//set required driver.exe path
		
    System.setProperty("webdriver.chrome.driver","\\Drivers\\chromedriver.exe");
       // create an instance of required browser class
    WebDriver driver=new ChromeDriver();
    
     //enter required application url
    driver.get("https://demo.vtiger.com/vitiger crm/index.php");
    
    //identify username inputbfield
    WebElement usernameInputField=driver.findElement(By.id("username"));
    
    usernameInputField.clear();
    
    usernameInputField.sendKeys("admin");
    
    WebElement passwardInputfield=driver.findElement(By.id("passward"));
    
    passwardInputfield.clear();
    
    passwardInputfield.sendKeys("Test@123");
    
    WebElement signinBtn = driver.findElement(By.className("buttonblue"));
     
    signinBtn.click();
    
    System.out.println("home page title is :"+driver.getTitle());
      
    driver.close();
    
	}}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    

	