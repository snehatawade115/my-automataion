package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAnddrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	WebElement drop=driver.findElement(By.xpath("(//iframe[@width=\"700\"])[1]"));
	driver.switchTo();
}
}
