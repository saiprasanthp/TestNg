package testng.com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestingPaytmSite {
	static WebDriver driver;
	@Test(priority=0)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1)
	public void clic_on_Events() {
		WebElement event_element=driver.findElement(By.xpath("//img[@alt='Events']"));
		event_element.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.switchTo().frame(0);
		WebElement input_box=driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(input_box));
		input_box.sendKeys("hyderabad");
	}
	//@Parameters("city")
/*	@Test(priority=2)
	public void input(String city1) {
	*/
		/*WebElement hyd=driver.findElement(By.xpath("//li[@title='Hyderabad']"));
		Actions a=new Actions(driver);
		a.moveToElement(hyd).build().perform();
		hyd.click();*/
		
		
		
		
		
		
		
		
		
		
		
	}


