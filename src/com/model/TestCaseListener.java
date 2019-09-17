package com.model;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class TestCaseListener implements ITestListener
{
	

	@Override
	public void onTestStart(ITestResult result)
	{
			System.out.println("in onteststart under TestCaseListener ");	
			String onteststrt=result.getName();
			System.out.println("on test start name: "+onteststrt);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("OntestSuccess under testcaselistener");
		String testnmpass=result.getName();
		System.err.println("on test success means PASS "+testnmpass);
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("in ontestfailure under testcaselistner ");
		String testfailnm=result.getName();
		System.out.println("fail test name :"+testfailnm);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("In OntestSkipped under TestcaseListener");
		String testskipped=result.getName();
		System.out.println("test are skipped: "+testskipped);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("In onTestFailedButWithinSuccessPercentage under  testcaselistner");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("in onstart method under TestCaseListener ");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onfinish under TestCaseListener");
		
	}

	
}
