package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenShot {
	
	
	static WebDriver driver;
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@id='hhh']")).click();
		
	}
	@AfterMethod
	public void m2(ITestResult result) throws IOException {   
		
		if(ITestResult.FAILURE==result.getStatus()) {
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\user\\Pictures\\screenshot\\fail.jpg"));
		}
	}
}
