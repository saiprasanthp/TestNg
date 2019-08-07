import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestExcecution extends Excution {
	WebDriver driver;
	Actions act;
	@Test(priority=0)
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.freejobalert.com/ap-government-jobs/");
		driver.manage().window().maximize();
		for(int i=1;i<=30;i++) {
		WebElement element=driver.findElement(By.xpath("(//div[starts-with(@id,'tabs')]//li//a//span)[i]"));
		m2(element);
		}
		super.m3();
		System.out.println("m1");
	}
	public void m2(WebElement name) {
		act=new Actions(driver);
		act.moveToElement(name).click().build().perform();
	}
}