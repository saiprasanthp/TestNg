import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//frames
public class Frames {
	
	WebDriver driver;
	
	@Test(priority=0)
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\75versionchrome\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
List<WebElement> ele=driver.findElements(By.xpath("//table[@id='customers']//tr"));
for(int i=0;i<ele.size();i++) {
	
	String name=ele.get(i).getText();
	System.out.println(name);
	if(name.contains("UK")) {
		System.out.println("contains");
		break;
	}
}
	}
	@Test(priority=1)
	public void m2() {
		driver.quit();
		
	}

}
