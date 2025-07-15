package ExcelReading;

import java.io.*;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;

public class Excelread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String excelfilepath = System.getProperty("user.dir")+"./src/test/resources/Employee_Data.xlsx";    //Fetch the file
		
		File file = new File(excelfilepath);
			
		FileInputStream fis = new FileInputStream(file);
			
		XSSFWorkbook workbook = new XSSFWorkbook(fis);    //Access the workbook
			
		XSSFSheet sheet = workbook.getSheet("sheet1");      //Access the sheet
		
		XSSFRow row = sheet.getRow(3);    //2nd row
			
		XSSFCell cellvalue = row.getCell(3);    //1 st element
			
		CellType celltype = cellvalue.getCellType();
			
		switch(celltype) {
			
			case STRING:
				
				System.out.println(cellvalue.getStringCellValue());
				break;
				
			case NUMERIC:
				
				System.out.println(cellvalue.getNumericCellValue());
				break;
				
			case BOOLEAN:
				
				System.out.println(cellvalue.getBooleanCellValue());
				break;


				//System.out.println(cellvalue.getS);

		}
	}

}
