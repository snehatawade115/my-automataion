package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGx {
	@Test
	public void loginfacebook() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		POMclss p1=new POMclss(driver);
		p1.enterusername("velocity");
		p1.enterpassword("sonna123");
		p1.login();
	}
	
	
}
