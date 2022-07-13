package excelSheetStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelEg3 {

	
	private static org.apache.poi.ss.usermodel.CellType dataType;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile = new File("C:\\Selenium\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		int totalNumberOfRows=mySheet.getLastRowNum();
		int rowCount=totalNumberOfRows;
		System.out.println("Total Number Of Rows are"+ rowCount);
		 
		short totalNumberOfColumns = mySheet.getRow(totalNumberOfRows).getLastCellNum();
		int columnCount = totalNumberOfColumns - 1;
		System.out.println("Total Number of Coulumns Are " + columnCount);
		System.out.println("Cell Type is " + mySheet.getRow(2).getCell(1).getCellType());
		
		for (int i=0; i<=rowCount; i++) 
		{

			for (int j=0; j<=columnCount; j++)
			{
              Cell myCell=mySheet.getRow(i).getCell(j);
             dataType = myCell.getCellType();

				} 


		
	}
	}
	
	
	
	
}
