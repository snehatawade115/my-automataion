package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Callbrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Demo12.callBrowser("https://www.facebook.com/");
		
		WebElement id=driver.findElement(By.id("email"));
		id.sendKeys("velocity");
		
	}

}
