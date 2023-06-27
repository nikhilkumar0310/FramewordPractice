package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static String[][] throwExcelData(String excelFileNameGet) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./dataSheet/"+excelFileNameGet+".xlsx"); // Created object and opened the excel file.
		
		XSSFSheet ws = wb.getSheetAt(0);  //Provided the address for the specific sheet the workbook object would look into.
		
		int rowCount = ws.getLastRowNum();
		//System.out.println(rowCount); // Row Count is 2 currently except for the Header Row.
		
		int cellCount = ws.getRow(0).getLastCellNum();
		//System.out.println(cellCount);
		
		String [][] catchData = new String [rowCount] [cellCount];
		
		for (int i = 1; i <= rowCount; i++) {// i Starts from 1 as i iterates over an index which always starts with 0, here at 0 we have Header Row
			for (int j = 0; j < cellCount; j++) {// Column and Cells don't have such issues as they are associated with Rows.
				
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				
				String eachCellValue = cell.getStringCellValue();
				//System.out.println(eachCellValue);
				
				catchData[i-1] [j] = eachCellValue;
				System.out.println(catchData[i-1] [j]);
			}
			
		}
		
		wb.close();
		return catchData;
	}

}
