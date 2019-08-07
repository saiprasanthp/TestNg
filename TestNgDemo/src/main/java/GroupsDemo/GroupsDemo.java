package GroupsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsDemo {
	
	static WebDriver driver=null;
	@BeforeTest(groups= {"Regression"})
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.alibaba.com/?spm=a2700.7735675.scGlobalHomeHeader.6.feGni8");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test(groups= {"sai","Regression"})
	public void m2() {
		WebElement element=driver.findElement(By.xpath("(//a[@class='category-item util-ellipsis'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		element.click();
	}
	
	@Test(groups= {"sai"})
	public void m3() {
		System.out.println("haiii");
	}
}
