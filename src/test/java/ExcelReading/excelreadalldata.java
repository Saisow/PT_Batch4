package ExcelReading;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;



public class excelreadalldata {

	public Object[][]  readdata() throws Exception {
		// TODO Auto-generated method stub
		
				String excelfilepath = System.getProperty("user.dir")+"./src/test/resources/Employee_Data.xlsx";    //Fetch the file
				
				File file = new File(excelfilepath);
					
				FileInputStream fis = new FileInputStream(file);
					
				XSSFWorkbook workbook = new XSSFWorkbook(fis);    //Access the workbook
					
				XSSFSheet sheet = workbook.getSheet("sheet1");      //Access the sheet
				
				 int rows = sheet.getLastRowNum();    
					
				int cols = sheet.getRow(1).getLastCellNum(); 
				
				Object celltype;
				
				for(int r=0;r<=rows;r++) {
					
						XSSFRow row = sheet.getRow(r);
						
					for(int c=0;c<cols;c++) {						
						
						XSSFCell cellvalue = row.getCell(c);    //1 st element
						
						 celltype = cellvalue.getCellType();
							
						switch(celltype) {
							
							case STRING:
								
								System.out.printf("%-20s",cellvalue.getStringCellValue());
								break;
								
							case NUMERIC:
								
								System.out.printf("%-20s",cellvalue.getNumericCellValue());
								break;
								
							case BOOLEAN:
								
								System.out.printf("%-20s",cellvalue.getBooleanCellValue());
								break;
							
				}
					
					
					
				}
					System.out.println();
				
				
					
			}
				workbook.close();
				fis.close();
				return celltype;
					
					
		}
}


	


