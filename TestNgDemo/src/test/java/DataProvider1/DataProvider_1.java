package DataProvider1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 {
	
	@DataProvider(name="data")
	public String[][] data() {
		String[][] str=new String[2][2];
		str[0][0]="sai1";
		str[0][1]="sai2";
		str[1][0]="sai3";
		str[1][1]="sai4";
		return str;
	}
	@Test(dataProvider="data")
	public void m2(String name,String name1) {
		System.out.println(name);
		System.out.println(name1);
	}
	@Test(dependsOnMethods="m2")
	public void m1() {
		System.out.println("m");
		
		
	}
}
