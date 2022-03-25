package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {//need to write the classname screnshot
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\AASHU\\Desktop\\scrennshot\\fb.jpeg");
		FileHandler.copy(source, destination);
	}

}
