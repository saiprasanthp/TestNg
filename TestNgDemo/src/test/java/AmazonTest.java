import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AmazonTest {


	public static WebDriver driver=null;
	public static Actions a;
	@Test
	public void m1() throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		execute.executeScript("window.scrollBy(0,650)");
		//execute.executeScript("arguments[0].click();",WebElement1);
		//execute.executeScript(document.)
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
		
		WebElement ele=	driver.findElement(By.xpath("//n[@class='feed-carousel-control feed-left feed-control-disabled']"));
		a=new Actions(driver);
		a.moveToElement(ele).click().build().perform();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='feed-carousel-control feed-right']"))));
		a.moveToElement(driver.findElement(By.xpath("//a[@class='feed-carousel-control feed-right']"))).click().build().perform();	
	}
	
	@AfterMethod
	public void m3(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.FAILURE) {
			
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\user\\git\\TestNg\\TestNgDemo\\target\\screenshots\\shot.html"+result.getMethod().getMethodName()));
			System.out.println(result.getMethod().getMethodName());
		}
		
	}

	@AfterTest
	public void m2() throws InterruptedException {
		Thread.sleep(3000);  
		driver.quit();
	}

}
