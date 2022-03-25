package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclss {
	@FindBy(xpath="//input[@id=\"email\"]") private WebElement username;
	@FindBy(xpath="//input[@id=\"pass\"]") private WebElement password;
	@FindBy(xpath="//button[@name=\"login\"]") private WebElement login;
	
	public POMclss(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
	public void enterusername(String name)
	{
		username.sendKeys(name);	
	}
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void login()
	{
		login.click();
	}
}
