package mytra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mytra {
	
	/*WebDriver driver;
	Actions act;
	@BeforeSuite
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	*/
	/*@Test(enabled=false)
	public void m2() {
		
	WebElement element=	driver.findElement(By.xpath("//a[@href='/revp-flat50']/div/img"));
	act=new Actions(driver);
	act.moveToElement(element).build().perform();
	element.click();
	
	
		
	}*/
	
	@Parameters({"username","password"})
	@Test()
	public void m3(String user,String pwd) {
		System.out.println(user);
		System.out.println(pwd);
		
	

}
	@Test
	public void m4() {
		System.out.println("ma");
	}
	
	
	
	
	
	
	
	
	
	@Test(groups= {"sai"})
	public void m5() {
		
	}
	
	
	@AfterMethod
	public void te(ITestResult result) {
		
		
		if(ITestResult.FAILURE==result.FAILURE) {
			  
		}
		
	}
}
