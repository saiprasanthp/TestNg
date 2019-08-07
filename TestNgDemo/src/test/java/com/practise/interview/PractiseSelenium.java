package com.practise.interview;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PractiseSelenium {
	
	
	Properties pro;
	InputStream in;
	String browser;
	String url;
	WebDriver driver;
	Actions a;
	@BeforeSuite
	public void intialize() throws IOException {
		pro=new Properties();
		in=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestNgDemo\\src\\test\\resources\\url.properties");
		pro.load(in);
		 browser=pro.getProperty("browser");
		 url=pro.getProperty("url");
		 
		 if(browser.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
			 driver=new ChromeDriver();
			 
		 }else if(browser.equals("firefox")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
			 driver=new FirefoxDriver();
			 
			 
		 }
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get(url);
		
	}
	
	@Test(priority=0)
	public void source() {
		WebElement hotel=driver.findElement(By.xpath("//a[@title='Hotels']"));
		 a=new Actions(driver);
		a.moveToElement(hotel).build().perform();
		hotel.click();
		
	}
	@Test(priority=1)
	public void operation() {
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txtOriginStation1_MST']"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(inputbox));
		a.moveToElement(inputbox).build().perform();
		inputbox.click();
		inputbox.sendKeys("hyderabad");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> lis=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		System.out.println(lis.size());
	Iterator<WebElement> it=lis.iterator();
	while(it.hasNext()) {
		WebElement j=it.next();
		String ss=j.getText();
		System.out.println(ss);
		if(ss.equalsIgnoreCase("hyderabad")) {
			a.moveToElement(j).build().perform();
			j.click();
		}
	}
	}
	@Test(priority=2)
	public void doit() {
		WebElement element1=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[7]"));
		element1.click();
		List<WebElement> ch=driver.findElements(By.xpath("//span[@class='ui-state-default']"));
		System.out.println(ch.size());
		for(int i=0;i<ch.size();i++) {
			System.out.println(ch.get(i).getText());
		}
	}
	@AfterTest
	public void cls() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}