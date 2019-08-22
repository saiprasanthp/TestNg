package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	public static WebDriver driver;
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement>  datatable=	driver.findElements(By.xpath("//table[@id='task-table']//tr"));
		for(int i=0;i<datatable.size();i++) {
			
		WebElement ele=	datatable.get(i);
	String name=	ele.getText();
	System.out.println(name);
			
		}



	}

}
