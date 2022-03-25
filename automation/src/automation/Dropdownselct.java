package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselct {
public static void main(String[] args) {
	WebDriver driver=Eexelproo.launchchrome("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement option=driver.findElement(By.xpath("//select[@id=\"first\"]"));
	Select a=new Select(option);
	a.selectByIndex(3);
	a.equals(a);
	
	
}
}
