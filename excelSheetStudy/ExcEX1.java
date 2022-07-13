package excelSheetStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcEX1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//1.req. to creat object of file class
		 File myFile = new File("C:\\Selenium\\Book1.xlsx");
		 
		 //2. use workbookFactory class call creat method 
		 //& pass details to read string type value
		 
		 String city = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 
		 System.out.println(city);
		 
		 String city1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		 System.out.println(city1);
		 
		 //to read numeric value
		 
		 double number = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		 System.out.println(number);
		 
		 double number1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		 System.out.println(number1);
		 
		 //to read boolean value
		 
		 boolean value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		 System.out.println(value);
		 
		 boolean value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
		 System.out.println(value1);
		 
		 String grade = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		 System.out.println(grade);
		 
		 String grade1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		 System.out.println(grade1);

	}

}
