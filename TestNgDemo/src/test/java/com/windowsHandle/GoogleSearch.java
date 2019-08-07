package com.windowsHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleSearch {

	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("stri");
		List<WebElement> elem=driver.findElements(By.xpath("//div[@class='sbl1']"));
		WebDriverWait wai=new WebDriverWait(driver,30);
		wai.until(ExpectedConditions.visibilityOfAllElements(elem));
		for(int i=0;i<elem.size();i++)
				{
			WebElement el=elem.get(i);
			String name=el.getText();
			System.out.println(name);
			if(name.contains("strings in java")) {
				el.click();
			}
			
			
			
				}
	}
}
