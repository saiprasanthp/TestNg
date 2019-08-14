import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramesHandling {

	WebDriver driver;
	@Test(priority=0)
	public void m1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele=	driver.findElement(By.xpath("//div[@id='Single']/iframe"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		WebElement ele1=		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele1).click().build().perform();
	WebElement fra=	driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(fra);
	WebElement frame2=	driver.findElement(By.xpath("//div[@class='row']/iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='WebTable']"))).click().build().perform();
	}

	@Test(priority=1)
	public void m2() {
		driver.close();
	}

}
