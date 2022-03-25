package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMcalling {
	public void loginwithvalidID() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//valid username
		POMclss p1= new POMclss(driver);
		p1.enterusername("veloity.com");
		p1.enterpassword("sonna12");
		p1.login();	
	}
	public void loginwithINvalidId() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//invalid username
		POMclss p1=new POMclss(driver);
		p1.enterusername("invalid.com");
		p1.enterpassword("sonna12");
		p1.login();	
	}
	public void validpassword() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// valid password
		POMclss p1=new POMclss(driver);
		p1.enterusername("velocity.com");
		p1.enterpassword("sonna12");
		p1.login();
		
	}
	public void INvalidpassword() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AASHU\\Documents\\sonu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//for invalid password
		POMclss p1=new POMclss(driver);
		p1.enterpassword("velocity.com");
		p1.enterpassword("12fddd");
		p1.login();
	}
	public static void main(String[] args) {
		POMcalling pom=new POMcalling();
		pom.loginwithvalidID();
		pom.loginwithINvalidId();
		pom.INvalidpassword();
		pom.validpassword();
	}

}
