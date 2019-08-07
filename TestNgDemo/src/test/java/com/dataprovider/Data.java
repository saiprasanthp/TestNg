package com.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider(name="sai")
	public String[][] m1() throws IOException {
		
		

		InputStream in=new FileInputStream("C:\\Users\\user\\Documents\\dataprovider.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheetAt(0);
		String[][] nn=new String[sheet.getLastRowNum()][2];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				String sane=row.getCell(j).getStringCellValue();
				nn[i][j]=sane;
		
		
		
	}
	

		}
		return nn;

}
}
