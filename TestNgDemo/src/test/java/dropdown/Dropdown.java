package dropdown;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dropdown {
	Logger log;
	
	@Test
	public void m1() {
		log=Logger.getLogger(Dropdown.class);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
     	log.info("url is launched");
	WebElement date=driver.findElement(By.xpath("(//button[@type='button' and @class='ui-datepicker-trigger'])[1]"));
	Actions a=new Actions(driver);
	a.moveToElement(date).click().perform();
	log.info("element is clicked");
	WebElement jet=driver.findElement(By.xpath("(//a[text()='19'])[1]"));
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(jet));
	jet.click();
	log.info("jet is clicked");
}
}