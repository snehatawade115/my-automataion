package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demoqa.com/text-box");
			WebElement input=driver.findElement(By.xpath("//input[@id=\"userName\"]"));
			input.sendKeys("velocity");
			WebElement email=driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
			email.sendKeys("soona123@gmail.com");
			WebElement address=driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
			address.sendKeys("pune oct B velocity");
			
			Actions act=new Actions(driver);
			//select the address
			act.keyDown(Keys.CONTROL);
			act.sendKeys("a");
			act.keyUp(Keys.CONTROL);
			act.build().perform();
			Thread.sleep(1200);
			
			//copy address
			act.keyDown(Keys.CONTROL);
			act.sendKeys("c");
			act.keyUp(Keys.CONTROL);
			act.build().perform();	
			Thread.sleep(1200);
			
			//move next element
			act.sendKeys(Keys.TAB);
			act.build().perform();
			
			//paste the address
			act.keyDown(Keys.CONTROL);
			act.sendKeys("v");
			act.keyUp(Keys.CONTROL);
			act.build().perform();
			
			
	}

}
