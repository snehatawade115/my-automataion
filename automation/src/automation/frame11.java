package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame11 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("sonna");
		
	}

}
