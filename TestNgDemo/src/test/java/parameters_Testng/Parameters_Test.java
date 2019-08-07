package parameters_Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test {
	
	@Parameters({"name"})
	@Test
	public void m1(String name) {
		System.out.println(name);
	}
}