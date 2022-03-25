package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {
		
	
		
	public static ChromeDriver callBrowser(String x) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get(x);
	
		return driver;
		
		
	}
}
