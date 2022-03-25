package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static WebDriver LaunchChrome(String url) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;	
	}

}
