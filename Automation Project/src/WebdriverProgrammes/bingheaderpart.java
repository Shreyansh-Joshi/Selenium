package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bingheaderpart {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		
		//To find no of links in header part of bing.com
		
		WebElement header = driver.findElement(By.xpath("//*[@id='hdr']/div[1]/div/ul"));
		List<WebElement>links=header.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//To get names of the links
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		
		
		
	}

}
