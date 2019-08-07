package com.DataProvider;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	
	@DataProvider(name="sai")
	public ArrayList<String> m1(){
		//String[] j=new String[100];
		ArrayList<String> al=new ArrayList<String>();

		try {
			InputStream in=new FileInputStream("C:\\Users\\user\\Documents\\Book1.xlsx");
			XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheetAt(0);
		for(int i=0;i<sheet.getLastRowNum();i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j1=0;j1<row.getLastCellNum();j1++) {
				String h=row.getCell(j1).getStringCellValue();
				//j[j1]=h;
				al.add(h);
				
			}
			
		}
		in.close();
		}
		catch(Exception e) {
			
		}
		return al;	
	}	
	@Test(dataProvider="sai") 
	public void m2(ArrayList<String> k) {
		System.out.println(k.get(0));
		System.out.println(k.get(1));
		
	}
	
	
	
	
	
	
	
	

}
