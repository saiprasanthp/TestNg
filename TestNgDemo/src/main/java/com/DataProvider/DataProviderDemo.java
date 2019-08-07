package com.DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	
	@DataProvider(name= "sai")
	public Object[][]  m1() {
		Object[][] j=new Object[2][1];
		j[0][0]="sai";
		j[1][0]="manu";
		return j; 
		
		
	}
	

}
