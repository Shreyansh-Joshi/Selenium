package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practise {
	
	ChromeDriver driver;
	FileInputStream fis;
	Properties pr123;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority =1)
	public void data() throws IOException
	{
		fis = new FileInputStream("E:\\workspace\\Automation Project\\HRMLogin.properties");
		pr123 = new Properties();
		pr123.load(fis);
		
		driver.findElement(By.id(pr123.getProperty("user"))).sendKeys("Admin");
		driver.findElement(By.id(pr123.getProperty("pwd"))).sendKeys("admin123");
		driver.findElement(By.id(pr123.getProperty("log"))).click();
	}
	@Test(priority =2)
	public void logout() throws IOException, InterruptedException
	{
		fis = new FileInputStream("E:\\workspace\\Automation Project\\HRMLogin.properties");
		pr123 = new Properties();
		pr123.load(fis);
		
		driver.findElement(By.id(pr123.getProperty("drop"))).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(pr123.getProperty("logout"))).click();
	}
	
	
	
	
	 	
		
		
}
