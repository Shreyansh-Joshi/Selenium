import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class doubleclick {
	ChromeDriver driver;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void google() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.name("btnK"));
		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();	
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
