package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataInExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\test data\\myfile_dynamic.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();//create workbook
		XSSFSheet sheet=workbook.createSheet("DynamicData");//create a sheet
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how many row want:");
		int noofRows=sc.nextInt();
		System.out.println("how many cells want:");
		int noofCells=sc.nextInt();
		
		for(int r=0;r<noofRows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0;c<noofCells;c++)
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);//attach to file
		workbook.close();
		file.close();
		System.out.println("file is created....");
		

	}

}
