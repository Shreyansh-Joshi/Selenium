import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class robottc2 {
	
	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.hdnicewallpapers.com/Wallpaper-Download/Cute-Baby/Cute-Baby-Girl-with-Pink-Dress-Wallpaper");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void download() throws InterruptedException, AWTException
	{
		driver.findElement(By.linkText("DOWNLOAD")).click();
		Thread.sleep(2000);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		}
	
	
	

}
