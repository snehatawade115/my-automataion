package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import pojo.LaunchBrowser;

public class Logintest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		LaunchBrowser.LaunchChrome("https://kite.zerodha.com/");
	}
	@org.testng.annotations.Test
	public void loginwithzeroda() {
		WebElement login=driver.findElement(By.xpath("//input[@placeholder=\"User ID (eg: AB0001)\"]"));
		login.sendKeys("velocity");
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys("katraj");
		driver.close();
	}

}
