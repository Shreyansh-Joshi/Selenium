import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc3tc4 {
	
	ChromeDriver driver;
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void name()
	{
		String text = driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a")).getText();
		System.out.println("The selected word is:"+" "+text);
		
		String text1 = driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[19]/td[1]/a")).getText();
		System.out.println("The selected word is:"+" "+text1);
	}
	@Test(priority=2)
	public void rowdata()
	{
		String part1 = "/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2 = "]/td[1]/a";
		
		for(int i=1;i<=36;i++)
		{
			String title = driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(title);
			
		}
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}