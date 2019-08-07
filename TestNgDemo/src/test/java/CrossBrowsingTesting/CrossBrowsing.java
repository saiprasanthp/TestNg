package CrossBrowsingTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {
	
	
	WebDriver driver;
	@Test(priority=0)
	@Parameters("browser")
	public void cross(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
			 driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");

		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.flipkart.com/");

		}
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=1)
	public void m2() {
		driver.quit();
	}

}
