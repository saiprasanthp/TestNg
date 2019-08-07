package com.GoogleList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flights {
	WebDriver driver;
	WebDriverWait wait;
	@Test
	public void flight_recover() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/flights?lite=0#flt=HYD..2019-08-06*.HYD.2019-08-10;c:INR;e:1;a:SG*SG;sd:1;t:h");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("(//div[@role='presentation'])[1]"));
		ele.click();
		WebElement ele1=driver.findElement(By.xpath("//input[@type='text']"));
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(ele1)).clear();
		ele1.sendKeys("hy");
		List<WebElement> ll=driver.findElements(By.xpath("//div[@class='fsapp-location']"));
		for(int i=0;i<ll.size();i++) {
			String name=ll.get(i).getText();
			System.out.println(name);
			if(name.contains("Houston")) {
				ll.get(i).click();
				break;
			}
		}
		another_Flight();

	}
	public void another_Flight() {
		WebElement elemen=	driver.findElement(By.xpath("( //div[@data-flt-ve='destination_airport'])[8]"));
		elemen.click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("ba");
		List<WebElement> kk=driver.findElements(By.xpath("//span[@class='fsapp-option-city-name']"));
		for(int i=0;i<kk.size();i++) {
			String to=kk.get(i).getText();
			System.out.println(to);
		}
	}
}
