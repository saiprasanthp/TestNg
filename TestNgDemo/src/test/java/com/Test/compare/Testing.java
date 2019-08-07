package com.Test.compare;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing {
	@Test
	@Parameters({"username","password"})
	public void m1(String name,String pass ) {
		System.out.println(name);
		System.out.println(pass);
	}
}