package WebdriverProgrammes;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithtext {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		
		java.util.List<WebElement>ntext = driver.findElements(By.tagName("P"));
		System.out.println(" no of normal text elements are"+"      "+ntext.size());
		
		java.util.List<WebElement>btext = driver.findElements(By.tagName("b"));
		System.out.println("no of bold text are"+"    "+btext.size());
		
			
		
	}

}
