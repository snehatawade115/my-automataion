package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyNewBroSwer {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		login.sendKeys("sneha");
	}
}
