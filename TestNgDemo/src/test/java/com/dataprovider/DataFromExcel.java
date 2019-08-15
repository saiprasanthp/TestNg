package com.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFromExcel {
	
	
	@DataProvider(name="sai")
	public String[][] m1() throws IOException {
		
		String[][] s=new String[2][1];
		FileInputStream in=new FileInputStream("C:\\Users\\user\\Documents\\dataprovideTesting.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheetAt(0);
		for(int i=0;i<sheet.getLastRowNum()+1;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum()-1;j++) {
				System.out.println(row.getLastCellNum());
				String name=row.getCell(j).getStringCellValue();
				s[i][j]=name;
			}
		}
		in.close();
		return s;
	}
	@Test(dataProvider="sai")
	public void m2(String name) {
		System.out.println(name);
	}
}



