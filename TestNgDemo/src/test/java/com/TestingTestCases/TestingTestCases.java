package com.TestingTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingTestCases {
	static WebDriver driver;
	@Test(priority=0)
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		
	}
	@Parameters({"sai","vijay"})
	@Test(priority=1)
	public void a2(String name,String name2) {
		WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		element.sendKeys("sai");
	}
}
