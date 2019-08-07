package com.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//testng practise

public class TestngPractise {
	public static WebDriver driver;
	@BeforeMethod
	public void m2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}

	@Test
	public void m1() {
		WebElement element=	driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 =driver.findElement(By.xpath("//a[text()='Samsung']"));
		element1.click();






	}
	@AfterMethod
	public void m3() {
	try{
		Thread.sleep(3000);
	}catch(Exception e) {
		
	}
	driver.quit();

	}




}
