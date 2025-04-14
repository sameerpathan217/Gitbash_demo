package Genric_Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String ExcelData(String sheet,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TAlchemy.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
	    Row r = s.getRow(row);
	    Cell c = r.getCell(cell);
		String data = c.getStringCellValue();
		return data;
	}

}
