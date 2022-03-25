package automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExellaunchCH {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver= Eexelproo.launchchrome("https://www.facebook.com/");
		
		String emailid=Exelprogm.getdata(2,0);
	    WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
	    email.sendKeys(emailid);
	    
	    String passD=Exelprogm.getdata(2,1);
	    WebElement pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	    pass.sendKeys(passD);
	    
	}

}
