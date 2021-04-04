package ApachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadrivenFramework {
	
	ChromeDriver driver;
	FileInputStream fis;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	FileOutputStream fos;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		Thread.sleep(2000);
		
	}
	@Test
	public void datadriven() throws IOException, InterruptedException
	{
		fis = new FileInputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Datadriven Framework.xlsx");
		wbo = new XSSFWorkbook(fis);
		wso = wbo.getSheet("Sheet1");
		
		Row r;
		
		int rowc=wso.getLastRowNum();
		for(int i=1;i<=rowc;i++)
		{
			r=wso.getRow(i);
			
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());;
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.id("btnLogin")).click();
			
			String Actual = driver.getCurrentUrl();
			r.createCell(3).setCellValue(Actual);
			
			String Expected = r.getCell(2).getStringCellValue();
			
			if(Expected.equals(Actual))
			{
				r.createCell(4).setCellValue("Pass");
			}
			else
			{
				r.createCell(4).setCellValue("Fail");
			}
			
			driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
	
		}
			fos = new FileOutputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Datadriven Framework.xlsx");
			wbo.write(fos);
	}
	
	

}
