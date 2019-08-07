package com.flipkart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	
	
	
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		  
		 
		 
		 
	}

}
