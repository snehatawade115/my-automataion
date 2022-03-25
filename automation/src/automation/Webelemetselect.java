package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelemetselect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement key=driver.findElement(By.xpath("//div[@style=\"margin-left:20px;\"]"));
		key.click();
		
		
		
	}

}
