package ExcelFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingExcel {
	
	
	@Test
	public void m1() throws IOException {
		OutputStream out=new FileOutputStream("C:\\Users\\user\\Documents\\writing1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		book.write(out);
	XSSFSheet sheet=book.getSheetAt(0);
XSSFRow row=	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("sai");
	sheet.getRow(0).createCell(1).setCellValue("manu");
	out.close();
	book.close();
	}
}
