package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Get Workbook
		XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadExcel.xlsx");
		
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		//Get Row Count
		int RowCount = sheet.getLastRowNum();
		
		//Get Column Count
		short ColumnCount = sheet.getRow(0).getLastCellNum();
		
		for (int i = 1; i < RowCount; i++) {
			for (int j = 0; j < ColumnCount; j++) {
				//Get Row
				XSSFRow row = sheet.getRow(i);
				//Get Column
				XSSFCell cell = row.getCell(j);
				//Pick perticular value
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
		

	}

	
}
