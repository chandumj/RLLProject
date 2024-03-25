package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {

	String filePath= "F:\\Mphasis Practice Eclipse\\RLLProject\\src\\test\\resources\\TestData.xlsx";
	Workbook book;
	Sheet sheet;
	Workbook workbook=new XSSFWorkbook();
	
	public Object[][] getTestData(String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream(filePath);
		
		book=WorkbookFactory.create(file);
		sheet=book.getSheet(sheetName);
		
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(sheet.getRow(i+1).getCell(j).toString());
			}
		}
		return data;
	}
	public static void writeTestResult(int row,String Result) throws IOException {
//		FileOutputStream outputStream = new FileOutputStream("F:\\Mphasis Practice Eclipse\\RLLProject\\src\\test\\resources\\TestResult.xlsx");
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet=workbook.createSheet("Result");
		Row rowcount = sheet.createRow(row);
		Cell cell1=rowcount.createCell(0);
		Cell cell2=rowcount.createCell(1);
		cell1.setCellValue("TestCase: "+row);
		cell2.setCellValue(Result);
		  try (FileOutputStream outputStream = new FileOutputStream("F:\\Mphasis Practice Eclipse\\RLLProject\\src\\test\\resources\\TestResult.xlsx")) {
	            workbook.write(outputStream);
	        }
		  workbook.close();
	}
}
