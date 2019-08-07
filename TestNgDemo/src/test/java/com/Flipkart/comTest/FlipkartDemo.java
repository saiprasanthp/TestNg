package com.Flipkart.comTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FlipkartDemo {
	WebDriver driver;

	@BeforeTest
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String actual="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";

	}


	@Test
	public void flipkart() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement element=		driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dresses=driver.findElement(By.xpath("(//a[text()='Dresses'])[1]"));
		dresses.click();
		driver.navigate().back();
		WebElement Men=driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
		a.moveToElement(Men).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement tshirt=driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		tshirt.click();	
	}

	@AfterTest
	public void after() {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {

		}
		driver.quit();
	}

}
