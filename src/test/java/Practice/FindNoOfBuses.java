package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfBuses {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        
       driver.findElement(By.xpath("//input[@id='srcinput']")).sendKeys("Mumbai");
       Thread.sleep(2000);
       List <WebElement> list=driver.findElements(By.xpath("//div[@aria-label='Search suggestions list']//div[@role='option']"));
       System.out.println("no of element present in dropdownlist:"+list.size());
       for(int i=0;i<list.size();i++)
       {
      	 //read each and every element
      	 System.out.println(list.get(i).getText());
       }
      
	}

}
