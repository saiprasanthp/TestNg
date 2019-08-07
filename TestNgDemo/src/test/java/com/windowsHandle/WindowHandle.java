package com.windowsHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {


	@Test
	public void m1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String s=driver.getWindowHandle();
		System.out.println(s);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		Set<String> win=driver.getWindowHandles(); 
		Iterator<String> al	=win.iterator();
		while(al.hasNext()) {
			driver.switchTo().window(al.next());
			String title=driver.getTitle();
			System.out.println(title);
		}
		driver.switchTo().window(s);
		String child=driver.getTitle();
		System.out.println(child); 
	}
}
