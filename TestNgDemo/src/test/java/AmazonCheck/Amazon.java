package AmazonCheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon {
	
	
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> kk=driver.findElements(By.xpath("//a[@class='a-link-normal aok-inline-block']"));
		for(int i=0;i<kk.size();i++) {
			WebElement ele=kk.get(i);
			String name=ele.getAttribute("href");
			System.out.println(name);
			if(name.equalsIgnoreCase(name)) 
			{
				WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOf(ele));
				Actions a=new Actions(driver);
				a.moveToElement(ele).click().build().perform();
				break;
			}
		}
		
		
		
	}

}
