import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practise {

	ChromeDriver driver;
	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.angelfire.com/super/badwebs/");
		
		driver.manage().window().maximize();
			
	}
	
	@Test
	public void manyframes()
	{
		List<WebElement>frames = driver.findElements(By.tagName("frame"));
		
		for(int i=0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
		
		try
		{
			driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
			break;
		}
		catch(Exception x)
		{
			driver.switchTo().defaultContent();
		}
		}
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
