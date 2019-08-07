package com.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Testng.TestngPractise;

public class MyListeners extends TestngPractise implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
	File f=	((TakesScreenshot)super.driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(f,new File( "C:\\Users\\user\\Pictures\\screenshot\\pass.jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
