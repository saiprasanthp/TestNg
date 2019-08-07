package shopclues;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShopClues {
	
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//button[text()='Allow']"));
		element.click();
		try {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		
		}catch(Exception e) {
			
		}
		WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(search).build().perform();
		WebElement element1=driver.findElement(By.xpath("(//a[text()='Smartphones'])[1]"));
		a1.moveToElement(element1).build().perform();
		element1.click();
		try {
		Thread.sleep(3000);
		}catch(Exception e) {
			
		}
		driver.quit();
	}
}