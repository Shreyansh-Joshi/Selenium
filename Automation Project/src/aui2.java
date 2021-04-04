import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aui2 {

	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void movetoelement() throws InterruptedException
	{
		WebElement Element = driver.findElement(By.linkText("Customer Login"));
		Actions action = new Actions(driver);
		action.moveToElement(Element).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		
	}
	@AfterTest(enabled=false)
	public void close()
	{
		driver.close();
	}
	
}
