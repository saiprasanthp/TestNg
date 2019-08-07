package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CalenderDemo {
	public static WebDriver driver;
	public static Actions a;
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement ele=	driver.findElement(By.xpath("//span[text()='Log In']"));
	a=new Actions(driver);
	a.moveToElement(ele).click().build().perform();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai.p342@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8125900610");
	driver.findElement(By.xpath("//div[text()='Login']")).click();
WebElement elee=	driver.findElement(By.xpath("//span[text()='Calendar']"));
a.moveToElement(elee).click().build().perform();
List<WebElement> lis=driver.findElements(By.xpath("//div[@class='rbc-calendar']//div[@class='rbc-date-cell']/a"));
	for(int i=0;i<lis.size();i++) {
	String name=	lis.get(i).getText();
	System.out.println(name);
	}	
	
	}
}