import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alerts {
	
	ChromeDriver driver;
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1,enabled = false)
	public void alertmsg() throws InterruptedException
	{
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(3000);
				
		String value = driver.switchTo().alert().getText();
		System.out.println("The Error Message Displayed Is:"+" "+value);
	}
	@Test(priority = 2)
	public void okbutton() throws InterruptedException
	{
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
