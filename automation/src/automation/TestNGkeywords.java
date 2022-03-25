package automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGkeywords {
	WebDriver Driver;
	
 @Test(priority=1)
 public void Username() {
	 System.out.println("my username ");
 }
 @Test(dependsOnMethods= {"newtest"})//newtest war depend hoti manun ti skip zali karn newtest faild zali aHE
 public void password() {
	 System.out.println("the password ");
 }
 @Test(invocationCount=2)// no of time it will run
 public void loginbutton() {
	 System.out.println("to click button");
 }
 @Test(enabled=false)
 public void forgotPassword() {
	 System.out.println("my new password");
 }
 @Test(timeOut=1000)//time out dil kami ani sleep dil jast mnun faild hoil
 public void newtest() throws InterruptedException {
	 Thread.sleep(2000);
	 System.out.println("print new test");
 }
}
