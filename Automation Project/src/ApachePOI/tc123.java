package ApachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class tc123 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("c:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(fis);
		XSSFSheet wso = wbo.getSheet("Sheet1");
		
		Row r;
		
		r=wso.createRow(0);
		r.createCell(2).setCellValue("Selenium");
		
		FileOutputStream fos = new FileOutputStream("c:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		wbo.write(fos);
	}

}
