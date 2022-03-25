package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public void Takescrenshot(WebDriver Driver,String name) throws IOException {
		
	File source=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	File Destination= new File("C:\\Users\\AASHU\\eclipse-workspace\\Zerodha\\"+name+".png");
	FileHandler.copy(source, Destination);
	
	


}
}