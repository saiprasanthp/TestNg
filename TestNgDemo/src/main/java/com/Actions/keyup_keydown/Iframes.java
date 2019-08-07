package com.Actions.keyup_keydown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Iframes {
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='IF1']")));
		WebElement element=driver.findElement(By.xpath("(//span[text()='Online Training'])[1]"));
		element.click();
		driver.switchTo().defaultContent();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@id='IF2']"))));
		WebElement element1=driver.findElement(By.xpath("//a[text()='Draggable']"));
		Actions a=new Actions(driver);
		a.moveToElement(element1).build().perform();
		element1.click();
	}

}
