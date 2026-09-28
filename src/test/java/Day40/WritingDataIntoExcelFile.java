package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcelFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\test data\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();//create workbook
		XSSFSheet sheet=workbook.createSheet("Data");//create a sheet
		
		
		XSSFRow row1=sheet.createRow(0);//create row
		row1.createCell(0).setCellValue("java");//create cells
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("automation");
		
		XSSFRow row2=sheet.createRow(1);//create row
		row2.createCell(0).setCellValue("python");//create cells
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("automation");
		
		XSSFRow row3=sheet.createRow(2);//create row
		row3.createCell(0).setCellValue("c#");//create cells
		row3.createCell(1).setCellValue(5);
		row3.createCell(2).setCellValue("automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created....");
		
		

	}

}
