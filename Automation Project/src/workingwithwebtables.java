import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithwebtables {

	ChromeDriver driver;       // Instance variable.
	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void data()
	{
		List<WebElement>data = driver.findElements(By.tagName("table"));
		System.out.println("The no of tables are:"+" "+data.size());
	}
	
	@Test(priority = 2)
	public void count()
	{
		WebElement table = driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table"));
		
		//Counting no of rows
		
		List<WebElement>Element = table.findElements(By.tagName("tr"));
		System.out.println("Total no of rows are:"+" "+Element.size());
		
		//Counting no of columns
		
		Element = table.findElements(By.tagName("td"));
		System.out.println("The no of columns are:"+" "+Element.size());
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
