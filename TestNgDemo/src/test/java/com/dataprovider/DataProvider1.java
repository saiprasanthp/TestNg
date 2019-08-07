package com.dataprovider;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	//@org.testng.annotations.DataProvider(name="some")
	@Test
	public void m1() {
		try {
		InputStream in =new FileInputStream("C:\\Users\\user\\Documents\\users.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheetAt(0);
		int j=sheet.getLastRowNum();
		System.out.println(j);
		XSSFRow row=sheet.getRow(0);
		int cell=row.getLastCellNum();
		System.out.println(cell); 
		in.close();
		
		}catch(Exception e) {
			
		}
		
	}
	
	/*@Test(dataProvider="some")
	public void m2() {
		
	}
*/
}
