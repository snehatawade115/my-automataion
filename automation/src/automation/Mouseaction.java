package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement id=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		act.moveToElement(id);
		act.perform();
		Thread.sleep(3000);
		WebElement mouse=driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[1]"));
		mouse.click();
		
		
		
	}

}
