import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameDummy {

	WebDriver driver;
	Actions a;
	@Test(priority=0)
	public void m1() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement swi=	driver.findElement(By.xpath("//li[text()='iFrame']"));
	a=new Actions(driver);
	a.moveToElement(swi).click().build().perform();
//WebElement fra=	driver.findElement(By.xpath("//div[@class='mailmunch-topbar mailmunch-topbar-16c8fa815ff10fb0']/iframe"));
	driver.switchTo().frame("globalSqa");
driver.switchTo().frame("mailmunch-topbar-iframe mailmunch-topbar-iframe-16c8fa81cdc12250");
//driver.findElement(By.xpath("//span[text()='Trainings']")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ssssss");

//google_shimpl

//iframe[@name='globalSqa']

//globalSqa
//mailmunch-topbar-iframe mailmunch-topbar-iframe-16c8fa81cdc12250
	
	}
	@Test(priority=1)
	public void m2() {
		
		driver.quit();
	}
}