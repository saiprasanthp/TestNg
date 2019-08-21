package Writingoutput;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WritingOutput {
	
	public static FileOutputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	
	@Test
	public void m1() {
		System.out.println("hai");
		
		int[] a= {10,20,30,40};
		int temp;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			}
		}
		for(int m:a) {
			System.out.println(m);
		}
	}
	
	
	
	@AfterMethod
	public void m2(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.FAILURE) {
			
			fi= new FileOutputStream("C:\\Users\\user\\Documents\\TakingExcel..xlsx",true);
			wb=new XSSFWorkbook();
			wb.write(fi);
			 sheet=wb.getSheetAt(0);
			 sheet.getRow(0).createCell(5).setCellValue("fail");
			
			
			
			
			
			
		}else {
			 sheet.getRow(0).createCell(4).setCellValue("pass");
		}
		
	}

}
