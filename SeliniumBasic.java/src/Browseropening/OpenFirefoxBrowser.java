package Browseropening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver", "G:\\JavaWorkspace\\SeliniumBasic.java\\Drivers\\geckodriver.exe");
		
		FirefoxDriver fdriver = new FirefoxDriver();
		
		

	}

}
