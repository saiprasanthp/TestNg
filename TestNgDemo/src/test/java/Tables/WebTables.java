package Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables {
	
	@Test
	public void m1() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/bus-tickets/");
		driver.findElement(By.xpath("//input[@type='text' and @id='txtOnwardCalendar']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> ll=driver.findElements(By.xpath("(//div[@id='rb-calmiddle'])[1]//ul[@class='rb-calendar-days']/li"));
		for(int i=0;i<ll.size();i++) {
			String date=ll.get(i).getText();
			System.out.println(date);
		}
		List<WebElement> m=driver.findElements(By.xpath("//ul[@class='rb-calendar-weekdays']/li"));
		for(int i=0;i<m.size();i++) {
			String days=m.get(i).getText();
			System.out.println(days);
		}
	}

}
