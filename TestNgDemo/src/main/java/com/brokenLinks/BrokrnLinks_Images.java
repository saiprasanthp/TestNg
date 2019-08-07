package com.brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokrnLinks_Images {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		m1();
		ArrayList<WebElement> links=m2();
		for(int i=0;i<links.size();i++) {
			WebElement link=links.get(i);
			String url=link.getAttribute("href");
			
			URL url1=new URL(url);
			HttpURLConnection urlconnection=(HttpURLConnection)url1.openConnection();
			urlconnection.connect();
			if(urlconnection.getResponseCode()==200) {
				System.out.println(url+urlconnection.getResponseMessage());
			}
		}
		
	}
		public static void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
		public static ArrayList<WebElement> m2() {
			ArrayList<WebElement> linkal=new ArrayList<WebElement>();
			List<WebElement> links=driver.findElements(By.tagName("a"));
			for(int i=0;i<links.size();i++) {
				if(links.get(i)!=null) {
					linkal.add(links.get(i));
				}
			}
			return linkal;
			
			
		}
		
	}


