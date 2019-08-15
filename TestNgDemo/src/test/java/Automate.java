import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Automate {

	WebDriver driver;
	@Test
	public void m1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele=	driver.findElement(By.xpath("//select[@id='tools']"));
		Select sec=new Select(ele);
		sec.selectByIndex(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a=driver.switchTo().alert();
		String name=a.getText();
		System.out.println(name);
		a.dismiss();

	}

}
