package com.amazon.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
	@Test
	public void m1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("indi");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List<WebElement> ele=driver.findElements(By.xpath("//li[@class='sbct']"));
	for(int i=0;i<ele.size();i++) {
		System.out.println(ele.get(i).getText());
	}
	
	
	
	}

}
