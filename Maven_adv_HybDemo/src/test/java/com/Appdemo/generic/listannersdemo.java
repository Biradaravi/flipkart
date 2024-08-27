package com.Appdemo.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listannersdemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
      System.out.println("The test case is started"+result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	      System.out.println("The test case is fail"+result.getName());		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
	      System.out.println("The test case is skipped"+result.getName());		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
