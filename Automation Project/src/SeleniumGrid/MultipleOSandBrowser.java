package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleOSandBrowser 
{	
	FirefoxDriver driver;
	ChromeDriver driver1;
	SafariDriver driver2;
	OperaDriver driver3;
	@DataProvider(parallel=true)
	
	public Object[][] getData()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0]="Admin";
		data[0][1]="admin";
		data[0][2]="firefox";
		
		data[1][0]="Admin";
		data[1][1]="admin";
		data[1][2]="chrome";
		
		data[2][0]="Admin";
		data[2][1]="admin";
		data[2][2]="safari";
		
		data[3][0]="Admin";
		data[3][1]="admin";
		data[3][2]="Opera";
		return data;
	}
	
	@Test(dataProvider="getData")
	
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		DesiredCapabilities cap = null;
		if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("safari"))
		{
			cap=DesiredCapabilities.safari();
			cap.setBrowserName("safari");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("Opera"))
		{
			cap=DesiredCapabilities.opera();
			cap.setBrowserName("Opera");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
	}
	

}
