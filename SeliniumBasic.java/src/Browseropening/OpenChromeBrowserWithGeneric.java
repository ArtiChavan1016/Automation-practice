package Browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserWithGeneric {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "G:\\JavaWorkspace\\SeliniumBasic.java\\Drivers\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();

	}

}
