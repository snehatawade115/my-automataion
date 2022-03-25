package main5pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNG1 {
	@BeforeClass
	public void besforeClass() {
		System.out.println("beforemethod");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
		
	}

}
