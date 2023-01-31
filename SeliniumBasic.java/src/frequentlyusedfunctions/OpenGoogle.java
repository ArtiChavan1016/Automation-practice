package frequentlyusedfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
	
		
		System.setProperty("Webdriver.chrome.driver", "G:\\JavaWorkspace\\SeliniumBasic.java\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String appTitle=driver.getTitle();
		
		System.out.println("application title :"+appTitle);
		System.out.println("Application title lenght:"+appTitle.length());
		System.out.println("current page URL is:"+driver.getCurrentUrl());
		System.out.println("current page URL lenght is :"+driver.getCurrentUrl().length());
		System.out.println("current page source code lenght:"+driver.getPageSource().length());
		
		driver.close();
		

	}

}
