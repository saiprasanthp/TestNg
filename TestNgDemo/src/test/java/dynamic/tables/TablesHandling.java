package dynamic.tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TablesHandling {
	
	
	@Test 
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		WebElement table=driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		List<WebElement> lis=table.findElements(By.tagName("td"));
		for(int i=1;i<lis.size();i++) {
			String o=lis.get(i).getText(); 
			System.out.println(o);
		}
	}
}
