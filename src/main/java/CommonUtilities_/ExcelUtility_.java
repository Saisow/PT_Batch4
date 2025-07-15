package CommonUtilities_;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Generic_Utilities.IpathConstaant;

public class ExcelUtility_ {
	
	public String getExcelData(String SheetName, int rowNum, int cellNum) throws Throwable {
		// step1:- path connection
		FileInputStream fis1 = new FileInputStream(IpathConstaant.excelPath);

		// step2:-keeps the workbook/excelfile in read mode
		Workbook book = WorkbookFactory.create(fis1);

		// step3:- Navigating expected sheet
		Sheet sheet = book.getSheet(SheetName);

		// step4:- Navigating expected row--->row value starts from 0
		Row row = sheet.getRow(rowNum);

		// step5:- Navigating expected cell--->cell value starts from 0
		Cell cell = row.getCell(cellNum);

		String ExcelData = cell.getStringCellValue();
	
		System.out.println(ExcelData);
		return ExcelData;
	}
	
	public Object[][] readDataUsingDataProvider(String SheetName) throws Throwable {
		// step1:- path connection
		FileInputStream fis1 = new FileInputStream("./src/test/resources/TestData.xlsx");

		// step2:-keeps the workbook/excelfile in read mode
		Workbook book = WorkbookFactory.create(fis1);

		// step3:- Navigating expected sheet
		Sheet sheet = book.getSheet(SheetName);

		int lastRow = sheet.getLastRowNum()+1;
		int lastCell = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRow][lastCell];      //[4][3]
		for (int i = 0; i < lastRow; i++)   //iterate the rows
		{
			for (int j = 0; j < lastCell; j++)  //itrate the no.of cells
			{
				obj[i][j]=sheet.getRow(i).getCell(j).toString();     //sai sowmya 
			}
		}
		return obj;
	
	}
}
