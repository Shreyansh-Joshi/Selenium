import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aui12 {

	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void rightclick() throws InterruptedException
	{
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions action = new Actions(driver);
		action.contextClick(gmail).build().perform();
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
