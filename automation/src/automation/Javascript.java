package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		WebElement forms=driver.findElement(By.xpath("(//span[@class=\"text\"])[8]"));
		JavascriptExecutor Execute=(JavascriptExecutor)driver;
		Execute.executeScript("arguments[0].scrollIntoView(true)",forms);
		Execute.executeScript("");
	
}

}
