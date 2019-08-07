package LinksBroken_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class IsDisplayedMethod {
	WebDriver driver;
	@Test
	public void m2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ele=		driver.findElement(By.xpath("//a[@class='nav-logo-link']"));
		if(ele.isDisplayed()) {
			System.out.println("displayed");
		}else {
			System.out.println("not");
		}
		Assert.assertTrue(ele.isDisplayed());
		
WebElement d=		driver.findElement(By.xpath("(//a[@class='a-link-normal quadrant-overlay'])[1]"));
Assert.assertTrue(d.isDisplayed());                                

	}
	
	@AfterMethod
	public void m3() {
		driver.quit();
	}

}
