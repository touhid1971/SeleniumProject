package utils;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	//public static String[][] main(String[] args) throws IOException {
	
	public String[][] readExcel() throws IOException {
	
	//Get Workbook
			XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadExcel.xlsx");
			
			//Get Sheet
			XSSFSheet sheet = wb.getSheetAt(0);
			
			
			//Get Row Count
			int RowCount = sheet.getLastRowNum();
			
			//Get Column Count
			int ColumnCount = sheet.getRow(0).getLastCellNum();
			String [] [] data = new String [RowCount] [ColumnCount];
			
			for (int i = 1; i <= RowCount; i++) {
				//Get Row
				XSSFRow row = sheet.getRow(i);

				for (int j = 0; j <ColumnCount; j++) {
					//Get Column
					XSSFCell cell = row.getCell(j);
					//Pick perticular value
					String value = cell.getStringCellValue();
					System.out.println(value);
					//Print/Read all values from the combination of Row and Column (Cell) of Excel File
					data[i-1][j] = value; //i=1-1=0, we know i=1
					
					}
			}
			
			return data;
			

		}

		
	}


