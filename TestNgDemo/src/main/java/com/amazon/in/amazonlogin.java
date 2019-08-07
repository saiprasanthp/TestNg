package com.amazon.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.main.set.SetUp;

public class amazonlogin extends SetUp{
	
	@Test
	public void prime_Videos() {
		WebElement element=driver.findElement(By.xpath("(//a[@class='a-link-normal quadrant-overlay'])[5]"));
		element.click();
		
	}
	
	@AfterMethod
	public void cl() {
		driver.close();
	}
	
	
	
}
