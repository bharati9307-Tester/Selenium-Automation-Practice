package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealltheelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
		driver.findElement(By.xpath("//*[@id=\"both_oneway\"]/div[1]/div[1]/input")).sendKeys("Any Airport");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"both_oneway\"]/div[1]/div[1]/ul//li"));
        System.out.println("size of list:"+list.size());
        for(int i=0;i<list.size();i++)
        {
       	 //read each and every element
       	 System.out.println(list.get(i).getText());
       	 if(list.get(i).getText().equals("Any Airport"))
       	 {
       		 list.get(i).click();
       		 break;
       	 }
        }
	}
}


