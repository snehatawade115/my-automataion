package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		
//		WebElement login=driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]"));
//		login.sendKeys("katraj");
//		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
//		password.sendKeys("1234");
//		WebElement button=driver.findElement(By.xpath("//button[@value=\"1\"]"));
//		button.click();
//		
//		
//		
		
		
		
	}

}
