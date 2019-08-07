package FlpkartDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartDemo {
	static WebDriver driver;
	@BeforeTest
	public void  setp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void checking_pae() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	@AfterTest
	public void end() {
		try {
		Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		driver.quit();
	}	
	
	
	

}
