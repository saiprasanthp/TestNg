package ExtendingReports;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;




public class ExtendingReportsDemo {
	
	
	@Test
	public void verifying_Title() throws AWTException {
		ExtentReports logger=ExtentReports.get(ExtendingReportsDemo.class);
		logger.init("C:\\Users\\user\\Pictures\\screenshot\\advancereport.html", true);
		logger.startTest("verification pagetitle");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.log(LogStatus.INFO, "browser running");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ESCAPE);
		robo.keyRelease(KeyEvent.VK_ESCAPE);
		logger.log(LogStatus.INFO, "Application is running");
		String title=driver.getTitle();
		String title1="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(title, title1);
		logger.attachScreenshot("C:\\Users\\user\\Pictures\\screenshot\\google.jpg");
		logger.endTest();
		
 
	}

}
