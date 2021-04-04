package WebdriverProgrammes;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://google.com");
	
	   driver.manage().window().maximize();
	
	}

}
