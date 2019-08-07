package com.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase {
	@DataProvider(name="sai")
	public Object[][]  m1() {
		Object[][] j=new Object[1][1];
		j[0][0]="sai";
		return j;	
		
	}
	
	@Test(dataProvider="sai")
	public void m2(String name) {
		System.out.println(name);
		
	}
	

}
