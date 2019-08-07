package com.GoogleList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleList {
	
	Logger log;
	WebDriver driver;
	
	@Test
	public void google() {
		log=Logger.getLogger(GoogleList.class);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		log.info("url is launched");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		log.info("screen maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("g");
		log.info("sendkeys done");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List<WebElement> searchbox=	driver.findElements(By.xpath("//div[@class='sbtc']//div//span/b"));
	for(int i=0;i<searchbox.size();i++) {
		String names=searchbox.get(i).getText();
		System.out.println(names);
		log.info("for loop reading");
		if(names.contains("morning")) {
			WebElement j=searchbox.get(i);
			j.click();
			log.info("element is clicked");
			break;
		}
	}
	links();
	}
	
	public void links() {
		log.info("Entered into the method");
		List<WebElement> links=driver.findElements(By.xpath("//h3[@class='LC20lb']"));
		for(int i=0;i<links.size();i++) {
		String name=links.get(i).getText();
		System.out.println(name);
		if(name.contains("Quotes Pictures")) {
			links.get(i).click();
			break;
		}
		}	
	}

}
