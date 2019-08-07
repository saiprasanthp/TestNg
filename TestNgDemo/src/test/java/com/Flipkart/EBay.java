package com.Flipkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EBay {


	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		List<WebElement> ele=driver.findElements(By.xpath("//li[@class='carousel__snap-point hl-carousel__item']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		for(int i=0;i<ele.size();i++) {
			WebElement ar=ele.get(i);
			Actions a=new Actions(driver);
			a.moveToElement(ar).click().build().perform();
			driver.navigate().back();
		}
	}
}