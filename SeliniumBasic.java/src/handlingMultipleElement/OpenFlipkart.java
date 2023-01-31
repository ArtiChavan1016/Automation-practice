package handlingMultipleElement;


import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFlipkart {

	public static <WebElement> void main(String[] args) {
	
		
	    System.setProperty("webdriver.chrome.driver","/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		String actualhomepage=driver.getTitle();
		
		System.out.println("Actual PG:"+actualhomepage);
		
		
		driver.findElement(By.className("-2doB$Z")).click();
		
		 List<WebElement>
		
		
		suggList=driver.findElement(By.cssSelector("div-2tvxW>div.-3||5o0>div.-37M3pb"));
		
		for(int i=0;i<suggList.size();i++);{
			 Object i;
			System.out.println("count to be display:"+suggList.get(i).getText());
			
			 
		}
		for(int i=0;i<suggList.size();i++) {
			String suggName=suggList.get(i).getText();
			
			if(suggName.equals("fashion")) {
				suggList.get(i).click();
				break;
			}
		}
		
		
		
		
		

	}

}
