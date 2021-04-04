package ApachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webdriverwithapachepoi2 {
	
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void data() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(fis);
		XSSFSheet wso = wbo.getSheet("Sheet1");
		
		Row r;
		
		WebElement dropdown = driver.findElement(By.id("themes"));
		List<WebElement>values = dropdown.findElements(By.tagName("option"));
		
		for(int i=0;i<values.size();i++)
		{
			r=wso.createRow(i);
			r.createCell(0).setCellValue(values.get(i).getText());
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		wbo.write(fos);
	}
}
