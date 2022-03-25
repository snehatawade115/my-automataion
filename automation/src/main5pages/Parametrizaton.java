package main5pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrizaton {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		String path="C:\\Users\\AASHU\\Documents\\\sonna\\Mynewwexel.xlsx";
		FileInputStream file=new FileInputStream(path);
		String value=WorkbookFactory.create(file).getSheet("data").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		
	}

}
