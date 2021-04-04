package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class tc6 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(fis);
		XSSFSheet wso = wbo.getSheet("Sheet1");
		
		Row r;
		
		int rowc=wso.getLastRowNum();
		
		for(int i=0;i<=rowc;i++)
		{
			r=wso.getRow(i);
			String data = r.getCell(0).getStringCellValue();
			System.out.println(data);
		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		wbo.write(fos);
		
	}

}
