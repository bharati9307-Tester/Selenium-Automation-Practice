package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//1) total no of rows in table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("no of rows:"+rows);//no of rows:7
		
		//2)total no.of columns in table
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("no of columns:"+columns);//no of columns:4
		
		
		//3)reads data from specific row and column 5th row and 1st column
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println("book name:"+bookname);//book name:Master In Selenium
		
		String bookname1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
		System.out.println("book name:"+bookname1);
		
		//reads data from table all the rows and columns 
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Slenium"+"\t"+"Price");
		for(int r=2;r<=rows;r++)
		{
		for(int c=1;c<=columns;c++)	
		{
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();	
		    System.out.print(value+"\t");
		}
		System.out.println();
		}*/
		
	//reads data from table all the rows and columns  if the authors is mukesh
		/*for(int r=2;r<=rows;r++)
		{
		String authername=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();	
		if(authername.equals("Mukesh"))
		{
		String bookname2=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();	
		System.out.println(bookname2+"\t"+authername);
		}
		}
		*/
		//find total price of all the books
		int total=0;
		for(int r=2;r<=rows;r++)
		{
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();	
	   
	      total=total+Integer.parseInt(price);//Integer.parseInt() it convert string type data into int format
		}
		System.out.println("total price of book:"+total);//total price of book:7100

}
}
