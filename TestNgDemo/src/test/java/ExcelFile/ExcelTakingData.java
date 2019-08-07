package ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTakingData {
	
	
	@DataProvider(name="sai")
	public String[][] m1() throws IOException {
		String[][] k = null;
		InputStream in=new FileInputStream("C:\\Users\\user\\Documents\\TakingExcel.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(in);
		XSSFSheet sheet=book.getSheetAt(0);
		for(int i=1;i<sheet.getLastRowNum();i++) {
		XSSFRow row=	sheet.getRow(i);
		k=new String[sheet.getLastRowNum()][row.getLastCellNum()];
		for(int j=0;i<row.getLastCellNum();j++) {
			String s=row.getCell(j).getStringCellValue();
			k[i][j]=s;
			
		}
		} 
		return k;	
	}
	
	@Test(dataProvider="sai")
	public void m3(String h,String j,String a,String l) {
		System.out.println(h+j+a+l);
		
	}

}
