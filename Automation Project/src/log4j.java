	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.log4j.Logger;
	import org.apache.log4j.xml.DOMConfigurator;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class log4j {
		
		private static Logger Log = Logger.getLogger(log4j.class);
		ChromeDriver driver; //Instance Variable
		FileInputStream fis; //Instance Variable
		Properties pr123; //Instance Variable
		
		@BeforeTest
		public void open() throws InterruptedException
		{	
			
			DOMConfigurator.configure("log4j.xml.txt");
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			
			Log.info("chrome browser is opened");
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			Log.info("navigated to OrangeHRM application");
			
		}
		@Test(priority=1)
		public void login() throws IOException
		{
			fis = new FileInputStream("E:\\workspace\\Automation Project\\HRMLogin.properties");
			pr123 = new Properties();
			pr123.load(fis);
			
			Log.info("Successfully properties are imported");
			
			driver.findElement(By.id(pr123.getProperty("user"))).sendKeys("admin");
			Log.info("Username Inserted Successfully");
			driver.findElement(By.id(pr123.getProperty("pwd"))).sendKeys("admin123");
			Log.info("Password Inserted Successfully");
			driver.findElement(By.id(pr123.getProperty("log"))).click();
			Log.info("Logged In Successfully");
		}
		@Test(priority=2)
		public void logout() throws IOException, InterruptedException
		{
			 fis = new FileInputStream("E:\\workspace\\Automation Project\\HRMLogin.properties");
			 pr123 = new Properties();
			 pr123.load(fis);
			 
			 driver.findElement(By.id(pr123.getProperty("drop"))).click();
			 Thread.sleep(2000);
			 driver.findElement(By.linkText(pr123.getProperty("logout"))).click();
			 
			 Log.info("Logged Out Successfully");
		}

	}



