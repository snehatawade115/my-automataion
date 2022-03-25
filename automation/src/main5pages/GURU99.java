package main5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GURU99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("velocity");
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
		pass.sendKeys("12345");
		WebElement button=driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]"));
		button.click();
	}

}
