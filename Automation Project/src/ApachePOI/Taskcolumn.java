package ApachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Taskcolumn {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook (fis);
		XSSFSheet wso = wbo.getSheet("Sheet1");
		
		Row r;
		r=wso.createRow(0);
		
		for(int i=0;i<=10;i++)
		{
			r.createCell(i).setCellValue("Shreyansh");
		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		wbo.write(fos);
	}

}
