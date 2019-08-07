package com.Test.Metro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MetroTesting {
	WebDriver driver;
	Select sel;
	Actions a;
	WebDriverWait wit;
	@Test(priority=0)
	public void metro() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		  driver=new ChromeDriver();
		 driver.get("https://www.ltmetro.com/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();

	}
	@Test(priority=1)
	public void metro1() {
	WebElement cli=	driver.findElement(By.xpath("//select[@id='from-st-name']"));
	 sel=new Select(cli);
	sel.selectByVisibleText("ESI");
		
		
	}
	
	@Test(priority=2)
	public void metro2() {
		WebElement last=driver.findElement(By.xpath("//select[@id='to-st-name']"));
		 sel=new Select(last);
		sel.selectByVisibleText("JNTU");
		
		
	}
	
	@Test(priority=3)
	public void metro3() {
		WebElement butt=driver.findElement(By.xpath("//input[@class='get_details']"));
		butt.click();
	}
	
	@Test(priority=4)
	public void metro4() {
		WebElement tab=driver.findElement(By.xpath("//table[@class='find_trip_fare_table']"));
		 wit=new WebDriverWait(driver,30);
		wit.until(ExpectedConditions.visibilityOf(tab));
		List<WebElement> ele=tab.findElements(By.tagName("td"));
		for(int i=0;i<ele.size();i++) {
			String lists=ele.get(i).getText();
			System.out.println(lists);
		}
		
	driver.findElement(By.xpath("(//button[@type='button' and @class='btn btn-default' and @data-dismiss='modal'])[last()]")).click();
	}
	@Test(priority=5)
	public void metro5() {
		WebElement move=driver.findElement(By.xpath("//a[text()='About Us']"));
		 a=new Actions(driver);
		a.moveToElement(move).build().perform();
		WebElement about=driver.findElement(By.xpath("(//a[text()='About HMR'])[1]"));
		 wit=new WebDriverWait(driver,30);
		wit.until(ExpectedConditions.visibilityOf(about));
		about.click();
	}
}
