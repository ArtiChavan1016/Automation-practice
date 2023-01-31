package screenshot;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Screenshot1 {

	public static void main(String[] args)throws IOException {
		
		SeleniumUtility m1 =new SeleniumUtility();
				
				WebDriver driver=m1.Set.setUp("chrome","https://demo.vitiger.com/vtigercrm/index.php"); 

		

	}

}
