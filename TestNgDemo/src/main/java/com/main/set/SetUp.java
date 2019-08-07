package com.main.set;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class SetUp {
	public static WebDriver driver;
	public static Properties pro;
	@BeforeMethod
		public void setUp()  {
			try {
				pro=new Properties();
			InputStream it=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\PomFramework\\src\\main\\java\\com\\fileproperties\\file.properties");
			pro.load(it);
			}catch(Exception e) {
				
			}
			String browser=pro.getProperty("browser");
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}else if(browser.equals("firefox")){
				System.setProperty("weddriver.gecko.driver", "c:");
				driver=new FirefoxDriver();
				
			}
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
	}
}
