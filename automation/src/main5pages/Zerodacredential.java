package main5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodacredential {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		WebElement login=driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		login.sendKeys("velocity");
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys("12345");
		WebElement button=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		button.click();
		}

}
