package com.amazon.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_practise {
static WebDriver driver;
	
	@BeforeTest
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void m2() {
		WebElement element=driver.findElement(By.xpath("(//a[@class='a-link-normal quadrant-overlay'])[7]"));
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		element.click();
	}
	
}
