package com.dependsonmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethodDemo {
	
	
	@Test(invocationCount=2)
	public void m1() {
		
		Assert.assertEquals("sai", "h");
		
		
	}
	
	@Test(dependsOnMethods="m1")
	public void m2() {
		System.out.println("hai");
		
	}
}
