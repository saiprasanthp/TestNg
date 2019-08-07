package com.brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinksDemo {
	static WebDriver driver;

	@Test
	public void m1() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
	Set<Cookie> j=	driver.manage().getCookies();
	Iterator<Cookie> it=j.iterator();
	while(it.hasNext()) {
		String n=it.next().toString();
		driver.manage().deleteCookieNamed(n);
	}
	System.out.println(j.size());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> listlink=	driver.findElements(By.tagName("a"));
		System.out.println(listlink.size());
		for(int i=0;i<listlink.size();i++) {
			WebElement link=listlink.get(i);
			String att=link.getAttribute("href");
			System.out.println(att);
			URL url=new URL(att);
			HttpURLConnection httpurlConection=(HttpURLConnection)url.openConnection();
			httpurlConection.connect();
			if(httpurlConection.getResponseCode()==200) {
				System.out.println("is 200"+httpurlConection.getResponseMessage());
			}else if(httpurlConection.getResponseCode()==httpurlConection.HTTP_NOT_FOUND) {
				System.out.println("HTTP_NOT_FOUND"+httpurlConection.getResponseMessage());
			}
		}
	}
}
 