package com.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameters {
	
	@Parameters({"firstname","secondname"})
	@Test
	public void m1(String name,String name2) {
		System.out.println(name);
		System.out.println(name2);
	}

}
