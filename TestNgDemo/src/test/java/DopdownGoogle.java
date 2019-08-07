import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DopdownGoogle {
	
	WebDriver driver;
	WebDriverWait wai;
	Actions a;
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        List<WebElement> lis=	driver.findElements(By.xpath("//a[@class='a-link-normal aok-inline-block']"));
       String f="https://www.amazon.in/b?node=17384951031&pf_rd_p=bb602c40-efae-4d0b-8106-cb261bfdc7c3&pf_rd_r=ZT3FSW2FHBDE3NPQ2GHR";
        for(int i=0;i<lis.size();i++) {
        	WebElement ele=lis.get(i);
        	String name=ele.getAttribute("href");
        	System.out.println(name);
        	if(name.equals(f)) {
        		wai=new WebDriverWait(driver,30);
        		wai.until(ExpectedConditions.visibilityOf(ele));
        		a=new Actions(driver);
        		a.moveToElement(ele).build().perform();
        		ele.click();
        
        		
        	}
        	
        }
		
	
	}
	
	

}
