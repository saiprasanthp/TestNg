import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Windows {
	WebDriver driver;

	@Test(priority=0)
	public void m1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String parent=driver.getWindowHandle();
		WebElement ele=driver.findElement(By.xpath("(//a[text()='Click Here'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).click().build().perform();
		Set<String> set1=driver.getWindowHandles();
		Iterator<String> al=	set1.iterator();
		while(al.hasNext()) {

			String name=al.next();
			if(!name.equals(parent)) {
				driver.switchTo().window(name);
				break;

			}
		}
		a.moveToElement(driver.findElement(By.xpath("//li[text()='Open New Window']"))).click().build().perform();
		driver.switchTo().window(parent);
		WebElement frm=	driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
		a.moveToElement(frm).click().build().perform();
		String h=	driver.getTitle();
		System.out.println(h);

	}

	@Test(priority=1)
	public void m2() {
		//driver.quit();
	}

}
