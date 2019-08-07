package com.TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.main.set.SetUp;

public class AmazonTest extends SetUp {
	
	@Test
	public void prime_Videos1() {
		driver.findElement(By.xpath("(//a[@class='a-link-normal quadrant-overlay'])[6]")).click();
			
	}
	@AfterTest
	public void cl1() {
		driver.close();
	}
}
