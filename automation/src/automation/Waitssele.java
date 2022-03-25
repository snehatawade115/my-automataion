package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitssele {

public static  WebDriver launchbroser(String url) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
	driver.get(url);
	driver.manage().window().maximize();
	
	return driver;
	
}
}
