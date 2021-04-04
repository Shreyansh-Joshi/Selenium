package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jse6 {
	
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void operations() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		
		js.executeScript("window.history.back()");
		Thread.sleep(2000);
		js.executeScript("window.history.forward()");
	}

}
