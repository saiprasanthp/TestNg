package LinksBroken_all;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Broken_all {
	WebDriver driver;
	int counter=0;
	@Test
	public void m2() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.uvdesk.com/");
		List<WebElement> lis=	driver.findElements(By.tagName("a"));
		System.out.println(lis.size());
		for(int i=0;i<lis.size();i++) {

			WebElement ele=lis.get(i);
			String name=	ele.getAttribute("href");
			if(name.equals("null")) {
				counter++;
			}else {
			m1(name);
			}
		}


	}
	public  void m1(String name) throws IOException {
		URL url=new URL(name);
		HttpURLConnection htp=(HttpURLConnection)url.openConnection();
		htp.connect();
		if(htp.getResponseCode()==200) {
			System.out.println(name+"good link");
		}else if(htp.getResponseCode()==404) {
			System.out.println(name+"it is broken link");
		}


	}
	@AfterMethod
	public void c() {
		driver.close();
	}


}
