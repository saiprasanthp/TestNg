package com.windowsHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle {
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//button[text()='    click   ']"));
		ele.click();
		String parent=driver.getWindowHandle();
		Set<String> c=driver.getWindowHandles();
		Iterator<String> cc=c.iterator();
		while(cc.hasNext()) {
			String l=cc.next();
			if(!parent.equals(l)) {
				driver.switchTo().window(l);
				driver.findElement(By.xpath("(//a[text()='Contact'])[2]")).click();
				
			}
		}
		
	}

}