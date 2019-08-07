package com.brokenLinks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksNaveenSelenium {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ArrayList<WebElement> al=new ArrayList<WebElement>();
		List<WebElement> element=driver.findElements(By.tagName("a"));
		for(int i=0;i<element.size();i++) {
			if(element.get(i).getAttribute("href")!=null && (!element.get(i).getAttribute("href").contains("javascript"))) {
				al.add(element.get(i));
			}
		}
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).getText());
		}
		



	}

}
