package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooflinksdropdownsimages {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		
		List<WebElement>Elements = driver.findElements(By.tagName("a"));
		System.out.println("No of links are"+"  "+Elements.size());
		
		Elements = driver.findElements(By.tagName("select"));
		System.out.println("No of dropdowns are"+"  "+Elements.size());
		
		Elements = driver.findElements(By.tagName("img"));
		System.out.println("No of images are"+"  "+Elements.size());
		
		
		}

}
