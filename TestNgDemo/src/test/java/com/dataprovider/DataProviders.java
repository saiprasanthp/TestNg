package com.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	Object[][] ll;


	@DataProvider(name="main")
	public Object[][] m1() throws IOException{
		ll=new Object[2][2];
		InputStream in=new FileInputStream("C:\\Users\\user\\Documents\\BookTest.xlsx");
		XSSFWorkbook k=new XSSFWorkbook(in);	
		XSSFSheet sheet=k.getSheet("Sheet1");
		for(int i=0;i<sheet.getLastRowNum();i++) {
			XSSFRow row=sheet.getRow(i);
			for(int l=0;l<row.getLastCellNum();l++) {
				String name=row.getCell(l).getStringCellValue();
				ll[i][l]=name;
			}
		}
		in.close();
		return ll;
	}
	@Test(dataProvider="main",priority=0)
	public void m2(String us1,String us2) {

		System.out.println(us1);
		System.out.println(us2);
	}
}