package ExtendingReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReports {
	
	WebDriver driver;
	ExtentReports logger;
	@Test
	public void verification() {
		logger=ExtentReports.get(ExtendReports.class);
		logger.init("C:\\Users\\user\\Pictures\\Saved Pictures\\test.html", true);
		logger.startTest("verification");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		logger.log(LogStatus.INFO, "application is in running");
		String title=driver.getTitle();
		String title1="sai";
		Assert.assertEquals(title, title1);
		logger.log(LogStatus.PASS, "verified");

	}
	
	@AfterMethod
	public void afteer(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\user\\Pictures\\Saved Pictures\\fail.png"));
			logger.log(LogStatus.FAIL, "failed testcase");
			logger.endTest();
			
		}
	}

}
