package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urljava {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
//	WebElement login=driver.findElement(By.xpath("//input[@autocorrect=\"off\"]"));
//    login.sendKeys("sona");
//    
//    WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
//	password.sendKeys("4512");
//	
//	WebElement button=driver.findElement(By.xpath("//input[@id=\"password\"]"));
//	button.click();
//	
	
	
	
	
}
}
