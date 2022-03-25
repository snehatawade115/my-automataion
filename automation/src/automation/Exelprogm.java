package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelprogm {
	
public static String getdata(int row,int cell) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\AASHU\\Documents\\sonna\\exelsheet\\Exel1.xlsx");
	
	String value =WorkbookFactory.create(file).getSheet("data").getRow(row).getCell(cell).getStringCellValue();
	
	return value;
}
}
