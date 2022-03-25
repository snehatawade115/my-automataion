package main5pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMRSdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		//apply waits
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		WebElement login=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		login.sendKeys("velocity");
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys("12345");
		WebElement select=driver.findElement(By.xpath("//li[@id=\"Registration Desk\"]"));
		select.click();
		WebElement button=driver.findElement(By.xpath("//input[@id=\"loginButton\"]"));
		button.click();
	}

}
