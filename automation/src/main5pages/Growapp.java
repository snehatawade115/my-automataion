package main5pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growapp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//aplly waits
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	driver.get("https://groww.in/");
	
	WebElement regitebutton=driver.findElement(By.xpath("//span[text()='Login/Register']"));
	regitebutton.click();
	WebElement email=driver.findElement(By.xpath("//input[@id='login_email1']"));
	email.sendKeys("Angelsweet1510@gmail.com");
	WebElement continuebutton=driver.findElement(By.xpath("(//span[@class='absolute-center'])[1]"));
	continuebutton.click();
	
	
	Thread.sleep(3000);
	WebElement pass=driver.findElement(By.xpath("//input[@id='login_password1']"));
	pass.sendKeys("Sonna@123");
	WebElement submit=driver.findElement(By.xpath("//span[text()='Submit']"));
	submit.click();
	
	//code for password
	WebElement value1=driver.findElement(By.xpath("(//input[@class='otpinput88'])[1]"));
	value1.sendKeys("8");
	WebElement value2=driver.findElement(By.xpath("(//input[@class='otpinput88'])[2]"));
	value2.sendKeys("8");
	WebElement value3=driver.findElement(By.xpath("(//input[@class='otpinput88'])[3]"));
	value3.sendKeys("8");
	WebElement value4=driver.findElement(By.xpath("(//input[@class='otpinput88'])[4]"));
	value4.sendKeys("8");
	
}
}
