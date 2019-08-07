package dynamic.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTables {
	
	@Test
	public void m1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		WebElement element=driver.findElement(By.xpath("(//div[@class='ui-grid-cell-contents ui-grid-header-cell-primary-focus'])[1]"));
		element.click();
	}

}
