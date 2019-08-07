package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TablesW3Schools {
	
	@Test
	public void m1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
List<WebElement> kk	=driver.findElements(By.xpath("//table[@id='customers']//tr"));
for(int i=0;i<kk.size();i++) {
	String s=kk.get(i).getText();
	if(s.contains("Contact")) {
		List<WebElement> k=driver.findElements(By.tagName("td"));
		for(int j=0;j<k.size();j++) {
			String l=k.get(j).getText();
			System.out.println(l);
		}
	}
}
	
	
	}
	

}
