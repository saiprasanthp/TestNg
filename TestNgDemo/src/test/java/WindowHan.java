import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHan {
	public static WebDriver driver;
	public static Actions a;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String name=	driver.getWindowHandle();
		//Set<String> al=	driver.getWindowHandles();

		a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[text()=' Click this link to start new Tab '])[1]"))).click().build().perform();
		Set<String> al=	driver.getWindowHandles();
		Iterator<String>  j=	al.iterator();
		while(j.hasNext()) {
			String child=	j.next();
			System.out.println(child);
			if(!child.equals(name)) {
				driver.switchTo().window(child);
				break;
				
			}

		}
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("sss");
		driver.switchTo().window(name);
		a.moveToElement(driver.findElement(By.xpath("(//a[text()=' Click this link to start new Tab '])[2]"))).click().build().perform();
		driver.switchTo().window(name);

	}
}
