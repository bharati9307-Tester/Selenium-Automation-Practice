package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\test data\\Data1.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);//extract the wookbook from file
        XSSFSheet sheet=workbook.getSheet("sheet1");//extract the sheet from workbook
        
        int totalRows=sheet.getLastRowNum();//total nop of rows 
        int totalCells=sheet.getRow(1).getLastCellNum();//total no of cells
        System.out.println("no of rows:"+totalRows);//no of rows:406
        System.out.println("no of celss:"+totalCells);//no of celss
        
        for(int r=0;r<=totalRows;r++)
        {
        	XSSFRow currentRow=sheet.getRow(r);
        	for(int c=0;c<totalCells;c++)
        	{
        		XSSFCell cell=currentRow.getCell(c);
        		System.out.print(cell.toString()+"\t");
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();
	}

}
