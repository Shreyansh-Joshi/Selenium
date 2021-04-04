import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alerttask {

	ChromeDriver driver;
	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	}
	@Test
	public void task() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='fromPlaceName']"));
		Select st = new Select(dropdown);
		st.selectByVisibleText("Bangalore");

		driver.findElement(By.id("searchBtn")).click();
		String Value = driver.switchTo().alert().getText();
		System.out.println(Value);
	}
	
}
