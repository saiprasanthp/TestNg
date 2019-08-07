package com.flipkart1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class FlipkartAutomation {
	
	@Test
	public void m1() throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Robot robo=new Robot();
		 robo.keyPress(KeyEvent.VK_ESCAPE);
		 robo.keyRelease(KeyEvent.VK_ESCAPE);
		List<WebElement> element= driver.findElements(By.xpath("//img[@class='_2VeolH _3I5S6S']"));
		for(int i=0;i<element.size();i++) {
			WebElement jj=element.get(i);
			String name=element.get(i).getAttribute("src");
			System.out.println(name);
			if(name.equalsIgnoreCase("https://rukminim1.flixcart.com/flap/50/50/image/f19adfd1fe477729.jpg?q=50")) {
				WebDriverWait wait=new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOf(jj));
				jj.click();
				break;
			}
		}
	}
} 