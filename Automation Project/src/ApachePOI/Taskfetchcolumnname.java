package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Taskfetchcolumnname {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Shreyansh Joshi\\Desktop\\Book1.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook (fis);
		XSSFSheet wso = wbo.getSheet("Sheet1");
		
		Row r;
		r=wso.getRow(0);
		int colc = r.getLastCellNum();		
		for(int i=0;i<=colc;i++)
		{
			String data = r.getCell(i).getStringCellValue();
			System.out.print(data+"   ");

		}
	}

}
