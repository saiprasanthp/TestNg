import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHanle {
	public static WebDriver driver;
	public static Actions a;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String parent=driver.getWindowHandle();
System.out.println(parent);
Set<String> al=	driver.getWindowHandles();

		a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//div[@class='wpb_wrapper'])[3]//p[5]/button"))).click().build().perform();
	//	Set<String> al=	driver.getWindowHandles();
		Iterator<String> att=	al.iterator();
		while(att.hasNext()) {
			String child=att.next();
			System.out.println(child);

			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				break;
			}
		}
		a.moveToElement(driver.findElement(By.xpath("(//span[text()='Selenium Training'])[1]"))).click().build().perform();
		driver.switchTo().window(parent);
		a.moveToElement(driver.findElement(By.xpath("//button[text()='New Message Window']"))).click().build().perform();

	}

}
