package com.amazon.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Apsrtc {
	WebDriver driver;
	Actions a;
	@Test(priority=0)
	public void mr() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.orangetravels.in/");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("//a[text()='Manage Booking']"));
		a=new Actions(driver);
		a.moveToElement(dd).build().perform();
		WebElement ff=driver.findElement(By.xpath("//a[text()='Branch Login']"));
		a.moveToElement(ff).build().perform();
		ff.click(); 
		
	}
	@Test(priority=1)
	public void m3() {
	WebElement element=	driver.findElement(By.xpath("//input[@type='submit']"));
	a.moveToElement(element).build().perform();
	element.click();
		
		
		
		
	}
}