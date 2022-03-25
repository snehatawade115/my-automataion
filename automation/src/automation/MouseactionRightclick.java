package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionRightclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		
		WebElement a=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(a);
		act.contextClick();		
		act.perform();
		Thread.sleep(1200);
		
		WebElement a1=driver.findElement(By.xpath("//span[text()=\"Copy\"]"));
		act.moveToElement(a1);
		act.contextClick(a1);
		act.perform();
		Thread.sleep(1200);

		
		driver.switchTo().alert().accept();
		
		
		}

}
