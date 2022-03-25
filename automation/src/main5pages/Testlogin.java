package main5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://190.210.184.180/login.do");
		
		WebElement name=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		name.sendKeys("velocity");
		WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("12345");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		button.click();
	}

}
