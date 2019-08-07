package ApJobsDetails;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ApJobs {
	
	ArrayList<String> al;
	Actions act;
	WebDriver driver;
	

	@Test
	public void job_Details() {
		al=new ArrayList<String>();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.freejobalert.com/ap-government-jobs/");
		driver.manage().window().maximize();
		for(int i=1;i<=30;i++) {
	WebElement state=driver.findElement(By.xpath("(//div[starts-with(@id,'tabs')]//li//a)[i]"));
	m1(state);
	
	
		}
		
}


	public void m1(WebElement state) {
		act=new Actions(driver);
		act.moveToElement(state).click().build().perform();
		driver.navigate().back();
		
	}
}