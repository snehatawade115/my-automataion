package main5pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartlogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//wait applying
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://affiliate.flipkart.com/login");
		WebElement login=driver.findElement(By.xpath("//input[@id=\"inputEmail\"]"));
		login.sendKeys("velocity");
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"inputPassword\"]"));
		pass.sendKeys("12345");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id=\"submitLogin\"]"));
		loginbutton.click();
	}

}
