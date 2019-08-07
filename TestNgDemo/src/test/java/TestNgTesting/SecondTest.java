package TestNgTesting;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void m2() {
		FirstTest j=new FirstTest();
		j.m1();
	}
}
