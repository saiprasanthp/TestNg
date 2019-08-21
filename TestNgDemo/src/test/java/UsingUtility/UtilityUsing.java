package UsingUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import utili.Utilies;

public class UtilityUsing extends Utilies{
	
	
	@Test
	public void m1() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		a=new Actions(driver);
		super.robo=new Robot();
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sai");
		//super.sec=new Select(e);
		driver.findElement(By.xpath("//div[@class='form-group']/label/following::textarea")).sendKeys("nnsxkkxmsmxsxm");
		a.moveToElement(driver.findElement(By.xpath("//input[@type='button']"))).click().build().perform();
		
		String name=driver.findElement(By.xpath("//div[text()='Form submited Successfully!']")).getText();
		Assert.assertEquals(name, "Form submited Successfully!");
		
		
	}

}
