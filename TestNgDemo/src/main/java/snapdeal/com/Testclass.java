package snapdeal.com;

import org.testng.annotations.Test;

public class Testclass extends Base_Class_SnapDeal{
	
	
	
	@Test
	public void m1() {
		PageClass h=new PageClass(super.driver);
		h.click1();
		String webPage=h.covers();
		
	}
	
	
}
