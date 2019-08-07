package TestCase1;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCa {
	static WebDriver driver;

	@DataProvider(name="sai")
	public Object[][] m1() {
		Object[][] j=new Object[2][];
		try {
		InputStream in=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestNgDemo\\src\\test\\resources\\resource\\registration.xlsx");
		XSSFWorkbook work=new XSSFWorkbook(in);
		XSSFSheet sheet=work.getSheetAt(0);
		int row=sheet.getLastRowNum();
		XSSFRow row1=sheet.getRow(0);
	short i	=row1.getLastCellNum();
	for(int k=0;k<row;k++) {
		for(int d=0;d<i;d++) {
			String name=sheet.getRow(k).getCell(d).getStringCellValue();
			j[k][d]=name;
		}
		
	}
		
		}catch(Exception e) {
			
		}
		
		
		return j;
		
		
	}
	
	
	
	@Test(dataProvider="sai")
	public void m2(String name,String name2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		element.sendKeys(name);
		WebElement element1=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		element1.sendKeys(name2);
	}

}
