package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\test data\\myfile_Random.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();//create workbook
		XSSFSheet sheet=workbook.createSheet("DynamicData");//create a sheet
		
		XSSFRow row=sheet.createRow(3);
		XSSFCell cell=row.createCell(4);
		cell.setCellValue("Welcome");
		
		workbook.write(file);//attach to file
		workbook.close();
		file.close();
		System.out.println("file is created....");
		


	}

}
