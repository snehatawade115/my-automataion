package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DEMOFACEBOOK {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement login=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	login.sendKeys("sneha");
	WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	Select ss=new Select(day);
	ss.selectByIndex(0);
//	ss.selectByValue("10");
//	ss.selectByVisibleText("jul");
//	
//	
//	String url=driver.getCurrentUrl();
//	System.out.println(url);
//	String title=driver.getTitle();
//	System.out.println(title);
	
	
	
}
}
