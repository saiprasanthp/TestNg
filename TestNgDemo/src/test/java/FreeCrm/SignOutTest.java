package FreeCrm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CrmFree.HomePage;
import CrmFree.SignOut;

public class SignOutTest extends BaseClassTest{

	public FreeCrmHomepageTest m;
	public SignOut l;
	public HomePage s;
	public SignOutTest(){
		super();
	}
	@BeforeMethod
	public void home_page() {
		s=new HomePage(driver);
		s.click_signout();
	}
	@Test
	public void enter() {
		l=new SignOut(driver);
		l.use();
	}
	@AfterMethod
	public void m3() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
