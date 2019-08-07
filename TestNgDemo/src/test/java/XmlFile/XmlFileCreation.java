package XmlFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlFileCreation {
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void m1(String name) {
		
		if(name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		}else if(name.equalsIgnoreCase("firefox")){
			System.out.println("firefox");
			
		}
	}

}
