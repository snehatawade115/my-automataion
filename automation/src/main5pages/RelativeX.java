package main5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeX {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement path=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/svg")); ///html/body/div[1]/div/div[3]/div[2]/div[1]/svg
		path.click();
	
	
	
	
	
	
	
	
	
	}
}
