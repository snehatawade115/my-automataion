package automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng1 {
	@BeforeMethod
	public void userlogim()
	{
		System.out.println("userid");
	}
	
	@Test
	public void newtesting()
	{
		System.out.println("my test");
		
	}
	
	@Test
	public void testing123() 
	{
		System.out.println("new test ruuning");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("log out");
	}
	
	

}
