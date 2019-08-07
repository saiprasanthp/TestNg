package FreeCrm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import CrmFree.HomePage;

public class FreeCrmHomepageTest extends BaseClassTest{

	HomePage k;
	public 	FreeCrmHomepageTest(){
		super();
	}


	@Test
	public void test_click() {
		k=new HomePage(driver);
		k.click_signout();

	}

	@AfterMethod
	public void after() {
		driver.quit();
	}
}
