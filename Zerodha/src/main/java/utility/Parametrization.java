package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Parametrization {

	public void getdata(WebDriver Driver,int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\AASHU\\Documents\\sonna\\Mynewwexel.xlsx");
		String  value=WorkbookFactory.create(file).getSheet("data").getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
	}
}



