package snapdeal.com;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class_SnapDeal {
	public	WebDriver driver;
	String url;
	String browser;
	InputStream in;

	public Base_Class_SnapDeal() {

		Properties p=new Properties();

		try {
			in=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestNgDemo\\src\\main\\java\\snapdeal\\com\\snapdeal.properties");
			p.load(in);
			url=p.getProperty("url");
			browser=p.getProperty("browser");
			if(browser.equals("google")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
			}else {
				System.out.println("no browser output");
			}



		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
