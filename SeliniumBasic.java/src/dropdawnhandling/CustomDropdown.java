   package dropdawnhandling;
   import java.util.List;
   import java.util.concurrent.TimeUnit;
   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.chrome.ChromeDriver;
   import org.openqa.selenium.support.ui.WebDriverWait;

         public class CustomDropdown {

	     public static void main(String[] args) {
		//String driverpath=System.getProperty(user.dir")+"\\drivers\\chromedriver.exe";
		 
		  System.setProperty("webdriver.chrome.driver","G:\\JavaWorkspace\\SeliniumBasic.java\\Drivers\\chromedriver.exe ");
		
		  WebDriver driver = new ChromeDriver();
		
		   driver.manage().window().maximize();
		
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		   driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		   WebDriverWait wait = new WebDriverWait(driver,20);
		   WebElement dropdawn=driver.findElement(By.id("bsd1-button"));
		
	      dropdawn.click();
         
          List<WebElement>option=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
         
          System.out.println("option count:"+option.size());
         
         for (int i=0;i<option.size();i++) {  
        	 
        	 
          System.out.println(option.get(i).getText());
        	 
         }
         option.get(2).click();
	     }
         

         }


