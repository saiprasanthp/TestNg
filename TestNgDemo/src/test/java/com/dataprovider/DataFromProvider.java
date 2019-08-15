package com.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFromProvider {
	
	
	@DataProvider(name="sai")
	public String[][] m1() throws IOException {
		String[][] k=new String[2][4];
		FileInputStream in=new FileInputStream("C:\\Users\\user\\Documents\\datafinding.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(in);
		
		XSSFSheet sheet=book.getSheetAt(0);
		
		for(int i=0;i<sheet.getLastRowNum()+1;i++) {
			System.out.println(sheet.getLastRowNum());
			
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++) {
				
				String name=row.getCell(j).getStringCellValue();
				k[i][j]=name;	
			}
		}
		return k;
	}
	
	
	@Test(dataProvider="sai")
	public void m2(String name,String name1,String name2,String name3) {
		System.out.println(name+name1+name2+name3);
		
	}
}
