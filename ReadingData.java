package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public static String[][] readExcelData(String excelFileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count = "+rowCount);
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("Total Num columns =" + colcount);
		String[][] data = new String[rowCount][colcount];
		for (int i = 1; i <=rowCount;  i++) {
			XSSFRow row1=sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row1.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
			}
		}
		workbook.close();
		return data;		

	}

}
