package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wating11 {
public static void main(String[] args) {
	WebDriver driver=Eexelproo.launchchrome("https://www.facebook.com/");
	WebElement demo1=driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]"));
    demo1.click();
    WebElement user=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
    user.sendKeys("velocity");
    WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
    lastname.sendKeys("katraj");
	
}
}
