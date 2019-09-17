package com.model;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListenerTest implements ISuiteListener
{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart method  under SuiteListenertest");
		
	}

	@Override
	public void onFinish(ISuite suite) {
	System.out.println("onfinish method under suiteListenerTest");
		
	}

}
