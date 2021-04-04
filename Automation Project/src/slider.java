import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class slider {
	ChromeDriver driver;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void slider() throws InterruptedException
	{
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.id("slider"));
		int location = slider.getLocation().y;
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDropBy(slider, location, 70).build().perform();
		Thread.sleep(3000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
