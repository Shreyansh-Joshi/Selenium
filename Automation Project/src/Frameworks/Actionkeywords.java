package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeywords {
	
	ChromeDriver driver;  //Instance Variable
	
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void navigate()
	{
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		
	}
	public void enterusername()
	{
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterpassword()
	{
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	public void clickonlogin()
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	public void clickonlogout() throws InterruptedException
	{
		driver.findElement(By.id("user-dropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
	public void closebrowser()
	{
		driver.close();
	}

}
