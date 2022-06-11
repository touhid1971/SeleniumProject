package practiceExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel1 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb1 = new XSSFWorkbook("./Data1/DataExcel.xlsx");
		
		XSSFSheet sheet = wb1.getSheet("Sheet1");
		
		
		
		//Get Row Count
		int row1 = sheet.getLastRowNum();
		System.out.println(row1);
		
		
		//Column Count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		for (int i = 1; i <= row1; i++) {
			for (int j = 0; j < columnCount; j++) {
		
		//Get Row
		XSSFRow row = sheet.getRow(i);
		
		//Get Column
		XSSFCell cell = row.getCell(j);
		
		//Print
		String vl = cell.getStringCellValue();
		System.out.println(vl);
			}
		}
			
		}
		}

		
	


