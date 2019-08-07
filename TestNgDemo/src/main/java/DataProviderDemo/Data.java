package DataProviderDemo;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data {
	
	
	@DataProvider(name="sai")
	public Object[][] m1() {
		Object[][] j=new Object[2][];
		try {
		InputStream in=new FileInputStream("C:\\Users\\user\\Documents\\registration.xlsx");
		XSSFWorkbook work=new XSSFWorkbook(in);
		XSSFSheet sheet=work.getSheetAt(0);
		int row=sheet.getLastRowNum();
		XSSFRow row1=sheet.getRow(0);
	short i	=row1.getLastCellNum();
	for(int k=0;k<row;k++) {
		for(int d=0;d<i;d++) {
			String name=sheet.getRow(k).getCell(d).getStringCellValue();
			j[k][d]=name;
		}
		
	}
		
		}catch(Exception e) {
			
		}
		
		
		return j;
		
		
	}

}
