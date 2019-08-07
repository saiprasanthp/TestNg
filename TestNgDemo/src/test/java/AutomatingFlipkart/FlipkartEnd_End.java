package AutomatingFlipkart;
//Identify the test-scenarios, create modules as 1. Login 2. Selection of cart
//3. Adding items to card 4. Checkout for payment option 5. Delivery options
//6. Address verification 7. Logout.

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;


public class FlipkartEnd_End {
	WebDriver driver;
	ExtentReports report;
	Actions act;
	WebDriverWait wait;
	@BeforeSuite
	public void init() {
		
		report=ExtentReports.get(FlipkartEnd_End.class);
		report.init("C:\\Users\\user\\Pictures\\Saved Pictures\\flipkart_end.html", true);
		report.startTest("end_end");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		report.log(LogStatus.INFO, "url verified");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	
	@Test(priority=0)
	public void mobile() {
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//p[text()='Mobiles & Tablets']"))).build().perform();
		driver.findElement(By.xpath("//p[text()='Mobiles & Tablets']")).click();
	}
	
	
	@Test(priority=1)
	public void next() {
		WebElement redmi =driver.findElement(By.xpath("//img[@alt='Realme 3' and @class='_2VeolH _3I5S6S']"));
		 act.moveToElement(redmi).build().perform();
		 redmi.click();
		 report.log(LogStatus.INFO, "looking for mobile");
		 
	}
	
	@Test(priority=2)
	public void select() {
		WebElement phone=driver.findElement(By.xpath("//div[text()='Realme 3 (Dynamic Black, 32 GB)']"));
		act.moveToElement(phone).build().perform();
		phone.click();
		report.log(LogStatus.INFO, "clicking on link");
		report.endTest();
	}
	
	@Test(priority=3)
	public void next1() {
		String parent=driver.getWindowHandle();
		Set<String> ss=driver.getWindowHandles();
		Iterator<String> it=ss.iterator();
		while(it.hasNext()) {
			String child=it.next();
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				report.log(LogStatus.INFO, "moved to child");
				
			}
		}
		WebElement pin=driver.findElement(By.xpath("//input[@id='pincodeInputId' and @type='text']"));
		pin.clear();
		pin.sendKeys("524314");
		pin.submit();
		driver.findElement(By.xpath("//span[text()='Change']")).click();
		WebElement add_cart=driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(add_cart)).click();
		WebElement save=driver.findElement(By.xpath("//div[text()='Save for later']"));
		act.moveToElement(save).click().build().perform();
		report.endTest();	
	}
}