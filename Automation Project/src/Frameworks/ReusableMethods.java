package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReusableMethods {

	ChromeDriver driver; //Instance Variable
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
	}
	@Test(priority=1)
	public void login(String user, String password)
	{
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test(priority=2)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.id("user-dropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
