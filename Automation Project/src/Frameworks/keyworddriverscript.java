package Frameworks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class keyworddriverscript {
	
	@Test
	public void data() throws IOException, InterruptedException
	{
		Actionkeywords key = new Actionkeywords(); // created object for Actionkeywords class. 
		FileInputStream fis = new FileInputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Actionkeywords.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(fis);
		XSSFSheet wso =wbo.getSheet("Sheet1");
		
		Row r;
		
		int rowc = wso.getLastRowNum();
		
		for(int i=1;i<=rowc;i++)
		{
			r=wso.getRow(i);
			
			String runmode = r.getCell(4).getStringCellValue();
			
			if(runmode.equals("Y"))
			{
				String action = r.getCell(3).getStringCellValue();
				
				if(action.equals("launchbrowser"))
				{
					key.launchbrowser();
				}
				else if(action.equals("navigate"))
				{
					key.navigate();
				}
				else if(action.equals("enterusername"))
				{
					key.enterusername();
				}
				else if(action.equals("enterpassword"))
				{
					key.enterpassword();
				}
				else if(action.equals("clickonlogin"))
				{
					key.clickonlogin();
				}
				else if(action.equals("clickonlogout"))
				{
					key.clickonlogout();
				}
				else if(action.equals("closebrowser"))
				{
					key.closebrowser();
					
				}
			}
		}
	}

}
