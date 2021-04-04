package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class binglinknameandurl {

	public static void main(String[] args) throws Exception {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				
				String text=links.get(i).getText();
				
				links.get(i).click();
				
				String Url=driver.getCurrentUrl();
				
		System.out.println(text+"Active"+Url);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		links=driver.findElements(By.tagName("a"));
		
		
			}
		}
		
		
		
		
	}

}
