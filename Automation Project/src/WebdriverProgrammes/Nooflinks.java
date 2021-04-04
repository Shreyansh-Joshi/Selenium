package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nooflinks {

	public static void main(String[] args) {

		//Open browser and goto ICICI bank.
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("No of links are"+"  "+links.size());
	
		
	}

}
