package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(1500);
	driver.navigate().back();
	Thread.sleep(1500);
	driver.navigate().refresh();
	Thread.sleep(2000);
	String title=driver.getTitle();
	System.out.println(title);
	
}
}
