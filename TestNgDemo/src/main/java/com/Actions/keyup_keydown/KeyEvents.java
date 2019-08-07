package com.Actions.keyup_keydown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KeyEvents {
	
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		JavascriptExecutor java=(JavascriptExecutor)driver;
		//java.executeScript("window.scrollBy(0,1000)");
		
		//a.keyDown(Keys.ARROW_DOWN).build().perform();
		//a.sendKeys(Keys.PAGE_DOWN).build().perform();
		//a.keyDown(Keys.ARROW_DOWN).build().perform();
		WebElement element=driver.findElement(By.xpath("//img[@alt='HuaweiP30Lite']"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		//element.click();
		
		
		
		
	}

}
