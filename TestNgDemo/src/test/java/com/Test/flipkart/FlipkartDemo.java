package com.Test.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartDemo {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test
	public void user_details() {
		WebElement element=driver.findElement(By.xpath("(//a[@class='a-link-normal quadrant-overlay'])[1]"));
		element.click();
		JavascriptExecutor h=(JavascriptExecutor)driver;
		h.executeScript("window.scrollBy(0,450)");
		WebElement element1=driver.findElement(By.xpath("(//div[@class='bb-s-item-overlay'])[3]"));
		element1.click();
	}
	@AfterTest
	public void cl() {
		driver.quit();
	}
}
