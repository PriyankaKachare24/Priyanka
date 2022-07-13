package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	
//	excel
//	screenshot
//	closing
	public static String readDataFromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
	File myFile = new File("C:\\Selenium\\Book1.xlsx");
    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
    String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	}

	
	

	
		
	}

	

	
		
	

	

