package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationtable {
//(//tbody)[3]//td[4]
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//find the no of pages
		int total_pages=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		System.out.println("total no of pages:"+total_pages);//total no of pages:4
		
		int rows=driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		System.out.println("no of rows:"+rows);
		for(int r=2;r<=rows;r++)
		{
		driver.findElement(By.xpath("(//tbody)[3]//td[4]")).click();
		}
		
		for(int p=1;p<=total_pages;p++)
		{
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@id='pagination']//*[text()="+p+"]"));
				active_page.click();
				for(int r=2;r<=rows;r++)
				{
				driver.findElement(By.xpath("(//tbody)[3]//td[4]")).click();
				}
			}
		}
	}
}
