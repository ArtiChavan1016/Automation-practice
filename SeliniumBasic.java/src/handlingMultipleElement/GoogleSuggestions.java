package handlingMultipleElement;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static <WebElement> void main(String[] args) {
	
		System.setProperty("webdrier.chrome.driver", "/Drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.Google.com/");
		
		driver.findElement(By.name("q")).sendKeys("SQL"); 
		
		List<WebElement>sugglist=driver.findElement(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		
		
		System.out.println("suggestion count is "+sugglist.size());
		
		for(int i=0;i<sugglist.size();i++)
			
		{
			
			WebElement element=sugglist.get(i);
			System.out.println("suggestion name is:"+((org.openqa.selenium.WebElement) element).getText());
			
			
			
			
			
			
			
		}
	}

}
