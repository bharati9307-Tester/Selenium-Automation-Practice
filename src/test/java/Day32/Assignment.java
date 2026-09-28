package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement dropcountryele=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dropcountry=new Select (dropcountryele);
		dropcountry.selectByVisibleText("Boston");
		
		WebElement dropcountryele1=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select dropcountry1=new Select (dropcountryele1);
		dropcountry1.selectByVisibleText("Cairo");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int rows=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		System.out.println("no of rows:"+rows);
		
		int columns=driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println("no of columns:"+columns);
		
		for(int r=2;r<=rows;r++)
		{
		String price=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6])")).getText();
		}
		
		
	}

}
