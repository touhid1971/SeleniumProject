package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb1 = new XSSFWorkbook("./Data/PracticeExcel.xlsx");
		
		XSSFSheet sheet1 = wb1.getSheet("Sheet1");
		
		//Row Count
		int RC = sheet1.getLastRowNum();

			
		//Column Count
		int CC = sheet1.getRow(0).getLastCellNum();
		
		for (int i = 1; i < RC; i++) {
			for (int j = 0; j < CC; j++) {
				//Get Row
				XSSFRow row = sheet1.getRow(i);
				//Get Column
				XSSFCell cell = row.getCell(j);
				//Print
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
	}
		
		
		

	}


