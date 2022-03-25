package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eexelproo {
	public static WebDriver launchchrome(String x)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(x);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}	
}
