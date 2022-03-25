package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{
	public void OnTestStart(ITestResult Result)  
	{
		System.out.println("Test is staerted"+Result.getName());
	}
	
	public void onTestSucess(ITestResult Result) 
	{
		System.out.println("test is running"+Result.getName());
	}
	
	public void onTestFailure(ITestResult Result) {
		System.out.println("test id Failure"+Result.getName());
	}

}
